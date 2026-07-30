package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPBloodOxygenInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBloodOxygenInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPBloodOxygenChangeListener {
    void onBloodOxygen(int i8);

    void onContinueBloodOxygen(CRPBloodOxygenInfo cRPBloodOxygenInfo);

    void onContinueState(boolean z7);

    void onHistoryBloodOxygen(List<CRPHistoryBloodOxygenInfo> list);

    void onTimingMeasure(int i8);
}
