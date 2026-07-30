package com.baidu.platform.comapi.bmsdk.animation;

/* loaded from: classes2.dex */
public class BmRotateAnimation extends BmAnimation {

    /* renamed from: a, reason: collision with root package name */
    private float f8928a;

    /* renamed from: b, reason: collision with root package name */
    private float f8929b;

    public BmRotateAnimation(float f8, float f9) {
        super(84, nativeCreate());
        this.f8928a = f8;
        this.f8929b = f9;
        nativeBuildAnimation(this.nativeInstance, f8, f9);
    }

    private static native boolean nativeBuildAnimation(long j8, float f8, float f9);

    private static native long nativeCreate();
}
