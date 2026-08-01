package w;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f3549a;

    /* renamed from: b, reason: collision with root package name */
    public v.d f3550b;

    /* renamed from: c, reason: collision with root package name */
    public l f3551c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3552e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3553f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3554g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f3555h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3556j = 1;

    public o(v.d dVar) {
        this.f3550b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f3536l.add(fVar2);
        fVar.f3531f = i;
        fVar2.f3535k.add(fVar);
    }

    public static f h(v.c cVar) {
        v.c cVar2 = cVar.f3388f;
        if (cVar2 == null) {
            return null;
        }
        v.d dVar = cVar2.d;
        int a2 = t.e.a(cVar2.f3387e);
        if (a2 == 1) {
            return dVar.d.f3555h;
        }
        if (a2 == 2) {
            return dVar.f3397e.f3555h;
        }
        if (a2 == 3) {
            return dVar.d.i;
        }
        if (a2 == 4) {
            return dVar.f3397e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.f3397e.f3542k;
    }

    public static f i(v.c cVar, int i) {
        v.c cVar2 = cVar.f3388f;
        if (cVar2 == null) {
            return null;
        }
        v.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.f3397e;
        int a2 = t.e.a(cVar2.f3387e);
        if (a2 == 1 || a2 == 2) {
            return oVar.f3555h;
        }
        if (a2 == 3 || a2 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f3536l.add(fVar2);
        fVar.f3536l.add(this.f3552e);
        fVar.f3533h = i;
        fVar.i = gVar;
        fVar2.f3535k.add(fVar);
        gVar.f3535k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i4) {
        if (i4 == 0) {
            v.d dVar = this.f3550b;
            int i5 = dVar.f3424v;
            int max = Math.max(dVar.f3423u, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            v.d dVar2 = this.f3550b;
            int i6 = dVar2.f3427y;
            int max2 = Math.max(dVar2.f3426x, i);
            if (i6 > 0) {
                max2 = Math.min(i6, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f3552e.f3534j) {
            return r0.f3532g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3549a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(v.c cVar, v.c cVar2, int i) {
        f h4 = h(cVar);
        f h5 = h(cVar2);
        if (h4.f3534j && h5.f3534j) {
            int e4 = cVar.e() + h4.f3532g;
            int e5 = h5.f3532g - cVar2.e();
            int i4 = e5 - e4;
            g gVar = this.f3552e;
            if (!gVar.f3534j && this.d == 3) {
                int i5 = this.f3549a;
                if (i5 == 0) {
                    gVar.d(g(i4, i));
                } else if (i5 == 1) {
                    gVar.d(Math.min(g(gVar.f3537m, i), i4));
                } else if (i5 == 2) {
                    v.d dVar = this.f3550b;
                    v.d dVar2 = dVar.T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.d : dVar2.f3397e).f3552e.f3534j) {
                            gVar.d(g((int) ((r6.f3532g * (i == 0 ? dVar.f3425w : dVar.f3428z)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    v.d dVar3 = this.f3550b;
                    o oVar = dVar3.d;
                    if (oVar.d == 3 && oVar.f3549a == 3) {
                        m mVar = dVar3.f3397e;
                        if (mVar.d == 3) {
                        }
                    }
                    if (i == 0) {
                        oVar = dVar3.f3397e;
                    }
                    if (oVar.f3552e.f3534j) {
                        float f2 = dVar3.W;
                        gVar.d(i == 1 ? (int) ((r6.f3532g / f2) + 0.5f) : (int) ((f2 * r6.f3532g) + 0.5f));
                    }
                }
            }
            if (gVar.f3534j) {
                int i6 = gVar.f3532g;
                f fVar = this.i;
                f fVar2 = this.f3555h;
                if (i6 == i4) {
                    fVar2.d(e4);
                    fVar.d(e5);
                    return;
                }
                float f4 = i == 0 ? this.f3550b.d0 : this.f3550b.f3398e0;
                if (h4 == h5) {
                    e4 = h4.f3532g;
                    e5 = h5.f3532g;
                    f4 = 0.5f;
                }
                fVar2.d((int) ((((e5 - e4) - i6) * f4) + e4 + 0.5f));
                fVar.d(fVar2.f3532g + gVar.f3532g);
            }
        }
    }
}
