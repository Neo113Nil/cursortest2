package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class d22 {
    public static final z12 PxuCJdSBwIXG = new z12(new byte[0], 0, 0, false, false);
    public static final AtomicReference[] TSizfFm2Yiuu;
    public static final int lS5Rgt96tfkO;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        lS5Rgt96tfkO = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        TSizfFm2Yiuu = atomicReferenceArr;
    }

    public static final void PxuCJdSBwIXG(z12 z12Var) {
        z12Var.getClass();
        if (z12Var.a92UlCVFR9N8 != null || z12Var.RAsUl2FVSrh6 != null) {
            u9.XL4ISE6Oc65B("Failed requirement.");
            return;
        }
        if (z12Var.Y1f8riQaR6yg) {
            return;
        }
        AtomicReference atomicReference = TSizfFm2Yiuu[(int) (Thread.currentThread().getId() & (lS5Rgt96tfkO - 1))];
        z12 z12Var2 = PxuCJdSBwIXG;
        z12 z12Var3 = (z12) atomicReference.getAndSet(z12Var2);
        if (z12Var3 == z12Var2) {
            return;
        }
        int i = z12Var3 != null ? z12Var3.TSizfFm2Yiuu : 0;
        if (i >= 65536) {
            atomicReference.set(z12Var3);
            return;
        }
        z12Var.a92UlCVFR9N8 = z12Var3;
        z12Var.lS5Rgt96tfkO = 0;
        z12Var.TSizfFm2Yiuu = i + 8192;
        atomicReference.set(z12Var);
    }

    public static final z12 lS5Rgt96tfkO() {
        AtomicReference atomicReference = TSizfFm2Yiuu[(int) (Thread.currentThread().getId() & (lS5Rgt96tfkO - 1))];
        z12 z12Var = PxuCJdSBwIXG;
        z12 z12Var2 = (z12) atomicReference.getAndSet(z12Var);
        if (z12Var2 == z12Var) {
            return new z12();
        }
        if (z12Var2 == null) {
            atomicReference.set(null);
            return new z12();
        }
        atomicReference.set(z12Var2.a92UlCVFR9N8);
        z12Var2.a92UlCVFR9N8 = null;
        z12Var2.TSizfFm2Yiuu = 0;
        return z12Var2;
    }
}
