package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.GoalsSetting;
import com.crrepa.band.my.model.db.greendao.GoalsSettingDao;
import com.crrepa.band.my.model.user.provider.UserGoalsSettingProvider;
import com.crrepa.ble.conn.bean.CRPDailyGoalsInfo;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;
import java.util.List;
import v0.b;

/* loaded from: classes2.dex */
public class GoalsSettingDaoProxy {
    private static final long DEFAULT_ID = 1;
    private GoalsSettingDao dao;

    private static class Holder {
        private static final GoalsSettingDaoProxy INSTANCE = new GoalsSettingDaoProxy();

        private Holder() {
        }
    }

    private GoalsSetting getDefaultGoalsSetting() {
        GoalsSetting goalsSetting = new GoalsSetting();
        goalsSetting.setTrainingDayEnable(Boolean.FALSE);
        goalsSetting.setTrainingDays(0);
        int goalSteps = UserGoalsSettingProvider.getGoalSteps();
        goalsSetting.setDailySteps(Integer.valueOf(goalSteps));
        goalsSetting.setTrainingSteps(Integer.valueOf(goalSteps));
        int recommendCalories = UserGoalsSettingProvider.getRecommendCalories();
        goalsSetting.setDailyCalories(Integer.valueOf(recommendCalories));
        goalsSetting.setTrainingCalories(Integer.valueOf(recommendCalories));
        int recommendTrainingTime = UserGoalsSettingProvider.getRecommendTrainingTime();
        goalsSetting.setDailyMinutes(Integer.valueOf(recommendTrainingTime));
        goalsSetting.setTrainingMinutes(Integer.valueOf(recommendTrainingTime));
        return goalsSetting;
    }

    public static GoalsSettingDaoProxy getInstance() {
        return Holder.INSTANCE;
    }

    private boolean isValidGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        return cRPDailyGoalsInfo != null && UserGoalsSettingProvider.isValidGoalSteps(cRPDailyGoalsInfo.getSteps()) && UserGoalsSettingProvider.isValidGoalCalories(cRPDailyGoalsInfo.getCalories()) && UserGoalsSettingProvider.isValidGoalTrainingTime(cRPDailyGoalsInfo.getTrainingTime());
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public GoalsSetting get() {
        List<Object> list = this.dao.queryBuilder().build().list();
        return (list == null || list.isEmpty()) ? getDefaultGoalsSetting() : (GoalsSetting) list.get(0);
    }

    public int getTodayGoalSteps() {
        GoalsSetting goalsSetting = get();
        return (goalsSetting.getTrainingDayEnable().booleanValue() && b.toRepeatArray(goalsSetting.getTrainingDays().intValue())[m.getDayOfWeek(new Date()) + (-1)]) ? goalsSetting.getTrainingSteps().intValue() : goalsSetting.getDailySteps().intValue();
    }

    public long insert(GoalsSetting goalsSetting) {
        goalsSetting.setId(1L);
        return this.dao.insertOrReplace(goalsSetting);
    }

    public void saveDailyGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        if (isValidGoals(cRPDailyGoalsInfo)) {
            GoalsSetting goalsSetting = get();
            goalsSetting.setDailySteps(Integer.valueOf(cRPDailyGoalsInfo.getSteps()));
            goalsSetting.setDailyCalories(Integer.valueOf(cRPDailyGoalsInfo.getCalories()));
            goalsSetting.setDailyMinutes(Integer.valueOf(cRPDailyGoalsInfo.getTrainingTime()));
            insert(goalsSetting);
        }
    }

    public long saveTrainingDays(boolean z7, int i8) {
        GoalsSetting goalsSetting = get();
        goalsSetting.setTrainingDayEnable(Boolean.valueOf(z7));
        goalsSetting.setTrainingDays(Integer.valueOf(i8));
        return insert(goalsSetting);
    }

    public void saveTrainingGoals(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        if (isValidGoals(cRPDailyGoalsInfo)) {
            GoalsSetting goalsSetting = get();
            goalsSetting.setTrainingSteps(Integer.valueOf(cRPDailyGoalsInfo.getSteps()));
            goalsSetting.setTrainingCalories(Integer.valueOf(cRPDailyGoalsInfo.getCalories()));
            goalsSetting.setTrainingMinutes(Integer.valueOf(cRPDailyGoalsInfo.getTrainingTime()));
            insert(goalsSetting);
        }
    }

    private GoalsSettingDaoProxy() {
        this.dao = c.getInstance().getDaoSession().getGoalsSettingDao();
    }

    public long insert(int i8) {
        GoalsSetting defaultGoalsSetting = getDefaultGoalsSetting();
        defaultGoalsSetting.setDailySteps(Integer.valueOf(i8));
        return insert(defaultGoalsSetting);
    }
}
