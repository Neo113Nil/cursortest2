package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mr1 extends ul1 implements rz2, hr1 {
    public hr1 A;
    public js0 B;
    public mr1 C;
    public final String D;

    public mr1(hr1 hr1Var, js0 js0Var) {
        this.A = hr1Var;
        this.B = js0Var == null ? new js0(6) : js0Var;
        this.D = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final a50 G0() {
        mr1 mr1Var = this.z ? (mr1) nk2.j(this) : null;
        a50 G0 = mr1Var != null ? mr1Var.G0() : null;
        if (G0 != null && j8.J(G0)) {
            return G0;
        }
        a50 a50Var = (a50) this.B.p;
        if (a50Var != null) {
            return a50Var;
        }
        lh.g("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.hr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N(long j, long j2, o30 o30Var) {
        kr1 kr1Var;
        int i;
        long j3;
        long j4;
        boolean z;
        mr1 mr1Var;
        long j5;
        long j6;
        if (o30Var instanceof kr1) {
            kr1Var = (kr1) o30Var;
            int i2 = kr1Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kr1Var.q = i2 - Integer.MIN_VALUE;
                kr1 kr1Var2 = kr1Var;
                Object obj = kr1Var2.o;
                b50 b50Var = b50.m;
                i = kr1Var2.q;
                mr1 mr1Var2 = null;
                if (i != 0) {
                    ca2.b(obj);
                    hr1 hr1Var = this.A;
                    kr1Var2.m = j;
                    kr1Var2.n = j2;
                    kr1Var2.q = 1;
                    obj = hr1Var.N(j, j2, kr1Var2);
                    if (obj != b50Var) {
                        j3 = j2;
                    }
                    return b50Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j6 = kr1Var2.m;
                    ca2.b(obj);
                    j5 = ((f43) obj).a;
                    j4 = j6;
                    return new f43(f43.e(j4, j5));
                }
                long j7 = kr1Var2.n;
                long j8 = kr1Var2.m;
                ca2.b(obj);
                j3 = j7;
                j = j8;
                j4 = ((f43) obj).a;
                z = this.z;
                if (z) {
                    mr1Var2 = this.C;
                } else if (z && z) {
                    mr1Var2 = (mr1) nk2.j(this);
                }
                mr1Var = mr1Var2;
                if (mr1Var != null) {
                    j5 = 0;
                    return new f43(f43.e(j4, j5));
                }
                long e = f43.e(j, j4);
                long d = f43.d(j3, j4);
                kr1Var2.m = j4;
                kr1Var2.q = 2;
                obj = mr1Var.N(e, d, kr1Var2);
                if (obj != b50Var) {
                    j6 = j4;
                    j5 = ((f43) obj).a;
                    j4 = j6;
                    return new f43(f43.e(j4, j5));
                }
                return b50Var;
            }
        }
        kr1Var = new kr1(this, (r30) o30Var);
        kr1 kr1Var22 = kr1Var;
        Object obj2 = kr1Var22.o;
        b50 b50Var2 = b50.m;
        i = kr1Var22.q;
        mr1 mr1Var22 = null;
        if (i != 0) {
        }
        j4 = ((f43) obj2).a;
        z = this.z;
        if (z) {
        }
        mr1Var = mr1Var22;
        if (mr1Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.hr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Y(long j, o30 o30Var) {
        lr1 lr1Var;
        Object obj;
        b50 b50Var;
        int i;
        long j2;
        long j3;
        if (o30Var instanceof lr1) {
            lr1Var = (lr1) o30Var;
            int i2 = lr1Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lr1Var.p = i2 - Integer.MIN_VALUE;
                obj = lr1Var.n;
                b50Var = b50.m;
                i = lr1Var.p;
                mr1 mr1Var = null;
                if (i != 0) {
                    ca2.b(obj);
                    boolean z = this.z;
                    if (z && z) {
                        mr1Var = (mr1) nk2.j(this);
                    }
                    if (mr1Var == null) {
                        j2 = 0;
                        hr1 hr1Var = this.A;
                        long d = f43.d(j, j2);
                        lr1Var.m = j2;
                        lr1Var.p = 2;
                        obj = hr1Var.Y(d, lr1Var);
                        if (obj != b50Var) {
                            j3 = j2;
                            return new f43(f43.e(j3, ((f43) obj).a));
                        }
                        return b50Var;
                    }
                    lr1Var.m = j;
                    lr1Var.p = 1;
                    obj = mr1Var.Y(j, lr1Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = lr1Var.m;
                        ca2.b(obj);
                        return new f43(f43.e(j3, ((f43) obj).a));
                    }
                    j = lr1Var.m;
                    ca2.b(obj);
                }
                j2 = ((f43) obj).a;
                hr1 hr1Var2 = this.A;
                long d2 = f43.d(j, j2);
                lr1Var.m = j2;
                lr1Var.p = 2;
                obj = hr1Var2.Y(d2, lr1Var);
                if (obj != b50Var) {
                }
                return b50Var;
            }
        }
        lr1Var = new lr1(this, (r30) o30Var);
        obj = lr1Var.n;
        b50Var = b50.m;
        i = lr1Var.p;
        mr1 mr1Var2 = null;
        if (i != 0) {
        }
        j2 = ((f43) obj).a;
        hr1 hr1Var22 = this.A;
        long d22 = f43.d(j, j2);
        lr1Var.m = j2;
        lr1Var.p = 2;
        obj = hr1Var22.Y(d22, lr1Var);
        if (obj != b50Var) {
        }
        return b50Var;
    }

    @Override // defpackage.hr1
    public final long d0(long j, long j2, int i) {
        long d0 = this.A.d0(j, j2, i);
        boolean z = this.z;
        mr1 mr1Var = null;
        if (z && z) {
            mr1Var = (mr1) nk2.j(this);
        }
        mr1 mr1Var2 = mr1Var;
        return au1.g(d0, mr1Var2 != null ? mr1Var2.d0(au1.g(j, d0), au1.f(j2, d0), i) : 0L);
    }

    @Override // defpackage.hr1
    public final long o(long j, int i) {
        boolean z = this.z;
        mr1 mr1Var = null;
        if (z && z) {
            mr1Var = (mr1) nk2.j(this);
        }
        long o = mr1Var != null ? mr1Var.o(j, i) : 0L;
        return au1.g(o, this.A.o(au1.f(j, o), i));
    }

    @Override // defpackage.rz2
    public final Object r() {
        return this.D;
    }

    @Override // defpackage.ul1
    public final void y0() {
        js0 js0Var = this.B;
        js0Var.m = this;
        js0Var.n = null;
        this.C = null;
        js0Var.o = new u(23, this);
        js0Var.p = u0();
    }

    @Override // defpackage.ul1
    public final void z0() {
        c82 c82Var = new c82();
        nk2.o(this, new m7(5, c82Var));
        mr1 mr1Var = (mr1) ((rz2) c82Var.m);
        this.C = mr1Var;
        js0 js0Var = this.B;
        js0Var.n = mr1Var;
        if (((mr1) js0Var.m) == this) {
            js0Var.m = null;
        }
    }
}
