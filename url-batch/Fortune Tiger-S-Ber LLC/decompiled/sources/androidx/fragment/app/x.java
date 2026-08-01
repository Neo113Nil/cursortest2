package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class x extends AnimationSet implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f552f;
    public final View g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f553i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f554j;

    public x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f554j = true;
        this.f552f = viewGroup;
        this.g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation) {
        this.f554j = true;
        if (this.h) {
            return !this.f553i;
        }
        if (!super.getTransformation(j4, transformation)) {
            this.h = true;
            k0.o.a(this.f552f, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.h;
        ViewGroup viewGroup = this.f552f;
        if (z3 || !this.f554j) {
            viewGroup.endViewTransition(this.g);
            this.f553i = true;
        } else {
            this.f554j = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation, float f4) {
        this.f554j = true;
        if (this.h) {
            return !this.f553i;
        }
        if (!super.getTransformation(j4, transformation, f4)) {
            this.h = true;
            k0.o.a(this.f552f, this);
        }
        return true;
    }
}
