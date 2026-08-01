package j1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;
import n0.q0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1927b;

    public /* synthetic */ k(int i, Object obj) {
        this.f1926a = i;
        this.f1927b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1926a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1927b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f186o = false;
                break;
            case 3:
                ((q0) this.f1927b).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1926a) {
            case 0:
                ((o) this.f1927b).m();
                animator.removeListener(this);
                break;
            case 1:
                k1.f fVar = (k1.f) this.f1927b;
                ArrayList arrayList = new ArrayList(fVar.f2173j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((y1.a) arrayList.get(i)).f3781b.f3793t;
                    if (colorStateList != null) {
                        fVar.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1927b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f186o = false;
                break;
            case 3:
                ((q0) this.f1927b).a();
                break;
            case 4:
                o2.k kVar = (o2.k) this.f1927b;
                kVar.p();
                kVar.f2905r.start();
                break;
            case 5:
                ((HideBottomViewOnScrollBehavior) this.f1927b).f803k = null;
                break;
            default:
                ((HideViewOnScrollBehavior) this.f1927b).f812k = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1926a) {
            case 1:
                k1.f fVar = (k1.f) this.f1927b;
                ArrayList arrayList = new ArrayList(fVar.f2173j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    y1.c cVar = ((y1.a) arrayList.get(i)).f3781b;
                    ColorStateList colorStateList = cVar.f3793t;
                    if (colorStateList != null) {
                        fVar.setTint(colorStateList.getColorForState(cVar.f3797x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 2:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                ((q0) this.f1927b).c();
                break;
        }
    }

    public k(q0 q0Var, View view) {
        this.f1926a = 3;
        this.f1927b = q0Var;
    }
}
