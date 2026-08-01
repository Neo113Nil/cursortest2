package M;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import z0.C0325a;

/* loaded from: classes.dex */
public final class X extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f521b;

    public /* synthetic */ X(int i, Object obj) {
        this.f520a = i;
        this.f521b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f520a) {
            case 0:
                ((Z) this.f521b).b();
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f521b;
                actionBarOverlayLayout.f1387w = null;
                actionBarOverlayLayout.f1374j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f520a) {
            case 0:
                ((Z) this.f521b).a();
                break;
            case 1:
                O0.l lVar = (O0.l) this.f521b;
                lVar.q();
                lVar.f683r.start();
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f521b;
                actionBarOverlayLayout.f1387w = null;
                actionBarOverlayLayout.f1374j = false;
                break;
            case 3:
                ((m0.m) this.f521b).m();
                animator.removeListener(this);
                break;
            case 4:
                n0.f fVar = (n0.f) this.f521b;
                ArrayList arrayList = new ArrayList(fVar.f3239e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0325a) arrayList.get(i)).f4321b.f4335o;
                    if (colorStateList != null) {
                        F.a.h(fVar, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f521b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f520a) {
            case 0:
                ((Z) this.f521b).g();
                break;
            case 4:
                n0.f fVar = (n0.f) this.f521b;
                ArrayList arrayList = new ArrayList(fVar.f3239e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    z0.c cVar = ((C0325a) arrayList.get(i)).f4321b;
                    ColorStateList colorStateList = cVar.f4335o;
                    if (colorStateList != null) {
                        F.a.g(fVar, colorStateList.getColorForState(cVar.f4339s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public X(Z z2, View view) {
        this.f520a = 0;
        this.f521b = z2;
    }
}
