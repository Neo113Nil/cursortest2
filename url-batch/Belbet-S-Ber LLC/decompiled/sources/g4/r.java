package g4;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f1957a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1958b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f1959c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1958b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f1959c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        i3.d.e(qVar, "segment");
        if (qVar.f1955f != null || qVar.f1956g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.d) {
            return;
        }
        AtomicReference atomicReference = f1959c[(int) (Thread.currentThread().getId() & (f1958b - 1))];
        q qVar2 = f1957a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f1953c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f1955f = qVar3;
        qVar.f1952b = 0;
        qVar.f1953c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f1959c[(int) (Thread.currentThread().getId() & (f1958b - 1))];
        q qVar = f1957a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f1955f);
        qVar2.f1955f = null;
        qVar2.f1953c = 0;
        return qVar2;
    }
}
