package androidx.fragment.app;

import E.ViewTreeObserverOnPreDrawListenerC0017s;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class M extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f4762a;

    /* renamed from: b, reason: collision with root package name */
    public final View f4763b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4764c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4765d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4766e;

    public M(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f4766e = true;
        this.f4762a = viewGroup;
        this.f4763b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation) {
        this.f4766e = true;
        if (this.f4764c) {
            return !this.f4765d;
        }
        if (!super.getTransformation(j4, transformation)) {
            this.f4764c = true;
            ViewTreeObserverOnPreDrawListenerC0017s.a(this.f4762a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f4764c;
        ViewGroup viewGroup = this.f4762a;
        if (z || !this.f4766e) {
            viewGroup.endViewTransition(this.f4763b);
            this.f4765d = true;
        } else {
            this.f4766e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation, float f4) {
        this.f4766e = true;
        if (this.f4764c) {
            return !this.f4765d;
        }
        if (!super.getTransformation(j4, transformation, f4)) {
            this.f4764c = true;
            ViewTreeObserverOnPreDrawListenerC0017s.a(this.f4762a, this);
        }
        return true;
    }
}
