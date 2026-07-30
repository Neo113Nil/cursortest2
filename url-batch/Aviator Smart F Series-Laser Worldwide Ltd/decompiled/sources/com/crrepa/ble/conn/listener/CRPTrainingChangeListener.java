package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPHistoryTrainingInfo;
import com.crrepa.ble.conn.bean.CRPPerformanceInsightsInfo;
import com.crrepa.ble.conn.bean.CRPTrainingInfo;
import com.crrepa.ble.conn.bean.CRPTrainingRealtimeInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPTrainingChangeListener {
    void onHistoryTrainingChange(List<CRPHistoryTrainingInfo> list);

    void onPerformanceInsightsChange(CRPPerformanceInsightsInfo cRPPerformanceInsightsInfo);

    void onRealtimeTrainingChange(CRPTrainingRealtimeInfo cRPTrainingRealtimeInfo);

    void onTrainingChange(CRPTrainingInfo cRPTrainingInfo);
}
