package com.baidu.platform.comapi.bmsdk.ui;

import com.baidu.platform.comapi.bmsdk.BmObject;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;

/* loaded from: classes2.dex */
public class BmRichView extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private int f8987a;

    /* renamed from: b, reason: collision with root package name */
    private int f8988b;

    /* renamed from: c, reason: collision with root package name */
    private BmAnimation f8989c;

    /* renamed from: d, reason: collision with root package name */
    private float f8990d;

    /* renamed from: e, reason: collision with root package name */
    private float f8991e;

    /* renamed from: f, reason: collision with root package name */
    private float f8992f;

    /* renamed from: g, reason: collision with root package name */
    private String f8993g;

    /* renamed from: h, reason: collision with root package name */
    private BmBaseUI f8994h;

    public BmRichView() {
        super(30, nativeCreate());
        this.f8987a = 1;
        this.f8988b = 2;
        this.f8989c = null;
        this.f8990d = 1.0f;
        this.f8991e = 1.0f;
        this.f8992f = 1.0f;
        this.f8993g = "";
        this.f8994h = null;
    }

    private static native boolean nativeAddRichUIOption(long j8, long j9);

    private static native boolean nativeBuildRichViewByString(String str);

    private static native boolean nativeBuildRichViewByTemplete(String str);

    private static native long nativeCreate();

    private static native boolean nativeDelRichUIOption(long j8, long j9);

    private static native boolean nativeSetAnimation(long j8, long j9);

    private static native boolean nativeSetCollisionBehavior(long j8, int i8);

    private static native boolean nativeSetCollisionBorder(long j8, int i8, int i9, int i10, int i11);

    private static native boolean nativeSetCollisionLineTagId(long j8, int i8);

    private static native boolean nativeSetCollisionPriority(long j8, int i8);

    private static native boolean nativeSetCollisionPriority(long j8, short s7);

    private static native boolean nativeSetDrawFullscreenMaskFlag(long j8, boolean z7);

    private static native boolean nativeSetLocated(long j8, int i8);

    private static native boolean nativeSetOffsetX(long j8, int i8, int i9);

    private static native boolean nativeSetOffsetY(long j8, int i8, int i9);

    private static native boolean nativeSetOpacity(long j8, float f8);

    private static native boolean nativeSetScale(long j8, float f8);

    private static native boolean nativeSetScaleX(long j8, float f8);

    private static native boolean nativeSetScaleY(long j8, float f8);

    private static native boolean nativeSetShowLevel(long j8, int i8, int i9);

    private static native boolean nativeSetView(long j8, long j9);

    private static native boolean nativeSetVisibility(long j8, int i8);

    public boolean a(BmBaseUI bmBaseUI) {
        this.f8994h = bmBaseUI;
        return nativeSetView(this.nativeInstance, (bmBaseUI != null ? Long.valueOf(bmBaseUI.getNativeInstance()) : null).longValue());
    }

    public boolean b(int i8) {
        this.f8988b = i8;
        return nativeSetLocated(this.nativeInstance, i8);
    }

    public boolean c(int i8) {
        this.f8987a = i8;
        return nativeSetVisibility(this.nativeInstance, i8);
    }

    public BmBaseUI a(long j8) {
        BmBaseUI bmBaseUI = this.f8994h;
        if (bmBaseUI != null) {
            return bmBaseUI.a(j8);
        }
        return null;
    }

    public boolean b(float f8) {
        this.f8991e = f8;
        return nativeSetScaleX(this.nativeInstance, f8);
    }

    public boolean c(float f8) {
        this.f8992f = f8;
        return nativeSetScaleY(this.nativeInstance, f8);
    }

    public boolean a(int i8, int i9) {
        return nativeSetShowLevel(this.nativeInstance, i8, i9);
    }

    public boolean a(int i8) {
        return nativeSetCollisionBehavior(this.nativeInstance, i8);
    }

    public boolean a(short s7) {
        return nativeSetCollisionPriority(this.nativeInstance, (int) s7);
    }

    public boolean a(BmAnimation bmAnimation) {
        this.f8989c = bmAnimation;
        return nativeSetAnimation(this.nativeInstance, bmAnimation == null ? 0L : bmAnimation.getNativeInstance());
    }

    public boolean a(float f8) {
        this.f8991e = f8;
        this.f8992f = f8;
        return nativeSetScale(this.nativeInstance, f8);
    }
}
