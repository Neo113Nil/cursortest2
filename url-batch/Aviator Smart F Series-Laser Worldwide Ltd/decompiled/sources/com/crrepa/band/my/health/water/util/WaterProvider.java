package com.crrepa.band.my.health.water.util;

import a1.c;
import android.content.Context;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.ota.BandUpgradeActivity;
import com.crrepa.band.my.device.ota.restore.RestoreFirmwareActivity;
import com.crrepa.band.my.device.watchface.StoreWatchFaceDetailActivity;
import com.crrepa.band.my.device.watchface.WatchFaceEditActivity;
import com.crrepa.band.my.health.water.model.BandWaterConnectChangeEvent;
import com.crrepa.band.my.health.water.model.WaterConst;
import com.crrepa.band.my.health.water.service.WaterReminderService;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.band.my.training.map.GoogleMapTrainingActivity;
import com.crrepa.band.my.training.map.NoMapTrainingActivity;
import com.crrepa.ble.conn.bean.CRPDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPNewDrinkWaterPeriodInfo;
import com.google.gson.Gson;
import com.moyoung.classes.coach.playing.CoachCoursePlayingActivity;
import com.moyoung.classes.db.ClassesHistory;
import com.moyoung.classes.meditation.localclass.LocalClassPlayActivity;
import com.moyoung.classes.meditation.onlineclass.OnlineClassPlayActivity;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.u0;
import com.orhanobut.logger.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class WaterProvider {
    public static final int DEFAULT_CALENDAR_DAYS = 30;
    public static final int DEFAULT_INTERVAL_TIME = 90;
    public static final int DEFAULT_START_TIME_INDEX = 8;
    public static final int DEFAULT_TIMES = 8;
    public static WaterConnectStatus WATER_STATUS = WaterConnectStatus.NO_CONNECT;

    public enum WaterConnectStatus {
        NO_CONNECT,
        CONNECT_OLD,
        CONNECT_NEW
    }

    public static String getAppPromptTip(Context context) {
        return g.getInstance().getString(BaseParamNames.WATER_APP_PROMPT_TIP, context.getString(R.string.water_reminder_tip));
    }

    public static boolean getCalculationSwitchStatus() {
        return g.getInstance().getBoolean(BaseParamNames.WATER_CALCULATION_SWITCH_STATUS, false);
    }

    public static int getCalendarDays() {
        return g.getInstance().getInt(BaseParamNames.WATER_CALENDAR_DAYS, 30);
    }

    public static int getDefaultGoal() {
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            return 2000;
        }
        return u0.ml2Ozs(2000);
    }

    public static int getDefaultIntake() {
        return BandUnitSystemProvider.getUnitSystem() == 0 ? 125 : 5;
    }

    public static int getIntervalIntake() {
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            return 25;
        }
        return u0.ml2Ozs(25);
    }

    public static int getIntervalTime() {
        return g.getInstance().getInt(BaseParamNames.WATER_INTERVAL_TIME, 90);
    }

    public static int getMaxGoal() {
        return BandUnitSystemProvider.getUnitSystem() == 0 ? WaterConst.MAX_GOAL_ML : WaterConst.MAX_GOAL_OZ;
    }

    public static int getMaxIntake() {
        return BandUnitSystemProvider.getUnitSystem() == 0 ? 1500 : 60;
    }

    public static int getMinGoal() {
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            return 50;
        }
        return u0.ml2Ozs(50);
    }

    public static int getMinIntake() {
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            return 50;
        }
        return u0.ml2Ozs(50);
    }

    public static boolean getReminderSwitchStatus() {
        return g.getInstance().getBoolean(BaseParamNames.WATER_REMINDER_SWITCH_STATUS, false);
    }

    public static long[] getReminderTimeArray() {
        long intervalTime = getIntervalTime();
        int reminderTimes = getReminderTimes();
        int[] startTime = getStartTime();
        long time = i3.a.getTimeDate(startTime[0], startTime[1]).getTime();
        long[] jArr = new long[reminderTimes];
        for (int i8 = 1; i8 <= reminderTimes; i8++) {
            int i9 = i8 - 1;
            jArr[i9] = (i9 * intervalTime * 60000) + time;
        }
        return jArr;
    }

    public static int getReminderTimes() {
        return g.getInstance().getInt(BaseParamNames.WATER_REMINDER_TIMES, 8);
    }

    public static int getSettingGoal() {
        String string = g.getInstance().getString(BaseParamNames.WATER_SETTING_GOAL, null);
        int[] iArr = {2000, u0.ml2Ozs(2000)};
        if (!TextUtils.isEmpty(string)) {
            iArr = (int[]) new Gson().fromJson(string, int[].class);
        }
        return BandUnitSystemProvider.getUnitSystem() == 0 ? iArr[0] : iArr[1];
    }

    public static int[] getSettingGoalArray() {
        String string = g.getInstance().getString(BaseParamNames.WATER_SETTING_GOAL, null);
        return !TextUtils.isEmpty(string) ? (int[]) new Gson().fromJson(string, int[].class) : new int[]{2000, u0.ml2Ozs(2000)};
    }

    public static int[] getStartTime() {
        String string = g.getInstance().getString(BaseParamNames.WATER_START_TIME, null);
        return TextUtils.isEmpty(string) ? new int[]{8, 0} : (int[]) new Gson().fromJson(string, int[].class);
    }

    public static int getTodayTotalSportTime() {
        Date sameDayStartTime = m.getSameDayStartTime(new Date());
        List<GpsTraining> today = new GpsTrainingDaoProxy().getToday(sameDayStartTime);
        int length = d.get().getResources().getStringArray(R.array.training_names).length;
        int i8 = 0;
        int i9 = 0;
        for (GpsTraining gpsTraining : today) {
            if (gpsTraining != null && gpsTraining.getType().intValue() != 241 && gpsTraining.getTrainingType() != null && gpsTraining.getTrainingType().intValue() >= 0 && length > gpsTraining.getType().intValue()) {
                i9 += gpsTraining.getTrainingSeconds() == null ? 0 : gpsTraining.getTrainingSeconds().intValue();
            }
        }
        for (MovementHeartRate movementHeartRate : new MovementHeartRateDaoProxy().getTodayMovementHeartRate()) {
            if (movementHeartRate != null && !movementHeartRate.getRepeated().booleanValue() && movementHeartRate.getType() != null && movementHeartRate.getType().intValue() >= 0 && length > movementHeartRate.getType().intValue()) {
                i9 += movementHeartRate.getTrainingSeconds() == null ? 0 : movementHeartRate.getTrainingSeconds().intValue();
            }
        }
        int i10 = i9 / 60;
        Iterator<ClassesHistory> it = new com.moyoung.classes.db.d().getTodayList(sameDayStartTime).iterator();
        while (it.hasNext()) {
            i8 += it.next().getSpentTime();
        }
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(i8);
        f.d("water ==> getTodayTotalSportTime : ( " + i10 + " + " + minutes + " )");
        return i10 + minutes;
    }

    public static int getWaterGrade(int i8) {
        if (i8 == 100) {
            return 1;
        }
        return i8 < 50 ? 2 : 3;
    }

    public static List getWaterList() {
        ArrayList arrayList = new ArrayList();
        boolean z7 = BandUnitSystemProvider.getUnitSystem() == 0;
        int ml2Ozs = z7 ? 1500 : u0.ml2Ozs(1500);
        int intervalIntake = getIntervalIntake();
        for (int ml2Ozs2 = z7 ? 50 : u0.ml2Ozs(50); ml2Ozs2 <= ml2Ozs; ml2Ozs2 += intervalIntake) {
            arrayList.add(Integer.valueOf(ml2Ozs2));
        }
        return arrayList;
    }

    public static int getWaterPercentage(int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        return Math.round(((i8 * 1.0f) / i9) * 100.0f);
    }

    public static int getWaterPosition(Water water) {
        return BandUnitSystemProvider.getUnitSystem() == 0 ? (water.getIntakeMl().intValue() - 50) / getIntervalIntake() : (water.getIntakeOz().intValue() - u0.ml2Ozs(50)) / getIntervalIntake();
    }

    public static String getWaterUnit(Context context) {
        return context.getString(BandUnitSystemProvider.getUnitSystem() == 0 ? R.string.water_ml : R.string.water_oz);
    }

    public static String getWaterUnitText(Context context, int i8, int i9) {
        boolean z7 = BandUnitSystemProvider.getUnitSystem() == 0;
        String string = context.getString(z7 ? R.string.water_ml : R.string.water_oz);
        int i10 = z7 ? i8 : i9;
        if (i10 < 0) {
            i10 = z7 ? u0.oz2MlsAdd(i9) : u0.ml2OzsAdd(i8);
        }
        return i10 + string;
    }

    public static boolean isConnectWatch() {
        return WATER_STATUS != WaterConnectStatus.NO_CONNECT;
    }

    public static boolean isWaterReminderEnable() {
        List<String> classNameList = com.moyoung.dafit.module.common.baseui.a.getInstance().getClassNameList();
        String[] strArr = {GoogleMapTrainingActivity.class.getName(), NoMapTrainingActivity.class.getName(), CoachCoursePlayingActivity.class.getName(), OnlineClassPlayActivity.class.getName(), LocalClassPlayActivity.class.getName(), WatchFaceEditActivity.class.getName(), StoreWatchFaceDetailActivity.class.getName(), BandUpgradeActivity.class.getName(), RestoreFirmwareActivity.class.getName()};
        for (int i8 = 0; i8 < 9; i8++) {
            if (classNameList.contains(strArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public static boolean saveAppPromptTip(String str, Context context) {
        if (str.equals(getAppPromptTip(context))) {
            return false;
        }
        f.d("water ==> saveAppPromptTip: " + str);
        g.getInstance().putString(BaseParamNames.WATER_APP_PROMPT_TIP, str);
        return true;
    }

    public static void saveCalculationSwitchStatus(boolean z7) {
        if (z7 != getCalculationSwitchStatus()) {
            f.d("water ==> saveCalculationSwitchStatus: " + z7);
            g.getInstance().putBoolean(BaseParamNames.WATER_CALCULATION_SWITCH_STATUS, z7);
        }
    }

    public static boolean saveCalendarDays(int i8) {
        if (i8 == getCalendarDays()) {
            return false;
        }
        f.d("water ==> saveCalendarDays: " + i8);
        g.getInstance().putInt(BaseParamNames.WATER_CALENDAR_DAYS, i8);
        return true;
    }

    public static boolean saveIntervalTime(int i8) {
        if (i8 == getIntervalTime()) {
            return false;
        }
        f.d("water ==> saveIntervalTime: " + i8);
        g.getInstance().putInt(BaseParamNames.WATER_INTERVAL_TIME, i8);
        if (WaterReminderService.isStopService) {
            updateWaterReminderService(true);
        } else {
            WaterReminderService.isUpdateReminderTime = true;
        }
        if (isConnectWatch()) {
            if (WATER_STATUS == WaterConnectStatus.CONNECT_NEW) {
                CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo = new CRPNewDrinkWaterPeriodInfo();
                cRPNewDrinkWaterPeriodInfo.setPeriod(i8);
                a.getInstance().sendWaterReminderSettings(cRPNewDrinkWaterPeriodInfo);
            } else {
                CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo = new CRPDrinkWaterPeriodInfo();
                cRPDrinkWaterPeriodInfo.setPeriod(i8);
                a.getInstance().sendOldWaterReminderSettings(cRPDrinkWaterPeriodInfo);
            }
        }
        return true;
    }

    public static boolean saveReminderSwitchStatus(boolean z7) {
        if (z7 == getReminderSwitchStatus()) {
            return false;
        }
        f.d("water ==> saveReminderSwitchStatus: " + z7);
        g.getInstance().putBoolean(BaseParamNames.WATER_REMINDER_SWITCH_STATUS, z7);
        updateWaterReminderService(z7);
        if (!isConnectWatch()) {
            return true;
        }
        if (WATER_STATUS == WaterConnectStatus.CONNECT_NEW) {
            CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo = new CRPNewDrinkWaterPeriodInfo();
            cRPNewDrinkWaterPeriodInfo.setEnable(z7);
            a.getInstance().sendWaterReminderSettings(cRPNewDrinkWaterPeriodInfo);
            return true;
        }
        CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo = new CRPDrinkWaterPeriodInfo();
        cRPDrinkWaterPeriodInfo.setEnable(z7);
        a.getInstance().sendOldWaterReminderSettings(cRPDrinkWaterPeriodInfo);
        return true;
    }

    public static boolean saveReminderTimes(int i8) {
        if (i8 == getReminderTimes()) {
            return false;
        }
        f.d("water ==> saveReminderTimes: " + i8);
        g.getInstance().putInt(BaseParamNames.WATER_REMINDER_TIMES, i8);
        if (WaterReminderService.isStopService) {
            updateWaterReminderService(true);
        } else {
            WaterReminderService.isUpdateReminderTime = true;
        }
        if (isConnectWatch()) {
            if (WATER_STATUS == WaterConnectStatus.CONNECT_NEW) {
                CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo = new CRPNewDrinkWaterPeriodInfo();
                cRPNewDrinkWaterPeriodInfo.setCount(i8);
                a.getInstance().sendWaterReminderSettings(cRPNewDrinkWaterPeriodInfo);
            } else {
                CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo = new CRPDrinkWaterPeriodInfo();
                cRPDrinkWaterPeriodInfo.setCount(i8);
                a.getInstance().sendOldWaterReminderSettings(cRPDrinkWaterPeriodInfo);
            }
        }
        return true;
    }

    public static void saveSettingGoal(int i8) {
        int[] iArr = new int[2];
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            iArr[0] = i8;
            iArr[1] = u0.ml2Ozs(i8);
        } else {
            iArr[1] = i8;
            iArr[0] = u0.oz2Mls(i8);
        }
        f.d("water ==> saveSettingGoal: " + iArr[0] + "ml / " + iArr[1] + "oz");
        g.getInstance().putString(BaseParamNames.WATER_SETTING_GOAL, s.bean2Json(iArr));
    }

    public static boolean saveStartTime(int[] iArr) {
        int i8 = iArr[1];
        int i9 = iArr[2];
        int[] startTime = getStartTime();
        if (i8 == startTime[0] && i9 == startTime[1]) {
            return false;
        }
        f.d("water ==> saveStartTime: " + i8 + ":" + i9);
        g.getInstance().putString(BaseParamNames.WATER_START_TIME, s.bean2Json(new int[]{i8, i9}));
        if (WaterReminderService.isStopService) {
            updateWaterReminderService(true);
        } else {
            WaterReminderService.isUpdateReminderTime = true;
        }
        if (isConnectWatch()) {
            if (WATER_STATUS == WaterConnectStatus.CONNECT_NEW) {
                CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo = new CRPNewDrinkWaterPeriodInfo();
                cRPNewDrinkWaterPeriodInfo.setStartHour(i8);
                cRPNewDrinkWaterPeriodInfo.setStartMinutes(i9);
                a.getInstance().sendWaterReminderSettings(cRPNewDrinkWaterPeriodInfo);
            } else {
                CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo = new CRPDrinkWaterPeriodInfo();
                cRPDrinkWaterPeriodInfo.setStartHour(i8);
                cRPDrinkWaterPeriodInfo.setStartMinute(i9);
                a.getInstance().sendOldWaterReminderSettings(cRPDrinkWaterPeriodInfo);
            }
        }
        return true;
    }

    public static void updateCalendar(boolean z7, Context context) {
        if (c.hasCalendarPermission(context)) {
            f.d("water ==> update calendar settings !");
            f3.a.deleteAllEvent(context);
            if (z7) {
                int[] startTime = getStartTime();
                f3.a.addAllEvent(context, getAppPromptTip(context), i3.a.getTimeDate(startTime[0], startTime[1]), getIntervalTime(), getReminderTimes(), getCalendarDays());
            }
        }
    }

    public static void updateWaterConnectStatus(WaterConnectStatus waterConnectStatus) {
        if (waterConnectStatus != WATER_STATUS) {
            f.d("water ==> WaterConnectStatus: " + waterConnectStatus);
            WATER_STATUS = waterConnectStatus;
            org.greenrobot.eventbus.c.getDefault().post(new BandWaterConnectChangeEvent());
            updateWaterReminderService(WATER_STATUS == WaterConnectStatus.NO_CONNECT);
        }
    }

    public static void updateWaterReminderService(boolean z7) {
        WaterReminderService.stop(d.get());
        if (!z7 || isConnectWatch() || !getReminderSwitchStatus() || com.moyoung.dafit.module.common.baseui.a.getInstance().getActivityCount() <= 0) {
            return;
        }
        WaterReminderService.start(d.get());
    }
}
