package g1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1805a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1807c;

    public v(View view, boolean z4) {
        this.f1805a = 2;
        this.f1806b = z4;
        this.f1807c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1805a) {
            case 0:
                this.f1806b = true;
                break;
            case 1:
                this.f1806b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1805a) {
            case 0:
                x xVar = (x) this.f1807c;
                if (!this.f1806b) {
                    if (((Float) xVar.f1842z.getAnimatedValue()).floatValue() != 0.0f) {
                        xVar.A = 2;
                        xVar.f1835s.invalidate();
                        break;
                    } else {
                        xVar.A = 0;
                        xVar.f(0);
                        break;
                    }
                } else {
                    this.f1806b = false;
                    break;
                }
            case 1:
                g2.i iVar = (g2.i) this.f1807c;
                iVar.f1916r = 0;
                iVar.f1911m = null;
                if (!this.f1806b) {
                    iVar.f1917s.a(4, false);
                    break;
                }
                break;
            default:
                if (!this.f1806b) {
                    ((View) this.f1807c).setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1805a) {
            case 1:
                g2.i iVar = (g2.i) this.f1807c;
                iVar.f1917s.a(0, false);
                iVar.f1916r = 1;
                iVar.f1911m = animator;
                this.f1806b = false;
                break;
            case 2:
                if (this.f1806b) {
                    ((View) this.f1807c).setVisibility(0);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public v(g2.i iVar) {
        this.f1805a = 1;
        this.f1807c = iVar;
    }

    public v(x xVar) {
        this.f1805a = 0;
        this.f1807c = xVar;
        this.f1806b = false;
    }
}
