package v1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f4519a = new r(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4520b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f4521c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4520b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f4521c = atomicReferenceArr;
    }

    public static final void a(r rVar) {
        X0.f.e(rVar, "segment");
        if (rVar.f4517f != null || rVar.f4518g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (rVar.f4515d) {
            return;
        }
        AtomicReference atomicReference = f4521c[(int) (Thread.currentThread().getId() & (f4520b - 1))];
        r rVar2 = f4519a;
        r rVar3 = (r) atomicReference.getAndSet(rVar2);
        if (rVar3 == rVar2) {
            return;
        }
        int i = rVar3 != null ? rVar3.f4514c : 0;
        if (i >= 65536) {
            atomicReference.set(rVar3);
            return;
        }
        rVar.f4517f = rVar3;
        rVar.f4513b = 0;
        rVar.f4514c = i + 8192;
        atomicReference.set(rVar);
    }

    public static final r b() {
        AtomicReference atomicReference = f4521c[(int) (Thread.currentThread().getId() & (f4520b - 1))];
        r rVar = f4519a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new r();
        }
        atomicReference.set(rVar2.f4517f);
        rVar2.f4517f = null;
        rVar2.f4514c = 0;
        return rVar2;
    }
}
