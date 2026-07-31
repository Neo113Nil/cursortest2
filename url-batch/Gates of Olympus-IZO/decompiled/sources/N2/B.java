package N2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final A f2899a = new A(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f2900b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f2901c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f2900b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i3 = 0; i3 < highestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        f2901c = atomicReferenceArr;
    }

    public static final void a(A a3) {
        Z1.i.f(a3, "segment");
        if (a3.f2897f != null || a3.f2898g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (a3.f2895d) {
            return;
        }
        AtomicReference atomicReference = f2901c[(int) (Thread.currentThread().getId() & (f2900b - 1))];
        A a4 = f2899a;
        A a5 = (A) atomicReference.getAndSet(a4);
        if (a5 == a4) {
            return;
        }
        int i3 = a5 != null ? a5.f2894c : 0;
        if (i3 >= 65536) {
            atomicReference.set(a5);
            return;
        }
        a3.f2897f = a5;
        a3.f2893b = 0;
        a3.f2894c = i3 + 8192;
        atomicReference.set(a3);
    }

    public static final A b() {
        AtomicReference atomicReference = f2901c[(int) (Thread.currentThread().getId() & (f2900b - 1))];
        A a3 = f2899a;
        A a4 = (A) atomicReference.getAndSet(a3);
        if (a4 == a3) {
            return new A();
        }
        if (a4 == null) {
            atomicReference.set(null);
            return new A();
        }
        atomicReference.set(a4.f2897f);
        a4.f2897f = null;
        a4.f2894c = 0;
        return a4;
    }
}
