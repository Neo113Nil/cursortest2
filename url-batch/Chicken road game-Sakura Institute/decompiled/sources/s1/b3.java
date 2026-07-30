package s1;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b3 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8152g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c3 f8153h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.e f8154i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(c3 c3Var, q6.e eVar, int i7) {
        super(2);
        this.f8152g = i7;
        this.f8153h = c3Var;
        this.f8154i = eVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f8152g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    AndroidCompositionLocals_androidKt.a(this.f8153h.f8188f, this.f8154i, pVar, 0);
                }
                break;
            default:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    c3 c3Var = this.f8153h;
                    r rVar = c3Var.f8188f;
                    Object tag = rVar.getTag(R.id.inspection_slot_table_set);
                    h6.d dVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof s6.a) && !(tag instanceof s6.f))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = rVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof s6.a) && !(tag2 instanceof s6.f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(pVar2.f3822c);
                        pVar2.f3835p = true;
                        pVar2.B = true;
                        pVar2.f3822c.g();
                        pVar2.G.g();
                        g0.a2 a2Var = pVar2.H;
                        g0.y1 y1Var = a2Var.f3664a;
                        a2Var.f3668e = y1Var.f3982n;
                        a2Var.f3669f = y1Var.f3983o;
                    }
                    boolean h3 = pVar2.h(c3Var);
                    Object G = pVar2.G();
                    g0.t0 t0Var = g0.l.f3784a;
                    if (h3 || G == t0Var) {
                        G = new a3(c3Var, dVar, 0);
                        pVar2.a0(G);
                    }
                    g0.d.e(pVar2, rVar, (q6.e) G);
                    boolean h8 = pVar2.h(c3Var);
                    Object G2 = pVar2.G();
                    if (h8 || G2 == t0Var) {
                        G2 = new a3(c3Var, dVar, 1);
                        pVar2.a0(G2);
                    }
                    g0.d.e(pVar2, rVar, (q6.e) G2);
                    g0.d.a(r0.b.f7699a.a(set), o0.f.b(-1193460702, new b3(c3Var, this.f8154i, 0), pVar2), pVar2, 56);
                }
                break;
        }
        return d6.z.f2639a;
    }
}
