package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class rd0 implements dh {
    public int a;
    public ae b;
    public z30 c;
    public int d;
    public final wh e = new wh(this);
    public int f = 0;
    public boolean g = false;
    public final fh h = new fh(this);
    public final fh i = new fh(this);
    public int j = 1;

    public rd0(ae aeVar) {
        this.b = aeVar;
    }

    public static void b(fh fhVar, fh fhVar2, int i) {
        fhVar.l.add(fhVar2);
        fhVar.f = i;
        fhVar2.k.add(fhVar);
    }

    public static fh h(ld ldVar) {
        ld ldVar2 = ldVar.f;
        if (ldVar2 == null) {
            return null;
        }
        ae aeVar = ldVar2.d;
        int j = f60.j(ldVar2.e);
        if (j == 1) {
            return aeVar.d.h;
        }
        if (j == 2) {
            return aeVar.e.h;
        }
        if (j == 3) {
            return aeVar.d.i;
        }
        if (j == 4) {
            return aeVar.e.i;
        }
        if (j != 5) {
            return null;
        }
        return aeVar.e.k;
    }

    public static fh i(ld ldVar, int i) {
        ld ldVar2 = ldVar.f;
        if (ldVar2 == null) {
            return null;
        }
        ae aeVar = ldVar2.d;
        rd0 rd0Var = i == 0 ? aeVar.d : aeVar.e;
        int j = f60.j(ldVar2.e);
        if (j == 1 || j == 2) {
            return rd0Var.h;
        }
        if (j == 3 || j == 4) {
            return rd0Var.i;
        }
        return null;
    }

    public final void c(fh fhVar, fh fhVar2, int i, wh whVar) {
        fhVar.l.add(fhVar2);
        fhVar.l.add(this.e);
        fhVar.h = i;
        fhVar.i = whVar;
        fhVar2.k.add(fhVar);
        whVar.k.add(fhVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        ae aeVar = this.b;
        if (i2 == 0) {
            int i3 = aeVar.v;
            int max = Math.max(aeVar.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = aeVar.y;
            int max2 = Math.max(aeVar.x, i);
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
    public final void l(ld ldVar, ld ldVar2, int i) {
        fh h = h(ldVar);
        fh h2 = h(ldVar2);
        if (h.j && h2.j) {
            int e = ldVar.e() + h.g;
            int e2 = h2.g - ldVar2.e();
            int i2 = e2 - e;
            wh whVar = this.e;
            if (!whVar.j && this.d == 3) {
                int i3 = this.a;
                if (i3 == 0) {
                    whVar.d(g(i2, i));
                } else if (i3 == 1) {
                    whVar.d(Math.min(g(whVar.m, i), i2));
                } else if (i3 == 2) {
                    ae aeVar = this.b;
                    ae aeVar2 = aeVar.T;
                    if (aeVar2 != null) {
                        if ((i == 0 ? aeVar2.d : aeVar2.e).e.j) {
                            whVar.d(g((int) ((r6.g * (i == 0 ? aeVar.w : aeVar.z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    ae aeVar3 = this.b;
                    rd0 rd0Var = aeVar3.d;
                    if (rd0Var.d == 3 && rd0Var.a == 3) {
                        tb0 tb0Var = aeVar3.e;
                        if (tb0Var.d == 3) {
                        }
                    }
                    if (i == 0) {
                        rd0Var = aeVar3.e;
                    }
                    wh whVar2 = rd0Var.e;
                    if (whVar2.j) {
                        float f = aeVar3.W;
                        int i4 = whVar2.g;
                        whVar.d(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                    }
                }
            }
            if (whVar.j) {
                int i5 = whVar.g;
                fh fhVar = this.i;
                fh fhVar2 = this.h;
                if (i5 == i2) {
                    fhVar2.d(e);
                    fhVar.d(e2);
                    return;
                }
                ae aeVar4 = this.b;
                float f2 = i == 0 ? aeVar4.d0 : aeVar4.e0;
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f2 = 0.5f;
                }
                fhVar2.d((int) ((((e2 - e) - i5) * f2) + e + 0.5f));
                fhVar.d(fhVar2.g + whVar.g);
            }
        }
    }
}
