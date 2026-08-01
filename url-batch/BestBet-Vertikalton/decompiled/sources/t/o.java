package t;

import q.AbstractC0309e;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC0346d {

    /* renamed from: a, reason: collision with root package name */
    public int f4110a;

    /* renamed from: b, reason: collision with root package name */
    public s.d f4111b;

    /* renamed from: c, reason: collision with root package name */
    public l f4112c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final g f4113e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f4114f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4115g = false;
    public final f h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f4116j = 1;

    public o(s.d dVar) {
        this.f4111b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f4097l.add(fVar2);
        fVar.f4093f = i;
        fVar2.f4096k.add(fVar);
    }

    public static f h(s.c cVar) {
        s.c cVar2 = cVar.f3867f;
        if (cVar2 == null) {
            return null;
        }
        int a2 = AbstractC0309e.a(cVar2.f3866e);
        s.d dVar = cVar2.d;
        if (a2 == 1) {
            return dVar.d.h;
        }
        if (a2 == 2) {
            return dVar.f3901e.h;
        }
        if (a2 == 3) {
            return dVar.d.i;
        }
        if (a2 == 4) {
            return dVar.f3901e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.f3901e.f4103k;
    }

    public static f i(s.c cVar, int i) {
        s.c cVar2 = cVar.f3867f;
        if (cVar2 == null) {
            return null;
        }
        s.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.f3901e;
        int a2 = AbstractC0309e.a(cVar2.f3866e);
        if (a2 == 1 || a2 == 2) {
            return oVar.h;
        }
        if (a2 == 3 || a2 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f4097l.add(fVar2);
        fVar.f4097l.add(this.f4113e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.f4096k.add(fVar);
        gVar.f4096k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            s.d dVar = this.f4111b;
            int i3 = dVar.f3927v;
            max = Math.max(dVar.f3926u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            s.d dVar2 = this.f4111b;
            int i4 = dVar2.f3930y;
            max = Math.max(dVar2.f3929x, i);
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
        if (this.f4113e.f4095j) {
            return r0.f4094g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f4110a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(s.c cVar, s.c cVar2, int i) {
        f h = h(cVar);
        f h2 = h(cVar2);
        if (h.f4095j && h2.f4095j) {
            int e2 = cVar.e() + h.f4094g;
            int e3 = h2.f4094g - cVar2.e();
            int i2 = e3 - e2;
            g gVar = this.f4113e;
            if (!gVar.f4095j && this.d == 3) {
                int i3 = this.f4110a;
                if (i3 == 0) {
                    gVar.d(g(i2, i));
                } else if (i3 == 1) {
                    gVar.d(Math.min(g(gVar.f4098m, i), i2));
                } else if (i3 == 2) {
                    s.d dVar = this.f4111b;
                    s.d dVar2 = dVar.f3887T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.d : dVar2.f3901e).f4113e.f4095j) {
                            gVar.d(g((int) ((r6.f4094g * (i == 0 ? dVar.f3928w : dVar.f3931z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    s.d dVar3 = this.f4111b;
                    o oVar = dVar3.d;
                    if (oVar.d == 3 && oVar.f4110a == 3) {
                        m mVar = dVar3.f3901e;
                        if (mVar.d == 3) {
                        }
                    }
                    if (i == 0) {
                        oVar = dVar3.f3901e;
                    }
                    if (oVar.f4113e.f4095j) {
                        float f2 = dVar3.f3890W;
                        gVar.d(i == 1 ? (int) ((r6.f4094g / f2) + 0.5f) : (int) ((f2 * r6.f4094g) + 0.5f));
                    }
                }
            }
            if (gVar.f4095j) {
                int i4 = gVar.f4094g;
                f fVar = this.i;
                f fVar2 = this.h;
                if (i4 == i2) {
                    fVar2.d(e2);
                    fVar.d(e3);
                    return;
                }
                s.d dVar4 = this.f4111b;
                float f3 = i == 0 ? dVar4.f3900d0 : dVar4.f3902e0;
                if (h == h2) {
                    e2 = h.f4094g;
                    e3 = h2.f4094g;
                    f3 = 0.5f;
                }
                fVar2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                fVar.d(fVar2.f4094g + gVar.f4094g);
            }
        }
    }
}
