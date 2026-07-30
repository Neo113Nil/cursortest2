package com.crrepa.band.my.health.sleep.presenter;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.crrepa.band.my.health.sleep.BaseSleepStatisticsFragment;
import com.crrepa.band.my.health.sleep.SleepDayStatisticsFragment;
import com.crrepa.band.my.health.sleep.SleepMonthStatisticsFragment;
import com.crrepa.band.my.health.sleep.SleepWeekStatisticsFragment;
import com.crrepa.band.my.model.SleepTimeDistributionModel;
import com.crrepa.band.my.model.band.provider.SleepNapProvider;
import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.SleepNap;
import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.proxy.HeartRateDaoProxy;
import com.crrepa.band.my.model.db.proxy.SleepDaoProxy;
import com.crrepa.band.my.model.db.proxy.SleepNapDaoProxy;
import com.crrepa.band.my.model.db.proxy.TimingBloodOxygenDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import z2.g;

/* loaded from: classes2.dex */
public class a implements com.moyoung.dafit.module.common.baseui.f {
    private static final int ONE_DAY_MINUTES = 1440;
    private final SleepDaoProxy sleepDaoProxy = SleepDaoProxy.getInstance();
    private final SleepNapDaoProxy sleepNapDaoProxy = SleepNapDaoProxy.get();
    private a3.a view;

    private int formatSleepHeartRateIndex(int i8, int i9) {
        if (i9 < 0) {
            return 0;
        }
        return i8 <= i9 ? i8 - 1 : i9;
    }

    @Nullable
    private List<SleepTimeDistributionModel.DetailBean> getSleepDetailBeanList(Sleep sleep) {
        SleepTimeDistributionModel sleepTimeDistributionModel;
        List<SleepTimeDistributionModel.DetailBean> detail;
        if (sleep == null) {
            return null;
        }
        String detail2 = sleep.getDetail();
        if (TextUtils.isEmpty(detail2) || (sleepTimeDistributionModel = (SleepTimeDistributionModel) s.json2Bean(detail2, SleepTimeDistributionModel.class)) == null || (detail = sleepTimeDistributionModel.getDetail()) == null || detail.isEmpty()) {
            return null;
        }
        return detail;
    }

    private int getSleepMinutes(String str) {
        String[] split = str.split(":");
        if (split.length < 2) {
            return 0;
        }
        return (Integer.parseInt(split[0]) * 60) + Integer.parseInt(split[1]);
    }

    private void showGetUpChart(int i8, int i9) {
        int highLightValue = z2.b.getHighLightValue(i8, i9);
        this.view.renderGetUpSameAgeGroup(highLightValue, z2.b.getSameAgeGroupPercent(highLightValue));
    }

    private void showLast7DaySleepData(List<Sleep> list, Date date) {
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        for (Sleep sleep : list) {
            if (sleep != null && !TextUtils.isEmpty(sleep.getDetail())) {
                int daySpace = m.getDaySpace(sleep.getDate(), date);
                if (daySpace < 0 || daySpace >= 7) {
                    break;
                }
                int i8 = 6 - daySpace;
                iArr[i8] = toInt(sleep.getDeep());
                iArr2[i8] = toInt(sleep.getShallow());
                iArr3[i8] = toInt(sleep.getRem());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < 7; i9++) {
            arrayList.add(Float.valueOf(iArr[i9]));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < 7; i10++) {
            arrayList2.add(Float.valueOf(iArr2[i10]));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < 7; i11++) {
            arrayList3.add(Float.valueOf(iArr3[i11]));
        }
        this.view.renderLast7DaySleepTrend(arrayList, arrayList2, arrayList3, date);
    }

    private void showLessSleepChart(int i8) {
        int highLightValue = z2.c.getHighLightValue(i8);
        this.view.renderLessSleepSameAgeGroup(highLightValue, z2.c.getSameAgeGroupPercent(highLightValue));
    }

    private void showSleepBloodOxygen(Date date, int i8, int i9) {
        List json2List;
        List json2List2;
        TimingBloodOxygenDaoProxy timingBloodOxygenDaoProxy = new TimingBloodOxygenDaoProxy();
        TimingBloodOxygen timingBloodOxygen = timingBloodOxygenDaoProxy.get(date);
        if (timingBloodOxygen == null || (json2List = s.json2List(timingBloodOxygen.getBloodOxygen(), Float[].class)) == null || json2List.isEmpty()) {
            return;
        }
        int size = json2List.size();
        int i10 = ONE_DAY_MINUTES / size;
        int formatSleepHeartRateIndex = formatSleepHeartRateIndex(size, i8 / i10);
        int formatSleepHeartRateIndex2 = formatSleepHeartRateIndex(size, i9 / i10);
        ArrayList arrayList = new ArrayList();
        if (formatSleepHeartRateIndex2 < formatSleepHeartRateIndex) {
            if (timingBloodOxygenDaoProxy.get(m.getDateOfOffsetDay(date, -1)) == null || (json2List2 = s.json2List(timingBloodOxygen.getBloodOxygen(), Float[].class)) == null || json2List2.isEmpty() || json2List2.size() <= formatSleepHeartRateIndex) {
                return;
            }
            arrayList.addAll(json2List2.subList(formatSleepHeartRateIndex, json2List2.size()));
            formatSleepHeartRateIndex = 0;
        }
        arrayList.addAll(json2List.subList(formatSleepHeartRateIndex, formatSleepHeartRateIndex2));
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            int intValue = ((Float) arrayList.get(i15)).intValue();
            if (intValue > 0) {
                if (i11 == 0) {
                    i13 = intValue;
                    i14 = i13;
                }
                if (intValue < i14) {
                    i14 = intValue;
                }
                if (i13 < intValue) {
                    i13 = intValue;
                }
                i12 += intValue;
                i11++;
            }
        }
        int i16 = i11 != 0 ? i12 / i11 : 0;
        if (i16 == 0) {
            return;
        }
        this.view.renderAverageBloodOxygen(i16);
        this.view.renderMaxBloodOxygen(i13);
        this.view.renderMinBloodOxygen(i14);
        this.view.renderSleepBloodOxygenChart(arrayList);
    }

    private void showSleepEarlyChart(int i8) {
        int highLightValue = z2.e.getHighLightValue(i8);
        this.view.renderSleepEarlySameAgeGroup(highLightValue, z2.e.getSameAgeGroupPercent(highLightValue));
    }

    private void showSleepHeartRate(Date date, int i8, int i9) {
        List json2List;
        List json2List2;
        HeartRateDaoProxy heartRateDaoProxy = new HeartRateDaoProxy();
        HeartRate heartRate = heartRateDaoProxy.getHeartRate(date);
        if (heartRate == null || (json2List = s.json2List(heartRate.getHeartRate(), Float[].class)) == null || json2List.isEmpty()) {
            return;
        }
        int size = json2List.size();
        int i10 = ONE_DAY_MINUTES / size;
        int formatSleepHeartRateIndex = formatSleepHeartRateIndex(size, i8 / i10);
        int formatSleepHeartRateIndex2 = formatSleepHeartRateIndex(size, i9 / i10);
        ArrayList arrayList = new ArrayList();
        if (formatSleepHeartRateIndex2 < formatSleepHeartRateIndex) {
            HeartRate heartRate2 = heartRateDaoProxy.getHeartRate(m.getDateOfOffsetDay(date, -1));
            if (heartRate2 == null || (json2List2 = s.json2List(heartRate2.getHeartRate(), Float[].class)) == null || json2List2.isEmpty() || json2List2.size() <= formatSleepHeartRateIndex) {
                return;
            }
            arrayList.addAll(json2List2.subList(formatSleepHeartRateIndex, json2List2.size()));
            formatSleepHeartRateIndex = 0;
        }
        arrayList.addAll(json2List.subList(formatSleepHeartRateIndex, formatSleepHeartRateIndex2));
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            int intValue = ((Float) arrayList.get(i15)).intValue();
            if (intValue > 0) {
                if (i11 == 0) {
                    i13 = intValue;
                    i14 = i13;
                }
                if (intValue < i14) {
                    i14 = intValue;
                }
                if (i13 < intValue) {
                    i13 = intValue;
                }
                i12 += intValue;
                i11++;
            }
        }
        int i16 = i11 != 0 ? i12 / i11 : 0;
        if (i16 == 0) {
            return;
        }
        this.view.renderAverageHeartRate(i16);
        this.view.renderHighestHeartRate(i13);
        this.view.renderLowestHeartRate(i14);
        this.view.renderSleepHeartRateChart(arrayList);
    }

    private void showSleepQuality(int i8, Sleep sleep) {
        if (sleep == null || TextUtils.isEmpty(sleep.getDetail())) {
            return;
        }
        this.view.renderSleepQuality(z2.f.getSleepQuality(i8, sleep));
    }

    private void showStatisticsChart(Sleep sleep) {
        if (TextUtils.isEmpty(sleep.getDetail())) {
            return;
        }
        int fallAsleepTime = g.getFallAsleepTime(sleep);
        int wakeUpTime = g.getWakeUpTime(sleep);
        int sleepTime = SleepDaoProxy.getSleepTime(sleep);
        showSleepEarlyChart(fallAsleepTime);
        showGetUpChart(wakeUpTime, sleepTime);
        showLessSleepChart(sleepTime);
    }

    private void showTotalSleepTime(int i8, int i9, int i10) {
        if (i8 + i9 + i10 == 0) {
            return;
        }
        this.view.renderSleepTime(i8, i9, i10);
    }

    private int toInt(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getSleepDetail(Date date) {
        Sleep sleep = this.sleepDaoProxy.getSleep(date);
        if (sleep == null) {
            return;
        }
        showTotalSleepTime(toInt(sleep.getDeep()), toInt(sleep.getShallow()), toInt(sleep.getRem()));
        List<Sleep> partSleep = this.sleepDaoProxy.getPartSleep(date, 7);
        showLast7DaySleepData(partSleep, date);
        showSleepQuality(partSleep.size(), sleep);
        showStatisticsChart(sleep);
        try {
            List<SleepTimeDistributionModel.DetailBean> sleepDetailBeanList = getSleepDetailBeanList(sleep);
            if (sleepDetailBeanList != null && !sleepDetailBeanList.isEmpty()) {
                String start = sleepDetailBeanList.get(0).getStart();
                String end = sleepDetailBeanList.get(sleepDetailBeanList.size() - 1).getEnd();
                this.view.renderSleepTime(date, start, end);
                int sleepMinutes = getSleepMinutes(start);
                int sleepMinutes2 = getSleepMinutes(end);
                showSleepHeartRate(date, sleepMinutes, sleepMinutes2);
                showSleepBloodOxygen(date, sleepMinutes, sleepMinutes2);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void getSleepNapDetail(Date date) {
        SleepNap sleepNap;
        if (SleepNapProvider.notSupportSleepNap() || (sleepNap = this.sleepNapDaoProxy.getSleepNap(date)) == null) {
            return;
        }
        this.view.renderSleepNapData(sleepNap);
    }

    public void getStepStatisticsFragment(Date date) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SleepDayStatisticsFragment.newInstance(date));
        arrayList.add(BaseSleepStatisticsFragment.getInstance(new SleepWeekStatisticsFragment(), date));
        arrayList.add(BaseSleepStatisticsFragment.getInstance(new SleepMonthStatisticsFragment(), date));
        this.view.renderSleepStatisticsFragment(arrayList);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(a3.a aVar) {
        this.view = aVar;
    }
}
