package io.opentelemetry.api.baggage;

/* loaded from: classes3.dex */
public interface BaggageEntry {
    BaggageEntryMetadata getMetadata();

    String getValue();
}
