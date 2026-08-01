package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class w10 {
    public static final v10 a = new v10(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(v10 v10Var) {
        v10Var.getClass();
        if (v10Var.f != null || v10Var.g != null) {
            t8.k("Failed requirement.");
            return;
        }
        if (v10Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        v10 v10Var2 = a;
        v10 v10Var3 = (v10) atomicReference.getAndSet(v10Var2);
        if (v10Var3 == v10Var2) {
            return;
        }
        int i = v10Var3 != null ? v10Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(v10Var3);
            return;
        }
        v10Var.f = v10Var3;
        v10Var.b = 0;
        v10Var.c = i + 8192;
        atomicReference.set(v10Var);
    }

    public static final v10 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        v10 v10Var = a;
        v10 v10Var2 = (v10) atomicReference.getAndSet(v10Var);
        if (v10Var2 == v10Var) {
            return new v10();
        }
        if (v10Var2 == null) {
            atomicReference.set(null);
            return new v10();
        }
        atomicReference.set(v10Var2.f);
        v10Var2.f = null;
        v10Var2.c = 0;
        return v10Var2;
    }
}
