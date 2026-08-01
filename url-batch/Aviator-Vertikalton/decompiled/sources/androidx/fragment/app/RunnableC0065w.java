package androidx.fragment.app;

import K.ViewTreeObserverOnPreDrawListenerC0028y;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0065w extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1426a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1427b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1428c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1429d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1430e;

    public RunnableC0065w(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1430e = true;
        this.f1426a = viewGroup;
        this.f1427b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1430e = true;
        if (this.f1428c) {
            return !this.f1429d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1428c = true;
            ViewTreeObserverOnPreDrawListenerC0028y.a(this.f1426a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1428c;
        ViewGroup viewGroup = this.f1426a;
        if (z2 || !this.f1430e) {
            viewGroup.endViewTransition(this.f1427b);
            this.f1429d = true;
        } else {
            this.f1430e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1430e = true;
        if (this.f1428c) {
            return !this.f1429d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1428c = true;
            ViewTreeObserverOnPreDrawListenerC0028y.a(this.f1426a, this);
        }
        return true;
    }
}
