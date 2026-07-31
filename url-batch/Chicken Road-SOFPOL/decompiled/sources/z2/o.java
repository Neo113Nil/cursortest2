package z2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f9161a;

    /* renamed from: b, reason: collision with root package name */
    public y2.d f9162b;

    /* renamed from: c, reason: collision with root package name */
    public l f9163c;

    /* renamed from: d, reason: collision with root package name */
    public int f9164d;

    /* renamed from: e, reason: collision with root package name */
    public final g f9165e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f9166f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9167g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f9168h = new f(this);
    public final f i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f9169j = 1;

    public o(y2.d dVar) {
        this.f9162b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f9147l.add(fVar2);
        fVar.f9142f = i;
        fVar2.f9146k.add(fVar);
    }

    public static f h(y2.c cVar) {
        y2.c cVar2 = cVar.f8744f;
        if (cVar2 == null) {
            return null;
        }
        y2.d dVar = cVar2.f8742d;
        int a8 = w2.e.a(cVar2.f8743e);
        if (a8 == 1) {
            return dVar.f8753d.f9168h;
        }
        if (a8 == 2) {
            return dVar.f8755e.f9168h;
        }
        if (a8 == 3) {
            return dVar.f8753d.i;
        }
        if (a8 == 4) {
            return dVar.f8755e.i;
        }
        if (a8 != 5) {
            return null;
        }
        return dVar.f8755e.f9153k;
    }

    public static f i(y2.c cVar, int i) {
        y2.c cVar2 = cVar.f8744f;
        if (cVar2 == null) {
            return null;
        }
        y2.d dVar = cVar2.f8742d;
        o oVar = i == 0 ? dVar.f8753d : dVar.f8755e;
        int a8 = w2.e.a(cVar2.f8743e);
        if (a8 == 1 || a8 == 2) {
            return oVar.f9168h;
        }
        if (a8 == 3 || a8 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f9147l.add(fVar2);
        fVar.f9147l.add(this.f9165e);
        fVar.f9144h = i;
        fVar.i = gVar;
        fVar2.f9146k.add(fVar);
        gVar.f9146k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i8) {
        if (i8 == 0) {
            y2.d dVar = this.f9162b;
            int i9 = dVar.f8783v;
            int max = Math.max(dVar.f8782u, i);
            if (i9 > 0) {
                max = Math.min(i9, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            y2.d dVar2 = this.f9162b;
            int i10 = dVar2.f8786y;
            int max2 = Math.max(dVar2.f8785x, i);
            if (i10 > 0) {
                max2 = Math.min(i10, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f9165e.f9145j) {
            return r0.f9143g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f9161a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(y2.c cVar, y2.c cVar2, int i) {
        f h8 = h(cVar);
        f h9 = h(cVar2);
        if (h8.f9145j && h9.f9145j) {
            int e8 = cVar.e() + h8.f9143g;
            int e9 = h9.f9143g - cVar2.e();
            int i8 = e9 - e8;
            g gVar = this.f9165e;
            if (!gVar.f9145j && this.f9164d == 3) {
                int i9 = this.f9161a;
                if (i9 == 0) {
                    gVar.d(g(i8, i));
                } else if (i9 == 1) {
                    gVar.d(Math.min(g(gVar.f9148m, i), i8));
                } else if (i9 == 2) {
                    y2.d dVar = this.f9162b;
                    y2.d dVar2 = dVar.T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.f8753d : dVar2.f8755e).f9165e.f9145j) {
                            gVar.d(g((int) ((r6.f9143g * (i == 0 ? dVar.f8784w : dVar.f8787z)) + 0.5f), i));
                        }
                    }
                } else if (i9 == 3) {
                    y2.d dVar3 = this.f9162b;
                    o oVar = dVar3.f8753d;
                    if (oVar.f9164d == 3 && oVar.f9161a == 3) {
                        m mVar = dVar3.f8755e;
                        if (mVar.f9164d == 3) {
                        }
                    }
                    if (i == 0) {
                        oVar = dVar3.f8755e;
                    }
                    if (oVar.f9165e.f9145j) {
                        float f6 = dVar3.W;
                        gVar.d(i == 1 ? (int) ((r6.f9143g / f6) + 0.5f) : (int) ((f6 * r6.f9143g) + 0.5f));
                    }
                }
            }
            if (gVar.f9145j) {
                int i10 = gVar.f9143g;
                f fVar = this.i;
                f fVar2 = this.f9168h;
                if (i10 == i8) {
                    fVar2.d(e8);
                    fVar.d(e9);
                    return;
                }
                float f8 = i == 0 ? this.f9162b.f8754d0 : this.f9162b.f8756e0;
                if (h8 == h9) {
                    e8 = h8.f9143g;
                    e9 = h9.f9143g;
                    f8 = 0.5f;
                }
                fVar2.d((int) ((((e9 - e8) - i10) * f8) + e8 + 0.5f));
                fVar.d(fVar2.f9143g + gVar.f9143g);
            }
        }
    }
}
