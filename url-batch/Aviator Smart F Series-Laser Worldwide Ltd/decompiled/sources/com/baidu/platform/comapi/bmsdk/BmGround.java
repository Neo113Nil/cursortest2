package com.baidu.platform.comapi.bmsdk;

import android.util.Log;
import com.baidu.mapapi.map.GroundOverlay;
import com.baidu.platform.comapi.bmsdk.style.BmDrawableResource;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class BmGround extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private BmDrawableResource f8897i;

    /* renamed from: j, reason: collision with root package name */
    private GroundOverlay f8898j;

    public BmGround() {
        super(22, nativeCreate());
    }

    private static native long nativeCreate();

    private static native boolean nativeSetAnchorX(long j8, float f8);

    private static native boolean nativeSetAnchorY(long j8, float f8);

    private static native boolean nativeSetDrawableResource(long j8, long j9);

    private static native boolean nativeSetHeight(long j8, double d8);

    private static native boolean nativeSetPosition(long j8, double d8, double d9, double d10);

    private static native boolean nativeSetWidth(long j8, double d8);

    public void a(GroundOverlay groundOverlay) {
        this.f8898j = groundOverlay;
    }

    public boolean b(double d8) {
        return nativeSetWidth(this.nativeInstance, d8);
    }

    public GroundOverlay c() {
        return this.f8898j;
    }

    @Override // com.baidu.platform.comapi.bmsdk.BmDrawItem, com.baidu.platform.comapi.bmsdk.BmObject, java.lang.AutoCloseable
    public void close() {
        super.close();
        try {
            BmDrawableResource bmDrawableResource = this.f8897i;
            if (bmDrawableResource != null) {
                bmDrawableResource.close();
            }
        } catch (Exception unused) {
            Log.e("BmBitmapResource", "BmBitmapResource close failed");
        }
    }

    public boolean a(b bVar) {
        if (bVar == null) {
            return false;
        }
        return nativeSetPosition(this.nativeInstance, bVar.f8938a, bVar.f8939b, i.DOUBLE_EPSILON);
    }

    public boolean b(float f8) {
        return nativeSetAnchorX(this.nativeInstance, f8);
    }

    public boolean c(float f8) {
        return nativeSetAnchorY(this.nativeInstance, f8);
    }

    public boolean a(double d8) {
        return nativeSetHeight(this.nativeInstance, d8);
    }

    public boolean a(BmDrawableResource bmDrawableResource) {
        try {
            BmDrawableResource bmDrawableResource2 = this.f8897i;
            if (bmDrawableResource2 != null) {
                bmDrawableResource2.close();
            }
        } catch (Exception unused) {
            Log.e("BmBitmapResource", "BmBitmapResource close failed");
        }
        this.f8897i = bmDrawableResource;
        if (bmDrawableResource != null) {
            return nativeSetDrawableResource(this.nativeInstance, bmDrawableResource.getNativeInstance());
        }
        return nativeSetDrawableResource(this.nativeInstance, 0L);
    }
}
