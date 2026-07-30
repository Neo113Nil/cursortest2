package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle;

import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import java.io.File;

/* loaded from: classes2.dex */
public interface b {
    void renderLabelColor(int i8);

    void renderLabelContent(int i8, int i9, int i10);

    void renderLabelXY(int i8, int i9, int i10, int i11);

    void renderPointerPreviewImg(File file);

    void showPointerLabel(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo, float f8);

    void showPointerLabel(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo, int i8, float f8);
}
