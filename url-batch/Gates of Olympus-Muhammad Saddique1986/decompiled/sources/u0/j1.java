package u0;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0426e;
import g2.InterfaceC0439a;
import g2.InterfaceC0443e;
import java.util.Set;

/* loaded from: classes.dex */
public final class j1 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f9381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q.a f9382g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(k1 k1Var, Q.a aVar, int i3) {
        super(2);
        this.f9380e = i3;
        this.f9381f = k1Var;
        this.f9382g = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f9380e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    AndroidCompositionLocals_androidKt.a(this.f9381f.f9388d, this.f9382g, c0167p, 0);
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    k1 k1Var = this.f9381f;
                    Object tag = k1Var.f9388d.getTag(R.id.inspection_slot_table_set);
                    Set set = (tag instanceof Set) && (!(tag instanceof InterfaceC0439a) || (tag instanceof InterfaceC0443e)) ? (Set) tag : null;
                    C1123s c1123s = k1Var.f9388d;
                    if (set == null) {
                        Object parent = c1123s.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC0439a) && !(tag2 instanceof InterfaceC0443e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0167p2.f2867c);
                        c0167p2.f2880p = true;
                        c0167p2.f2852B = true;
                        c0167p2.f2867c.c();
                        c0167p2.f2855G.c();
                        I.H0 h02 = c0167p2.f2856H;
                        I.F0 f02 = h02.f2687a;
                        h02.f2691e = f02.f2680l;
                        h02.f2692f = f02.f2681m;
                    }
                    boolean h3 = c0167p2.h(k1Var);
                    Object G3 = c0167p2.G();
                    I.W w2 = C0159l.f2829a;
                    if (h3 || G3 == w2) {
                        G3 = new h1(k1Var, null);
                        c0167p2.a0(G3);
                    }
                    C0143d.e(c0167p2, (InterfaceC0426e) G3, c1123s);
                    boolean h4 = c0167p2.h(k1Var);
                    Object G4 = c0167p2.G();
                    if (h4 || G4 == w2) {
                        G4 = new i1(k1Var, null);
                        c0167p2.a0(G4);
                    }
                    C0143d.e(c0167p2, (InterfaceC0426e) G4, c1123s);
                    C0143d.a(T.b.f4334a.a(set), Q.f.b(-1193460702, new j1(k1Var, this.f9382g, 0), c0167p2), c0167p2, 56);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
