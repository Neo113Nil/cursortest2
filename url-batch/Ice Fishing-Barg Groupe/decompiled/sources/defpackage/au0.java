package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.Y1f8riQaR6yg;
import kotlinx.serialization.json.lS5Rgt96tfkO;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class au0 implements KSerializer {
    public static final au0 PxuCJdSBwIXG = new au0();
    public static final d42 lS5Rgt96tfkO = kj0.cpQdD2nAriOS("kotlinx.serialization.json.JsonPrimitive", cq1.cpQdD2nAriOS, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ba2 RAsUl2FVSrh6 = ni0.RAsUl2FVSrh6(decoder);
        lS5Rgt96tfkO jJwa0q7P5wHq = RAsUl2FVSrh6.jJwa0q7P5wHq();
        if (jJwa0q7P5wHq instanceof Y1f8riQaR6yg) {
            return (Y1f8riQaR6yg) jJwa0q7P5wHq;
        }
        throw new nt0(vi0.EcgxDIVH5in8(-1, "Unexpected JSON element, expected JsonPrimitive, had " + bu1.PxuCJdSBwIXG(jJwa0q7P5wHq.getClass()), null, null, RAsUl2FVSrh6.D0aTLcX6Uhyo().PxuCJdSBwIXG.TSizfFm2Yiuu ? vi0.Pf0ThKz3j5YS(jJwa0q7P5wHq.toString(), -1).toString() : null));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return lS5Rgt96tfkO;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Y1f8riQaR6yg y1f8riQaR6yg = (Y1f8riQaR6yg) obj;
        y1f8riQaR6yg.getClass();
        ni0.a92UlCVFR9N8(encoder);
        if (y1f8riQaR6yg instanceof JsonNull) {
            encoder.dgRBjINgWbAK(xt0.PxuCJdSBwIXG, JsonNull.INSTANCE);
        } else {
            encoder.dgRBjINgWbAK(vt0.PxuCJdSBwIXG, (ut0) y1f8riQaR6yg);
        }
    }
}
