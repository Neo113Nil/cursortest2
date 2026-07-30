package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class h extends Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f4066e;

    public /* synthetic */ h(l lVar, int i2) {
        this.f4065d = i2;
        this.f4066e = lVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f4065d) {
            case 0:
                l lVar = this.f4066e;
                int abs = !lVar.mUsingCustomStart ? lVar.mSpinnerOffsetEnd - Math.abs(lVar.mOriginalOffsetTop) : lVar.mSpinnerOffsetEnd;
                lVar.setTargetOffsetTopAndBottom((lVar.mFrom + ((int) ((abs - r1) * f7))) - lVar.mCircleView.getTop());
                e eVar = lVar.mProgress;
                float f8 = 1.0f - f7;
                d dVar = eVar.f4054d;
                if (f8 != dVar.f4045p) {
                    dVar.f4045p = f8;
                }
                eVar.invalidateSelf();
                break;
            case 1:
                l lVar2 = this.f4066e;
                float f9 = lVar2.mStartingScale;
                lVar2.setAnimationProgress(((-f9) * f7) + f9);
                lVar2.moveToStart(f7);
                break;
            case 2:
                this.f4066e.setAnimationProgress(f7);
                break;
            case 3:
                this.f4066e.setAnimationProgress(1.0f - f7);
                break;
            default:
                this.f4066e.moveToStart(f7);
                break;
        }
    }
}
