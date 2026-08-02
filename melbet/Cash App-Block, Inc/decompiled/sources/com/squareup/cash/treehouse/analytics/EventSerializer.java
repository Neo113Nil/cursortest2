package com.squareup.cash.treehouse.analytics;

import com.squareup.cash.cdf.Event;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.WrappedSerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import okhttp3.internal.Tags;

/* loaded from: classes.dex */
public final class EventSerializer implements KSerializer {
    public static final EventSerializer INSTANCE = new EventSerializer();
    public static final KSerializer delegateSerializer;
    public static final WrappedSerialDescriptor descriptor;

    static {
        KSerializer serializer = GenericEvent.Companion.serializer();
        delegateSerializer = serializer;
        descriptor = Tags.SerialDescriptor("Event", serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return (Event) decoder.decodeSerializableValue$1(delegateSerializer);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Event event = (Event) obj;
        event.getClass();
        encoder.encodeSerializableValue(delegateSerializer, new GenericEvent(event));
    }
}
