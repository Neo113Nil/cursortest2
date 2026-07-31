package k;

import a0.a0;
import android.animation.ValueAnimator;
import android.view.View;
import q3.q0;
import q3.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4034d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4038h;

    public d(b1.b bVar, e eVar, j jVar, i iVar) {
        this.f4038h = bVar;
        this.f4035e = eVar;
        this.f4036f = jVar;
        this.f4037g = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4034d) {
            case 0:
                f fVar = (f) ((b1.b) this.f4038h).f1050e;
                j jVar = (j) this.f4036f;
                e eVar = (e) this.f4035e;
                if (eVar != null) {
                    fVar.C = true;
                    eVar.f4040b.c(false);
                    fVar.C = false;
                }
                if (jVar.isEnabled() && jVar.hasSubMenu()) {
                    ((i) this.f4037g).p(jVar, null, 4);
                    break;
                }
                break;
            default:
                q0.i((View) this.f4035e, (u0) this.f4036f, (a0) this.f4037g);
                ((ValueAnimator) this.f4038h).start();
                break;
        }
    }

    public d(View view, u0 u0Var, a0 a0Var, ValueAnimator valueAnimator) {
        this.f4035e = view;
        this.f4036f = u0Var;
        this.f4037g = a0Var;
        this.f4038h = valueAnimator;
    }
}
