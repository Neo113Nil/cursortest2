package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import l0.C0262f;
import w0.C0330a;
import w0.C0332c;

/* loaded from: classes.dex */
public final class Y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f430b;

    public /* synthetic */ Y(int i, Object obj) {
        this.f429a = i;
        this.f430b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f429a) {
            case 0:
                ((a0) this.f430b).b();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f430b;
                actionBarOverlayLayout.f1285w = null;
                actionBarOverlayLayout.f1272j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f429a) {
            case 0:
                ((a0) this.f430b).a();
                break;
            case 1:
                L0.l lVar = (L0.l) this.f430b;
                lVar.q();
                lVar.f585r.start();
                break;
            case 2:
                ((k0.n) this.f430b).m();
                animator.removeListener(this);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f430b;
                actionBarOverlayLayout.f1285w = null;
                actionBarOverlayLayout.f1272j = false;
                break;
            case 4:
                C0262f c0262f = (C0262f) this.f430b;
                ArrayList arrayList = new ArrayList(c0262f.f3108e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0330a) arrayList.get(i)).f4056b.f4070o;
                    if (colorStateList != null) {
                        D.a.h(c0262f, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f430b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f429a) {
            case 0:
                ((a0) this.f430b).c();
                break;
            case 4:
                C0262f c0262f = (C0262f) this.f430b;
                ArrayList arrayList = new ArrayList(c0262f.f3108e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0332c c0332c = ((C0330a) arrayList.get(i)).f4056b;
                    ColorStateList colorStateList = c0332c.f4070o;
                    if (colorStateList != null) {
                        D.a.g(c0262f, colorStateList.getColorForState(c0332c.f4074s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public Y(a0 a0Var, View view) {
        this.f429a = 0;
        this.f430b = a0Var;
    }
}
