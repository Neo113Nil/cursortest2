package l;

import android.content.Context;
import android.view.View;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends k.w {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2442m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f2443n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, k.m mVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, mVar, true);
        this.f2443n = jVar;
        this.f2272g = 8388613;
        a0.a aVar = jVar.B;
        this.i = aVar;
        k.u uVar = this.f2273j;
        if (uVar != null) {
            uVar.i(aVar);
        }
    }

    @Override // k.w
    public final void c() {
        switch (this.f2442m) {
            case 0:
                j jVar = this.f2443n;
                jVar.f2479y = null;
                jVar.getClass();
                super.c();
                break;
            default:
                j jVar2 = this.f2443n;
                k.m mVar = jVar2.h;
                if (mVar != null) {
                    mVar.c(true);
                }
                jVar2.f2478x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, k.e0 e0Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, e0Var, false);
        this.f2443n = jVar;
        if ((e0Var.A.f2254x & 32) != 32) {
            View view2 = jVar.f2468n;
            this.f2271f = view2 == null ? (View) jVar.f2467m : view2;
        }
        a0.a aVar = jVar.B;
        this.i = aVar;
        k.u uVar = this.f2273j;
        if (uVar != null) {
            uVar.i(aVar);
        }
    }
}
