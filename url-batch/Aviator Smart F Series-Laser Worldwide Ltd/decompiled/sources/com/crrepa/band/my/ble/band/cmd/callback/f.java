package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.band.my.model.user.provider.UserGoalsSettingProvider;
import com.crrepa.band.my.profile.goalsetting.model.UserGoalStepsChengeEvent;
import com.crrepa.ble.conn.callback.CRPDeviceGoalStepCallback;

/* loaded from: classes2.dex */
public class f implements CRPDeviceGoalStepCallback {
    @Override // com.crrepa.ble.conn.callback.CRPDeviceGoalStepCallback
    public void onGoalStep(int i8) {
        com.orhanobut.logger.f.d("onGoalStep: " + i8);
        if (UserGoalsSettingProvider.isValidGoalSteps(i8)) {
            GoalsSettingDaoProxy.getInstance().insert(i8);
            org.greenrobot.eventbus.c.getDefault().post(new UserGoalStepsChengeEvent(i8));
        }
    }
}
