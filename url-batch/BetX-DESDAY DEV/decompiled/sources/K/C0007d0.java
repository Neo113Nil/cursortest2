package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.luckyarcade.spinthrow.GameConfig;
import java.util.ArrayList;
import k0.C0221f;

/* renamed from: K.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f438b;

    public /* synthetic */ C0007d0(int i, Object obj) {
        this.f437a = i;
        this.f438b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f437a) {
            case 0:
                ((f0) this.f438b).b();
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f438b;
                actionBarOverlayLayout.f1032w = null;
                actionBarOverlayLayout.f1019j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f437a) {
            case 0:
                ((f0) this.f438b).a();
                break;
            case 1:
                K0.l lVar = (K0.l) this.f438b;
                lVar.q();
                lVar.f564r.start();
                break;
            case 2:
                ((j0.m) this.f438b).m();
                animator.removeListener(this);
                break;
            case GameConfig.COMBO_EVERY /* 3 */:
                C0221f c0221f = (C0221f) this.f438b;
                ArrayList arrayList = new ArrayList(c0221f.f3150e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((v0.a) arrayList.get(i)).f4450b.f4464o;
                    if (colorStateList != null) {
                        D.a.h(c0221f, colorStateList);
                    }
                }
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f438b;
                actionBarOverlayLayout.f1032w = null;
                actionBarOverlayLayout.f1019j = false;
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f438b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f437a) {
            case 0:
                ((f0) this.f438b).c();
                break;
            case GameConfig.COMBO_EVERY /* 3 */:
                C0221f c0221f = (C0221f) this.f438b;
                ArrayList arrayList = new ArrayList(c0221f.f3150e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    v0.c cVar = ((v0.a) arrayList.get(i)).f4450b;
                    ColorStateList colorStateList = cVar.f4464o;
                    if (colorStateList != null) {
                        D.a.g(c0221f, colorStateList.getColorForState(cVar.f4468s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0007d0(f0 f0Var, View view) {
        this.f437a = 0;
        this.f438b = f0Var;
    }
}
