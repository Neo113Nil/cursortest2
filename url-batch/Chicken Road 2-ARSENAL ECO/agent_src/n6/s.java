package n6;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f5557a = new r(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f5558b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f5559c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f5558b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i7 = 0; i7 < highestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f5559c = atomicReferenceArr;
    }

    public static final void a(r segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        if (segment.f5555f != null || segment.f5556g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f5553d) {
            return;
        }
        AtomicReference atomicReference = f5559c[(int) (Thread.currentThread().getId() & (f5558b - 1))];
        r rVar = f5557a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return;
        }
        int i7 = rVar2 != null ? rVar2.f5552c : 0;
        if (i7 >= 65536) {
            atomicReference.set(rVar2);
            return;
        }
        segment.f5555f = rVar2;
        segment.f5551b = 0;
        segment.f5552c = i7 + 8192;
        atomicReference.set(segment);
    }

    public static final r b() {
        AtomicReference atomicReference = f5559c[(int) (Thread.currentThread().getId() & (f5558b - 1))];
        r rVar = f5557a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new r();
        }
        atomicReference.set(rVar2.f5555f);
        rVar2.f5555f = null;
        rVar2.f5552c = 0;
        return rVar2;
    }
}
