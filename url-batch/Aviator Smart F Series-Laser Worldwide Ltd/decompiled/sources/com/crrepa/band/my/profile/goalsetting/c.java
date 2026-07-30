package com.crrepa.band.my.profile.goalsetting;

import android.content.Context;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.band.my.model.user.provider.UserGoalsSettingProvider;
import com.crrepa.band.my.profile.goalsetting.model.UserGoalStepsChengeEvent;

/* loaded from: classes2.dex */
public class c implements com.moyoung.dafit.module.common.baseui.f {
    private int currentGoalSteps = GoalsSettingDaoProxy.getInstance().getTodayGoalSteps();
    private a view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getGoalStepsList() {
        this.view.renderGoalStepData(UserGoalsSettingProvider.getGoalStepsList(), UserGoalsSettingProvider.getGoalStepsPosition(this.currentGoalSteps));
    }

    public void getRecommendSteps() {
        this.view.renderRecommendSteps(UserGoalsSettingProvider.getRecommendSteps());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveUserGoalSteps(Context context, int i8) {
        if (this.currentGoalSteps == i8) {
            return;
        }
        com.orhanobut.logger.f.d("saveUserGoalSteps: " + i8);
        GoalsSettingDaoProxy.getInstance().insert(i8);
        org.greenrobot.eventbus.c.getDefault().post(new UserGoalStepsChengeEvent(i8));
        i4.getInstance().sendGoalSteps(i8);
        m1.a.showStepsNotification(context);
    }

    public void setView(a aVar) {
        this.view = aVar;
    }
}
