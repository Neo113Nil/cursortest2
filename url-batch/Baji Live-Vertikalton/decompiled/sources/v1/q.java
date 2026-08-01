package v1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final p f4076a = new p(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4077b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f4078c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4077b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f4078c = atomicReferenceArr;
    }

    public static final void a(p pVar) {
        X0.e.e(pVar, "segment");
        if (pVar.f4074f != null || pVar.f4075g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (pVar.d) {
            return;
        }
        AtomicReference atomicReference = f4078c[(int) (Thread.currentThread().getId() & (f4077b - 1))];
        p pVar2 = f4076a;
        p pVar3 = (p) atomicReference.getAndSet(pVar2);
        if (pVar3 == pVar2) {
            return;
        }
        int i = pVar3 != null ? pVar3.f4072c : 0;
        if (i >= 65536) {
            atomicReference.set(pVar3);
            return;
        }
        pVar.f4074f = pVar3;
        pVar.f4071b = 0;
        pVar.f4072c = i + 8192;
        atomicReference.set(pVar);
    }

    public static final p b() {
        AtomicReference atomicReference = f4078c[(int) (Thread.currentThread().getId() & (f4077b - 1))];
        p pVar = f4076a;
        p pVar2 = (p) atomicReference.getAndSet(pVar);
        if (pVar2 == pVar) {
            return new p();
        }
        if (pVar2 == null) {
            atomicReference.set(null);
            return new p();
        }
        atomicReference.set(pVar2.f4074f);
        pVar2.f4074f = null;
        pVar2.f4072c = 0;
        return pVar2;
    }
}
