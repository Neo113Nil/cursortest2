package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import m0.C0269f;
import x0.C0316a;

/* renamed from: K.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003b0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f459b;

    public /* synthetic */ C0003b0(int i, Object obj) {
        this.f458a = i;
        this.f459b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f458a) {
            case 0:
                ((d0) this.f459b).d();
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f459b;
                actionBarOverlayLayout.f1330w = null;
                actionBarOverlayLayout.f1317j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f458a) {
            case 0:
                ((d0) this.f459b).a();
                break;
            case 1:
                M0.l lVar = (M0.l) this.f459b;
                lVar.q();
                lVar.f613r.start();
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f459b;
                actionBarOverlayLayout.f1330w = null;
                actionBarOverlayLayout.f1317j = false;
                break;
            case 3:
                ((l0.m) this.f459b).m();
                animator.removeListener(this);
                break;
            case 4:
                C0269f c0269f = (C0269f) this.f459b;
                ArrayList arrayList = new ArrayList(c0269f.f3161e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0316a) arrayList.get(i)).f4122b.f4136o;
                    if (colorStateList != null) {
                        D.a.h(c0269f, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f459b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f458a) {
            case 0:
                ((d0) this.f459b).g();
                break;
            case 4:
                C0269f c0269f = (C0269f) this.f459b;
                ArrayList arrayList = new ArrayList(c0269f.f3161e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    x0.c cVar = ((C0316a) arrayList.get(i)).f4122b;
                    ColorStateList colorStateList = cVar.f4136o;
                    if (colorStateList != null) {
                        D.a.g(c0269f, colorStateList.getColorForState(cVar.f4140s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0003b0(d0 d0Var, View view) {
        this.f458a = 0;
        this.f459b = d0Var;
    }
}
