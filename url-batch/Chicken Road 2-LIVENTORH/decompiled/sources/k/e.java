package k;

import android.animation.ValueAnimator;
import android.view.View;
import n0.u0;
import n0.y0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2020f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2021g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2022h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2023j;

    public e(a0.a aVar, f fVar, o oVar, m mVar) {
        this.f2023j = aVar;
        this.f2021g = fVar;
        this.f2022h = oVar;
        this.i = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2020f) {
            case 0:
                g gVar = (g) ((a0.a) this.f2023j).f81g;
                o oVar = (o) this.f2022h;
                f fVar = (f) this.f2021g;
                if (fVar != null) {
                    gVar.E = true;
                    fVar.f2026b.c(false);
                    gVar.E = false;
                }
                if (oVar.isEnabled() && oVar.hasSubMenu()) {
                    ((m) this.i).q(oVar, null, 4);
                    break;
                }
                break;
            default:
                u0.i((View) this.f2021g, (y0) this.f2022h, (androidx.emoji2.text.q) this.i);
                ((ValueAnimator) this.f2023j).start();
                break;
        }
    }

    public e(View view, y0 y0Var, androidx.emoji2.text.q qVar, ValueAnimator valueAnimator) {
        this.f2021g = view;
        this.f2022h = y0Var;
        this.i = qVar;
        this.f2023j = valueAnimator;
    }
}
