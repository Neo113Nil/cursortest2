package T6;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f2650a = new r(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f2651b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f2652c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f2651b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f2652c = atomicReferenceArr;
    }

    public static final void a(r segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f2648f != null || segment.f2649g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f2646d) {
            return;
        }
        AtomicReference atomicReference = f2652c[(int) (Thread.currentThread().getId() & (f2651b - 1))];
        r rVar = f2650a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return;
        }
        int i2 = rVar2 != null ? rVar2.f2645c : 0;
        if (i2 >= 65536) {
            atomicReference.set(rVar2);
            return;
        }
        segment.f2648f = rVar2;
        segment.f2644b = 0;
        segment.f2645c = i2 + 8192;
        atomicReference.set(segment);
    }

    public static final r b() {
        AtomicReference atomicReference = f2652c[(int) (Thread.currentThread().getId() & (f2651b - 1))];
        r rVar = f2650a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new r();
        }
        atomicReference.set(rVar2.f2648f);
        rVar2.f2648f = null;
        rVar2.f2645c = 0;
        return rVar2;
    }
}
