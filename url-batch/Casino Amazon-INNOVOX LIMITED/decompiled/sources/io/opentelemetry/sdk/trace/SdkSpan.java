package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.internal.AttributeUtil;
import io.opentelemetry.sdk.internal.AttributesMap;
import io.opentelemetry.sdk.internal.ExceptionAttributeResolver;
import io.opentelemetry.sdk.internal.InstrumentationScopeUtil;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.data.EventData;
import io.opentelemetry.sdk.trace.data.ExceptionEventData;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.data.StatusData;
import io.opentelemetry.sdk.trace.internal.ExtendedSpanProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class SdkSpan implements ReadWriteSpan {
    private static final Logger logger = Logger.getLogger(SdkSpan.class.getName());

    @Nullable
    private AttributesMap attributes;
    private final AnchoredClock clock;
    private final SpanContext context;
    private long endEpochNanos;

    @Nullable
    private List<EventData> events;
    private final ExceptionAttributeResolver exceptionAttributeResolver;
    private final InstrumentationScopeInfo instrumentationScopeInfo;
    private final SpanKind kind;

    @Nullable
    List<LinkData> links;
    private String name;
    private final SpanContext parentSpanContext;
    private final Resource resource;

    @Nullable
    private Thread spanEndingThread;
    private final SpanLimits spanLimits;
    private final SpanProcessor spanProcessor;
    private final long startEpochNanos;
    private int totalRecordedLinks;
    private final Object lock = new Object();
    private int totalRecordedEvents = 0;
    private StatusData status = StatusData.unset();
    private EndState hasEnded = EndState.NOT_ENDED;

    private enum EndState {
        NOT_ENDED,
        ENDING,
        ENDED
    }

    @Override // io.opentelemetry.api.trace.Span
    public /* bridge */ /* synthetic */ Span setAttribute(AttributeKey attributeKey, @Nullable Object obj) {
        return setAttribute((AttributeKey<AttributeKey>) attributeKey, (AttributeKey) obj);
    }

    private SdkSpan(SpanContext spanContext, String str, InstrumentationScopeInfo instrumentationScopeInfo, SpanKind spanKind, SpanContext spanContext2, SpanLimits spanLimits, SpanProcessor spanProcessor, ExceptionAttributeResolver exceptionAttributeResolver, AnchoredClock anchoredClock, Resource resource, @Nullable AttributesMap attributesMap, @Nullable List<LinkData> list, int i, long j) {
        this.context = spanContext;
        this.instrumentationScopeInfo = instrumentationScopeInfo;
        this.parentSpanContext = spanContext2;
        this.links = list;
        this.totalRecordedLinks = i;
        this.name = str;
        this.kind = spanKind;
        this.spanProcessor = spanProcessor;
        this.exceptionAttributeResolver = exceptionAttributeResolver;
        this.resource = resource;
        this.clock = anchoredClock;
        this.startEpochNanos = j;
        this.attributes = attributesMap;
        this.spanLimits = spanLimits;
    }

    static SdkSpan startSpan(SpanContext spanContext, String str, InstrumentationScopeInfo instrumentationScopeInfo, SpanKind spanKind, Span span, Context context, SpanLimits spanLimits, SpanProcessor spanProcessor, ExceptionAttributeResolver exceptionAttributeResolver, Clock clock, Resource resource, @Nullable AttributesMap attributesMap, @Nullable List<LinkData> list, int i, long j) {
        AnchoredClock create;
        boolean z;
        long now;
        long j2;
        if (span instanceof SdkSpan) {
            create = ((SdkSpan) span).clock;
            z = false;
        } else {
            create = AnchoredClock.create(clock);
            z = true;
        }
        AnchoredClock anchoredClock = create;
        if (j != 0) {
            j2 = j;
        } else {
            if (z) {
                now = anchoredClock.startTime();
            } else {
                now = anchoredClock.now();
            }
            j2 = now;
        }
        SdkSpan sdkSpan = new SdkSpan(spanContext, str, instrumentationScopeInfo, spanKind, span.getSpanContext(), spanLimits, spanProcessor, exceptionAttributeResolver, anchoredClock, resource, attributesMap, list, i, j2);
        if (spanProcessor.isStartRequired()) {
            spanProcessor.onStart(context, sdkSpan);
        }
        return sdkSpan;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public SpanData toSpanData() {
        SpanWrapper create;
        synchronized (this.lock) {
            List<LinkData> immutableLinks = getImmutableLinks();
            List<EventData> immutableTimedEvents = getImmutableTimedEvents();
            Attributes immutableAttributes = getImmutableAttributes();
            AttributesMap attributesMap = this.attributes;
            create = SpanWrapper.create(this, immutableLinks, immutableTimedEvents, immutableAttributes, attributesMap == null ? 0 : attributesMap.getTotalAddedValues(), this.totalRecordedEvents, this.totalRecordedLinks, this.status, this.name, this.endEpochNanos, this.hasEnded == EndState.ENDED);
        }
        return create;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    @Nullable
    public <T> T getAttribute(AttributeKey<T> attributeKey) {
        T t;
        synchronized (this.lock) {
            AttributesMap attributesMap = this.attributes;
            t = attributesMap == null ? null : (T) attributesMap.get((AttributeKey) attributeKey);
        }
        return t;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public Attributes getAttributes() {
        Attributes empty;
        synchronized (this.lock) {
            AttributesMap attributesMap = this.attributes;
            empty = attributesMap == null ? Attributes.empty() : attributesMap.immutableCopy();
        }
        return empty;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public boolean hasEnded() {
        boolean z;
        synchronized (this.lock) {
            z = this.hasEnded == EndState.ENDED;
        }
        return z;
    }

    @Override // io.opentelemetry.api.trace.Span
    public SpanContext getSpanContext() {
        return this.context;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public SpanContext getParentSpanContext() {
        return this.parentSpanContext;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public String getName() {
        String str;
        synchronized (this.lock) {
            str = this.name;
        }
        return str;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    @Deprecated
    public InstrumentationLibraryInfo getInstrumentationLibraryInfo() {
        return InstrumentationScopeUtil.toInstrumentationLibraryInfo(getInstrumentationScopeInfo());
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public InstrumentationScopeInfo getInstrumentationScopeInfo() {
        return this.instrumentationScopeInfo;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public long getLatencyNanos() {
        long now;
        synchronized (this.lock) {
            now = (this.hasEnded == EndState.NOT_ENDED ? this.clock.now() : this.endEpochNanos) - this.startEpochNanos;
        }
        return now;
    }

    AnchoredClock getClock() {
        return this.clock;
    }

    @Override // io.opentelemetry.api.trace.Span
    public <T> ReadWriteSpan setAttribute(AttributeKey<T> attributeKey, @Nullable T t) {
        if (attributeKey == null || attributeKey.getKey().isEmpty() || t == null) {
            return this;
        }
        synchronized (this.lock) {
            if (!isModifiableByCurrentThread()) {
                logger.log(Level.FINE, "Calling setAttribute() on an ended Span.");
                return this;
            }
            if (this.attributes == null) {
                this.attributes = AttributesMap.create(this.spanLimits.getMaxNumberOfAttributes(), this.spanLimits.getMaxAttributeValueLength());
            }
            this.attributes.put((AttributeKey<?>) attributeKey, (Object) t);
            return this;
        }
    }

    private boolean isModifiableByCurrentThread() {
        if (this.hasEnded != EndState.NOT_ENDED) {
            return this.hasEnded == EndState.ENDING && Thread.currentThread() == this.spanEndingThread;
        }
        return true;
    }

    @Override // io.opentelemetry.api.trace.Span
    public ReadWriteSpan addEvent(String str) {
        if (str == null) {
            return this;
        }
        addTimedEvent(EventData.create(this.clock.now(), str, Attributes.empty(), 0));
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public ReadWriteSpan addEvent(String str, long j, TimeUnit timeUnit) {
        if (str != null && timeUnit != null) {
            addTimedEvent(EventData.create(timeUnit.toNanos(j), str, Attributes.empty(), 0));
        }
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public ReadWriteSpan addEvent(String str, Attributes attributes) {
        if (str == null) {
            return this;
        }
        if (attributes == null) {
            attributes = Attributes.empty();
        }
        addTimedEvent(EventData.create(this.clock.now(), str, AttributeUtil.applyAttributesLimit(attributes, this.spanLimits.getMaxNumberOfAttributesPerEvent(), this.spanLimits.getMaxAttributeValueLength()), attributes.size()));
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public ReadWriteSpan addEvent(String str, Attributes attributes, long j, TimeUnit timeUnit) {
        if (str != null && timeUnit != null) {
            if (attributes == null) {
                attributes = Attributes.empty();
            }
            addTimedEvent(EventData.create(timeUnit.toNanos(j), str, AttributeUtil.applyAttributesLimit(attributes, this.spanLimits.getMaxNumberOfAttributesPerEvent(), this.spanLimits.getMaxAttributeValueLength()), attributes.size()));
        }
        return this;
    }

    private void addTimedEvent(EventData eventData) {
        synchronized (this.lock) {
            if (!isModifiableByCurrentThread()) {
                logger.log(Level.FINE, "Calling addEvent() on an ended Span.");
                return;
            }
            if (this.events == null) {
                this.events = new ArrayList();
            }
            if (this.events.size() < this.spanLimits.getMaxNumberOfEvents()) {
                this.events.add(eventData);
            }
            this.totalRecordedEvents++;
        }
    }

    @Override // io.opentelemetry.api.trace.Span
    public ReadWriteSpan setStatus(StatusCode statusCode, @Nullable String str) {
        if (statusCode == null) {
            return this;
        }
        synchronized (this.lock) {
            if (!isModifiableByCurrentThread()) {
                logger.log(Level.FINE, "Calling setStatus() on an ended Span.");
                return this;
            }
            if (this.status.getStatusCode() == StatusCode.OK) {
                logger.log(Level.FINE, "Calling setStatus() on a Span that is already set to OK.");
                return this;
            }
            if (statusCode == StatusCode.UNSET) {
                logger.log(Level.FINE, "Ignoring call to setStatus() with status UNSET.");
                return this;
            }
            if (str != null && statusCode != StatusCode.ERROR) {
                logger.log(Level.FINE, "Ignoring setStatus() description since status is not ERROR.");
                str = null;
            }
            this.status = StatusData.create(statusCode, str);
            return this;
        }
    }

    @Override // io.opentelemetry.api.trace.Span
    public ReadWriteSpan recordException(Throwable th) {
        recordException(th, Attributes.empty());
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public ReadWriteSpan recordException(Throwable th, Attributes attributes) {
        if (th == null) {
            return this;
        }
        if (attributes == null) {
            attributes = Attributes.empty();
        }
        int maxAttributeValueLength = this.spanLimits.getMaxAttributeValueLength();
        final AttributesMap create = AttributesMap.create(this.spanLimits.getMaxNumberOfAttributes(), this.spanLimits.getMaxAttributeValueLength());
        ExceptionAttributeResolver exceptionAttributeResolver = this.exceptionAttributeResolver;
        Objects.requireNonNull(create);
        exceptionAttributeResolver.setExceptionAttributes(new ExceptionAttributeResolver.AttributeSetter() { // from class: io.opentelemetry.sdk.trace.SdkSpan$$ExternalSyntheticLambda0
            @Override // io.opentelemetry.sdk.internal.ExceptionAttributeResolver.AttributeSetter
            public final void setAttribute(AttributeKey attributeKey, Object obj) {
                AttributesMap.this.putIfCapacity(attributeKey, obj);
            }
        }, th, maxAttributeValueLength);
        Objects.requireNonNull(create);
        attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.trace.SdkSpan$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AttributesMap.this.put((AttributeKey<?>) obj, obj2);
            }
        });
        addTimedEvent(ExceptionEventData.create(this.clock.now(), th, create, create.getTotalAddedValues()));
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public ReadWriteSpan updateName(String str) {
        if (str == null) {
            return this;
        }
        synchronized (this.lock) {
            if (!isModifiableByCurrentThread()) {
                logger.log(Level.FINE, "Calling updateName() on an ended Span.");
                return this;
            }
            this.name = str;
            return this;
        }
    }

    @Override // io.opentelemetry.api.trace.Span
    public Span addLink(SpanContext spanContext, Attributes attributes) {
        if (spanContext == null || !spanContext.isValid()) {
            return this;
        }
        if (attributes == null) {
            attributes = Attributes.empty();
        }
        LinkData create = LinkData.create(spanContext, AttributeUtil.applyAttributesLimit(attributes, this.spanLimits.getMaxNumberOfAttributesPerLink(), this.spanLimits.getMaxAttributeValueLength()));
        synchronized (this.lock) {
            if (!isModifiableByCurrentThread()) {
                logger.log(Level.FINE, "Calling addLink() on an ended Span.");
                return this;
            }
            if (this.links == null) {
                this.links = new ArrayList();
            }
            if (this.links.size() < this.spanLimits.getMaxNumberOfLinks()) {
                this.links.add(create);
            }
            this.totalRecordedLinks++;
            return this;
        }
    }

    @Override // io.opentelemetry.api.trace.Span
    public void end() {
        endInternal(this.clock.now());
    }

    @Override // io.opentelemetry.api.trace.Span
    public void end(long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        endInternal(j == 0 ? this.clock.now() : timeUnit.toNanos(j));
    }

    private void endInternal(long j) {
        synchronized (this.lock) {
            if (this.hasEnded != EndState.NOT_ENDED) {
                logger.log(Level.FINE, "Calling end() on an ended or ending Span.");
                return;
            }
            this.endEpochNanos = j;
            this.spanEndingThread = Thread.currentThread();
            this.hasEnded = EndState.ENDING;
            SpanProcessor spanProcessor = this.spanProcessor;
            if (spanProcessor instanceof ExtendedSpanProcessor) {
                ExtendedSpanProcessor extendedSpanProcessor = (ExtendedSpanProcessor) spanProcessor;
                if (extendedSpanProcessor.isOnEndingRequired()) {
                    extendedSpanProcessor.onEnding(this);
                }
            }
            synchronized (this.lock) {
                this.hasEnded = EndState.ENDED;
            }
            if (this.spanProcessor.isEndRequired()) {
                this.spanProcessor.onEnd(this);
            }
        }
    }

    @Override // io.opentelemetry.api.trace.Span
    public boolean isRecording() {
        boolean z;
        synchronized (this.lock) {
            z = this.hasEnded != EndState.ENDED;
        }
        return z;
    }

    Resource getResource() {
        return this.resource;
    }

    @Override // io.opentelemetry.sdk.trace.ReadableSpan
    public SpanKind getKind() {
        return this.kind;
    }

    long getStartEpochNanos() {
        return this.startEpochNanos;
    }

    private List<EventData> getImmutableTimedEvents() {
        if (this.events == null) {
            return Collections.emptyList();
        }
        if (this.hasEnded == EndState.ENDED) {
            return Collections.unmodifiableList(this.events);
        }
        return Collections.unmodifiableList(new ArrayList(this.events));
    }

    private Attributes getImmutableAttributes() {
        AttributesMap attributesMap = this.attributes;
        if (attributesMap == null || attributesMap.isEmpty()) {
            return Attributes.empty();
        }
        if (this.hasEnded == EndState.ENDED) {
            return this.attributes;
        }
        return this.attributes.immutableCopy();
    }

    private List<LinkData> getImmutableLinks() {
        List<LinkData> list = this.links;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.links);
    }

    public String toString() {
        String str;
        String valueOf;
        String valueOf2;
        long j;
        long j2;
        long j3;
        synchronized (this.lock) {
            str = this.name;
            valueOf = String.valueOf(this.attributes);
            valueOf2 = String.valueOf(this.status);
            j = this.totalRecordedEvents;
            j2 = this.endEpochNanos;
            j3 = this.totalRecordedLinks;
        }
        return "SdkSpan{traceId=" + this.context.getTraceId() + ", spanId=" + this.context.getSpanId() + ", parentSpanContext=" + this.parentSpanContext + ", name=" + str + ", kind=" + this.kind + ", attributes=" + valueOf + ", status=" + valueOf2 + ", totalRecordedEvents=" + j + ", totalRecordedLinks=" + j3 + ", startEpochNanos=" + this.startEpochNanos + ", endEpochNanos=" + j2 + "}";
    }
}
