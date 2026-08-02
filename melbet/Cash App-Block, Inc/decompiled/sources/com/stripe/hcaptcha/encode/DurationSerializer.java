package com.stripe.hcaptcha.encode;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import okhttp3.internal.Tags;

/* loaded from: classes8.dex */
public final class DurationSerializer implements KSerializer {
    public static final DurationSerializer INSTANCE = new DurationSerializer();
    public static final PrimitiveSerialDescriptor descriptor = Tags.PrimitiveSerialDescriptor("DurationInSeconds", PrimitiveKind$INT.INSTANCE$6);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Duration.Companion companion = Duration.Companion;
        return new Duration(DurationKt.toDuration(decoder.decodeLong(), DurationUnit.SECONDS));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((Duration) obj).rawValue;
        Duration.Companion companion = Duration.Companion;
        encoder.encodeLong(Duration.m4176toLongimpl(j, DurationUnit.SECONDS));
    }
}
