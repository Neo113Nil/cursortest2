package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpx {
    public final BadgeFrameLayout a;
    public final dpb b;
    public efu c;
    public Animator d = null;
    public dkq e;
    private dpn f;

    public dpx(BadgeFrameLayout badgeFrameLayout, dpb dpbVar) {
        this.a = badgeFrameLayout;
        dpbVar.e();
        this.b = dpbVar;
    }

    private final Drawable b(dpn dpnVar) {
        if (dpnVar == null) {
            return null;
        }
        Drawable drawable = dpnVar.a;
        if (drawable != null) {
            return drawable;
        }
        dqg dqgVar = dpnVar.b;
        if (dqgVar == null) {
            return null;
        }
        return (Drawable) dqgVar.a.a(this.b.getContext());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable, java.lang.Object] */
    public final void a(dpn dpnVar, boolean z) {
        ObjectAnimator ofInt;
        fao.c();
        if (Objects.equals(this.f, dpnVar)) {
            return;
        }
        final Drawable b = b(this.f);
        this.f = dpnVar;
        final Drawable b2 = b(dpnVar);
        if (b == null) {
            ofInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 0.0f, 1.0f);
            ofInt.addListener(new dpv(this, b2));
        } else if (this.f == null) {
            ofInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 1.0f, 0.0f);
            ofInt.addListener(new dpw(this));
        } else {
            ?? r2 = new LayerDrawable(b, b2) { // from class: com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder$AlphaLayerDrawable
                private final Drawable a;
                private final Drawable b;

                {
                    super(new Drawable[]{b, b2});
                    this.a = b;
                    this.b = b2;
                    b2.setCallback(this);
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public int getAlpha() {
                    return this.b.getAlpha();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return this.a.getOpacity();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
                public final void invalidateDrawable(Drawable drawable) {
                    invalidateSelf();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                    scheduleSelf(runnable, j);
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public void setAlpha(int i) {
                    Drawable drawable = this.b;
                    drawable.setAlpha(i);
                    drawable.invalidateSelf();
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.a.setColorFilter(colorFilter);
                }

                @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                    unscheduleSelf(runnable);
                }
            };
            ofInt = ObjectAnimator.ofInt((Object) r2, "alpha", 0, 255);
            ofInt.addListener(new dpu(this, r2, b2));
        }
        ofInt.setDuration(z ? this.b.getResources().getInteger(R.integer.og_decoration_transition_duration) : 0L);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addListener(new dpt(this, dpnVar));
        Animator animator = this.d;
        if (animator != null) {
            animator.end();
        }
        this.d = ofInt;
        ofInt.start();
    }
}
