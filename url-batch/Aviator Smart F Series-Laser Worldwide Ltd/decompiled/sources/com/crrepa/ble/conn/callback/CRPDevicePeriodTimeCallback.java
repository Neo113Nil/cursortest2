package com.crrepa.ble.conn.callback;

import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;

/* loaded from: classes3.dex */
public interface CRPDevicePeriodTimeCallback {
    public static final int DO_NOT_DISTRUB_TYPE = 1;
    public static final int QUICK_VIEW_TYPE = 2;

    void onPeriodTime(int i8, CRPPeriodTimeInfo cRPPeriodTimeInfo);
}
