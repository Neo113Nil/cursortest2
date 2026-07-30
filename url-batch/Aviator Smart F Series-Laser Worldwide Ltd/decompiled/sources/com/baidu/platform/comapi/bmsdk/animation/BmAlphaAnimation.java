package com.baidu.platform.comapi.bmsdk.animation;

/* loaded from: classes2.dex */
public class BmAlphaAnimation extends BmAnimation {

    /* renamed from: a, reason: collision with root package name */
    private float f8926a;

    /* renamed from: b, reason: collision with root package name */
    private float f8927b;

    public BmAlphaAnimation(float f8, float f9) {
        super(83, nativeCreate());
        this.f8926a = f8;
        this.f8927b = f9;
        nativeBuildAnimation(this.nativeInstance, f8, f9);
    }

    private static native boolean nativeBuildAnimation(long j8, float f8, float f9);

    private static native long nativeCreate();
}
