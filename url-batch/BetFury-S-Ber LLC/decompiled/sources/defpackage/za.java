package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class za extends vn0 {
    public final ArrayList k;
    public int l;

    public za(rf rfVar, int i) {
        super(rfVar);
        rf rfVar2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        rf rfVar3 = this.b;
        rf m = rfVar3.m(i);
        while (true) {
            rfVar2 = rfVar3;
            rfVar3 = m;
            if (rfVar3 == null) {
                break;
            } else {
                m = rfVar3.m(this.f);
            }
        }
        this.b = rfVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? rfVar2.d : i2 == 1 ? rfVar2.e : null);
        rf l = rfVar2.l(this.f);
        while (l != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? l.d : i3 == 1 ? l.e : null);
            l = l.l(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            vn0 vn0Var = (vn0) obj;
            int i5 = this.f;
            if (i5 == 0) {
                vn0Var.b.b = this;
            } else if (i5 == 1) {
                vn0Var.b.c = this;
            }
        }
        if (this.f == 0 && ((sf) this.b.U).v0 && arrayList.size() > 1) {
            this.b = ((vn0) arrayList.get(arrayList.size() - 1)).b;
        }
        int i6 = this.f;
        rf rfVar4 = this.b;
        this.l = i6 == 0 ? rfVar4.j0 : rfVar4.k0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x039b, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    @Override // defpackage.jj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(jj jjVar) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        mj mjVar = this.h;
        if (mjVar.j) {
            mj mjVar2 = this.i;
            if (mjVar2.j) {
                rf rfVar = this.b.U;
                boolean z3 = rfVar instanceof sf ? ((sf) rfVar).v0 : false;
                int i13 = mjVar2.g - mjVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((vn0) arrayList.get(i14)).b.h0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                int i16 = i15;
                while (true) {
                    if (i16 < 0) {
                        break;
                    }
                    if (((vn0) arrayList.get(i16)).b.h0 != 8) {
                        i = i16;
                        break;
                    }
                    i16--;
                }
                int i17 = 0;
                while (i17 < 2) {
                    f = 0.0f;
                    i4 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    f2 = 0.0f;
                    while (i18 < size) {
                        vn0 vn0Var = (vn0) arrayList.get(i18);
                        rf rfVar2 = vn0Var.b;
                        boolean z4 = z3;
                        if (rfVar2.h0 != i2) {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i4 += vn0Var.h.f;
                            }
                            ck ckVar = vn0Var.e;
                            int i21 = ckVar.g;
                            int i22 = i4;
                            boolean z5 = vn0Var.d != qf.MATCH_CONSTRAINT;
                            if (z5) {
                                int i23 = this.f;
                                if (i23 == 0 && !rfVar2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !rfVar2.e.e.j) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (vn0Var.a == 1 && i17 == 0) {
                                    i12 = ckVar.m;
                                    i19++;
                                } else if (ckVar.j) {
                                    i12 = i21;
                                }
                                z2 = true;
                                if (z2) {
                                    i19++;
                                    float f4 = rfVar2.l0[this.f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                    i4 = i22;
                                } else {
                                    i4 = i22 + i12;
                                }
                                if (i18 < i15 && i18 < i) {
                                    i4 += -vn0Var.i.f;
                                }
                            }
                            i12 = i21;
                            if (z2) {
                            }
                            if (i18 < i15) {
                                i4 += -vn0Var.i.f;
                            }
                        }
                        i18++;
                        z3 = z4;
                        i2 = 8;
                    }
                    z = z3;
                    if (i4 < i13 || i19 == 0) {
                        i3 = i19;
                        i5 = i20;
                        break;
                    } else {
                        i17++;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = 0.0f;
                f2 = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i24 = mjVar.g;
                if (z) {
                    i24 = mjVar2.g;
                }
                float f5 = 0.5f;
                if (i4 > i13) {
                    i24 = z ? i24 + ((int) (((i4 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i4 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f6 = i13 - i4;
                    int i25 = (int) ((f6 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f7 = f5;
                        vn0 vn0Var2 = (vn0) arrayList.get(i26);
                        int i28 = i24;
                        rf rfVar3 = vn0Var2.b;
                        int i29 = i3;
                        ck ckVar2 = vn0Var2.e;
                        int i30 = i4;
                        float f8 = f6;
                        if (rfVar3.h0 == 8 || vn0Var2.d != qf.MATCH_CONSTRAINT || ckVar2.j) {
                            i11 = i25;
                        } else {
                            int i31 = f2 > f ? (int) (((rfVar3.l0[this.f] * f8) / f2) + f7) : i25;
                            if (this.f == 0) {
                                i9 = rfVar3.v;
                                i10 = rfVar3.u;
                            } else {
                                i9 = rfVar3.y;
                                i10 = rfVar3.x;
                            }
                            i11 = i25;
                            int max = Math.max(i10, vn0Var2.a == 1 ? Math.min(i31, ckVar2.m) : i31);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != i31) {
                                i27++;
                                i31 = max;
                            }
                            ckVar2.d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f5 = f7;
                        i3 = i29;
                        i4 = i30;
                        f6 = f8;
                        i25 = i11;
                    }
                    i6 = i24;
                    f3 = f5;
                    int i32 = i3;
                    int i33 = i4;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i4 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            vn0 vn0Var3 = (vn0) arrayList.get(i34);
                            if (vn0Var3.b.h0 != 8) {
                                if (i34 > 0 && i34 >= i14) {
                                    i4 += vn0Var3.h.f;
                                }
                                i4 += vn0Var3.e.g;
                                if (i34 < i15 && i34 < i) {
                                    i4 += -vn0Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                        i4 = i33;
                    }
                    i8 = 2;
                    if (this.l == 2 && i27 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f3 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i4 > i13) {
                    this.l = i8;
                }
                if (i5 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i5 > 1 ? (i13 - i4) / (i5 - 1) : i5 == 1 ? (i13 - i4) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        vn0 vn0Var4 = (vn0) arrayList.get(z ? size - (i38 + 1) : i38);
                        rf rfVar4 = vn0Var4.b;
                        mj mjVar3 = vn0Var4.i;
                        mj mjVar4 = vn0Var4.h;
                        if (rfVar4.h0 == 8) {
                            mjVar4.d(i37);
                            mjVar3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i14) {
                                i37 = z ? i37 - mjVar4.f : i37 + mjVar4.f;
                            }
                            if (z) {
                                mjVar3.d(i37);
                            } else {
                                mjVar4.d(i37);
                            }
                            ck ckVar3 = vn0Var4.e;
                            int i39 = ckVar3.g;
                            if (vn0Var4.d == qf.MATCH_CONSTRAINT && vn0Var4.a == 1) {
                                i39 = ckVar3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                mjVar4.d(i37);
                            } else {
                                mjVar3.d(i37);
                            }
                            vn0Var4.g = true;
                            if (i38 < i15 && i38 < i) {
                                i37 = z ? i37 - (-mjVar3.f) : i37 + (-mjVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i13 - i4) / (i5 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        vn0 vn0Var5 = (vn0) arrayList.get(z ? size - (i42 + 1) : i42);
                        rf rfVar5 = vn0Var5.b;
                        mj mjVar5 = vn0Var5.i;
                        mj mjVar6 = vn0Var5.h;
                        if (rfVar5.h0 == 8) {
                            mjVar6.d(i41);
                            mjVar5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i14) {
                                i43 = z ? i43 - mjVar6.f : i43 + mjVar6.f;
                            }
                            if (z) {
                                mjVar5.d(i43);
                            } else {
                                mjVar6.d(i43);
                            }
                            ck ckVar4 = vn0Var5.e;
                            int i44 = ckVar4.g;
                            if (vn0Var5.d == qf.MATCH_CONSTRAINT && vn0Var5.a == 1) {
                                i44 = Math.min(i44, ckVar4.m);
                            }
                            i41 = z ? i43 - i44 : i43 + i44;
                            if (z) {
                                mjVar6.d(i41);
                            } else {
                                mjVar5.d(i41);
                            }
                            if (i42 < i15 && i42 < i) {
                                i41 = z ? i41 - (-mjVar5.f) : i41 + (-mjVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i45 = this.f;
                    rf rfVar6 = this.b;
                    float f9 = i45 == 0 ? rfVar6.e0 : rfVar6.f0;
                    if (z) {
                        f9 = 1.0f - f9;
                    }
                    int i46 = (int) (((i13 - i4) * f9) + f3);
                    if (i46 < 0 || i3 > 0) {
                        i46 = i7;
                    }
                    int i47 = z ? i6 - i46 : i6 + i46;
                    for (int i48 = i7; i48 < size; i48++) {
                        vn0 vn0Var6 = (vn0) arrayList.get(z ? size - (i48 + 1) : i48);
                        rf rfVar7 = vn0Var6.b;
                        mj mjVar7 = vn0Var6.i;
                        mj mjVar8 = vn0Var6.h;
                        if (rfVar7.h0 == 8) {
                            mjVar8.d(i47);
                            mjVar7.d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i14) {
                                i47 = z ? i47 - mjVar8.f : i47 + mjVar8.f;
                            }
                            if (z) {
                                mjVar7.d(i47);
                            } else {
                                mjVar8.d(i47);
                            }
                            ck ckVar5 = vn0Var6.e;
                            int i49 = ckVar5.g;
                            if (vn0Var6.d == qf.MATCH_CONSTRAINT && vn0Var6.a == 1) {
                                i49 = ckVar5.m;
                            }
                            i47 += i49;
                            if (z) {
                                mjVar8.d(i47);
                            } else {
                                mjVar7.d(i47);
                            }
                            if (i48 < i15 && i48 < i) {
                                i47 = z ? i47 - (-mjVar7.f) : i47 + (-mjVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.vn0
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vn0) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        rf rfVar = ((vn0) arrayList.get(0)).b;
        rf rfVar2 = ((vn0) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        mj mjVar = this.i;
        mj mjVar2 = this.h;
        if (i2 == 0) {
            xe xeVar = rfVar.I;
            xe xeVar2 = rfVar2.K;
            mj i3 = vn0.i(xeVar, 0);
            int e = xeVar.e();
            rf m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i3 != null) {
                vn0.b(mjVar2, i3, e);
            }
            mj i4 = vn0.i(xeVar2, 0);
            int e2 = xeVar2.e();
            rf n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i4 != null) {
                vn0.b(mjVar, i4, -e2);
            }
        } else {
            xe xeVar3 = rfVar.J;
            xe xeVar4 = rfVar2.L;
            mj i5 = vn0.i(xeVar3, 1);
            int e3 = xeVar3.e();
            rf m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i5 != null) {
                vn0.b(mjVar2, i5, e3);
            }
            mj i6 = vn0.i(xeVar4, 1);
            int e4 = xeVar4.e();
            rf n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i6 != null) {
                vn0.b(mjVar, i6, -e4);
            }
        }
        mjVar2.a = this;
        mjVar.a = this;
    }

    @Override // defpackage.vn0
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((vn0) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.vn0
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vn0) obj).f();
        }
    }

    @Override // defpackage.vn0
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((vn0) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.vn0
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((vn0) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final rf m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            rf rfVar = ((vn0) arrayList.get(i)).b;
            if (rfVar.h0 != 8) {
                return rfVar;
            }
            i++;
        }
    }

    public final rf n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rf rfVar = ((vn0) arrayList.get(size)).b;
            if (rfVar.h0 != 8) {
                return rfVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((vn0) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
