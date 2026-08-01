package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class nc0 {
    public static final kc0 a = new kc0(new byte[0], 0, 0, false);
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

    public static final void a(kc0 kc0Var) {
        kc0Var.getClass();
        if (kc0Var.f != null || kc0Var.g != null) {
            s9.k("Failed requirement.");
            return;
        }
        if (kc0Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        kc0 kc0Var2 = a;
        kc0 kc0Var3 = (kc0) atomicReference.getAndSet(kc0Var2);
        if (kc0Var3 == kc0Var2) {
            return;
        }
        int i = kc0Var3 != null ? kc0Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(kc0Var3);
            return;
        }
        kc0Var.f = kc0Var3;
        kc0Var.b = 0;
        kc0Var.c = i + 8192;
        atomicReference.set(kc0Var);
    }

    public static final kc0 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        kc0 kc0Var = a;
        kc0 kc0Var2 = (kc0) atomicReference.getAndSet(kc0Var);
        if (kc0Var2 == kc0Var) {
            return new kc0();
        }
        if (kc0Var2 == null) {
            atomicReference.set(null);
            return new kc0();
        }
        atomicReference.set(kc0Var2.f);
        kc0Var2.f = null;
        kc0Var2.c = 0;
        return kc0Var2;
    }
}
