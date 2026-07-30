package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle;

import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import java.io.File;

/* loaded from: classes2.dex */
public interface d extends b {
    void renderColorRadioBtn(int i8);

    void renderEditState(boolean z7);

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    /* synthetic */ void renderLabelColor(int i8);

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    /* synthetic */ void renderLabelContent(int i8, int i9, int i10);

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    /* synthetic */ void renderLabelXY(int i8, int i9, int i10, int i11);

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    /* bridge */ /* synthetic */ void renderPointerPreviewImg(File file);

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    /* synthetic */ void showPointerLabel(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo, float f8);

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.b
    /* synthetic */ void showPointerLabel(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo, int i8, float f8);
}
