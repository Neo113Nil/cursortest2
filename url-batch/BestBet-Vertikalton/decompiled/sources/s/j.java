package s;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import q.C0306b;
import q.C0307c;
import q.C0310f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f4007a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0283, code lost:
    
        if (r2.d == r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r4.d == r13) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0707 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(e eVar, C0307c c0307c, ArrayList arrayList, int i) {
        int i2;
        C0317b[] c0317bArr;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        float f2;
        d dVar;
        boolean z4;
        boolean z5;
        c[] cVarArr;
        int i5;
        C0317b[] c0317bArr2;
        ArrayList arrayList2;
        d dVar2;
        int i6;
        d dVar3;
        int i7;
        c cVar;
        c cVar2;
        int i8;
        d dVar4;
        int i9;
        int i10;
        d dVar5;
        C0310f c0310f;
        C0310f c0310f2;
        c cVar3;
        c cVar4;
        C0310f c0310f3;
        d dVar6;
        d dVar7;
        d dVar8;
        c cVar5;
        d dVar9;
        int i11;
        c[] cVarArr2;
        c cVar6;
        C0310f c0310f4;
        C0310f c0310f5;
        int size;
        int i12;
        ArrayList arrayList3;
        int i13;
        float f3;
        d dVar10;
        boolean z6;
        d dVar11;
        C0317b c0317b;
        d dVar12;
        d dVar13;
        int i14;
        int i15;
        d dVar14;
        c cVar7;
        d dVar15;
        e eVar2 = eVar;
        ArrayList arrayList4 = arrayList;
        int i16 = 2;
        if (i == 0) {
            i2 = eVar2.f3951z0;
            c0317bArr = eVar2.f3934C0;
            i3 = 0;
        } else {
            i2 = eVar2.f3932A0;
            c0317bArr = eVar2.f3933B0;
            i3 = 2;
        }
        int i17 = 0;
        while (i17 < i2) {
            C0317b c0317b2 = c0317bArr[i17];
            boolean z7 = c0317b2.f3862q;
            d dVar16 = c0317b2.f3849a;
            int i18 = 3;
            int i19 = 1;
            int i20 = 8;
            if (z7) {
                i4 = i17;
                z2 = true;
            } else {
                int i21 = c0317b2.f3857l;
                int i22 = i21 * 2;
                d dVar17 = dVar16;
                d dVar18 = dVar17;
                boolean z8 = false;
                while (!z8) {
                    c0317b2.i += i19;
                    dVar17.f3916m0[i21] = null;
                    dVar17.f3914l0[i21] = null;
                    int i23 = dVar17.f3906g0;
                    c[] cVarArr3 = dVar17.f3884Q;
                    if (i23 != i20) {
                        dVar17.j(i21);
                        cVarArr3[i22].e();
                        int i24 = i22 + 1;
                        cVarArr3[i24].e();
                        cVarArr3[i22].e();
                        cVarArr3[i24].e();
                        if (c0317b2.f3850b == null) {
                            c0317b2.f3850b = dVar17;
                        }
                        c0317b2.d = dVar17;
                        int i25 = dVar17.f3921p0[i21];
                        if (i25 == i18) {
                            int i26 = dVar17.f3925t[i21];
                            if (i26 == 0 || i26 == i18 || i26 == i16) {
                                c0317b2.f3855j++;
                                float f4 = dVar17.f3912k0[i21];
                                if (f4 > RecyclerView.f1937A0) {
                                    c0317b2.f3856k += f4;
                                }
                                i15 = i17;
                                if (dVar17.f3906g0 != 8 && i25 == 3 && (i26 == 0 || i26 == 3)) {
                                    if (f4 < RecyclerView.f1937A0) {
                                        c0317b2.f3859n = true;
                                    } else {
                                        c0317b2.f3860o = true;
                                    }
                                    if (c0317b2.h == null) {
                                        c0317b2.h = new ArrayList();
                                    }
                                    c0317b2.h.add(dVar17);
                                }
                                if (c0317b2.f3853f == null) {
                                    c0317b2.f3853f = dVar17;
                                }
                                d dVar19 = c0317b2.f3854g;
                                if (dVar19 != null) {
                                    dVar19.f3914l0[i21] = dVar17;
                                }
                                c0317b2.f3854g = dVar17;
                            } else {
                                i15 = i17;
                            }
                            if (i21 == 0) {
                                if (dVar17.f3923r == 0 && dVar17.f3926u == 0) {
                                    int i27 = dVar17.f3927v;
                                }
                            } else if (dVar17.f3924s == 0 && dVar17.f3929x == 0) {
                                int i28 = dVar17.f3930y;
                            }
                            dVar14 = dVar18;
                            if (dVar14 != dVar17) {
                                dVar14.f3916m0[i21] = dVar17;
                            }
                            cVar7 = cVarArr3[i22 + 1].f3867f;
                            if (cVar7 != null) {
                                dVar15 = cVar7.d;
                                c cVar8 = dVar15.f3884Q[i22].f3867f;
                                if (cVar8 != null) {
                                }
                            }
                            dVar15 = null;
                            if (dVar15 != null) {
                                dVar15 = dVar17;
                                z8 = true;
                            }
                            dVar18 = dVar17;
                            i17 = i15;
                            i19 = 1;
                            i20 = 8;
                            i16 = 2;
                            dVar17 = dVar15;
                            i18 = 3;
                        }
                    }
                    i15 = i17;
                    dVar14 = dVar18;
                    if (dVar14 != dVar17) {
                    }
                    cVar7 = cVarArr3[i22 + 1].f3867f;
                    if (cVar7 != null) {
                    }
                    dVar15 = null;
                    if (dVar15 != null) {
                    }
                    dVar18 = dVar17;
                    i17 = i15;
                    i19 = 1;
                    i20 = 8;
                    i16 = 2;
                    dVar17 = dVar15;
                    i18 = 3;
                }
                i4 = i17;
                d dVar20 = c0317b2.f3850b;
                if (dVar20 != null) {
                    dVar20.f3884Q[i22].e();
                }
                d dVar21 = c0317b2.d;
                if (dVar21 != null) {
                    dVar21.f3884Q[i22 + 1].e();
                }
                c0317b2.f3851c = dVar17;
                if (i21 == 0 && c0317b2.f3858m) {
                    c0317b2.f3852e = dVar17;
                } else {
                    c0317b2.f3852e = dVar16;
                }
                c0317b2.f3861p = c0317b2.f3860o && c0317b2.f3859n;
                z2 = true;
            }
            c0317b2.f3862q = z2;
            if (arrayList4 == null || arrayList4.contains(dVar16)) {
                d dVar22 = c0317b2.f3851c;
                d dVar23 = c0317b2.f3850b;
                d dVar24 = c0317b2.d;
                d dVar25 = c0317b2.f3852e;
                float f5 = c0317b2.f3856k;
                boolean z9 = eVar2.f3921p0[i] == 2;
                if (i == 0) {
                    int i29 = dVar25.f3908i0;
                    boolean z10 = i29 == 0;
                    z5 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    dVar = dVar16;
                    z4 = z10;
                } else {
                    int i30 = dVar25.f3910j0;
                    boolean z11 = i30 == 0;
                    boolean z12 = i30 == 1;
                    z3 = i30 == 2;
                    f2 = f5;
                    dVar = dVar16;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    cVarArr = eVar2.f3884Q;
                    if (z13) {
                        break;
                    }
                    c cVar9 = dVar.f3884Q[i3];
                    int i31 = z3 ? 1 : 4;
                    int e2 = cVar9.e();
                    boolean z14 = z13;
                    int[] iArr = dVar.f3921p0;
                    int i32 = i2;
                    C0317b[] c0317bArr3 = c0317bArr;
                    boolean z15 = iArr[i] == 3 && dVar.f3925t[i] == 0;
                    c cVar10 = cVar9.f3867f;
                    if (cVar10 != null && dVar != dVar16) {
                        e2 = cVar10.e() + e2;
                    }
                    int i33 = e2;
                    if (!z3 || dVar == dVar16 || dVar == dVar23) {
                        dVar11 = dVar25;
                    } else {
                        dVar11 = dVar25;
                        i31 = 8;
                    }
                    c cVar11 = cVar9.f3867f;
                    if (cVar11 != null) {
                        if (dVar == dVar23) {
                            dVar12 = dVar16;
                            c0317b = c0317b2;
                            c0307c.f(cVar9.i, cVar11.i, i33, 6);
                        } else {
                            c0317b = c0317b2;
                            dVar12 = dVar16;
                            c0307c.f(cVar9.i, cVar11.i, i33, 8);
                        }
                        if (z15 && !z3) {
                            i31 = 5;
                        }
                        c0307c.e(cVar9.i, cVar9.f3867f.i, i33, (dVar == dVar23 && z3 && dVar.f3886S[i]) ? 5 : i31);
                    } else {
                        c0317b = c0317b2;
                        dVar12 = dVar16;
                    }
                    c[] cVarArr4 = dVar.f3884Q;
                    if (z9) {
                        if (dVar.f3906g0 == 8 || iArr[i] != 3) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            c0307c.f(cVarArr4[i3 + 1].i, cVarArr4[i3].i, 0, 5);
                        }
                        c0307c.f(cVarArr4[i3].i, cVarArr[i3].i, i14, 8);
                    }
                    c cVar12 = cVarArr4[i3 + 1].f3867f;
                    if (cVar12 != null) {
                        dVar13 = cVar12.d;
                        c cVar13 = dVar13.f3884Q[i3].f3867f;
                        if (cVar13 != null) {
                        }
                    }
                    dVar13 = null;
                    if (dVar13 != null) {
                        dVar = dVar13;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    dVar25 = dVar11;
                    i2 = i32;
                    c0317bArr = c0317bArr3;
                    dVar16 = dVar12;
                    c0317b2 = c0317b;
                }
                C0317b c0317b3 = c0317b2;
                d dVar26 = dVar25;
                d dVar27 = dVar16;
                i5 = i2;
                c0317bArr2 = c0317bArr;
                if (dVar24 != null) {
                    int i34 = i3 + 1;
                    if (dVar22.f3884Q[i34].f3867f != null) {
                        c cVar14 = dVar24.f3884Q[i34];
                        if (dVar24.f3921p0[i] == 3 && dVar24.f3925t[i] == 0 && !z3) {
                            c cVar15 = cVar14.f3867f;
                            if (cVar15.d == eVar2) {
                                c0307c.e(cVar14.i, cVar15.i, -cVar14.e(), 5);
                                c0307c.g(cVar14.i, dVar22.f3884Q[i34].f3867f.i, -cVar14.e(), 6);
                                if (z9) {
                                    int i35 = i3 + 1;
                                    C0310f c0310f6 = cVarArr[i35].i;
                                    c cVar16 = dVar22.f3884Q[i35];
                                    c0307c.f(c0310f6, cVar16.i, cVar16.e(), 8);
                                }
                                arrayList2 = c0317b3.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f6 = (c0317b3.f3859n || c0317b3.f3861p) ? f2 : c0317b3.f3855j;
                                    d dVar28 = null;
                                    float f7 = RecyclerView.f1937A0;
                                    i12 = 0;
                                    while (i12 < size) {
                                        d dVar29 = (d) arrayList2.get(i12);
                                        float f8 = dVar29.f3912k0[i];
                                        c[] cVarArr5 = dVar29.f3884Q;
                                        if (f8 < RecyclerView.f1937A0) {
                                            if (c0317b3.f3861p) {
                                                C0310f c0310f7 = cVarArr5[i3 + 1].i;
                                                C0310f c0310f8 = cVarArr5[i3].i;
                                                z6 = false;
                                                c0307c.e(c0310f7, c0310f8, 0, 4);
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                i12++;
                                                size = i13;
                                                arrayList2 = arrayList3;
                                            } else {
                                                f8 = 1.0f;
                                            }
                                        }
                                        if (f8 == RecyclerView.f1937A0) {
                                            C0310f c0310f9 = cVarArr5[i3 + 1].i;
                                            C0310f c0310f10 = cVarArr5[i3].i;
                                            z6 = false;
                                            c0307c.e(c0310f9, c0310f10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i13 = size;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (dVar28 != null) {
                                                c[] cVarArr6 = dVar28.f3884Q;
                                                C0310f c0310f11 = cVarArr6[i3].i;
                                                int i36 = i3 + 1;
                                                C0310f c0310f12 = cVarArr6[i36].i;
                                                arrayList3 = arrayList2;
                                                C0310f c0310f13 = cVarArr5[i3].i;
                                                C0310f c0310f14 = cVarArr5[i36].i;
                                                i13 = size;
                                                C0306b l2 = c0307c.l();
                                                dVar10 = dVar29;
                                                l2.f3719b = RecyclerView.f1937A0;
                                                if (f6 == RecyclerView.f1937A0 || f7 == f8) {
                                                    f3 = f8;
                                                    l2.d.g(c0310f11, 1.0f);
                                                    l2.d.g(c0310f12, -1.0f);
                                                    l2.d.g(c0310f14, 1.0f);
                                                    l2.d.g(c0310f13, -1.0f);
                                                } else {
                                                    if (f7 == RecyclerView.f1937A0) {
                                                        l2.d.g(c0310f11, 1.0f);
                                                        l2.d.g(c0310f12, -1.0f);
                                                    } else if (f8 == RecyclerView.f1937A0) {
                                                        l2.d.g(c0310f13, 1.0f);
                                                        l2.d.g(c0310f14, -1.0f);
                                                    } else {
                                                        float f9 = (f7 / f6) / (f8 / f6);
                                                        f3 = f8;
                                                        l2.d.g(c0310f11, 1.0f);
                                                        l2.d.g(c0310f12, -1.0f);
                                                        l2.d.g(c0310f14, f9);
                                                        l2.d.g(c0310f13, -f9);
                                                    }
                                                    f3 = f8;
                                                }
                                                c0307c.c(l2);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i13 = size;
                                                f3 = f8;
                                                dVar10 = dVar29;
                                            }
                                            f7 = f3;
                                            dVar28 = dVar10;
                                            i12++;
                                            size = i13;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (dVar23 == null && (dVar23 == dVar24 || z3)) {
                                    c cVar17 = dVar27.f3884Q[i3];
                                    int i37 = i3 + 1;
                                    c cVar18 = dVar22.f3884Q[i37];
                                    c cVar19 = cVar17.f3867f;
                                    C0310f c0310f15 = cVar19 != null ? cVar19.i : null;
                                    c cVar20 = cVar18.f3867f;
                                    C0310f c0310f16 = cVar20 != null ? cVar20.i : null;
                                    c cVar21 = dVar23.f3884Q[i3];
                                    if (dVar24 != null) {
                                        cVar18 = dVar24.f3884Q[i37];
                                    }
                                    if (c0310f15 == null || c0310f16 == null) {
                                        dVar2 = dVar24;
                                        i6 = i4;
                                    } else {
                                        dVar2 = dVar24;
                                        i6 = i4;
                                        c0307c.b(cVar21.i, c0310f15, cVar21.e(), i == 0 ? dVar26.f3900d0 : dVar26.f3902e0, c0310f16, cVar18.i, cVar18.e(), 7);
                                    }
                                } else {
                                    dVar2 = dVar24;
                                    i6 = i4;
                                    if (z4 || dVar23 == null) {
                                        int i38 = 8;
                                        if (z5 && dVar23 != null) {
                                            int i39 = c0317b3.f3855j;
                                            boolean z16 = i39 <= 0 && c0317b3.i == i39;
                                            d dVar30 = dVar23;
                                            dVar3 = dVar30;
                                            while (dVar3 != null) {
                                                d dVar31 = dVar3.f3916m0[i];
                                                while (dVar31 != null && dVar31.f3906g0 == i38) {
                                                    dVar31 = dVar31.f3916m0[i];
                                                }
                                                if (dVar3 == dVar23 || dVar3 == dVar2 || dVar31 == null) {
                                                    dVar4 = dVar30;
                                                    i9 = i6;
                                                    i10 = i38;
                                                } else {
                                                    d dVar32 = dVar31 == dVar2 ? null : dVar31;
                                                    c[] cVarArr7 = dVar3.f3884Q;
                                                    c cVar22 = cVarArr7[i3];
                                                    C0310f c0310f17 = cVar22.i;
                                                    int i40 = i3 + 1;
                                                    C0310f c0310f18 = dVar30.f3884Q[i40].i;
                                                    int e3 = cVar22.e();
                                                    int e4 = cVarArr7[i40].e();
                                                    if (dVar32 != null) {
                                                        cVar3 = dVar32.f3884Q[i3];
                                                        c0310f = cVar3.i;
                                                        dVar5 = dVar32;
                                                        c cVar23 = cVar3.f3867f;
                                                        c0310f2 = cVar23 != null ? cVar23.i : null;
                                                    } else {
                                                        dVar5 = dVar32;
                                                        c cVar24 = dVar2.f3884Q[i3];
                                                        c0310f = cVar24 != null ? cVar24.i : null;
                                                        c0310f2 = cVarArr7[i40].i;
                                                        cVar3 = cVar24;
                                                    }
                                                    int e5 = cVar3 != null ? cVar3.e() + e4 : e4;
                                                    int e6 = dVar30.f3884Q[i40].e() + e3;
                                                    int i41 = z16 ? 8 : 4;
                                                    if (c0310f17 == null || c0310f18 == null || c0310f == null || c0310f2 == null) {
                                                        dVar4 = dVar30;
                                                        i9 = i6;
                                                        i10 = 8;
                                                    } else {
                                                        dVar4 = dVar30;
                                                        int i42 = e5;
                                                        i9 = i6;
                                                        i10 = 8;
                                                        c0307c.b(c0310f17, c0310f18, e6, 0.5f, c0310f, c0310f2, i42, i41);
                                                    }
                                                    dVar31 = dVar5;
                                                }
                                                dVar30 = dVar3.f3906g0 != i10 ? dVar3 : dVar4;
                                                dVar3 = dVar31;
                                                i38 = i10;
                                                i6 = i9;
                                            }
                                            i7 = i6;
                                            c cVar25 = dVar23.f3884Q[i3];
                                            cVar = dVar27.f3884Q[i3].f3867f;
                                            int i43 = i3 + 1;
                                            c cVar26 = dVar2.f3884Q[i43];
                                            cVar2 = dVar22.f3884Q[i43].f3867f;
                                            if (cVar != null) {
                                                if (dVar23 != dVar2) {
                                                    c0307c.e(cVar25.i, cVar.i, cVar25.e(), 5);
                                                } else if (cVar2 != null) {
                                                    i8 = 5;
                                                    c0307c.b(cVar25.i, cVar.i, cVar25.e(), 0.5f, cVar26.i, cVar2.i, cVar26.e(), 5);
                                                    if (cVar2 != null && dVar23 != dVar2) {
                                                        c0307c.e(cVar26.i, cVar2.i, -cVar26.e(), i8);
                                                    }
                                                    if ((!z4 || z5) && dVar23 != null && dVar23 != dVar2) {
                                                        c[] cVarArr8 = dVar23.f3884Q;
                                                        cVar5 = cVarArr8[i3];
                                                        dVar9 = dVar2 != null ? dVar23 : dVar2;
                                                        i11 = i3 + 1;
                                                        cVarArr2 = dVar9.f3884Q;
                                                        cVar6 = cVarArr2[i11];
                                                        c cVar27 = cVar5.f3867f;
                                                        c0310f4 = cVar27 == null ? cVar27.i : null;
                                                        c cVar28 = cVar6.f3867f;
                                                        c0310f5 = cVar28 == null ? cVar28.i : null;
                                                        if (dVar22 != dVar9) {
                                                            c cVar29 = dVar22.f3884Q[i11].f3867f;
                                                            c0310f5 = cVar29 != null ? cVar29.i : null;
                                                        }
                                                        if (dVar23 == dVar9) {
                                                            cVar6 = cVarArr8[i11];
                                                        }
                                                        if (c0310f4 != null && c0310f5 != null) {
                                                            c0307c.b(cVar5.i, c0310f4, cVar5.e(), 0.5f, c0310f5, cVar6.i, cVarArr2[i11].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            if (cVar2 != null) {
                                                c0307c.e(cVar26.i, cVar2.i, -cVar26.e(), i8);
                                            }
                                            if (!z4) {
                                            }
                                            c[] cVarArr82 = dVar23.f3884Q;
                                            cVar5 = cVarArr82[i3];
                                            if (dVar2 != null) {
                                            }
                                            i11 = i3 + 1;
                                            cVarArr2 = dVar9.f3884Q;
                                            cVar6 = cVarArr2[i11];
                                            c cVar272 = cVar5.f3867f;
                                            if (cVar272 == null) {
                                            }
                                            c cVar282 = cVar6.f3867f;
                                            if (cVar282 == null) {
                                            }
                                            if (dVar22 != dVar9) {
                                            }
                                            if (dVar23 == dVar9) {
                                            }
                                            if (c0310f4 != null) {
                                                c0307c.b(cVar5.i, c0310f4, cVar5.e(), 0.5f, c0310f5, cVar6.i, cVarArr2[i11].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i44 = c0317b3.f3855j;
                                        boolean z17 = i44 > 0 && c0317b3.i == i44;
                                        d dVar33 = dVar23;
                                        for (d dVar34 = dVar33; dVar34 != null; dVar34 = dVar7) {
                                            d dVar35 = dVar34.f3916m0[i];
                                            while (dVar35 != null && dVar35.f3906g0 == 8) {
                                                dVar35 = dVar35.f3916m0[i];
                                            }
                                            if (dVar35 != null || dVar34 == dVar2) {
                                                c[] cVarArr9 = dVar34.f3884Q;
                                                c cVar30 = cVarArr9[i3];
                                                C0310f c0310f19 = cVar30.i;
                                                c cVar31 = cVar30.f3867f;
                                                C0310f c0310f20 = cVar31 != null ? cVar31.i : null;
                                                if (dVar33 != dVar34) {
                                                    c0310f20 = dVar33.f3884Q[i3 + 1].i;
                                                } else if (dVar34 == dVar23) {
                                                    c cVar32 = dVar27.f3884Q[i3].f3867f;
                                                    c0310f20 = cVar32 != null ? cVar32.i : null;
                                                }
                                                int e7 = cVar30.e();
                                                int i45 = i3 + 1;
                                                int e8 = cVarArr9[i45].e();
                                                if (dVar35 != null) {
                                                    cVar4 = dVar35.f3884Q[i3];
                                                    c0310f3 = cVar4.i;
                                                } else {
                                                    cVar4 = dVar22.f3884Q[i45].f3867f;
                                                    c0310f3 = cVar4 != null ? cVar4.i : null;
                                                }
                                                C0310f c0310f21 = cVarArr9[i45].i;
                                                if (cVar4 != null) {
                                                    e8 = cVar4.e() + e8;
                                                }
                                                int e9 = dVar33.f3884Q[i45].e() + e7;
                                                if (c0310f19 != null && c0310f20 != null && c0310f3 != null && c0310f21 != null) {
                                                    if (dVar34 == dVar23) {
                                                        e9 = dVar23.f3884Q[i3].e();
                                                    }
                                                    if (dVar34 == dVar2) {
                                                        e8 = dVar2.f3884Q[i45].e();
                                                    }
                                                    C0310f c0310f22 = c0310f20;
                                                    int i46 = e9;
                                                    C0310f c0310f23 = c0310f3;
                                                    dVar6 = dVar33;
                                                    int i47 = e8;
                                                    dVar7 = dVar35;
                                                    dVar8 = dVar34;
                                                    c0307c.b(c0310f19, c0310f22, i46, 0.5f, c0310f23, c0310f21, i47, z17 ? 8 : 5);
                                                    dVar33 = dVar8.f3906g0 == 8 ? dVar8 : dVar6;
                                                }
                                            }
                                            dVar7 = dVar35;
                                            dVar6 = dVar33;
                                            dVar8 = dVar34;
                                            if (dVar8.f3906g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i7 = i6;
                                if (!z4) {
                                }
                                c[] cVarArr822 = dVar23.f3884Q;
                                cVar5 = cVarArr822[i3];
                                if (dVar2 != null) {
                                }
                                i11 = i3 + 1;
                                cVarArr2 = dVar9.f3884Q;
                                cVar6 = cVarArr2[i11];
                                c cVar2722 = cVar5.f3867f;
                                if (cVar2722 == null) {
                                }
                                c cVar2822 = cVar6.f3867f;
                                if (cVar2822 == null) {
                                }
                                if (dVar22 != dVar9) {
                                }
                                if (dVar23 == dVar9) {
                                }
                                if (c0310f4 != null) {
                                }
                            }
                        }
                        if (z3) {
                            c cVar33 = cVar14.f3867f;
                            if (cVar33.d == eVar2) {
                                c0307c.e(cVar14.i, cVar33.i, -cVar14.e(), 4);
                            }
                        }
                        c0307c.g(cVar14.i, dVar22.f3884Q[i34].f3867f.i, -cVar14.e(), 6);
                        if (z9) {
                        }
                        arrayList2 = c0317b3.h;
                        if (arrayList2 != null) {
                            if (c0317b3.f3859n) {
                            }
                            d dVar282 = null;
                            float f72 = RecyclerView.f1937A0;
                            i12 = 0;
                            while (i12 < size) {
                            }
                        }
                        if (dVar23 == null) {
                        }
                        dVar2 = dVar24;
                        i6 = i4;
                        if (z4) {
                        }
                        int i382 = 8;
                        if (z5) {
                            int i392 = c0317b3.f3855j;
                            if (i392 <= 0) {
                            }
                            d dVar302 = dVar23;
                            dVar3 = dVar302;
                            while (dVar3 != null) {
                            }
                            i7 = i6;
                            c cVar252 = dVar23.f3884Q[i3];
                            cVar = dVar27.f3884Q[i3].f3867f;
                            int i432 = i3 + 1;
                            c cVar262 = dVar2.f3884Q[i432];
                            cVar2 = dVar22.f3884Q[i432].f3867f;
                            if (cVar != null) {
                            }
                            i8 = 5;
                            if (cVar2 != null) {
                            }
                            if (!z4) {
                            }
                            c[] cVarArr8222 = dVar23.f3884Q;
                            cVar5 = cVarArr8222[i3];
                            if (dVar2 != null) {
                            }
                            i11 = i3 + 1;
                            cVarArr2 = dVar9.f3884Q;
                            cVar6 = cVarArr2[i11];
                            c cVar27222 = cVar5.f3867f;
                            if (cVar27222 == null) {
                            }
                            c cVar28222 = cVar6.f3867f;
                            if (cVar28222 == null) {
                            }
                            if (dVar22 != dVar9) {
                            }
                            if (dVar23 == dVar9) {
                            }
                            if (c0310f4 != null) {
                            }
                        }
                        i7 = i6;
                        if (!z4) {
                        }
                        c[] cVarArr82222 = dVar23.f3884Q;
                        cVar5 = cVarArr82222[i3];
                        if (dVar2 != null) {
                        }
                        i11 = i3 + 1;
                        cVarArr2 = dVar9.f3884Q;
                        cVar6 = cVarArr2[i11];
                        c cVar272222 = cVar5.f3867f;
                        if (cVar272222 == null) {
                        }
                        c cVar282222 = cVar6.f3867f;
                        if (cVar282222 == null) {
                        }
                        if (dVar22 != dVar9) {
                        }
                        if (dVar23 == dVar9) {
                        }
                        if (c0310f4 != null) {
                        }
                    }
                }
                if (z9) {
                }
                arrayList2 = c0317b3.h;
                if (arrayList2 != null) {
                }
                if (dVar23 == null) {
                }
                dVar2 = dVar24;
                i6 = i4;
                if (z4) {
                }
                int i3822 = 8;
                if (z5) {
                }
                i7 = i6;
                if (!z4) {
                }
                c[] cVarArr822222 = dVar23.f3884Q;
                cVar5 = cVarArr822222[i3];
                if (dVar2 != null) {
                }
                i11 = i3 + 1;
                cVarArr2 = dVar9.f3884Q;
                cVar6 = cVarArr2[i11];
                c cVar2722222 = cVar5.f3867f;
                if (cVar2722222 == null) {
                }
                c cVar2822222 = cVar6.f3867f;
                if (cVar2822222 == null) {
                }
                if (dVar22 != dVar9) {
                }
                if (dVar23 == dVar9) {
                }
                if (c0310f4 != null) {
                }
            } else {
                i5 = i2;
                c0317bArr2 = c0317bArr;
                i7 = i4;
            }
            i17 = i7 + 1;
            i16 = 2;
            eVar2 = eVar;
            arrayList4 = arrayList;
            i2 = i5;
            c0317bArr = c0317bArr2;
        }
    }

    public static void b(e eVar, C0307c c0307c, d dVar) {
        dVar.f3919o = -1;
        dVar.f3920p = -1;
        int i = eVar.f3921p0[0];
        int[] iArr = dVar.f3921p0;
        if (i != 2 && iArr[0] == 4) {
            c cVar = dVar.f3876I;
            int i2 = cVar.f3868g;
            int q2 = eVar.q();
            c cVar2 = dVar.f3878K;
            int i3 = q2 - cVar2.f3868g;
            cVar.i = c0307c.k(cVar);
            cVar2.i = c0307c.k(cVar2);
            c0307c.d(cVar.i, i2);
            c0307c.d(cVar2.i, i3);
            dVar.f3919o = 2;
            dVar.f3892Y = i2;
            int i4 = i3 - i2;
            dVar.f3888U = i4;
            int i5 = dVar.f3897b0;
            if (i4 < i5) {
                dVar.f3888U = i5;
            }
        }
        if (eVar.f3921p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        c cVar3 = dVar.f3877J;
        int i6 = cVar3.f3868g;
        int k2 = eVar.k();
        c cVar4 = dVar.f3879L;
        int i7 = k2 - cVar4.f3868g;
        cVar3.i = c0307c.k(cVar3);
        cVar4.i = c0307c.k(cVar4);
        c0307c.d(cVar3.i, i6);
        c0307c.d(cVar4.i, i7);
        if (dVar.f3895a0 > 0 || dVar.f3906g0 == 8) {
            c cVar5 = dVar.f3880M;
            C0310f k3 = c0307c.k(cVar5);
            cVar5.i = k3;
            c0307c.d(k3, dVar.f3895a0 + i6);
        }
        dVar.f3920p = 2;
        dVar.f3893Z = i6;
        int i8 = i7 - i6;
        dVar.f3889V = i8;
        int i9 = dVar.f3899c0;
        if (i8 < i9) {
            dVar.f3889V = i9;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
