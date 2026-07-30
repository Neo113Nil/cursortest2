package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class al0 implements s30 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ al0(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.d;
        xl0 xl0Var = xl0.a;
        Object obj4 = this.g;
        Object obj5 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ia iaVar = (ia) obj5;
                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) obj4;
                hl hlVar = (hl) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd) obj).getClass();
                if (hlVar.O(intValue & 1, (intValue & 17) != 16)) {
                    am0 U = yr1.U(xa1.b, 40.0f, 24.0f, 40.0f, 22.0f);
                    yi a = wi.a(yr1.d, j50.s, hlVar, 6);
                    int hashCode = Long.hashCode(hlVar.T);
                    kw0 l = hlVar.l();
                    am0 N = p4.N(hlVar, U);
                    yk.b.getClass();
                    xl xlVar = xk.b;
                    hlVar.a0();
                    if (hlVar.S) {
                        hlVar.k(xlVar);
                    } else {
                        hlVar.k0();
                    }
                    e7 e7Var = xk.e;
                    ka0.C(hlVar, a, e7Var);
                    e7 e7Var2 = xk.d;
                    ka0.C(hlVar, l, e7Var2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    e7 e7Var3 = xk.f;
                    ka0.u(hlVar, valueOf, e7Var3);
                    y3 y3Var = xk.g;
                    ka0.A(hlVar, y3Var);
                    e7 e7Var4 = xk.c;
                    ka0.C(hlVar, N, e7Var4);
                    am0 a2 = xa1.a(xl0Var, 1.0f);
                    jd jdVar = j50.q;
                    i9 i9Var = yr1.b;
                    r41 a3 = q41.a(i9Var, jdVar, hlVar, 48);
                    int hashCode2 = Long.hashCode(hlVar.T);
                    kw0 l2 = hlVar.l();
                    am0 N2 = p4.N(hlVar, a2);
                    hlVar.a0();
                    if (hlVar.S) {
                        hlVar.k(xlVar);
                    } else {
                        hlVar.k0();
                    }
                    ka0.C(hlVar, a3, e7Var);
                    ka0.C(hlVar, l2, e7Var2);
                    ka0.u(hlVar, Integer.valueOf(hashCode2), e7Var3);
                    ka0.A(hlVar, y3Var);
                    ka0.C(hlVar, N2, e7Var4);
                    String name = iaVar.e.name();
                    Locale locale = Locale.ROOT;
                    String lowerCase = name.toLowerCase(locale);
                    lowerCase.getClass();
                    if (lowerCase.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String valueOf2 = String.valueOf(lowerCase.charAt(0));
                        valueOf2.getClass();
                        String upperCase = valueOf2.toUpperCase(locale);
                        upperCase.getClass();
                        sb.append((Object) upperCase);
                        sb.append(lowerCase.substring(1));
                        lowerCase = sb.toString();
                    }
                    am0 a4 = s41.a();
                    x20 x20Var = x20.l;
                    long j = hi.c;
                    eh1.b(lowerCase, a4, j, t80.x(22), x20Var, null, 0L, null, t80.x(23), 2, false, 1, 0, null, hlVar, 1597824, 25008, 239528);
                    eh1.b(iaVar.b.d, null, la0.d(4294961562L), t80.x(16), x20Var, null, 0L, null, 0L, 0, false, 1, 0, null, hlVar, 1597824, 24576, 245674);
                    hlVar.p(true);
                    ca0.b(hlVar, xa1.b(xl0Var, 7.0f));
                    am0 a5 = xa1.a(xl0Var, 1.0f);
                    r41 a6 = q41.a(i9Var, jdVar, hlVar, 48);
                    int hashCode3 = Long.hashCode(hlVar.T);
                    kw0 l3 = hlVar.l();
                    am0 N3 = p4.N(hlVar, a5);
                    hlVar.a0();
                    if (hlVar.S) {
                        hlVar.k(xlVar);
                    } else {
                        hlVar.k0();
                    }
                    ka0.C(hlVar, a6, e7Var);
                    ka0.C(hlVar, l3, e7Var2);
                    ka0.u(hlVar, Integer.valueOf(hashCode3), e7Var3);
                    ka0.A(hlVar, y3Var);
                    ka0.C(hlVar, N3, e7Var4);
                    String format = simpleDateFormat.format(new Date(iaVar.a));
                    format.getClass();
                    am0 a7 = s41.a();
                    long x = t80.x(14);
                    x20 x20Var2 = x20.k;
                    eh1.b(format, a7, j, x, x20Var2, null, 0L, null, 0L, 2, false, 1, 0, null, hlVar, 1597824, 24960, 241576);
                    eh1.b(String.valueOf(iaVar.c), null, la0.d(4294961562L), t80.x(15), x20Var2, null, 0L, null, 0L, 0, false, 0, 0, null, hlVar, 1597824, 0, 262058);
                    ca0.b(hlVar, xa1.e(xl0Var, 4.0f));
                    eh1.b("cars", null, la0.d(4294961562L), t80.x(13), x20Var2, null, 0L, null, 0L, 0, false, 0, 0, null, hlVar, 1597830, 0, 262058);
                    ca0.b(hlVar, xa1.e(xl0Var, 10.0f));
                    yr1.e(R.drawable.golden_feather_currency_icon, xa1.c(xl0Var, 20.0f), null, hlVar, 48, 4);
                    ca0.b(hlVar, xa1.e(xl0Var, 4.0f));
                    eh1.b(String.valueOf(iaVar.d), null, la0.d(4294961562L), t80.x(15), x20Var2, null, 0L, null, 0L, 0, false, 0, 0, null, hlVar, 1597824, 0, 262058);
                    hlVar.p(true);
                    hlVar.p(true);
                } else {
                    hlVar.R();
                }
                break;
            case 1:
                e40 e40Var = (e40) obj5;
                z8 z8Var = (z8) obj4;
                hl hlVar2 = (hl) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zi) obj).getClass();
                if (hlVar2.O(intValue2 & 1, (intValue2 & 17) != 16)) {
                    eh1.b("SAFE!", null, hi.c, 0L, x20.l, null, 0L, null, 0L, 0, false, 0, 0, ((fk1) hlVar2.j(gk1.a)).f, hlVar2, 1573254, 0, 131002);
                    uq1.g(e40Var.d, null, hlVar2, 0);
                    ca0.b(hlVar2, xa1.b(xl0Var, 16.0f));
                    boolean h = hlVar2.h(z8Var);
                    Object L = hlVar2.L();
                    j41 j41Var = bl.a;
                    if (h || L == j41Var) {
                        v3 v3Var = new v3(0, z8Var, z8.class, "continueFromCheckpoint", "continueFromCheckpoint()V", 0, 11);
                        hlVar2.h0(v3Var);
                        L = v3Var;
                    }
                    yr1.t(R.drawable.button_start_road, (Function0) ((b40) L), xa1.b(xa1.a(xl0Var, 1.0f), 56.0f), false, "Continue", hlVar2, 24960, 8);
                    boolean h2 = hlVar2.h(z8Var);
                    Object L2 = hlVar2.L();
                    if (h2 || L2 == j41Var) {
                        v3 v3Var2 = new v3(0, z8Var, z8.class, "collectFeathers", "collectFeathers()V", 0, 12);
                        hlVar2.h0(v3Var2);
                        L2 = v3Var2;
                    }
                    yr1.t(R.drawable.button_collect_feathers, (Function0) ((b40) L2), xa1.b(xa1.a(xl0Var, 1.0f), 56.0f), false, "Collect feathers", hlVar2, 24960, 8);
                } else {
                    hlVar2.R();
                }
                break;
            default:
                Spannable spannable = (Spannable) obj5;
                a6 a6Var = (a6) obj4;
                jc1 jc1Var = (jc1) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int intValue4 = ((Integer) obj3).intValue();
                w10 w10Var = jc1Var.f;
                x20 x20Var3 = jc1Var.c;
                if (x20Var3 == null) {
                    x20Var3 = x20.i;
                }
                t20 t20Var = jc1Var.d;
                int i2 = t20Var != null ? t20Var.a : 0;
                u20 u20Var = jc1Var.e;
                int i3 = u20Var != null ? u20Var.a : 65535;
                b6 b6Var = a6Var.d;
                dk1 b = ((x10) b6Var.i).b(w10Var, x20Var3, i2, i3);
                if (b instanceof ck1) {
                    Object obj6 = ((ck1) b).d;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    i8 i8Var = new i8(b, b6Var.n);
                    b6Var.n = i8Var;
                    Object obj7 = i8Var.h;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new z10(1, typeface), intValue3, intValue4, 33);
                break;
        }
        return Unit.a;
    }
}
