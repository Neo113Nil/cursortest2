package com.baidu.platform.comapi.bmsdk.style;

import android.util.Log;
import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes2.dex */
public class BmLineStyle extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private int f8950a;

    /* renamed from: b, reason: collision with root package name */
    private int f8951b;

    /* renamed from: c, reason: collision with root package name */
    private int f8952c;

    /* renamed from: d, reason: collision with root package name */
    private BmBitmapResource f8953d;

    /* renamed from: e, reason: collision with root package name */
    private float f8954e;

    /* renamed from: f, reason: collision with root package name */
    private int f8955f;

    /* renamed from: g, reason: collision with root package name */
    private int f8956g;

    /* renamed from: h, reason: collision with root package name */
    private int f8957h;

    /* renamed from: i, reason: collision with root package name */
    private int f8958i;

    public BmLineStyle() {
        super(51, nativeCreate());
        this.f8950a = 0;
        this.f8951b = 0;
        this.f8952c = 0;
        this.f8953d = null;
        this.f8954e = 0.0f;
        this.f8955f = 0;
        this.f8956g = 0;
        this.f8957h = 0;
        this.f8958i = 0;
    }

    private static native boolean nativeClearBitmapResource(long j8);

    private static native long nativeCreate();

    private static native boolean nativeSetBitmapResource(long j8, long j9);

    private static native boolean nativeSetBmpResId(long j8, int i8);

    private static native boolean nativeSetColor(long j8, int i8);

    private static native boolean nativeSetLineResId(long j8, int i8);

    private static native boolean nativeSetLineType(long j8, int i8);

    private static native boolean nativeSetStrokeColor(long j8, int i8);

    private static native boolean nativeSetStrokeWidth(long j8, int i8);

    private static native boolean nativeSetTextureOption(long j8, int i8);

    private static native boolean nativeSetWidth(long j8, float f8);

    public boolean a(int i8) {
        this.f8952c = i8;
        return nativeSetColor(getNativeInstance(), a.a(i8));
    }

    public boolean b(int i8) {
        this.f8958i = i8;
        return nativeSetLineType(getNativeInstance(), i8);
    }

    public boolean c(int i8) {
        this.f8957h = i8;
        return nativeSetTextureOption(getNativeInstance(), i8);
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() {
        super.close();
        BmBitmapResource bmBitmapResource = this.f8953d;
        if (bmBitmapResource != null) {
            try {
                bmBitmapResource.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
            this.f8953d = null;
        }
    }

    public boolean a(BmBitmapResource bmBitmapResource) {
        if (bmBitmapResource == null) {
            return false;
        }
        BmBitmapResource bmBitmapResource2 = this.f8953d;
        if (bmBitmapResource2 != null && bmBitmapResource2.getNativeInstance() != bmBitmapResource.getNativeInstance()) {
            try {
                this.f8953d.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
        }
        this.f8953d = bmBitmapResource;
        this.f8951b = 0;
        this.f8950a = 0;
        return nativeSetBitmapResource(getNativeInstance(), bmBitmapResource.getNativeInstance());
    }

    public boolean a() {
        if (this.f8953d == null) {
            return true;
        }
        this.f8953d = null;
        return nativeClearBitmapResource(this.nativeInstance);
    }

    public boolean a(float f8) {
        this.f8954e = f8 / 2.0f;
        return nativeSetWidth(getNativeInstance(), this.f8954e);
    }
}
