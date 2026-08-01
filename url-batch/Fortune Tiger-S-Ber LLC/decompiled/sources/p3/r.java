package p3;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f3046a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3047b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3047b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        u2.c.e(qVar, "segment");
        if (qVar.f3045f != null || qVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.f3043d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (f3047b - 1))];
        q qVar2 = f3046a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i4 = qVar3 != null ? qVar3.c : 0;
        if (i4 >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f3045f = qVar3;
        qVar.f3042b = 0;
        qVar.c = i4 + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (f3047b - 1))];
        q qVar = f3046a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f3045f);
        qVar2.f3045f = null;
        qVar2.c = 0;
        return qVar2;
    }
}
