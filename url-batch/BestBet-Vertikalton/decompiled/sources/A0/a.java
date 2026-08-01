package A0;

import K.a0;
import U0.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import p0.m;
import q0.f;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f0a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1b;

    public /* synthetic */ a(int i, Object obj) {
        this.f0a = i;
        this.f1b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f0a) {
            case 1:
                ((a0) this.f1b).d();
                break;
            case 2:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1b;
                actionBarOverlayLayout.f1703w = null;
                actionBarOverlayLayout.f1690j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f0a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f1b).h = null;
                break;
            case 1:
                ((a0) this.f1b).a();
                break;
            case 2:
                k kVar = (k) this.f1b;
                kVar.q();
                kVar.f1162r.start();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1b;
                actionBarOverlayLayout.f1703w = null;
                actionBarOverlayLayout.f1690j = false;
                break;
            case 4:
                ((m) this.f1b).m();
                animator.removeListener(this);
                break;
            default:
                f fVar = (f) this.f1b;
                ArrayList arrayList = new ArrayList(fVar.f3761e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((F0.a) arrayList.get(i)).f243b.f258o;
                    if (colorStateList != null) {
                        D.a.h(fVar, colorStateList);
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f0a) {
            case 1:
                ((a0) this.f1b).g();
                break;
            case 5:
                f fVar = (f) this.f1b;
                ArrayList arrayList = new ArrayList(fVar.f3761e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    F0.d dVar = ((F0.a) arrayList.get(i)).f243b;
                    ColorStateList colorStateList = dVar.f258o;
                    if (colorStateList != null) {
                        D.a.g(fVar, colorStateList.getColorForState(dVar.f262s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public a(a0 a0Var, View view) {
        this.f0a = 1;
        this.f1b = a0Var;
    }
}
