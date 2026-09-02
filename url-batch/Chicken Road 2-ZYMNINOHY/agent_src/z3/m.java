package z3;

import E.AbstractC0005f;
import c3.C0297i;
import x3.p0;

/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: k, reason: collision with root package name */
    public final a f16332k;

    public m(int i4, a aVar) {
        super(i4);
        this.f16332k = aVar;
        if (aVar != a.f16290a) {
            if (i4 < 1) {
                throw new IllegalArgumentException(AbstractC0005f.k(i4, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.q.a(c.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Object obj, boolean z) {
        a aVar = this.f16332k;
        a aVar2 = a.f16292c;
        C0297i c0297i = C0297i.f5732a;
        if (aVar == aVar2) {
            Object h2 = super.h(obj);
            return (!(h2 instanceof i) || (h2 instanceof h)) ? h2 : c0297i;
        }
        Object obj2 = e.f16311d;
        k kVar = (k) c.f16301f.get(this);
        while (true) {
            long andIncrement = c.f16297b.getAndIncrement(this);
            long j4 = 1152921504606846975L & andIncrement;
            boolean r4 = r(andIncrement, false);
            int i4 = e.f16309b;
            long j5 = i4;
            long j6 = j4 / j5;
            int i5 = (int) (j4 % j5);
            if (kVar.f318c != j6) {
                k a3 = c.a(this, j6, kVar);
                if (a3 != null) {
                    kVar = a3;
                } else if (r4) {
                    return new h(o());
                }
            }
            int e4 = c.e(this, kVar, i5, obj, j4, obj2, r4);
            if (e4 == 0) {
                kVar.a();
                return c0297i;
            }
            if (e4 == 1) {
                break;
            }
            if (e4 != 2) {
                if (e4 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (e4 == 4) {
                    if (j4 < c.f16298c.get(this)) {
                        kVar.a();
                    }
                    return new h(o());
                }
                if (e4 == 5) {
                    kVar.a();
                }
            } else {
                if (r4) {
                    kVar.h();
                    return new h(o());
                }
                p0 p0Var = obj2 instanceof p0 ? (p0) obj2 : null;
                if (p0Var != null) {
                    p0Var.a(kVar, i5 + i4);
                }
                j((kVar.f318c * j5) + i5);
            }
        }
    }

    @Override // z3.c, z3.r
    public final Object d(h3.c cVar, Object obj) {
        if (D(obj, true) instanceof h) {
            throw o();
        }
        return C0297i.f5732a;
    }

    @Override // z3.c, z3.r
    public final Object h(Object obj) {
        return D(obj, false);
    }

    @Override // z3.c
    public final boolean t() {
        return this.f16332k == a.f16291b;
    }
}
