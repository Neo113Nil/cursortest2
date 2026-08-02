package a0;

import T.C0097o;
import a.AbstractC0124a;
import s0.C1409e;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4198a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4199b;

    /* renamed from: c, reason: collision with root package name */
    public int f4200c;

    /* renamed from: d, reason: collision with root package name */
    public int f4201d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4202e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4203f;

    public static void b(AbstractC0135a abstractC0135a) {
        int i4 = abstractC0135a.f4044h;
        if (i4 == 2) {
            AbstractC0124a.t(i4 == 2);
            abstractC0135a.f4044h = 1;
            abstractC0135a.v();
        }
    }

    public static boolean h(AbstractC0135a abstractC0135a) {
        return abstractC0135a.f4044h != 0;
    }

    public static void l(AbstractC0135a abstractC0135a, long j4) {
        abstractC0135a.n = true;
        if (abstractC0135a instanceof C1409e) {
            C1409e c1409e = (C1409e) abstractC0135a;
            AbstractC0124a.t(c1409e.n);
            c1409e.f15220K = j4;
        }
    }

    public void a(AbstractC0135a abstractC0135a, C0142h c0142h) {
        AbstractC0124a.t(((AbstractC0135a) this.f4202e) == abstractC0135a || ((AbstractC0135a) this.f4203f) == abstractC0135a);
        if (h(abstractC0135a)) {
            if (abstractC0135a == c0142h.f4159c) {
                c0142h.f4160d = null;
                c0142h.f4159c = null;
                c0142h.f4161e = true;
            }
            b(abstractC0135a);
            AbstractC0124a.t(abstractC0135a.f4044h == 1);
            abstractC0135a.f4039c.k();
            abstractC0135a.f4044h = 0;
            abstractC0135a.f4045i = null;
            abstractC0135a.f4046j = null;
            abstractC0135a.n = false;
            abstractC0135a.p();
            abstractC0135a.f4051q = null;
        }
    }

    public int c() {
        boolean h2 = h((AbstractC0135a) this.f4202e);
        AbstractC0135a abstractC0135a = (AbstractC0135a) this.f4203f;
        return (h2 ? 1 : 0) + ((abstractC0135a == null || !h(abstractC0135a)) ? 0 : 1);
    }

    public AbstractC0135a d(T t4) {
        q0.b0 b0Var;
        if (t4 != null && (b0Var = t4.f3990c[this.f4200c]) != null) {
            AbstractC0135a abstractC0135a = (AbstractC0135a) this.f4202e;
            if (abstractC0135a.f4045i == b0Var) {
                return abstractC0135a;
            }
            AbstractC0135a abstractC0135a2 = (AbstractC0135a) this.f4203f;
            if (abstractC0135a2 != null && abstractC0135a2.f4045i == b0Var) {
                return abstractC0135a2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r9.f4049m >= r2.e()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(T t4, AbstractC0135a abstractC0135a) {
        int i4 = this.f4200c;
        if (abstractC0135a != null) {
            q0.b0 b0Var = t4.f3990c[i4];
            q0.b0 b0Var2 = abstractC0135a.f4045i;
            if (b0Var2 != null) {
                if (b0Var2 == b0Var) {
                    if (b0Var != null && !abstractC0135a.l()) {
                        T t5 = t4.f4000m;
                        if (t4.f3994g.f4008g) {
                            if (t5 != null) {
                                if (t5.f3992e) {
                                    if (!(abstractC0135a instanceof C1409e)) {
                                        if (!(abstractC0135a instanceof k0.b)) {
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                T t6 = t4.f4000m;
                if (t6 == null || t6.f3990c[i4] != abstractC0135a.f4045i) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean f() {
        int i4 = this.f4201d;
        return i4 == 2 || i4 == 4 || i4 == 3;
    }

    public boolean g() {
        int i4 = this.f4201d;
        if (i4 == 0 || i4 == 2 || i4 == 4) {
            return h((AbstractC0135a) this.f4202e);
        }
        AbstractC0135a abstractC0135a = (AbstractC0135a) this.f4203f;
        abstractC0135a.getClass();
        return abstractC0135a.f4044h != 0;
    }

    public void i(boolean z) {
        if (z) {
            if (this.f4198a) {
                AbstractC0135a abstractC0135a = (AbstractC0135a) this.f4202e;
                AbstractC0124a.t(abstractC0135a.f4044h == 0);
                abstractC0135a.f4039c.k();
                abstractC0135a.t();
                this.f4198a = false;
                return;
            }
            return;
        }
        if (this.f4199b) {
            AbstractC0135a abstractC0135a2 = (AbstractC0135a) this.f4203f;
            abstractC0135a2.getClass();
            AbstractC0124a.t(abstractC0135a2.f4044h == 0);
            abstractC0135a2.f4039c.k();
            abstractC0135a2.t();
            this.f4199b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(AbstractC0135a abstractC0135a, T t4, t0.x xVar, C0142h c0142h) {
        int i4;
        AbstractC0135a abstractC0135a2 = (AbstractC0135a) this.f4202e;
        int i5 = this.f4200c;
        if (abstractC0135a == null || abstractC0135a.f4044h == 0 || (abstractC0135a == abstractC0135a2 && ((i4 = this.f4201d) == 2 || i4 == 4))) {
            return 1;
        }
        if (abstractC0135a == ((AbstractC0135a) this.f4203f) && this.f4201d == 3) {
            return 1;
        }
        Object[] objArr = abstractC0135a.f4045i != t4.f3990c[i5];
        boolean b4 = xVar.b(i5);
        if (!b4 || objArr != false) {
            if (!abstractC0135a.n) {
                t0.t tVar = xVar.f15386c[i5];
                int length = tVar != null ? tVar.length() : 0;
                C0097o[] c0097oArr = new C0097o[length];
                for (int i6 = 0; i6 < length; i6++) {
                    tVar.getClass();
                    c0097oArr[i6] = tVar.f(i6);
                }
                q0.b0 b0Var = t4.f3990c[i5];
                b0Var.getClass();
                abstractC0135a.A(c0097oArr, b0Var, t4.e(), t4.f4001p, t4.f3994g.f4002a);
                return 3;
            }
            if (!abstractC0135a.m()) {
                return 0;
            }
            a(abstractC0135a, c0142h);
            if (!b4 || f()) {
                i(abstractC0135a == abstractC0135a2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((AbstractC0135a) this.f4202e)) {
            i(true);
        }
        AbstractC0135a abstractC0135a = (AbstractC0135a) this.f4203f;
        if (abstractC0135a == null || abstractC0135a.f4044h != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i4;
        AbstractC0135a abstractC0135a = (AbstractC0135a) this.f4202e;
        int i5 = abstractC0135a.f4044h;
        if (i5 == 1 && this.f4201d != 4) {
            AbstractC0124a.t(i5 == 1);
            abstractC0135a.f4044h = 2;
            abstractC0135a.u();
            return;
        }
        AbstractC0135a abstractC0135a2 = (AbstractC0135a) this.f4203f;
        if (abstractC0135a2 == null || (i4 = abstractC0135a2.f4044h) != 1 || this.f4201d == 3) {
            return;
        }
        AbstractC0124a.t(i4 == 1);
        abstractC0135a2.f4044h = 2;
        abstractC0135a2.u();
    }
}
