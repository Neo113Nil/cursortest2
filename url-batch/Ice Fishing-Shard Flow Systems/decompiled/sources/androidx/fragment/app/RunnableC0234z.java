package androidx.fragment.app;

import I.ViewTreeObserverOnPreDrawListenerC0126w;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0234z extends AnimationSet implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f3827d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3828e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3829i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3830l;

    public RunnableC0234z(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.f3830l = true;
        this.f3827d = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f3830l = true;
        if (this.f3828e) {
            return !this.f3829i;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f3828e = true;
            ViewTreeObserverOnPreDrawListenerC0126w.a(this.f3827d, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7 = this.f3828e;
        ViewGroup viewGroup = this.f3827d;
        if (z7 || !this.f3830l) {
            viewGroup.endViewTransition(null);
            this.f3829i = true;
        } else {
            this.f3830l = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f7) {
        this.f3830l = true;
        if (this.f3828e) {
            return !this.f3829i;
        }
        if (!super.getTransformation(j, transformation, f7)) {
            this.f3828e = true;
            ViewTreeObserverOnPreDrawListenerC0126w.a(this.f3827d, this);
        }
        return true;
    }
}
