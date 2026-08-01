package v1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f4515a = new r(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4516b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f4517c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4516b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f4517c = atomicReferenceArr;
    }

    public static final void a(r rVar) {
        X0.f.e(rVar, "segment");
        if (rVar.f4513f != null || rVar.f4514g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (rVar.f4511d) {
            return;
        }
        AtomicReference atomicReference = f4517c[(int) (Thread.currentThread().getId() & (f4516b - 1))];
        r rVar2 = f4515a;
        r rVar3 = (r) atomicReference.getAndSet(rVar2);
        if (rVar3 == rVar2) {
            return;
        }
        int i = rVar3 != null ? rVar3.f4510c : 0;
        if (i >= 65536) {
            atomicReference.set(rVar3);
            return;
        }
        rVar.f4513f = rVar3;
        rVar.f4509b = 0;
        rVar.f4510c = i + 8192;
        atomicReference.set(rVar);
    }

    public static final r b() {
        AtomicReference atomicReference = f4517c[(int) (Thread.currentThread().getId() & (f4516b - 1))];
        r rVar = f4515a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new r();
        }
        atomicReference.set(rVar2.f4513f);
        rVar2.f4513f = null;
        rVar2.f4510c = 0;
        return rVar2;
    }
}
