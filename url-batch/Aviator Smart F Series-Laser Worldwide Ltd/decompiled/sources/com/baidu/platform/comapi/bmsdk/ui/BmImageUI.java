package com.baidu.platform.comapi.bmsdk.ui;

import com.baidu.platform.comapi.bmsdk.style.BmDrawableResource;
import com.baidu.platform.comapi.bmsdk.style.a;

/* loaded from: classes2.dex */
public class BmImageUI extends BmBaseUI {
    public BmImageUI() {
        super(34, nativeCreate());
    }

    private static native long nativeCreate();

    private static native boolean nativeSetBmpResId(long j8, int i8);

    private static native boolean nativeSetColor(long j8, int i8);

    private static native boolean nativeSetDrawableResource(long j8, long j9);

    private static native boolean nativeSetMaskResource(long j8, long j9);

    public boolean b(BmDrawableResource bmDrawableResource) {
        return bmDrawableResource != null ? nativeSetDrawableResource(this.nativeInstance, bmDrawableResource.getNativeInstance()) : nativeSetDrawableResource(this.nativeInstance, 0L);
    }

    public boolean c(BmDrawableResource bmDrawableResource) {
        return bmDrawableResource != null ? nativeSetMaskResource(this.nativeInstance, bmDrawableResource.getNativeInstance()) : nativeSetMaskResource(this.nativeInstance, 0L);
    }

    public boolean j(int i8) {
        return nativeSetColor(this.nativeInstance, a.a(i8));
    }
}
