package k;

import android.content.Context;
import android.view.View;
import com.rockchicken.pump.up.road.R;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1212f extends j.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14000l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1218i f14001m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1212f(C1218i c1218i, Context context, j.j jVar, View view) {
        super(context, jVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f14001m = c1218i;
        this.f13697f = 8388613;
        e0.t tVar = c1218i.v;
        this.f13699h = tVar;
        j.l lVar = this.f13700i;
        if (lVar != null) {
            lVar.e(tVar);
        }
    }

    @Override // j.n
    public final void c() {
        switch (this.f14000l) {
            case 0:
                C1218i c1218i = this.f14001m;
                c1218i.f14028s = null;
                c1218i.getClass();
                super.c();
                break;
            default:
                C1218i c1218i2 = this.f14001m;
                j.j jVar = c1218i2.f14014c;
                if (jVar != null) {
                    jVar.c(true);
                }
                c1218i2.f14027r = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1212f(C1218i c1218i, Context context, j.t tVar, View view) {
        super(context, tVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f14001m = c1218i;
        if ((tVar.f13721x.f13688x & 32) != 32) {
            View view2 = c1218i.f14019h;
            this.f13696e = view2 == null ? c1218i.f14018g : view2;
        }
        e0.t tVar2 = c1218i.v;
        this.f13699h = tVar2;
        j.l lVar = this.f13700i;
        if (lVar != null) {
            lVar.e(tVar2);
        }
    }
}
