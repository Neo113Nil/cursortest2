package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f43311a = new x();

    /* renamed from: b, reason: collision with root package name */
    private static final int f43312b = 65536;

    /* renamed from: c, reason: collision with root package name */
    private static final w f43313c = new w(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    private static final int f43314d;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f43315e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f43314d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        f43315e = atomicReferenceArr;
    }

    private x() {
    }

    private final AtomicReference a() {
        return f43315e[(int) (Thread.currentThread().getId() & (f43314d - 1))];
    }

    public static final void b(w segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f43309f != null || segment.f43310g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f43307d) {
            return;
        }
        AtomicReference a4 = f43311a.a();
        w wVar = f43313c;
        w wVar2 = (w) a4.getAndSet(wVar);
        if (wVar2 == wVar) {
            return;
        }
        int i4 = wVar2 != null ? wVar2.f43306c : 0;
        if (i4 >= f43312b) {
            a4.set(wVar2);
            return;
        }
        segment.f43309f = wVar2;
        segment.f43305b = 0;
        segment.f43306c = i4 + 8192;
        a4.set(segment);
    }

    public static final w c() {
        AtomicReference a4 = f43311a.a();
        w wVar = f43313c;
        w wVar2 = (w) a4.getAndSet(wVar);
        if (wVar2 == wVar) {
            return new w();
        }
        if (wVar2 == null) {
            a4.set(null);
            return new w();
        }
        a4.set(wVar2.f43309f);
        wVar2.f43309f = null;
        wVar2.f43306c = 0;
        return wVar2;
    }
}
