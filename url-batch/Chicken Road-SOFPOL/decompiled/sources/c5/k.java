package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1689b;

    public /* synthetic */ k(int i, Object obj) {
        this.f1688a = i;
        this.f1689b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1688a) {
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1689b;
                actionBarOverlayLayout.f395w = null;
                actionBarOverlayLayout.f384l = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1688a) {
            case 0:
                ((o) this.f1689b).m();
                animator.removeListener(this);
                break;
            case 1:
                ((HideBottomViewOnScrollBehavior) this.f1689b).f1822k = null;
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((HideViewOnScrollBehavior) this.f1689b).f1832k = null;
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1689b;
                actionBarOverlayLayout.f395w = null;
                actionBarOverlayLayout.f384l = false;
                break;
            default:
                z5.k kVar = (z5.k) this.f1689b;
                kVar.p();
                kVar.f9210r.start();
                break;
        }
    }
}
