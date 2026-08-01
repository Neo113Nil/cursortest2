package t;

import q.AbstractC0290e;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC0301d {

    /* renamed from: a, reason: collision with root package name */
    public int f3763a;

    /* renamed from: b, reason: collision with root package name */
    public s.d f3764b;

    /* renamed from: c, reason: collision with root package name */
    public l f3765c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3766e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3767f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3768g = false;
    public final f h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3769j = 1;

    public o(s.d dVar) {
        this.f3764b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f3750l.add(fVar2);
        fVar.f3746f = i;
        fVar2.f3749k.add(fVar);
    }

    public static f h(s.c cVar) {
        s.c cVar2 = cVar.f3573f;
        if (cVar2 == null) {
            return null;
        }
        int a2 = AbstractC0290e.a(cVar2.f3572e);
        s.d dVar = cVar2.d;
        if (a2 == 1) {
            return dVar.d.h;
        }
        if (a2 == 2) {
            return dVar.f3607e.h;
        }
        if (a2 == 3) {
            return dVar.d.i;
        }
        if (a2 == 4) {
            return dVar.f3607e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.f3607e.f3756k;
    }

    public static f i(s.c cVar, int i) {
        s.c cVar2 = cVar.f3573f;
        if (cVar2 == null) {
            return null;
        }
        s.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.f3607e;
        int a2 = AbstractC0290e.a(cVar2.f3572e);
        if (a2 == 1 || a2 == 2) {
            return oVar.h;
        }
        if (a2 == 3 || a2 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f3750l.add(fVar2);
        fVar.f3750l.add(this.f3766e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.f3749k.add(fVar);
        gVar.f3749k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            s.d dVar = this.f3764b;
            int i3 = dVar.f3633v;
            max = Math.max(dVar.f3632u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            s.d dVar2 = this.f3764b;
            int i4 = dVar2.f3636y;
            max = Math.max(dVar2.f3635x, i);
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
        if (this.f3766e.f3748j) {
            return r0.f3747g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3763a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(s.c cVar, s.c cVar2, int i) {
        f h = h(cVar);
        f h2 = h(cVar2);
        if (h.f3748j && h2.f3748j) {
            int e2 = cVar.e() + h.f3747g;
            int e3 = h2.f3747g - cVar2.e();
            int i2 = e3 - e2;
            g gVar = this.f3766e;
            if (!gVar.f3748j && this.d == 3) {
                int i3 = this.f3763a;
                if (i3 == 0) {
                    gVar.d(g(i2, i));
                } else if (i3 == 1) {
                    gVar.d(Math.min(g(gVar.f3751m, i), i2));
                } else if (i3 == 2) {
                    s.d dVar = this.f3764b;
                    s.d dVar2 = dVar.f3593T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.d : dVar2.f3607e).f3766e.f3748j) {
                            gVar.d(g((int) ((r6.f3747g * (i == 0 ? dVar.f3634w : dVar.f3637z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    s.d dVar3 = this.f3764b;
                    o oVar = dVar3.d;
                    if (oVar.d == 3 && oVar.f3763a == 3) {
                        m mVar = dVar3.f3607e;
                        if (mVar.d == 3) {
                        }
                    }
                    if (i == 0) {
                        oVar = dVar3.f3607e;
                    }
                    if (oVar.f3766e.f3748j) {
                        float f2 = dVar3.f3596W;
                        gVar.d(i == 1 ? (int) ((r6.f3747g / f2) + 0.5f) : (int) ((f2 * r6.f3747g) + 0.5f));
                    }
                }
            }
            if (gVar.f3748j) {
                int i4 = gVar.f3747g;
                f fVar = this.i;
                f fVar2 = this.h;
                if (i4 == i2) {
                    fVar2.d(e2);
                    fVar.d(e3);
                    return;
                }
                s.d dVar4 = this.f3764b;
                float f3 = i == 0 ? dVar4.f3606d0 : dVar4.f3608e0;
                if (h == h2) {
                    e2 = h.f3747g;
                    e3 = h2.f3747g;
                    f3 = 0.5f;
                }
                fVar2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                fVar.d(fVar2.f3747g + gVar.f3747g);
            }
        }
    }
}
