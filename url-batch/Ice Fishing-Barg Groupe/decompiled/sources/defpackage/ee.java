package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ee implements KSerializer {
    public static final ee PxuCJdSBwIXG = new ee();
    public static final dq1 lS5Rgt96tfkO = new dq1("kotlin.Boolean", cq1.e9gEMXR7LXtO);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.a92UlCVFR9N8());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.RAsUl2FVSrh6(((Boolean) obj).booleanValue());
    }
}
