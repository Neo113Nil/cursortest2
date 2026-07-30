package defpackage;

import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ht0 {
    public static final gt0 Y1f8riQaR6yg = new gt0(new lt0(false, ak.wdg6QnbFHrFF, true), cs0.jJwa0q7P5wHq);
    public final lt0 PxuCJdSBwIXG;
    public final dr TSizfFm2Yiuu = new dr(1);
    public final k42 lS5Rgt96tfkO;

    public ht0(lt0 lt0Var, k42 k42Var) {
        this.PxuCJdSBwIXG = lt0Var;
        this.lS5Rgt96tfkO = k42Var;
    }

    public final Object PxuCJdSBwIXG(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        str.getClass();
        cb1 cb1Var = new cb1(str, this.PxuCJdSBwIXG);
        Object x50lh2ztY7Y5 = new ba2(this, fv2.wdg6QnbFHrFF, cb1Var, kSerializer.getDescriptor()).x50lh2ztY7Y5(kSerializer);
        if (cb1Var.e9gEMXR7LXtO() == 10) {
            return x50lh2ztY7Y5;
        }
        cb1.x50lh2ztY7Y5(cb1Var, "Expected EOF after parsing, but had " + ((String) cb1Var.RAsUl2FVSrh6).charAt(cb1Var.lS5Rgt96tfkO - 1) + " instead", 0, null, 6);
        throw null;
    }
}
