package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.majelw.libystne.R;
import defpackage.aa2;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class zj2 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, boolean z, final Function0 function0, a00 a00Var, final int i, final int i2) {
        boolean z2;
        final boolean z3;
        n72 s;
        a00Var.Z(1393416754);
        int i3 = (a00Var.f(str) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= a00Var.g(z2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= a00Var.h(function0) ? 256 : 128;
            }
            if (a00Var.P(i3 & 1, (i3 & 147) == 146)) {
                a00Var.S();
                z3 = z2;
            } else {
                boolean z4 = i4 != 0 ? false : z2;
                yv2.b(str, a.j(androidx.compose.foundation.a.e(7, b.c(sl1.a, 1.0f), null, function0, false), 0.0f, 4.0f, 1), z4 ? cw.y : cw.m, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).j, a00Var, (i3 & 14) | 196608, 0, 65496);
                z3 = z4;
            }
            s = a00Var.s();
            if (s == null) {
                s.d = new Function2() { // from class: xj2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zj2.a(str, z3, function0, (a00) obj, s03.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 384) == 0) {
        }
        if (a00Var.P(i3 & 1, (i3 & 147) == 146)) {
        }
        s = a00Var.s();
        if (s == null) {
        }
    }

    public static final void b(String str, my myVar, a00 a00Var, int i) {
        int i2;
        my myVar2;
        boolean z;
        int i3;
        a00 a00Var2 = a00Var;
        a00Var2.Z(-637465695);
        if ((i & 6) == 0) {
            i2 = i | (a00Var2.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (a00Var2.P(i2 & 1, (i2 & 19) != 18)) {
            vl1 h = a.h(l41.q(1.0f, cw.t, androidx.compose.foundation.a.b(yk3.u(b.c(sl1.a, 1.0f), zb2.a(16.0f)), cw.s, ap.e), zb2.a(16.0f)), 14.0f);
            qw a = ow.a(new yh(10.0f, true, sc.o), qb2.A, a00Var2, 6);
            int D = iv1.D(a00Var2);
            v02 l = a00Var2.l();
            vl1 E = bd3.E(a00Var2, h);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a, oz.f);
            uj2.e(a00Var2, l, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            if (str != null) {
                a00Var2.X(-1204177951);
                i3 = 6;
                yv2.b(str, null, cw.u, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(n13.a)).h, a00Var, (i2 & 14) | 196992, 0, 65498);
                a00Var2 = a00Var;
                z = false;
            } else {
                z = false;
                i3 = 6;
                a00Var2.X(1317045547);
            }
            a00Var2.q(z);
            myVar2 = myVar;
            myVar2.invoke(a00Var2, Integer.valueOf(i3));
            a00Var2.q(true);
        } else {
            myVar2 = myVar;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new ky(str, myVar2, i);
        }
    }

    public static final void c(String str, a00 a00Var, int i) {
        a00Var.Z(730412762);
        int i2 = i | (a00Var.f(str) ? 4 : 2);
        if (a00Var.P(i2 & 1, (i2 & 3) != 2)) {
            yv2.b(str, null, cw.v, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).n, a00Var, (i2 & 14) | 196992, 0, 65498);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new x4(str, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(List list, String str, Function1 function1, a00 a00Var, int i) {
        a00 a00Var2;
        a00 a00Var3 = a00Var;
        a00Var3.Z(642824431);
        int i2 = 256;
        int i3 = i | (a00Var3.h(list) ? 4 : 2) | (a00Var3.f(str) ? 32 : 16) | (a00Var3.h(function1) ? 256 : 128);
        int i4 = 1;
        boolean z = 0;
        if (a00Var3.P(i3 & 1, (i3 & 147) != 146)) {
            fc2 a = ec2.a(new yh(8.0f, true, sc.o), qb2.y, a00Var3, 6);
            int D = iv1.D(a00Var3);
            v02 l = a00Var3.l();
            sl1 sl1Var = sl1.a;
            vl1 E = bd3.E(a00Var3, sl1Var);
            pz.b.getClass();
            Function0 function0 = oz.b;
            a00Var3.b0();
            if (a00Var3.S) {
                a00Var3.k(function0);
            } else {
                a00Var3.l0();
            }
            uj2.e(a00Var3, a, oz.f);
            uj2.e(a00Var3, l, oz.e);
            sc scVar = oz.g;
            if (a00Var3.S || !Intrinsics.b(a00Var3.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var3, D, scVar);
            }
            uj2.e(a00Var3, E, oz.d);
            a00Var3.X(1623380190);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str2 = (String) pair.m;
                int intValue = ((Number) pair.n).intValue();
                boolean b = Intrinsics.b(str2, str);
                vl1 q = l41.q(1.0f, b ? cw.m : cw.t, androidx.compose.foundation.a.b(yk3.u(sl1Var, zb2.a(999.0f)), b ? cw.n : cw.r, ap.e), zb2.a(999.0f));
                int i5 = ((i3 & 896) == i2 ? i4 : z) | (a00Var3.f(str2) ? 1 : 0);
                Object M = a00Var3.M();
                if (i5 != 0 || M == sz.a) {
                    M = new ts(i4, str2, function1);
                    a00Var3.i0(M);
                }
                vl1 i6 = a.i(androidx.compose.foundation.a.e(7, q, null, (Function0) M, z), 14.0f, 8.0f);
                oj1 e = fp.e(qb2.p, z);
                int D2 = iv1.D(a00Var3);
                v02 l2 = a00Var3.l();
                vl1 E2 = bd3.E(a00Var3, i6);
                pz.b.getClass();
                Function0 function02 = oz.b;
                a00Var3.b0();
                if (a00Var3.S) {
                    a00Var3.k(function02);
                } else {
                    a00Var3.l0();
                }
                uj2.e(a00Var3, e, oz.f);
                uj2.e(a00Var3, l2, oz.e);
                sc scVar2 = oz.g;
                if (a00Var3.S || !Intrinsics.b(a00Var3.M(), Integer.valueOf(D2))) {
                    q40.r(D2, a00Var3, D2, scVar2);
                }
                uj2.e(a00Var3, E2, oz.d);
                boolean z2 = i4;
                a00 a00Var4 = a00Var3;
                yv2.b(uj2.f(intValue, a00Var3), null, b ? ap.d(4281996880L) : cw.u, 0L, b ? jq0.t : jq0.r, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var3.j(n13.a)).n, a00Var4, 0, 0, 65498);
                a00Var4.q(z2);
                i4 = z2 ? 1 : 0;
                z = z;
                a00Var3 = a00Var4;
                i2 = 256;
                i3 = i3;
                sl1Var = sl1Var;
            }
            a00 a00Var5 = a00Var3;
            a00Var5.q(z);
            a00Var5.q(i4);
            a00Var2 = a00Var5;
        } else {
            a00 a00Var6 = a00Var3;
            a00Var6.S();
            a00Var2 = a00Var6;
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new pk(list, str, function1, i, 2);
        }
    }

    public static final void e(Function0 function0, vl1 vl1Var, a00 a00Var, int i) {
        vl1 vl1Var2;
        Object ba2Var;
        boolean z;
        zn1 zn1Var;
        a00 a00Var2 = a00Var;
        function0.getClass();
        a00Var2.Z(-259241571);
        int i2 = i | (a00Var2.h(function0) ? 4 : 2) | 48;
        int i3 = 1;
        int i4 = 0;
        if (a00Var2.P(i2 & 1, (i2 & 19) != 18)) {
            final Context context = (Context) a00Var2.j(AndroidCompositionLocals_androidKt.b);
            Object M = a00Var2.M();
            Object obj = sz.a;
            if (M == obj) {
                M = ij1.d.i(context);
                a00Var2.i0(M);
            }
            final ij1 ij1Var = (ij1) M;
            Object M2 = a00Var2.M();
            if (M2 == obj) {
                M2 = l41.x(h.m, a00Var2);
                a00Var2.i0(M2);
            }
            final a50 a50Var = (a50) M2;
            Object M3 = a00Var2.M();
            if (M3 == obj) {
                context.getClass();
                String string = context.getApplicationContext().getSharedPreferences("settings", 0).getString("theme", "system");
                if (string == null) {
                    string = "system";
                }
                M3 = ij2.j(string);
                a00Var2.i0(M3);
            }
            zn1 zn1Var2 = (zn1) M3;
            Object M4 = a00Var2.M();
            if (M4 == obj) {
                context.getClass();
                String string2 = context.getApplicationContext().getSharedPreferences("settings", 0).getString("language", "system");
                M4 = ij2.j(string2 != null ? string2 : "system");
                a00Var2.i0(M4);
            }
            zn1 zn1Var3 = (zn1) M4;
            Object M5 = a00Var2.M();
            if (M5 == obj) {
                context.getClass();
                String string3 = context.getApplicationContext().getSharedPreferences("settings", 0).getString("units", "grams");
                M5 = ij2.j(string3 != null ? string3 : "grams");
                a00Var2.i0(M5);
            }
            zn1 zn1Var4 = (zn1) M5;
            Object M6 = a00Var2.M();
            if (M6 == obj) {
                context.getClass();
                M6 = ij2.j(Boolean.valueOf(context.getApplicationContext().getSharedPreferences("settings", 0).getBoolean("reminder_clean", false)));
                a00Var2.i0(M6);
            }
            zn1 zn1Var5 = (zn1) M6;
            Object M7 = a00Var2.M();
            if (M7 == obj) {
                context.getClass();
                M7 = ij2.j(Boolean.valueOf(context.getApplicationContext().getSharedPreferences("settings", 0).getBoolean("reminder_gem", false)));
                a00Var2.i0(M7);
            }
            zn1 zn1Var6 = (zn1) M7;
            Object M8 = a00Var2.M();
            if (M8 == obj) {
                M8 = ij2.j(Boolean.FALSE);
                a00Var2.i0(M8);
            }
            final zn1 zn1Var7 = (zn1) M8;
            Object M9 = a00Var2.M();
            if (M9 == obj) {
                M9 = ij2.j(Boolean.FALSE);
                a00Var2.i0(M9);
            }
            zn1 zn1Var8 = (zn1) M9;
            zn1 a = ij2.a(new cj1(ij1Var.b.b(), i3), ah0.m, null, a00Var2, 48, 2);
            Object M10 = a00Var2.M();
            if (M10 == obj) {
                try {
                    aa2.a aVar = aa2.m;
                    ba2Var = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Throwable th) {
                    aa2.a aVar2 = aa2.m;
                    ba2Var = new ba2(th);
                }
                if (ba2Var instanceof ba2) {
                    ba2Var = null;
                }
                M10 = (String) ba2Var;
                if (M10 == null) {
                    M10 = "1.0";
                }
                a00Var2.i0(M10);
            }
            String str = (String) M10;
            x3 x3Var = new x3(i4);
            boolean h = a00Var2.h(a50Var) | a00Var2.h(context) | a00Var2.h(ij1Var);
            Object M11 = a00Var2.M();
            int i5 = 3;
            if (h || M11 == obj) {
                M11 = new t4(a50Var, ij1Var, context, i5);
                a00Var2.i0(M11);
            }
            final sh1 L = z71.L(x3Var, (Function1) M11, a00Var2);
            sl1 sl1Var = sl1.a;
            vl1 h2 = a.h(s03.T(androidx.compose.foundation.a.b(b.b(sl1Var, 1.0f), cw.r, ap.e), s03.G(a00Var2)), 16.0f);
            qw a2 = ow.a(new yh(14.0f, true, sc.o), qb2.A, a00Var2, 6);
            int D = iv1.D(a00Var2);
            v02 l = a00Var2.l();
            vl1 E = bd3.E(a00Var2, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a2, oz.f);
            uj2.e(a00Var2, l, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            String f = uj2.f(R.string.settings_title_ml, a00Var2);
            bp2 bp2Var = n13.a;
            yv2.b(f, null, cw.u, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).c, a00Var, 384, 0, 65530);
            b(uj2.f(R.string.set_appearance, a00Var), yj1.H(-1166069775, new mu0(context, zn1Var2, zn1Var3, zn1Var4), a00Var), a00Var, 48);
            b(uj2.f(R.string.set_reminders, a00Var), yj1.H(-1176336088, new pk(context, zn1Var5, zn1Var6, 3), a00Var), a00Var, 48);
            b(null, yj1.H(-2061071895, new di0(function0), a00Var), a00Var, 54);
            b(uj2.f(R.string.set_data, a00Var), yj1.H(1349159594, new Function2() { // from class: yj2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    a00 a00Var3 = (a00) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (a00Var3.P(intValue & 1, (intValue & 3) != 2)) {
                        String f2 = uj2.f(R.string.data_export, a00Var3);
                        Object obj4 = a50.this;
                        boolean h3 = a00Var3.h(obj4);
                        Object obj5 = ij1Var;
                        boolean h4 = h3 | a00Var3.h(obj5);
                        Object obj6 = context;
                        boolean h5 = h4 | a00Var3.h(obj6);
                        Object M12 = a00Var3.M();
                        Object obj7 = sz.a;
                        if (h5 || M12 == obj7) {
                            M12 = new uz(obj4, obj5, obj6, 3);
                            a00Var3.i0(M12);
                        }
                        zj2.a(f2, false, (Function0) M12, a00Var3, 0, 2);
                        String f3 = uj2.f(R.string.data_import, a00Var3);
                        sh1 sh1Var = L;
                        boolean h6 = a00Var3.h(sh1Var);
                        Object M13 = a00Var3.M();
                        if (h6 || M13 == obj7) {
                            M13 = new f5(sh1Var, 1);
                            a00Var3.i0(M13);
                        }
                        zj2.a(f3, false, (Function0) M13, a00Var3, 0, 2);
                        String f4 = uj2.f(R.string.data_clear, a00Var3);
                        Object M14 = a00Var3.M();
                        if (M14 == obj7) {
                            M14 = new wj2(zn1Var7, 0);
                            a00Var3.i0(M14);
                        }
                        zj2.a(f4, true, (Function0) M14, a00Var3, 432, 0);
                    } else {
                        a00Var3.S();
                    }
                    return Unit.a;
                }
            }, a00Var), a00Var, 48);
            b(null, yj1.H(464423787, new ss(6, zn1Var8, a), a00Var), a00Var, 54);
            yv2.b(uj2.g(R.string.set_version, new Object[]{str}, a00Var), null, cw.v, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).n, a00Var, 384, 0, 65530);
            a00Var2 = a00Var;
            a00Var2.q(true);
            if (((Boolean) zn1Var7.getValue()).booleanValue()) {
                a00Var2.X(-709681510);
                Object M12 = a00Var2.M();
                if (M12 == obj) {
                    zn1Var = zn1Var7;
                    M12 = new wj2(zn1Var, 3);
                    a00Var2.i0(M12);
                } else {
                    zn1Var = zn1Var7;
                }
                s93.a((Function0) M12, yj1.H(747117232, new pk(a50Var, ij1Var, zn1Var, 4), a00Var2), null, yj1.H(1422277358, new ia(6, zn1Var), a00Var2), s93.h, s93.i, null, 0L, 0L, 0L, 0L, null, a00Var2, 1772598);
                a00Var2 = a00Var2;
                z = false;
            } else {
                z = false;
                a00Var2.X(-716789531);
            }
            a00Var2.q(z);
            vl1Var2 = sl1Var;
        } else {
            a00Var2.S();
            vl1Var2 = vl1Var;
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new ss(i, 7, function0, vl1Var2);
        }
    }

    public static final void f(String str, boolean z, Function1 function1, a00 a00Var, int i) {
        String str2;
        boolean z2;
        Function1 function12;
        a00 a00Var2 = a00Var;
        a00Var2.Z(1390105137);
        int i2 = i | (a00Var2.f(str) ? 4 : 2) | (a00Var2.g(z) ? 32 : 16) | (a00Var2.h(function1) ? 256 : 128);
        if (a00Var2.P(i2 & 1, (i2 & 147) != 146)) {
            vl1 c = b.c(sl1.a, 1.0f);
            fc2 a = ec2.a(s93.e, qb2.z, a00Var2, 54);
            int D = iv1.D(a00Var2);
            v02 l = a00Var2.l();
            vl1 E = bd3.E(a00Var2, c);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a, oz.f);
            uj2.e(a00Var2, l, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            yv2.b(str, null, cw.u, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(n13.a)).j, a00Var, (i2 & 14) | 384, 0, 65530);
            str2 = str;
            a00Var2 = a00Var;
            long j = cw.m;
            long j2 = aw.c;
            long j3 = aw.f;
            long d = hw.d(11, a00Var2);
            long d2 = hw.d(24, a00Var2);
            long d3 = hw.d(39, a00Var2);
            long d4 = hw.d(24, a00Var2);
            long d5 = hw.d(39, a00Var2);
            long b = aw.b(hw.d(35, a00Var2), 1.0f);
            bp2 bp2Var = hw.a;
            z2 = z;
            function12 = function1;
            androidx.compose.material3.a.a(z2, function12, null, false, new wr2(j2, j, j3, d, d2, d3, d4, d5, ap.s(b, ((gw) a00Var2.j(bp2Var)).p), ap.s(aw.b(hw.d(18, a00Var2), 0.12f), ((gw) a00Var2.j(bp2Var)).p), j3, ap.s(aw.b(hw.d(18, a00Var2), 0.38f), ((gw) a00Var2.j(bp2Var)).p), ap.s(aw.b(hw.d(18, a00Var2), 0.38f), ((gw) a00Var2.j(bp2Var)).p), ap.s(aw.b(hw.d(39, a00Var2), 0.12f), ((gw) a00Var2.j(bp2Var)).p), ap.s(aw.b(hw.d(18, a00Var2), 0.12f), ((gw) a00Var2.j(bp2Var)).p), ap.s(aw.b(hw.d(39, a00Var2), 0.38f), ((gw) a00Var2.j(bp2Var)).p)), a00Var2, (i2 >> 3) & 126);
            a00Var2.q(true);
        } else {
            str2 = str;
            z2 = z;
            function12 = function1;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new jh1(str2, z2, function12, i);
        }
    }

    public static final boolean g(int i, KeyEvent keyEvent) {
        return ((int) (z71.x(keyEvent) >> 32)) == i;
    }

    public static final u53 h(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            u53 u53Var = tag instanceof u53 ? (u53) tag : null;
            if (u53Var != null) {
                return u53Var;
            }
            Object g = ti2.g(view);
            view = g instanceof View ? (View) g : null;
        }
        return null;
    }

    public static boolean i(byte b) {
        return b > -65;
    }

    public static String j(String str, Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, sb3.length() != 0 ? "Exception during lenientFormat for ".concat(sb3) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + sb3.length() + 9);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb5.append((CharSequence) str, i3, indexOf);
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb5.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(", ");
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static void k(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            ly2.a(view, charSequence);
            return;
        }
        ny2 ny2Var = ny2.w;
        if (ny2Var != null && ny2Var.m == view) {
            ny2.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ny2(view, charSequence);
            return;
        }
        ny2 ny2Var2 = ny2.x;
        if (ny2Var2 != null && ny2Var2.m == view) {
            ny2Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }
}
