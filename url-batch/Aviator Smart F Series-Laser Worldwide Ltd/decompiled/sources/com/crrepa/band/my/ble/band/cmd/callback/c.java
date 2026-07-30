package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.band.my.model.user.provider.UserGoalsSettingProvider;
import com.crrepa.ble.conn.bean.CRPDailyGoalsInfo;
import com.crrepa.ble.conn.callback.CRPDailyGoalsCallback;

/* loaded from: classes2.dex */
public class c implements CRPDailyGoalsCallback {
    @Override // com.crrepa.ble.conn.callback.CRPDailyGoalsCallback
    public void onDailyGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        com.orhanobut.logger.f.d("onDailyGoals: " + cRPDailyGoalsInfo);
        UserGoalsSettingProvider.saveNewGoalsSetting(true);
        GoalsSettingDaoProxy.getInstance().saveDailyGoals(cRPDailyGoalsInfo);
        i4.getInstance().queryTrainingDayGoals(new r());
    }
}
