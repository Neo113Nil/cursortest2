package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.majelw.libystne.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f93 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ g93 n;
    public final /* synthetic */ Function2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f93(g93 g93Var, Function2 function2, int i) {
        super(2);
        this.m = i;
        this.n = g93Var;
        this.o = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Function2 function2 = this.o;
        g93 g93Var = this.n;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                int intValue = ((Number) obj2).intValue();
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(g93Var.m, function2, a00Var, 0);
                } else {
                    a00Var.S();
                }
                break;
            default:
                a00 a00Var2 = (a00) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (a00Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    t7 t7Var = g93Var.m;
                    Object tag = t7Var.getTag(R.id.inspection_slot_table_set);
                    o30 o30Var = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof k71) && !(tag instanceof o71))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = t7Var.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof k71) && !(tag2 instanceof o71))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        f00 f00Var = a00Var2.U;
                        if (f00Var == null) {
                            f00Var = new f00(a00Var2.h);
                            a00Var2.U = f00Var;
                        }
                        set.add(f00Var);
                        a00Var2.q = true;
                        a00Var2.C = true;
                        a00Var2.c.b();
                        a00Var2.H.b();
                        zl2 zl2Var = a00Var2.I;
                        wl2 wl2Var = zl2Var.a;
                        zl2Var.e = wl2Var.v;
                        zl2Var.f = wl2Var.w;
                    }
                    boolean h = a00Var2.h(g93Var);
                    Object M = a00Var2.M();
                    nj njVar = sz.a;
                    if (h || M == njVar) {
                        M = new e93(g93Var, o30Var, i3);
                        a00Var2.i0(M);
                    }
                    l41.h(a00Var2, t7Var, (Function2) M);
                    boolean h2 = a00Var2.h(g93Var);
                    Object M2 = a00Var2.M();
                    if (h2 || M2 == njVar) {
                        M2 = new e93(g93Var, o30Var, i2);
                        a00Var2.i0(M2);
                    }
                    l41.h(a00Var2, t7Var, (Function2) M2);
                    yk3.a(h31.a.a(set), yj1.H(-280240369, new f93(g93Var, function2, i3), a00Var2), a00Var2, 56);
                } else {
                    a00Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
