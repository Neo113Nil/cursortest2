package u;

import r.AbstractC0290e;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC0303d {

    /* renamed from: a, reason: collision with root package name */
    public int f3943a;

    /* renamed from: b, reason: collision with root package name */
    public t.d f3944b;

    /* renamed from: c, reason: collision with root package name */
    public l f3945c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3946e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3947f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3948g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f3949h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3950j = 1;

    public o(t.d dVar) {
        this.f3944b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f3930l.add(fVar2);
        fVar.f3925f = i;
        fVar2.f3929k.add(fVar);
    }

    public static f h(t.c cVar) {
        t.c cVar2 = cVar.f3748f;
        if (cVar2 == null) {
            return null;
        }
        int a2 = AbstractC0290e.a(cVar2.f3747e);
        t.d dVar = cVar2.d;
        if (a2 == 1) {
            return dVar.d.f3949h;
        }
        if (a2 == 2) {
            return dVar.f3783e.f3949h;
        }
        if (a2 == 3) {
            return dVar.d.i;
        }
        if (a2 == 4) {
            return dVar.f3783e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.f3783e.f3936k;
    }

    public static f i(t.c cVar, int i) {
        t.c cVar2 = cVar.f3748f;
        if (cVar2 == null) {
            return null;
        }
        t.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.f3783e;
        int a2 = AbstractC0290e.a(cVar2.f3747e);
        if (a2 == 1 || a2 == 2) {
            return oVar.f3949h;
        }
        if (a2 == 3 || a2 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f3930l.add(fVar2);
        fVar.f3930l.add(this.f3946e);
        fVar.f3927h = i;
        fVar.i = gVar;
        fVar2.f3929k.add(fVar);
        gVar.f3929k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            t.d dVar = this.f3944b;
            int i3 = dVar.f3809v;
            max = Math.max(dVar.f3808u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            t.d dVar2 = this.f3944b;
            int i4 = dVar2.f3812y;
            max = Math.max(dVar2.f3811x, i);
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
        if (this.f3946e.f3928j) {
            return r0.f3926g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3943a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(t.c cVar, t.c cVar2, int i) {
        f h2 = h(cVar);
        f h3 = h(cVar2);
        if (h2.f3928j && h3.f3928j) {
            int e2 = cVar.e() + h2.f3926g;
            int e3 = h3.f3926g - cVar2.e();
            int i2 = e3 - e2;
            g gVar = this.f3946e;
            if (!gVar.f3928j && this.d == 3) {
                int i3 = this.f3943a;
                if (i3 == 0) {
                    gVar.d(g(i2, i));
                } else if (i3 == 1) {
                    gVar.d(Math.min(g(gVar.f3931m, i), i2));
                } else if (i3 == 2) {
                    t.d dVar = this.f3944b;
                    t.d dVar2 = dVar.f3769T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.d : dVar2.f3783e).f3946e.f3928j) {
                            gVar.d(g((int) ((r6.f3926g * (i == 0 ? dVar.f3810w : dVar.f3813z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    t.d dVar3 = this.f3944b;
                    o oVar = dVar3.d;
                    if (oVar.d == 3 && oVar.f3943a == 3) {
                        m mVar = dVar3.f3783e;
                        if (mVar.d == 3) {
                        }
                    }
                    if (i == 0) {
                        oVar = dVar3.f3783e;
                    }
                    if (oVar.f3946e.f3928j) {
                        float f2 = dVar3.f3772W;
                        gVar.d(i == 1 ? (int) ((r6.f3926g / f2) + 0.5f) : (int) ((f2 * r6.f3926g) + 0.5f));
                    }
                }
            }
            if (gVar.f3928j) {
                int i4 = gVar.f3926g;
                f fVar = this.i;
                f fVar2 = this.f3949h;
                if (i4 == i2) {
                    fVar2.d(e2);
                    fVar.d(e3);
                    return;
                }
                t.d dVar4 = this.f3944b;
                float f3 = i == 0 ? dVar4.f3782d0 : dVar4.f3784e0;
                if (h2 == h3) {
                    e2 = h2.f3926g;
                    e3 = h3.f3926g;
                    f3 = 0.5f;
                }
                fVar2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                fVar.d(fVar2.f3926g + gVar.f3926g);
            }
        }
    }
}
