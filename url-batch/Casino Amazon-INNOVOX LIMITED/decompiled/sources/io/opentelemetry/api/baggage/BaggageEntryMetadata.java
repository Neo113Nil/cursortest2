package io.opentelemetry.api.baggage;

/* loaded from: classes3.dex */
public interface BaggageEntryMetadata {
    String getValue();

    static BaggageEntryMetadata empty() {
        return ImmutableEntryMetadata.EMPTY;
    }

    static BaggageEntryMetadata create(String str) {
        return ImmutableEntryMetadata.create(str);
    }
}
