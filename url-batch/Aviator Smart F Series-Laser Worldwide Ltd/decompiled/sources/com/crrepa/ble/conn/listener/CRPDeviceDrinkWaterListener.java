package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPNewDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPWaterIntakeInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPDeviceDrinkWaterListener {
    void onDeleteWaterIntake(CRPWaterIntakeInfo.WaterIntakeType waterIntakeType, int i8);

    void onDrinkWaterGoals(int i8);

    void onDrinkWaterPeriod(CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo);

    void onNewDrinkWaterPeriod(CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo);

    void onTodayWaterIntake(int i8);

    void onTodayWaterIntakeHistoryChange(List<CRPWaterIntakeInfo> list);

    void onWaterIntakeChange(CRPWaterIntakeInfo cRPWaterIntakeInfo);

    void requestWaterIntakeHistory();
}
