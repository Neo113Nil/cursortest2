package t;

import q.AbstractC0287e;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC0300d {

    /* renamed from: a, reason: collision with root package name */
    public int f3795a;

    /* renamed from: b, reason: collision with root package name */
    public s.d f3796b;

    /* renamed from: c, reason: collision with root package name */
    public l f3797c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3798e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3799f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3800g = false;
    public final f h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3801j = 1;

    public o(s.d dVar) {
        this.f3796b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f3782l.add(fVar2);
        fVar.f3778f = i;
        fVar2.f3781k.add(fVar);
    }

    public static f h(s.c cVar) {
        s.c cVar2 = cVar.f3547f;
        if (cVar2 == null) {
            return null;
        }
        int a2 = AbstractC0287e.a(cVar2.f3546e);
        s.d dVar = cVar2.d;
        if (a2 == 1) {
            return dVar.d.h;
        }
        if (a2 == 2) {
            return dVar.f3581e.h;
        }
        if (a2 == 3) {
            return dVar.d.i;
        }
        if (a2 == 4) {
            return dVar.f3581e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.f3581e.f3788k;
    }

    public static f i(s.c cVar, int i) {
        s.c cVar2 = cVar.f3547f;
        if (cVar2 == null) {
            return null;
        }
        s.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.f3581e;
        int a2 = AbstractC0287e.a(cVar2.f3546e);
        if (a2 == 1 || a2 == 2) {
            return oVar.h;
        }
        if (a2 == 3 || a2 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f3782l.add(fVar2);
        fVar.f3782l.add(this.f3798e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.f3781k.add(fVar);
        gVar.f3781k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            s.d dVar = this.f3796b;
            int i3 = dVar.f3606v;
            max = Math.max(dVar.f3605u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            s.d dVar2 = this.f3796b;
            int i4 = dVar2.f3609y;
            max = Math.max(dVar2.f3608x, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long j() {
        if (this.f3798e.f3780j) {
            return r0.f3779g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3795a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(s.c cVar, s.c cVar2, int i) {
        f h = h(cVar);
        f h2 = h(cVar2);
        if (h.f3780j && h2.f3780j) {
            int e2 = cVar.e() + h.f3779g;
            int e3 = h2.f3779g - cVar2.e();
            int i2 = e3 - e2;
            g gVar = this.f3798e;
            if (!gVar.f3780j && this.d == 3) {
                int i3 = this.f3795a;
                if (i3 == 0) {
                    gVar.d(g(i2, i));
                } else if (i3 == 1) {
                    gVar.d(Math.min(g(gVar.f3783m, i), i2));
                } else if (i3 == 2) {
                    s.d dVar = this.f3796b;
                    s.d dVar2 = dVar.f3567T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.d : dVar2.f3581e).f3798e.f3780j) {
                            gVar.d(g((int) ((r6.f3779g * (i == 0 ? dVar.f3607w : dVar.f3610z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    s.d dVar3 = this.f3796b;
                    o oVar = dVar3.d;
                    if (oVar.d == 3 && oVar.f3795a == 3) {
                        m mVar = dVar3.f3581e;
                        if (mVar.d == 3) {
                        }
                    }
                    if (i == 0) {
                        oVar = dVar3.f3581e;
                    }
                    if (oVar.f3798e.f3780j) {
                        float f2 = dVar3.f3570W;
                        gVar.d(i == 1 ? (int) ((r6.f3779g / f2) + 0.5f) : (int) ((f2 * r6.f3779g) + 0.5f));
                    }
                }
            }
            if (gVar.f3780j) {
                int i4 = gVar.f3779g;
                f fVar = this.i;
                f fVar2 = this.h;
                if (i4 == i2) {
                    fVar2.d(e2);
                    fVar.d(e3);
                    return;
                }
                s.d dVar4 = this.f3796b;
                float f3 = i == 0 ? dVar4.f3580d0 : dVar4.f3582e0;
                if (h == h2) {
                    e2 = h.f3779g;
                    e3 = h2.f3779g;
                    f3 = 0.5f;
                }
                fVar2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                fVar.d(fVar2.f3779g + gVar.f3779g);
            }
        }
    }
}
