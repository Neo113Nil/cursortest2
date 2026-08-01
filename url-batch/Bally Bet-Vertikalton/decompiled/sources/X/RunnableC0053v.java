package X;

import K.ViewTreeObserverOnPreDrawListenerC0020u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: X.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0053v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1003a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1004b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1005c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1006e;

    public RunnableC0053v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1006e = true;
        this.f1003a = viewGroup;
        this.f1004b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1006e = true;
        if (this.f1005c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1005c = true;
            ViewTreeObserverOnPreDrawListenerC0020u.a(this.f1003a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1005c;
        ViewGroup viewGroup = this.f1003a;
        if (z2 || !this.f1006e) {
            viewGroup.endViewTransition(this.f1004b);
            this.d = true;
        } else {
            this.f1006e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1006e = true;
        if (this.f1005c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1005c = true;
            ViewTreeObserverOnPreDrawListenerC0020u.a(this.f1003a, this);
        }
        return true;
    }
}
