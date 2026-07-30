package f8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f3581a = new b0(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3582b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f3583c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3582b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i7 = 0; i7 < highestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f3583c = atomicReferenceArr;
    }

    public static final void a(b0 b0Var) {
        r6.k.f(b0Var, "segment");
        if (b0Var.f3576f != null || b0Var.f3577g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (b0Var.f3574d) {
            return;
        }
        AtomicReference atomicReference = f3583c[(int) (Thread.currentThread().getId() & (f3582b - 1))];
        b0 b0Var2 = f3581a;
        b0 b0Var3 = (b0) atomicReference.getAndSet(b0Var2);
        if (b0Var3 == b0Var2) {
            return;
        }
        int i7 = b0Var3 != null ? b0Var3.f3573c : 0;
        if (i7 >= 65536) {
            atomicReference.set(b0Var3);
            return;
        }
        b0Var.f3576f = b0Var3;
        b0Var.f3572b = 0;
        b0Var.f3573c = i7 + 8192;
        atomicReference.set(b0Var);
    }

    public static final b0 b() {
        AtomicReference atomicReference = f3583c[(int) (Thread.currentThread().getId() & (f3582b - 1))];
        b0 b0Var = f3581a;
        b0 b0Var2 = (b0) atomicReference.getAndSet(b0Var);
        if (b0Var2 == b0Var) {
            return new b0();
        }
        if (b0Var2 == null) {
            atomicReference.set(null);
            return new b0();
        }
        atomicReference.set(b0Var2.f3576f);
        b0Var2.f3576f = null;
        b0Var2.f3573c = 0;
        return b0Var2;
    }
}
