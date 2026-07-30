package com.baidu.mapapi.map;

/* loaded from: classes2.dex */
public class HeatMapAnimation {

    /* renamed from: a, reason: collision with root package name */
    private int f5869a;

    /* renamed from: b, reason: collision with root package name */
    private AnimationType f5870b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5871c;

    public enum AnimationType {
        Linear,
        InQuad,
        OutQuad,
        InOutQuad,
        OutInQuad,
        InCubic,
        OutCubic,
        InOutCubic,
        OutInCubic,
        InQuart,
        OutQuart,
        InOutQuart,
        OutInQuart,
        InQuint,
        OutQuint,
        InOutQuint,
        OutInQuint,
        InSine,
        OutSine,
        InOutSine,
        OutInSine,
        InExpo,
        OutExpo,
        InOutExpo,
        OutInExpo,
        InCirc,
        OutCirc,
        InOutCirc,
        OutInCirc,
        InElastic,
        OutElastic,
        InOutElastic,
        OutInElastic,
        InBack,
        OutBack,
        InOutBack,
        OutInBack,
        InBounce,
        OutBounce,
        InOutBounce,
        OutInBounce,
        InCurve,
        OutCurve,
        SineCurve,
        CosineCurve
    }

    public HeatMapAnimation(boolean z7, int i8, AnimationType animationType) {
        this.f5869a = 100;
        this.f5870b = AnimationType.Linear;
        if (i8 >= 0) {
            this.f5869a = i8;
        }
        this.f5870b = animationType;
        this.f5871c = z7;
    }

    public int getAnimationType() {
        return this.f5870b.ordinal();
    }

    public int getDuration() {
        return this.f5869a;
    }

    public boolean getIsAnimation() {
        return this.f5871c;
    }

    public void setAnimation(boolean z7) {
        this.f5871c = z7;
    }

    public void setAnimationType(AnimationType animationType) {
        this.f5870b = animationType;
    }

    public void setDuration(int i8) {
        this.f5869a = i8;
    }
}
