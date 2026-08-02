package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dpu extends AnimatorListenerAdapter {
    final /* synthetic */ DrawableBadgeViewHolder$AlphaLayerDrawable a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ dpx c;

    public dpu(dpx dpxVar, DrawableBadgeViewHolder$AlphaLayerDrawable drawableBadgeViewHolder$AlphaLayerDrawable, Drawable drawable) {
        this.a = drawableBadgeViewHolder$AlphaLayerDrawable;
        this.b = drawable;
        this.c = dpxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.b.g(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.b.g(this.a);
    }
}
