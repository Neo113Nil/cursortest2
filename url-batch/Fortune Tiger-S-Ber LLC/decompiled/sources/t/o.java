package t;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f3354a;

    /* renamed from: b, reason: collision with root package name */
    public s.d f3355b;
    public l c;

    /* renamed from: d, reason: collision with root package name */
    public int f3356d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3357e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3358f = 0;
    public boolean g = false;
    public final f h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f3359i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3360j = 1;

    public o(s.d dVar) {
        this.f3355b = dVar;
    }

    public static void b(f fVar, f fVar2, int i4) {
        fVar.f3341l.add(fVar2);
        fVar.f3337f = i4;
        fVar2.f3340k.add(fVar);
    }

    public static f h(s.c cVar) {
        s.c cVar2 = cVar.f3231f;
        if (cVar2 == null) {
            return null;
        }
        s.d dVar = cVar2.f3229d;
        int a4 = q.e.a(cVar2.f3230e);
        if (a4 == 1) {
            return dVar.f3237d.h;
        }
        if (a4 == 2) {
            return dVar.f3239e.h;
        }
        if (a4 == 3) {
            return dVar.f3237d.f3359i;
        }
        if (a4 == 4) {
            return dVar.f3239e.f3359i;
        }
        if (a4 != 5) {
            return null;
        }
        return dVar.f3239e.f3347k;
    }

    public static f i(s.c cVar, int i4) {
        s.c cVar2 = cVar.f3231f;
        if (cVar2 == null) {
            return null;
        }
        s.d dVar = cVar2.f3229d;
        o oVar = i4 == 0 ? dVar.f3237d : dVar.f3239e;
        int a4 = q.e.a(cVar2.f3230e);
        if (a4 == 1 || a4 == 2) {
            return oVar.h;
        }
        if (a4 == 3 || a4 == 4) {
            return oVar.f3359i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i4, g gVar) {
        fVar.f3341l.add(fVar2);
        fVar.f3341l.add(this.f3357e);
        fVar.h = i4;
        fVar.f3338i = gVar;
        fVar2.f3340k.add(fVar);
        gVar.f3340k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i4, int i5) {
        if (i5 == 0) {
            s.d dVar = this.f3355b;
            int i6 = dVar.f3265v;
            int max = Math.max(dVar.f3264u, i4);
            if (i6 > 0) {
                max = Math.min(i6, i4);
            }
            if (max != i4) {
                return max;
            }
        } else {
            s.d dVar2 = this.f3355b;
            int i7 = dVar2.f3268y;
            int max2 = Math.max(dVar2.f3267x, i4);
            if (i7 > 0) {
                max2 = Math.min(i7, i4);
            }
            if (max2 != i4) {
                return max2;
            }
        }
        return i4;
    }

    public long j() {
        if (this.f3357e.f3339j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3354a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(s.c cVar, s.c cVar2, int i4) {
        f h = h(cVar);
        f h4 = h(cVar2);
        if (h.f3339j && h4.f3339j) {
            int e4 = cVar.e() + h.g;
            int e5 = h4.g - cVar2.e();
            int i5 = e5 - e4;
            g gVar = this.f3357e;
            if (!gVar.f3339j && this.f3356d == 3) {
                int i6 = this.f3354a;
                if (i6 == 0) {
                    gVar.d(g(i5, i4));
                } else if (i6 == 1) {
                    gVar.d(Math.min(g(gVar.f3342m, i4), i5));
                } else if (i6 == 2) {
                    s.d dVar = this.f3355b;
                    s.d dVar2 = dVar.T;
                    if (dVar2 != null) {
                        if ((i4 == 0 ? dVar2.f3237d : dVar2.f3239e).f3357e.f3339j) {
                            gVar.d(g((int) ((r6.g * (i4 == 0 ? dVar.f3266w : dVar.f3269z)) + 0.5f), i4));
                        }
                    }
                } else if (i6 == 3) {
                    s.d dVar3 = this.f3355b;
                    o oVar = dVar3.f3237d;
                    if (oVar.f3356d == 3 && oVar.f3354a == 3) {
                        m mVar = dVar3.f3239e;
                        if (mVar.f3356d == 3) {
                        }
                    }
                    if (i4 == 0) {
                        oVar = dVar3.f3239e;
                    }
                    if (oVar.f3357e.f3339j) {
                        float f4 = dVar3.W;
                        gVar.d(i4 == 1 ? (int) ((r6.g / f4) + 0.5f) : (int) ((f4 * r6.g) + 0.5f));
                    }
                }
            }
            if (gVar.f3339j) {
                int i7 = gVar.g;
                f fVar = this.f3359i;
                f fVar2 = this.h;
                if (i7 == i5) {
                    fVar2.d(e4);
                    fVar.d(e5);
                    return;
                }
                float f5 = i4 == 0 ? this.f3355b.f3238d0 : this.f3355b.f3240e0;
                if (h == h4) {
                    e4 = h.g;
                    e5 = h4.g;
                    f5 = 0.5f;
                }
                fVar2.d((int) ((((e5 - e4) - i7) * f5) + e4 + 0.5f));
                fVar.d(fVar2.g + gVar.g);
            }
        }
    }
}
