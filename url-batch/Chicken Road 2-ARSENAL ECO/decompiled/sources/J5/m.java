package J5;

import H5.x0;
import k5.v;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: p, reason: collision with root package name */
    public final int f1332p;

    public m(int i7, int i8) {
        super(i7);
        this.f1332p = i8;
        if (i8 != 1) {
            if (i7 < 1) {
                throw new IllegalArgumentException(C1.c.g("Buffered channel capacity must be at least 1, but ", i7, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.t.a(b.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Object obj, boolean z5) {
        v vVar = v.f5219a;
        if (this.f1332p == 3) {
            Object g7 = super.g(obj);
            return (!(g7 instanceof h) || (g7 instanceof g)) ? g7 : vVar;
        }
        Object obj2 = d.f1308d;
        j jVar = (j) b.f1298k.get(this);
        while (true) {
            long andIncrement = b.f1294g.getAndIncrement(this);
            long j4 = 1152921504606846975L & andIncrement;
            boolean s6 = s(andIncrement, false);
            int i7 = d.f1306b;
            long j7 = i7;
            long j8 = j4 / j7;
            int i8 = (int) (j4 % j7);
            if (jVar.f1622h != j8) {
                j a7 = b.a(this, j8, jVar);
                if (a7 != null) {
                    jVar = a7;
                } else if (s6) {
                    return new g(p());
                }
            }
            int f7 = b.f(this, jVar, i8, obj, j4, obj2, s6);
            if (f7 == 0) {
                jVar.a();
                return vVar;
            }
            if (f7 == 1) {
                break;
            }
            if (f7 != 2) {
                if (f7 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (f7 == 4) {
                    if (j4 < b.f1295h.get(this)) {
                        jVar.a();
                    }
                    return new g(p());
                }
                if (f7 == 5) {
                    jVar.a();
                }
            } else {
                if (s6) {
                    jVar.h();
                    return new g(p());
                }
                x0 x0Var = obj2 instanceof x0 ? (x0) obj2 : null;
                if (x0Var != null) {
                    x0Var.a(jVar, i8 + i7);
                }
                k((jVar.f1622h * j7) + i8);
            }
        }
    }

    @Override // J5.b, J5.s
    public final Object b(Object obj, AbstractC0607c abstractC0607c) {
        if (D(obj, true) instanceof g) {
            throw p();
        }
        return v.f5219a;
    }

    @Override // J5.b, J5.s
    public final Object g(Object obj) {
        return D(obj, false);
    }

    @Override // J5.b
    public final boolean u() {
        return this.f1332p == 2;
    }
}
