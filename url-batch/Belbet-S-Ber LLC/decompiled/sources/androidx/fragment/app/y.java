package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f681f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f682g;
    public final /* synthetic */ Object h;

    public y(z zVar, q0 q0Var) {
        this.h = zVar;
        this.f682g = q0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f681f) {
            case 0:
                q0 q0Var = (q0) this.f682g;
                u uVar = q0Var.f623c;
                q0Var.k();
                l.f((ViewGroup) uVar.J.getParent(), ((z) this.h).f683f.F()).e();
                break;
            default:
                ((ViewGroup) this.f682g).addView((q0.d) this.h, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f681f) {
            case 0:
                break;
            default:
                ((ViewGroup) this.f682g).addView((q0.d) this.h, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public y(ViewGroup viewGroup, q0.d dVar) {
        this.f682g = viewGroup;
        this.h = dVar;
    }

    private final void a(View view) {
    }
}
