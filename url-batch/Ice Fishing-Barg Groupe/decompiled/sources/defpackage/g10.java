package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g10 implements KSerializer {
    public static final g10 PxuCJdSBwIXG = new g10();
    public static final dq1 lS5Rgt96tfkO = new dq1("kotlin.Double", cq1.rtx2ld2ELZv4);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.aF05bpZJlKEP());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.Y1f8riQaR6yg(((Number) obj).doubleValue());
    }
}
