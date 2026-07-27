package j5;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f10528a = new r(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f10529b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f10530c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f10529b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f10530c = atomicReferenceArr;
    }

    public static final void a(r segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        if (segment.f10526f != null || segment.f10527g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f10524d) {
            return;
        }
        AtomicReference atomicReference = f10530c[(int) (Thread.currentThread().getId() & (f10529b - 1))];
        r rVar = f10528a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return;
        }
        int i2 = rVar2 != null ? rVar2.f10523c : 0;
        if (i2 >= 65536) {
            atomicReference.set(rVar2);
            return;
        }
        segment.f10526f = rVar2;
        segment.f10522b = 0;
        segment.f10523c = i2 + 8192;
        atomicReference.set(segment);
    }

    public static final r b() {
        AtomicReference atomicReference = f10530c[(int) (Thread.currentThread().getId() & (f10529b - 1))];
        r rVar = f10528a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new r();
        }
        atomicReference.set(rVar2.f10526f);
        rVar2.f10526f = null;
        rVar2.f10523c = 0;
        return rVar2;
    }
}
