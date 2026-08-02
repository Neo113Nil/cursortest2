package l1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: l1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14203a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14204b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14205c;

    public C1257d(View view) {
        this.f14205c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f14203a) {
            case 0:
                this.f14204b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14203a) {
            case 0:
                C1259f c1259f = (C1259f) this.f14205c;
                if (!this.f14204b) {
                    if (((Float) c1259f.f14227u.getAnimatedValue()).floatValue() != 0.0f) {
                        c1259f.v = 2;
                        c1259f.n.invalidate();
                        break;
                    } else {
                        c1259f.v = 0;
                        c1259f.e(0);
                        break;
                    }
                } else {
                    this.f14204b = false;
                    break;
                }
            default:
                View view = (View) this.f14205c;
                p1.y.f14807a.w(view, 1.0f);
                if (this.f14204b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f14203a) {
            case 1:
                View view = (View) this.f14205c;
                Field field = E.H.f375a;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f14204b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C1257d(C1259f c1259f) {
        this.f14205c = c1259f;
    }
}
