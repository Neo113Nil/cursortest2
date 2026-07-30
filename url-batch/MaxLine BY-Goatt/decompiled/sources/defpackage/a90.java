package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a90 extends b90 {
    public boolean c;
    public boolean d;
    public t21 e;

    public final t21 o(Context context) {
        Animation loadAnimation;
        t21 t21Var;
        if (this.d) {
            return this.e;
        }
        bo2 bo2Var = (bo2) this.a;
        fr0 fr0Var = bo2Var.c;
        boolean z = bo2Var.a == 2;
        boolean z2 = this.c;
        int nextTransition = fr0Var.getNextTransition();
        int popEnterAnim = z2 ? z ? fr0Var.getPopEnterAnim() : fr0Var.getPopExitAnim() : z ? fr0Var.getEnterAnim() : fr0Var.getExitAnim();
        fr0Var.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fr0Var.mContainer;
        t21 t21Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fr0Var.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fr0Var.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fr0Var.onCreateAnimation(nextTransition, z, popEnterAnim);
            int i = 18;
            if (onCreateAnimation != null) {
                t21Var2 = new t21(i, onCreateAnimation);
            } else {
                Animator onCreateAnimator = fr0Var.onCreateAnimator(nextTransition, z, popEnterAnim);
                if (onCreateAnimator != null) {
                    t21Var2 = new t21(onCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? iv1.W(context, android.R.attr.activityOpenEnterAnimation) : iv1.W(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? iv1.W(context, android.R.attr.activityCloseEnterAnimation) : iv1.W(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    t21Var = new t21(i, loadAnimation);
                                    t21Var2 = t21Var;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                            if (loadAnimator != null) {
                                t21Var = new t21(loadAnimator);
                                t21Var2 = t21Var;
                            }
                        } catch (RuntimeException e2) {
                            if (equals) {
                                throw e2;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                            if (loadAnimation2 != null) {
                                t21Var2 = new t21(i, loadAnimation2);
                            }
                        }
                    }
                }
            }
        }
        this.e = t21Var2;
        this.d = true;
        return t21Var2;
    }
}
