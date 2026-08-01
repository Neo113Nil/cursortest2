package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import l0.C0263f;
import w0.C0331a;

/* loaded from: classes.dex */
public final class Y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f377b;

    public /* synthetic */ Y(int i, Object obj) {
        this.f376a = i;
        this.f377b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f376a) {
            case 0:
                ((a0) this.f377b).b();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f377b;
                actionBarOverlayLayout.f1240w = null;
                actionBarOverlayLayout.f1227j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f376a) {
            case 0:
                ((a0) this.f377b).a();
                break;
            case 1:
                L0.l lVar = (L0.l) this.f377b;
                lVar.q();
                lVar.f533r.start();
                break;
            case 2:
                ((k0.n) this.f377b).m();
                animator.removeListener(this);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f377b;
                actionBarOverlayLayout.f1240w = null;
                actionBarOverlayLayout.f1227j = false;
                break;
            case 4:
                C0263f c0263f = (C0263f) this.f377b;
                ArrayList arrayList = new ArrayList(c0263f.f3055e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0331a) arrayList.get(i)).f4128b.f4142o;
                    if (colorStateList != null) {
                        D.a.h(c0263f, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f377b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f376a) {
            case 0:
                ((a0) this.f377b).c();
                break;
            case 4:
                C0263f c0263f = (C0263f) this.f377b;
                ArrayList arrayList = new ArrayList(c0263f.f3055e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    w0.c cVar = ((C0331a) arrayList.get(i)).f4128b;
                    ColorStateList colorStateList = cVar.f4142o;
                    if (colorStateList != null) {
                        D.a.g(c0263f, colorStateList.getColorForState(cVar.f4146s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public Y(a0 a0Var, View view) {
        this.f376a = 0;
        this.f377b = a0Var;
    }
}
