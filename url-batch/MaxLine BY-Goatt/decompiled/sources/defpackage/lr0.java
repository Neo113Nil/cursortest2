package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lr0 extends AnimationSet implements Runnable {
    public final ViewGroup m;
    public final View n;
    public boolean o;
    public boolean p;
    public boolean q;

    public lr0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.q = true;
        this.m = viewGroup;
        this.n = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.q = true;
        if (this.o) {
            return !this.p;
        }
        if (!super.getTransformation(j, transformation)) {
            this.o = true;
            gv1.a(this.m, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.o;
        ViewGroup viewGroup = this.m;
        if (z || !this.q) {
            viewGroup.endViewTransition(this.n);
            this.p = true;
        } else {
            this.q = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.q = true;
        if (this.o) {
            return !this.p;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.o = true;
            gv1.a(this.m, this);
        }
        return true;
    }
}
