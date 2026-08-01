package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import s.C0295c;
import s.C0296d;
import s.C0297e;
import s.f;
import s.g;
import s.h;
import t.C0300b;
import v.C0324f;
import v.r;
import v.t;

/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: j, reason: collision with root package name */
    public final g f1310j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3913a = new int[32];
        this.f3918g = new HashMap();
        this.f3915c = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f3672s0 = 0;
        gVar.f3673t0 = 0;
        gVar.f3674u0 = 0;
        gVar.f3675v0 = 0;
        gVar.f3676w0 = 0;
        gVar.f3677x0 = 0;
        gVar.y0 = false;
        gVar.f3678z0 = 0;
        gVar.f3647A0 = 0;
        gVar.f3648B0 = new C0300b();
        gVar.f3649C0 = null;
        gVar.D0 = -1;
        gVar.f3650E0 = -1;
        gVar.f3651F0 = -1;
        gVar.f3652G0 = -1;
        gVar.f3653H0 = -1;
        gVar.f3654I0 = -1;
        gVar.f3655J0 = 0.5f;
        gVar.f3656K0 = 0.5f;
        gVar.f3657L0 = 0.5f;
        gVar.f3658M0 = 0.5f;
        gVar.f3659N0 = 0.5f;
        gVar.f3660O0 = 0.5f;
        gVar.f3661P0 = 0;
        gVar.f3662Q0 = 0;
        gVar.f3663R0 = 2;
        gVar.f3664S0 = 2;
        gVar.f3665T0 = 0;
        gVar.f3666U0 = -1;
        gVar.f3667V0 = 0;
        gVar.f3668W0 = new ArrayList();
        gVar.f3669X0 = null;
        gVar.Y0 = null;
        gVar.Z0 = null;
        gVar.f3671b1 = 0;
        this.f1310j = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4098b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1310j.f3667V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f1310j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f3672s0 = dimensionPixelSize;
                    gVar2.f3673t0 = dimensionPixelSize;
                    gVar2.f3674u0 = dimensionPixelSize;
                    gVar2.f3675v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f1310j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f3674u0 = dimensionPixelSize2;
                    gVar3.f3676w0 = dimensionPixelSize2;
                    gVar3.f3677x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1310j.f3675v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1310j.f3676w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1310j.f3672s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1310j.f3677x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1310j.f3673t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1310j.f3665T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1310j.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1310j.f3650E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1310j.f3651F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1310j.f3653H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1310j.f3652G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1310j.f3654I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1310j.f3655J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1310j.f3657L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1310j.f3659N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1310j.f3658M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1310j.f3660O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1310j.f3656K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1310j.f3663R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1310j.f3664S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1310j.f3661P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1310j.f3662Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1310j.f3666U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.f1310j;
        i();
    }

    @Override // v.AbstractC0321c
    public final void h(C0296d c0296d, boolean z2) {
        g gVar = this.f1310j;
        int i = gVar.f3674u0;
        if (i > 0 || gVar.f3675v0 > 0) {
            if (z2) {
                gVar.f3676w0 = gVar.f3675v0;
                gVar.f3677x0 = i;
            } else {
                gVar.f3676w0 = i;
                gVar.f3677x0 = gVar.f3675v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x07b2  */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // v.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g gVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        f fVar;
        char c2;
        ?? r2;
        int i12;
        int i13;
        int i14;
        int[] iArr2;
        int i15;
        int i16;
        C0296d[] c0296dArr;
        int i17;
        int i18;
        ArrayList arrayList;
        int[] iArr3;
        C0296d c0296d;
        int i19;
        int i20;
        int i21;
        int i22;
        Object obj;
        C0296d c0296d2;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList2;
        int i26;
        int i27;
        int i28;
        C0296d c0296d3;
        int i29;
        int i30;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (gVar.f3686r0 > 0) {
            C0296d c0296d4 = gVar.f3567T;
            C0324f c0324f = c0296d4 != null ? ((C0297e) c0296d4).f3627u0 : null;
            if (c0324f == null) {
                gVar.f3678z0 = 0;
                gVar.f3647A0 = 0;
                gVar.y0 = false;
                setMeasuredDimension(gVar.f3678z0, gVar.f3647A0);
            }
            for (int i31 = 0; i31 < gVar.f3686r0; i31++) {
                C0296d c0296d5 = gVar.f3685q0[i31];
                if (c0296d5 != null && !(c0296d5 instanceof h)) {
                    int j2 = c0296d5.j(0);
                    int j3 = c0296d5.j(1);
                    if (j2 != 3 || c0296d5.f3603r == 1 || j3 != 3 || c0296d5.f3604s == 1) {
                        if (j2 == 3) {
                            j2 = 2;
                        }
                        if (j3 == 3) {
                            j3 = 2;
                        }
                        C0300b c0300b = gVar.f3648B0;
                        c0300b.f3702a = j2;
                        c0300b.f3703b = j3;
                        c0300b.f3704c = c0296d5.q();
                        c0300b.d = c0296d5.k();
                        c0324f.b(c0296d5, c0300b);
                        c0296d5.O(c0300b.f3705e);
                        c0296d5.L(c0300b.f3706f);
                        c0296d5.I(c0300b.f3707g);
                    }
                }
            }
        }
        int i32 = gVar.f3676w0;
        int i33 = gVar.f3677x0;
        int i34 = gVar.f3672s0;
        int i35 = gVar.f3673t0;
        int[] iArr4 = new int[2];
        int i36 = (size - i32) - i33;
        int i37 = gVar.f3667V0;
        if (i37 == 1) {
            i36 = (size2 - i34) - i35;
        }
        if (i37 == 0) {
            if (gVar.D0 == -1) {
                gVar.D0 = 0;
            }
            if (gVar.f3650E0 == -1) {
                gVar.f3650E0 = 0;
            }
        } else {
            if (gVar.D0 == -1) {
                gVar.D0 = 0;
            }
            if (gVar.f3650E0 == -1) {
                gVar.f3650E0 = 0;
            }
        }
        C0296d[] c0296dArr2 = gVar.f3685q0;
        int i38 = 0;
        int i39 = 0;
        while (true) {
            i3 = gVar.f3686r0;
            if (i38 >= i3) {
                break;
            }
            if (gVar.f3685q0[i38].f3586g0 == 8) {
                i39++;
            }
            i38++;
        }
        if (i39 > 0) {
            c0296dArr2 = new C0296d[i3 - i39];
            int i40 = 0;
            i3 = 0;
            while (i40 < gVar.f3686r0) {
                C0296d c0296d6 = gVar.f3685q0[i40];
                int i41 = i36;
                int[] iArr5 = iArr4;
                if (c0296d6.f3586g0 != 8) {
                    c0296dArr2[i3] = c0296d6;
                    i3++;
                }
                i40++;
                i36 = i41;
                iArr4 = iArr5;
            }
        }
        int i42 = i36;
        int[] iArr6 = iArr4;
        int i43 = i3;
        C0296d[] c0296dArr3 = c0296dArr2;
        gVar.f3670a1 = c0296dArr3;
        gVar.f3671b1 = i43;
        int i44 = gVar.f3665T0;
        ArrayList arrayList3 = gVar.f3668W0;
        if (i44 != 0) {
            C0295c c0295c = gVar.f3557J;
            C0295c c0295c2 = gVar.f3556I;
            C0295c c0295c3 = gVar.f3558K;
            C0295c c0295c4 = gVar.f3559L;
            int[] iArr7 = gVar.f3601p0;
            if (i44 == 1) {
                i4 = i35;
                i5 = i34;
                i6 = i33;
                i7 = i32;
                i8 = mode;
                i9 = size;
                i10 = mode2;
                i11 = size2;
                iArr = iArr6;
                ArrayList arrayList4 = arrayList3;
                int i45 = gVar.f3667V0;
                if (i43 != 0) {
                    arrayList4.clear();
                    f fVar2 = new f(gVar, i45, gVar.f3556I, gVar.f3557J, gVar.f3558K, gVar.f3559L, i42);
                    arrayList4.add(fVar2);
                    if (i45 == 0) {
                        f fVar3 = fVar2;
                        i16 = 0;
                        int i46 = 0;
                        int i47 = 0;
                        while (i47 < i43) {
                            C0296d c0296d7 = c0296dArr3[i47];
                            int U2 = gVar.U(c0296d7, i42);
                            if (c0296d7.f3601p0[0] == 3) {
                                i16++;
                            }
                            int i48 = i16;
                            boolean z2 = (i46 == i42 || (gVar.f3661P0 + i46) + U2 > i42) && fVar3.f3633b != null;
                            if (!z2 && i47 > 0 && (i20 = gVar.f3666U0) > 0 && i47 % i20 == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                iArr3 = iArr7;
                                c0296d = c0296d7;
                                i19 = i45;
                                f fVar4 = new f(gVar, i45, gVar.f3556I, gVar.f3557J, gVar.f3558K, gVar.f3559L, i42);
                                fVar4.f3642n = i47;
                                arrayList4.add(fVar4);
                                fVar3 = fVar4;
                            } else {
                                iArr3 = iArr7;
                                c0296d = c0296d7;
                                i19 = i45;
                                if (i47 > 0) {
                                    i46 = gVar.f3661P0 + U2 + i46;
                                    fVar3.a(c0296d);
                                    i47++;
                                    i16 = i48;
                                    iArr7 = iArr3;
                                    i45 = i19;
                                }
                            }
                            i46 = U2;
                            fVar3.a(c0296d);
                            i47++;
                            i16 = i48;
                            iArr7 = iArr3;
                            i45 = i19;
                        }
                        iArr2 = iArr7;
                        i15 = i45;
                    } else {
                        iArr2 = iArr7;
                        i15 = i45;
                        f fVar5 = fVar2;
                        int i49 = 0;
                        i16 = 0;
                        int i50 = 0;
                        while (i49 < i43) {
                            C0296d c0296d8 = c0296dArr3[i49];
                            int T2 = gVar.T(c0296d8, i42);
                            if (c0296d8.f3601p0[1] == 3) {
                                i16++;
                            }
                            int i51 = i16;
                            boolean z3 = (i50 == i42 || (gVar.f3662Q0 + i50) + T2 > i42) && fVar5.f3633b != null;
                            if (!z3 && i49 > 0 && (i17 = gVar.f3666U0) > 0 && i49 % i17 == 0) {
                                z3 = true;
                            }
                            if (z3) {
                                c0296dArr = c0296dArr3;
                                f fVar6 = new f(gVar, i15, gVar.f3556I, gVar.f3557J, gVar.f3558K, gVar.f3559L, i42);
                                fVar6.f3642n = i49;
                                arrayList4.add(fVar6);
                                i50 = T2;
                                fVar5 = fVar6;
                            } else {
                                c0296dArr = c0296dArr3;
                                i50 = i49 > 0 ? gVar.f3662Q0 + T2 + i50 : T2;
                            }
                            fVar5.a(c0296d8);
                            i49++;
                            i16 = i51;
                            c0296dArr3 = c0296dArr;
                        }
                    }
                    int size3 = arrayList4.size();
                    int i52 = gVar.f3676w0;
                    int i53 = gVar.f3672s0;
                    int i54 = gVar.f3677x0;
                    int i55 = gVar.f3673t0;
                    boolean z4 = iArr2[0] == 2 || iArr2[1] == 2;
                    if (i16 > 0 && z4) {
                        for (int i56 = 0; i56 < size3; i56++) {
                            f fVar7 = (f) arrayList4.get(i56);
                            if (i15 == 0) {
                                fVar7.e(i42 - fVar7.d());
                            } else {
                                fVar7.e(i42 - fVar7.c());
                            }
                        }
                    }
                    int i57 = i53;
                    C0295c c0295c5 = c0295c2;
                    C0295c c0295c6 = c0295c3;
                    C0295c c0295c7 = c0295c4;
                    int i58 = 0;
                    int i59 = 0;
                    int i60 = 0;
                    int i61 = i52;
                    C0295c c0295c8 = c0295c;
                    while (i58 < size3) {
                        f fVar8 = (f) arrayList4.get(i58);
                        if (i15 == 0) {
                            if (i58 < size3 - 1) {
                                c0295c7 = ((f) arrayList4.get(i58 + 1)).f3633b.f3557J;
                                arrayList = arrayList4;
                                i55 = 0;
                            } else {
                                i55 = gVar.f3673t0;
                                arrayList = arrayList4;
                                c0295c7 = c0295c4;
                            }
                            C0295c c0295c9 = fVar8.f3633b.f3559L;
                            fVar8.f(i15, c0295c5, c0295c8, c0295c6, c0295c7, i61, i57, i54, i55, i42);
                            int max = Math.max(i59, fVar8.d());
                            int c3 = fVar8.c() + i60;
                            if (i58 > 0) {
                                c3 += gVar.f3662Q0;
                            }
                            i18 = size3;
                            i59 = max;
                            i60 = c3;
                            c0295c8 = c0295c9;
                            arrayList4 = arrayList;
                            i57 = 0;
                        } else {
                            ArrayList arrayList5 = arrayList4;
                            if (i58 < size3 - 1) {
                                arrayList4 = arrayList5;
                                i18 = size3;
                                c0295c6 = ((f) arrayList4.get(i58 + 1)).f3633b.f3556I;
                                i54 = 0;
                            } else {
                                arrayList4 = arrayList5;
                                i54 = gVar.f3677x0;
                                i18 = size3;
                                c0295c6 = c0295c3;
                            }
                            C0295c c0295c10 = fVar8.f3633b.f3558K;
                            fVar8.f(i15, c0295c5, c0295c8, c0295c6, c0295c7, i61, i57, i54, i55, i42);
                            int d = fVar8.d() + i59;
                            int max2 = Math.max(i60, fVar8.c());
                            if (i58 > 0) {
                                d += gVar.f3661P0;
                            }
                            i59 = d;
                            i60 = max2;
                            i61 = 0;
                            c0295c5 = c0295c10;
                        }
                        i58++;
                        size3 = i18;
                    }
                    iArr[0] = i59;
                    iArr[1] = i60;
                }
            } else if (i44 != 2) {
                if (i44 == 3) {
                    int i62 = gVar.f3667V0;
                    if (i43 != 0) {
                        arrayList3.clear();
                        i11 = size2;
                        int i63 = i42;
                        iArr = iArr6;
                        i4 = i35;
                        i5 = i34;
                        i6 = i33;
                        i7 = i32;
                        i10 = mode2;
                        ArrayList arrayList6 = arrayList3;
                        f fVar9 = new f(gVar, i62, gVar.f3556I, gVar.f3557J, gVar.f3558K, gVar.f3559L, i63);
                        arrayList6.add(fVar9);
                        if (i62 == 0) {
                            int i64 = 0;
                            i23 = 0;
                            int i65 = 0;
                            int i66 = 0;
                            while (i66 < i43) {
                                int i67 = i64 + 1;
                                C0296d c0296d9 = c0296dArr3[i66];
                                int i68 = i63;
                                int U3 = gVar.U(c0296d9, i68);
                                if (c0296d9.f3601p0[0] == 3) {
                                    i23++;
                                }
                                int i69 = i23;
                                boolean z5 = (i65 == i68 || (gVar.f3661P0 + i65) + U3 > i68) && fVar9.f3633b != null;
                                if (!z5 && i66 > 0 && (i30 = gVar.f3666U0) > 0 && i67 > i30) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i63 = i68;
                                    i28 = size;
                                    c0296d3 = c0296d9;
                                    i27 = mode;
                                    i29 = i66;
                                    fVar9 = new f(gVar, i62, gVar.f3556I, gVar.f3557J, gVar.f3558K, gVar.f3559L, i63);
                                    fVar9.f3642n = i29;
                                    arrayList6.add(fVar9);
                                    i65 = U3;
                                    i64 = i67;
                                } else {
                                    i63 = i68;
                                    i27 = mode;
                                    i28 = size;
                                    c0296d3 = c0296d9;
                                    i29 = i66;
                                    i65 = i29 > 0 ? gVar.f3661P0 + U3 + i65 : U3;
                                    i64 = 0;
                                }
                                fVar9.a(c0296d3);
                                i66 = i29 + 1;
                                i23 = i69;
                                size = i28;
                                mode = i27;
                            }
                            i8 = mode;
                            i9 = size;
                        } else {
                            i8 = mode;
                            i9 = size;
                            int i70 = 0;
                            int i71 = 0;
                            int i72 = 0;
                            while (i72 < i43) {
                                C0296d c0296d10 = c0296dArr3[i72];
                                int i73 = i63;
                                int T3 = gVar.T(c0296d10, i73);
                                if (c0296d10.f3601p0[1] == 3) {
                                    i70++;
                                }
                                int i74 = i70;
                                boolean z6 = (i71 == i73 || (gVar.f3662Q0 + i71) + T3 > i73) && fVar9.f3633b != null;
                                if (!z6 && i72 > 0 && (i24 = gVar.f3666U0) > 0 && i24 < 0) {
                                    z6 = true;
                                }
                                if (z6) {
                                    i63 = i73;
                                    fVar9 = new f(gVar, i62, gVar.f3556I, gVar.f3557J, gVar.f3558K, gVar.f3559L, i73);
                                    fVar9.f3642n = i72;
                                    arrayList6.add(fVar9);
                                } else {
                                    i63 = i73;
                                    if (i72 > 0) {
                                        i71 = gVar.f3662Q0 + T3 + i71;
                                        fVar9.a(c0296d10);
                                        i72++;
                                        i70 = i74;
                                    }
                                }
                                i71 = T3;
                                fVar9.a(c0296d10);
                                i72++;
                                i70 = i74;
                            }
                            i23 = i70;
                        }
                        int size4 = arrayList6.size();
                        int i75 = gVar.f3676w0;
                        int i76 = gVar.f3672s0;
                        int i77 = gVar.f3677x0;
                        int i78 = gVar.f3673t0;
                        boolean z7 = iArr7[0] == 2 || iArr7[1] == 2;
                        if (i23 > 0 && z7) {
                            int i79 = 0;
                            while (i79 < size4) {
                                f fVar10 = (f) arrayList6.get(i79);
                                if (i62 == 0) {
                                    i26 = i63;
                                    fVar10.e(i26 - fVar10.d());
                                } else {
                                    i26 = i63;
                                    fVar10.e(i26 - fVar10.c());
                                }
                                i79++;
                                i63 = i26;
                            }
                        }
                        int i80 = i63;
                        C0295c c0295c11 = c0295c;
                        C0295c c0295c12 = c0295c2;
                        C0295c c0295c13 = c0295c3;
                        C0295c c0295c14 = c0295c4;
                        int i81 = 0;
                        int i82 = 0;
                        int i83 = 0;
                        while (i81 < size4) {
                            f fVar11 = (f) arrayList6.get(i81);
                            if (i62 == 0) {
                                if (i81 < size4 - 1) {
                                    c0295c14 = ((f) arrayList6.get(i81 + 1)).f3633b.f3557J;
                                    arrayList2 = arrayList6;
                                    i78 = 0;
                                } else {
                                    i78 = gVar.f3673t0;
                                    arrayList2 = arrayList6;
                                    c0295c14 = c0295c4;
                                }
                                C0295c c0295c15 = fVar11.f3633b.f3559L;
                                fVar11.f(i62, c0295c12, c0295c11, c0295c13, c0295c14, i75, i76, i77, i78, i80);
                                int max3 = Math.max(i82, fVar11.d());
                                int c4 = fVar11.c() + i83;
                                if (i81 > 0) {
                                    c4 += gVar.f3662Q0;
                                }
                                i25 = size4;
                                i82 = max3;
                                i83 = c4;
                                c0295c11 = c0295c15;
                                arrayList6 = arrayList2;
                                i76 = 0;
                            } else {
                                ArrayList arrayList7 = arrayList6;
                                if (i81 < size4 - 1) {
                                    arrayList6 = arrayList7;
                                    i25 = size4;
                                    c0295c13 = ((f) arrayList6.get(i81 + 1)).f3633b.f3556I;
                                    i77 = 0;
                                } else {
                                    arrayList6 = arrayList7;
                                    i77 = gVar.f3677x0;
                                    i25 = size4;
                                    c0295c13 = c0295c3;
                                }
                                C0295c c0295c16 = fVar11.f3633b.f3558K;
                                fVar11.f(i62, c0295c12, c0295c11, c0295c13, c0295c14, i75, i76, i77, i78, i80);
                                int d2 = fVar11.d() + i82;
                                int max4 = Math.max(i83, fVar11.c());
                                if (i81 > 0) {
                                    d2 += gVar.f3661P0;
                                }
                                i82 = d2;
                                c0295c12 = c0295c16;
                                i83 = max4;
                                i75 = 0;
                            }
                            i81++;
                            size4 = i25;
                        }
                        iArr[0] = i82;
                        iArr[1] = i83;
                    }
                }
                i4 = i35;
                i5 = i34;
                i6 = i33;
                i7 = i32;
                i8 = mode;
                i9 = size;
                i10 = mode2;
                i11 = size2;
                iArr = iArr6;
            } else {
                i4 = i35;
                i5 = i34;
                i6 = i33;
                i7 = i32;
                i8 = mode;
                i9 = size;
                i10 = mode2;
                i11 = size2;
                iArr = iArr6;
                int i84 = gVar.f3667V0;
                if (i84 == 0) {
                    int i85 = gVar.f3666U0;
                    if (i85 <= 0) {
                        int i86 = 0;
                        i22 = 0;
                        for (int i87 = 0; i87 < i43; i87++) {
                            if (i87 > 0) {
                                i86 += gVar.f3661P0;
                            }
                            C0296d c0296d11 = c0296dArr3[i87];
                            if (c0296d11 != null) {
                                int U4 = gVar.U(c0296d11, i42) + i86;
                                if (U4 > i42) {
                                    break;
                                }
                                i22++;
                                i86 = U4;
                            }
                        }
                    } else {
                        i22 = i85;
                    }
                    i21 = 0;
                } else {
                    i21 = gVar.f3666U0;
                    if (i21 <= 0) {
                        int i88 = 0;
                        int i89 = 0;
                        for (int i90 = 0; i90 < i43; i90++) {
                            if (i90 > 0) {
                                i88 += gVar.f3662Q0;
                            }
                            C0296d c0296d12 = c0296dArr3[i90];
                            if (c0296d12 != null) {
                                int T4 = gVar.T(c0296d12, i42) + i88;
                                if (T4 > i42) {
                                    break;
                                }
                                i89++;
                                i88 = T4;
                            }
                        }
                        i21 = i89;
                    }
                    i22 = 0;
                }
                if (gVar.Z0 == null) {
                    gVar.Z0 = new int[2];
                }
                boolean z8 = (i21 == 0 && i84 == 1) || (i22 == 0 && i84 == 0);
                while (!z8) {
                    if (i84 == 0) {
                        i21 = (int) Math.ceil(i43 / i22);
                    } else {
                        i22 = (int) Math.ceil(i43 / i21);
                    }
                    C0296d[] c0296dArr4 = gVar.Y0;
                    if (c0296dArr4 == null || c0296dArr4.length < i22) {
                        obj = null;
                        gVar.Y0 = new C0296d[i22];
                    } else {
                        obj = null;
                        Arrays.fill(c0296dArr4, (Object) null);
                    }
                    C0296d[] c0296dArr5 = gVar.f3669X0;
                    if (c0296dArr5 == null || c0296dArr5.length < i21) {
                        gVar.f3669X0 = new C0296d[i21];
                    } else {
                        Arrays.fill(c0296dArr5, obj);
                    }
                    for (int i91 = 0; i91 < i22; i91++) {
                        for (int i92 = 0; i92 < i21; i92++) {
                            int i93 = (i92 * i22) + i91;
                            if (i84 == 1) {
                                i93 = (i91 * i21) + i92;
                            }
                            if (i93 < c0296dArr3.length && (c0296d2 = c0296dArr3[i93]) != null) {
                                int U5 = gVar.U(c0296d2, i42);
                                C0296d c0296d13 = gVar.Y0[i91];
                                if (c0296d13 == null || c0296d13.q() < U5) {
                                    gVar.Y0[i91] = c0296d2;
                                }
                                int T5 = gVar.T(c0296d2, i42);
                                C0296d c0296d14 = gVar.f3669X0[i92];
                                if (c0296d14 == null || c0296d14.k() < T5) {
                                    gVar.f3669X0[i92] = c0296d2;
                                }
                            }
                        }
                    }
                    int i94 = 0;
                    for (int i95 = 0; i95 < i22; i95++) {
                        C0296d c0296d15 = gVar.Y0[i95];
                        if (c0296d15 != null) {
                            if (i95 > 0) {
                                i94 += gVar.f3661P0;
                            }
                            i94 = gVar.U(c0296d15, i42) + i94;
                        }
                    }
                    int i96 = 0;
                    for (int i97 = 0; i97 < i21; i97++) {
                        C0296d c0296d16 = gVar.f3669X0[i97];
                        if (c0296d16 != null) {
                            if (i97 > 0) {
                                i96 += gVar.f3662Q0;
                            }
                            i96 = gVar.T(c0296d16, i42) + i96;
                        }
                    }
                    iArr[0] = i94;
                    iArr[1] = i96;
                    if (i84 == 0) {
                        if (i94 > i42 && i22 > 1) {
                            i22--;
                        }
                        z8 = true;
                    } else {
                        if (i96 > i42 && i21 > 1) {
                            i21--;
                        }
                        z8 = true;
                    }
                }
                int[] iArr8 = gVar.Z0;
                iArr8[0] = i22;
                iArr8[1] = i21;
            }
        } else {
            i4 = i35;
            i5 = i34;
            i6 = i33;
            i7 = i32;
            i8 = mode;
            i9 = size;
            i10 = mode2;
            i11 = size2;
            iArr = iArr6;
            int i98 = gVar.f3667V0;
            if (i43 != 0) {
                if (arrayList3.size() == 0) {
                    fVar = new f(gVar, i98, gVar.f3556I, gVar.f3557J, gVar.f3558K, gVar.f3559L, i42);
                    arrayList3.add(fVar);
                } else {
                    fVar = (f) arrayList3.get(0);
                    fVar.f3634c = 0;
                    fVar.f3633b = null;
                    fVar.f3640l = 0;
                    fVar.f3641m = 0;
                    fVar.f3642n = 0;
                    fVar.f3643o = 0;
                    fVar.f3644p = 0;
                    fVar.f(i98, gVar.f3556I, gVar.f3557J, gVar.f3558K, gVar.f3559L, gVar.f3676w0, gVar.f3672s0, gVar.f3677x0, gVar.f3673t0, i42);
                }
                for (int i99 = 0; i99 < i43; i99++) {
                    fVar.a(c0296dArr3[i99]);
                }
                c2 = 0;
                iArr[0] = fVar.d();
                r2 = 1;
                iArr[1] = fVar.c();
                int i100 = iArr[c2] + i7 + i6;
                int i101 = iArr[r2] + i5 + i4;
                i12 = i8;
                if (i12 != 1073741824) {
                    i13 = i10;
                    i14 = i9;
                } else {
                    if (i12 == Integer.MIN_VALUE) {
                        i14 = Math.min(i100, i9);
                    } else if (i12 == 0) {
                        i14 = i100;
                    } else {
                        i13 = i10;
                        i14 = 0;
                    }
                    i13 = i10;
                }
                int min = i13 != 1073741824 ? i11 : i13 == Integer.MIN_VALUE ? Math.min(i101, i11) : i13 == 0 ? i101 : 0;
                gVar.f3678z0 = i14;
                gVar.f3647A0 = min;
                gVar.O(i14);
                gVar.L(min);
                gVar.y0 = gVar.f3686r0 <= 0 ? r2 : false;
                setMeasuredDimension(gVar.f3678z0, gVar.f3647A0);
            }
        }
        c2 = 0;
        r2 = 1;
        int i1002 = iArr[c2] + i7 + i6;
        int i1012 = iArr[r2] + i5 + i4;
        i12 = i8;
        if (i12 != 1073741824) {
        }
        if (i13 != 1073741824) {
        }
        gVar.f3678z0 = i14;
        gVar.f3647A0 = min;
        gVar.O(i14);
        gVar.L(min);
        gVar.y0 = gVar.f3686r0 <= 0 ? r2 : false;
        setMeasuredDimension(gVar.f3678z0, gVar.f3647A0);
    }

    @Override // v.AbstractC0321c, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.f1310j, i, i2);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f1310j.f3657L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1310j.f3651F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f1310j.f3658M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1310j.f3652G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1310j.f3663R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f1310j.f3655J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1310j.f3661P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1310j.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f1310j.f3659N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f1310j.f3653H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f1310j.f3660O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f1310j.f3654I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1310j.f3666U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1310j.f3667V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f1310j;
        gVar.f3672s0 = i;
        gVar.f3673t0 = i;
        gVar.f3674u0 = i;
        gVar.f3675v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1310j.f3673t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1310j.f3676w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1310j.f3677x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1310j.f3672s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1310j.f3664S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f1310j.f3656K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1310j.f3662Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1310j.f3650E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1310j.f3665T0 = i;
        requestLayout();
    }
}
