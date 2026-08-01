package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class ra0 implements ef {
    public int a;
    public ed b;
    public k10 c;
    public int d;
    public final pf e = new pf(this);
    public int f = 0;
    public boolean g = false;
    public final gf h = new gf(this);
    public final gf i = new gf(this);
    public int j = 1;

    public ra0(ed edVar) {
        this.b = edVar;
    }

    public static void b(gf gfVar, gf gfVar2, int i) {
        gfVar.l.add(gfVar2);
        gfVar.f = i;
        gfVar2.k.add(gfVar);
    }

    public static gf h(pc pcVar) {
        pc pcVar2 = pcVar.f;
        if (pcVar2 == null) {
            return null;
        }
        ed edVar = pcVar2.d;
        int i = o30.i(pcVar2.e);
        if (i == 1) {
            return edVar.d.h;
        }
        if (i == 2) {
            return edVar.e.h;
        }
        if (i == 3) {
            return edVar.d.i;
        }
        if (i == 4) {
            return edVar.e.i;
        }
        if (i != 5) {
            return null;
        }
        return edVar.e.k;
    }

    public static gf i(pc pcVar, int i) {
        pc pcVar2 = pcVar.f;
        if (pcVar2 == null) {
            return null;
        }
        ed edVar = pcVar2.d;
        ra0 ra0Var = i == 0 ? edVar.d : edVar.e;
        int i2 = o30.i(pcVar2.e);
        if (i2 == 1 || i2 == 2) {
            return ra0Var.h;
        }
        if (i2 == 3 || i2 == 4) {
            return ra0Var.i;
        }
        return null;
    }

    public final void c(gf gfVar, gf gfVar2, int i, pf pfVar) {
        gfVar.l.add(gfVar2);
        gfVar.l.add(this.e);
        gfVar.h = i;
        gfVar.i = pfVar;
        gfVar2.k.add(gfVar);
        pfVar.k.add(gfVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        ed edVar = this.b;
        if (i2 == 0) {
            int i3 = edVar.v;
            int max = Math.max(edVar.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = edVar.y;
            int max2 = Math.max(edVar.x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(pc pcVar, pc pcVar2, int i) {
        gf h = h(pcVar);
        gf h2 = h(pcVar2);
        if (h.j && h2.j) {
            int e = pcVar.e() + h.g;
            int e2 = h2.g - pcVar2.e();
            int i2 = e2 - e;
            pf pfVar = this.e;
            if (!pfVar.j && this.d == 3) {
                int i3 = this.a;
                if (i3 == 0) {
                    pfVar.d(g(i2, i));
                } else if (i3 == 1) {
                    pfVar.d(Math.min(g(pfVar.m, i), i2));
                } else if (i3 == 2) {
                    ed edVar = this.b;
                    ed edVar2 = edVar.T;
                    if (edVar2 != null) {
                        if ((i == 0 ? edVar2.d : edVar2.e).e.j) {
                            pfVar.d(g((int) ((r6.g * (i == 0 ? edVar.w : edVar.z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    ed edVar3 = this.b;
                    ra0 ra0Var = edVar3.d;
                    if (ra0Var.d == 3 && ra0Var.a == 3) {
                        p80 p80Var = edVar3.e;
                        if (p80Var.d == 3) {
                        }
                    }
                    if (i == 0) {
                        ra0Var = edVar3.e;
                    }
                    pf pfVar2 = ra0Var.e;
                    if (pfVar2.j) {
                        float f = edVar3.W;
                        int i4 = pfVar2.g;
                        pfVar.d(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                    }
                }
            }
            if (pfVar.j) {
                int i5 = pfVar.g;
                gf gfVar = this.i;
                gf gfVar2 = this.h;
                if (i5 == i2) {
                    gfVar2.d(e);
                    gfVar.d(e2);
                    return;
                }
                ed edVar4 = this.b;
                float f2 = i == 0 ? edVar4.d0 : edVar4.e0;
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f2 = 0.5f;
                }
                gfVar2.d((int) ((((e2 - e) - i5) * f2) + e + 0.5f));
                gfVar.d(gfVar2.g + pfVar.g);
            }
        }
    }
}
