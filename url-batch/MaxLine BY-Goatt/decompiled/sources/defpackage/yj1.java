package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.ContentPainterElement;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class yj1 {
    public static final ng0 k;
    public static final ng0 l;
    public static final dq2 n;
    public static x01 o;
    public static x01 p;
    public static final od a = new od(Float.POSITIVE_INFINITY);
    public static final pd b = new pd(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final qd c = new qd(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final rd d = new rd(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final od e = new od(Float.NEGATIVE_INFINITY);
    public static final pd f = new pd(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final qd g = new qd(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final rd h = new rd(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final my i = new my(1292102961, new vy(), false);
    public static final int[] j = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final tt1 m = new tt1(10, new ww(20), new zd(27));

    static {
        int i2 = 1;
        k = new ng0("NULL", i2);
        l = new ng0("UNINITIALIZED", i2);
        n = new dq2(i2);
    }

    public static final gu A(Class cls) {
        cls.getClass();
        return d82.a(cls);
    }

    public static Object B(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d2.c(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (t3.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final yu C(dc dcVar) {
        yu yuVar;
        CoroutineContext coroutineContext;
        synchronized (n) {
            yuVar = (yu) dcVar.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (yuVar == null) {
                try {
                    t80 t80Var = vb0.a;
                    coroutineContext = qh1.a.r;
                } catch (IllegalStateException unused) {
                    coroutineContext = h.m;
                } catch (ws1 unused2) {
                    coroutineContext = h.m;
                }
                yu yuVar2 = new yu(coroutineContext.p(gk2.a()));
                dcVar.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", yuVar2);
                yuVar = yuVar2;
            }
        }
        return yuVar;
    }

    public static final pj1 E(cc2 cc2Var, int i2, int i3, int i4, int i5, int i6, qj1 qj1Var, List list, n12[] n12VarArr, int i7, int i8, int[] iArr, int i9) {
        int i10;
        String str;
        float f2;
        long j2;
        String str2;
        String str3;
        long j3;
        int i11;
        int i12;
        int c2;
        int i13;
        int i14;
        String str4;
        String str5;
        float f3;
        boolean z;
        int i15;
        int[] iArr2;
        int i16;
        int i17;
        List list2 = list;
        int i18 = i8;
        long j4 = i6;
        int i19 = i18 - i7;
        int[] iArr3 = new int[i19];
        int i20 = i7;
        float f4 = 0.0f;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i20 < i18) {
            jj1 jj1Var = (jj1) list2.get(i20);
            float E = z71.E(z71.B(jj1Var));
            if (E > 0.0f) {
                f4 += E;
                i21++;
                iArr2 = iArr3;
                i16 = i20;
            } else {
                int i25 = i4 - i22;
                n12 n12Var = n12VarArr[i20];
                if (n12Var == null) {
                    i16 = i20;
                    iArr2 = iArr3;
                    i17 = i21;
                    n12Var = jj1Var.c(cc2Var.d(0, i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i25 < 0 ? 0 : i25, i5, false));
                } else {
                    iArr2 = iArr3;
                    i16 = i20;
                    i17 = i21;
                }
                n12 n12Var2 = n12Var;
                int h2 = cc2Var.h(n12Var2);
                int e2 = cc2Var.e(n12Var2);
                iArr2[i16 - i7] = h2;
                int i26 = i25 - h2;
                if (i26 < 0) {
                    i26 = 0;
                }
                i23 = Math.min(i6, i26);
                i22 += h2 + i23;
                i24 = Math.max(i24, e2);
                n12VarArr[i16] = n12Var2;
                i21 = i17;
            }
            i20 = i16 + 1;
            iArr3 = iArr2;
        }
        int[] iArr4 = iArr3;
        int i27 = i21;
        int i28 = i24;
        if (i27 == 0) {
            i22 -= i23;
            i10 = i19;
            i11 = i28;
            i12 = 0;
            c2 = 0;
        } else {
            int i29 = i4 != Integer.MAX_VALUE ? i4 : i2;
            long j5 = (i27 - 1) * j4;
            float f5 = f4;
            long j6 = (i29 - i22) - j5;
            if (j6 < 0) {
                j6 = 0;
            }
            float f6 = j6 / f5;
            i10 = i19;
            long j7 = j6;
            int i30 = i7;
            while (true) {
                str = "weightedSize ";
                f2 = f6;
                j2 = j6;
                str2 = "fixedSpace ";
                str3 = "weightChildrenCount ";
                j3 = j5;
                if (i30 >= i18) {
                    break;
                }
                int i31 = i30;
                float E2 = z71.E(z71.B((jj1) list2.get(i30)));
                float f7 = f2 * E2;
                try {
                    j7 -= Math.round(f7);
                    i30 = i31 + 1;
                    list2 = list;
                    f6 = f2;
                    j6 = j2;
                    j5 = j3;
                } catch (IllegalArgumentException e3) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i4 + "mainAxisMin " + i2 + "targetSpace " + i29 + "arrangementSpacingPx " + j4 + "weightChildrenCount " + i27 + "fixedSpace " + i22 + "arrangementSpacingTotal " + j3 + "remainingToTarget " + j2 + "totalWeight " + f5 + "weightUnitSpace " + f2 + "itemWeight " + E2 + str + f7).initCause(e3);
                }
            }
            i11 = i28;
            int i32 = 0;
            int i33 = i7;
            while (i33 < i18) {
                if (n12VarArr[i33] == null) {
                    jj1 jj1Var2 = (jj1) list.get(i33);
                    i13 = i33;
                    dc2 B = z71.B(jj1Var2);
                    i14 = i22;
                    float E3 = z71.E(B);
                    if (E3 <= 0.0f) {
                        lh.g("All weights <= 0 should have placeables");
                        return null;
                    }
                    int signum = Long.signum(j7);
                    String str6 = str2;
                    String str7 = str3;
                    j7 -= signum;
                    float f8 = f2 * E3;
                    int max = Math.max(0, Math.round(f8) + signum);
                    if (B != null) {
                        try {
                            z = B.b;
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            f3 = f8;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i4 + "mainAxisMin " + i2 + "targetSpace " + i29 + "arrangementSpacingPx " + j4 + str7 + i27 + str6 + i14 + "arrangementSpacingTotal " + j3 + "remainingToTarget " + j2 + "totalWeight " + f5 + "weightUnitSpace " + f2 + "weight " + E3 + str + f3 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max).initCause(e);
                        }
                    } else {
                        z = true;
                    }
                    try {
                        if (z && max != Integer.MAX_VALUE) {
                            i15 = max;
                            f3 = f8;
                            n12 c3 = jj1Var2.c(cc2Var.d(i15, max, i5, true));
                            int h3 = cc2Var.h(c3);
                            int e5 = cc2Var.e(c3);
                            iArr4[i13 - i7] = h3;
                            i32 += h3;
                            i11 = Math.max(i11, e5);
                            n12VarArr[i13] = c3;
                            str5 = str7;
                            str4 = str6;
                        }
                        n12 c32 = jj1Var2.c(cc2Var.d(i15, max, i5, true));
                        int h32 = cc2Var.h(c32);
                        int e52 = cc2Var.e(c32);
                        iArr4[i13 - i7] = h32;
                        i32 += h32;
                        i11 = Math.max(i11, e52);
                        n12VarArr[i13] = c32;
                        str5 = str7;
                        str4 = str6;
                    } catch (IllegalArgumentException e6) {
                        e = e6;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i4 + "mainAxisMin " + i2 + "targetSpace " + i29 + "arrangementSpacingPx " + j4 + str7 + i27 + str6 + i14 + "arrangementSpacingTotal " + j3 + "remainingToTarget " + j2 + "totalWeight " + f5 + "weightUnitSpace " + f2 + "weight " + E3 + str + f3 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max).initCause(e);
                    }
                    i15 = 0;
                    f3 = f8;
                } else {
                    i13 = i33;
                    i14 = i22;
                    str4 = str2;
                    str5 = str3;
                }
                String str8 = str;
                String str9 = str5;
                i33 = i13 + 1;
                str3 = str9;
                str = str8;
                str2 = str4;
                i22 = i14;
                i18 = i8;
            }
            i12 = 0;
            c2 = d.c((int) (i32 + j3), 0, i4 - i22);
        }
        int i34 = i22 + c2;
        if (i34 < 0) {
            i34 = i12;
        }
        int max2 = Math.max(i34, i2);
        int max3 = Math.max(i11, Math.max(i3, i12));
        int i35 = i10;
        int[] iArr5 = new int[i35];
        for (int i36 = i12; i36 < i35; i36++) {
            iArr5[i36] = i12;
        }
        cc2Var.c(max2, iArr4, iArr5, qj1Var);
        return cc2Var.j(n12VarArr, qj1Var, iArr5, max2, max3, iArr, i9, i7, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean F(yo0 yo0Var, oc ocVar) {
        yo0[] yo0VarArr = new yo0[16];
        if (!yo0Var.m.z) {
            h21.b("visitChildren called on an unattached node");
        }
        eo1 eo1Var = new eo1(new ul1[16]);
        ul1 ul1Var = yo0Var.m;
        ul1 ul1Var2 = ul1Var.r;
        if (ul1Var2 == null) {
            s03.b(eo1Var, ul1Var);
        } else {
            eo1Var.b(ul1Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = eo1Var.o;
            if (i3 == 0) {
                break;
            }
            ul1 ul1Var3 = (ul1) eo1Var.l(i3 - 1);
            if ((ul1Var3.p & 1024) == 0) {
                s03.b(eo1Var, ul1Var3);
            } else {
                while (true) {
                    if (ul1Var3 == null) {
                        break;
                    }
                    if ((ul1Var3.o & 1024) != 0) {
                        eo1 eo1Var2 = null;
                        while (ul1Var3 != null) {
                            if (ul1Var3 instanceof yo0) {
                                yo0 yo0Var2 = (yo0) ul1Var3;
                                int i4 = i2 + 1;
                                if (yo0VarArr.length < i4) {
                                    int length = yo0VarArr.length;
                                    ?? r10 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(yo0VarArr, 0, r10, 0, length);
                                    yo0VarArr = r10;
                                }
                                yo0VarArr[i2] = yo0Var2;
                                i2 = i4;
                            } else if ((ul1Var3.o & 1024) != 0 && (ul1Var3 instanceof p90)) {
                                int i5 = 0;
                                for (ul1 ul1Var4 = ((p90) ul1Var3).B; ul1Var4 != null; ul1Var4 = ul1Var4.r) {
                                    if ((ul1Var4.o & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            ul1Var3 = ul1Var4;
                                        } else {
                                            if (eo1Var2 == null) {
                                                eo1Var2 = new eo1(new ul1[16]);
                                            }
                                            if (ul1Var3 != null) {
                                                eo1Var2.b(ul1Var3);
                                                ul1Var3 = null;
                                            }
                                            eo1Var2.b(ul1Var4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            ul1Var3 = s03.c(eo1Var2);
                        }
                    } else {
                        ul1Var3 = ul1Var3.r;
                    }
                }
            }
        }
        Arrays.sort(yo0VarArr, 0, i2, zo0.b);
        int i6 = i2 - 1;
        if (i6 < yo0VarArr.length) {
            while (i6 >= 0) {
                yo0 yo0Var3 = yo0VarArr[i6];
                if (j8.K(yo0Var3) && k(yo0Var3, ocVar)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean G(yo0 yo0Var, oc ocVar) {
        yo0[] yo0VarArr = new yo0[16];
        if (!yo0Var.m.z) {
            h21.b("visitChildren called on an unattached node");
        }
        eo1 eo1Var = new eo1(new ul1[16]);
        ul1 ul1Var = yo0Var.m;
        ul1 ul1Var2 = ul1Var.r;
        if (ul1Var2 == null) {
            s03.b(eo1Var, ul1Var);
        } else {
            eo1Var.b(ul1Var2);
        }
        int i2 = 0;
        while (true) {
            int i3 = eo1Var.o;
            if (i3 == 0) {
                break;
            }
            ul1 ul1Var3 = (ul1) eo1Var.l(i3 - 1);
            if ((ul1Var3.p & 1024) == 0) {
                s03.b(eo1Var, ul1Var3);
            } else {
                while (true) {
                    if (ul1Var3 == null) {
                        break;
                    }
                    if ((ul1Var3.o & 1024) != 0) {
                        eo1 eo1Var2 = null;
                        while (ul1Var3 != null) {
                            if (ul1Var3 instanceof yo0) {
                                yo0 yo0Var2 = (yo0) ul1Var3;
                                int i4 = i2 + 1;
                                if (yo0VarArr.length < i4) {
                                    int length = yo0VarArr.length;
                                    ?? r10 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(yo0VarArr, 0, r10, 0, length);
                                    yo0VarArr = r10;
                                }
                                yo0VarArr[i2] = yo0Var2;
                                i2 = i4;
                            } else if ((ul1Var3.o & 1024) != 0 && (ul1Var3 instanceof p90)) {
                                int i5 = 0;
                                for (ul1 ul1Var4 = ((p90) ul1Var3).B; ul1Var4 != null; ul1Var4 = ul1Var4.r) {
                                    if ((ul1Var4.o & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            ul1Var3 = ul1Var4;
                                        } else {
                                            if (eo1Var2 == null) {
                                                eo1Var2 = new eo1(new ul1[16]);
                                            }
                                            if (ul1Var3 != null) {
                                                eo1Var2.b(ul1Var3);
                                                ul1Var3 = null;
                                            }
                                            eo1Var2.b(ul1Var4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            ul1Var3 = s03.c(eo1Var2);
                        }
                    } else {
                        ul1Var3 = ul1Var3.r;
                    }
                }
            }
        }
        Arrays.sort(yo0VarArr, 0, i2, zo0.b);
        for (int i6 = 0; i6 < i2; i6++) {
            yo0 yo0Var3 = yo0VarArr[i6];
            if (j8.K(yo0Var3) && t(yo0Var3, ocVar)) {
                return true;
            }
        }
        return false;
    }

    public static final my H(int i2, tt0 tt0Var, a00 a00Var) {
        Object M = a00Var.M();
        if (M == sz.a) {
            M = new my(i2, tt0Var, true);
            a00Var.i0(M);
        }
        my myVar = (my) M;
        if (!Intrinsics.b(myVar.o, tt0Var)) {
            boolean z = myVar.o == null;
            myVar.o = tt0Var;
            if (!z && myVar.n) {
                n72 n72Var = myVar.p;
                if (n72Var != null) {
                    k00 k00Var = n72Var.a;
                    if (k00Var != null) {
                        k00Var.r(n72Var, null);
                    }
                    myVar.p = null;
                }
                ArrayList arrayList = myVar.q;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        n72 n72Var2 = (n72) arrayList.get(i3);
                        k00 k00Var2 = n72Var2.a;
                        if (k00Var2 != null) {
                            k00Var2.r(n72Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return myVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean J(yo0 yo0Var, yo0 yo0Var2, int i2, oc ocVar) {
        ul1 ul1Var;
        i91 J;
        fs1 fs1Var;
        if (yo0Var.I0() != xo0.n) {
            lh.g("This function should only be used within a parent that has focus.");
            return false;
        }
        yo0[] yo0VarArr = new yo0[16];
        if (!yo0Var.m.z) {
            h21.b("visitChildren called on an unattached node");
        }
        eo1 eo1Var = new eo1(new ul1[16]);
        ul1 ul1Var2 = yo0Var.m;
        ul1 ul1Var3 = ul1Var2.r;
        if (ul1Var3 == null) {
            s03.b(eo1Var, ul1Var2);
        } else {
            eo1Var.b(ul1Var3);
        }
        int i3 = 0;
        while (true) {
            int i4 = eo1Var.o;
            ul1Var = null;
            if (i4 == 0) {
                break;
            }
            ul1 ul1Var4 = (ul1) eo1Var.l(i4 - 1);
            if ((ul1Var4.p & 1024) == 0) {
                s03.b(eo1Var, ul1Var4);
            } else {
                while (true) {
                    if (ul1Var4 == null) {
                        break;
                    }
                    if ((ul1Var4.o & 1024) != 0) {
                        eo1 eo1Var2 = null;
                        while (ul1Var4 != null) {
                            if (ul1Var4 instanceof yo0) {
                                yo0 yo0Var3 = (yo0) ul1Var4;
                                int i5 = i3 + 1;
                                if (yo0VarArr.length < i5) {
                                    int length = yo0VarArr.length;
                                    ?? r11 = new Object[Math.max(i5, length * 2)];
                                    System.arraycopy(yo0VarArr, 0, r11, 0, length);
                                    yo0VarArr = r11;
                                }
                                yo0VarArr[i3] = yo0Var3;
                                i3 = i5;
                            } else if ((ul1Var4.o & 1024) != 0 && (ul1Var4 instanceof p90)) {
                                int i6 = 0;
                                for (ul1 ul1Var5 = ((p90) ul1Var4).B; ul1Var5 != null; ul1Var5 = ul1Var5.r) {
                                    if ((ul1Var5.o & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            ul1Var4 = ul1Var5;
                                        } else {
                                            if (eo1Var2 == null) {
                                                eo1Var2 = new eo1(new ul1[16]);
                                            }
                                            if (ul1Var4 != null) {
                                                eo1Var2.b(ul1Var4);
                                                ul1Var4 = null;
                                            }
                                            eo1Var2.b(ul1Var5);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            ul1Var4 = s03.c(eo1Var2);
                        }
                    } else {
                        ul1Var4 = ul1Var4.r;
                    }
                }
            }
        }
        Arrays.sort(yo0VarArr, 0, i3, zo0.b);
        if (i2 != 1) {
            if (i2 != 2) {
                lh.g("This function should only be used for 1-D focus search");
                return false;
            }
            IntRange f2 = d.f(0, i3);
            int i7 = f2.m;
            int i8 = f2.n;
            if (i7 <= i8) {
                boolean z = false;
                while (true) {
                    if (z) {
                        yo0 yo0Var4 = yo0VarArr[i8];
                        if (j8.K(yo0Var4) && k(yo0Var4, ocVar)) {
                            break;
                        }
                    }
                    if (Intrinsics.b(yo0VarArr[i8], yo0Var2)) {
                        z = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8--;
                }
                return true;
            }
            if (i2 != 1) {
                if (!yo0Var.m.z) {
                }
                ul1 ul1Var6 = yo0Var.m.q;
                J = s03.J(yo0Var);
                loop5: while (true) {
                    if (J == null) {
                    }
                }
                if (ul1Var != null) {
                }
            }
            return false;
        }
        IntRange f3 = d.f(0, i3);
        int i9 = f3.m;
        int i10 = f3.n;
        if (i9 <= i10) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    yo0 yo0Var5 = yo0VarArr[i9];
                    if (j8.K(yo0Var5) && t(yo0Var5, ocVar)) {
                        break;
                    }
                }
                if (Intrinsics.b(yo0VarArr[i9], yo0Var2)) {
                    z2 = true;
                }
                if (i9 == i10) {
                    break;
                }
                i9++;
            }
            return true;
        }
        if (i2 != 1 && yo0Var.H0().a) {
            if (!yo0Var.m.z) {
                h21.b("visitAncestors called on an unattached node");
            }
            ul1 ul1Var62 = yo0Var.m.q;
            J = s03.J(yo0Var);
            loop5: while (true) {
                if (J == null) {
                    break;
                }
                if ((J.P.f.p & 1024) != 0) {
                    while (ul1Var62 != null) {
                        if ((ul1Var62.o & 1024) != 0) {
                            ul1 ul1Var7 = ul1Var62;
                            eo1 eo1Var3 = null;
                            while (ul1Var7 != null) {
                                if (ul1Var7 instanceof yo0) {
                                    ul1Var = ul1Var7;
                                    break loop5;
                                }
                                if ((ul1Var7.o & 1024) != 0 && (ul1Var7 instanceof p90)) {
                                    int i11 = 0;
                                    for (ul1 ul1Var8 = ((p90) ul1Var7).B; ul1Var8 != null; ul1Var8 = ul1Var8.r) {
                                        if ((ul1Var8.o & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                ul1Var7 = ul1Var8;
                                            } else {
                                                if (eo1Var3 == null) {
                                                    eo1Var3 = new eo1(new ul1[16]);
                                                }
                                                if (ul1Var7 != null) {
                                                    eo1Var3.b(ul1Var7);
                                                    ul1Var7 = null;
                                                }
                                                eo1Var3.b(ul1Var8);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                ul1Var7 = s03.c(eo1Var3);
                            }
                        }
                        ul1Var62 = ul1Var62.q;
                    }
                }
                J = J.u();
                ul1Var62 = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
            }
            if (ul1Var != null) {
                return ((Boolean) ocVar.invoke(yo0Var)).booleanValue();
            }
        }
        return false;
    }

    public static final void K(int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            if (i2 <= i3) {
                return;
            }
            lh.c(q40.j("minLines ", i2, i3, " must be less than or equal to maxLines "));
        } else {
            throw new IllegalArgumentException(("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero").toString());
        }
    }

    public static final void L(ai2 ai2Var, int i2, ze2 ze2Var) {
        ai2 ai2Var2;
        eo1 eo1Var = new eo1(new ai2[16]);
        List i3 = ai2Var.i(false, false);
        while (true) {
            eo1Var.d(eo1Var.o, i3);
            while (true) {
                int i4 = eo1Var.o;
                if (i4 == 0) {
                    return;
                }
                ai2Var2 = (ai2) eo1Var.l(i4 - 1);
                boolean C = s03.C(ai2Var2);
                sh2 sh2Var = ai2Var2.d;
                tn1 tn1Var = sh2Var.m;
                if (!C && !tn1Var.c(gi2.i)) {
                    ks1 d2 = ai2Var2.d();
                    if (d2 == null) {
                        throw q40.f("Expected semantics node to have a coordinator.");
                    }
                    u31 U = ll3.U(yk3.r(d2));
                    if (U.a < U.c && U.b < U.d) {
                        Object g2 = sh2Var.m.g(rh2.e);
                        if (g2 == null) {
                            g2 = null;
                        }
                        Function2 function2 = (Function2) g2;
                        Object g3 = tn1Var.g(gi2.u);
                        ye2 ye2Var = (ye2) (g3 != null ? g3 : null);
                        if (function2 != null && ye2Var != null && ((Number) ye2Var.b.invoke()).floatValue() > 0.0f) {
                            int i5 = i2 + 1;
                            ze2Var.invoke(new af2(ai2Var2, i5, U, d2));
                            L(ai2Var2, i5, ze2Var);
                        }
                    }
                }
            }
            i3 = ai2Var2.i(false, false);
        }
    }

    public static jc a(float f2) {
        return new jc(Float.valueOf(f2), v33.a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ec A[Catch: all -> 0x0263, TryCatch #0 {all -> 0x0263, blocks: (B:85:0x01d9, B:87:0x01ec, B:88:0x01f4), top: B:84:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final mj mjVar, final vl1 vl1Var, final Function1 function1, final f6 f6Var, final q20 q20Var, a00 a00Var, final int i2, final int i3) {
        f6 f6Var2;
        int i4;
        sl2 sl2Var;
        r01 r01Var;
        Object M;
        a00Var.Z(-421592773);
        int i5 = (a00Var.f(mjVar) ? 4 : 2) | i2;
        if ((i2 & 896) == 0) {
            i5 |= a00Var.f(vl1Var) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i5 |= a00Var.h(function1) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i5 |= a00Var.h(null) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((i2 & 458752) == 0) {
            f6Var2 = f6Var;
            i5 |= a00Var.f(f6Var2) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        } else {
            f6Var2 = f6Var;
        }
        if ((i2 & 3670016) == 0) {
            i5 |= a00Var.f(q20Var) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i5 |= a00Var.c(1.0f) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i5 |= a00Var.f(null) ? 67108864 : 33554432;
        }
        if ((1879048192 & i2) == 0) {
            i5 |= a00Var.d(1) ? 536870912 : 268435456;
        }
        if ((i3 & 14) == 0) {
            i4 = i3 | (a00Var.g(true) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i5 & 1533916891) == 306783378 && (i4 & 11) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            Object obj = mjVar.a;
            h72 h72Var = p33.b;
            a00Var.Y(1677680258);
            boolean z = obj instanceof r01;
            Object obj2 = sz.a;
            try {
                if (z) {
                    r01Var = (r01) obj;
                    if (r01Var.y.a != null) {
                        a00Var.q(false);
                        b72 b72Var = mjVar.c;
                        int i6 = i5 >> 6;
                        int i7 = i6 & 57344;
                        a00Var.Y(1645646697);
                        a00Var.Y(952940650);
                        Trace.beginSection("rememberAsyncImagePainter");
                        r01 a2 = p33.a(r01Var, a00Var);
                        iv1.Z(a2);
                        a00Var.Y(1094691773);
                        M = a00Var.M();
                        if (M == obj2) {
                            M = new kj(a2, b72Var);
                            a00Var.i0(M);
                        }
                        kj kjVar = (kj) M;
                        a00Var.q(false);
                        kjVar.y = function1;
                        kjVar.z = q20Var;
                        kjVar.A = 1;
                        kjVar.B = ((Boolean) a00Var.j(g31.a)).booleanValue();
                        kjVar.E.setValue(b72Var);
                        kjVar.D.setValue(a2);
                        kjVar.a();
                        a00Var.q(false);
                        Trace.endSection();
                        a00Var.q(false);
                        sl2 sl2Var2 = r01Var.v;
                        c(!(sl2Var2 instanceof y10) ? vl1Var.k((vl1) sl2Var2) : vl1Var, kjVar, f6Var2, q20Var, a00Var, (i6 & 3670016) | i7 | 384 | (i6 & 7168) | (i6 & 458752) | ((i4 << 21) & 29360128));
                    }
                }
                r01 a22 = p33.a(r01Var, a00Var);
                iv1.Z(a22);
                a00Var.Y(1094691773);
                M = a00Var.M();
                if (M == obj2) {
                }
                kj kjVar2 = (kj) M;
                a00Var.q(false);
                kjVar2.y = function1;
                kjVar2.z = q20Var;
                kjVar2.A = 1;
                kjVar2.B = ((Boolean) a00Var.j(g31.a)).booleanValue();
                kjVar2.E.setValue(b72Var);
                kjVar2.D.setValue(a22);
                kjVar2.a();
                a00Var.q(false);
                Trace.endSection();
                a00Var.q(false);
                sl2 sl2Var22 = r01Var.v;
                c(!(sl2Var22 instanceof y10) ? vl1Var.k((vl1) sl2Var22) : vl1Var, kjVar2, f6Var2, q20Var, a00Var, (i6 & 3670016) | i7 | 384 | (i6 & 7168) | (i6 & 458752) | ((i4 << 21) & 29360128));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
            a00Var.Y(408306591);
            if (Intrinsics.b(q20Var, p20.d)) {
                sl2Var = p33.b;
            } else {
                a00Var.Y(408309406);
                Object M2 = a00Var.M();
                if (M2 == obj2) {
                    M2 = new y10();
                    a00Var.i0(M2);
                }
                sl2Var = (y10) M2;
                a00Var.q(false);
            }
            a00Var.q(false);
            if (z) {
                a00Var.Y(-227230258);
                r01 r01Var2 = (r01) obj;
                a00Var.Y(408312509);
                boolean f2 = a00Var.f(r01Var2) | a00Var.f(sl2Var);
                Object M3 = a00Var.M();
                if (f2 || M3 == obj2) {
                    q01 a3 = r01.a(r01Var2);
                    a3.l = sl2Var;
                    a3.n = null;
                    a3.o = null;
                    a3.p = null;
                    M3 = a3.a();
                    a00Var.i0(M3);
                }
                r01Var = (r01) M3;
                a00Var.q(false);
                a00Var.q(false);
                a00Var.q(false);
            } else {
                a00Var.Y(-227066702);
                Context context = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
                a00Var.Y(408319118);
                boolean f3 = a00Var.f(context) | a00Var.f(obj) | a00Var.f(sl2Var);
                Object M4 = a00Var.M();
                if (f3 || M4 == obj2) {
                    q01 q01Var = new q01(context);
                    q01Var.c = obj;
                    q01Var.l = sl2Var;
                    q01Var.n = null;
                    q01Var.o = null;
                    q01Var.p = null;
                    M4 = q01Var.a();
                    a00Var.i0(M4);
                }
                r01Var = (r01) M4;
                a00Var.q(false);
                a00Var.q(false);
                a00Var.q(false);
            }
            b72 b72Var2 = mjVar.c;
            int i62 = i5 >> 6;
            int i72 = i62 & 57344;
            a00Var.Y(1645646697);
            a00Var.Y(952940650);
            Trace.beginSection("rememberAsyncImagePainter");
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new Function2() { // from class: vi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    yj1.b(mj.this, vl1Var, function1, f6Var, q20Var, (a00) obj3, s03.R(i2 | 1), s03.R(i3));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(vl1 vl1Var, kj kjVar, f6 f6Var, q20 q20Var, a00 a00Var, int i2) {
        int i3;
        a00Var.Z(777774312);
        if ((i2 & 14) == 0) {
            i3 = (a00Var.f(vl1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= a00Var.f(kjVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= a00Var.f(null) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= a00Var.f(f6Var) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= a00Var.f(q20Var) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((458752 & i2) == 0) {
            i3 |= a00Var.c(1.0f) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((3670016 & i2) == 0) {
            i3 |= a00Var.f(null) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= a00Var.g(true) ? 8388608 : 4194304;
        }
        if ((i3 & 23967451) == 4793490 && a00Var.B()) {
            a00Var.S();
        } else {
            h72 h72Var = p33.b;
            vl1 k2 = yk3.v(vl1Var).k(new ContentPainterElement(kjVar, f6Var, q20Var));
            k9 k9Var = k9.d;
            a00Var.Y(544976794);
            int D = iv1.D(a00Var);
            vl1 E = bd3.E(a00Var, k2);
            v02 l2 = a00Var.l();
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.Y(1405779621);
            a00Var.b0();
            int i4 = 0;
            if (a00Var.S) {
                a00Var.k(new xi(i4, o00Var));
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, k9Var, oz.f);
            uj2.e(a00Var, l2, oz.e);
            uj2.e(a00Var, E, oz.d);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            a00Var.q(true);
            a00Var.q(false);
            a00Var.q(false);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new wi(vl1Var, kjVar, f6Var, q20Var, i2, 0);
        }
    }

    public static final long d(int i2) {
        if (i2 > 0) {
            return i2;
        }
        lh.e("The span value should be higher than 0");
        return 0L;
    }

    public static final vs3 e() {
        return new vs3(new Paint(7));
    }

    public static final void f(long j2, pw2 pw2Var, Function2 function2, a00 a00Var, int i2) {
        int i3;
        a00Var.Z(-716124955);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.e(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.f(pw2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= a00Var.h(function2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            r00 r00Var = yv2.a;
            yk3.c(new ye[]{e20.a.a(new aw(j2)), r00Var.a(((pw2) a00Var.j(r00Var)).d(pw2Var))}, function2, a00Var, ((i3 >> 3) & 112) | 8);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new v52(j2, pw2Var, function2, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int g(int i2, int i3, int i4, boolean z) {
        if (i3 >= i4) {
            if (z) {
                return 0;
            }
            return i4 - i3;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i4 - i3 <= i2 : i3 > i2) {
                if (z) {
                    return i4 - i3;
                }
                return 0;
            }
            if (z) {
                return i2 - i3;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:10:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(ur2 ur2Var, hn hnVar) {
        nq0 nq0Var;
        int i2;
        int size;
        int i3;
        if (hnVar instanceof nq0) {
            nq0Var = (nq0) hnVar;
            int i4 = nq0Var.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nq0Var.o = i4 - Integer.MIN_VALUE;
                Object obj = nq0Var.n;
                b50 b50Var = b50.m;
                i2 = nq0Var.o;
                if (i2 != 0) {
                    ca2.b(obj);
                    List list = ur2Var.r.F.a;
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (((t22) list.get(i5)).d) {
                            n22 n22Var = n22.o;
                            nq0Var.m = ur2Var;
                            nq0Var.o = 1;
                            obj = ur2Var.a(n22Var, nq0Var);
                            if (obj == b50Var) {
                            }
                            List list2 = ((m22) obj).a;
                            size = list2.size();
                            i3 = 0;
                            while (i3 < size) {
                            }
                            return Unit.a;
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ur2Var = nq0Var.m;
                ca2.b(obj);
                List list22 = ((m22) obj).a;
                size = list22.size();
                i3 = 0;
                while (i3 < size) {
                    if (((t22) list22.get(i3)).d) {
                        n22 n22Var2 = n22.o;
                        nq0Var.m = ur2Var;
                        nq0Var.o = 1;
                        obj = ur2Var.a(n22Var2, nq0Var);
                        if (obj == b50Var) {
                            return b50Var;
                        }
                        List list222 = ((m22) obj).a;
                        size = list222.size();
                        i3 = 0;
                        while (i3 < size) {
                        }
                    } else {
                        i3++;
                    }
                }
                return Unit.a;
            }
        }
        nq0Var = new nq0(hnVar);
        Object obj2 = nq0Var.n;
        b50 b50Var2 = b50.m;
        i2 = nq0Var.o;
        if (i2 != 0) {
        }
    }

    public static final Object j(x22 x22Var, Function2 function2, o30 o30Var) {
        Object G0 = ((vr2) x22Var).G0(new oq0(o30Var.getContext(), function2, null), o30Var);
        return G0 == b50.m ? G0 : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean k(yo0 yo0Var, oc ocVar) {
        int ordinal = yo0Var.I0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo0 C = j8.C(yo0Var);
                if (C == null) {
                    lh.g("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = C.I0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                a.b();
                                return false;
                            }
                            lh.g("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (k(C, ocVar) || u(yo0Var, C, 2, ocVar) || (C.H0().a && ((Boolean) ocVar.invoke(C)).booleanValue())) {
                        return true;
                    }
                }
                return u(yo0Var, C, 2, ocVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    a.b();
                    return false;
                }
                if (!F(yo0Var, ocVar)) {
                    if (!(yo0Var.H0().a ? ((Boolean) ocVar.invoke(yo0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return F(yo0Var, ocVar);
    }

    public static final int l(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final void m(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            a.c(q40.j("index: ", i2, i3, ", size: "));
        }
    }

    public static final void n(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            a.c(q40.j("index: ", i2, i3, ", size: "));
        }
    }

    public static final void o(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            lh.e(q40.j("fromIndex: ", i2, i3, " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static final double q(int i2, int i3, int i4, int i5, me2 me2Var) {
        double d2 = i4 / i2;
        double d3 = i5 / i3;
        int ordinal = me2Var.ordinal();
        if (ordinal == 0) {
            return Math.max(d2, d3);
        }
        if (ordinal == 1) {
            return Math.min(d2, d3);
        }
        a.b();
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (q(r9, r1, kotlin.jvm.internal.Intrinsics.b(r7, r2) ? r0.getWidth() : defpackage.l.d(r7.a, r8), kotlin.jvm.internal.Intrinsics.b(r7, r2) ? r0.getHeight() : defpackage.l.d(r7.b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap s(Drawable drawable, Bitmap.Config config, pl2 pl2Var, me2 me2Var, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || k31.o(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    pl2 pl2Var2 = pl2.c;
                }
                return bitmap3;
            }
        }
        Drawable mutate = drawable.mutate();
        Bitmap.Config[] configArr = l.a;
        boolean z2 = mutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z2 ? (BitmapDrawable) mutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? mutate.getIntrinsicWidth() : bitmap2.getWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z2 ? (BitmapDrawable) mutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? mutate.getIntrinsicHeight() : bitmap.getHeight();
        int i2 = intrinsicHeight > 0 ? intrinsicHeight : 512;
        pl2 pl2Var3 = pl2.c;
        double q = q(intrinsicWidth, i2, Intrinsics.b(pl2Var, pl2Var3) ? intrinsicWidth : l.d(pl2Var.a, me2Var), Intrinsics.b(pl2Var, pl2Var3) ? i2 : l.d(pl2Var.b, me2Var), me2Var);
        int a2 = si1.a(intrinsicWidth * q);
        int a3 = si1.a(q * i2);
        if (config == null || k31.o(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(a2, a3, config);
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, a2, a3);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static final boolean t(yo0 yo0Var, oc ocVar) {
        int ordinal = yo0Var.I0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo0 C = j8.C(yo0Var);
                if (C != null) {
                    return t(C, ocVar) || u(yo0Var, C, 1, ocVar);
                }
                lh.g("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return yo0Var.H0().a ? ((Boolean) ocVar.invoke(yo0Var)).booleanValue() : G(yo0Var, ocVar);
                }
                a.b();
                return false;
            }
        }
        return G(yo0Var, ocVar);
    }

    public static final boolean u(yo0 yo0Var, yo0 yo0Var2, int i2, oc ocVar) {
        if (J(yo0Var, yo0Var2, i2, ocVar)) {
            return true;
        }
        Boolean bool = (Boolean) j8.V(yo0Var, i2, new pw(((po0) ((t7) s03.K(yo0Var)).getFocusOwner()).h, yo0Var, yo0Var2, i2, ocVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static jq1 w(gw gwVar) {
        jq1 jq1Var = gwVar.M;
        if (jq1Var != null) {
            return jq1Var;
        }
        jq1 jq1Var2 = new jq1(hw.c(gwVar, 15), hw.c(gwVar, 18), hw.c(gwVar, 32), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 19), 0.38f), aw.b(hw.c(gwVar, 19), 0.38f));
        gwVar.M = jq1Var2;
        return jq1Var2;
    }

    public static final x01 x() {
        x01 x01Var = p;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        ah0 ah0Var = y33.a;
        nn2 nn2Var = new nn2(aw.b);
        lx0 lx0Var = new lx0(1);
        lx0Var.k(12.0f, 21.35f);
        lx0Var.j(-1.45f, -1.32f);
        lx0Var.e(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        lx0Var.e(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        lx0Var.f(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        lx0Var.e(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        lx0Var.e(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        lx0Var.f(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        lx0Var.i(12.0f, 21.35f);
        lx0Var.d();
        w01.a(w01Var, lx0Var.m, nn2Var);
        x01 b2 = w01Var.b();
        p = b2;
        return b2;
    }

    public static final Class y(h71 h71Var) {
        h71Var.getClass();
        Class a2 = ((fu) h71Var).a();
        a2.getClass();
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class z(h71 h71Var) {
        h71Var.getClass();
        Class a2 = ((fu) h71Var).a();
        if (a2.isPrimitive()) {
            String name = a2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a2;
    }

    public abstract void D();

    public abstract void I(b71 b71Var);

    public abstract void h();

    public abstract List p(String str, List list);

    public abstract boolean r(u52 u52Var);

    public abstract Object v(u52 u52Var);
}
