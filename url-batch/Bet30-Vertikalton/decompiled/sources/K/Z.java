package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import k0.AbstractC0190m;

/* loaded from: classes.dex */
public final class Z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f389b;

    public /* synthetic */ Z(int i, Object obj) {
        this.f388a = i;
        this.f389b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f388a) {
            case 0:
                ((b0) this.f389b).b();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f389b;
                actionBarOverlayLayout.f1180w = null;
                actionBarOverlayLayout.f1167j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f388a) {
            case 0:
                ((b0) this.f389b).a();
                break;
            case 1:
                K0.l lVar = (K0.l) this.f389b;
                lVar.q();
                lVar.f513r.start();
                break;
            case 2:
                ((AbstractC0190m) this.f389b).m();
                animator.removeListener(this);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f389b;
                actionBarOverlayLayout.f1180w = null;
                actionBarOverlayLayout.f1167j = false;
                break;
            case 4:
                l0.f fVar = (l0.f) this.f389b;
                ArrayList arrayList = new ArrayList(fVar.f3120e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((v0.a) arrayList.get(i)).f4035b.f4049o;
                    if (colorStateList != null) {
                        D.a.h(fVar, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f389b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f388a) {
            case 0:
                ((b0) this.f389b).c();
                break;
            case 4:
                l0.f fVar = (l0.f) this.f389b;
                ArrayList arrayList = new ArrayList(fVar.f3120e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    v0.c cVar = ((v0.a) arrayList.get(i)).f4035b;
                    ColorStateList colorStateList = cVar.f4049o;
                    if (colorStateList != null) {
                        D.a.g(fVar, colorStateList.getColorForState(cVar.f4053s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public Z(b0 b0Var, View view) {
        this.f388a = 0;
        this.f389b = b0Var;
    }
}
