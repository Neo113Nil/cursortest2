package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import l0.C0260f;

/* loaded from: classes.dex */
public final class Y extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f370b;

    public /* synthetic */ Y(int i, Object obj) {
        this.f369a = i;
        this.f370b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f369a) {
            case 0:
                ((a0) this.f370b).b();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f370b;
                actionBarOverlayLayout.f1215w = null;
                actionBarOverlayLayout.f1202j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f369a) {
            case 0:
                ((a0) this.f370b).a();
                break;
            case 1:
                L0.l lVar = (L0.l) this.f370b;
                lVar.q();
                lVar.f521r.start();
                break;
            case 2:
                ((k0.m) this.f370b).m();
                animator.removeListener(this);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f370b;
                actionBarOverlayLayout.f1215w = null;
                actionBarOverlayLayout.f1202j = false;
                break;
            case 4:
                C0260f c0260f = (C0260f) this.f370b;
                ArrayList arrayList = new ArrayList(c0260f.f3199e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((w0.a) arrayList.get(i)).f4119b.f4133o;
                    if (colorStateList != null) {
                        D.a.h(c0260f, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f370b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f369a) {
            case 0:
                ((a0) this.f370b).c();
                break;
            case 4:
                C0260f c0260f = (C0260f) this.f370b;
                ArrayList arrayList = new ArrayList(c0260f.f3199e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    w0.c cVar = ((w0.a) arrayList.get(i)).f4119b;
                    ColorStateList colorStateList = cVar.f4133o;
                    if (colorStateList != null) {
                        D.a.g(c0260f, colorStateList.getColorForState(cVar.f4137s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public Y(a0 a0Var, View view) {
        this.f369a = 0;
        this.f370b = a0Var;
    }
}
