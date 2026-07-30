package com.crrepa.band.my.device.muslim.utils;

import com.crrepa.band.my.device.muslim.model.PrayTime;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.moyoung.dafit.module.common.utils.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class d {
    public static boolean is12HourTime = false;

    public static int getCurrentPrayIndex(List<String> list, Date date, Date date2) {
        Date prayDate;
        int daySpace;
        Date date3 = new Date();
        for (int i8 = 0; i8 < list.size() && (daySpace = m.getDaySpace((prayDate = getPrayDate(list.get(i8), date)), date3)) >= 0 && daySpace <= 1; i8++) {
            long milliSecondSpace = m.getMilliSecondSpace(prayDate, date3);
            if (daySpace == 0 && milliSecondSpace < 0) {
                return i8 - 1;
            }
            if (i8 == list.size() - 1 && milliSecondSpace >= 0) {
                if (daySpace == 0) {
                    return i8;
                }
                if (m.getMilliSecondSpace(date2, date3) < 0) {
                    return i8;
                }
                return -1;
            }
        }
        return -1;
    }

    public static int getNextPrayIndex(List<String> list) {
        Date date = new Date();
        for (int i8 = 0; i8 < list.size(); i8++) {
            long milliSecondSpace = m.getMilliSecondSpace(getPrayDate(list.get(i8), date), date);
            if (i8 == list.size() - 1 && milliSecondSpace >= 0) {
                return i8 + 1;
            }
            if (milliSecondSpace < 0) {
                return i8;
            }
        }
        return -1;
    }

    public static Date getPrayDate(String str, Date date) {
        boolean is12HourTime2 = BandTimeSystemProvider.is12HourTime();
        is12HourTime = is12HourTime2;
        return m.getDateForHourAndMinute(date, m.getHourForStringTime(str, is12HourTime2), m.getMinuteForStringTime(str, is12HourTime), is12HourTime);
    }

    public static ArrayList<String> getPrayerTimes(Date date, double d8, double d9, int i8) {
        double offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 3600000.0d;
        PrayTime prayTime = new PrayTime();
        boolean is12HourTime2 = BandTimeSystemProvider.is12HourTime();
        is12HourTime = is12HourTime2;
        prayTime.setTimeFormat(is12HourTime2 ? prayTime.getTime12() : prayTime.getTime24());
        prayTime.setCalcMethod(i8);
        prayTime.setAsrJuristic(c.isShowAsrMethod() ? c.getAsrJuristicMethod() : prayTime.getShafii());
        prayTime.setAdjustHighLats(prayTime.getAngleBased());
        prayTime.tune(c.getPrayerCompensation());
        ArrayList<String> prayerTimes = prayTime.getPrayerTimes(date, d8, d9, offset);
        prayerTimes.remove(4);
        return prayerTimes;
    }

    public static void main(String[] strArr) {
        PrayTime prayTime = new PrayTime();
        prayTime.setTimeFormat(prayTime.getTimeFormat());
        prayTime.setCalcMethod(3);
        prayTime.setAsrJuristic(prayTime.getShafii());
        prayTime.setAdjustHighLats(prayTime.getAngleBased());
        prayTime.tune(new int[]{0, 0, 0, 0, 0, 0, 0});
        ArrayList<String> prayerTimes = prayTime.getPrayerTimes(new Date(), 28.274436d, 112.910786d, TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 3600000.0d);
        ArrayList<String> timeNames = prayTime.getTimeNames();
        for (int i8 = 0; i8 < prayerTimes.size(); i8++) {
            System.out.println(timeNames.get(i8) + " - " + prayerTimes.get(i8));
        }
    }
}
