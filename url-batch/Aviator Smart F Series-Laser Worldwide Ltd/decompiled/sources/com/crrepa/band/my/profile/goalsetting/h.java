package com.crrepa.band.my.profile.goalsetting;

import android.content.Context;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.NumberPickerModel;
import com.crrepa.band.my.model.db.GoalsSetting;
import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.band.my.model.user.provider.UserGoalsSettingProvider;
import com.crrepa.band.my.profile.goalsetting.model.UserGoalStepsChengeEvent;
import com.crrepa.ble.conn.bean.CRPDailyGoalsInfo;
import com.crrepa.ble.conn.bean.CRPTrainingDayInfo;

/* loaded from: classes2.dex */
public class h implements com.moyoung.dafit.module.common.baseui.f {
    private i view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getGoalsSettingList() {
        GoalsSetting goalsSetting = GoalsSettingDaoProxy.getInstance().get();
        NumberPickerModel numberPickerModel = new NumberPickerModel(2000, UserGoalsSettingProvider.MAX_GOAL_STEPS, 1000);
        this.view.renderGoalSteps(numberPickerModel, UserGoalsSettingProvider.getGoalStepsPosition(goalsSetting.getDailySteps().intValue()));
        NumberPickerModel numberPickerModel2 = new NumberPickerModel(100, 2000, 10);
        this.view.renderGoalCalories(numberPickerModel2, UserGoalsSettingProvider.getGoalCaloriesPosition(goalsSetting.getDailyCalories().intValue()));
        NumberPickerModel numberPickerModel3 = new NumberPickerModel(0, 3, 1);
        int intValue = goalsSetting.getDailyMinutes().intValue();
        int i8 = intValue / 60;
        this.view.renderGoalTrainingHour(numberPickerModel3, UserGoalsSettingProvider.getGoalTrainingHourPosition(i8));
        updateGoalTrainingMinute(i8, intValue % 60, true);
        this.view.renderTrainingGoalsState(goalsSetting.getTrainingDayEnable().booleanValue());
        this.view.renderTrainingGoalSteps(numberPickerModel, UserGoalsSettingProvider.getGoalStepsPosition(goalsSetting.getTrainingSteps().intValue()));
        this.view.renderTrainingGoalCalories(numberPickerModel2, UserGoalsSettingProvider.getGoalCaloriesPosition(goalsSetting.getTrainingCalories().intValue()));
        int intValue2 = goalsSetting.getTrainingMinutes().intValue();
        int i9 = intValue2 / 60;
        this.view.renderTrainingGoalTrainingHour(numberPickerModel3, UserGoalsSettingProvider.getGoalTrainingHourPosition(i9));
        updateGoalTrainingMinute(i9, intValue2 % 60, false);
        this.view.renderTrainingDay(v0.b.toRepeatArray(goalsSetting.getTrainingDays().intValue()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveDailyGoals(Context context, GoalsSetting goalsSetting) {
        com.orhanobut.logger.f.d("saveDailyGoals: " + goalsSetting);
        GoalsSettingDaoProxy.getInstance().insert(goalsSetting);
        i4 i4Var = i4.getInstance();
        i4Var.sendDailyGoals(new CRPDailyGoalsInfo(goalsSetting.getDailySteps().intValue(), goalsSetting.getDailyCalories().intValue(), goalsSetting.getDailyMinutes().intValue()));
        i4Var.sendTrainingDayGoals(new CRPDailyGoalsInfo(goalsSetting.getTrainingSteps().intValue(), goalsSetting.getTrainingCalories().intValue(), goalsSetting.getTrainingMinutes().intValue()));
        i4Var.sendTrainingDays(new CRPTrainingDayInfo(goalsSetting.getTrainingDayEnable().booleanValue(), goalsSetting.getTrainingDays().byteValue()));
        org.greenrobot.eventbus.c.getDefault().post(new UserGoalStepsChengeEvent(GoalsSettingDaoProxy.getInstance().getTodayGoalSteps()));
        m1.a.showStepsNotification(context);
    }

    public void setView(i iVar) {
        this.view = iVar;
    }

    public void updateGoalTrainingMinute(int i8, int i9, boolean z7) {
        int i10;
        if (i8 == 0) {
            i10 = 10;
        } else {
            r0 = i8 == 3 ? 0 : 55;
            i10 = 0;
        }
        NumberPickerModel numberPickerModel = new NumberPickerModel(i10, r0, 5);
        int goalTrainingMinutePosition = UserGoalsSettingProvider.getGoalTrainingMinutePosition(i8, i9);
        if (z7) {
            this.view.renderGoalTrainingMinute(numberPickerModel, goalTrainingMinutePosition);
        } else {
            this.view.renderTrainingGoalTrainingMinute(numberPickerModel, goalTrainingMinutePosition);
        }
    }
}
