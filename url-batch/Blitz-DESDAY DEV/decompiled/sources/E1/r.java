package E1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f229a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f230b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f231c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f230b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f231c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        g1.d.e(qVar, "segment");
        if (qVar.f227f != null || qVar.f228g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.d) {
            return;
        }
        AtomicReference atomicReference = f231c[(int) (Thread.currentThread().getId() & (f230b - 1))];
        q qVar2 = f229a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f225c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f227f = qVar3;
        qVar.f224b = 0;
        qVar.f225c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f231c[(int) (Thread.currentThread().getId() & (f230b - 1))];
        q qVar = f229a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f227f);
        qVar2.f227f = null;
        qVar2.f225c = 0;
        return qVar2;
    }
}
