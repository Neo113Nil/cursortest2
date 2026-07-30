package com.baidu.platform.comapi.bmsdk.style;

import android.util.Log;
import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes2.dex */
public class BmSurfaceStyle extends BmObject {

    /* renamed from: a, reason: collision with root package name */
    private int f8959a;

    /* renamed from: b, reason: collision with root package name */
    private int f8960b;

    /* renamed from: c, reason: collision with root package name */
    private BmBitmapResource f8961c;

    public BmSurfaceStyle() {
        super(53, nativeCreate());
        this.f8959a = 0;
        this.f8960b = 0;
        this.f8961c = null;
    }

    private static native long nativeCreate();

    private static native boolean nativeSetBitmapResource(long j8, long j9);

    private static native boolean nativeSetBmpResId(long j8, int i8);

    private static native boolean nativeSetColor(long j8, int i8);

    public boolean a(int i8) {
        this.f8960b = i8;
        return nativeSetColor(getNativeInstance(), a.a(i8));
    }

    public boolean a(BmBitmapResource bmBitmapResource) {
        if (bmBitmapResource == null) {
            return false;
        }
        BmBitmapResource bmBitmapResource2 = this.f8961c;
        if (bmBitmapResource2 != null && bmBitmapResource2.getNativeInstance() != bmBitmapResource.getNativeInstance()) {
            try {
                this.f8961c.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
        }
        this.f8961c = bmBitmapResource;
        this.f8959a = 0;
        return nativeSetBitmapResource(getNativeInstance(), bmBitmapResource.getNativeInstance());
    }
}
