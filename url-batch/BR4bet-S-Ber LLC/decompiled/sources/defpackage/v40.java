package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class v40 {
    public static final u40 a = new u40(new byte[0], 0, 0, false);
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

    public static final void a(u40 u40Var) {
        u40Var.getClass();
        if (u40Var.f != null || u40Var.g != null) {
            g9.i("Failed requirement.");
            return;
        }
        if (u40Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        u40 u40Var2 = a;
        u40 u40Var3 = (u40) atomicReference.getAndSet(u40Var2);
        if (u40Var3 == u40Var2) {
            return;
        }
        int i = u40Var3 != null ? u40Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(u40Var3);
            return;
        }
        u40Var.f = u40Var3;
        u40Var.b = 0;
        u40Var.c = i + 8192;
        atomicReference.set(u40Var);
    }

    public static final u40 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        u40 u40Var = a;
        u40 u40Var2 = (u40) atomicReference.getAndSet(u40Var);
        if (u40Var2 == u40Var) {
            return new u40();
        }
        if (u40Var2 == null) {
            atomicReference.set(null);
            return new u40();
        }
        atomicReference.set(u40Var2.f);
        u40Var2.f = null;
        u40Var2.c = 0;
        return u40Var2;
    }
}
