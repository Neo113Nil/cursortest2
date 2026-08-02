package e;

import a.AbstractC0132a;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: classes.dex */
public final class c extends AbstractC0132a {

    /* renamed from: j, reason: collision with root package name */
    public final ObjectAnimator f2151j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2152k;

    public c(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        super(23);
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i2 = z2 ? numberOfFrames - 1 : 0;
        int i3 = z2 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f2154b = numberOfFrames2;
        int[] iArr = dVar.f2153a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f2153a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f2153a;
        int i4 = 0;
        for (int i5 = 0; i5 < numberOfFrames2; i5++) {
            int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i5) - 1 : i5);
            iArr2[i5] = duration;
            i4 += duration;
        }
        dVar.f2155c = i4;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(dVar.f2155c);
        ofInt.setInterpolator(dVar);
        this.f2152k = z3;
        this.f2151j = ofInt;
    }

    @Override // a.AbstractC0132a
    public final void C() {
        this.f2151j.reverse();
    }

    @Override // a.AbstractC0132a
    public final void M() {
        this.f2151j.start();
    }

    @Override // a.AbstractC0132a
    public final void O() {
        this.f2151j.cancel();
    }

    @Override // a.AbstractC0132a
    public final boolean g() {
        return this.f2152k;
    }
}
