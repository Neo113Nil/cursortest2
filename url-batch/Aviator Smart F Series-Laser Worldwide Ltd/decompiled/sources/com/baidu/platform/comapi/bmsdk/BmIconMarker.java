package com.baidu.platform.comapi.bmsdk;

import android.util.Log;
import com.baidu.mapapi.map.Marker;
import com.baidu.platform.comapi.bmsdk.style.BmDrawableResource;

/* loaded from: classes2.dex */
public class BmIconMarker extends BmBaseMarker {

    /* renamed from: w, reason: collision with root package name */
    private int f8899w;

    /* renamed from: x, reason: collision with root package name */
    private BmDrawableResource f8900x;

    /* renamed from: y, reason: collision with root package name */
    private Marker f8901y;

    public BmIconMarker() {
        super(4, nativeCreate());
        this.f8899w = 0;
    }

    private static native long nativeCreate();

    private static native boolean nativeSetAnimationType(long j8, int i8);

    private static native boolean nativeSetBmpResId(long j8, int i8);

    private static native boolean nativeSetColor(long j8, int i8);

    private static native boolean nativeSetDrawableResource(long j8, long j9);

    public void a(Marker marker) {
        this.f8901y = marker;
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmDrawItem, com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() {
        super.close();
        try {
            BmDrawableResource bmDrawableResource = this.f8900x;
            if (bmDrawableResource != null) {
                bmDrawableResource.close();
            }
        } catch (Exception unused) {
            Log.e("BmBitmapResource", "BmBitmapResource close failed");
        }
    }

    public Marker d() {
        return this.f8901y;
    }

    public boolean o(int i8) {
        return nativeSetAnimationType(getNativeInstance(), i8);
    }

    public boolean a(BmDrawableResource bmDrawableResource) {
        if (bmDrawableResource == null) {
            return false;
        }
        BmDrawableResource bmDrawableResource2 = this.f8900x;
        if (bmDrawableResource2 != null && bmDrawableResource2.getNativeInstance() != bmDrawableResource.getNativeInstance()) {
            try {
                this.f8900x.close();
            } catch (Exception unused) {
                Log.e("BmBitmapResource", "BmBitmapResource close failed");
            }
        }
        this.f8900x = bmDrawableResource;
        this.f8899w = 0;
        return nativeSetDrawableResource(getNativeInstance(), this.f8900x.getNativeInstance());
    }
}
