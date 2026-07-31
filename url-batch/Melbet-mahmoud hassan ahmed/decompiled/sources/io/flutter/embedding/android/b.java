package io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

@Deprecated
/* loaded from: classes.dex */
public final class b implements v {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f17066a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView.ScaleType f17067b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17068c;

    /* renamed from: d, reason: collision with root package name */
    private C0070b f17069d;

    class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f17070a;

        a(Runnable runnable) {
            this.f17070a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f17070a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17070a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.b$b, reason: collision with other inner class name */
    public static class C0070b extends ImageView {
        public C0070b(Context context) {
            this(context, null, 0);
        }

        public C0070b(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
        }

        public void a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            a(drawable, ImageView.ScaleType.FIT_XY);
        }
    }

    public b(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500L);
    }

    public b(Drawable drawable, ImageView.ScaleType scaleType, long j7) {
        this.f17066a = drawable;
        this.f17067b = scaleType;
        this.f17068c = j7;
    }

    @Override // io.flutter.embedding.android.v
    public void a(Runnable runnable) {
        C0070b c0070b = this.f17069d;
        if (c0070b == null) {
            runnable.run();
        } else {
            c0070b.animate().alpha(0.0f).setDuration(this.f17068c).setListener(new a(runnable));
        }
    }

    @Override // io.flutter.embedding.android.v
    public /* synthetic */ boolean b() {
        return u.a(this);
    }

    @Override // io.flutter.embedding.android.v
    public View c(Context context, Bundle bundle) {
        C0070b c0070b = new C0070b(context);
        this.f17069d = c0070b;
        c0070b.a(this.f17066a, this.f17067b);
        return this.f17069d;
    }

    @Override // io.flutter.embedding.android.v
    public /* synthetic */ Bundle d() {
        return u.b(this);
    }
}
