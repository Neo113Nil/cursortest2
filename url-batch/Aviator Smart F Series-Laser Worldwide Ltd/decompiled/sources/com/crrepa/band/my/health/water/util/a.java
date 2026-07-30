package com.crrepa.band.my.health.water.util;

import android.annotation.SuppressLint;
import cn.hutool.core.convert.impl.w1;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.health.water.model.WaterGoalChangeEvent;
import com.crrepa.band.my.health.water.model.WaterIntakeChangeEvent;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.proxy.WaterDaoProxy;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.crrepa.ble.conn.bean.CRPDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPNewDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPWaterIntakeInfo;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.u0;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class a {
    private static volatile a instance;
    private final WaterDaoProxy waterDaoProxy = new WaterDaoProxy();

    public static a getInstance() {
        if (instance == null) {
            synchronized (a.class) {
                try {
                    if (instance == null) {
                        instance = new a();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private float getSportTime(Water water) {
        if (water == null || water.getSportTime() == null) {
            return 0.0f;
        }
        return water.getSportTime().floatValue();
    }

    private float getWeight(Water water) {
        return (water == null || water.getWeight() == null) ? UserWeightProvider.getUserWeightKg() : water.getWeight().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSportTime$0(Integer num) {
        boolean isCreatedCalendarWater = this.waterDaoProxy.isCreatedCalendarWater(new Date());
        Water calendarWater = this.waterDaoProxy.getCalendarWater(new Date(), !isCreatedCalendarWater, 4);
        calendarWater.setSportTime(Float.valueOf(num.intValue()));
        if (!isCreatedCalendarWater) {
            this.waterDaoProxy.update(calendarWater);
        } else {
            if (!WaterProvider.getCalculationSwitchStatus() || calendarWater.getSportTime().floatValue() <= 30.0f) {
                return;
            }
            updateGoal(true, getAutoCalculationGoalMl(calendarWater, true), calendarWater);
        }
    }

    public Water createCalendarWater(Water water, int i8) {
        water.setIsGoal(true);
        if (water.getDate() == null) {
            water.setDate(new Date());
        }
        if (water.getTotalIntakeMl() == null && water.getTotalIntakeOz() == null) {
            water.setTotalIntakeMl(0);
            water.setTotalIntakeOz(0);
        }
        if (water.getSportTime() == null) {
            water.setSportTime(Float.valueOf(getSportTime(water)));
        }
        if (water.getWeight() == null) {
            water.setWeight(Float.valueOf(getWeight(water)));
        }
        if (water.getPercentage() == null) {
            water.setPercentage(0);
        }
        if (water.getGoalMl() == null && water.getGoalOz() == null) {
            int[] iArr = new int[2];
            if (WaterProvider.getCalculationSwitchStatus()) {
                int autoCalculationGoalMl = getAutoCalculationGoalMl(water, true);
                iArr[0] = autoCalculationGoalMl;
                iArr[1] = u0.ml2Ozs(autoCalculationGoalMl);
            } else {
                iArr = WaterProvider.getSettingGoalArray();
            }
            water.setGoalMl(Integer.valueOf(iArr[0]));
            water.setGoalOz(Integer.valueOf(iArr[1]));
        }
        if (water.getGrade() == null) {
            water.setGrade(0);
        }
        System.out.println("water ==> .... create CalendarWater : " + i8 + "; date : " + water.getDate());
        this.waterDaoProxy.insert(water);
        f.d("water ==> createCalendarWater: " + i8 + "; " + water.toGoalString());
        return water;
    }

    public void deleteWaterRecord(Water water, Water water2) {
        int i8 = -water.getIntakeMl().intValue();
        int i9 = -water.getIntakeOz().intValue();
        sendDeleteWaterRecord(water);
        this.waterDaoProxy.delete(water);
        updateCalendarWater(i8, i9, water2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getAutoCalculationGoalMl(Water water, boolean z7) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        if (water == null) {
            water = this.waterDaoProxy.getCalendarWater(new Date(), false, 11);
        }
        int userAge = UserAgeProvider.getUserAge();
        float sportTime = getSportTime(water);
        float f13 = sportTime > 30.0f ? sportTime * 11.364f : 0.0f;
        if (userAge < 9) {
            f11 = f13 + (userAge == 0 ? i3.a.isHalfYearOld(UserAgeProvider.getBirthday()) ? 480.0f : 400.0f : (userAge < 1 || userAge >= 4) ? 720.0f : 540.0f);
        } else {
            boolean z8 = UserGenderProvider.getUsetGender() == 0;
            if (userAge < 14) {
                f12 = 1100.0f;
            } else if (userAge < 19) {
                f12 = 1600.0f;
            } else {
                float weight = getWeight(water);
                if (userAge < 31) {
                    f10 = weight * 31.32f;
                } else {
                    if (userAge < 56) {
                        f8 = weight * 31.32f;
                        f9 = 0.875f;
                    } else {
                        f8 = weight * 31.32f;
                        f9 = 0.75f;
                    }
                    f10 = f8 * f9;
                }
                f11 = f10 + f13;
                if (z8) {
                    f11 -= 228.0f;
                }
            }
            f11 = f13 + f12;
            if (z8) {
            }
        }
        float max = Math.max(f11, 50.0f);
        if (z7 && WaterProvider.WATER_STATUS == WaterProvider.WaterConnectStatus.CONNECT_NEW) {
            getInstance().sendWaterGoal(Math.round(max));
        }
        return Math.round(max);
    }

    public CRPWaterIntakeInfo getCRPWAterIntakeInfo(Water water) {
        CRPWaterIntakeInfo cRPWaterIntakeInfo = new CRPWaterIntakeInfo();
        CRPWaterIntakeInfo.WaterIntakeType waterIntakeType = CRPWaterIntakeInfo.WaterIntakeType.WATCH;
        int waterId = water.getWaterId();
        if (water.getType() == 1) {
            waterIntakeType = CRPWaterIntakeInfo.WaterIntakeType.PHONE;
            waterId = w1.a(water.getId().longValue());
        }
        cRPWaterIntakeInfo.setId(waterId);
        cRPWaterIntakeInfo.setType(waterIntakeType);
        cRPWaterIntakeInfo.setHour(i3.a.getDateHour(water.getDate()));
        cRPWaterIntakeInfo.setMinutes(i3.a.getDateMinute(water.getDate()));
        cRPWaterIntakeInfo.setWaterIntake(water.getIntakeMl().intValue());
        return cRPWaterIntakeInfo;
    }

    public List<Date> getCalendarMonthList(Date date) {
        ArrayList arrayList = new ArrayList();
        Date startDateOfMonth = i3.a.getStartDateOfMonth(date);
        Date startDateOfMonth2 = i3.a.getStartDateOfMonth(new Date());
        arrayList.add(startDateOfMonth);
        Date date2 = startDateOfMonth;
        int i8 = 1;
        while (!i3.a.isSameDay(date2, startDateOfMonth2)) {
            date2 = m.getDateOfOffsetMonth(startDateOfMonth, i8);
            arrayList.add(date2);
            i8++;
        }
        return arrayList;
    }

    public Water insertWatchRecord(CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        f.d("watch-water ==> add-intake: " + cRPWaterIntakeInfo.getWaterIntake());
        Water water = new Water();
        water.setType(0);
        water.setWaterId(cRPWaterIntakeInfo.getId());
        water.setGoal(false);
        water.setDate(i3.a.getWatchRecordTime(cRPWaterIntakeInfo.getHour(), cRPWaterIntakeInfo.getMinutes()));
        water.setIntakeMl(Integer.valueOf(cRPWaterIntakeInfo.getWaterIntake()));
        water.setIntakeOz(Integer.valueOf(u0.ml2Ozs(cRPWaterIntakeInfo.getWaterIntake())));
        this.waterDaoProxy.insert(water);
        return water;
    }

    public void insertWaterRecord(int i8, Water water) {
        f.d("water ==> add-intake: " + i8);
        Water water2 = new Water();
        water2.setType(1);
        water2.setWaterId(-1);
        water2.setGoal(false);
        water2.setDate(new Date());
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            water2.setIntakeMl(Integer.valueOf(i8));
            water2.setIntakeOz(Integer.valueOf(u0.ml2Ozs(i8)));
        } else {
            water2.setIntakeOz(Integer.valueOf(i8));
            water2.setIntakeMl(Integer.valueOf(u0.oz2Mls(i8)));
        }
        this.waterDaoProxy.insert(water2);
        sendAddWaterRecord(water2);
        updateCalendarWater(water2.getIntakeMl().intValue(), water2.getIntakeOz().intValue(), water);
    }

    public void querySupportDrinkWater() {
        new WaterDaoProxy().deleteTodayWatchRecords();
        updateWatchCalendarWater();
        i4.getInstance().queryDrinkWaterReminder();
        i4.getInstance().queryNewDrinkWaterReminderPeriod();
    }

    public void sendAddWaterRecord(Water water) {
        if (WaterProvider.WATER_STATUS == WaterProvider.WaterConnectStatus.CONNECT_NEW) {
            CRPWaterIntakeInfo cRPWAterIntakeInfo = getCRPWAterIntakeInfo(water);
            f.d("watch-water ==> addWaterIntake-info : " + cRPWAterIntakeInfo);
            i4.getInstance().addWaterIntake(cRPWAterIntakeInfo);
        }
    }

    public void sendDeleteWaterRecord(Water water) {
        if (WaterProvider.WATER_STATUS == WaterProvider.WaterConnectStatus.CONNECT_NEW) {
            CRPWaterIntakeInfo.WaterIntakeType waterIntakeType = CRPWaterIntakeInfo.WaterIntakeType.WATCH;
            int waterId = water.getWaterId();
            if (water.getType() == 1) {
                waterIntakeType = CRPWaterIntakeInfo.WaterIntakeType.PHONE;
                waterId = w1.a(water.getId().longValue());
            }
            f.d("watch-water ==> deleteWaterIntake-type : " + waterIntakeType + " id : " + waterId);
            i4.getInstance().deleteWaterIntake(waterIntakeType, waterId);
        }
    }

    public void sendOldWaterReminderSettings(CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo) {
        if (cRPDrinkWaterPeriodInfo == null) {
            cRPDrinkWaterPeriodInfo = new CRPDrinkWaterPeriodInfo();
        }
        if (!cRPDrinkWaterPeriodInfo.isEnable()) {
            cRPDrinkWaterPeriodInfo.setEnable(WaterProvider.getReminderSwitchStatus());
        }
        if (cRPDrinkWaterPeriodInfo.getStartHour() == 0 || cRPDrinkWaterPeriodInfo.getStartMinute() == 0) {
            int[] startTime = WaterProvider.getStartTime();
            cRPDrinkWaterPeriodInfo.setStartHour(startTime[0]);
            cRPDrinkWaterPeriodInfo.setStartMinute(startTime[1]);
        }
        if (cRPDrinkWaterPeriodInfo.getCount() == 0) {
            cRPDrinkWaterPeriodInfo.setCount(WaterProvider.getReminderTimes());
        }
        if (cRPDrinkWaterPeriodInfo.getPeriod() == 0) {
            cRPDrinkWaterPeriodInfo.setPeriod(WaterProvider.getIntervalTime());
        }
        f.d("watch-water ==> old-sendDrinkWaterReminder-info : " + cRPDrinkWaterPeriodInfo);
        i4.getInstance().sendDrinkWaterReminder(cRPDrinkWaterPeriodInfo);
    }

    public void sendSyncWaterData(boolean z7) {
        if (z7) {
            sendOldWaterReminderSettings(null);
            return;
        }
        sendWaterReminderSettings(null);
        sendWaterGoal(this.waterDaoProxy.getCalendarWater(new Date(), true, 2).getGoalMl().intValue());
        sendWaterRecordList();
        i4.getInstance().queryTodayWaterIntakeHistory();
    }

    public void sendTotalIntake(int i8) {
        f.d("watch-water ==> sendTodayWaterIntake-todayIntakeMl : " + i8);
        i4.getInstance().sendTodayWaterIntake(i8);
    }

    public void sendUpdateWaterRecord(Water water) {
        if (WaterProvider.WATER_STATUS == WaterProvider.WaterConnectStatus.CONNECT_NEW) {
            CRPWaterIntakeInfo cRPWAterIntakeInfo = getCRPWAterIntakeInfo(water);
            f.d("watch-water ==> updateWaterIntake-info : " + cRPWAterIntakeInfo);
            i4.getInstance().updateWaterIntake(cRPWAterIntakeInfo);
        }
    }

    public void sendWaterGoal(int i8) {
        f.d("watch-water ==> sendDrinkWaterGoals-goalMl : " + i8);
        i4.getInstance().sendDrinkWaterGoals(i8);
    }

    public void sendWaterRecordList() {
        ArrayList arrayList = new ArrayList();
        List<Water> waterRecordList = this.waterDaoProxy.getWaterRecordList(new Date(), 1);
        if (waterRecordList != null && waterRecordList.size() > 0) {
            Iterator<Water> it = waterRecordList.iterator();
            while (it.hasNext()) {
                arrayList.add(getCRPWAterIntakeInfo(it.next()));
            }
        }
        f.d("watch-water ==> sendTodayWaterIntakeHistory-recordList : " + arrayList);
        i4.getInstance().sendTodayWaterIntakeHistory(arrayList);
    }

    public void sendWaterReminderSettings(CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo) {
        if (cRPNewDrinkWaterPeriodInfo == null) {
            cRPNewDrinkWaterPeriodInfo = new CRPNewDrinkWaterPeriodInfo();
        }
        if (!cRPNewDrinkWaterPeriodInfo.isEnable()) {
            cRPNewDrinkWaterPeriodInfo.setEnable(WaterProvider.getReminderSwitchStatus());
        }
        if (cRPNewDrinkWaterPeriodInfo.getStartHour() == 0 || cRPNewDrinkWaterPeriodInfo.getStartMinutes() == 0) {
            int[] startTime = WaterProvider.getStartTime();
            cRPNewDrinkWaterPeriodInfo.setStartHour(startTime[0]);
            cRPNewDrinkWaterPeriodInfo.setStartMinutes(startTime[1]);
        }
        if (cRPNewDrinkWaterPeriodInfo.getCount() == 0) {
            cRPNewDrinkWaterPeriodInfo.setCount(WaterProvider.getReminderTimes());
        }
        if (cRPNewDrinkWaterPeriodInfo.getPeriod() == 0) {
            cRPNewDrinkWaterPeriodInfo.setPeriod(WaterProvider.getIntervalTime());
        }
        f.d("watch-water ==> sendNewDrinkWaterReminder-info : " + cRPNewDrinkWaterPeriodInfo);
        i4.getInstance().sendNewDrinkWaterReminder(cRPNewDrinkWaterPeriodInfo);
    }

    public void updateAutoGoal() {
        if (WaterProvider.getCalculationSwitchStatus()) {
            boolean isCreatedCalendarWater = this.waterDaoProxy.isCreatedCalendarWater(new Date());
            Water calendarWater = this.waterDaoProxy.getCalendarWater(new Date(), !isCreatedCalendarWater, 6);
            if (isCreatedCalendarWater) {
                updateGoal(true, getAutoCalculationGoalMl(calendarWater, true), calendarWater);
            }
        }
    }

    public void updateCalendarWater(int i8, int i9, Water water) {
        water.setTotalIntakeMl(Integer.valueOf(water.getTotalIntakeMl().intValue() + i8));
        water.setTotalIntakeOz(Integer.valueOf(water.getTotalIntakeOz().intValue() + i9));
        boolean z7 = BandUnitSystemProvider.getUnitSystem() == 0;
        water.setPercentage(Integer.valueOf(WaterProvider.getWaterPercentage((z7 ? water.getTotalIntakeMl() : water.getTotalIntakeOz()).intValue(), (z7 ? water.getGoalMl() : water.getGoalOz()).intValue())));
        water.setGrade(Integer.valueOf(WaterProvider.getWaterGrade(water.getPercentage().intValue())));
        this.waterDaoProxy.update(water);
        if (WaterProvider.WATER_STATUS == WaterProvider.WaterConnectStatus.CONNECT_NEW) {
            sendTotalIntake(water.getTotalIntakeMl().intValue());
        }
    }

    public void updateGoal(boolean z7, int i8, Water water) {
        if (water == null) {
            water = this.waterDaoProxy.getCalendarWater(new Date(), true, 13);
        }
        if (z7) {
            water.setGoalMl(Integer.valueOf(i8));
            water.setGoalOz(Integer.valueOf(u0.ml2Ozs(i8)));
        } else {
            water.setGoalOz(Integer.valueOf(i8));
            water.setGoalMl(Integer.valueOf(u0.oz2Mls(i8)));
        }
        water.setPercentage(Integer.valueOf(WaterProvider.getWaterPercentage((z7 ? water.getTotalIntakeMl() : water.getTotalIntakeOz()).intValue(), i8)));
        water.setGrade(Integer.valueOf(WaterProvider.getWaterGrade(water.getPercentage().intValue())));
        this.waterDaoProxy.update(water);
        if (WaterProvider.WATER_STATUS == WaterProvider.WaterConnectStatus.CONNECT_NEW) {
            sendWaterGoal(water.getGoalMl().intValue());
        }
        c.getDefault().post(new WaterGoalChangeEvent(water.getGoalMl().intValue(), WaterProvider.getCalculationSwitchStatus()));
    }

    @SuppressLint({"CheckResult"})
    public void updateSportTime() {
        Observable.just(Integer.valueOf(WaterProvider.getTodayTotalSportTime())).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: f3.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                com.crrepa.band.my.health.water.util.a.this.lambda$updateSportTime$0((Integer) obj);
            }
        });
    }

    public void updateWatchCalendarWater() {
        Water calendarWater = new WaterDaoProxy().getCalendarWater(new Date(), true, 3);
        int[] totalIntake = this.waterDaoProxy.getTotalIntake();
        calendarWater.setTotalIntakeMl(Integer.valueOf(totalIntake[0]));
        calendarWater.setTotalIntakeOz(Integer.valueOf(totalIntake[1]));
        boolean z7 = BandUnitSystemProvider.getUnitSystem() == 0;
        calendarWater.setPercentage(Integer.valueOf(WaterProvider.getWaterPercentage((z7 ? calendarWater.getTotalIntakeMl() : calendarWater.getTotalIntakeOz()).intValue(), (z7 ? calendarWater.getGoalMl() : calendarWater.getGoalOz()).intValue())));
        calendarWater.setGrade(Integer.valueOf(WaterProvider.getWaterGrade(calendarWater.getPercentage().intValue())));
        this.waterDaoProxy.update(calendarWater);
        sendTotalIntake(calendarWater.getTotalIntakeMl().intValue());
        c.getDefault().post(new WaterIntakeChangeEvent());
    }

    public void updateWatchRecord(Water water, CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        int waterIntake = cRPWaterIntakeInfo.getWaterIntake();
        int ml2Ozs = u0.ml2Ozs(cRPWaterIntakeInfo.getWaterIntake());
        int intValue = waterIntake - water.getIntakeMl().intValue();
        int intValue2 = ml2Ozs - water.getIntakeOz().intValue();
        water.setIntakeMl(Integer.valueOf(waterIntake));
        water.setIntakeOz(Integer.valueOf(ml2Ozs));
        water.setDate(i3.a.getTimeDate(cRPWaterIntakeInfo.getHour(), cRPWaterIntakeInfo.getMinutes()));
        this.waterDaoProxy.update(water);
        f.d("water ==> changeMl: " + intValue + " changeOz : " + intValue2);
        if (intValue == 0 && intValue2 == 0) {
            return;
        }
        updateCalendarWater(intValue, intValue2, new WaterDaoProxy().getCalendarWater(new Date(), true, 10));
    }

    public void updateWaterRecord(Water water, Water water2) {
        int intValue = water2.getIntakeMl().intValue() - water.getIntakeMl().intValue();
        int intValue2 = water2.getIntakeOz().intValue() - water.getIntakeOz().intValue();
        boolean z7 = water2.getDate() != water.getDate();
        this.waterDaoProxy.update(water2);
        f.d("water ==> changeMl: " + intValue + " changeOz : " + intValue2 + " isUpdateTime : " + z7);
        sendUpdateWaterRecord(water2);
        if (z7 && WaterProvider.WATER_STATUS == WaterProvider.WaterConnectStatus.CONNECT_NEW) {
            sendWaterRecordList();
        }
        if (intValue == 0 && intValue2 == 0) {
            return;
        }
        updateCalendarWater(intValue, intValue2, new WaterDaoProxy().getCalendarWater(new Date(), true, 12));
    }

    public void updateWeight(float f8) {
        boolean isCreatedCalendarWater = this.waterDaoProxy.isCreatedCalendarWater(new Date());
        Water calendarWater = this.waterDaoProxy.getCalendarWater(new Date(), !isCreatedCalendarWater, 5);
        calendarWater.setWeight(Float.valueOf(f8));
        if (!isCreatedCalendarWater) {
            this.waterDaoProxy.update(calendarWater);
        } else {
            if (!WaterProvider.getCalculationSwitchStatus() || UserAgeProvider.getUserAge() < 19) {
                return;
            }
            updateGoal(true, getAutoCalculationGoalMl(calendarWater, true), calendarWater);
        }
    }
}
