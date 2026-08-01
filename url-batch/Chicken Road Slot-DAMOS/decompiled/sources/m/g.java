package m;

import android.content.Context;
import android.view.View;
import com.appsflyer.R;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends l.m {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6075l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f6076m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context, l.s sVar, View view) {
        super(context, sVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f6076m = jVar;
        if ((sVar.f5730w.f5704x & 32) != 32) {
            View view2 = jVar.f6105v;
            this.f5713e = view2 == null ? jVar.f6104u : view2;
        }
        l.d dVar = jVar.J;
        this.f5715h = dVar;
        l.k kVar = this.f5716i;
        if (kVar != null) {
            kVar.e(dVar);
        }
    }

    @Override // l.m
    public final void c() {
        switch (this.f6075l) {
            case 0:
                this.f6076m.G = null;
                super.c();
                break;
            default:
                j jVar = this.f6076m;
                l.i iVar = jVar.f6100i;
                if (iVar != null) {
                    iVar.c(true);
                }
                jVar.F = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context, l.i iVar, View view) {
        super(context, iVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f6076m = jVar;
        this.f5714f = 8388613;
        l.d dVar = jVar.J;
        this.f5715h = dVar;
        l.k kVar = this.f5716i;
        if (kVar != null) {
            kVar.e(dVar);
        }
    }
}
