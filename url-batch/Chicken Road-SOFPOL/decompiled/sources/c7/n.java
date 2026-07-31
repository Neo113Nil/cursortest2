package c7;

import a7.s1;
import q6.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: n, reason: collision with root package name */
    public final a f1802n;

    public n(int i, a aVar) {
        super(i);
        this.f1802n = aVar;
        if (aVar == a.f1760d) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + t.a(c.class).b() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(Object obj, boolean z3) {
        a aVar = this.f1802n;
        a aVar2 = a.f1762f;
        c6.m mVar = c6.m.f1757a;
        if (aVar == aVar2) {
            Object t3 = super.t(obj);
            return (!(t3 instanceof i) || (t3 instanceof h)) ? t3 : mVar;
        }
        Object obj2 = e.f1780d;
        k kVar = (k) c.i.get(this);
        while (true) {
            long andIncrement = c.f1767e.getAndIncrement(this);
            long j7 = 1152921504606846975L & andIncrement;
            boolean r7 = r(andIncrement, false);
            int i = e.f1778b;
            long j8 = i;
            long j9 = j7 / j8;
            int i8 = (int) (j7 % j8);
            if (kVar.f2799c != j9) {
                k b8 = c.b(this, j9, kVar);
                if (b8 != null) {
                    kVar = b8;
                } else if (r7) {
                    return new h(o());
                }
            }
            int d8 = c.d(this, kVar, i8, obj, j7, obj2, r7);
            if (d8 == 0) {
                kVar.a();
                return mVar;
            }
            if (d8 == 1) {
                break;
            }
            if (d8 != 2) {
                if (d8 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d8 == 4) {
                    if (j7 < c.f1768f.get(this)) {
                        kVar.a();
                    }
                    return new h(o());
                }
                if (d8 == 5) {
                    kVar.a();
                }
            } else {
                if (r7) {
                    kVar.h();
                    return new h(o());
                }
                s1 s1Var = obj2 instanceof s1 ? (s1) obj2 : null;
                if (s1Var != null) {
                    s1Var.a(kVar, i8 + i);
                }
                j((kVar.f2799c * j8) + i8);
            }
        }
    }

    @Override // c7.c, c7.r
    public final Object i(g6.c cVar, Object obj) {
        if (F(obj, true) instanceof h) {
            throw o();
        }
        return c6.m.f1757a;
    }

    @Override // c7.c, c7.r
    public final Object t(Object obj) {
        return F(obj, false);
    }

    @Override // c7.c
    public final boolean u() {
        return this.f1802n == a.f1761e;
    }
}
