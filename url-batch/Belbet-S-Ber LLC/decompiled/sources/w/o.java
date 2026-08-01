package w;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f3771a;

    /* renamed from: b, reason: collision with root package name */
    public v.d f3772b;

    /* renamed from: c, reason: collision with root package name */
    public l f3773c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3774e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3775f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3776g = false;
    public final f h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3777j = 1;

    public o(v.d dVar) {
        this.f3772b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f3758l.add(fVar2);
        fVar.f3754f = i;
        fVar2.f3757k.add(fVar);
    }

    public static f h(v.c cVar) {
        v.c cVar2 = cVar.f3609f;
        if (cVar2 == null) {
            return null;
        }
        v.d dVar = cVar2.d;
        int a5 = t.e.a(cVar2.f3608e);
        if (a5 == 1) {
            return dVar.d.h;
        }
        if (a5 == 2) {
            return dVar.f3617e.h;
        }
        if (a5 == 3) {
            return dVar.d.i;
        }
        if (a5 == 4) {
            return dVar.f3617e.i;
        }
        if (a5 != 5) {
            return null;
        }
        return dVar.f3617e.f3764k;
    }

    public static f i(v.c cVar, int i) {
        v.c cVar2 = cVar.f3609f;
        if (cVar2 == null) {
            return null;
        }
        v.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.f3617e;
        int a5 = t.e.a(cVar2.f3608e);
        if (a5 == 1 || a5 == 2) {
            return oVar.h;
        }
        if (a5 == 3 || a5 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f3758l.add(fVar2);
        fVar.f3758l.add(this.f3774e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.f3757k.add(fVar);
        gVar.f3757k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i4) {
        if (i4 == 0) {
            v.d dVar = this.f3772b;
            int i5 = dVar.f3643v;
            int max = Math.max(dVar.f3642u, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            v.d dVar2 = this.f3772b;
            int i6 = dVar2.f3646y;
            int max2 = Math.max(dVar2.f3645x, i);
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
        if (this.f3774e.f3756j) {
            return r0.f3755g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3771a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(v.c cVar, v.c cVar2, int i) {
        f h = h(cVar);
        f h5 = h(cVar2);
        if (h.f3756j && h5.f3756j) {
            int e4 = cVar.e() + h.f3755g;
            int e5 = h5.f3755g - cVar2.e();
            int i4 = e5 - e4;
            g gVar = this.f3774e;
            if (!gVar.f3756j && this.d == 3) {
                int i5 = this.f3771a;
                if (i5 == 0) {
                    gVar.d(g(i4, i));
                } else if (i5 == 1) {
                    gVar.d(Math.min(g(gVar.f3759m, i), i4));
                } else if (i5 == 2) {
                    v.d dVar = this.f3772b;
                    v.d dVar2 = dVar.T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.d : dVar2.f3617e).f3774e.f3756j) {
                            gVar.d(g((int) ((r6.f3755g * (i == 0 ? dVar.f3644w : dVar.f3647z)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    v.d dVar3 = this.f3772b;
                    o oVar = dVar3.d;
                    if (oVar.d == 3 && oVar.f3771a == 3) {
                        m mVar = dVar3.f3617e;
                        if (mVar.d == 3) {
                        }
                    }
                    if (i == 0) {
                        oVar = dVar3.f3617e;
                    }
                    if (oVar.f3774e.f3756j) {
                        float f5 = dVar3.W;
                        gVar.d(i == 1 ? (int) ((r6.f3755g / f5) + 0.5f) : (int) ((f5 * r6.f3755g) + 0.5f));
                    }
                }
            }
            if (gVar.f3756j) {
                int i6 = gVar.f3755g;
                f fVar = this.i;
                f fVar2 = this.h;
                if (i6 == i4) {
                    fVar2.d(e4);
                    fVar.d(e5);
                    return;
                }
                float f6 = i == 0 ? this.f3772b.d0 : this.f3772b.f3618e0;
                if (h == h5) {
                    e4 = h.f3755g;
                    e5 = h5.f3755g;
                    f6 = 0.5f;
                }
                fVar2.d((int) ((((e5 - e4) - i6) * f6) + e4 + 0.5f));
                fVar.d(fVar2.f3755g + gVar.f3755g);
            }
        }
    }
}
