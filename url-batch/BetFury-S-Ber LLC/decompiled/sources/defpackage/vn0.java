package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class vn0 implements jj {
    public int a;
    public rf b;
    public bb0 c;
    public qf d;
    public final ck e = new ck(this);
    public int f = 0;
    public boolean g = false;
    public final mj h = new mj(this);
    public final mj i = new mj(this);
    public un0 j = un0.NONE;

    public vn0(rf rfVar) {
        this.b = rfVar;
    }

    public static void b(mj mjVar, mj mjVar2, int i) {
        mjVar.l.add(mjVar2);
        mjVar.f = i;
        mjVar2.k.add(mjVar);
    }

    public static mj h(xe xeVar) {
        xe xeVar2 = xeVar.f;
        if (xeVar2 == null) {
            return null;
        }
        rf rfVar = xeVar2.d;
        int i = tn0.a[xeVar2.e.ordinal()];
        if (i == 1) {
            return rfVar.d.h;
        }
        if (i == 2) {
            return rfVar.d.i;
        }
        if (i == 3) {
            return rfVar.e.h;
        }
        if (i == 4) {
            return rfVar.e.k;
        }
        if (i != 5) {
            return null;
        }
        return rfVar.e.i;
    }

    public static mj i(xe xeVar, int i) {
        xe xeVar2 = xeVar.f;
        if (xeVar2 == null) {
            return null;
        }
        rf rfVar = xeVar2.d;
        vn0 vn0Var = i == 0 ? rfVar.d : rfVar.e;
        int i2 = tn0.a[xeVar2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return vn0Var.i;
        }
        return vn0Var.h;
    }

    public final void c(mj mjVar, mj mjVar2, int i, ck ckVar) {
        mjVar.l.add(mjVar2);
        mjVar.l.add(this.e);
        mjVar.h = i;
        mjVar.i = ckVar;
        mjVar2.k.add(mjVar);
        ckVar.k.add(mjVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        rf rfVar = this.b;
        if (i2 == 0) {
            int i3 = rfVar.v;
            int max = Math.max(rfVar.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = rfVar.y;
            int max2 = Math.max(rfVar.x, i);
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.a == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(xe xeVar, xe xeVar2, int i) {
        mj h = h(xeVar);
        mj h2 = h(xeVar2);
        if (h.j && h2.j) {
            int e = xeVar.e() + h.g;
            int e2 = h2.g - xeVar2.e();
            int i2 = e2 - e;
            ck ckVar = this.e;
            if (!ckVar.j) {
                qf qfVar = this.d;
                qf qfVar2 = qf.MATCH_CONSTRAINT;
                if (qfVar == qfVar2) {
                    int i3 = this.a;
                    if (i3 == 0) {
                        ckVar.d(g(i2, i));
                    } else if (i3 == 1) {
                        ckVar.d(Math.min(g(ckVar.m, i), i2));
                    } else if (i3 == 2) {
                        rf rfVar = this.b;
                        rf rfVar2 = rfVar.U;
                        if (rfVar2 != null) {
                            if ((i == 0 ? rfVar2.d : rfVar2.e).e.j) {
                                ckVar.d(g((int) ((r6.g * (i == 0 ? rfVar.w : rfVar.z)) + 0.5f), i));
                            }
                        }
                    } else if (i3 == 3) {
                        rf rfVar3 = this.b;
                        vn0 vn0Var = rfVar3.d;
                        if (vn0Var.d == qfVar2 && vn0Var.a == 3) {
                            rl0 rl0Var = rfVar3.e;
                            if (rl0Var.d == qfVar2) {
                            }
                        }
                        if (i == 0) {
                            vn0Var = rfVar3.e;
                        }
                        ck ckVar2 = vn0Var.e;
                        if (ckVar2.j) {
                            float f = rfVar3.X;
                            int i4 = ckVar2.g;
                            ckVar.d(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                        }
                    }
                }
            }
            if (ckVar.j) {
                int i5 = ckVar.g;
                mj mjVar = this.i;
                mj mjVar2 = this.h;
                if (i5 == i2) {
                    mjVar2.d(e);
                    mjVar.d(e2);
                    return;
                }
                rf rfVar4 = this.b;
                float f2 = i == 0 ? rfVar4.e0 : rfVar4.f0;
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f2 = 0.5f;
                }
                mjVar2.d((int) ((((e2 - e) - i5) * f2) + e + 0.5f));
                mjVar.d(mjVar2.g + ckVar.g);
            }
        }
    }
}
