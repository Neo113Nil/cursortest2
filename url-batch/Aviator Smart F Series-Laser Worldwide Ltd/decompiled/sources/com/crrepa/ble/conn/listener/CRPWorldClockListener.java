package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPSupportWorldClockInfo;
import com.crrepa.ble.conn.bean.CRPWorldClockInfo;

/* loaded from: classes3.dex */
public interface CRPWorldClockListener {
    void onSupportWorldClock(CRPSupportWorldClockInfo cRPSupportWorldClockInfo);

    void onWorldClock(CRPWorldClockInfo cRPWorldClockInfo);
}
