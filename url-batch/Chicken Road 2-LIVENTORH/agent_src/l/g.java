package l;

import android.content.Context;
import android.view.View;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends k.w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2306l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f2307m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Context context, k.m mVar, View view) {
        super(context, mVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f2307m = lVar;
        this.f2123f = 8388613;
        a0.a aVar = lVar.C;
        this.f2125h = aVar;
        k.u uVar = this.i;
        if (uVar != null) {
            uVar.l(aVar);
        }
    }

    @Override // k.w
    public final void c() {
        switch (this.f2306l) {
            case 0:
                l lVar = this.f2307m;
                lVar.f2378z = null;
                lVar.D = 0;
                super.c();
                break;
            default:
                l lVar2 = this.f2307m;
                k.m mVar = lVar2.f2361h;
                if (mVar != null) {
                    mVar.c(true);
                }
                lVar2.f2377y = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Context context, k.e0 e0Var, View view) {
        super(context, e0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f2307m = lVar;
        if ((e0Var.A.f2106x & 32) != 32) {
            View view2 = lVar.f2367o;
            this.f2122e = view2 == null ? (View) lVar.f2365m : view2;
        }
        a0.a aVar = lVar.C;
        this.f2125h = aVar;
        k.u uVar = this.i;
        if (uVar != null) {
            uVar.l(aVar);
        }
    }
}
