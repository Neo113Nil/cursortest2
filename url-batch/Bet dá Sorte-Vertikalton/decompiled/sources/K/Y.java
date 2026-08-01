package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f359b;

    public /* synthetic */ Y(int i, Object obj) {
        this.f358a = i;
        this.f359b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f358a) {
            case 0:
                ((a0) this.f359b).b();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f359b;
                actionBarOverlayLayout.f1254w = null;
                actionBarOverlayLayout.f1241j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f358a) {
            case 0:
                ((a0) this.f359b).a();
                break;
            case 1:
                P0.k kVar = (P0.k) this.f359b;
                kVar.q();
                kVar.f620r.start();
                break;
            case 2:
                ((k0.m) this.f359b).m();
                animator.removeListener(this);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f359b;
                actionBarOverlayLayout.f1254w = null;
                actionBarOverlayLayout.f1241j = false;
                break;
            case 4:
                l0.f fVar = (l0.f) this.f359b;
                ArrayList arrayList = new ArrayList(fVar.f3087e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((A0.a) arrayList.get(i)).f1b.f16o;
                    if (colorStateList != null) {
                        D.a.h(fVar, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f359b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f358a) {
            case 0:
                ((a0) this.f359b).c();
                break;
            case 4:
                l0.f fVar = (l0.f) this.f359b;
                ArrayList arrayList = new ArrayList(fVar.f3087e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    A0.d dVar = ((A0.a) arrayList.get(i)).f1b;
                    ColorStateList colorStateList = dVar.f16o;
                    if (colorStateList != null) {
                        D.a.g(fVar, colorStateList.getColorForState(dVar.f20s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public Y(a0 a0Var, View view) {
        this.f358a = 0;
        this.f359b = a0Var;
    }
}
