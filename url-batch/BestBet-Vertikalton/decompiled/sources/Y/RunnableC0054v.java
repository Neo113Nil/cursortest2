package Y;

import K.ViewTreeObserverOnPreDrawListenerC0022s;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: Y.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0054v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1492a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1493b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1494c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1495e;

    public RunnableC0054v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1495e = true;
        this.f1492a = viewGroup;
        this.f1493b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1495e = true;
        if (this.f1494c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1494c = true;
            ViewTreeObserverOnPreDrawListenerC0022s.a(this.f1492a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1494c;
        ViewGroup viewGroup = this.f1492a;
        if (z2 || !this.f1495e) {
            viewGroup.endViewTransition(this.f1493b);
            this.d = true;
        } else {
            this.f1495e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1495e = true;
        if (this.f1494c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1494c = true;
            ViewTreeObserverOnPreDrawListenerC0022s.a(this.f1492a, this);
        }
        return true;
    }
}
