package io.opentelemetry.api.baggage;

import io.opentelemetry.context.Context;
import io.opentelemetry.context.ImplicitContextKeyed;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface Baggage extends ImplicitContextKeyed {
    Map<String, BaggageEntry> asMap();

    void forEach(BiConsumer<? super String, ? super BaggageEntry> biConsumer);

    @Nullable
    String getEntryValue(String str);

    int size();

    BaggageBuilder toBuilder();

    static Baggage empty() {
        return ImmutableBaggage.empty();
    }

    static BaggageBuilder builder() {
        return ImmutableBaggage.builder();
    }

    static Baggage current() {
        return fromContext(Context.current());
    }

    static Baggage fromContext(Context context) {
        Baggage baggage = (Baggage) context.get(BaggageContextKey.KEY);
        return baggage != null ? baggage : empty();
    }

    @Nullable
    static Baggage fromContextOrNull(Context context) {
        return (Baggage) context.get(BaggageContextKey.KEY);
    }

    @Override // io.opentelemetry.context.ImplicitContextKeyed
    default Context storeInContext(Context context) {
        return context.with(BaggageContextKey.KEY, this);
    }

    default boolean isEmpty() {
        return size() == 0;
    }

    @Nullable
    default BaggageEntry getEntry(final String str) {
        final BaggageEntry[] baggageEntryArr = {null};
        forEach(new BiConsumer() { // from class: io.opentelemetry.api.baggage.Baggage$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Baggage.lambda$getEntry$0(str, baggageEntryArr, (String) obj, (BaggageEntry) obj2);
            }
        });
        return baggageEntryArr[0];
    }

    static /* synthetic */ void lambda$getEntry$0(String str, BaggageEntry[] baggageEntryArr, String str2, BaggageEntry baggageEntry) {
        if (str.equals(str2)) {
            baggageEntryArr[0] = baggageEntry;
        }
    }
}
