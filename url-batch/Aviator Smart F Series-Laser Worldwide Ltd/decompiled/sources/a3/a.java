package a3;

import androidx.fragment.app.Fragment;
import com.crrepa.band.my.model.db.SleepNap;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void renderAverageBloodOxygen(int i8);

    void renderAverageHeartRate(int i8);

    void renderGetUpSameAgeGroup(int i8, int i9);

    void renderHighestHeartRate(int i8);

    void renderLast7DaySleepTrend(List<Float> list, List<Float> list2, List<Float> list3, Date date);

    void renderLessSleepSameAgeGroup(int i8, int i9);

    void renderLowestHeartRate(int i8);

    void renderMaxBloodOxygen(int i8);

    void renderMinBloodOxygen(int i8);

    void renderSleepBloodOxygenChart(List<Float> list);

    void renderSleepEarlySameAgeGroup(int i8, int i9);

    void renderSleepHeartRateChart(List<Float> list);

    void renderSleepNapData(SleepNap sleepNap);

    void renderSleepQuality(int i8);

    void renderSleepStatisticsFragment(List<Fragment> list);

    void renderSleepTime(int i8, int i9, int i10);

    void renderSleepTime(Date date, String str, String str2);
}
