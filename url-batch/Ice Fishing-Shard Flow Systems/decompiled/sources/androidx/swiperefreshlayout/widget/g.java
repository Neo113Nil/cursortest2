package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class g extends Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4063e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f4064i;

    public g(l lVar, int i2, int i5) {
        this.f4064i = lVar;
        this.f4062d = i2;
        this.f4063e = i5;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        this.f4064i.mProgress.setAlpha((int) (((this.f4063e - r0) * f7) + this.f4062d));
    }
}
