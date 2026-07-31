package m2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import k2.w0;

/* loaded from: classes.dex */
public final class m extends p2.s {

    /* renamed from: e, reason: collision with root package name */
    public final e f5974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f5975f;

    public m(long j3, m mVar, e eVar, int i3) {
        super(j3, mVar, i3);
        this.f5974e = eVar;
        this.f5975f = new AtomicReferenceArray(g.f5952b * 2);
    }

    @Override // p2.s
    public final int f() {
        return g.f5952b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        Z1.i.c(r4);
        r7 = r4.f5949e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        p2.a.a(r7, r0, r8);
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
    @Override // p2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i3, P1.i iVar) {
        int i4 = g.f5952b;
        boolean z3 = i3 >= i4;
        if (z3) {
            i3 -= i4;
        }
        Object obj = this.f5975f.get(i3 * 2);
        while (true) {
            Object k3 = k(i3);
            boolean z4 = k3 instanceof w0;
            e eVar = this.f5974e;
            if (z4 || (k3 instanceof u)) {
                if (j(k3, i3, z3 ? g.f5960j : g.f5961k)) {
                    m(i3, null);
                    l(i3, !z3);
                    if (z3) {
                        Z1.i.c(eVar);
                        Y1.c cVar = eVar.f5949e;
                        if (cVar != null) {
                            p2.a.a(cVar, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (k3 == g.f5960j || k3 == g.f5961k) {
                    break;
                }
                if (k3 != g.f5957g && k3 != g.f5956f) {
                    if (k3 == g.f5959i || k3 == g.f5954d || k3 == g.f5962l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k3).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i3, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f5975f;
        int i4 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.f5975f.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z3) {
        if (z3) {
            e eVar = this.f5974e;
            Z1.i.c(eVar);
            eVar.F((this.f6806c * g.f5952b) + i3);
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f5975f.set(i3 * 2, obj);
    }

    public final void n(int i3, j1.p pVar) {
        this.f5975f.set((i3 * 2) + 1, pVar);
    }
}
