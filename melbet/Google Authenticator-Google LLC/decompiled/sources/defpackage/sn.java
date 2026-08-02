package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sn extends sy {
    ArrayList a;
    private int b;

    public sn(sd sdVar, int i) {
        super(sdVar);
        sd sdVar2;
        ArrayList arrayList;
        this.a = new ArrayList();
        this.f = i;
        sd sdVar3 = this.d;
        sd n = sdVar3.n(i);
        while (true) {
            sd sdVar4 = n;
            sdVar2 = sdVar3;
            sdVar3 = sdVar4;
            if (sdVar3 == null) {
                break;
            } else {
                n = sdVar3.n(this.f);
            }
        }
        this.d = sdVar2;
        this.a.add(sdVar2.o(this.f));
        sd m = sdVar2.m(this.f);
        while (true) {
            arrayList = this.a;
            if (m == null) {
                break;
            }
            arrayList.add(m.o(this.f));
            m = m.m(this.f);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sy syVar = (sy) arrayList.get(i2);
            int i3 = this.f;
            if (i3 == 0) {
                syVar.d.f = this;
            } else if (i3 == 1) {
                syVar.d.g = this;
            }
        }
        if (this.f == 0 && ((se) this.d.V).c && this.a.size() > 1) {
            this.d = ((sy) this.a.get(r6.size() - 1)).d;
        }
        this.b = this.f == 0 ? this.d.ak : this.d.al;
    }

    private final sd g() {
        for (int i = 0; i < this.a.size(); i++) {
            sd sdVar = ((sy) this.a.get(i)).d;
            if (sdVar.ai != 8) {
                return sdVar;
            }
        }
        return null;
    }

    private final sd n() {
        sd sdVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            sdVar = ((sy) this.a.get(size)).d;
        } while (sdVar.ai == 8);
        return sdVar;
    }

    @Override // defpackage.sy
    public final long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = j + r4.h.e + ((sy) this.a.get(i)).a() + r4.i.e;
        }
        return j;
    }

    @Override // defpackage.sy
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((sy) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        sd sdVar = ((sy) this.a.get(0)).d;
        sd sdVar2 = ((sy) this.a.get(size2 - 1)).d;
        if (this.f == 0) {
            sc scVar = sdVar.K;
            sc scVar2 = sdVar2.M;
            sq l = l(scVar, 0);
            int b = scVar.b();
            sd g = g();
            if (g != null) {
                b = g.K.b();
            }
            if (l != null) {
                j(this.h, l, b);
            }
            sq l2 = l(scVar2, 0);
            int b2 = scVar2.b();
            sd n = n();
            if (n != null) {
                b2 = n.M.b();
            }
            if (l2 != null) {
                j(this.i, l2, -b2);
            }
        } else {
            sc scVar3 = sdVar.L;
            sc scVar4 = sdVar2.N;
            sq l3 = l(scVar3, 1);
            int b3 = scVar3.b();
            sd g2 = g();
            if (g2 != null) {
                b3 = g2.L.b();
            }
            if (l3 != null) {
                j(this.h, l3, b3);
            }
            sq l4 = l(scVar4, 1);
            int b4 = scVar4.b();
            sd n2 = n();
            if (n2 != null) {
                b4 = n2.N.b();
            }
            if (l4 != null) {
                j(this.i, l4, -b4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // defpackage.sy
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((sy) this.a.get(i)).c();
        }
    }

    @Override // defpackage.sy
    public final void d() {
        this.l = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((sy) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.sy
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((sy) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x03c4, code lost:
    
        r2 = r2 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bf, code lost:
    
        if (r14.i != false) goto L56;
     */
    @Override // defpackage.sy, defpackage.so
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int i;
        boolean z;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        float f4;
        int i9;
        int i10;
        boolean z2;
        boolean z3;
        sq sqVar = this.h;
        if (!sqVar.i) {
            return;
        }
        sq sqVar2 = this.i;
        if (!sqVar2.i) {
            return;
        }
        sd sdVar = this.d.V;
        boolean z4 = sdVar instanceof se ? ((se) sdVar).c : false;
        int i11 = sqVar2.f - sqVar.f;
        int size = this.a.size();
        int i12 = 0;
        while (true) {
            i = 8;
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((sy) this.a.get(i12)).d.ai != 8) {
                break;
            } else {
                i12++;
            }
        }
        int i13 = size - 1;
        int i14 = i13;
        while (true) {
            if (i14 < 0) {
                i14 = -1;
                break;
            } else if (((sy) this.a.get(i14)).d.ai != 8) {
                break;
            } else {
                i14--;
            }
        }
        int i15 = 0;
        while (i15 < 2) {
            i3 = 0;
            int i16 = 0;
            f = 0.0f;
            int i17 = 0;
            int i18 = 0;
            f2 = 0.0f;
            while (i16 < size) {
                sy syVar = (sy) this.a.get(i16);
                sd sdVar2 = syVar.d;
                if (sdVar2.ai != i) {
                    i18++;
                    if (i16 > 0 && i16 >= i12) {
                        i3 += syVar.h.e;
                    }
                    sr srVar = syVar.e;
                    int i19 = srVar.f;
                    z2 = z4;
                    int i20 = i3;
                    boolean z5 = syVar.j != 3;
                    if (z5) {
                        int i21 = this.f;
                        if (i21 == 0) {
                            if (!sdVar2.h.e.i) {
                                return;
                            }
                        } else if (i21 == 1 && !sdVar2.i.e.i) {
                            return;
                        }
                        z3 = z5;
                    } else {
                        z3 = z5;
                        if (syVar.c == 1 && i15 == 0) {
                            i19 = srVar.m;
                            i17++;
                        }
                        z3 = true;
                    }
                    if (z3) {
                        i3 = i20 + i19;
                    } else {
                        i17++;
                        float f5 = sdVar2.am[this.f];
                        if (f5 >= 0.0f) {
                            f2 += f5;
                        }
                        i3 = i20;
                    }
                    if (i16 < i13 && i16 < i14) {
                        i3 += -syVar.i.e;
                    }
                } else {
                    z2 = z4;
                }
                i16++;
                z4 = z2;
                i = 8;
            }
            z = z4;
            if (i3 < i11 || i17 == 0) {
                i2 = i17;
                i4 = i18;
                break;
            } else {
                i15++;
                z4 = z;
                i = 8;
            }
        }
        z = z4;
        f = 0.0f;
        f2 = 0.0f;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        int i22 = sqVar.f;
        if (z) {
            i22 = sqVar2.f;
        }
        float f6 = 0.5f;
        if (i3 > i11) {
            float f7 = i3 - i11;
            i22 = z ? i22 + ((int) ((f7 / 2.0f) + 0.5f)) : i22 - ((int) ((f7 / 2.0f) + 0.5f));
        }
        if (i2 > 0) {
            float f8 = i11 - i3;
            float f9 = (f8 / i2) + 0.5f;
            int i23 = 0;
            int i24 = 0;
            while (i23 < size) {
                sy syVar2 = (sy) this.a.get(i23);
                float f10 = f6;
                sd sdVar3 = syVar2.d;
                int i25 = i22;
                int i26 = i2;
                if (sdVar3.ai != 8 && syVar2.j == 3) {
                    sr srVar2 = syVar2.e;
                    if (!srVar2.i) {
                        int i27 = (int) f9;
                        if (f2 > f) {
                            i27 = (int) (((sdVar3.am[this.f] * f8) / f2) + f10);
                        }
                        i8 = i3;
                        if (this.f == 0) {
                            i9 = sdVar3.x;
                            i10 = sdVar3.w;
                        } else {
                            i9 = sdVar3.A;
                            i10 = sdVar3.z;
                        }
                        f4 = f8;
                        int max = Math.max(i10, syVar2.c == 1 ? Math.min(i27, srVar2.m) : i27);
                        if (i9 > 0) {
                            max = Math.min(i9, max);
                        }
                        if (max != i27) {
                            i24++;
                            i27 = max;
                        }
                        srVar2.c(i27);
                        i23++;
                        f6 = f10;
                        i22 = i25;
                        i2 = i26;
                        i3 = i8;
                        f8 = f4;
                    }
                }
                i8 = i3;
                f4 = f8;
                i23++;
                f6 = f10;
                i22 = i25;
                i2 = i26;
                i3 = i8;
                f8 = f4;
            }
            i5 = i22;
            f3 = f6;
            int i28 = i2;
            int i29 = i3;
            if (i24 > 0) {
                i2 = i28 - i24;
                int i30 = 0;
                for (int i31 = 0; i31 < size; i31++) {
                    sy syVar3 = (sy) this.a.get(i31);
                    if (syVar3.d.ai != 8) {
                        if (i31 > 0 && i31 >= i12) {
                            i30 += syVar3.h.e;
                        }
                        i30 += syVar3.e.f;
                        if (i31 < i13 && i31 < i14) {
                            i30 += -syVar3.i.e;
                        }
                    }
                }
                i3 = i30;
            } else {
                i2 = i28;
                i3 = i29;
            }
            i7 = 2;
            if (this.b == 2 && i24 == 0) {
                i6 = 0;
                this.b = 0;
            } else {
                i6 = 0;
            }
        } else {
            i5 = i22;
            f3 = 0.5f;
            i6 = 0;
            i7 = 2;
        }
        if (i3 > i11) {
            this.b = i7;
        }
        if (i4 > 0 && i2 == 0) {
            if (i12 == i14) {
                this.b = i7;
            }
            i2 = i6;
        }
        int i32 = this.b;
        if (i32 == 1) {
            int i33 = i4 > 1 ? (i11 - i3) / (i4 - 1) : i4 == 1 ? (i11 - i3) / 2 : i6;
            if (i2 > 0) {
                i33 = i6;
            }
            int i34 = i5;
            for (int i35 = i6; i35 < size; i35++) {
                sy syVar4 = (sy) this.a.get(z ? size - (i35 + 1) : i35);
                if (syVar4.d.ai == 8) {
                    syVar4.h.c(i34);
                    syVar4.i.c(i34);
                } else {
                    if (i35 > 0) {
                        i34 = z ? i34 - i33 : i34 + i33;
                    }
                    if (i35 > 0 && i35 >= i12) {
                        i34 = z ? i34 - syVar4.h.e : i34 + syVar4.h.e;
                    }
                    if (z) {
                        syVar4.i.c(i34);
                    } else {
                        syVar4.h.c(i34);
                    }
                    sr srVar3 = syVar4.e;
                    int i36 = srVar3.f;
                    if (syVar4.j == 3 && syVar4.c == 1) {
                        i36 = srVar3.m;
                    }
                    i34 = z ? i34 - i36 : i34 + i36;
                    if (z) {
                        syVar4.h.c(i34);
                    } else {
                        syVar4.i.c(i34);
                    }
                    syVar4.g = true;
                    if (i35 < i13 && i35 < i14) {
                        i34 = z ? i34 - (-syVar4.i.e) : i34 + (-syVar4.i.e);
                    }
                }
            }
            return;
        }
        if (i32 == 0) {
            int i37 = (i11 - i3) / (i4 + 1);
            if (i2 > 0) {
                i37 = i6;
            }
            int i38 = i5;
            for (int i39 = i6; i39 < size; i39++) {
                sy syVar5 = (sy) this.a.get(z ? size - (i39 + 1) : i39);
                if (syVar5.d.ai == 8) {
                    syVar5.h.c(i38);
                    syVar5.i.c(i38);
                } else {
                    int i40 = z ? i38 - i37 : i38 + i37;
                    if (i39 > 0 && i39 >= i12) {
                        i40 = z ? i40 - syVar5.h.e : i40 + syVar5.h.e;
                    }
                    if (z) {
                        syVar5.i.c(i40);
                    } else {
                        syVar5.h.c(i40);
                    }
                    sr srVar4 = syVar5.e;
                    int i41 = srVar4.f;
                    if (syVar5.j == 3 && syVar5.c == 1) {
                        i41 = Math.min(i41, srVar4.m);
                    }
                    i38 = z ? i40 - i41 : i40 + i41;
                    if (z) {
                        syVar5.h.c(i38);
                    } else {
                        syVar5.i.c(i38);
                    }
                    if (i39 < i13 && i39 < i14) {
                        i38 = z ? i38 - (-syVar5.i.e) : i38 + (-syVar5.i.e);
                    }
                }
            }
            return;
        }
        if (i32 != 2) {
            return;
        }
        int i42 = i11 - i3;
        float f11 = this.f == 0 ? this.d.af : this.d.ag;
        if (z) {
            f11 = 1.0f - f11;
        }
        int i43 = (int) ((i42 * f11) + f3);
        if (i43 < 0 || i2 > 0) {
            i43 = i6;
        }
        int i44 = z ? i5 - i43 : i5 + i43;
        while (true) {
            int i45 = i6;
            if (i45 >= size) {
                return;
            }
            i6 = i45 + 1;
            sy syVar6 = (sy) this.a.get(z ? size - i6 : i45);
            if (syVar6.d.ai == 8) {
                syVar6.h.c(i44);
                syVar6.i.c(i44);
            } else {
                if (i45 > 0 && i45 >= i12) {
                    i44 = z ? i44 - syVar6.h.e : i44 + syVar6.h.e;
                }
                if (z) {
                    syVar6.i.c(i44);
                } else {
                    syVar6.h.c(i44);
                }
                sr srVar5 = syVar6.e;
                int i46 = srVar5.f;
                if (syVar6.j == 3 && syVar6.c == 1) {
                    i46 = srVar5.m;
                }
                i44 += i46;
                if (z) {
                    syVar6.h.c(i44);
                } else {
                    syVar6.i.c(i44);
                }
                if (i45 < i13 && i45 < i14) {
                    i44 = z ? i44 - (-syVar6.i.e) : i44 + (-syVar6.i.e);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sy syVar = (sy) arrayList.get(i);
            sb.append("<");
            sb.append(syVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
