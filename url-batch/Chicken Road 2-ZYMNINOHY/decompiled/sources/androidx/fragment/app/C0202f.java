package androidx.fragment.app;

import a.AbstractC0124a;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.rockchicken.pump.up.road.R;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202f extends AbstractC0207k {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4830b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4831c;

    /* renamed from: d, reason: collision with root package name */
    public L f4832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0202f(B0 operation, boolean z) {
        super(operation);
        kotlin.jvm.internal.i.e(operation, "operation");
        this.f4830b = z;
    }

    public final L b(Context context) {
        Animation loadAnimation;
        L l4;
        if (this.f4831c) {
            return this.f4832d;
        }
        B0 b02 = this.f4893a;
        F f4 = b02.f4725c;
        boolean z = b02.f4723a == 2;
        int nextTransition = f4.getNextTransition();
        int popEnterAnim = this.f4830b ? z ? f4.getPopEnterAnim() : f4.getPopExitAnim() : z ? f4.getEnterAnim() : f4.getExitAnim();
        f4.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = f4.mContainer;
        L l5 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            f4.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = f4.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = f4.onCreateAnimation(nextTransition, z, popEnterAnim);
            if (onCreateAnimation != null) {
                l5 = new L(onCreateAnimation);
            } else {
                Animator onCreateAnimator = f4.onCreateAnimator(nextTransition, z, popEnterAnim);
                if (onCreateAnimator != null) {
                    l5 = new L(onCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? AbstractC0124a.Q(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0124a.Q(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? AbstractC0124a.Q(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0124a.Q(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e4) {
                                    throw e4;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    l4 = new L(loadAnimation);
                                    l5 = l4;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                            if (loadAnimator != null) {
                                l4 = new L(loadAnimator);
                                l5 = l4;
                            }
                        } catch (RuntimeException e5) {
                            if (equals) {
                                throw e5;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                            if (loadAnimation2 != null) {
                                l5 = new L(loadAnimation2);
                            }
                        }
                    }
                }
            }
        }
        this.f4832d = l5;
        this.f4831c = true;
        return l5;
    }
}
