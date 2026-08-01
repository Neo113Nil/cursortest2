package k;

import android.animation.ValueAnimator;
import android.view.View;
import n0.b1;
import n0.x0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2174f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2175g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2176j;

    public e(a0.a aVar, f fVar, o oVar, m mVar) {
        this.f2176j = aVar;
        this.f2175g = fVar;
        this.h = oVar;
        this.i = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2174f) {
            case 0:
                g gVar = (g) ((a0.a) this.f2176j).f79g;
                o oVar = (o) this.h;
                f fVar = (f) this.f2175g;
                if (fVar != null) {
                    gVar.F = true;
                    fVar.f2179b.c(false);
                    gVar.F = false;
                }
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((m) this.i).q(oVar, null, 4);
                    break;
                }
                break;
            default:
                x0.i((View) this.f2175g, (b1) this.h, (androidx.emoji2.text.q) this.i);
                ((ValueAnimator) this.f2176j).start();
                break;
        }
    }

    public e(View view, b1 b1Var, androidx.emoji2.text.q qVar, ValueAnimator valueAnimator) {
        this.f2175g = view;
        this.h = b1Var;
        this.i = qVar;
        this.f2176j = valueAnimator;
    }
}
