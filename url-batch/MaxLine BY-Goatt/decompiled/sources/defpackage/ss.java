package defpackage;

import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.R;
import j$.time.LocalDate;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ss implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ss(int i, int i2, Object obj, Object obj2) {
        this.m = i2;
        this.n = obj;
        this.o = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.m;
        sl1 sl1Var = sl1.a;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                l41.b(s03.R(1), (a00) obj, (vl1) obj3, (Function1) obj4);
                break;
            case 1:
                a82 a82Var = (a82) obj3;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                ((Unit) obj).getClass();
                element.getClass();
                int i2 = a82Var.m;
                a82Var.m = i2 + 1;
                ((CoroutineContext[]) obj4)[i2] = element;
                break;
            case 2:
                q82 q82Var = (q82) obj4;
                zl2 zl2Var = (zl2) obj3;
                int intValue = ((Integer) obj).intValue();
                if (obj2 instanceof gz) {
                    q82Var.f.b((gz) obj2);
                } else if (obj2 instanceof s82) {
                    s82 s82Var = (s82) obj2;
                    if (!(s82Var.a instanceof wz)) {
                        b00.f(zl2Var, intValue, obj2);
                        q82Var.d(s82Var);
                    }
                } else if (obj2 instanceof n72) {
                    b00.f(zl2Var, intValue, obj2);
                    ((n72) obj2).c();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                bd3.i((String) obj4, (my) obj3, (a00) obj, s03.R(49));
                break;
            case 4:
                a61 a61Var = (a61) obj4;
                Context context = (Context) obj3;
                a00 a00Var = (a00) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (a00Var.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String f = uj2.f(R.string.jf_type, a00Var);
                    String str2 = a61Var.c;
                    String str3 = a61Var.h;
                    Long l = a61Var.g;
                    Double d = a61Var.i;
                    Double d2 = a61Var.f;
                    o70.k(f, c61.c(str2, a00Var), a00Var, 0);
                    String f2 = uj2.f(R.string.jf_metal, a00Var);
                    String b = c61.b(a61Var.d, a00Var);
                    String str4 = a61Var.e;
                    o70.k(f2, b + (str4 != null ? " · ".concat(str4) : BuildConfig.FLAVOR), a00Var, 0);
                    if (d2 != null) {
                        a00Var.X(214100878);
                        String f3 = uj2.f(R.string.item_weight, a00Var);
                        context.getClass();
                        String string = context.getApplicationContext().getSharedPreferences("settings", 0).getString("units", "grams");
                        boolean equals = (string != null ? string : "grams").equals("carats");
                        DecimalFormat decimalFormat = c61.a;
                        if (Intrinsics.a(d2)) {
                            str = "—";
                        } else if (equals) {
                            str = decimalFormat.format(d2.doubleValue() / 0.2d) + " ct";
                        } else {
                            str = decimalFormat.format(d2.doubleValue()) + " g";
                        }
                        o70.k(f3, str, a00Var, 0);
                    } else {
                        a00Var.X(-1959404327);
                    }
                    a00Var.q(false);
                    if (d != null) {
                        a00Var.X(214106547);
                        o70.k(uj2.f(R.string.item_value, a00Var), c61.a(d), a00Var, 0);
                    } else {
                        a00Var.X(-1959404327);
                    }
                    a00Var.q(false);
                    if (l != null) {
                        a00Var.X(214110654);
                        String f4 = uj2.f(R.string.item_purchased, a00Var);
                        String format = LocalDate.ofEpochDay(l.longValue()).format(c61.b);
                        o70.k(f4, format != null ? format : "—", a00Var, 0);
                    } else {
                        a00Var.X(-1959404327);
                    }
                    a00Var.q(false);
                    if (str3 == null || up2.y(str3)) {
                        a00Var.X(-1959404327);
                    } else {
                        a00Var.X(214114881);
                        o70.k(uj2.f(R.string.item_place, a00Var), str3, a00Var, 0);
                    }
                    a00Var.q(false);
                } else {
                    a00Var.S();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                s93.k((a61) obj4, (Function0) obj3, (a00) obj, s03.R(1));
                break;
            case 6:
                zn1 zn1Var = (zn1) obj4;
                so2 so2Var = (so2) obj3;
                a00 a00Var2 = (a00) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (a00Var2.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String f5 = uj2.f(R.string.set_sources, a00Var2);
                    Object M = a00Var2.M();
                    if (M == sz.a) {
                        M = new wj2(zn1Var, 1);
                        a00Var2.i0(M);
                    }
                    zj2.a(f5, false, (Function0) M, a00Var2, 384, 2);
                    if (((Boolean) zn1Var.getValue()).booleanValue()) {
                        a00Var2.X(1559506133);
                        qw a = ow.a(new yh(4.0f, true, sc.o), qb2.A, a00Var2, 6);
                        int D = iv1.D(a00Var2);
                        v02 l2 = a00Var2.l();
                        vl1 E = bd3.E(a00Var2, sl1Var);
                        pz.b.getClass();
                        o00 o00Var = oz.b;
                        a00Var2.b0();
                        if (a00Var2.S) {
                            a00Var2.k(o00Var);
                        } else {
                            a00Var2.l0();
                        }
                        uj2.e(a00Var2, a, oz.f);
                        uj2.e(a00Var2, l2, oz.e);
                        sc scVar = oz.g;
                        if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                            q40.r(D, a00Var2, D, scVar);
                        }
                        uj2.e(a00Var2, E, oz.d);
                        a00Var2.X(336631893);
                        Iterator it = ((List) so2Var.getValue()).iterator();
                        while (it.hasNext()) {
                            a00 a00Var3 = a00Var2;
                            yv2.b(q40.l("• ", (String) it.next()), null, cw.v, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(n13.a)).l, a00Var3, 384, 0, 65530);
                            a00Var2 = a00Var3;
                        }
                        a00Var2.q(false);
                        a00Var2.q(true);
                    } else {
                        a00Var2.X(1552798167);
                    }
                    a00Var2.q(false);
                } else {
                    a00Var2.S();
                }
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                zj2.e((Function0) obj4, (vl1) obj3, (a00) obj, s03.R(1));
                break;
            default:
                so2 so2Var2 = (so2) obj4;
                so2 so2Var3 = (so2) obj3;
                a00 a00Var4 = (a00) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (a00Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    String f6 = uj2.f(R.string.stats_study, a00Var4);
                    long j = cw.u;
                    jq0 jq0Var = jq0.t;
                    yv2.b(f6, null, j, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, null, a00Var4, 196992, 0, 131034);
                    float intValue5 = ((Number) so2Var2.getValue()).intValue() > 0 ? ((Number) so2Var3.getValue()).intValue() / ((Number) so2Var2.getValue()).intValue() : 0.0f;
                    yv2.b(((Number) so2Var3.getValue()).intValue() + " / " + ((Number) so2Var2.getValue()).intValue(), null, cw.d, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, null, a00Var4, 196992, 0, 131034);
                    vl1 b2 = a.b(yk3.u(b.d(b.c(sl1Var, 1.0f), 10.0f), zb2.a(999.0f)), cw.t, ap.e);
                    oj1 e = fp.e(qb2.p, false);
                    int D2 = iv1.D(a00Var4);
                    v02 l3 = a00Var4.l();
                    vl1 E2 = bd3.E(a00Var4, b2);
                    pz.b.getClass();
                    o00 o00Var2 = oz.b;
                    a00Var4.b0();
                    if (a00Var4.S) {
                        a00Var4.k(o00Var2);
                    } else {
                        a00Var4.l0();
                    }
                    uj2.e(a00Var4, e, oz.f);
                    uj2.e(a00Var4, l3, oz.e);
                    sc scVar2 = oz.g;
                    if (a00Var4.S || !Intrinsics.b(a00Var4.M(), Integer.valueOf(D2))) {
                        q40.r(D2, a00Var4, D2, scVar2);
                    }
                    uj2.e(a00Var4, E2, oz.d);
                    fp.a(a.a(yk3.u(b.d(b.c(sl1Var, d.b(intValue5, 0.0f, 1.0f)), 10.0f), zb2.a(999.0f)), nj.q(qv.g(new aw(cw.p), new aw(cw.q)))), a00Var4, 0);
                    a00Var4.q(true);
                } else {
                    a00Var4.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ss(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }
}
