package com.crrepa.band.my.device.setting.quickresponse.model;

import com.crrepa.ble.conn.bean.CRPQuickResponsesDetailInfo;

/* loaded from: classes2.dex */
public class BandQuickResponseChangeEvent {
    private CRPQuickResponsesDetailInfo info;

    public BandQuickResponseChangeEvent(CRPQuickResponsesDetailInfo cRPQuickResponsesDetailInfo) {
        this.info = cRPQuickResponsesDetailInfo;
    }

    public CRPQuickResponsesDetailInfo getInfo() {
        return this.info;
    }
}
