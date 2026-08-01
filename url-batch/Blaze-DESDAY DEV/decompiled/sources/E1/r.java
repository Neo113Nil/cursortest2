package E1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f230a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f231b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f232c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f231b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f232c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        g1.d.e(qVar, "segment");
        if (qVar.f228f != null || qVar.f229g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.d) {
            return;
        }
        AtomicReference atomicReference = f232c[(int) (Thread.currentThread().getId() & (f231b - 1))];
        q qVar2 = f230a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f226c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f228f = qVar3;
        qVar.f225b = 0;
        qVar.f226c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f232c[(int) (Thread.currentThread().getId() & (f231b - 1))];
        q qVar = f230a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f228f);
        qVar2.f228f = null;
        qVar2.f226c = 0;
        return qVar2;
    }
}
