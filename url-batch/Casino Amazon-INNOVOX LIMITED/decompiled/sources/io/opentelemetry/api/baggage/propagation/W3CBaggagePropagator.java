package io.opentelemetry.api.baggage.propagation;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.opentelemetry.api.baggage.Baggage;
import io.opentelemetry.api.baggage.BaggageBuilder;
import io.opentelemetry.api.baggage.BaggageEntry;
import io.opentelemetry.api.internal.PercentEscaper;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.propagation.TextMapGetter;
import io.opentelemetry.context.propagation.TextMapPropagator;
import io.opentelemetry.context.propagation.TextMapSetter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class W3CBaggagePropagator implements TextMapPropagator {
    private static final String FIELD = "baggage";
    private static final List<String> FIELDS = Collections.singletonList(FIELD);
    private static final W3CBaggagePropagator INSTANCE = new W3CBaggagePropagator();
    private static final PercentEscaper URL_ESCAPER = PercentEscaper.create();

    private static boolean isValidBaggageValue(String str) {
        return str != null;
    }

    public static W3CBaggagePropagator getInstance() {
        return INSTANCE;
    }

    private W3CBaggagePropagator() {
    }

    @Override // io.opentelemetry.context.propagation.TextMapPropagator
    public Collection<String> fields() {
        return FIELDS;
    }

    @Override // io.opentelemetry.context.propagation.TextMapPropagator
    public <C> void inject(Context context, @Nullable C c, TextMapSetter<C> textMapSetter) {
        if (context == null || textMapSetter == null) {
            return;
        }
        Baggage fromContext = Baggage.fromContext(context);
        if (fromContext.isEmpty()) {
            return;
        }
        String baggageToString = baggageToString(fromContext);
        if (baggageToString.isEmpty()) {
            return;
        }
        textMapSetter.set(c, FIELD, baggageToString);
    }

    private static String baggageToString(Baggage baggage) {
        final StringBuilder sb = new StringBuilder();
        baggage.forEach(new BiConsumer() { // from class: io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                W3CBaggagePropagator.lambda$baggageToString$0(sb, (String) obj, (BaggageEntry) obj2);
            }
        });
        if (sb.length() == 0) {
            return "";
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    static /* synthetic */ void lambda$baggageToString$0(StringBuilder sb, String str, BaggageEntry baggageEntry) {
        if (baggageIsInvalid(str, baggageEntry)) {
            return;
        }
        sb.append(str).append("=").append(encodeValue(baggageEntry.getValue()));
        String value = baggageEntry.getMetadata().getValue();
        if (value != null && !value.isEmpty()) {
            sb.append(";").append(encodeValue(value));
        }
        sb.append(StringUtils.COMMA);
    }

    private static String encodeValue(String str) {
        return URL_ESCAPER.escape(str);
    }

    @Override // io.opentelemetry.context.propagation.TextMapPropagator
    public <C> Context extract(Context context, @Nullable C c, TextMapGetter<C> textMapGetter) {
        if (context == null) {
            return Context.root();
        }
        return textMapGetter == null ? context : extractMulti(context, c, textMapGetter);
    }

    private static <C> Context extractMulti(Context context, @Nullable C c, TextMapGetter<C> textMapGetter) {
        Iterator<String> all = textMapGetter.getAll(c, FIELD);
        if (all == null) {
            return context;
        }
        BaggageBuilder builder = Baggage.builder();
        boolean z = false;
        while (all.hasNext()) {
            String next = all.next();
            if (!next.isEmpty()) {
                try {
                    extractEntries(next, builder);
                    z = true;
                } catch (RuntimeException unused) {
                }
            }
        }
        return z ? context.with(builder.build()) : context;
    }

    private static void extractEntries(String str, BaggageBuilder baggageBuilder) {
        new Parser(str).parseInto(baggageBuilder);
    }

    private static boolean baggageIsInvalid(String str, BaggageEntry baggageEntry) {
        return (isValidBaggageKey(str) && isValidBaggageValue(baggageEntry.getValue())) ? false : true;
    }

    private static boolean isValidBaggageKey(String str) {
        return (str == null || str.trim().isEmpty() || !io.opentelemetry.api.internal.StringUtils.isPrintableString(str)) ? false : true;
    }

    public String toString() {
        return "W3CBaggagePropagator";
    }
}
