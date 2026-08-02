package v2;

import E1.AbstractC0033i;
import b2.C0195i;
import d2.InterfaceC0300c;
import t2.p0;

/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: k, reason: collision with root package name */
    public final a f10611k;

    public m(int i3, a aVar) {
        super(i3);
        this.f10611k = aVar;
        if (aVar != a.f10571a) {
            if (i3 < 1) {
                throw new IllegalArgumentException(AbstractC0033i.i(i3, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.r.a(c.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Object obj, boolean z) {
        a aVar = a.f10573c;
        C0195i c0195i = C0195i.f2555a;
        if (this.f10611k == aVar) {
            Object j3 = super.j(obj);
            return (!(j3 instanceof i) || (j3 instanceof h)) ? j3 : c0195i;
        }
        Object obj2 = e.f10591d;
        k kVar = (k) c.f.get(this);
        while (true) {
            long andIncrement = c.f10578b.getAndIncrement(this);
            long j4 = 1152921504606846975L & andIncrement;
            boolean r3 = r(andIncrement, false);
            int i3 = e.f10589b;
            long j5 = i3;
            long j6 = j4 / j5;
            int i4 = (int) (j4 % j5);
            if (kVar.f10866c != j6) {
                k a3 = c.a(this, j6, kVar);
                if (a3 != null) {
                    kVar = a3;
                } else if (r3) {
                    return new h(o());
                }
            }
            int d3 = c.d(this, kVar, i4, obj, j4, obj2, r3);
            if (d3 == 0) {
                kVar.a();
                return c0195i;
            }
            if (d3 == 1) {
                break;
            }
            if (d3 != 2) {
                if (d3 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d3 == 4) {
                    if (j4 < c.f10579c.get(this)) {
                        kVar.a();
                    }
                    return new h(o());
                }
                if (d3 == 5) {
                    kVar.a();
                }
            } else {
                if (r3) {
                    kVar.h();
                    return new h(o());
                }
                p0 p0Var = obj2 instanceof p0 ? (p0) obj2 : null;
                if (p0Var != null) {
                    p0Var.a(kVar, i4 + i3);
                }
                i((kVar.f10866c * j5) + i4);
            }
        }
    }

    @Override // v2.c, v2.r
    public final Object g(InterfaceC0300c interfaceC0300c, Object obj) {
        if (D(obj, true) instanceof h) {
            throw o();
        }
        return C0195i.f2555a;
    }

    @Override // v2.c, v2.r
    public final Object j(Object obj) {
        return D(obj, false);
    }

    @Override // v2.c
    public final boolean t() {
        return this.f10611k == a.f10572b;
    }
}
