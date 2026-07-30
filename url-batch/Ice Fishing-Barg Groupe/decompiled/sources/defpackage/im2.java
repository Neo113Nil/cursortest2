package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class im2 implements KSerializer {
    public final KSerializer PxuCJdSBwIXG;
    public final KSerializer TSizfFm2Yiuu;
    public final d42 Y1f8riQaR6yg;
    public final KSerializer lS5Rgt96tfkO;

    public im2(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        this.PxuCJdSBwIXG = kSerializer;
        this.lS5Rgt96tfkO = kSerializer2;
        this.TSizfFm2Yiuu = kSerializer3;
        this.Y1f8riQaR6yg = kj0.dgRBjINgWbAK("kotlin.Triple", new SerialDescriptor[0], new xw1(16, this));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        d42 d42Var = this.Y1f8riQaR6yg;
        op lS5Rgt96tfkO = decoder.lS5Rgt96tfkO(d42Var);
        Object obj = cs0.JTxCbbCwomzt;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int dgRBjINgWbAK = lS5Rgt96tfkO.dgRBjINgWbAK(d42Var);
            if (dgRBjINgWbAK == -1) {
                lS5Rgt96tfkO.cpQdD2nAriOS(d42Var);
                if (obj2 == obj) {
                    throw new i42("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new i42("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new hm2(obj2, obj3, obj4);
                }
                throw new i42("Element 'third' is missing");
            }
            if (dgRBjINgWbAK == 0) {
                obj2 = lS5Rgt96tfkO.EcgxDIVH5in8(d42Var, 0, this.PxuCJdSBwIXG, null);
            } else if (dgRBjINgWbAK == 1) {
                obj3 = lS5Rgt96tfkO.EcgxDIVH5in8(d42Var, 1, this.lS5Rgt96tfkO, null);
            } else {
                if (dgRBjINgWbAK != 2) {
                    throw new i42(o0.wdg6QnbFHrFF("Unexpected index ", dgRBjINgWbAK));
                }
                obj4 = lS5Rgt96tfkO.EcgxDIVH5in8(d42Var, 2, this.TSizfFm2Yiuu, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.Y1f8riQaR6yg;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hm2 hm2Var = (hm2) obj;
        hm2Var.getClass();
        d42 d42Var = this.Y1f8riQaR6yg;
        fx1 lS5Rgt96tfkO = encoder.lS5Rgt96tfkO(d42Var);
        lS5Rgt96tfkO.ryVscX7ZL4Ux(d42Var, 0, this.PxuCJdSBwIXG, hm2Var.rtx2ld2ELZv4);
        lS5Rgt96tfkO.ryVscX7ZL4Ux(d42Var, 1, this.lS5Rgt96tfkO, hm2Var.OPXfSBeufaJ8);
        lS5Rgt96tfkO.ryVscX7ZL4Ux(d42Var, 2, this.TSizfFm2Yiuu, hm2Var.wdg6QnbFHrFF);
        lS5Rgt96tfkO.gGoUzNp9JO5I(d42Var);
    }
}
