package defpackage;

import android.content.Context;
import com.majelw.libystne.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class mu0 implements Function2 {
    public final /* synthetic */ int m = 3;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ mu0(Context context, zn1 zn1Var, zn1 zn1Var2, zn1 zn1Var3) {
        this.q = context;
        this.o = zn1Var;
        this.n = zn1Var2;
        this.p = zn1Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.p;
        Object obj4 = this.n;
        Object obj5 = this.o;
        Object obj6 = this.q;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                bd3.e((String) obj6, (Function0) obj5, (Function1) obj4, (vl1) obj3, (a00) obj, s03.R(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                s93.n((Function1) obj4, (Function0) obj5, (vl1) obj3, (f61) obj6, (a00) obj, s03.R(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                tk3.q((Function1) obj4, (Function1) obj6, (vl1) obj3, (ig2) obj5, (a00) obj, s03.R(1));
                break;
            default:
                Context context = (Context) obj6;
                zn1 zn1Var = (zn1) obj5;
                zn1 zn1Var2 = (zn1) obj4;
                zn1 zn1Var3 = (zn1) obj3;
                a00 a00Var = (a00) obj;
                int intValue = ((Integer) obj2).intValue();
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    zj2.c(uj2.f(R.string.set_theme, a00Var), a00Var, 0);
                    List g = qv.g(new Pair("system", Integer.valueOf(R.string.theme_system)), new Pair("light", Integer.valueOf(R.string.theme_light)), new Pair("dark", Integer.valueOf(R.string.theme_dark)));
                    String str = (String) zn1Var.getValue();
                    boolean h = a00Var.h(context);
                    Object M = a00Var.M();
                    nj njVar = sz.a;
                    if (h || M == njVar) {
                        M = new vj2(context, zn1Var, 0);
                        a00Var.i0(M);
                    }
                    zj2.d(g, str, (Function1) M, a00Var, 0);
                    zj2.c(uj2.f(R.string.set_language, a00Var), a00Var, 0);
                    List g2 = qv.g(new Pair("system", Integer.valueOf(R.string.lang_system)), new Pair("ru", Integer.valueOf(R.string.lang_ru)), new Pair("en", Integer.valueOf(R.string.lang_en)));
                    String str2 = (String) zn1Var2.getValue();
                    boolean h2 = a00Var.h(context);
                    Object M2 = a00Var.M();
                    if (h2 || M2 == njVar) {
                        M2 = new vj2(context, zn1Var2, 1);
                        a00Var.i0(M2);
                    }
                    zj2.d(g2, str2, (Function1) M2, a00Var, 0);
                    zj2.c(uj2.f(R.string.set_units, a00Var), a00Var, 0);
                    List g3 = qv.g(new Pair("grams", Integer.valueOf(R.string.units_grams)), new Pair("carats", Integer.valueOf(R.string.units_carats)));
                    String str3 = (String) zn1Var3.getValue();
                    boolean h3 = a00Var.h(context);
                    Object M3 = a00Var.M();
                    if (h3 || M3 == njVar) {
                        M3 = new vj2(context, zn1Var3, 2);
                        a00Var.i0(M3);
                    }
                    zj2.d(g3, str3, (Function1) M3, a00Var, 0);
                } else {
                    a00Var.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mu0(String str, Function0 function0, Function1 function1, vl1 vl1Var, int i) {
        this.q = str;
        this.o = function0;
        this.n = function1;
        this.p = vl1Var;
    }

    public /* synthetic */ mu0(Function1 function1, Function0 function0, vl1 vl1Var, f61 f61Var, int i) {
        this.n = function1;
        this.o = function0;
        this.p = vl1Var;
        this.q = f61Var;
    }

    public /* synthetic */ mu0(Function1 function1, Function1 function12, vl1 vl1Var, ig2 ig2Var, int i) {
        this.n = function1;
        this.q = function12;
        this.p = vl1Var;
        this.o = ig2Var;
    }
}
