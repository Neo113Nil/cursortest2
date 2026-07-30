package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xt0 implements KSerializer {
    public static final xt0 PxuCJdSBwIXG = new xt0();
    public static final d42 lS5Rgt96tfkO = kj0.cpQdD2nAriOS("kotlinx.serialization.json.JsonNull", f42.e9gEMXR7LXtO, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ni0.RAsUl2FVSrh6(decoder);
        if (decoder.rtx2ld2ELZv4()) {
            throw new nt0(vi0.EcgxDIVH5in8(-1, "Expected 'null' literal", null, null, null));
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((JsonNull) obj).getClass();
        ni0.a92UlCVFR9N8(encoder);
        encoder.TSizfFm2Yiuu();
    }
}
