package e3;

import android.content.Context;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.moyoung.dafit.module.common.baseui.f;

/* loaded from: classes2.dex */
public class d implements f {
    private g3.c view;
    private final com.crrepa.band.my.health.water.util.a waterManager = com.crrepa.band.my.health.water.util.a.getInstance();
    private boolean isOpenWaterReminder = false;
    private boolean isNotificationEnable = true;
    private boolean is12HourTime = false;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    public void getIntakeGoal(boolean z7) {
        this.view.showIntakeGoal(true, this.waterManager.getAutoCalculationGoalMl(null, false));
        this.view.showIntakeGoal(false, WaterProvider.getSettingGoalArray()[0]);
        this.view.showHideAutoCalculate(z7);
    }

    public void getReminderData(Context context) {
        this.view.showHideHourType(this.is12HourTime);
        int[] startTime = WaterProvider.getStartTime();
        this.view.showStartingTime(i3.a.getHourType(startTime[0]), startTime[0], startTime[1]);
        this.view.showReminderTimes(WaterProvider.getReminderTimes());
        this.view.showIntervalTime(WaterProvider.getIntervalTime());
        this.view.showAppPromptSettings(WaterProvider.getAppPromptTip(context));
        this.view.showHideReminder(this.isOpenWaterReminder);
    }

    public void getSettingData(Context context) {
        this.isOpenWaterReminder = WaterProvider.getReminderSwitchStatus();
        this.is12HourTime = BandTimeSystemProvider.is12HourTime();
        getReminderData(context);
        getIntakeGoal(WaterProvider.getCalculationSwitchStatus());
    }

    public boolean is12HourTime() {
        return this.is12HourTime;
    }

    public boolean isNotificationEnable() {
        return this.isNotificationEnable;
    }

    public boolean isOpenWaterReminder() {
        return this.isOpenWaterReminder;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveAppPromptTip(String str, Context context) {
        WaterProvider.saveAppPromptTip(str, context);
    }

    public void saveCalendarDays(int i8, Context context) {
        WaterProvider.saveCalendarDays(i8);
    }

    public void saveIntervalTime(int i8, Context context) {
        WaterProvider.saveIntervalTime(i8);
    }

    public void saveReminderTimes(int i8, Context context) {
        WaterProvider.saveReminderTimes(i8);
    }

    public void saveStartTime(int[] iArr, Context context) {
        WaterProvider.saveStartTime(iArr);
    }

    public void setNotificationEnable(boolean z7) {
        if (this.isNotificationEnable != z7) {
            this.isNotificationEnable = z7;
            com.orhanobut.logger.f.d("water ==> notification permission change : " + z7);
        }
    }

    public void setOpenWaterReminder(boolean z7, Context context) {
        this.isOpenWaterReminder = z7;
        WaterProvider.saveReminderSwitchStatus(z7);
    }

    public void setView(g3.c cVar) {
        this.view = cVar;
    }

    public void updateStartTime(int[] iArr) {
        boolean is12HourTime = BandTimeSystemProvider.is12HourTime();
        this.is12HourTime = is12HourTime;
        this.view.showHideHourType(is12HourTime);
        this.view.showStartingTime(iArr[0], iArr[1], iArr[2]);
    }
}
