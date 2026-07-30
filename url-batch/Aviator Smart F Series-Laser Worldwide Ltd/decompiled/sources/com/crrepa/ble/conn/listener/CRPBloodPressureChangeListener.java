package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPBloodPressureInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBloodPressureInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPBloodPressureChangeListener {
    void onBloodPressureChange(int i8, int i9);

    void onContinueBloodPressure(CRPBloodPressureInfo cRPBloodPressureInfo);

    void onContinueState(boolean z7);

    void onHistoryBloodPressure(List<CRPHistoryBloodPressureInfo> list);
}
