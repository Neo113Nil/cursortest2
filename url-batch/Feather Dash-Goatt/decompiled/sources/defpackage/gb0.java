package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class gb0 {
    public static final long A(long j) {
        if (j < 0) {
            ku.d.getClass();
            return ku.g;
        }
        ku.d.getClass();
        return ku.e;
    }

    public static final boolean B(s11 s11Var, s11 s11Var2, s11 s11Var3, int i) {
        if (!C(i, s11Var, s11Var3)) {
            return false;
        }
        if (C(i, s11Var2, s11Var3) && !g(s11Var3, s11Var, s11Var2, i)) {
            return !g(s11Var3, s11Var2, s11Var, i) && D(i, s11Var3, s11Var) < D(i, s11Var3, s11Var2);
        }
        return true;
    }

    public static final boolean C(int i, s11 s11Var, s11 s11Var2) {
        if (i == 3) {
            float f = s11Var2.c;
            float f2 = s11Var2.a;
            float f3 = s11Var.c;
            return (f > f3 || f2 >= f3) && f2 > s11Var.a;
        }
        if (i == 4) {
            float f4 = s11Var2.a;
            float f5 = s11Var2.c;
            float f6 = s11Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < s11Var.c;
        }
        if (i == 5) {
            float f7 = s11Var2.d;
            float f8 = s11Var2.b;
            float f9 = s11Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > s11Var.b;
        }
        if (i != 6) {
            dd0.j("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = s11Var2.b;
        float f11 = s11Var2.d;
        float f12 = s11Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < s11Var.d;
    }

    public static final long D(int i, s11 s11Var, s11 s11Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = s11Var.a;
            f2 = s11Var2.c;
        } else if (i == 4) {
            f = s11Var2.a;
            f2 = s11Var.c;
        } else if (i == 5) {
            f = s11Var.b;
            f2 = s11Var2.d;
        } else {
            if (i != 6) {
                dd0.j("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = s11Var2.b;
            f2 = s11Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = s11Var.b;
            f3 = ((s11Var.d - f7) / 2.0f) + f7;
            f4 = s11Var2.b;
            f5 = s11Var2.d;
        } else {
            if (i != 5 && i != 6) {
                dd0.j("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = s11Var.a;
            f3 = ((s11Var.c - f8) / 2.0f) + f8;
            f4 = s11Var2.a;
            f5 = s11Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static wk0 E(o41 o41Var, int i, int i2, int i3, int i4, int i5, ej0 ej0Var, List list, zw0[] zw0VarArr, int i6) {
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j = i5;
        int[] iArr = new int[i6];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        float f2 = 0.0f;
        while (true) {
            if (i12 >= i6) {
                break;
            }
            qk0 qk0Var = (qk0) list2.get(i12);
            long j2 = j;
            Object h = qk0Var.h();
            p41 p41Var = h instanceof p41 ? (p41) h : null;
            float f3 = p41Var != null ? p41Var.a : 0.0f;
            if (f3 > 0.0f) {
                f2 += f3;
                i13++;
            } else {
                int i16 = i3 - i14;
                zw0 zw0Var = zw0VarArr[i12];
                if (zw0Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i9 = i16;
                        i10 = Integer.MAX_VALUE;
                    } else if (i16 < 0) {
                        i9 = i16;
                        i10 = 0;
                    } else {
                        i10 = i16;
                        i9 = i10;
                    }
                    zw0Var = qk0Var.c(o41Var.c(0, i10, i4, false));
                } else {
                    i9 = i16;
                }
                int e = o41Var.e(zw0Var);
                int d = o41Var.d(zw0Var);
                iArr[i12] = e;
                int i17 = i9 - e;
                if (i17 < 0) {
                    i17 = 0;
                }
                i15 = Math.min(i5, i17);
                i14 += e + i15;
                i11 = Math.max(i11, d);
                zw0VarArr[i12] = zw0Var;
            }
            i12++;
            j = j2;
        }
        long j3 = j;
        if (i13 == 0) {
            i14 -= i15;
            i7 = 0;
        } else {
            long j4 = (i13 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i14) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f4 = j5 / f2;
            for (int i18 = 0; i18 < i6; i18++) {
                Object h2 = ((qk0) list2.get(i18)).h();
                j5 -= Math.round(((h2 instanceof p41 ? (p41) h2 : null) != null ? r14.a : 0.0f) * f4);
            }
            int i19 = 0;
            int i20 = 0;
            while (i20 < i6) {
                if (zw0VarArr[i20] == null) {
                    qk0 qk0Var2 = (qk0) list2.get(i20);
                    Object h3 = qk0Var2.h();
                    f = f4;
                    p41 p41Var2 = h3 instanceof p41 ? (p41) h3 : null;
                    float f5 = p41Var2 != null ? p41Var2.a : 0.0f;
                    if (f5 <= 0.0f) {
                        m80.b("All weights <= 0 should have placeables");
                    }
                    float f6 = f5;
                    int signum = Long.signum(j5);
                    j5 -= signum;
                    int max = Math.max(0, Math.round(f6 * f) + signum);
                    if ((p41Var2 != null ? p41Var2.b : true) && max != Integer.MAX_VALUE) {
                        i8 = max;
                        zw0 c = qk0Var2.c(o41Var.c(i8, max, i4, true));
                        int e2 = o41Var.e(c);
                        int d2 = o41Var.d(c);
                        iArr[i20] = e2;
                        i19 += e2;
                        int max2 = Math.max(i11, d2);
                        zw0VarArr[i20] = c;
                        i11 = max2;
                    }
                    i8 = 0;
                    zw0 c2 = qk0Var2.c(o41Var.c(i8, max, i4, true));
                    int e22 = o41Var.e(c2);
                    int d22 = o41Var.d(c2);
                    iArr[i20] = e22;
                    i19 += e22;
                    int max22 = Math.max(i11, d22);
                    zw0VarArr[i20] = c2;
                    i11 = max22;
                } else {
                    f = f4;
                }
                i20++;
                list2 = list;
                f4 = f;
            }
            i7 = (int) (i19 + j4);
            int i21 = i3 - i14;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i21) {
                i7 = i21;
            }
        }
        int i22 = i7 + i14;
        if (i22 < 0) {
            i22 = 0;
        }
        int max3 = Math.max(i22, i);
        int max4 = Math.max(i11, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        o41Var.a(max3, iArr, iArr2, ej0Var);
        return o41Var.b(zw0VarArr, ej0Var, iArr2, max3, max4);
    }

    public static av0 F(Object obj) {
        return new av0(obj, j41.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void G(zl0 zl0Var, Function0 function0) {
        vq0 vq0Var = zl0Var.k;
        if (vq0Var == null) {
            vq0Var = new vq0((uq0) zl0Var);
            zl0Var.k = vq0Var;
        }
        gu0 snapshotObserver = ((d4) op.J(zl0Var)).getSnapshotObserver();
        snapshotObserver.a.b(vq0Var, y3.z, function0);
    }

    public static final ao0 H(Object obj, hl hlVar) {
        Object L = hlVar.L();
        if (L == bl.a) {
            L = F(obj);
            hlVar.h0(L);
        }
        ao0 ao0Var = (ao0) L;
        ao0Var.setValue(obj);
        return ao0Var;
    }

    public static final boolean I(vn0 vn0Var, Object obj, Object obj2) {
        Object g = vn0Var.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof wn0)) {
            if (!g.equals(obj2)) {
                return false;
            }
            vn0Var.k(obj);
            return true;
        }
        wn0 wn0Var = (wn0) g;
        boolean l = wn0Var.l(obj2);
        if (l && wn0Var.g()) {
            vn0Var.k(obj);
        }
        return l;
    }

    public static final void J(vn0 vn0Var, Object obj) {
        boolean z;
        long[] jArr = vn0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = vn0Var.b[i4];
                        Object obj3 = vn0Var.c[i4];
                        if (obj3 instanceof wn0) {
                            wn0 wn0Var = (wn0) obj3;
                            wn0Var.l(obj);
                            z = wn0Var.g();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            vn0Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final th1 K(th1 th1Var, vc0 vc0Var) {
        long j;
        bh1 bh1Var;
        int i;
        int i2;
        lh1 lh1Var;
        jc1 jc1Var = th1Var.a;
        zg1 zg1Var = kc1.d;
        zg1 zg1Var2 = jc1Var.a;
        if (zg1Var2.equals(j50.C)) {
            zg1Var2 = kc1.d;
        }
        zg1 zg1Var3 = zg1Var2;
        long j2 = jc1Var.b;
        xh1[] xh1VarArr = wh1.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = kc1.a;
        }
        long j3 = j2;
        x20 x20Var = jc1Var.c;
        if (x20Var == null) {
            x20Var = x20.i;
        }
        x20 x20Var2 = x20Var;
        t20 t20Var = jc1Var.d;
        t20 t20Var2 = new t20(t20Var != null ? t20Var.a : 0);
        u20 u20Var = jc1Var.e;
        u20 u20Var2 = new u20(u20Var != null ? u20Var.a : 65535);
        w10 w10Var = jc1Var.f;
        if (w10Var == null) {
            w10Var = w10.d;
        }
        w10 w10Var2 = w10Var;
        String str = jc1Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = jc1Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = kc1.b;
        }
        long j5 = j4;
        ad adVar = jc1Var.i;
        float f = adVar != null ? adVar.a : 0.0f;
        ad adVar2 = new ad(Float.isNaN(f) ? 0.0f : f);
        ah1 ah1Var = jc1Var.j;
        if (ah1Var == null) {
            ah1Var = ah1.c;
        }
        ah1 ah1Var2 = ah1Var;
        mi0 mi0Var = jc1Var.k;
        if (mi0Var == null) {
            mi0 mi0Var2 = mi0.g;
            mi0Var = ca0.m();
        }
        mi0 mi0Var3 = mi0Var;
        long j6 = jc1Var.l;
        if (j6 == 16) {
            j6 = kc1.c;
        }
        long j7 = j6;
        wg1 wg1Var = jc1Var.m;
        if (wg1Var == null) {
            wg1Var = wg1.b;
        }
        wg1 wg1Var2 = wg1Var;
        s91 s91Var = jc1Var.n;
        if (s91Var == null) {
            s91Var = s91.d;
        }
        s91 s91Var2 = s91Var;
        p4 p4Var = jc1Var.o;
        if (p4Var == null) {
            p4Var = uy.q;
        }
        jc1 jc1Var2 = new jc1(zg1Var3, j3, x20Var2, t20Var2, u20Var2, w10Var2, str2, j5, adVar2, ah1Var2, mi0Var3, j7, wg1Var2, s91Var2, p4Var);
        uu0 uu0Var = th1Var.b;
        int i3 = vu0.b;
        int i4 = uu0Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = uu0Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int ordinal = vc0Var.ordinal();
                if (ordinal == 0) {
                    i6 = 1;
                } else {
                    if (ordinal != 1) {
                        l.a();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = uu0Var.c;
            if ((j & 1095216660480L) == 0) {
                j = vu0.a;
            }
            bh1Var = uu0Var.d;
            if (bh1Var == null) {
                bh1Var = bh1.c;
            }
            hx0 hx0Var = uu0Var.e;
            jh0 jh0Var = uu0Var.f;
            i = uu0Var.g;
            if (i == 0) {
                i = eh0.b;
            }
            i2 = uu0Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            lh1Var = uu0Var.i;
            if (lh1Var == null) {
                lh1Var = lh1.c;
            }
            return new th1(jc1Var2, new uu0(i4, i6, j, bh1Var, hx0Var, jh0Var, i, i2, lh1Var), th1Var.c);
        }
        int ordinal2 = vc0Var.ordinal();
        if (ordinal2 == 0) {
            i5 = 4;
        } else if (ordinal2 != 1) {
            l.a();
            return null;
        }
        i6 = i5;
        j = uu0Var.c;
        if ((j & 1095216660480L) == 0) {
        }
        bh1Var = uu0Var.d;
        if (bh1Var == null) {
        }
        hx0 hx0Var2 = uu0Var.e;
        jh0 jh0Var2 = uu0Var.f;
        i = uu0Var.g;
        if (i == 0) {
        }
        i2 = uu0Var.h;
        if (i2 == 0) {
        }
        lh1Var = uu0Var.i;
        if (lh1Var == null) {
        }
        return new th1(jc1Var2, new uu0(i4, i6, j, bh1Var, hx0Var2, jh0Var2, i, i2, lh1Var), th1Var.c);
    }

    public static final boolean L(int i, z6 z6Var, o10 o10Var, s11 s11Var) {
        o10 r;
        eo0 eo0Var = new eo0(new o10[16]);
        if (!o10Var.d.r) {
            o80.b("visitChildren called on an unattached node");
        }
        eo0 eo0Var2 = new eo0(new zl0[16]);
        zl0 zl0Var = o10Var.d;
        zl0 zl0Var2 = zl0Var.j;
        if (zl0Var2 == null) {
            op.l(eo0Var2, zl0Var);
        } else {
            eo0Var2.b(zl0Var2);
        }
        while (true) {
            int i2 = eo0Var2.g;
            if (i2 == 0) {
                break;
            }
            zl0 zl0Var3 = (zl0) eo0Var2.k(i2 - 1);
            if ((zl0Var3.h & 1024) == 0) {
                op.l(eo0Var2, zl0Var3);
            } else {
                while (true) {
                    if (zl0Var3 == null) {
                        break;
                    }
                    if ((zl0Var3.g & 1024) != 0) {
                        eo0 eo0Var3 = null;
                        while (zl0Var3 != null) {
                            if (zl0Var3 instanceof o10) {
                                o10 o10Var2 = (o10) zl0Var3;
                                if (o10Var2.r) {
                                    eo0Var.b(o10Var2);
                                }
                            } else if ((zl0Var3.g & 1024) != 0 && (zl0Var3 instanceof zq)) {
                                int i3 = 0;
                                for (zl0 zl0Var4 = ((zq) zl0Var3).t; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
                                    if ((zl0Var4.g & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            zl0Var3 = zl0Var4;
                                        } else {
                                            if (eo0Var3 == null) {
                                                eo0Var3 = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var3 != null) {
                                                eo0Var3.b(zl0Var3);
                                                zl0Var3 = null;
                                            }
                                            eo0Var3.b(zl0Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            zl0Var3 = op.o(eo0Var3);
                        }
                    } else {
                        zl0Var3 = zl0Var3.j;
                    }
                }
            }
        }
        while (eo0Var.g != 0 && (r = r(eo0Var, s11Var, i)) != null) {
            if (r.B0().a) {
                return ((Boolean) z6Var.invoke(r)).booleanValue();
            }
            if (u(i, z6Var, r, s11Var)) {
                return true;
            }
            eo0Var.j(r);
        }
        return false;
    }

    public static final c7 M(h7 h7Var, int i) {
        Object obj;
        Iterator<T> it = h7Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jd0) ((Map.Entry) obj).getKey()).e == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (c7) entry.getValue();
        }
        return null;
    }

    public static final void N(mx0 mx0Var, long j, Function1 function1, boolean z) {
        MotionEvent a = mx0Var.a();
        if (a == null) {
            dd0.e("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = a.getAction();
        if (z) {
            a.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        a.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        function1.invoke(a);
        a.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        a.setAction(action);
    }

    public static final Boolean O(int i, z6 z6Var, o10 o10Var, s11 s11Var) {
        int ordinal = o10Var.E0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                o10 H = uq1.H(o10Var);
                if (H == null) {
                    dd0.j("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = H.E0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean O = O(i, z6Var, H, s11Var);
                        if (!Intrinsics.a(O, Boolean.FALSE)) {
                            return O;
                        }
                        if (s11Var == null) {
                            if (H.E0() != j10.e) {
                                dd0.j("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            o10 E = uq1.E(H);
                            if (E == null) {
                                dd0.j("ActiveParent must have a focusedChild");
                                return null;
                            }
                            s11Var = uq1.G(E);
                        }
                        return Boolean.valueOf(u(i, z6Var, o10Var, s11Var));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            l.a();
                            return null;
                        }
                        dd0.j("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (s11Var == null) {
                    s11Var = uq1.G(H);
                }
                return Boolean.valueOf(u(i, z6Var, o10Var, s11Var));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return o10Var.B0().a ? (Boolean) z6Var.invoke(o10Var) : s11Var == null ? Boolean.valueOf(s(o10Var, i, z6Var)) : Boolean.valueOf(L(i, z6Var, o10Var, s11Var));
                }
                l.a();
                return null;
            }
        }
        return Boolean.valueOf(s(o10Var, i, z6Var));
    }

    public static final int P(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void a(Function0 function0, hl hlVar, int i) {
        int i2;
        s40 c;
        hlVar.Y(-913210813);
        if ((i & 6) == 0) {
            i2 = (hlVar.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (hlVar.O(i2 & 1, (i2 & 3) != 2)) {
            hlVar.X(1729797275);
            wj wjVar = (wj) hlVar.j(ki0.a);
            if (wjVar == null) {
                hlVar.W(1260197609);
                wjVar = y90.r((View) hlVar.j(AndroidCompositionLocals_androidKt.f));
            } else {
                hlVar.W(1260196493);
            }
            hlVar.p(false);
            if (wjVar == null) {
                dd0.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            boolean z = wjVar instanceof wj;
            bo c2 = z ? wjVar.c() : ao.b;
            yg a = a21.a(z8.class);
            if (z) {
                mj0 g = wjVar.g();
                wn1 d = wjVar.d();
                g.getClass();
                d.getClass();
                c2.getClass();
                c = new s40(g, d, c2);
            } else {
                c = me1.c(wjVar, null, 6);
            }
            tn1 p = c.p(a);
            hlVar.p(false);
            uq1.h((z8) p, function0, false, hlVar, ((i2 << 3) & 112) | 384);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new lf0(i, i3, function0);
        }
    }

    public static final void b(mf0 mf0Var, Object obj, int i, Object obj2, hl hlVar, int i2) {
        hlVar.Y(1439843069);
        int i3 = (hlVar.f(mf0Var) ? 4 : 2) | i2 | (hlVar.f(obj) ? 32 : 16) | (hlVar.d(i) ? 256 : 128) | (hlVar.f(obj2) ? 2048 : 1024);
        if (hlVar.O(i3 & 1, (i3 & 1171) != 1170)) {
            ((p51) obj).a(obj2, m90.J(980966366, new qe0(i, mf0Var, obj2), hlVar), hlVar, 48);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new fk(mf0Var, obj, i, obj2, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x01cf, code lost:
    
        if (r5.startsWith("/Wzb5/zfzl1hw2") != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x042c, code lost:
    
        if (r4 == r3) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0336 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(nd1 nd1Var, final ka kaVar, final rz rzVar, final ix ixVar, final Intent intent, final Function0 function0, Function0 function02, hl hlVar, final int i) {
        Function0 function03;
        nd1 nd1Var2;
        hl hlVar2;
        ao0 ao0Var;
        ao0 ao0Var2;
        ao0 ao0Var3;
        String str;
        Uri data;
        String str2;
        boolean h;
        Object L;
        Object Y;
        boolean f;
        Object L2;
        Object obj;
        Object obj2;
        Object obj3;
        boolean f2;
        Object ed1Var;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        ao0 ao0Var4;
        Object obj8;
        ao0 ao0Var5;
        yu0 yu0Var;
        Object obj9;
        ao0 ao0Var6;
        ao0 ao0Var7;
        ao0 ao0Var8;
        int i2;
        Context context;
        ao0 ao0Var9;
        boolean f3;
        Object obj10;
        int ordinal;
        boolean z;
        ao0 ao0Var10;
        nd1Var.getClass();
        kaVar.getClass();
        rzVar.getClass();
        ixVar.getClass();
        function0.getClass();
        function02.getClass();
        hlVar.Y(5947143);
        int i3 = i | (hlVar.h(nd1Var) ? 4 : 2) | (hlVar.f(kaVar) ? 32 : 16) | (hlVar.f(rzVar) ? 256 : 128) | (hlVar.h(intent) ? 16384 : 8192) | (hlVar.h(function0) ? 131072 : 65536) | (hlVar.h(function02) ? 1048576 : 524288);
        if (hlVar.O(i3 & 1, (599187 & i3) != 599186)) {
            Context context2 = (Context) hlVar.j(AndroidCompositionLocals_androidKt.b);
            dn dnVar = null;
            ao0 j = j(nd1Var.b, new vd1(kd1.d, "", 0L, 0L, 0L), null, hlVar, 2);
            Object L3 = hlVar.L();
            Object obj11 = bl.a;
            if (L3 == obj11) {
                L3 = p4.A(g.d, hlVar);
                hlVar.h0(L3);
            }
            Object obj12 = (sn) L3;
            Object L4 = hlVar.L();
            if (L4 == obj11) {
                L4 = F(jd1.d);
                hlVar.h0(L4);
            }
            ao0 ao0Var11 = (ao0) L4;
            Object L5 = hlVar.L();
            if (L5 == obj11) {
                L5 = new yu0(System.currentTimeMillis());
                hlVar.h0(L5);
            }
            yu0 yu0Var2 = (yu0) L5;
            Object L6 = hlVar.L();
            if (L6 == obj11) {
                L6 = F(Boolean.FALSE);
                hlVar.h0(L6);
            }
            ao0 ao0Var12 = (ao0) L6;
            Object L7 = hlVar.L();
            if (L7 == obj11) {
                L7 = F(Boolean.FALSE);
                hlVar.h0(L7);
            }
            ao0 ao0Var13 = (ao0) L7;
            Object L8 = hlVar.L();
            if (L8 == obj11) {
                L8 = F(Boolean.FALSE);
                hlVar.h0(L8);
            }
            ao0 ao0Var14 = (ao0) L8;
            Object L9 = hlVar.L();
            if (L9 == obj11) {
                L9 = F(Boolean.FALSE);
                hlVar.h0(L9);
            }
            ao0 ao0Var15 = (ao0) L9;
            Object L10 = hlVar.L();
            if (L10 == obj11) {
                L10 = F(Boolean.FALSE);
                hlVar.h0(L10);
            }
            ao0 ao0Var16 = (ao0) L10;
            Object L11 = hlVar.L();
            if (L11 == obj11) {
                L11 = F(null);
                hlVar.h0(L11);
            }
            ao0 ao0Var17 = (ao0) L11;
            if (intent != null) {
                Regex regex = wd1.a;
                str = intent.getStringExtra("com.feathherdashh.dashgame.extra.PUSH_URL");
                if (str != null) {
                    if (StringsKt.n(str)) {
                        str = null;
                    }
                }
                str = intent.getStringExtra("url");
                if (str == null || StringsKt.n(str)) {
                    str = null;
                }
                if (str != null) {
                    ao0Var = ao0Var11;
                    ao0Var2 = ao0Var12;
                    ao0Var3 = ao0Var13;
                    i2 i2Var = new i2(0);
                    h = hlVar.h(obj12) | hlVar.h(nd1Var);
                    L = hlVar.L();
                    if (!h || L == obj11) {
                        L = new tm(obj12, ao0Var14, nd1Var, 4);
                        hlVar.h0(L);
                    }
                    Y = p4.Y(i2Var, (Function1) L, hlVar, 0);
                    f = hlVar.f(str) | ((458752 & i3) != 131072);
                    L2 = hlVar.L();
                    if (!f || L2 == obj11) {
                        L2 = new fx(str, function0, ao0Var17, dnVar, 2);
                        hlVar.h0(L2);
                    }
                    p4.i(hlVar, str, (Function2) L2);
                    obj = (jd1) ao0Var.getValue();
                    obj2 = ((vd1) j.getValue()).a;
                    obj3 = ((vd1) j.getValue()).b;
                    f2 = hlVar.f(j) | hlVar.h(context2) | hlVar.h(nd1Var) | ((i3 & 112) != 32) | ((i3 & 896) != 256);
                    Object L12 = hlVar.L();
                    if (!f2 || L12 == obj11) {
                        hlVar2 = hlVar;
                        obj4 = obj11;
                        obj5 = Y;
                        obj6 = obj12;
                        obj7 = obj2;
                        ao0Var4 = ao0Var14;
                        obj8 = obj3;
                        ao0Var5 = j;
                        yu0Var = yu0Var2;
                        obj9 = obj;
                        ao0Var6 = ao0Var17;
                        ao0 ao0Var18 = ao0Var;
                        ao0Var7 = ao0Var3;
                        ao0Var8 = ao0Var2;
                        i2 = i3;
                        context = context2;
                        ed1Var = new ed1(context, nd1Var, ixVar, kaVar, rzVar, ao0Var18, ao0Var7, ao0Var8, ao0Var5, ao0Var15, yu0Var, ao0Var16, ao0Var6, null);
                        ao0Var9 = ao0Var18;
                        nd1Var2 = nd1Var;
                        hlVar2.h0(ed1Var);
                    } else {
                        hlVar2 = hlVar;
                        obj4 = obj11;
                        obj5 = Y;
                        ed1Var = L12;
                        obj7 = obj2;
                        ao0Var4 = ao0Var14;
                        obj8 = obj3;
                        ao0Var5 = j;
                        yu0Var = yu0Var2;
                        obj6 = obj12;
                        obj9 = obj;
                        ao0Var6 = ao0Var17;
                        ao0Var9 = ao0Var;
                        ao0Var7 = ao0Var3;
                        ao0Var8 = ao0Var2;
                        nd1Var2 = nd1Var;
                        i2 = i3;
                        context = context2;
                    }
                    Function2 function2 = (Function2) ed1Var;
                    CoroutineContext coroutineContext = hlVar2.R;
                    f3 = hlVar2.f(obj9) | hlVar2.f(obj7) | hlVar2.f(obj8);
                    Object L13 = hlVar2.L();
                    if (f3) {
                        obj10 = obj4;
                    } else {
                        obj10 = obj4;
                    }
                    L13 = new qc0(coroutineContext, function2);
                    hlVar2.h0(L13);
                    ordinal = ((jd1) ao0Var9.getValue()).ordinal();
                    if (ordinal != 0) {
                        function03 = function02;
                        hlVar2.W(1082091201);
                        if (((Boolean) ao0Var7.getValue()).booleanValue()) {
                            hlVar2.W(1082122759);
                            op.i(null, hlVar2, 0);
                            hlVar2.p(false);
                        } else {
                            hlVar2.W(1082181225);
                            op.k(((Boolean) ao0Var8.getValue()).booleanValue(), null, hlVar2, 0);
                            hlVar2.p(false);
                        }
                        hlVar2.p(false);
                    } else {
                        if (ordinal != 1) {
                            hlVar2.W(1420379817);
                            hlVar2.p(false);
                            l.a();
                            return;
                        }
                        hlVar2.W(1082363536);
                        int ordinal2 = ((vd1) ao0Var5.getValue()).a.ordinal();
                        if (ordinal2 == 0) {
                            function03 = function02;
                            z = false;
                            hlVar2.W(1420444653);
                            op.k(false, null, hlVar2, 6);
                            hlVar2.p(false);
                        } else if (ordinal2 == 1) {
                            function03 = function02;
                            int i4 = 2;
                            z = false;
                            hlVar2.W(1082418437);
                            if (StringsKt.n(((vd1) ao0Var5.getValue()).b)) {
                                hlVar2.W(1082424792);
                                a(function03, hlVar2, (i2 >> 18) & 14);
                                hlVar2.p(false);
                            } else if (z(context)) {
                                vd1 vd1Var = (vd1) ao0Var5.getValue();
                                if (!((Boolean) ao0Var4.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 33 && p4.t(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (vd1Var.e <= 0) {
                                        long j2 = vd1Var.d;
                                        if (j2 == 0 || currentTimeMillis - j2 >= 259200000) {
                                            hlVar2.W(1082697995);
                                            Object obj13 = obj5;
                                            boolean h2 = hlVar2.h(obj13);
                                            Object L14 = hlVar2.L();
                                            if (h2 || L14 == obj10) {
                                                ao0Var10 = ao0Var4;
                                                L14 = new vc(obj13, 9, ao0Var10);
                                                hlVar2.h0(L14);
                                            } else {
                                                ao0Var10 = ao0Var4;
                                            }
                                            Function0 function04 = (Function0) L14;
                                            Object obj14 = obj6;
                                            boolean h3 = hlVar2.h(obj14) | hlVar2.h(nd1Var2);
                                            Object L15 = hlVar2.L();
                                            if (h3 || L15 == obj10) {
                                                L15 = new kc(obj14, ao0Var10, nd1Var2, 7);
                                                hlVar2.h0(L15);
                                            }
                                            op.j(function04, (Function0) L15, null, hlVar2, 0);
                                            hlVar2.p(false);
                                        }
                                    }
                                }
                                hlVar2.W(1083474142);
                                String str3 = ((vd1) ao0Var5.getValue()).b;
                                String str4 = (String) ao0Var6.getValue();
                                Object L16 = hlVar2.L();
                                if (L16 == obj10) {
                                    L16 = new te0(ao0Var6, i4);
                                    hlVar2.h0(L16);
                                }
                                Function0 function05 = (Function0) L16;
                                Object L17 = hlVar2.L();
                                if (L17 == obj10) {
                                    L17 = new kc(yu0Var, ao0Var7, ao0Var9, 8);
                                    hlVar2.h0(L17);
                                }
                                m90.e(str3, str4, function05, (Function0) L17, hlVar2, 3456);
                                hlVar2.p(false);
                            } else {
                                hlVar2.W(1082539647);
                                op.i(null, hlVar2, 0);
                                hlVar2.p(false);
                            }
                            hlVar2.p(false);
                        } else if (ordinal2 != 2) {
                            hlVar2.W(1420388274);
                            hlVar2.p(false);
                            l.a();
                            return;
                        } else {
                            hlVar2.W(1420442562);
                            function03 = function02;
                            a(function03, hlVar2, (i2 >> 18) & 14);
                            z = false;
                            hlVar2.p(false);
                        }
                        hlVar2.p(z);
                    }
                }
            }
            if (intent != null) {
                String str5 = ((vd1) j.getValue()).b;
                Regex regex2 = wd1.a;
                if (!StringsKt.n(str5) && (data = intent.getData()) != null) {
                    ao0Var = ao0Var11;
                    if (Intrinsics.a(data.getScheme(), "featherdash")) {
                        str2 = "";
                    } else {
                        str2 = "";
                        if (Intrinsics.a(data.getScheme(), "https") && Intrinsics.a(data.getHost(), "featherrdash.onelink.me")) {
                            String path = data.getPath();
                            if (path == null) {
                                path = str2;
                            }
                        }
                        ao0Var2 = ao0Var12;
                        ao0Var3 = ao0Var13;
                        str = null;
                        i2 i2Var2 = new i2(0);
                        h = hlVar.h(obj12) | hlVar.h(nd1Var);
                        L = hlVar.L();
                        if (!h) {
                        }
                        L = new tm(obj12, ao0Var14, nd1Var, 4);
                        hlVar.h0(L);
                        Y = p4.Y(i2Var2, (Function1) L, hlVar, 0);
                        f = hlVar.f(str) | ((458752 & i3) != 131072);
                        L2 = hlVar.L();
                        if (!f) {
                        }
                        L2 = new fx(str, function0, ao0Var17, dnVar, 2);
                        hlVar.h0(L2);
                        p4.i(hlVar, str, (Function2) L2);
                        obj = (jd1) ao0Var.getValue();
                        obj2 = ((vd1) j.getValue()).a;
                        obj3 = ((vd1) j.getValue()).b;
                        f2 = hlVar.f(j) | hlVar.h(context2) | hlVar.h(nd1Var) | ((i3 & 112) != 32) | ((i3 & 896) != 256);
                        Object L122 = hlVar.L();
                        if (f2) {
                        }
                        hlVar2 = hlVar;
                        obj4 = obj11;
                        obj5 = Y;
                        obj6 = obj12;
                        obj7 = obj2;
                        ao0Var4 = ao0Var14;
                        obj8 = obj3;
                        ao0Var5 = j;
                        yu0Var = yu0Var2;
                        obj9 = obj;
                        ao0Var6 = ao0Var17;
                        ao0 ao0Var182 = ao0Var;
                        ao0Var7 = ao0Var3;
                        ao0Var8 = ao0Var2;
                        i2 = i3;
                        context = context2;
                        ed1Var = new ed1(context, nd1Var, ixVar, kaVar, rzVar, ao0Var182, ao0Var7, ao0Var8, ao0Var5, ao0Var15, yu0Var, ao0Var16, ao0Var6, null);
                        ao0Var9 = ao0Var182;
                        nd1Var2 = nd1Var;
                        hlVar2.h0(ed1Var);
                        Function2 function22 = (Function2) ed1Var;
                        CoroutineContext coroutineContext2 = hlVar2.R;
                        f3 = hlVar2.f(obj9) | hlVar2.f(obj7) | hlVar2.f(obj8);
                        Object L132 = hlVar2.L();
                        if (f3) {
                        }
                        L132 = new qc0(coroutineContext2, function22);
                        hlVar2.h0(L132);
                        ordinal = ((jd1) ao0Var9.getValue()).ordinal();
                        if (ordinal != 0) {
                        }
                    }
                    Set<String> queryParameterNames = data.getQueryParameterNames();
                    queryParameterNames.getClass();
                    Set<String> set = queryParameterNames;
                    int a = hk0.a(ai.h(set));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a >= 16 ? a : 16);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Iterator it2 = it;
                        String queryParameter = data.getQueryParameter((String) next);
                        if (queryParameter == null) {
                            queryParameter = str2;
                        }
                        linkedHashMap.put(next, queryParameter);
                        it = it2;
                    }
                    String str6 = (String) linkedHashMap.get("deep_link_value");
                    if (str6 != null) {
                        if (StringsKt.n(str6)) {
                            str6 = null;
                        }
                        if (str6 != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                ao0 ao0Var19 = ao0Var12;
                                String str7 = (String) entry.getKey();
                                str7.getClass();
                                ao0 ao0Var20 = ao0Var13;
                                if (wd1.a.c(str7)) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                                ao0Var13 = ao0Var20;
                                ao0Var12 = ao0Var19;
                            }
                            ao0Var2 = ao0Var12;
                            ao0Var3 = ao0Var13;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            Iterator it3 = linkedHashMap2.entrySet().iterator();
                            while (it3.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it3.next();
                                if (!StringsKt.n((String) entry2.getValue())) {
                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                    it3 = it3;
                                }
                            }
                            if (!linkedHashMap3.isEmpty()) {
                                Uri.Builder appendQueryParameter = Uri.parse(str5).buildUpon().appendQueryParameter("deep_link_value", str6);
                                for (Map.Entry entry3 : new TreeMap(linkedHashMap3).entrySet()) {
                                    appendQueryParameter.appendQueryParameter((String) entry3.getKey(), (String) entry3.getValue());
                                }
                                String str8 = (String) linkedHashMap.get("media_source");
                                if (str8 != null) {
                                    if (StringsKt.n(str8)) {
                                        str8 = null;
                                    }
                                    if (str8 != null) {
                                        appendQueryParameter.appendQueryParameter("media_source", str8);
                                    }
                                }
                                String str9 = (String) linkedHashMap.get("campaign");
                                if (str9 != null) {
                                    if (StringsKt.n(str9)) {
                                        str9 = null;
                                    }
                                    if (str9 != null) {
                                        appendQueryParameter.appendQueryParameter("campaign", str9);
                                    }
                                }
                                str = appendQueryParameter.build().toString();
                                i2 i2Var22 = new i2(0);
                                h = hlVar.h(obj12) | hlVar.h(nd1Var);
                                L = hlVar.L();
                                if (!h) {
                                }
                                L = new tm(obj12, ao0Var14, nd1Var, 4);
                                hlVar.h0(L);
                                Y = p4.Y(i2Var22, (Function1) L, hlVar, 0);
                                f = hlVar.f(str) | ((458752 & i3) != 131072);
                                L2 = hlVar.L();
                                if (!f) {
                                }
                                L2 = new fx(str, function0, ao0Var17, dnVar, 2);
                                hlVar.h0(L2);
                                p4.i(hlVar, str, (Function2) L2);
                                obj = (jd1) ao0Var.getValue();
                                obj2 = ((vd1) j.getValue()).a;
                                obj3 = ((vd1) j.getValue()).b;
                                f2 = hlVar.f(j) | hlVar.h(context2) | hlVar.h(nd1Var) | ((i3 & 112) != 32) | ((i3 & 896) != 256);
                                Object L1222 = hlVar.L();
                                if (f2) {
                                }
                                hlVar2 = hlVar;
                                obj4 = obj11;
                                obj5 = Y;
                                obj6 = obj12;
                                obj7 = obj2;
                                ao0Var4 = ao0Var14;
                                obj8 = obj3;
                                ao0Var5 = j;
                                yu0Var = yu0Var2;
                                obj9 = obj;
                                ao0Var6 = ao0Var17;
                                ao0 ao0Var1822 = ao0Var;
                                ao0Var7 = ao0Var3;
                                ao0Var8 = ao0Var2;
                                i2 = i3;
                                context = context2;
                                ed1Var = new ed1(context, nd1Var, ixVar, kaVar, rzVar, ao0Var1822, ao0Var7, ao0Var8, ao0Var5, ao0Var15, yu0Var, ao0Var16, ao0Var6, null);
                                ao0Var9 = ao0Var1822;
                                nd1Var2 = nd1Var;
                                hlVar2.h0(ed1Var);
                                Function2 function222 = (Function2) ed1Var;
                                CoroutineContext coroutineContext22 = hlVar2.R;
                                f3 = hlVar2.f(obj9) | hlVar2.f(obj7) | hlVar2.f(obj8);
                                Object L1322 = hlVar2.L();
                                if (f3) {
                                }
                                L1322 = new qc0(coroutineContext22, function222);
                                hlVar2.h0(L1322);
                                ordinal = ((jd1) ao0Var9.getValue()).ordinal();
                                if (ordinal != 0) {
                                }
                            }
                            str = null;
                            i2 i2Var222 = new i2(0);
                            h = hlVar.h(obj12) | hlVar.h(nd1Var);
                            L = hlVar.L();
                            if (!h) {
                            }
                            L = new tm(obj12, ao0Var14, nd1Var, 4);
                            hlVar.h0(L);
                            Y = p4.Y(i2Var222, (Function1) L, hlVar, 0);
                            f = hlVar.f(str) | ((458752 & i3) != 131072);
                            L2 = hlVar.L();
                            if (!f) {
                            }
                            L2 = new fx(str, function0, ao0Var17, dnVar, 2);
                            hlVar.h0(L2);
                            p4.i(hlVar, str, (Function2) L2);
                            obj = (jd1) ao0Var.getValue();
                            obj2 = ((vd1) j.getValue()).a;
                            obj3 = ((vd1) j.getValue()).b;
                            f2 = hlVar.f(j) | hlVar.h(context2) | hlVar.h(nd1Var) | ((i3 & 112) != 32) | ((i3 & 896) != 256);
                            Object L12222 = hlVar.L();
                            if (f2) {
                            }
                            hlVar2 = hlVar;
                            obj4 = obj11;
                            obj5 = Y;
                            obj6 = obj12;
                            obj7 = obj2;
                            ao0Var4 = ao0Var14;
                            obj8 = obj3;
                            ao0Var5 = j;
                            yu0Var = yu0Var2;
                            obj9 = obj;
                            ao0Var6 = ao0Var17;
                            ao0 ao0Var18222 = ao0Var;
                            ao0Var7 = ao0Var3;
                            ao0Var8 = ao0Var2;
                            i2 = i3;
                            context = context2;
                            ed1Var = new ed1(context, nd1Var, ixVar, kaVar, rzVar, ao0Var18222, ao0Var7, ao0Var8, ao0Var5, ao0Var15, yu0Var, ao0Var16, ao0Var6, null);
                            ao0Var9 = ao0Var18222;
                            nd1Var2 = nd1Var;
                            hlVar2.h0(ed1Var);
                            Function2 function2222 = (Function2) ed1Var;
                            CoroutineContext coroutineContext222 = hlVar2.R;
                            f3 = hlVar2.f(obj9) | hlVar2.f(obj7) | hlVar2.f(obj8);
                            Object L13222 = hlVar2.L();
                            if (f3) {
                            }
                            L13222 = new qc0(coroutineContext222, function2222);
                            hlVar2.h0(L13222);
                            ordinal = ((jd1) ao0Var9.getValue()).ordinal();
                            if (ordinal != 0) {
                            }
                        }
                    }
                    ao0Var2 = ao0Var12;
                    ao0Var3 = ao0Var13;
                    str = null;
                    i2 i2Var2222 = new i2(0);
                    h = hlVar.h(obj12) | hlVar.h(nd1Var);
                    L = hlVar.L();
                    if (!h) {
                    }
                    L = new tm(obj12, ao0Var14, nd1Var, 4);
                    hlVar.h0(L);
                    Y = p4.Y(i2Var2222, (Function1) L, hlVar, 0);
                    f = hlVar.f(str) | ((458752 & i3) != 131072);
                    L2 = hlVar.L();
                    if (!f) {
                    }
                    L2 = new fx(str, function0, ao0Var17, dnVar, 2);
                    hlVar.h0(L2);
                    p4.i(hlVar, str, (Function2) L2);
                    obj = (jd1) ao0Var.getValue();
                    obj2 = ((vd1) j.getValue()).a;
                    obj3 = ((vd1) j.getValue()).b;
                    f2 = hlVar.f(j) | hlVar.h(context2) | hlVar.h(nd1Var) | ((i3 & 112) != 32) | ((i3 & 896) != 256);
                    Object L122222 = hlVar.L();
                    if (f2) {
                    }
                    hlVar2 = hlVar;
                    obj4 = obj11;
                    obj5 = Y;
                    obj6 = obj12;
                    obj7 = obj2;
                    ao0Var4 = ao0Var14;
                    obj8 = obj3;
                    ao0Var5 = j;
                    yu0Var = yu0Var2;
                    obj9 = obj;
                    ao0Var6 = ao0Var17;
                    ao0 ao0Var182222 = ao0Var;
                    ao0Var7 = ao0Var3;
                    ao0Var8 = ao0Var2;
                    i2 = i3;
                    context = context2;
                    ed1Var = new ed1(context, nd1Var, ixVar, kaVar, rzVar, ao0Var182222, ao0Var7, ao0Var8, ao0Var5, ao0Var15, yu0Var, ao0Var16, ao0Var6, null);
                    ao0Var9 = ao0Var182222;
                    nd1Var2 = nd1Var;
                    hlVar2.h0(ed1Var);
                    Function2 function22222 = (Function2) ed1Var;
                    CoroutineContext coroutineContext2222 = hlVar2.R;
                    f3 = hlVar2.f(obj9) | hlVar2.f(obj7) | hlVar2.f(obj8);
                    Object L132222 = hlVar2.L();
                    if (f3) {
                    }
                    L132222 = new qc0(coroutineContext2222, function22222);
                    hlVar2.h0(L132222);
                    ordinal = ((jd1) ao0Var9.getValue()).ordinal();
                    if (ordinal != 0) {
                    }
                }
            }
            ao0Var = ao0Var11;
            ao0Var2 = ao0Var12;
            ao0Var3 = ao0Var13;
            str = null;
            i2 i2Var22222 = new i2(0);
            h = hlVar.h(obj12) | hlVar.h(nd1Var);
            L = hlVar.L();
            if (!h) {
            }
            L = new tm(obj12, ao0Var14, nd1Var, 4);
            hlVar.h0(L);
            Y = p4.Y(i2Var22222, (Function1) L, hlVar, 0);
            f = hlVar.f(str) | ((458752 & i3) != 131072);
            L2 = hlVar.L();
            if (!f) {
            }
            L2 = new fx(str, function0, ao0Var17, dnVar, 2);
            hlVar.h0(L2);
            p4.i(hlVar, str, (Function2) L2);
            obj = (jd1) ao0Var.getValue();
            obj2 = ((vd1) j.getValue()).a;
            obj3 = ((vd1) j.getValue()).b;
            f2 = hlVar.f(j) | hlVar.h(context2) | hlVar.h(nd1Var) | ((i3 & 112) != 32) | ((i3 & 896) != 256);
            Object L1222222 = hlVar.L();
            if (f2) {
            }
            hlVar2 = hlVar;
            obj4 = obj11;
            obj5 = Y;
            obj6 = obj12;
            obj7 = obj2;
            ao0Var4 = ao0Var14;
            obj8 = obj3;
            ao0Var5 = j;
            yu0Var = yu0Var2;
            obj9 = obj;
            ao0Var6 = ao0Var17;
            ao0 ao0Var1822222 = ao0Var;
            ao0Var7 = ao0Var3;
            ao0Var8 = ao0Var2;
            i2 = i3;
            context = context2;
            ed1Var = new ed1(context, nd1Var, ixVar, kaVar, rzVar, ao0Var1822222, ao0Var7, ao0Var8, ao0Var5, ao0Var15, yu0Var, ao0Var16, ao0Var6, null);
            ao0Var9 = ao0Var1822222;
            nd1Var2 = nd1Var;
            hlVar2.h0(ed1Var);
            Function2 function222222 = (Function2) ed1Var;
            CoroutineContext coroutineContext22222 = hlVar2.R;
            f3 = hlVar2.f(obj9) | hlVar2.f(obj7) | hlVar2.f(obj8);
            Object L1322222 = hlVar2.L();
            if (f3) {
            }
            L1322222 = new qc0(coroutineContext22222, function222222);
            hlVar2.h0(L1322222);
            ordinal = ((jd1) ao0Var9.getValue()).ordinal();
            if (ordinal != 0) {
            }
        } else {
            function03 = function02;
            nd1Var2 = nd1Var;
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r = hlVar2.r();
        if (r != null) {
            final nd1 nd1Var3 = nd1Var2;
            final Function0 function06 = function03;
            r.d = new Function2(kaVar, rzVar, ixVar, intent, function0, function06, i) { // from class: cd1
                public final /* synthetic */ ka e;
                public final /* synthetic */ rz g;
                public final /* synthetic */ ix h;
                public final /* synthetic */ Intent i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function0 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj15, Object obj16) {
                    ((Integer) obj16).getClass();
                    int P = gb0.P(3073);
                    gb0.c(nd1.this, this.e, this.g, this.h, this.i, this.j, this.k, (hl) obj15, P);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(ao0 ao0Var, boolean z) {
        ao0Var.setValue(Boolean.valueOf(z));
    }

    public static final Object e(bd1 bd1Var, vd1 vd1Var, nd1 nd1Var, boolean z, ed1 ed1Var) {
        int i = 5;
        int i2 = 2;
        dn dnVar = null;
        if (Intrinsics.a(bd1Var, yc1.a)) {
            if (!z || StringsKt.n(vd1Var.b)) {
                Object p = p(nd1Var.a, new yo(i2, dnVar, 4), ed1Var);
                tn tnVar = tn.d;
                if (p != tnVar) {
                    p = Unit.a;
                }
                return p == tnVar ? p : Unit.a;
            }
            Object p2 = p(nd1Var.a, new yo(i2, dnVar, i), ed1Var);
            tn tnVar2 = tn.d;
            if (p2 != tnVar2) {
                p2 = Unit.a;
            }
            return p2 == tnVar2 ? p2 : Unit.a;
        }
        if (Intrinsics.a(bd1Var, zc1.a)) {
            if (!z || StringsKt.n(vd1Var.b)) {
                Object a = nd1Var.a(ed1Var);
                return a == tn.d ? a : Unit.a;
            }
            Object p3 = p(nd1Var.a, new yo(i2, dnVar, i), ed1Var);
            tn tnVar3 = tn.d;
            if (p3 != tnVar3) {
                p3 = Unit.a;
            }
            return p3 == tnVar3 ? p3 : Unit.a;
        }
        if (!(bd1Var instanceof ad1)) {
            l.a();
            return null;
        }
        ad1 ad1Var = (ad1) bd1Var;
        String str = ad1Var.a;
        long j = ad1Var.b;
        nd1Var.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Long l = new Long(j);
        long j2 = currentTimeMillis + 3600;
        if (l.longValue() <= j2) {
            l = null;
        }
        if (l != null) {
            j2 = l.longValue();
        }
        Object p4 = p(nd1Var.a, new ld1(str, j2, null), ed1Var);
        tn tnVar4 = tn.d;
        if (p4 != tnVar4) {
            p4 = Unit.a;
        }
        return p4 == tnVar4 ? p4 : Unit.a;
    }

    public static final void f(vn0 vn0Var, Object obj, Object obj2) {
        int f = vn0Var.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : vn0Var.c[f];
        if (obj3 != null) {
            if (obj3 instanceof wn0) {
                ((wn0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                wn0 wn0Var = new wn0();
                wn0Var.a(obj3);
                wn0Var.a(obj2);
                obj2 = wn0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            vn0Var.c[f] = obj2;
            return;
        }
        int i = ~f;
        vn0Var.b[i] = obj;
        vn0Var.c[i] = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.dd0.j("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.dd0.j("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean g(s11 s11Var, s11 s11Var2, s11 s11Var3, int i) {
        boolean h = h(i, s11Var3, s11Var);
        float f = s11Var3.b;
        float f2 = s11Var3.d;
        float f3 = s11Var3.a;
        float f4 = s11Var3.c;
        float f5 = s11Var.d;
        float f6 = s11Var.b;
        float f7 = s11Var.c;
        float f8 = s11Var.a;
        if (!h && h(i, s11Var2, s11Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            dd0.j("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean h(int i, s11 s11Var, s11 s11Var2) {
        if (i == 3 || i == 4) {
            return s11Var.d > s11Var2.b && s11Var.b < s11Var2.d;
        }
        if (i == 5 || i == 6) {
            return s11Var.c > s11Var2.a && s11Var.a < s11Var2.c;
        }
        dd0.j("This function should only be used for 2-D focus search");
        return false;
    }

    public static final void i(o10 o10Var, eo0 eo0Var) {
        if (!o10Var.d.r) {
            o80.b("visitChildren called on an unattached node");
        }
        eo0 eo0Var2 = new eo0(new zl0[16]);
        zl0 zl0Var = o10Var.d;
        zl0 zl0Var2 = zl0Var.j;
        if (zl0Var2 == null) {
            op.l(eo0Var2, zl0Var);
        } else {
            eo0Var2.b(zl0Var2);
        }
        while (true) {
            int i = eo0Var2.g;
            if (i == 0) {
                return;
            }
            zl0 zl0Var3 = (zl0) eo0Var2.k(i - 1);
            if ((zl0Var3.h & 1024) == 0) {
                op.l(eo0Var2, zl0Var3);
            } else {
                while (true) {
                    if (zl0Var3 == null) {
                        break;
                    }
                    if ((zl0Var3.g & 1024) != 0) {
                        eo0 eo0Var3 = null;
                        while (zl0Var3 != null) {
                            if (zl0Var3 instanceof o10) {
                                o10 o10Var2 = (o10) zl0Var3;
                                if (o10Var2.r && !op.I(o10Var2).U) {
                                    if (o10Var2.B0().a) {
                                        eo0Var.b(o10Var2);
                                    } else {
                                        i(o10Var2, eo0Var);
                                    }
                                }
                            } else if ((zl0Var3.g & 1024) != 0 && (zl0Var3 instanceof zq)) {
                                int i2 = 0;
                                for (zl0 zl0Var4 = ((zq) zl0Var3).t; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
                                    if ((zl0Var4.g & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            zl0Var3 = zl0Var4;
                                        } else {
                                            if (eo0Var3 == null) {
                                                eo0Var3 = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var3 != null) {
                                                eo0Var3.b(zl0Var3);
                                                zl0Var3 = null;
                                            }
                                            eo0Var3.b(zl0Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            zl0Var3 = op.o(eo0Var3);
                        }
                    } else {
                        zl0Var3 = zl0Var3.j;
                    }
                }
            }
        }
    }

    public static final ao0 j(c00 c00Var, Object obj, CoroutineContext coroutineContext, hl hlVar, int i) {
        if ((i & 2) != 0) {
            coroutineContext = g.d;
        }
        boolean h = hlVar.h(coroutineContext) | hlVar.h(c00Var);
        Object L = hlVar.L();
        dn dnVar = null;
        j41 j41Var = bl.a;
        if (h || L == j41Var) {
            L = new f(coroutineContext, c00Var, dnVar, 14);
            hlVar.h0(L);
        }
        Function2 function2 = (Function2) L;
        Object L2 = hlVar.L();
        if (L2 == j41Var) {
            L2 = F(obj);
            hlVar.h0(L2);
        }
        ao0 ao0Var = (ao0) L2;
        boolean h2 = hlVar.h(function2);
        Object L3 = hlVar.L();
        if (h2 || L3 == j41Var) {
            L3 = new f(function2, ao0Var, dnVar, 13);
            hlVar.h0(L3);
        }
        p4.j(c00Var, coroutineContext, (Function2) L3, hlVar);
        return ao0Var;
    }

    public static vn0 k() {
        long[] jArr = q61.a;
        return new vn0();
    }

    public static mj l(String str, String str2) {
        pb pbVar = new pb(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v01.a(pb.class));
        return new mj(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new kj(0, pbVar), hashSet3);
    }

    public static final eo0 n() {
        i8 i8Var = wb1.b;
        eo0 eo0Var = (eo0) i8Var.get();
        if (eo0Var != null) {
            return eo0Var;
        }
        eo0 eo0Var2 = new eo0(new gl[0]);
        i8Var.q(eo0Var2);
        return eo0Var2;
    }

    public static final xr o(Function0 function0) {
        i8 i8Var = wb1.a;
        return new xr(function0, null);
    }

    public static final Object p(ro roVar, Function2 function2, dn dnVar) {
        return roVar.c(new fy0(function2, null, 1), dnVar);
    }

    public static final o10 r(eo0 eo0Var, s11 s11Var, int i) {
        s11 d;
        o10 o10Var = null;
        if (i == 3) {
            d = s11Var.d((s11Var.c - s11Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            d = s11Var.d(-((s11Var.c - s11Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            d = s11Var.d(0.0f, (s11Var.d - s11Var.b) + 1.0f);
        } else {
            if (i != 6) {
                dd0.j("This function should only be used for 2-D focus search");
                return null;
            }
            d = s11Var.d(0.0f, -((s11Var.d - s11Var.b) + 1.0f));
        }
        Object[] objArr = eo0Var.d;
        int i2 = eo0Var.g;
        for (int i3 = 0; i3 < i2; i3++) {
            o10 o10Var2 = (o10) objArr[i3];
            if (uq1.L(o10Var2)) {
                s11 G = uq1.G(o10Var2);
                if (B(G, d, s11Var, i)) {
                    o10Var = o10Var2;
                    d = G;
                }
            }
        }
        return o10Var;
    }

    public static final boolean s(o10 o10Var, int i, Function1 function1) {
        s11 s11Var;
        eo0 eo0Var = new eo0(new o10[16]);
        i(o10Var, eo0Var);
        int i2 = eo0Var.g;
        if (i2 <= 1) {
            o10 o10Var2 = (o10) (i2 == 0 ? null : eo0Var.d[0]);
            if (o10Var2 != null) {
                return ((Boolean) function1.invoke(o10Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                s11 G = uq1.G(o10Var);
                float f = G.a;
                float f2 = G.b;
                s11Var = new s11(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    dd0.j("This function should only be used for 2-D focus search");
                    return false;
                }
                s11 G2 = uq1.G(o10Var);
                float f3 = G2.c;
                float f4 = G2.d;
                s11Var = new s11(f3, f4, f3, f4);
            }
            o10 r = r(eo0Var, s11Var, i);
            if (r != null) {
                return ((Boolean) function1.invoke(r)).booleanValue();
            }
        }
        return false;
    }

    public static mj t(String str, af afVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(v01.a(pb.class));
        for (Class cls : new Class[0]) {
            ca0.f(cls, "Null interface");
            hashSet.add(v01.a(cls));
        }
        qr a = qr.a(Context.class);
        if (hashSet.contains(a.a)) {
            dd0.e("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        hashSet2.add(a);
        return new mj(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new bk(str, 2, afVar), hashSet3);
    }

    public static final boolean u(int i, z6 z6Var, o10 o10Var, s11 s11Var) {
        if (L(i, z6Var, o10Var, s11Var)) {
            return true;
        }
        Boolean bool = (Boolean) mo.D(o10Var, i, new rr0(((e10) ((d4) op.J(o10Var)).getFocusOwner()).f(), o10Var, s11Var, i, z6Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final Rect v(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, nextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    public static final Object w(qn0 qn0Var, hy0 hy0Var, Serializable serializable) {
        qn0Var.getClass();
        hy0Var.getClass();
        Object c = qn0Var.c(hy0Var);
        return c == null ? serializable : c;
    }

    public static final ViewParent x(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final hh1 y(h81 h81Var) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object g = h81Var.d.g(g81.a);
        if (g == null) {
            g = null;
        }
        z0 z0Var = (z0) g;
        if (z0Var == null || (function1 = (Function1) z0Var.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (hh1) arrayList.get(0);
    }

    public static final boolean z(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) ? false : true;
    }

    public abstract String m(byte[] bArr, int i, int i2);

    public abstract int q(String str, byte[] bArr, int i, int i2);
}
