package Y;

import K.ViewTreeObserverOnPreDrawListenerC0022u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: Y.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0055v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1132a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1133b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1134c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1135e;

    public RunnableC0055v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1135e = true;
        this.f1132a = viewGroup;
        this.f1133b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1135e = true;
        if (this.f1134c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1134c = true;
            ViewTreeObserverOnPreDrawListenerC0022u.a(this.f1132a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1134c;
        ViewGroup viewGroup = this.f1132a;
        if (z2 || !this.f1135e) {
            viewGroup.endViewTransition(this.f1133b);
            this.d = true;
        } else {
            this.f1135e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1135e = true;
        if (this.f1134c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1134c = true;
            ViewTreeObserverOnPreDrawListenerC0022u.a(this.f1132a, this);
        }
        return true;
    }
}
