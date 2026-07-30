package com.crrepa.band.my.model.db.helper;

import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.proxy.HeartRateDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import com.orhanobut.logger.f;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class HeartRateSaveHelper {
    private HeartRateSaveHelper() {
    }

    public static List<Integer> formatHeartRate(String str) {
        return s.json2List(str, Integer[].class);
    }

    public static List<Integer> getMovementHeartRateFor24HourHeartRate(String str, long j8, long j9) {
        List<Integer> formatHeartRate = formatHeartRate(str);
        if (formatHeartRate != null && !formatHeartRate.isEmpty()) {
            f.d("hr list: " + formatHeartRate.toString());
            int minuteOfDay = m.getMinuteOfDay(new Date(j8));
            int minuteOfDay2 = m.getMinuteOfDay(new Date(j9)) + 1;
            f.d("startMinute: " + minuteOfDay + ", endMinute: " + minuteOfDay2);
            if (formatHeartRate.size() > minuteOfDay2 && minuteOfDay2 >= minuteOfDay) {
                return formatHeartRate.subList(minuteOfDay, minuteOfDay2);
            }
        }
        return null;
    }

    public static List<Integer> getMovementHeartRateForDynamicHeartRate(String str, long j8, long j9) {
        List<Integer> formatHeartRate = formatHeartRate(str);
        if (formatHeartRate == null || formatHeartRate.isEmpty()) {
            f.d("heartRate list is null");
            return null;
        }
        f.d("heartRate list size: " + formatHeartRate.size());
        int minuteOfDay = m.getMinuteOfDay(new Date(j8));
        int minuteOfDay2 = m.getMinuteOfDay(new Date(j9));
        f.d("startMinute: " + minuteOfDay);
        f.d("endMinute: " + minuteOfDay2);
        int i8 = (minuteOfDay2 - minuteOfDay) + 1;
        if (i8 < 0) {
            f.d("heartRate length error");
            return null;
        }
        if (formatHeartRate.size() < i8) {
            i8 = formatHeartRate.size();
        }
        return formatHeartRate.subList(0, i8);
    }

    public static HeartRate query24HoursHeartRate(long j8) {
        return new HeartRateDaoProxy().getHeartRate(new Date(j8));
    }

    public static void save24HourHeartRate(HeartRate heartRate) {
        if (heartRate == null) {
            return;
        }
        HeartRateDaoProxy heartRateDaoProxy = new HeartRateDaoProxy();
        HeartRate heartRate2 = heartRateDaoProxy.getHeartRate(heartRate.getDate());
        if (heartRate2 == null) {
            heartRateDaoProxy.insertHeartRate(heartRate);
        } else {
            heartRate.setId(heartRate2.getId());
            heartRateDaoProxy.updateHeartRate(heartRate);
        }
    }
}
