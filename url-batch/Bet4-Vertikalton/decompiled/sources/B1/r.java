package B1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f96a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f97b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f98c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f97b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f98c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        d1.d.e(qVar, "segment");
        if (qVar.f94f != null || qVar.f95g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.d) {
            return;
        }
        AtomicReference atomicReference = f98c[(int) (Thread.currentThread().getId() & (f97b - 1))];
        q qVar2 = f96a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f92c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f94f = qVar3;
        qVar.f91b = 0;
        qVar.f92c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f98c[(int) (Thread.currentThread().getId() & (f97b - 1))];
        q qVar = f96a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f94f);
        qVar2.f94f = null;
        qVar2.f92c = 0;
        return qVar2;
    }
}
