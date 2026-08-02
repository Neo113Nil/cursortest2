package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sa extends si {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00e6, code lost:
    
        if (r13 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00ea, code lost:
    
        if (r14 != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0182  */
    @Override // defpackage.sd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(rv rvVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        sc[] scVarArr = this.S;
        sc scVar = this.K;
        scVarArr[0] = scVar;
        sc scVar2 = this.L;
        int i6 = 2;
        scVarArr[2] = scVar2;
        sc scVar3 = this.M;
        scVarArr[1] = scVar3;
        sc scVar4 = this.N;
        scVarArr[3] = scVar4;
        int i7 = 0;
        while (true) {
            int length = scVarArr.length;
            if (i7 >= 6) {
                break;
            }
            sc scVar5 = scVarArr[i7];
            scVar5.h = rvVar.b(scVar5);
            i7++;
        }
        int i8 = this.a;
        if (i8 < 0 || i8 >= 4) {
            return;
        }
        sc scVar6 = scVarArr[i8];
        if (!this.d) {
            c();
        }
        if (this.d) {
            this.d = false;
            int i9 = this.a;
            if (i9 == 0 || i9 == 1) {
                rvVar.f(scVar.h, this.aa);
                rvVar.f(scVar3.h, this.aa);
                return;
            } else {
                if (i9 == 2 || i9 == 3) {
                    rvVar.f(scVar2.h, this.ab);
                    rvVar.f(scVar4.h, this.ab);
                    return;
                }
                return;
            }
        }
        for (int i10 = 0; i10 < this.aK; i10++) {
            sd sdVar = this.aJ[i10];
            if ((this.b || sdVar.d()) && ((((i4 = this.a) == 0 || i4 == 1) && sdVar.O() == 3 && sdVar.K.e != null && sdVar.M.e != null) || (((i5 = this.a) == 2 || i5 == 3) && sdVar.P() == 3 && sdVar.L.e != null && sdVar.N.e != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = scVar.h() || scVar3.h();
        boolean z4 = scVar2.h() || scVar4.h();
        if (!z2) {
            int i11 = this.a;
            i = 5;
            if (i11 == 0) {
                if (!z3) {
                    i11 = 0;
                    z3 = false;
                }
                i2 = 0;
                while (i2 < this.aK) {
                    sd sdVar2 = this.aJ[i2];
                    if (this.b || sdVar2.d()) {
                        sc[] scVarArr2 = sdVar2.S;
                        ry b = rvVar.b(scVarArr2[this.a]);
                        int i12 = this.a;
                        sc scVar7 = scVarArr2[i12];
                        scVar7.h = b;
                        sc scVar8 = scVar7.e;
                        int i13 = (scVar8 == null || scVar8.d != this) ? 0 : scVar7.f;
                        if (i12 == 0 || i12 == i6) {
                            ry ryVar = scVar6.h;
                            int i14 = this.c - i13;
                            ru a = rvVar.a();
                            ry c = rvVar.c();
                            c.e = 0;
                            a.i(ryVar, b, c, i14);
                            rvVar.e(a);
                        } else {
                            ry ryVar2 = scVar6.h;
                            int i15 = this.c + i13;
                            ru a2 = rvVar.a();
                            ry c2 = rvVar.c();
                            c2.e = 0;
                            a2.h(ryVar2, b, c2, i15);
                            rvVar.e(a2);
                        }
                        rvVar.m(scVar6.h, b, this.c + i13, i);
                    }
                    i2++;
                    i6 = 2;
                }
                i3 = this.a;
                if (i3 == 0) {
                    rvVar.m(scVar3.h, scVar.h, 0, 8);
                    rvVar.m(scVar.h, this.V.M.h, 0, 4);
                    rvVar.m(scVar.h, this.V.K.h, 0, 0);
                    return;
                }
                if (i3 == 1) {
                    rvVar.m(scVar.h, scVar3.h, 0, 8);
                    rvVar.m(scVar.h, this.V.K.h, 0, 4);
                    rvVar.m(scVar.h, this.V.M.h, 0, 0);
                    return;
                } else if (i3 == 2) {
                    rvVar.m(scVar4.h, scVar2.h, 0, 8);
                    rvVar.m(scVar2.h, this.V.N.h, 0, 4);
                    rvVar.m(scVar2.h, this.V.L.h, 0, 0);
                    return;
                } else {
                    if (i3 == 3) {
                        rvVar.m(scVar2.h, scVar4.h, 0, 8);
                        rvVar.m(scVar2.h, this.V.L.h, 0, 4);
                        rvVar.m(scVar2.h, this.V.N.h, 0, 0);
                        return;
                    }
                    return;
                }
            }
            if (i11 == 2) {
                if (!z4) {
                    z4 = false;
                }
                i2 = 0;
                while (i2 < this.aK) {
                }
                i3 = this.a;
                if (i3 == 0) {
                }
            }
            if (i11 == 1) {
            }
            if (i11 == 3) {
            }
        }
        i = 4;
        i2 = 0;
        while (i2 < this.aK) {
        }
        i3 = this.a;
        if (i3 == 0) {
        }
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.aK;
            if (i4 >= i) {
                break;
            }
            sd sdVar = this.aJ[i4];
            if ((this.b || sdVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && !sdVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !sdVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.aK; i6++) {
            sd sdVar2 = this.aJ[i6];
            if (this.b || sdVar2.d()) {
                if (!z2) {
                    int i7 = this.a;
                    if (i7 == 0) {
                        i5 = sdVar2.M(2).a();
                    } else if (i7 == 1) {
                        i5 = sdVar2.M(4).a();
                    } else if (i7 == 2) {
                        i5 = sdVar2.M(3).a();
                    } else if (i7 == 3) {
                        i5 = sdVar2.M(5).a();
                    }
                }
                int i8 = this.a;
                if (i8 == 0) {
                    i5 = Math.min(i5, sdVar2.M(2).a());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, sdVar2.M(4).a());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, sdVar2.M(3).a());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, sdVar2.M(5).a());
                }
                z2 = true;
            }
        }
        int i9 = i5 + this.c;
        int i10 = this.a;
        if (i10 == 0 || i10 == 1) {
            x(i9, i9);
        } else {
            y(i9, i9);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.sd
    public final boolean d() {
        return true;
    }

    @Override // defpackage.sd
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.sd
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.sd
    public final String toString() {
        String str = "[Barrier] " + this.aj + " {";
        for (int i = 0; i < this.aK; i++) {
            sd sdVar = this.aJ[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str.concat(String.valueOf(sdVar.aj));
        }
        return str.concat("}");
    }
}
