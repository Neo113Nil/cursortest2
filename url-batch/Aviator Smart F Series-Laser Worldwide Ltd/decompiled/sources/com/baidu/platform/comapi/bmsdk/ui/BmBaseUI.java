package com.baidu.platform.comapi.bmsdk.ui;

import com.baidu.mapapi.map.bmsdk.ui.BaseUI;
import com.baidu.platform.comapi.bmsdk.BmObject;
import com.baidu.platform.comapi.bmsdk.style.BmDrawableResource;
import com.baidu.platform.comapi.bmsdk.style.a;

/* loaded from: classes2.dex */
public abstract class BmBaseUI extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private int f8978a;

    /* renamed from: b, reason: collision with root package name */
    private String f8979b;

    /* renamed from: c, reason: collision with root package name */
    private String f8980c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8981d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8982e;

    /* renamed from: f, reason: collision with root package name */
    private BaseUI f8983f;

    private BmBaseUI() {
        super(31, 0L);
        this.f8978a = 1;
        this.f8979b = "";
        this.f8980c = "";
        this.f8981d = false;
        this.f8982e = false;
    }

    private static native boolean nativeSetAlignParent(long j8, int i8);

    private static native boolean nativeSetBackground(long j8, long j9);

    private static native boolean nativeSetBackgroundColor(long j8, int i8);

    private static native boolean nativeSetBackgroundResId(long j8, int i8);

    private static native boolean nativeSetBkColorOfLeft(long j8, int i8);

    private static native boolean nativeSetBkColorOfRight(long j8, int i8);

    private static native boolean nativeSetClickable(long j8, boolean z7);

    private static native boolean nativeSetGravity(long j8, int i8);

    private static native boolean nativeSetHeight(long j8, int i8);

    private static native boolean nativeSetLayoutWeight(long j8, int i8);

    private static native boolean nativeSetMargin(long j8, int i8, int i9, int i10, int i11);

    private static native boolean nativeSetPadding(long j8, int i8, int i9, int i10, int i11);

    private static native boolean nativeSetVisibility(long j8, int i8);

    private static native boolean nativeSetWidth(long j8, int i8);

    public BaseUI a() {
        return this.f8983f;
    }

    public boolean b(int i8) {
        this.f8982e = i8 != 0;
        return nativeSetBackgroundColor(this.nativeInstance, a.a(i8));
    }

    public boolean c(int i8) {
        this.f8982e = i8 != 0;
        return nativeSetBkColorOfLeft(this.nativeInstance, a.a(i8));
    }

    public boolean d(int i8) {
        this.f8982e = i8 != 0;
        return nativeSetBkColorOfRight(this.nativeInstance, a.a(i8));
    }

    public boolean e(int i8) {
        return nativeSetGravity(this.nativeInstance, i8);
    }

    public boolean f(int i8) {
        return nativeSetHeight(this.nativeInstance, i8);
    }

    public boolean g(int i8) {
        return nativeSetLayoutWeight(this.nativeInstance, i8);
    }

    public boolean h(int i8) {
        this.f8978a = i8;
        return nativeSetVisibility(this.nativeInstance, i8);
    }

    public boolean i(int i8) {
        return nativeSetWidth(this.nativeInstance, i8);
    }

    public BmBaseUI(int i8, long j8) {
        super(i8, j8);
        this.f8978a = 1;
        this.f8979b = "";
        this.f8980c = "";
        this.f8981d = false;
        this.f8982e = false;
    }

    public BmBaseUI a(long j8) {
        if (this.nativeInstance == j8) {
            return this;
        }
        return null;
    }

    public boolean b(int i8, int i9, int i10, int i11) {
        return nativeSetPadding(this.nativeInstance, i8, i9, i10, i11);
    }

    public void a(BaseUI baseUI) {
        this.f8983f = baseUI;
    }

    public void a(String str) {
        this.f8979b = str;
    }

    public boolean a(BmDrawableResource bmDrawableResource) {
        this.f8981d = bmDrawableResource != null;
        if (bmDrawableResource != null) {
            return nativeSetBackground(this.nativeInstance, bmDrawableResource.getNativeInstance());
        }
        return nativeSetBackground(this.nativeInstance, 0L);
    }

    public boolean a(int i8) {
        return nativeSetAlignParent(this.nativeInstance, i8);
    }

    public boolean a(int i8, int i9, int i10, int i11) {
        return nativeSetMargin(this.nativeInstance, i8, i9, i10, i11);
    }

    public boolean a(boolean z7) {
        return nativeSetClickable(this.nativeInstance, z7);
    }
}
