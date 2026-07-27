package Y2;

import W2.C0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends b3.r {

    /* renamed from: e, reason: collision with root package name */
    public final e f4444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4445f;

    public m(long j4, m mVar, e eVar, int i2) {
        super(j4, mVar, i2);
        this.f4444e = eVar;
        this.f4445f = new AtomicReferenceArray(g.f4421b * 2);
    }

    @Override // b3.r
    public final int f() {
        return g.f4421b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        kotlin.jvm.internal.Intrinsics.c(r4);
        r7 = r4.f4418e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        b3.a.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // b3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, CoroutineContext coroutineContext) {
        int i4 = g.f4421b;
        boolean z4 = i2 >= i4;
        if (z4) {
            i2 -= i4;
        }
        Object obj = this.f4445f.get(i2 * 2);
        while (true) {
            Object k4 = k(i2);
            boolean z5 = k4 instanceof C0;
            e eVar = this.f4444e;
            if (z5 || (k4 instanceof t)) {
                if (j(k4, i2, z4 ? g.f4429j : g.f4430k)) {
                    m(i2, null);
                    l(i2, !z4);
                    if (z4) {
                        Intrinsics.c(eVar);
                        Function1 function1 = eVar.f4418e;
                        if (function1 != null) {
                            b3.a.a(function1, obj, coroutineContext);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (k4 == g.f4429j || k4 == g.f4430k) {
                    break;
                }
                if (k4 != g.f4426g && k4 != g.f4425f) {
                    if (k4 == g.f4428i || k4 == g.f4423d || k4 == g.f4431l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k4).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i2, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f4445f;
        int i4 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f4445f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z4) {
        if (z4) {
            e eVar = this.f4444e;
            Intrinsics.c(eVar);
            eVar.F((this.f5686c * g.f4421b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f4445f.set(i2 * 2, obj);
    }

    public final void n(int i2, b3.t tVar) {
        this.f4445f.set((i2 * 2) + 1, tVar);
    }
}
