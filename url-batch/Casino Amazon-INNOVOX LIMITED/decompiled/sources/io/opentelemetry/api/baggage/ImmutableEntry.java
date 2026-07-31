package io.opentelemetry.api.baggage;

/* loaded from: classes3.dex */
abstract class ImmutableEntry implements BaggageEntry {
    ImmutableEntry() {
    }

    static ImmutableEntry create(String str, BaggageEntryMetadata baggageEntryMetadata) {
        return new AutoValue_ImmutableEntry(str, baggageEntryMetadata);
    }
}
