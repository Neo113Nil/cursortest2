package com.baidu.platform.comapi.bmsdk.animation;

/* loaded from: classes2.dex */
public class BmScaleAnimation extends BmAnimation {

    /* renamed from: a, reason: collision with root package name */
    private float f8930a;

    /* renamed from: b, reason: collision with root package name */
    private float f8931b;

    /* renamed from: c, reason: collision with root package name */
    private float f8932c;

    /* renamed from: d, reason: collision with root package name */
    private float f8933d;

    public BmScaleAnimation(float f8, float f9, float f10, float f11) {
        super(81, nativeCreate());
        this.f8930a = f8;
        this.f8931b = f9;
        this.f8932c = f10;
        this.f8933d = f11;
        nativeBuildAnimation(this.nativeInstance, f8, f9, f10, f11);
    }

    private static native boolean nativeBuildAnimation(long j8, float f8, float f9, float f10, float f11);

    private static native long nativeCreate();

    public BmScaleAnimation(float f8, float f9) {
        super(81, nativeCreate());
        this.f8930a = f8;
        this.f8931b = f9;
        this.f8932c = f8;
        this.f8933d = f9;
        nativeBuildAnimation(this.nativeInstance, f8, f9, f8, f9);
    }
}
