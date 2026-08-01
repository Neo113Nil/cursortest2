package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class x extends AnimationSet implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f572f;

    /* renamed from: g, reason: collision with root package name */
    public final View f573g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f574h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f575j;

    public x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f575j = true;
        this.f572f = viewGroup;
        this.f573g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation) {
        this.f575j = true;
        if (this.f574h) {
            return !this.i;
        }
        if (!super.getTransformation(j4, transformation)) {
            this.f574h = true;
            n0.p.a(this.f572f, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f574h;
        ViewGroup viewGroup = this.f572f;
        if (z3 || !this.f575j) {
            viewGroup.endViewTransition(this.f573g);
            this.i = true;
        } else {
            this.f575j = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation, float f2) {
        this.f575j = true;
        if (this.f574h) {
            return !this.i;
        }
        if (!super.getTransformation(j4, transformation, f2)) {
            this.f574h = true;
            n0.p.a(this.f572f, this);
        }
        return true;
    }
}
