package v1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f4099a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4100b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f4101c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4100b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f4101c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        X0.d.e(qVar, "segment");
        if (qVar.f4097f != null || qVar.f4098g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.d) {
            return;
        }
        AtomicReference atomicReference = f4101c[(int) (Thread.currentThread().getId() & (f4100b - 1))];
        q qVar2 = f4099a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f4095c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f4097f = qVar3;
        qVar.f4094b = 0;
        qVar.f4095c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f4101c[(int) (Thread.currentThread().getId() & (f4100b - 1))];
        q qVar = f4099a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f4097f);
        qVar2.f4097f = null;
        qVar2.f4095c = 0;
        return qVar2;
    }
}
