package e7;

import c7.w1;
import d6.z;
import r6.w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: p, reason: collision with root package name */
    public final a f2885p;

    public p(int i7, a aVar) {
        super(i7);
        this.f2885p = aVar;
        if (aVar != a.f2833f) {
            if (i7 < 1) {
                throw new IllegalArgumentException(a0.m.g(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + w.a(e.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(Object obj, boolean z8) {
        a aVar = this.f2885p;
        a aVar2 = a.f2835h;
        z zVar = z.f2639a;
        if (aVar == aVar2) {
            Object e9 = super.e(obj);
            return (!(e9 instanceof k) || (e9 instanceof j)) ? e9 : zVar;
        }
        Object obj2 = g.f2860d;
        m mVar = (m) e.f2850k.get(this);
        while (true) {
            long andIncrement = e.f2846g.getAndIncrement(this);
            long j8 = 1152921504606846975L & andIncrement;
            boolean v5 = v(andIncrement, false);
            int i7 = g.f2858b;
            long j9 = i7;
            long j10 = j8 / j9;
            int i8 = (int) (j8 % j9);
            if (mVar.f4704c != j10) {
                m b9 = e.b(this, j10, mVar);
                if (b9 != null) {
                    mVar = b9;
                } else if (v5) {
                    return new j(s());
                }
            }
            int i9 = e.i(this, mVar, i8, obj, j8, obj2, v5);
            if (i9 == 0) {
                mVar.a();
                return zVar;
            }
            if (i9 == 1) {
                break;
            }
            if (i9 != 2) {
                if (i9 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (i9 == 4) {
                    if (j8 < e.f2847h.get(this)) {
                        mVar.a();
                    }
                    return new j(s());
                }
                if (i9 == 5) {
                    mVar.a();
                }
            } else {
                if (v5) {
                    mVar.h();
                    return new j(s());
                }
                w1 w1Var = obj2 instanceof w1 ? (w1) obj2 : null;
                if (w1Var != null) {
                    w1Var.a(mVar, i8 + i7);
                }
                n((mVar.f4704c * j9) + i8);
            }
        }
    }

    @Override // e7.e, e7.u
    public final Object e(Object obj) {
        return J(obj, false);
    }

    @Override // e7.e, e7.u
    public final Object h(h6.d dVar, Object obj) {
        if (J(obj, true) instanceof j) {
            throw s();
        }
        return z.f2639a;
    }

    @Override // e7.e
    public final boolean x() {
        return this.f2885p == a.f2834g;
    }
}
