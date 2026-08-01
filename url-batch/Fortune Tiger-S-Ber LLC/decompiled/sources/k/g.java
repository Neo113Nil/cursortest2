package k;

import android.content.Context;
import android.view.View;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g extends j.w {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2545m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f2546n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, j.m mVar, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, mVar, true);
        this.f2546n = kVar;
        this.g = 8388613;
        a2.e eVar = kVar.B;
        this.f2249i = eVar;
        j.u uVar = this.f2250j;
        if (uVar != null) {
            uVar.j(eVar);
        }
    }

    @Override // j.w
    public final void c() {
        switch (this.f2545m) {
            case 0:
                k kVar = this.f2546n;
                kVar.f2584y = null;
                kVar.getClass();
                super.c();
                break;
            default:
                k kVar2 = this.f2546n;
                j.m mVar = kVar2.h;
                if (mVar != null) {
                    mVar.c(true);
                }
                kVar2.f2583x = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Context context, j.e0 e0Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, e0Var, false);
        this.f2546n = kVar;
        if ((e0Var.A.f2231x & 32) != 32) {
            View view2 = kVar.f2573n;
            this.f2248f = view2 == null ? (View) kVar.f2572m : view2;
        }
        a2.e eVar = kVar.B;
        this.f2249i = eVar;
        j.u uVar = this.f2250j;
        if (uVar != null) {
            uVar.j(eVar);
        }
    }
}
