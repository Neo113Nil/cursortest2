package Z;

import M.ViewTreeObserverOnPreDrawListenerC0022s;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: Z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0057v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1641a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1642b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1643c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1644d;
    public boolean e;

    public RunnableC0057v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.e = true;
        this.f1641a = viewGroup;
        this.f1642b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.e = true;
        if (this.f1643c) {
            return !this.f1644d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f1643c = true;
            ViewTreeObserverOnPreDrawListenerC0022s.a(this.f1641a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1643c;
        ViewGroup viewGroup = this.f1641a;
        if (z2 || !this.e) {
            viewGroup.endViewTransition(this.f1642b);
            this.f1644d = true;
        } else {
            this.e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f2) {
        this.e = true;
        if (this.f1643c) {
            return !this.f1644d;
        }
        if (!super.getTransformation(j, transformation, f2)) {
            this.f1643c = true;
            ViewTreeObserverOnPreDrawListenerC0022s.a(this.f1641a, this);
        }
        return true;
    }
}
