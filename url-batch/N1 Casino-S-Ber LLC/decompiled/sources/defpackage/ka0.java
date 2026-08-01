package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class ka0 implements ff {
    public int a;
    public ad b;
    public u00 c;
    public int d;
    public final xf e = new xf(this);
    public int f = 0;
    public boolean g = false;
    public final hf h = new hf(this);
    public final hf i = new hf(this);
    public int j = 1;

    public ka0(ad adVar) {
        this.b = adVar;
    }

    public static void b(hf hfVar, hf hfVar2, int i) {
        hfVar.l.add(hfVar2);
        hfVar.f = i;
        hfVar2.k.add(hfVar);
    }

    public static hf h(lc lcVar) {
        lc lcVar2 = lcVar.f;
        if (lcVar2 == null) {
            return null;
        }
        ad adVar = lcVar2.d;
        int h = d30.h(lcVar2.e);
        if (h == 1) {
            return adVar.d.h;
        }
        if (h == 2) {
            return adVar.e.h;
        }
        if (h == 3) {
            return adVar.d.i;
        }
        if (h == 4) {
            return adVar.e.i;
        }
        if (h != 5) {
            return null;
        }
        return adVar.e.k;
    }

    public static hf i(lc lcVar, int i) {
        lc lcVar2 = lcVar.f;
        if (lcVar2 == null) {
            return null;
        }
        ad adVar = lcVar2.d;
        ka0 ka0Var = i == 0 ? adVar.d : adVar.e;
        int h = d30.h(lcVar2.e);
        if (h == 1 || h == 2) {
            return ka0Var.h;
        }
        if (h == 3 || h == 4) {
            return ka0Var.i;
        }
        return null;
    }

    public final void c(hf hfVar, hf hfVar2, int i, xf xfVar) {
        hfVar.l.add(hfVar2);
        hfVar.l.add(this.e);
        hfVar.h = i;
        hfVar.i = xfVar;
        hfVar2.k.add(hfVar);
        xfVar.k.add(hfVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        ad adVar = this.b;
        if (i2 == 0) {
            int i3 = adVar.v;
            int max = Math.max(adVar.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = adVar.y;
            int max2 = Math.max(adVar.x, i);
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
    public final void l(lc lcVar, lc lcVar2, int i) {
        hf h = h(lcVar);
        hf h2 = h(lcVar2);
        if (h.j && h2.j) {
            int e = lcVar.e() + h.g;
            int e2 = h2.g - lcVar2.e();
            int i2 = e2 - e;
            xf xfVar = this.e;
            if (!xfVar.j && this.d == 3) {
                int i3 = this.a;
                if (i3 == 0) {
                    xfVar.d(g(i2, i));
                } else if (i3 == 1) {
                    xfVar.d(Math.min(g(xfVar.m, i), i2));
                } else if (i3 == 2) {
                    ad adVar = this.b;
                    ad adVar2 = adVar.T;
                    if (adVar2 != null) {
                        if ((i == 0 ? adVar2.d : adVar2.e).e.j) {
                            xfVar.d(g((int) ((r6.g * (i == 0 ? adVar.w : adVar.z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    ad adVar3 = this.b;
                    ka0 ka0Var = adVar3.d;
                    if (ka0Var.d == 3 && ka0Var.a == 3) {
                        i80 i80Var = adVar3.e;
                        if (i80Var.d == 3) {
                        }
                    }
                    if (i == 0) {
                        ka0Var = adVar3.e;
                    }
                    xf xfVar2 = ka0Var.e;
                    if (xfVar2.j) {
                        float f = adVar3.W;
                        int i4 = xfVar2.g;
                        xfVar.d(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                    }
                }
            }
            if (xfVar.j) {
                int i5 = xfVar.g;
                hf hfVar = this.i;
                hf hfVar2 = this.h;
                if (i5 == i2) {
                    hfVar2.d(e);
                    hfVar.d(e2);
                    return;
                }
                ad adVar4 = this.b;
                float f2 = i == 0 ? adVar4.d0 : adVar4.e0;
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f2 = 0.5f;
                }
                hfVar2.d((int) ((((e2 - e) - i5) * f2) + e + 0.5f));
                hfVar.d(hfVar2.g + xfVar.g);
            }
        }
    }
}
