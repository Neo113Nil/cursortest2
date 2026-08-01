package j;

import android.animation.ValueAnimator;
import android.view.View;
import k0.r0;
import k0.w0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2153f = 0;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2154i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2155j;

    public e(a2.e eVar, f fVar, o oVar, m mVar) {
        this.f2155j = eVar;
        this.g = fVar;
        this.h = oVar;
        this.f2154i = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2153f) {
            case 0:
                g gVar = (g) ((a2.e) this.f2155j).g;
                o oVar = (o) this.h;
                f fVar = (f) this.g;
                if (fVar != null) {
                    gVar.F = true;
                    fVar.f2158b.c(false);
                    gVar.F = false;
                }
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((m) this.f2154i).q(oVar, null, 4);
                    break;
                }
                break;
            default:
                r0.i((View) this.g, (w0) this.h, (a2.s) this.f2154i);
                ((ValueAnimator) this.f2155j).start();
                break;
        }
    }

    public e(View view, w0 w0Var, a2.s sVar, ValueAnimator valueAnimator) {
        this.g = view;
        this.h = w0Var;
        this.f2154i = sVar;
        this.f2155j = valueAnimator;
    }
}
