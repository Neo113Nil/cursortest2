package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class gPXPFXrUH4XX implements KSerializer {
    public abstract Object PxuCJdSBwIXG();

    public abstract Object RAsUl2FVSrh6(Object obj);

    public abstract Iterator TSizfFm2Yiuu(Object obj);

    public abstract int Y1f8riQaR6yg(Object obj);

    public abstract void a92UlCVFR9N8(op opVar, int i, Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return e9gEMXR7LXtO(decoder);
    }

    public final Object e9gEMXR7LXtO(Decoder decoder) {
        Object PxuCJdSBwIXG = PxuCJdSBwIXG();
        int lS5Rgt96tfkO = lS5Rgt96tfkO(PxuCJdSBwIXG);
        op lS5Rgt96tfkO2 = decoder.lS5Rgt96tfkO(getDescriptor());
        while (true) {
            int dgRBjINgWbAK = lS5Rgt96tfkO2.dgRBjINgWbAK(getDescriptor());
            if (dgRBjINgWbAK == -1) {
                lS5Rgt96tfkO2.cpQdD2nAriOS(getDescriptor());
                return rtx2ld2ELZv4(PxuCJdSBwIXG);
            }
            a92UlCVFR9N8(lS5Rgt96tfkO2, dgRBjINgWbAK + lS5Rgt96tfkO, PxuCJdSBwIXG);
        }
    }

    public abstract int lS5Rgt96tfkO(Object obj);

    public abstract Object rtx2ld2ELZv4(Object obj);
}
