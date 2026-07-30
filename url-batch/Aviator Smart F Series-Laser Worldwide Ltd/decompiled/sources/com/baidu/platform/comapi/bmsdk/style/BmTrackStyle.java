package com.baidu.platform.comapi.bmsdk.style;

import android.util.Log;
import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes2.dex */
public class BmTrackStyle extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private int f8967a;

    /* renamed from: b, reason: collision with root package name */
    private int f8968b;

    /* renamed from: c, reason: collision with root package name */
    private BmBitmapResource f8969c;

    /* renamed from: d, reason: collision with root package name */
    private float f8970d;

    /* renamed from: e, reason: collision with root package name */
    private BmBitmapResource f8971e;

    /* renamed from: f, reason: collision with root package name */
    private float f8972f;

    /* renamed from: g, reason: collision with root package name */
    private int f8973g;

    public BmTrackStyle() {
        super(61, nativeCreate());
        this.f8967a = 0;
        this.f8968b = 0;
        this.f8969c = null;
        this.f8970d = 0.0f;
        this.f8971e = null;
        this.f8972f = 0.0f;
        this.f8973g = 0;
    }

    private static native long nativeCreate();

    private static native boolean nativeSetBitmapResource(long j8, long j9);

    private static native boolean nativeSetColor(long j8, int i8);

    private static native boolean nativeSetOpacity(long j8, float f8);

    private static native boolean nativeSetPaletteBitmapResource(long j8, long j9);

    private static native boolean nativeSetPaletteOpacity(long j8, float f8);

    private static native boolean nativeSetTrackType(long j8, int i8);

    private static native boolean nativeSetWidth(long j8, int i8);

    public boolean a(int i8) {
        this.f8973g = i8;
        return nativeSetColor(getNativeInstance(), a.a(this.f8973g));
    }

    public boolean b(int i8) {
        this.f8968b = i8;
        return nativeSetTrackType(getNativeInstance(), i8);
    }

    public boolean c(int i8) {
        this.f8967a = i8;
        return nativeSetWidth(getNativeInstance(), this.f8967a);
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() {
        super.close();
        BmBitmapResource bmBitmapResource = this.f8969c;
        if (bmBitmapResource != null) {
            try {
                bmBitmapResource.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
            this.f8969c = null;
        }
        BmBitmapResource bmBitmapResource2 = this.f8971e;
        if (bmBitmapResource2 != null) {
            try {
                bmBitmapResource2.close();
            } catch (Exception unused2) {
                Log.e("BmBitmapResource", "BmBitmapResource Palette close failed");
            }
            this.f8971e = null;
        }
    }

    public boolean a(BmBitmapResource bmBitmapResource) {
        if (bmBitmapResource == null) {
            return false;
        }
        BmBitmapResource bmBitmapResource2 = this.f8969c;
        if (bmBitmapResource2 != null && bmBitmapResource2.getNativeInstance() != bmBitmapResource.getNativeInstance()) {
            try {
                this.f8969c.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
        }
        this.f8969c = bmBitmapResource;
        return nativeSetBitmapResource(getNativeInstance(), bmBitmapResource.getNativeInstance());
    }

    public boolean b(BmBitmapResource bmBitmapResource) {
        if (bmBitmapResource == null) {
            return false;
        }
        BmBitmapResource bmBitmapResource2 = this.f8971e;
        if (bmBitmapResource2 != null && bmBitmapResource2.getNativeInstance() != bmBitmapResource.getNativeInstance()) {
            try {
                this.f8969c.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
        }
        this.f8971e = bmBitmapResource;
        return nativeSetPaletteBitmapResource(getNativeInstance(), bmBitmapResource.getNativeInstance());
    }

    public boolean a(float f8) {
        this.f8970d = f8;
        return nativeSetOpacity(getNativeInstance(), this.f8970d);
    }

    public boolean b(float f8) {
        this.f8972f = f8;
        return nativeSetPaletteOpacity(getNativeInstance(), this.f8972f);
    }
}
