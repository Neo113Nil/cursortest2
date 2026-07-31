package y0;

import m4.q;
import m4.s0;
import o2.a0;

/* loaded from: classes.dex */
final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final q<a> f23238a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23239b;

    private f(int i7, q<a> qVar) {
        this.f23239b = i7;
        this.f23238a = qVar;
    }

    private static a a(int i7, int i8, a0 a0Var) {
        switch (i7) {
            case 1718776947:
                return g.d(i8, a0Var);
            case 1751742049:
                return c.b(a0Var);
            case 1752331379:
                return d.c(a0Var);
            case 1852994675:
                return h.a(a0Var);
            default:
                return null;
        }
    }

    public static f c(int i7, a0 a0Var) {
        q.a aVar = new q.a();
        int f7 = a0Var.f();
        int i8 = -2;
        while (a0Var.a() > 8) {
            int p7 = a0Var.p();
            int e7 = a0Var.e() + a0Var.p();
            a0Var.N(e7);
            a c7 = p7 == 1414744396 ? c(a0Var.p(), a0Var) : a(p7, i8, a0Var);
            if (c7 != null) {
                if (c7.getType() == 1752331379) {
                    i8 = ((d) c7).b();
                }
                aVar.a(c7);
            }
            a0Var.O(e7);
            a0Var.N(f7);
        }
        return new f(i7, aVar.h());
    }

    public <T extends a> T b(Class<T> cls) {
        s0<a> it = this.f23238a.iterator();
        while (it.hasNext()) {
            T t6 = (T) it.next();
            if (t6.getClass() == cls) {
                return t6;
            }
        }
        return null;
    }

    @Override // y0.a
    public int getType() {
        return this.f23239b;
    }
}
