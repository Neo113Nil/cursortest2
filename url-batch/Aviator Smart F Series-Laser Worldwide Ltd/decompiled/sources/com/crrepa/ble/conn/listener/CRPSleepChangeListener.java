package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import com.crrepa.ble.conn.bean.CRPSleepInfo;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPSleepChangeListener {
    void onHistoryNapSleepChange(CRPHistoryDay cRPHistoryDay, List<CRPNapSleepInfo> list);

    void onHistorySleepChange(CRPHistoryDay cRPHistoryDay, CRPSleepInfo cRPSleepInfo);

    void onSleepChange(CRPSleepInfo cRPSleepInfo);
}
