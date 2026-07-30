package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;

/* loaded from: classes3.dex */
public interface CRPScreenOffClockListener {
    void onPeriodTime(CRPPeriodTimeInfo cRPPeriodTimeInfo);

    void onScreenOffClockState(boolean z7);
}
