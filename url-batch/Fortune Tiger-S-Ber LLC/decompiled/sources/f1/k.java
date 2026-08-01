package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.ArrayList;
import k0.m0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1687b;

    public /* synthetic */ k(int i4, Object obj) {
        this.f1686a = i4;
        this.f1687b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1686a) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1687b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f207o = false;
                break;
            case 4:
                ((m0) this.f1687b).c();
                break;
            case 5:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) this.f1687b;
                focusRingDrawable.f1357p = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1686a) {
            case 0:
                ((o) this.f1687b).m();
                animator.removeListener(this);
                break;
            case 1:
                g1.f fVar = (g1.f) this.f1687b;
                ArrayList arrayList = new ArrayList(fVar.f1772j);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ColorStateList colorStateList = ((t1.a) arrayList.get(i4)).f3378b.f3390t;
                    if (colorStateList != null) {
                        fVar.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                j2.m mVar = (j2.m) this.f1687b;
                mVar.p();
                mVar.f2329r.start();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1687b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f207o = false;
                break;
            case 4:
                ((m0) this.f1687b).b();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1686a) {
            case 1:
                g1.f fVar = (g1.f) this.f1687b;
                ArrayList arrayList = new ArrayList(fVar.f1772j);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    t1.c cVar = ((t1.a) arrayList.get(i4)).f3378b;
                    ColorStateList colorStateList = cVar.f3390t;
                    if (colorStateList != null) {
                        fVar.setTint(colorStateList.getColorForState(cVar.f3394x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 4:
                ((m0) this.f1687b).g();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public k(m0 m0Var, View view) {
        this.f1686a = 4;
        this.f1687b = m0Var;
    }
}
