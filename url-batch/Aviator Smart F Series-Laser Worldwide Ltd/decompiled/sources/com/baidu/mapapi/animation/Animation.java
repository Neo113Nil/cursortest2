package com.baidu.mapapi.animation;

import android.view.animation.Interpolator;
import com.baidu.mapsdkplatform.comapi.e.b;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;

/* loaded from: classes2.dex */
public abstract class Animation {

    /* renamed from: a, reason: collision with root package name */
    RepeatMode f5337a;

    /* renamed from: b, reason: collision with root package name */
    int f5338b;
    public b bdAnimation;
    public BmAnimation bmAnimation;

    /* renamed from: c, reason: collision with root package name */
    long f5339c;

    public interface AnimationListener {
        void onAnimationCancel();

        void onAnimationEnd();

        void onAnimationRepeat();

        void onAnimationStart();
    }

    public enum RepeatMode {
        RESTART,
        REVERSE
    }

    protected Animation() {
    }

    public abstract void cancel();

    public long getDuration() {
        return this.f5339c;
    }

    public int getRepeatCount() {
        return this.f5338b;
    }

    public RepeatMode getRepeatMode() {
        return this.f5337a;
    }

    public abstract void setAnimationListener(AnimationListener animationListener);

    public abstract void setDuration(long j8);

    public abstract void setInterpolator(Interpolator interpolator);
}
