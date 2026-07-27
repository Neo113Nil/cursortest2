package s0;

import G.C0192d;
import G.C0208l;
import G.C0216p;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.chicken.road.kedro.laqer.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f10251e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O.a f10252i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(l1 l1Var, O.a aVar, int i2) {
        super(2);
        this.f10250d = i2;
        this.f10251e = l1Var;
        this.f10252i = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f10250d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                } else {
                    AndroidCompositionLocals_androidKt.a(this.f10251e.f10258d, this.f10252i, c0216p, 0);
                }
                break;
            default:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    l1 l1Var = this.f10251e;
                    Object tag = l1Var.f10258d.getTag(R.id.inspection_slot_table_set);
                    Set set = (tag instanceof Set) && (!(tag instanceof N2.a) || (tag instanceof N2.f)) ? (Set) tag : null;
                    C1166s c1166s = l1Var.f10258d;
                    if (set == null) {
                        Object parent = c1166s.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof N2.a) && !(tag2 instanceof N2.f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0216p2.f2864c);
                        c0216p2.f2877p = true;
                        c0216p2.B = true;
                        c0216p2.f2864c.h();
                        c0216p2.f2852G.h();
                        G.H0 h02 = c0216p2.f2853H;
                        G.F0 f02 = h02.f2685a;
                        h02.f2689e = f02.f2678o;
                        h02.f2690f = f02.f2679p;
                    }
                    boolean h4 = c0216p2.h(l1Var);
                    Object I3 = c0216p2.I();
                    G.W w4 = C0208l.f2826a;
                    if (h4 || I3 == w4) {
                        I3 = new i1(l1Var, null);
                        c0216p2.c0(I3);
                    }
                    C0192d.e(c0216p2, c1166s, (Function2) I3);
                    boolean h5 = c0216p2.h(l1Var);
                    Object I4 = c0216p2.I();
                    if (h5 || I4 == w4) {
                        I4 = new j1(l1Var, null);
                        c0216p2.c0(I4);
                    }
                    C0192d.e(c0216p2, c1166s, (Function2) I4);
                    C0192d.a(R.b.f3941a.a(set), O.f.b(-1193460702, new k1(l1Var, this.f10252i, 0), c0216p2), c0216p2, 56);
                }
                break;
        }
        return Unit.f7487a;
    }
}
