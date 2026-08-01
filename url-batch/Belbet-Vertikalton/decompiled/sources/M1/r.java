package M1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f855a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f856b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f857c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f856b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f857c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        j1.h.e(qVar, "segment");
        if (qVar.f853f != null || qVar.f854g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.f852d) {
            return;
        }
        AtomicReference atomicReference = f857c[(int) (Thread.currentThread().getId() & (f856b - 1))];
        q qVar2 = f855a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f851c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f853f = qVar3;
        qVar.f850b = 0;
        qVar.f851c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f857c[(int) (Thread.currentThread().getId() & (f856b - 1))];
        q qVar = f855a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f853f);
        qVar2.f853f = null;
        qVar2.f851c = 0;
        return qVar2;
    }
}
