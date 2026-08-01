package X;

import K.ViewTreeObserverOnPreDrawListenerC0019u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: X.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0051v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1086a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1087b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1088c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1089e;

    public RunnableC0051v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1089e = true;
        this.f1086a = viewGroup;
        this.f1087b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1089e = true;
        if (this.f1088c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1088c = true;
            ViewTreeObserverOnPreDrawListenerC0019u.a(this.f1086a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1088c;
        ViewGroup viewGroup = this.f1086a;
        if (z2 || !this.f1089e) {
            viewGroup.endViewTransition(this.f1087b);
            this.d = true;
        } else {
            this.f1089e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1089e = true;
        if (this.f1088c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1088c = true;
            ViewTreeObserverOnPreDrawListenerC0019u.a(this.f1086a, this);
        }
        return true;
    }
}
