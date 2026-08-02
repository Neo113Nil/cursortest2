package T3;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f3004a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3005b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f3006c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3005b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        f3006c = atomicReferenceArr;
    }

    public static final void a(q segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        if (segment.f3002f != null || segment.f3003g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f3000d) {
            return;
        }
        AtomicReference atomicReference = f3006c[(int) (Thread.currentThread().getId() & (f3005b - 1))];
        q qVar = f3004a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return;
        }
        int i4 = qVar2 != null ? qVar2.f2999c : 0;
        if (i4 >= 65536) {
            atomicReference.set(qVar2);
            return;
        }
        segment.f3002f = qVar2;
        segment.f2998b = 0;
        segment.f2999c = i4 + 8192;
        atomicReference.set(segment);
    }

    public static final q b() {
        AtomicReference atomicReference = f3006c[(int) (Thread.currentThread().getId() & (f3005b - 1))];
        q qVar = f3004a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f3002f);
        qVar2.f3002f = null;
        qVar2.f2999c = 0;
        return qVar2;
    }
}
