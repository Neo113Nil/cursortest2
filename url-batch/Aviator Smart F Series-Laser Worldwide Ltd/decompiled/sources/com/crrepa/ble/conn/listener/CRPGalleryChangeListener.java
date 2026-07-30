package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPGalleryInfo;

/* loaded from: classes3.dex */
public interface CRPGalleryChangeListener {
    public static final int TYPE_GALLERY_CLEAR = 1;
    public static final int TYPE_GALLERY_DELETE = 0;

    void onGalleryInfo(CRPGalleryInfo cRPGalleryInfo);

    void onResult(int i8, boolean z7);
}
