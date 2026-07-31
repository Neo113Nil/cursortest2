package io.opentelemetry.sdk.trace.data;

import io.opentelemetry.api.common.Attributes;

/* loaded from: classes3.dex */
abstract class ImmutableEventData implements EventData {
    static EventData create(long j, String str, Attributes attributes) {
        return create(j, str, attributes, attributes.size());
    }

    static EventData create(long j, String str, Attributes attributes, int i) {
        return new AutoValue_ImmutableEventData(str, attributes, j, i);
    }

    ImmutableEventData() {
    }
}
