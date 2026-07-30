package com.baidu.platform.comapi.bmsdk.animation;

import com.baidu.platform.comapi.bmsdk.b;

/* loaded from: classes2.dex */
public class BmTranslateAnimation extends BmAnimation {

    /* renamed from: a, reason: collision with root package name */
    private double f8934a;

    /* renamed from: b, reason: collision with root package name */
    private double f8935b;

    /* renamed from: c, reason: collision with root package name */
    private double f8936c;

    /* renamed from: d, reason: collision with root package name */
    private double f8937d;

    public BmTranslateAnimation(b bVar, b bVar2) {
        super(82, nativeCreate());
        double d8 = bVar.f8938a;
        this.f8934a = d8;
        double d9 = bVar2.f8938a;
        this.f8935b = d9;
        double d10 = bVar.f8939b;
        this.f8936c = d10;
        double d11 = bVar2.f8939b;
        this.f8937d = d11;
        nativeBuildAnimation(this.nativeInstance, d8, d9, d10, d11);
    }

    private static native boolean nativeBuildAnimation(long j8, double d8, double d9, double d10, double d11);

    private static native long nativeCreate();
}
