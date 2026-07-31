package T2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final A f4379a = new A(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4380b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f4381c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4380b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i3 = 0; i3 < highestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        f4381c = atomicReferenceArr;
    }

    public static final void a(A a3) {
        f2.j.f(a3, "segment");
        if (a3.f4377f != null || a3.f4378g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (a3.f4375d) {
            return;
        }
        AtomicReference atomicReference = f4381c[(int) (Thread.currentThread().getId() & (f4380b - 1))];
        A a4 = f4379a;
        A a5 = (A) atomicReference.getAndSet(a4);
        if (a5 == a4) {
            return;
        }
        int i3 = a5 != null ? a5.f4374c : 0;
        if (i3 >= 65536) {
            atomicReference.set(a5);
            return;
        }
        a3.f4377f = a5;
        a3.f4373b = 0;
        a3.f4374c = i3 + 8192;
        atomicReference.set(a3);
    }

    public static final A b() {
        AtomicReference atomicReference = f4381c[(int) (Thread.currentThread().getId() & (f4380b - 1))];
        A a3 = f4379a;
        A a4 = (A) atomicReference.getAndSet(a3);
        if (a4 == a3) {
            return new A();
        }
        if (a4 == null) {
            atomicReference.set(null);
            return new A();
        }
        atomicReference.set(a4.f4377f);
        a4.f4377f = null;
        a4.f4374c = 0;
        return a4;
    }
}
