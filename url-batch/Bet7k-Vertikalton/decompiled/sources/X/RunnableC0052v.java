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
    public final ViewGroup f1000a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1001b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1002c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1003e;

    public RunnableC0052v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1003e = true;
        this.f1000a = viewGroup;
        this.f1001b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1003e = true;
        if (this.f1002c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1002c = true;
            ViewTreeObserverOnPreDrawListenerC0020u.a(this.f1000a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1002c;
        ViewGroup viewGroup = this.f1000a;
        if (z2 || !this.f1003e) {
            viewGroup.endViewTransition(this.f1001b);
            this.d = true;
        } else {
            this.f1003e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1003e = true;
        if (this.f1002c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1002c = true;
            ViewTreeObserverOnPreDrawListenerC0020u.a(this.f1000a, this);
        }
        return true;
    }
}
