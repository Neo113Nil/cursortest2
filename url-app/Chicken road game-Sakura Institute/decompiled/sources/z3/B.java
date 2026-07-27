package z3;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final A f11969a = new A(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f11970b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f11971c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f11970b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f11971c = atomicReferenceArr;
    }

    public static final void a(A segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f11967f != null || segment.f11968g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f11965d) {
            return;
        }
        AtomicReference atomicReference = f11971c[(int) (Thread.currentThread().getId() & (f11970b - 1))];
        A a4 = f11969a;
        A a5 = (A) atomicReference.getAndSet(a4);
        if (a5 == a4) {
            return;
        }
        int i2 = a5 != null ? a5.f11964c : 0;
        if (i2 >= 65536) {
            atomicReference.set(a5);
            return;
        }
        segment.f11967f = a5;
        segment.f11963b = 0;
        segment.f11964c = i2 + 8192;
        atomicReference.set(segment);
    }

    public static final A b() {
        AtomicReference atomicReference = f11971c[(int) (Thread.currentThread().getId() & (f11970b - 1))];
        A a4 = f11969a;
        A a5 = (A) atomicReference.getAndSet(a4);
        if (a5 == a4) {
            return new A();
        }
        if (a5 == null) {
            atomicReference.set(null);
            return new A();
        }
        atomicReference.set(a5.f11967f);
        a5.f11967f = null;
        a5.f11964c = 0;
        return a5;
    }
}
