package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import k0.C0219f;

/* renamed from: K.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f437b;

    public /* synthetic */ C0007d0(int i, Object obj) {
        this.f436a = i;
        this.f437b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f436a) {
            case 0:
                ((f0) this.f437b).b();
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f437b;
                actionBarOverlayLayout.f1031w = null;
                actionBarOverlayLayout.f1018j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f436a) {
            case 0:
                ((f0) this.f437b).a();
                break;
            case 1:
                K0.l lVar = (K0.l) this.f437b;
                lVar.q();
                lVar.f563r.start();
                break;
            case 2:
                ((j0.m) this.f437b).m();
                animator.removeListener(this);
                break;
            case 3:
                C0219f c0219f = (C0219f) this.f437b;
                ArrayList arrayList = new ArrayList(c0219f.f3146e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((v0.a) arrayList.get(i)).f4446b.f4460o;
                    if (colorStateList != null) {
                        D.a.h(c0219f, colorStateList);
                    }
                }
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f437b;
                actionBarOverlayLayout.f1031w = null;
                actionBarOverlayLayout.f1018j = false;
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f437b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f436a) {
            case 0:
                ((f0) this.f437b).c();
                break;
            case 3:
                C0219f c0219f = (C0219f) this.f437b;
                ArrayList arrayList = new ArrayList(c0219f.f3146e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    v0.c cVar = ((v0.a) arrayList.get(i)).f4446b;
                    ColorStateList colorStateList = cVar.f4460o;
                    if (colorStateList != null) {
                        D.a.g(c0219f, colorStateList.getColorForState(cVar.f4464s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0007d0(f0 f0Var, View view) {
        this.f436a = 0;
        this.f437b = f0Var;
    }
}
