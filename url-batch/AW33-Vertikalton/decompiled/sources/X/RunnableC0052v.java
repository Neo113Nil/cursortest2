package X;

import K.ViewTreeObserverOnPreDrawListenerC0020u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: X.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0052v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f994a;

    /* renamed from: b, reason: collision with root package name */
    public final View f995b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f996c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f997e;

    public RunnableC0052v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f997e = true;
        this.f994a = viewGroup;
        this.f995b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f997e = true;
        if (this.f996c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f996c = true;
            ViewTreeObserverOnPreDrawListenerC0020u.a(this.f994a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f996c;
        ViewGroup viewGroup = this.f994a;
        if (z2 || !this.f997e) {
            viewGroup.endViewTransition(this.f995b);
            this.d = true;
        } else {
            this.f997e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f997e = true;
        if (this.f996c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f996c = true;
            ViewTreeObserverOnPreDrawListenerC0020u.a(this.f994a, this);
        }
        return true;
    }
}
