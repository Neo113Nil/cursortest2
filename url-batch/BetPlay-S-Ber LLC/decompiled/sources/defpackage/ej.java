package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ej {
    public int a;
    public pc d;
    public pc e;
    public pc f;
    public pc g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ fj r;
    public ed b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public ej(fj fjVar, int i, pc pcVar, pc pcVar2, pc pcVar3, pc pcVar4, int i2) {
        this.r = fjVar;
        this.a = i;
        this.d = pcVar;
        this.e = pcVar2;
        this.f = pcVar3;
        this.g = pcVar4;
        this.h = fjVar.w0;
        this.i = fjVar.s0;
        this.j = fjVar.x0;
        this.k = fjVar.t0;
        this.q = i2;
    }

    public final void a(ed edVar) {
        int i = this.a;
        int i2 = this.q;
        fj fjVar = this.r;
        if (i == 0) {
            int U = fjVar.U(edVar, i2);
            if (edVar.p0[0] == 3) {
                this.p++;
                U = 0;
            }
            this.l = U + (edVar.g0 != 8 ? fjVar.P0 : 0) + this.l;
            int T = fjVar.T(edVar, this.q);
            if (this.b == null || this.c < T) {
                this.b = edVar;
                this.c = T;
                this.m = T;
            }
        } else {
            int U2 = fjVar.U(edVar, i2);
            int T2 = fjVar.T(edVar, this.q);
            if (edVar.p0[1] == 3) {
                this.p++;
                T2 = 0;
            }
            this.m = T2 + (edVar.g0 != 8 ? fjVar.Q0 : 0) + this.m;
            if (this.b == null || this.c < U2) {
                this.b = edVar;
                this.c = U2;
                this.l = U2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z, boolean z2) {
        fj fjVar;
        int i2;
        int i3;
        int i4;
        ed edVar;
        boolean z3;
        int i5;
        int i6;
        char c;
        float f;
        int i7;
        float f2;
        int i8;
        int i9 = this.o;
        int i10 = 0;
        while (true) {
            fjVar = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= fjVar.b1) {
                break;
            }
            ed edVar2 = fjVar.a1[i8];
            if (edVar2 != null) {
                edVar2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= fjVar.b1) {
                break;
            }
            ed edVar3 = fjVar.a1[i14];
            if (edVar3 != null && edVar3.g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        int i15 = this.a;
        ed edVar4 = this.b;
        if (i15 == 0) {
            edVar4.j0 = fjVar.E0;
            pc pcVar = edVar4.L;
            pc pcVar2 = edVar4.J;
            int i16 = this.i;
            if (i > 0) {
                i16 += fjVar.Q0;
            }
            pcVar2.a(this.e, i16);
            if (z2) {
                pcVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.L.a(pcVar2, 0);
            }
            if (fjVar.S0 == 3 && !edVar4.E) {
                for (int i17 = 0; i17 < i9; i17++) {
                    int i18 = this.n + (z ? (i9 - 1) - i17 : i17);
                    if (i18 >= fjVar.b1) {
                        break;
                    }
                    edVar = fjVar.a1[i18];
                    if (edVar.E) {
                        break;
                    }
                }
            }
            edVar = edVar4;
            int i19 = 0;
            ed edVar5 = null;
            while (i19 < i9) {
                int i20 = z ? (i9 - 1) - i19 : i19;
                int i21 = this.n + i20;
                if (i21 >= fjVar.b1) {
                    return;
                }
                ed edVar6 = fjVar.a1[i21];
                if (edVar6 == null) {
                    i6 = i9;
                    z3 = z4;
                    i5 = i12;
                    c = 3;
                } else {
                    pc pcVar3 = edVar6.J;
                    pc pcVar4 = edVar6.L;
                    pc pcVar5 = edVar6.I;
                    z3 = z4;
                    if (i19 == 0) {
                        i5 = i12;
                        edVar6.f(pcVar5, this.d, this.h);
                    } else {
                        i5 = i12;
                    }
                    if (i20 == 0) {
                        int i22 = fjVar.D0;
                        float f3 = fjVar.J0;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.n == 0) {
                            i7 = fjVar.F0;
                            f = f3;
                            if (i7 != -1) {
                                f2 = fjVar.L0;
                            }
                        } else {
                            f = f3;
                        }
                        if (!z2 || (i7 = fjVar.H0) == -1) {
                            i7 = i22;
                            f2 = f;
                        } else {
                            f2 = fjVar.N0;
                        }
                        edVar6.i0 = i7;
                        edVar6.d0 = f2;
                    }
                    if (i19 == i9 - 1) {
                        i6 = i9;
                        edVar6.f(edVar6.K, this.f, this.j);
                    } else {
                        i6 = i9;
                    }
                    if (edVar5 != null) {
                        pc pcVar6 = edVar5.K;
                        pcVar5.a(pcVar6, fjVar.P0);
                        if (i19 == i11) {
                            int i23 = this.h;
                            if (pcVar5.h()) {
                                pcVar5.h = i23;
                            }
                        }
                        pcVar6.a(pcVar5, 0);
                        if (i19 == i5 + 1) {
                            int i24 = this.j;
                            if (pcVar6.h()) {
                                pcVar6.h = i24;
                            }
                        }
                    }
                    if (edVar6 != edVar4) {
                        int i25 = fjVar.S0;
                        c = 3;
                        if (i25 == 3 && edVar.E && edVar6 != edVar && edVar6.E) {
                            edVar6.M.a(edVar.M, 0);
                        } else if (i25 == 0) {
                            pcVar3.a(pcVar2, 0);
                        } else if (i25 == 1) {
                            pcVar4.a(pcVar, 0);
                        } else if (z3) {
                            pcVar3.a(this.e, this.i);
                            pcVar4.a(this.g, this.k);
                        } else {
                            pcVar3.a(pcVar2, 0);
                            pcVar4.a(pcVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    edVar5 = edVar6;
                }
                i19++;
                z4 = z3;
                i12 = i5;
                i9 = i6;
            }
            return;
        }
        int i26 = i9;
        boolean z5 = z4;
        int i27 = i12;
        edVar4.i0 = fjVar.D0;
        pc pcVar7 = edVar4.I;
        pc pcVar8 = edVar4.K;
        int i28 = this.h;
        if (i > 0) {
            i28 += fjVar.P0;
        }
        if (z) {
            pcVar8.a(this.f, i28);
            if (z2) {
                pcVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.I.a(pcVar8, 0);
            }
        } else {
            pcVar7.a(this.d, i28);
            if (z2) {
                pcVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.K.a(pcVar7, 0);
            }
        }
        int i29 = 0;
        ed edVar7 = null;
        while (true) {
            int i30 = i26;
            if (i29 >= i30 || (i2 = this.n + i29) >= fjVar.b1) {
                return;
            }
            ed edVar8 = fjVar.a1[i2];
            if (edVar8 == null) {
                i26 = i30;
            } else {
                pc pcVar9 = edVar8.I;
                pc pcVar10 = edVar8.J;
                pc pcVar11 = edVar8.K;
                if (i29 == 0) {
                    edVar8.f(pcVar10, this.e, this.i);
                    int i31 = fjVar.E0;
                    float f4 = fjVar.K0;
                    if (this.n == 0) {
                        i4 = fjVar.G0;
                        i26 = i30;
                        i3 = -1;
                        if (i4 != -1) {
                            f4 = fjVar.M0;
                            i31 = i4;
                            edVar8.j0 = i31;
                            edVar8.e0 = f4;
                        }
                    } else {
                        i26 = i30;
                        i3 = -1;
                    }
                    if (z2 && (i4 = fjVar.I0) != i3) {
                        f4 = fjVar.O0;
                        i31 = i4;
                    }
                    edVar8.j0 = i31;
                    edVar8.e0 = f4;
                } else {
                    i26 = i30;
                }
                if (i29 == i26 - 1) {
                    edVar8.f(edVar8.L, this.g, this.k);
                }
                if (edVar7 != null) {
                    pc pcVar12 = edVar7.L;
                    pcVar10.a(pcVar12, fjVar.Q0);
                    if (i29 == i11) {
                        int i32 = this.i;
                        if (pcVar10.h()) {
                            pcVar10.h = i32;
                        }
                    }
                    pcVar12.a(pcVar10, 0);
                    if (i29 == i27 + 1) {
                        int i33 = this.k;
                        if (pcVar12.h()) {
                            pcVar12.h = i33;
                        }
                    }
                }
                if (edVar8 != edVar4) {
                    int i34 = fjVar.R0;
                    if (!z) {
                        if (i34 == 0) {
                            pcVar9.a(pcVar7, 0);
                        } else if (i34 == 1) {
                            pcVar11.a(pcVar8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                pcVar9.a(this.d, this.h);
                                pcVar11.a(this.f, this.j);
                            } else {
                                pcVar9.a(pcVar7, 0);
                                pcVar11.a(pcVar8, 0);
                            }
                        }
                        edVar7 = edVar8;
                    } else if (i34 == 0) {
                        pcVar11.a(pcVar8, 0);
                    } else if (i34 == 1) {
                        pcVar9.a(pcVar7, 0);
                    } else if (i34 == 2) {
                        pcVar9.a(pcVar7, 0);
                        pcVar11.a(pcVar8, 0);
                    }
                }
                edVar7 = edVar8;
            }
            i29++;
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.Q0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.P0 : i2;
    }

    public final void e(int i) {
        fj fjVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            fjVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= fjVar.b1) {
                break;
            }
            ed edVar = fjVar.a1[i2];
            if (this.a == 0) {
                if (edVar != null) {
                    int[] iArr = edVar.p0;
                    if (iArr[0] == 3 && edVar.r == 0) {
                        fjVar.V(1, i5, iArr[1], edVar.k(), edVar);
                    }
                }
            } else if (edVar != null) {
                int[] iArr2 = edVar.p0;
                if (iArr2[1] == 3 && edVar.s == 0) {
                    int i7 = i5;
                    fjVar.V(iArr2[0], edVar.q(), 1, i7, edVar);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= fjVar.b1) {
                return;
            }
            ed edVar2 = fjVar.a1[i10];
            if (this.a == 0) {
                int q = edVar2.q();
                int i11 = fjVar.P0;
                if (edVar2.g0 == 8) {
                    i11 = 0;
                }
                this.l = q + i11 + this.l;
                int T = fjVar.T(edVar2, this.q);
                if (this.b == null || this.c < T) {
                    this.b = edVar2;
                    this.c = T;
                    this.m = T;
                }
            } else {
                int U = fjVar.U(edVar2, this.q);
                int T2 = fjVar.T(edVar2, this.q);
                int i12 = fjVar.Q0;
                if (edVar2.g0 == 8) {
                    i12 = 0;
                }
                this.m = T2 + i12 + this.m;
                if (this.b == null || this.c < U) {
                    this.b = edVar2;
                    this.c = U;
                    this.l = U;
                }
            }
        }
    }

    public final void f(int i, pc pcVar, pc pcVar2, pc pcVar3, pc pcVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = pcVar;
        this.e = pcVar2;
        this.f = pcVar3;
        this.g = pcVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
