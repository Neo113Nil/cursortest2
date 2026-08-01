package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import o0.C0271f;

/* loaded from: classes.dex */
public final class Y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f373b;

    public /* synthetic */ Y(int i, Object obj) {
        this.f372a = i;
        this.f373b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f372a) {
            case 0:
                ((a0) this.f373b).b();
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f373b;
                actionBarOverlayLayout.f1319w = null;
                actionBarOverlayLayout.f1306j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f372a) {
            case 0:
                ((a0) this.f373b).a();
                break;
            case 1:
                R0.k kVar = (R0.k) this.f373b;
                kVar.q();
                kVar.f682r.start();
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f373b;
                actionBarOverlayLayout.f1319w = null;
                actionBarOverlayLayout.f1306j = false;
                break;
            case 3:
                ((n0.m) this.f373b).m();
                animator.removeListener(this);
                break;
            case 4:
                C0271f c0271f = (C0271f) this.f373b;
                ArrayList arrayList = new ArrayList(c0271f.f3254e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0.a) arrayList.get(i)).f113b.f128o;
                    if (colorStateList != null) {
                        D.a.h(c0271f, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f373b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f372a) {
            case 0:
                ((a0) this.f373b).c();
                break;
            case 4:
                C0271f c0271f = (C0271f) this.f373b;
                ArrayList arrayList = new ArrayList(c0271f.f3254e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0.d dVar = ((C0.a) arrayList.get(i)).f113b;
                    ColorStateList colorStateList = dVar.f128o;
                    if (colorStateList != null) {
                        D.a.g(c0271f, colorStateList.getColorForState(dVar.f132s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public Y(a0 a0Var, View view) {
        this.f372a = 0;
        this.f373b = a0Var;
    }
}
