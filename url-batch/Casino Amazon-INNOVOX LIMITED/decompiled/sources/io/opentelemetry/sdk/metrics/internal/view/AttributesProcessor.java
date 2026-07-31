package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.api.baggage.Baggage;
import io.opentelemetry.api.baggage.BaggageEntry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public abstract class AttributesProcessor {
    public abstract Attributes process(Attributes attributes, Context context);

    public abstract boolean usesContext();

    AttributesProcessor() {
    }

    public AttributesProcessor then(AttributesProcessor attributesProcessor) {
        if (attributesProcessor == NoopAttributesProcessor.NOOP) {
            return this;
        }
        if (this == NoopAttributesProcessor.NOOP) {
            return attributesProcessor;
        }
        if (attributesProcessor instanceof JoinedAttributesProcessor) {
            return ((JoinedAttributesProcessor) attributesProcessor).prepend(this);
        }
        return new JoinedAttributesProcessor(Arrays.asList(this, attributesProcessor));
    }

    public static AttributesProcessor noop() {
        return NoopAttributesProcessor.NOOP;
    }

    public static AttributesProcessor filterByKeyName(Predicate<String> predicate) {
        return new AttributeKeyFilteringProcessor(predicate);
    }

    public static AttributesProcessor appendBaggageByKeyName(Predicate<String> predicate) {
        return new BaggageAppendingAttributesProcessor(predicate);
    }

    public static AttributesProcessor append(Attributes attributes) {
        return new AppendingAttributesProcessor(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class AttributeKeyFilteringProcessor extends AttributesProcessor {
        private final Predicate<String> nameFilter;

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public boolean usesContext() {
            return false;
        }

        private AttributeKeyFilteringProcessor(Predicate<String> predicate) {
            this.nameFilter = predicate;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public Attributes process(Attributes attributes, Context context) {
            return attributes.toBuilder().removeIf(new Predicate() { // from class: io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor$AttributeKeyFilteringProcessor$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return AttributesProcessor.AttributeKeyFilteringProcessor.this.m3963xbdc355c8((AttributeKey) obj);
                }
            }).build();
        }

        /* renamed from: lambda$process$0$io-opentelemetry-sdk-metrics-internal-view-AttributesProcessor$AttributeKeyFilteringProcessor, reason: not valid java name */
        /* synthetic */ boolean m3963xbdc355c8(AttributeKey attributeKey) {
            return !this.nameFilter.test(attributeKey.getKey());
        }

        public String toString() {
            return "AttributeKeyFilteringProcessor{nameFilter=" + this.nameFilter + "}";
        }
    }

    private static class AppendingAttributesProcessor extends AttributesProcessor {
        private final Attributes additionalAttributes;

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public boolean usesContext() {
            return false;
        }

        private AppendingAttributesProcessor(Attributes attributes) {
            this.additionalAttributes = attributes;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public Attributes process(Attributes attributes, Context context) {
            return this.additionalAttributes.toBuilder().putAll(attributes).build();
        }

        public String toString() {
            return "AppendingAttributesProcessor{additionalAttributes=" + this.additionalAttributes + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class BaggageAppendingAttributesProcessor extends AttributesProcessor {
        private final Predicate<String> nameFilter;

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public boolean usesContext() {
            return true;
        }

        private BaggageAppendingAttributesProcessor(Predicate<String> predicate) {
            this.nameFilter = predicate;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public Attributes process(Attributes attributes, Context context) {
            final AttributesBuilder builder = Attributes.builder();
            Baggage.fromContext(context).forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor$BaggageAppendingAttributesProcessor$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    AttributesProcessor.BaggageAppendingAttributesProcessor.this.m3964x7ad06d6(builder, (String) obj, (BaggageEntry) obj2);
                }
            });
            builder.putAll(attributes);
            return builder.build();
        }

        /* renamed from: lambda$process$0$io-opentelemetry-sdk-metrics-internal-view-AttributesProcessor$BaggageAppendingAttributesProcessor, reason: not valid java name */
        /* synthetic */ void m3964x7ad06d6(AttributesBuilder attributesBuilder, String str, BaggageEntry baggageEntry) {
            if (this.nameFilter.test(str)) {
                attributesBuilder.put(str, baggageEntry.getValue());
            }
        }

        public String toString() {
            return "BaggageAppendingAttributesProcessor{nameFilter=" + this.nameFilter + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class JoinedAttributesProcessor extends AttributesProcessor {
        private final Collection<AttributesProcessor> processors;
        private final boolean usesContextCache;

        JoinedAttributesProcessor(Collection<AttributesProcessor> collection) {
            this.processors = collection;
            this.usesContextCache = ((Boolean) collection.stream().map(new Function() { // from class: io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor$JoinedAttributesProcessor$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((AttributesProcessor) obj).usesContext());
                }
            }).reduce(false, new BinaryOperator() { // from class: io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor$JoinedAttributesProcessor$$ExternalSyntheticLambda1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(r0.booleanValue() || r1.booleanValue());
                    return valueOf;
                }
            })).booleanValue();
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public Attributes process(Attributes attributes, Context context) {
            Iterator<AttributesProcessor> it = this.processors.iterator();
            while (it.hasNext()) {
                attributes = it.next().process(attributes, context);
            }
            return attributes;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public boolean usesContext() {
            return this.usesContextCache;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor
        public AttributesProcessor then(AttributesProcessor attributesProcessor) {
            ArrayList arrayList = new ArrayList(this.processors);
            if (attributesProcessor instanceof JoinedAttributesProcessor) {
                arrayList.addAll(((JoinedAttributesProcessor) attributesProcessor).processors);
            } else {
                arrayList.add(attributesProcessor);
            }
            return new JoinedAttributesProcessor(arrayList);
        }

        AttributesProcessor prepend(AttributesProcessor attributesProcessor) {
            ArrayList arrayList = new ArrayList(this.processors.size() + 1);
            arrayList.add(attributesProcessor);
            arrayList.addAll(this.processors);
            return new JoinedAttributesProcessor(arrayList);
        }

        public String toString() {
            return "JoinedAttributesProcessor{processors=" + this.processors + "}";
        }
    }
}
