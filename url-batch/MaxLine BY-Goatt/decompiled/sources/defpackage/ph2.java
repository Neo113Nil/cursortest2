package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.majelw.libystne.R;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ph2 {
    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void b(vl1 vl1Var, a00 a00Var, int i) {
        int i2;
        vl1 vl1Var2;
        sc scVar;
        o00 o00Var;
        sc scVar2;
        a00 a00Var2 = a00Var;
        a00Var2.Z(-1468547790);
        int i3 = i | 6;
        if (a00Var2.P(i3 & 1, (i3 & 3) != 2)) {
            Object M = a00Var2.M();
            Object obj = sz.a;
            if (M == obj) {
                M = yj1.a(0.0f);
                a00Var2.i0(M);
            }
            jc jcVar = (jc) M;
            Unit unit = Unit.a;
            boolean h = a00Var2.h(jcVar);
            Object M2 = a00Var2.M();
            if (h || M2 == obj) {
                M2 = new fj(9, (o30) null, jcVar);
                a00Var2.i0(M2);
            }
            l41.h(a00Var2, unit, (Function2) M2);
            sl1 sl1Var = sl1.a;
            vl1 a = a.a(b.b(sl1Var, 1.0f), nj.u(qv.g(new aw(cw.a), new aw(cw.b))));
            ao aoVar = qb2.p;
            oj1 e = fp.e(aoVar, false);
            int D = iv1.D(a00Var2);
            v02 l = a00Var2.l();
            vl1 E = bd3.E(a00Var2, a);
            pz.b.getClass();
            o00 o00Var2 = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var2);
            } else {
                a00Var2.l0();
            }
            sc scVar3 = oz.f;
            uj2.e(a00Var2, e, scVar3);
            sc scVar4 = oz.e;
            uj2.e(a00Var2, l, scVar4);
            sc scVar5 = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar5);
            }
            sc scVar6 = oz.d;
            uj2.e(a00Var2, E, scVar6);
            l41.g(o70.G(R.drawable.bg_facets_orange, a00Var2), b.b(sl1Var, 1.0f), null, p20.a, 0.0f, a00Var2, 25008, 104);
            vl1 j = androidx.compose.foundation.layout.a.j(b.b(sl1Var, 1.0f), 32.0f, 0.0f, 2);
            yn ynVar = qb2.B;
            qw a2 = ow.a(s93.d, ynVar, a00Var2, 54);
            int D2 = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E2 = bd3.E(a00Var2, j);
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var2);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a2, scVar3);
            uj2.e(a00Var2, l2, scVar4);
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D2))) {
                scVar = scVar5;
                q40.r(D2, a00Var2, D2, scVar);
            } else {
                scVar = scVar5;
            }
            uj2.e(a00Var2, E2, scVar6);
            sc scVar7 = scVar;
            l41.g(o70.G(R.drawable.mascot_goose_inspect, a00Var2), b.h(sl1Var, 200.0f), null, null, 0.0f, a00Var2, 432, 120);
            String f = uj2.f(R.string.app_name, a00Var2);
            bp2 bp2Var = n13.a;
            yv2.b(f, androidx.compose.foundation.layout.a.k(sl1Var, 0.0f, 12.0f, 0.0f, 13), cw.h, 0L, null, 0L, new ut2(3), 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).a, a00Var, 432, 0, 65016);
            a00Var.q(true);
            vl1 i4 = androidx.compose.foundation.layout.a.i(b.c(androidx.compose.foundation.layout.a.c(qb2.w), 1.0f), 40.0f, 56.0f);
            qw a3 = ow.a(s93.c, ynVar, a00Var, 48);
            int D3 = iv1.D(a00Var);
            v02 l3 = a00Var.l();
            vl1 E3 = bd3.E(a00Var, i4);
            a00Var.b0();
            if (a00Var.S) {
                o00Var = o00Var2;
                a00Var.k(o00Var);
            } else {
                o00Var = o00Var2;
                a00Var.l0();
            }
            uj2.e(a00Var, a3, scVar3);
            uj2.e(a00Var, l3, scVar4);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D3))) {
                scVar2 = scVar7;
                q40.r(D3, a00Var, D3, scVar2);
            } else {
                scVar2 = scVar7;
            }
            uj2.e(a00Var, E3, scVar6);
            vl1 b = a.b(yk3.u(b.d(b.c(sl1Var, 1.0f), 8.0f), zb2.a(999.0f)), cw.k, ap.e);
            oj1 e2 = fp.e(aoVar, false);
            int D4 = iv1.D(a00Var);
            v02 l4 = a00Var.l();
            vl1 E4 = bd3.E(a00Var, b);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, scVar3);
            uj2.e(a00Var, l4, scVar4);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D4))) {
                q40.r(D4, a00Var, D4, scVar2);
            }
            uj2.e(a00Var, E4, scVar6);
            fp.a(a.a(yk3.u(b.d(b.c(sl1Var, ((Number) jcVar.d()).floatValue()), 8.0f), zb2.a(999.0f)), nj.q(qv.g(new aw(cw.p), new aw(cw.q)))), a00Var, 0);
            a00Var.q(true);
            yv2.b(uj2.f(R.string.ml_splash_status, a00Var) + "  " + ((int) (((Number) jcVar.d()).floatValue() * 100.0f)) + "%", androidx.compose.foundation.layout.a.k(sl1Var, 0.0f, 12.0f, 0.0f, 13), cw.w, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).n, a00Var, 197040, 0, 65496);
            a00Var2 = a00Var;
            i2 = 1;
            a00Var2.q(true);
            a00Var2.q(true);
            vl1Var2 = sl1Var;
        } else {
            i2 = 1;
            a00Var2.S();
            vl1Var2 = vl1Var;
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new qh(vl1Var2, i, i2);
        }
    }

    public static final void c(i43 i43Var, t22 t22Var) {
        h43 h43Var = (h43) i43Var.c;
        h43 h43Var2 = (h43) i43Var.b;
        boolean z = s93.z(t22Var);
        long j = t22Var.b;
        long j2 = 0;
        if (z) {
            ni.k(0, r4.length, null, h43Var2.c);
            h43Var2.d = 0;
            ni.k(0, r4.length, null, h43Var.c);
            h43Var.d = 0;
            i43Var.a = 0L;
        }
        if (!s93.B(t22Var)) {
            List list = t22Var.k;
            if (list == null) {
                list = ah0.m;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                qx0 qx0Var = (qx0) list.get(i);
                long j3 = qx0Var.a;
                long g = au1.g(qx0Var.c, j2);
                h43Var2.a(j3, Float.intBitsToFloat((int) (g >> 32)));
                h43Var.a(j3, Float.intBitsToFloat((int) (g & 4294967295L)));
                i++;
                j2 = 0;
            }
            long g2 = au1.g(t22Var.l, 0L);
            h43Var2.a(j, Float.intBitsToFloat((int) (g2 >> 32)));
            h43Var.a(j, Float.intBitsToFloat((int) (g2 & 4294967295L)));
        }
        if (s93.B(t22Var) && j - i43Var.a > 40) {
            ni.k(0, r1.length, null, h43Var2.c);
            h43Var2.d = 0;
            ni.k(0, r3.length, null, h43Var.c);
            h43Var.d = 0;
            i43Var.a = 0L;
        }
        i43Var.a = j;
    }

    public static final float d(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final long e(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final float f(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final int g(zv2 zv2Var, Layout layout, fy fyVar, int i, RectF rectF, wg2 wg2Var, ia iaVar, boolean z) {
        v81[] v81VarArr;
        c cVar;
        v81[] v81VarArr2;
        int i2;
        int d;
        int i3;
        int i4;
        int b;
        Bidi createLineBidi;
        boolean z2;
        float a;
        float a2;
        float f;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = zv2Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int f2 = zv2Var.f(i);
        if (i5 < (f2 - lineStart2) * 2) {
            i21.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        yx0 yx0Var = new yx0(zv2Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < f2) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                a = yx0Var.a(lineStart2, z3, z3, true);
                f = yx0Var.a(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f = yx0Var.a(lineStart2, false, false, false);
                a = yx0Var.a(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    a2 = yx0Var.a(lineStart2, false, false, true);
                    a = yx0Var.a(lineStart2 + 1, true, true, true);
                } else {
                    a = yx0Var.a(lineStart2, false, false, false);
                    a2 = yx0Var.a(lineStart2 + 1, true, true, false);
                }
                f = a2;
            }
            fArr[i6] = a;
            fArr[i6 + 1] = f;
            i6 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) fyVar.p;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int j = fyVar.j(lineStart3, false);
        int k = fyVar.k(j);
        int i7 = lineStart3 - k;
        int i8 = lineEnd2 - k;
        Bidi f3 = fyVar.f(j);
        if (f3 == null || (createLineBidi = f3.createLineBidi(i7, i8)) == null) {
            v81VarArr = new v81[]{new v81(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            v81VarArr = new v81[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                v81VarArr[i9] = new v81(createLineBidi.getRunStart(i9) + lineStart3, createLineBidi.getRunLimit(i9) + lineStart3, createLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        if (z) {
            cVar = new IntRange(0, v81VarArr.length - 1, 1);
        } else {
            int length = v81VarArr.length - 1;
            c.p.getClass();
            cVar = new c(length, 0, -1);
        }
        int i11 = cVar.m;
        int i12 = cVar.n;
        int i13 = cVar.o;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            v81 v81Var = v81VarArr[i11];
            boolean z5 = v81Var.c;
            int i14 = v81Var.a;
            int i15 = v81Var.b;
            float f4 = z5 ? fArr[((i15 - 1) - lineStart) * 2] : fArr[(i14 - lineStart) * 2];
            float f5 = z5 ? f(i14, lineStart, fArr) : f(i15 - 1, lineStart, fArr);
            float f6 = rectF.left;
            int i16 = i13;
            if (z) {
                if (f5 >= f6) {
                    float f7 = rectF.right;
                    if (f4 <= f7) {
                        if ((z5 || f6 > f4) && (!z5 || f7 < f5)) {
                            int i17 = i15;
                            int i18 = i14;
                            while (true) {
                                i3 = i17;
                                if (i17 - i18 <= 1) {
                                    break;
                                }
                                int i19 = (i3 + i18) / 2;
                                float f8 = fArr[(i19 - lineStart) * 2];
                                if ((z5 || f8 <= rectF.left) && (!z5 || f8 >= rectF.right)) {
                                    i17 = i3;
                                    i18 = i19;
                                } else {
                                    i17 = i19;
                                }
                            }
                            i4 = z5 ? i3 : i18;
                        } else {
                            i4 = i14;
                        }
                        int d2 = wg2Var.d(i4);
                        if (d2 != -1 && (b = wg2Var.b(d2)) < i15) {
                            if (b >= i14) {
                                i14 = b;
                            }
                            if (d2 > i15) {
                                d2 = i15;
                            }
                            v81VarArr2 = v81VarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i20 = d2;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i20 - 1) - lineStart) * 2] : fArr[(i14 - lineStart) * 2];
                                rectF2.right = z5 ? f(i14, lineStart, fArr) : f(i20 - 1, lineStart, fArr);
                                if (!((Boolean) iaVar.invoke(rectF2, rectF)).booleanValue()) {
                                    i14 = wg2Var.f(i14);
                                    if (i14 == -1 || i14 >= i15) {
                                        break;
                                    }
                                    i20 = wg2Var.d(i14);
                                    if (i20 > i15) {
                                        i20 = i15;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                v81VarArr2 = v81VarArr;
                i14 = -1;
            } else {
                v81VarArr2 = v81VarArr;
                if (f5 >= f6) {
                    float f9 = rectF.right;
                    if (f4 <= f9) {
                        if ((z5 || f9 < f5) && (!z5 || f6 > f4)) {
                            int i21 = i15;
                            int i22 = i14;
                            while (i21 - i22 > 1) {
                                int i23 = (i21 + i22) / 2;
                                float f10 = fArr[(i23 - lineStart) * 2];
                                int i24 = i21;
                                if ((z5 || f10 <= rectF.right) && (!z5 || f10 >= rectF.left)) {
                                    i21 = i24;
                                    i22 = i23;
                                } else {
                                    i21 = i23;
                                }
                            }
                            i2 = z5 ? i21 : i22;
                        } else {
                            i2 = i15 - 1;
                        }
                        int b2 = wg2Var.b(i2 + 1);
                        if (b2 != -1 && (d = wg2Var.d(b2)) > i14) {
                            if (b2 < i14) {
                                b2 = i14;
                            }
                            if (d <= i15) {
                                i15 = d;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i25 = b2;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i15 - 1) - lineStart) * 2] : fArr[(i25 - lineStart) * 2];
                                rectF3.right = z5 ? f(i25, lineStart, fArr) : f(i15 - 1, lineStart, fArr);
                                if (!((Boolean) iaVar.invoke(rectF3, rectF)).booleanValue()) {
                                    i15 = wg2Var.g(i15);
                                    if (i15 == -1 || i15 <= i14) {
                                        break;
                                    }
                                    i25 = wg2Var.b(i15);
                                    if (i25 < i14) {
                                        i25 = i14;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i15 = -1;
                i14 = i15;
            }
            if (i14 >= 0) {
                return i14;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i16;
            i13 = i16;
            v81VarArr = v81VarArr2;
        }
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean i(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final void j(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            h21.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float d = d(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * d);
                }
            }
            float sqrt = (float) Math.sqrt(d(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : d(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float d2 = d(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    d2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = d2 / fArr11[i14];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e2, code lost:
    
        r0 = defpackage.qj2.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e6, code lost:
    
        defpackage.yk3.w(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ms2 k(nc2 nc2Var, String str) {
        long j;
        Map b;
        jj2 jj2Var;
        nc2Var.getClass();
        uc2 M = nc2Var.M("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (M.E()) {
                int m = bd3.m(M, "name");
                int m2 = bd3.m(M, "type");
                int m3 = bd3.m(M, "notnull");
                int m4 = bd3.m(M, "pk");
                int m5 = bd3.m(M, "dflt_value");
                uh1 uh1Var = new uh1();
                while (true) {
                    String j3 = M.j(m);
                    j = j2;
                    uh1Var.put(j3, new js2(j3, M.j(m2), M.getLong(m3) != j2, (int) M.getLong(m4), M.isNull(m5) ? null : M.j(m5), 2));
                    if (!M.E()) {
                        break;
                    }
                    j2 = j;
                }
                b = uh1Var.b();
                yk3.w(M, null);
            } else {
                b = mi1.c();
                yk3.w(M, null);
                j = 0;
            }
            M = nc2Var.M("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int m6 = bd3.m(M, "id");
                int m7 = bd3.m(M, "seq");
                int m8 = bd3.m(M, "table");
                int m9 = bd3.m(M, "on_delete");
                int m10 = bd3.m(M, "on_update");
                List W = l41.W(M);
                M.reset();
                jj2 jj2Var2 = new jj2();
                while (M.E()) {
                    if (M.getLong(m7) == j) {
                        int i = (int) M.getLong(m6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = m6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : W) {
                            int i3 = m7;
                            List list = W;
                            if (((pq0) obj).m == i) {
                                arrayList3.add(obj);
                            }
                            m7 = i3;
                            W = list;
                        }
                        int i4 = m7;
                        List list2 = W;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            pq0 pq0Var = (pq0) obj2;
                            arrayList.add(pq0Var.o);
                            arrayList2.add(pq0Var.p);
                            arrayList3 = arrayList3;
                        }
                        jj2Var2.add(new ks2(M.j(m8), M.j(m9), M.j(m10), arrayList, arrayList2));
                        m6 = i2;
                        m7 = i4;
                        W = list2;
                    }
                }
                jj2 a = qj2.a(jj2Var2);
                yk3.w(M, null);
                M = nc2Var.M("PRAGMA index_list(`" + str + "`)");
                try {
                    int m11 = bd3.m(M, "name");
                    int m12 = bd3.m(M, FirebaseAnalytics.Param.ORIGIN);
                    int m13 = bd3.m(M, "unique");
                    if (m11 == -1 || m12 == -1 || m13 == -1) {
                        yk3.w(M, null);
                        jj2Var = null;
                    } else {
                        jj2 jj2Var3 = new jj2();
                        while (true) {
                            if (!M.E()) {
                                break;
                            }
                            if ("c".equals(M.j(m12))) {
                                ls2 X = l41.X(nc2Var, M.j(m11), M.getLong(m13) == 1);
                                if (X == null) {
                                    yk3.w(M, null);
                                    jj2Var = null;
                                    break;
                                }
                                jj2Var3.add(X);
                            }
                        }
                    }
                    return new ms2(str, b, a, jj2Var);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final w72 l(t81 t81Var) {
        w72 r = yk3.r(t81Var);
        float f = r.a;
        float f2 = r.b;
        long g = t81Var.g((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float f3 = r.c;
        float f4 = r.d;
        long g2 = t81Var.g((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        return new w72(Float.intBitsToFloat((int) (g >> 32)), Float.intBitsToFloat((int) (g & 4294967295L)), Float.intBitsToFloat((int) (g2 >> 32)), Float.intBitsToFloat((int) (g2 & 4294967295L)));
    }

    public static int m(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long n(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }
}
