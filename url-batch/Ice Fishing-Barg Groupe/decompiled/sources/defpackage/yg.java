package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yg implements KSerializer {
    public static final yg PxuCJdSBwIXG = new yg();
    public static final dq1 lS5Rgt96tfkO = new dq1("kotlin.Byte", cq1.a92UlCVFR9N8);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.pnx5pC0XzaCw());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.a92UlCVFR9N8(((Number) obj).byteValue());
    }
}
