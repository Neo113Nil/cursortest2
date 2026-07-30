package com.crrepa.ble.conn.callback;

import com.crrepa.ble.conn.bean.CRPDailyGoalsInfo;
import com.crrepa.ble.conn.bean.CRPTrainingDayInfo;

/* loaded from: classes3.dex */
public interface CRPTrainingDayGoalsCallback {
    void onTrainingDayGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo);

    void onTrainingDays(CRPTrainingDayInfo cRPTrainingDayInfo);
}
