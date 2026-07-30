package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class me1 implements KSerializer {
    public final KSerializer PxuCJdSBwIXG;
    public final c42 lS5Rgt96tfkO;

    public me1(KSerializer kSerializer) {
        this.PxuCJdSBwIXG = kSerializer;
        this.lS5Rgt96tfkO = new c42(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.rtx2ld2ELZv4()) {
            return decoder.x50lh2ztY7Y5(this.PxuCJdSBwIXG);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && me1.class == obj.getClass() && this.PxuCJdSBwIXG.equals(((me1) obj).PxuCJdSBwIXG);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj != null) {
            encoder.dgRBjINgWbAK(this.PxuCJdSBwIXG, obj);
        } else {
            encoder.TSizfFm2Yiuu();
        }
    }
}
