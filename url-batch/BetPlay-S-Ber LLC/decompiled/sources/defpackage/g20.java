package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class g20 {
    public static final f20 a = new f20(new byte[0], 0, 0, false);
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

    public static final void a(f20 f20Var) {
        f20Var.getClass();
        if (f20Var.f != null || f20Var.g != null) {
            o8.j("Failed requirement.");
            return;
        }
        if (f20Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        f20 f20Var2 = a;
        f20 f20Var3 = (f20) atomicReference.getAndSet(f20Var2);
        if (f20Var3 == f20Var2) {
            return;
        }
        int i = f20Var3 != null ? f20Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(f20Var3);
            return;
        }
        f20Var.f = f20Var3;
        f20Var.b = 0;
        f20Var.c = i + 8192;
        atomicReference.set(f20Var);
    }

    public static final f20 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        f20 f20Var = a;
        f20 f20Var2 = (f20) atomicReference.getAndSet(f20Var);
        if (f20Var2 == f20Var) {
            return new f20();
        }
        if (f20Var2 == null) {
            atomicReference.set(null);
            return new f20();
        }
        atomicReference.set(f20Var2.f);
        f20Var2.f = null;
        f20Var2.c = 0;
        return f20Var2;
    }
}
