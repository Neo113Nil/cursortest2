package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle;

import android.util.Log;
import com.crrepa.ble.conn.bean.CRPJieliPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceConfigInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.type.CRPWatchFaceType;

/* loaded from: classes2.dex */
public class t {
    private int labelContainerHeight;
    private final d view;
    private final CRPJieliPhotoWatchFaceInfo watchFaceInfo;
    private final CRPJieliWatchFaceLayoutInfo wfLayoutInfo;
    private final CRPJieliWatchFaceConfigInfo wfConfig = e.getJieliWatchFaceConfigInfo();
    private final int watchFaceWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
    private final int watchFaceHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();

    public t(d dVar, CRPWatchFaceType cRPWatchFaceType) {
        this.view = dVar;
        this.wfLayoutInfo = e.getJieliWatchFaceLayoutInfo(cRPWatchFaceType);
        this.watchFaceInfo = e.getJieliPhotoWatchFaceInfo(cRPWatchFaceType);
    }

    private int getDefaultLayoutMargin() {
        return 0;
    }

    private float getLabelAndLayoutInfoRatio() {
        int i8 = this.labelContainerHeight;
        if (i8 == 0) {
            return 1.0f;
        }
        return i8 / this.watchFaceHeight;
    }

    public CRPJieliPhotoWatchFaceInfo getJieliPhotoWatchFaceInfo() {
        return this.watchFaceInfo;
    }

    public int getLabelColor() {
        return this.wfLayoutInfo.getElementColor();
    }

    public int getLabelType(int i8) {
        return this.wfLayoutInfo.getElementArray()[i8].getType();
    }

    public CRPJieliWatchFaceLayoutInfo getLayoutInfo() {
        return this.wfLayoutInfo;
    }

    public int getSelectedHandId() {
        return this.watchFaceInfo.getWatchHandID();
    }

    public void showPointerLabel(int i8) {
        this.labelContainerHeight = i8;
        this.view.renderColorRadioBtn(this.wfLayoutInfo.getElementColor());
        Log.d("JieliWatchFaceLayoutInf", "1-" + this.wfLayoutInfo);
        this.view.showPointerLabel(this.wfLayoutInfo, getLabelAndLayoutInfoRatio());
    }

    public void updateLabelContent(int i8, int i9) {
        CRPJieliWatchFaceLayoutInfo.ElementBean elementBean = this.wfLayoutInfo.getElementArray()[i8];
        byte type = elementBean.getType();
        elementBean.setType((byte) i9);
        int x7 = elementBean.getX();
        int y7 = elementBean.getY();
        if (type == 7 && i9 != 7) {
            elementBean.setX(x7 + 12);
            elementBean.setY(y7 + 5);
        }
        if (type != 7 && i9 == 7) {
            elementBean.setX(x7 - 12);
            elementBean.setY(y7 - 5);
        }
        this.view.showPointerLabel(this.wfLayoutInfo, i8, getLabelAndLayoutInfoRatio());
    }

    public void updateLabelTextColor(int i8) {
        this.wfLayoutInfo.setElementColor(i8);
        this.view.renderLabelColor(i8);
    }

    public void updateLabelXY(int i8, int i9, int i10) {
        int labelAndLayoutInfoRatio = (int) (i9 / getLabelAndLayoutInfoRatio());
        int labelAndLayoutInfoRatio2 = (int) (i10 / getLabelAndLayoutInfoRatio());
        int defaultLayoutMargin = getDefaultLayoutMargin();
        if (labelAndLayoutInfoRatio < defaultLayoutMargin) {
            labelAndLayoutInfoRatio = defaultLayoutMargin;
        }
        if (labelAndLayoutInfoRatio2 < defaultLayoutMargin) {
            labelAndLayoutInfoRatio2 = defaultLayoutMargin;
        }
        int min = Math.min(labelAndLayoutInfoRatio, (this.watchFaceWidth - this.wfConfig.getTimeWidth()) - getDefaultLayoutMargin());
        Log.d("WatchFaceCustomLocation", "labelX = " + min + " labelY = " + labelAndLayoutInfoRatio2);
        this.wfLayoutInfo.getElementArray()[i8].setX(min);
        this.wfLayoutInfo.getElementArray()[i8].setY(labelAndLayoutInfoRatio2);
    }

    public void updateSelectedWatchHandId(int i8) {
        this.watchFaceInfo.setWatchHandID(i8);
    }
}
