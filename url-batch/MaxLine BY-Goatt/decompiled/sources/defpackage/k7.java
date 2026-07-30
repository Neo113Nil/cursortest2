package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k7 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(fp1 fp1Var, cp1 cp1Var, boolean z) {
        super(0);
        this.m = 16;
        this.n = fp1Var;
        this.o = cp1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [ul1] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [ul1] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [eo1] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [eo1] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean dispatchKeyEvent;
        boolean dispatchGenericMotionEvent;
        ai2 ai2Var;
        i91 i91Var;
        long j;
        long j2;
        cw2 d;
        sc1 sc1Var;
        yd ydVar;
        int i = this.m;
        int i2 = 1;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 1:
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj);
                return Boolean.valueOf(dispatchGenericMotionEvent);
            case 2:
                b8 b8Var = (b8) obj;
                ef2 ef2Var = (ef2) obj2;
                ye2 ye2Var = ef2Var.q;
                ye2 ye2Var2 = ef2Var.r;
                Float f = ef2Var.o;
                Float f2 = ef2Var.p;
                float floatValue = (ye2Var == null || f == null) ? 0.0f : ((Number) ye2Var.a.invoke()).floatValue() - f.floatValue();
                float floatValue2 = (ye2Var2 == null || f2 == null) ? 0.0f : ((Number) ye2Var2.a.invoke()).floatValue() - f2.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int v = b8Var.v(ef2Var.m);
                    di2 di2Var = (di2) b8Var.o().b(b8Var.n);
                    if (di2Var != null) {
                        try {
                            g2 g2Var = b8Var.p;
                            if (g2Var != null) {
                                g2Var.a.setBoundsInScreen(b8Var.f(di2Var));
                                Unit unit = Unit.a;
                            }
                        } catch (IllegalStateException unused) {
                            Unit unit2 = Unit.a;
                        }
                    }
                    di2 di2Var2 = (di2) b8Var.o().b(b8Var.o);
                    if (di2Var2 != null) {
                        try {
                            g2 g2Var2 = b8Var.q;
                            if (g2Var2 != null) {
                                g2Var2.a.setBoundsInScreen(b8Var.f(di2Var2));
                                Unit unit3 = Unit.a;
                            }
                        } catch (IllegalStateException unused2) {
                            Unit unit4 = Unit.a;
                        }
                    }
                    b8Var.d.invalidate();
                    di2 di2Var3 = (di2) b8Var.o().b(v);
                    if (di2Var3 != null && (ai2Var = di2Var3.a) != null && (i91Var = ai2Var.c) != null) {
                        if (ye2Var != null) {
                            b8Var.s.h(v, ye2Var);
                        }
                        if (ye2Var2 != null) {
                            b8Var.t.h(v, ye2Var2);
                        }
                        b8Var.r(i91Var);
                    }
                }
                if (ye2Var != null) {
                    ef2Var.o = (Float) ye2Var.a.invoke();
                }
                if (ye2Var2 != null) {
                    ef2Var.p = (Float) ye2Var2.a.invoke();
                }
                return Unit.a;
            case 3:
                ((gt) obj2).d(obj);
                return Unit.a;
            case 4:
                nv2 nv2Var = (nv2) obj2;
                zn1 zn1Var = (zn1) obj;
                if (!jw2.a(nv2Var.b, ((nv2) zn1Var.getValue()).b) || !Intrinsics.b(nv2Var.c, ((nv2) zn1Var.getValue()).c)) {
                    zn1Var.setValue(nv2Var);
                }
                return Unit.a;
            case 5:
                ((hr) obj2).C.invoke((ir) obj);
                return Unit.a;
            case 6:
                ((sc1) obj2).u.invoke(new b11(((c11) obj).e));
                return Boolean.TRUE;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                sc1 sc1Var2 = (sc1) obj2;
                to0 to0Var = (to0) obj;
                if (sc1Var2.b()) {
                    kn2 kn2Var = sc1Var2.c;
                    if (kn2Var != null) {
                        ((r90) kn2Var).b();
                    }
                } else {
                    to0Var.getClass();
                    to0Var.a(new cv2(i2, 26));
                }
                return Boolean.TRUE;
            case 8:
                ((ab0) obj2).e((cp1) obj, false);
                return Unit.a;
            case 9:
                ((c82) obj2).m = ((yo0) obj).H0();
                return Unit.a;
            case 10:
                ((c82) obj2).m = tk3.J((dp0) obj, l12.a);
                return Unit.a;
            case 11:
                ((rx0) obj2).d((ul1) obj);
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                fs1 fs1Var = ((i91) obj2).P;
                c82 c82Var = (c82) obj;
                if ((fs1Var.f.p & 8) != 0) {
                    for (ul1 ul1Var = fs1Var.e; ul1Var != null; ul1Var = ul1Var.q) {
                        if ((ul1Var.o & 8) != 0) {
                            p90 p90Var = ul1Var;
                            ?? r1 = 0;
                            while (p90Var != 0) {
                                if (p90Var instanceof xh2) {
                                    xh2 xh2Var = (xh2) p90Var;
                                    if (xh2Var.i0()) {
                                        sh2 sh2Var = new sh2();
                                        c82Var.m = sh2Var;
                                        sh2Var.p = true;
                                    }
                                    if (xh2Var.k0()) {
                                        ((sh2) c82Var.m).o = true;
                                    }
                                    xh2Var.M((sh2) c82Var.m);
                                } else if ((p90Var.o & 8) != 0 && (p90Var instanceof p90)) {
                                    ul1 ul1Var2 = p90Var.B;
                                    int i3 = 0;
                                    p90Var = p90Var;
                                    r1 = r1;
                                    while (ul1Var2 != null) {
                                        if ((ul1Var2.o & 8) != 0) {
                                            i3++;
                                            r1 = r1;
                                            if (i3 == 1) {
                                                p90Var = ul1Var2;
                                            } else {
                                                if (r1 == 0) {
                                                    r1 = new eo1(new ul1[16]);
                                                }
                                                if (p90Var != 0) {
                                                    r1.b(p90Var);
                                                    p90Var = 0;
                                                }
                                                r1.b(ul1Var2);
                                            }
                                        }
                                        ul1Var2 = ul1Var2.r;
                                        p90Var = p90Var;
                                        r1 = r1;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                p90Var = s03.c(r1);
                            }
                        }
                    }
                }
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                da1 da1Var = (da1) ((ia0) obj2).getValue();
                va1 va1Var = (va1) obj;
                return new fa1(va1Var, da1Var, new yf((IntRange) ((pb1) va1Var.b.e).getValue(), da1Var));
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                hy1 hy1Var = (hy1) ((ia0) obj2).getValue();
                q80 q80Var = (q80) obj;
                return new iy1(q80Var, hy1Var, new yf((IntRange) ((pb1) q80Var.c.r).getValue(), hy1Var));
            case 15:
                xg1 xg1Var = (xg1) obj2;
                m91 m91Var = xg1Var.r;
                m91Var.h = 0;
                eo1 y = m91Var.a.y();
                Object[] objArr = y.m;
                int i4 = y.o;
                for (int i5 = 0; i5 < i4; i5++) {
                    xg1 xg1Var2 = ((i91) objArr[i5]).Q.q;
                    xg1Var2.getClass();
                    xg1Var2.t = xg1Var2.u;
                    xg1Var2.u = Integer.MAX_VALUE;
                    if (xg1Var2.v == g91.n) {
                        xg1Var2.v = g91.o;
                    }
                }
                i91 i91Var2 = m91Var.a;
                i91 i91Var3 = m91Var.a;
                eo1 y2 = i91Var2.y();
                Object[] objArr2 = y2.m;
                int i6 = y2.o;
                for (int i7 = 0; i7 < i6; i7++) {
                    xg1 xg1Var3 = ((i91) objArr2[i7]).Q.q;
                    xg1Var3.getClass();
                    xg1Var3.C.getClass();
                    Unit unit5 = Unit.a;
                }
                m21 m21Var = xg1Var.n().b0;
                if (m21Var != null) {
                    boolean z = m21Var.w;
                    bo1 bo1Var = (bo1) i91Var3.n();
                    int i8 = bo1Var.m.o;
                    for (int i9 = 0; i9 < i8; i9++) {
                        sg1 O0 = ((i91) bo1Var.get(i9)).P.d.O0();
                        if (O0 != null) {
                            O0.w = z;
                        }
                    }
                }
                ((sg1) obj).y0().b();
                if (xg1Var.n().b0 != null) {
                    bo1 bo1Var2 = (bo1) i91Var3.n();
                    int i10 = bo1Var2.m.o;
                    for (int i11 = 0; i11 < i10; i11++) {
                        sg1 O02 = ((i91) bo1Var2.get(i11)).P.d.O0();
                        if (O02 != null) {
                            O02.w = false;
                        }
                    }
                }
                eo1 y3 = i91Var3.y();
                Object[] objArr3 = y3.m;
                int i12 = y3.o;
                for (int i13 = 0; i13 < i12; i13++) {
                    xg1 xg1Var4 = ((i91) objArr3[i13]).Q.q;
                    xg1Var4.getClass();
                    int i14 = xg1Var4.t;
                    int i15 = xg1Var4.u;
                    if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                        xg1Var4.m0(true);
                    }
                }
                eo1 y4 = i91Var3.y();
                Object[] objArr4 = y4.m;
                int i16 = y4.o;
                for (int i17 = 0; i17 < i16; i17++) {
                    xg1 xg1Var5 = ((i91) objArr4[i17]).Q.q;
                    xg1Var5.getClass();
                    j91 j91Var = xg1Var5.C;
                    j91Var.getClass();
                    j91Var.c = false;
                    Unit unit6 = Unit.a;
                }
                return Unit.a;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                ((fp1) obj2).d((cp1) obj);
                return Unit.a;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                Context context = (Context) obj2;
                context.getClass();
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(((a42) obj).a.concat(".preferences_pb")));
            case 18:
                w72 w72Var = (w72) obj2;
                if (w72Var != null) {
                    return w72Var;
                }
                ks1 ks1Var = (ks1) obj;
                if (!ks1Var.Q0().z) {
                    ks1Var = null;
                }
                if (ks1Var != null) {
                    return tk3.p(0L, zm3.Q(ks1Var.o));
                }
                return null;
            case 19:
                SharedPreferences sharedPreferences = ((Context) obj2).getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            default:
                gv2 gv2Var = (gv2) obj2;
                long j3 = ((x31) ((zn1) obj).getValue()).a;
                au1 g = gv2Var.g();
                if (g != null) {
                    long j4 = g.a;
                    sc1 sc1Var3 = gv2Var.d;
                    yd ydVar2 = sc1Var3 != null ? sc1Var3.a.a : null;
                    if (ydVar2 != null && ydVar2.n.length() != 0) {
                        xw0 xw0Var = (xw0) gv2Var.o.getValue();
                        int i18 = xw0Var == null ? -1 : iv2.a[xw0Var.ordinal()];
                        if (i18 != -1) {
                            if (i18 == 1 || i18 == 2) {
                                long j5 = gv2Var.j().b;
                                int i19 = jw2.c;
                                j2 = j5 >> 32;
                            } else {
                                if (i18 != 3) {
                                    a.b();
                                    return null;
                                }
                                long j6 = gv2Var.j().b;
                                int i20 = jw2.c;
                                j2 = j6 & 4294967295L;
                            }
                            int i21 = (int) j2;
                            sc1 sc1Var4 = gv2Var.d;
                            if (sc1Var4 != null && (d = sc1Var4.d()) != null && (sc1Var = gv2Var.d) != null && (ydVar = sc1Var.a.a) != null) {
                                int c = d.c(gv2Var.b.g(i21), 0, ydVar.n.length());
                                float d2 = au1.d(d.d(j4));
                                bw2 bw2Var = d.a;
                                int e = bw2Var.e(c);
                                sm1 sm1Var = bw2Var.b;
                                float f3 = bw2Var.f(e);
                                float g2 = bw2Var.g(e);
                                float b = d.b(d2, Math.min(f3, g2), Math.max(f3, g2));
                                if (x31.a(j3, 0L) || Math.abs(d2 - b) <= ((int) (j3 >> 32)) / 2) {
                                    float d3 = sm1Var.d(e);
                                    j = ap.i(b, ((sm1Var.b(e) - d3) / 2.0f) + d3);
                                    return new au1(j);
                                }
                            }
                        }
                    }
                }
                j = 9205357640488583168L;
                return new au1(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7(int i, Object obj, Object obj2) {
        super(0);
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }
}
