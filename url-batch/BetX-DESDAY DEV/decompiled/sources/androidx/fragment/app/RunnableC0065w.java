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
    public final ViewGroup f1427a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1428b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1429c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1430d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1431e;

    public RunnableC0065w(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1431e = true;
        this.f1427a = viewGroup;
        this.f1428b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1431e = true;
        if (this.f1429c) {
            return !this.f1430d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1429c = true;
            ViewTreeObserverOnPreDrawListenerC0028y.a(this.f1427a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1429c;
        ViewGroup viewGroup = this.f1427a;
        if (z2 || !this.f1431e) {
            viewGroup.endViewTransition(this.f1428b);
            this.f1430d = true;
        } else {
            this.f1431e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1431e = true;
        if (this.f1429c) {
            return !this.f1430d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1429c = true;
            ViewTreeObserverOnPreDrawListenerC0028y.a(this.f1427a, this);
        }
        return true;
    }
}
