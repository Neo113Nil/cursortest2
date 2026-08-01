package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class x extends AnimationSet implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f678f;

    /* renamed from: g, reason: collision with root package name */
    public final View f679g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f680j;

    public x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f680j = true;
        this.f678f = viewGroup;
        this.f679g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f680j = true;
        if (this.h) {
            return !this.i;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.h = true;
            n0.r.a(this.f678f, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.h;
        ViewGroup viewGroup = this.f678f;
        if (z4 || !this.f680j) {
            viewGroup.endViewTransition(this.f679g);
            this.i = true;
        } else {
            this.f680j = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f5) {
        this.f680j = true;
        if (this.h) {
            return !this.i;
        }
        if (!super.getTransformation(j2, transformation, f5)) {
            this.h = true;
            n0.r.a(this.f678f, this);
        }
        return true;
    }
}
