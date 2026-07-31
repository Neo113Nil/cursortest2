package Y0;

import F.InterfaceC0027i;
import W0.l0;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: o, reason: collision with root package name */
    public final int f1045o;

    public m(int i2, int i3) {
        super(i2);
        this.f1045o = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + P0.p.a(b.class).b() + " instead").toString());
        }
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Object obj, boolean z2) {
        D0.h hVar = D0.h.f206a;
        if (this.f1045o == 3) {
            Object l2 = super.l(obj);
            return (!(l2 instanceof h) || (l2 instanceof g)) ? l2 : hVar;
        }
        InterfaceC0027i interfaceC0027i = d.f1022d;
        j jVar = (j) b.f1012j.get(this);
        while (true) {
            long andIncrement = b.f1008f.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean r2 = r(andIncrement, false);
            int i2 = d.f1020b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (jVar.f1777g != j4) {
                j a2 = b.a(this, j4, jVar);
                if (a2 != null) {
                    jVar = a2;
                } else if (r2) {
                    return new g(o());
                }
            }
            int d2 = b.d(this, jVar, i3, obj, j2, interfaceC0027i, r2);
            if (d2 == 0) {
                jVar.a();
                return hVar;
            }
            if (d2 == 1) {
                break;
            }
            if (d2 != 2) {
                if (d2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d2 == 4) {
                    if (j2 < b.f1009g.get(this)) {
                        jVar.a();
                    }
                    return new g(o());
                }
                if (d2 == 5) {
                    jVar.a();
                }
            } else {
                if (r2) {
                    jVar.h();
                    return new g(o());
                }
                l0 l0Var = interfaceC0027i instanceof l0 ? (l0) interfaceC0027i : null;
                if (l0Var != null) {
                    l0Var.a(jVar, i3 + i2);
                }
                h((jVar.f1777g * j3) + i3);
            }
        }
    }

    @Override // Y0.b, Y0.r
    public final Object k(I0.b bVar, Object obj) {
        if (D(obj, true) instanceof g) {
            throw o();
        }
        return D0.h.f206a;
    }

    @Override // Y0.b, Y0.r
    public final Object l(Object obj) {
        return D(obj, false);
    }

    @Override // Y0.b
    public final boolean t() {
        return this.f1045o == 2;
    }
}
