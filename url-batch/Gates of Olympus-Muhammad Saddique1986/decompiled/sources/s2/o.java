package s2;

import e2.InterfaceC0424c;
import java.util.concurrent.atomic.AtomicReferenceArray;
import q2.w0;

/* loaded from: classes.dex */
public final class o extends v2.r {

    /* renamed from: e, reason: collision with root package name */
    public final g f8413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f8414f;

    public o(long j3, o oVar, g gVar, int i3) {
        super(j3, oVar, i3);
        this.f8413e = gVar;
        this.f8414f = new AtomicReferenceArray(i.f8389b * 2);
    }

    @Override // v2.r
    public final int f() {
        return i.f8389b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        f2.j.c(r4);
        r7 = r4.f8386e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        v2.a.a(r7, r0, r8);
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
    @Override // v2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i3, V1.i iVar) {
        int i4 = i.f8389b;
        boolean z3 = i3 >= i4;
        if (z3) {
            i3 -= i4;
        }
        Object obj = this.f8414f.get(i3 * 2);
        while (true) {
            Object k3 = k(i3);
            boolean z4 = k3 instanceof w0;
            g gVar = this.f8413e;
            if (z4 || (k3 instanceof x)) {
                if (j(k3, i3, z3 ? i.f8397j : i.f8398k)) {
                    m(i3, null);
                    l(i3, !z3);
                    if (z3) {
                        f2.j.c(gVar);
                        InterfaceC0424c interfaceC0424c = gVar.f8386e;
                        if (interfaceC0424c != null) {
                            v2.a.a(interfaceC0424c, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (k3 == i.f8397j || k3 == i.f8398k) {
                    break;
                }
                if (k3 != i.f8394g && k3 != i.f8393f) {
                    if (k3 == i.f8396i || k3 == i.f8391d || k3 == i.f8399l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k3).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i3, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f8414f;
        int i4 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.f8414f.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z3) {
        if (z3) {
            g gVar = this.f8413e;
            f2.j.c(gVar);
            gVar.K((this.f9826c * i.f8389b) + i3);
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f8414f.set(i3 * 2, obj);
    }

    public final void n(int i3, m1.q qVar) {
        this.f8414f.set((i3 * 2) + 1, qVar);
    }
}
