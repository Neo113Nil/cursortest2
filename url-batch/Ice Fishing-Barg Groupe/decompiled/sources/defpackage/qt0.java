package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.PxuCJdSBwIXG;
import kotlinx.serialization.json.TSizfFm2Yiuu;
import kotlinx.serialization.json.Y1f8riQaR6yg;
import kotlinx.serialization.json.lS5Rgt96tfkO;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qt0 implements KSerializer {
    public static final qt0 PxuCJdSBwIXG = new qt0();
    public static final d42 lS5Rgt96tfkO = kj0.x50lh2ztY7Y5("kotlinx.serialization.json.JsonElement", jo1.a92UlCVFR9N8, new SerialDescriptor[0], new wnqUPcAvl7HT(28));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return ni0.RAsUl2FVSrh6(decoder).jJwa0q7P5wHq();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lS5Rgt96tfkO ls5rgt96tfko = (lS5Rgt96tfkO) obj;
        ls5rgt96tfko.getClass();
        ni0.a92UlCVFR9N8(encoder);
        if (ls5rgt96tfko instanceof Y1f8riQaR6yg) {
            encoder.dgRBjINgWbAK(au0.PxuCJdSBwIXG, ls5rgt96tfko);
            return;
        }
        if (ls5rgt96tfko instanceof TSizfFm2Yiuu) {
            encoder.dgRBjINgWbAK(zt0.PxuCJdSBwIXG, ls5rgt96tfko);
        } else if (ls5rgt96tfko instanceof PxuCJdSBwIXG) {
            encoder.dgRBjINgWbAK(jt0.PxuCJdSBwIXG, ls5rgt96tfko);
        } else {
            u9.gPXPFXrUH4XX();
        }
    }
}
