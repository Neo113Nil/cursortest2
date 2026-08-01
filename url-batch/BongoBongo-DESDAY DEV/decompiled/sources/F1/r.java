package F1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f274a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f275b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f276c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f275b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f276c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        h1.d.e(qVar, "segment");
        if (qVar.f272f != null || qVar.f273g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.d) {
            return;
        }
        AtomicReference atomicReference = f276c[(int) (Thread.currentThread().getId() & (f275b - 1))];
        q qVar2 = f274a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f270c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f272f = qVar3;
        qVar.f269b = 0;
        qVar.f270c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f276c[(int) (Thread.currentThread().getId() & (f275b - 1))];
        q qVar = f274a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f272f);
        qVar2.f272f = null;
        qVar2.f270c = 0;
        return qVar2;
    }
}
