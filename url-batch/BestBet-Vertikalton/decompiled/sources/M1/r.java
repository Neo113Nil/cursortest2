package M1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f826a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f827b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f828c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f827b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f828c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        k1.e.e(qVar, "segment");
        if (qVar.f824f != null || qVar.f825g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.d) {
            return;
        }
        AtomicReference atomicReference = f828c[(int) (Thread.currentThread().getId() & (f827b - 1))];
        q qVar2 = f826a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f822c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f824f = qVar3;
        qVar.f821b = 0;
        qVar.f822c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f828c[(int) (Thread.currentThread().getId() & (f827b - 1))];
        q qVar = f826a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f824f);
        qVar2.f824f = null;
        qVar2.f822c = 0;
        return qVar2;
    }
}
