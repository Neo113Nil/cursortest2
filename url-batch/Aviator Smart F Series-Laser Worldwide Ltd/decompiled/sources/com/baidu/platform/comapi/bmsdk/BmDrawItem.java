package com.baidu.platform.comapi.bmsdk;

import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;

/* loaded from: classes2.dex */
public abstract class BmDrawItem extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    protected int f8882a;

    /* renamed from: b, reason: collision with root package name */
    protected float f8883b;

    /* renamed from: c, reason: collision with root package name */
    protected String f8884c;

    /* renamed from: d, reason: collision with root package name */
    int f8885d;

    /* renamed from: e, reason: collision with root package name */
    private int f8886e;

    /* renamed from: f, reason: collision with root package name */
    private int f8887f;

    /* renamed from: g, reason: collision with root package name */
    long f8888g;

    /* renamed from: h, reason: collision with root package name */
    protected BmAnimation f8889h;

    private BmDrawItem() {
        super(2, 0L);
        this.f8882a = 1;
        this.f8883b = 1.0f;
        this.f8884c = "";
        this.f8886e = 4;
        this.f8887f = 22;
        this.f8888g = -1L;
        this.f8889h = null;
    }

    private static native boolean nativeSetAnimation(long j8, long j9);

    private static native boolean nativeSetClickable(long j8, boolean z7);

    private static native boolean nativeSetHoleClickable(long j8, boolean z7);

    private static native boolean nativeSetOpacity(long j8, float f8);

    private static native boolean nativeSetShowLevel(long j8, int i8, int i9);

    private static native boolean nativeSetVisibility(long j8, int i8);

    public long a() {
        return this.f8888g;
    }

    public int b() {
        return this.f8885d;
    }

    public boolean c(int i8) {
        this.f8882a = i8;
        return nativeSetVisibility(getNativeInstance(), i8);
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    public void d(int i8) {
        this.f8885d = i8;
    }

    public BmDrawItem(int i8, long j8) {
        super(i8, j8);
        this.f8882a = 1;
        this.f8883b = 1.0f;
        this.f8884c = "";
        this.f8886e = 4;
        this.f8887f = 22;
        this.f8888g = -1L;
        this.f8889h = null;
    }

    public void a(long j8) {
        this.f8888g = j8;
    }

    public boolean b(int i8) {
        return nativeSetShowLevel(this.nativeInstance, i8, this.f8887f);
    }

    public boolean a(int i8, int i9) {
        this.f8886e = i8;
        this.f8887f = i9;
        return nativeSetShowLevel(this.nativeInstance, i8, i9);
    }

    public boolean b(boolean z7) {
        return nativeSetHoleClickable(getNativeInstance(), z7);
    }

    public boolean a(int i8) {
        return nativeSetShowLevel(getNativeInstance(), this.f8886e, i8);
    }

    public boolean a(float f8) {
        this.f8883b = f8;
        return nativeSetOpacity(getNativeInstance(), f8);
    }

    public boolean a(boolean z7) {
        return nativeSetClickable(getNativeInstance(), z7);
    }

    public boolean a(BmAnimation bmAnimation) {
        this.f8889h = bmAnimation;
        return nativeSetAnimation(getNativeInstance(), bmAnimation == null ? 0L : bmAnimation.getNativeInstance());
    }
}
