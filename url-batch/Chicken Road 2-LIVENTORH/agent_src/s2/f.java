package s2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f1.d0;
import f1.e0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3193f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f3194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f3195h;
    public final /* synthetic */ Object i;

    public /* synthetic */ f(h hVar, boolean z3, g gVar) {
        this.f3195h = hVar;
        this.f3194g = z3;
        this.i = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        RecyclerView recyclerView;
        d0 adapter;
        RecyclerView recyclerView2;
        d0 adapter2;
        int F;
        switch (this.f3193f) {
            case 0:
                h hVar = (h) this.f3195h;
                e0 e0Var = hVar.f1333a;
                g gVar = (g) this.i;
                int i4 = hVar.f3199e;
                int i5 = -1;
                if (this.f3194g) {
                    hVar.f3199e = -1;
                } else {
                    if (gVar.f1325s == null || (recyclerView = gVar.f1324r) == null || (adapter = recyclerView.getAdapter()) == null || (i = gVar.f1324r.F(gVar)) == -1 || gVar.f1325s != adapter) {
                        i = -1;
                    }
                    hVar.f3199e = i;
                }
                if (i4 != -1) {
                    e0Var.b(i4);
                }
                if (gVar.f1325s != null && (recyclerView2 = gVar.f1324r) != null && (adapter2 = recyclerView2.getAdapter()) != null && (F = gVar.f1324r.F(gVar)) != -1 && gVar.f1325s == adapter2) {
                    i5 = F;
                }
                e0Var.b(i5);
                break;
            default:
                o oVar = (o) this.f3195h;
                y2.i iVar = (y2.i) this.i;
                if (this.f3194g) {
                    oVar.f3225f.b(iVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f(boolean z3, o oVar, y2.i iVar) {
        this.f3194g = z3;
        this.f3195h = oVar;
        this.i = iVar;
    }
}
