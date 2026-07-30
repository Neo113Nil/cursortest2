package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPStepInfo;
import com.crrepa.ble.conn.type.CRPHistoryDay;

/* loaded from: classes3.dex */
public interface CRPStepChangeListener {
    void onHistoryStepChange(CRPHistoryDay cRPHistoryDay, CRPStepInfo cRPStepInfo);

    void onStepChange(CRPStepInfo cRPStepInfo);
}
