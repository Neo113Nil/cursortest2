package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPBreathRateInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBreathRateInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPBreathRateChangeListener {
    void onBreathRate(int i8);

    void onHistoryBreathRate(List<CRPHistoryBreathRateInfo> list);

    void onTimingBreathRate(CRPBreathRateInfo cRPBreathRateInfo);

    void onTimingBreathRateState(boolean z7);
}
