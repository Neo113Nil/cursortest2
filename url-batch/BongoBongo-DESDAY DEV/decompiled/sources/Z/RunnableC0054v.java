package Z;

import L.ViewTreeObserverOnPreDrawListenerC0022u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: Z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0054v extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1213a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1214b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1215c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1216e;

    public RunnableC0054v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1216e = true;
        this.f1213a = viewGroup;
        this.f1214b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1216e = true;
        if (this.f1215c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1215c = true;
            ViewTreeObserverOnPreDrawListenerC0022u.a(this.f1213a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1215c;
        ViewGroup viewGroup = this.f1213a;
        if (z2 || !this.f1216e) {
            viewGroup.endViewTransition(this.f1214b);
            this.d = true;
        } else {
            this.f1216e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1216e = true;
        if (this.f1215c) {
            return !this.d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1215c = true;
            ViewTreeObserverOnPreDrawListenerC0022u.a(this.f1213a, this);
        }
        return true;
    }
}
