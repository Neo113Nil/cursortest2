package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.band.my.profile.goalsetting.model.UserGoalStepsChengeEvent;
import com.crrepa.ble.conn.bean.CRPDailyGoalsInfo;
import com.crrepa.ble.conn.bean.CRPTrainingDayInfo;
import com.crrepa.ble.conn.callback.CRPTrainingDayGoalsCallback;

/* loaded from: classes2.dex */
public class r implements CRPTrainingDayGoalsCallback {
    @Override // com.crrepa.ble.conn.callback.CRPTrainingDayGoalsCallback
    public void onTrainingDayGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        GoalsSettingDaoProxy.getInstance().saveTrainingGoals(cRPDailyGoalsInfo);
        org.greenrobot.eventbus.c.getDefault().post(new UserGoalStepsChengeEvent(GoalsSettingDaoProxy.getInstance().getTodayGoalSteps()));
        m1.a.showStepsNotification(com.moyoung.dafit.module.common.utils.d.get());
    }

    @Override // com.crrepa.ble.conn.callback.CRPTrainingDayGoalsCallback
    public void onTrainingDays(CRPTrainingDayInfo cRPTrainingDayInfo) {
        if (cRPTrainingDayInfo != null) {
            GoalsSettingDaoProxy.getInstance().saveTrainingDays(cRPTrainingDayInfo.isEnable(), cRPTrainingDayInfo.getTrainingDays());
        }
    }
}
