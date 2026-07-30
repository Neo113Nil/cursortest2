package com.crrepa.band.my.device.muslim.model;

import cn.hutool.core.text.l;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.utils.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class PrayTime {
    private int AngleBased;
    private int Custom;
    private int Egypt;
    private int Floating;
    private int Hanafi;
    private int ISNA;
    private String InvalidTime;
    private double JDate;
    private int Jafari;
    private int Karachi;
    private int MWL;
    private int Makkah;
    private int MidNight;
    private int None;
    private int OneSeventh;
    private int Shafii;
    private int SihatKemenag;
    private int Tehran;
    private int Time12;
    private int Time12NS;
    private int Time24;
    private int adjustHighLats;
    private int asrJuristic;
    private int calcMethod;
    private int dhuhrMinutes;
    private double lat;
    private double lng;
    private HashMap<Integer, double[]> methodParams;
    private int numIterations;
    private int[] offsets;
    private double[] prayerTimesCurrent;
    private int timeFormat;
    private ArrayList<String> timeNames;
    private double timeZone;

    public PrayTime() {
        setCalcMethod(0);
        setAsrJuristic(0);
        setDhuhrMinutes(0);
        setAdjustHighLats(1);
        setTimeFormat(0);
        setJafari(0);
        setKarachi(1);
        setMWL(2);
        setISNA(3);
        setMakkah(4);
        setEgypt(8);
        setTehran(6);
        setCustom(7);
        setSihatKemenag(5);
        setShafii(0);
        setHanafi(1);
        setNone(0);
        setMidNight(1);
        setOneSeventh(2);
        setAngleBased(3);
        setTime24(0);
        setTime12(1);
        setTime12NS(2);
        setFloating(3);
        ArrayList<String> arrayList = new ArrayList<>();
        this.timeNames = arrayList;
        arrayList.add("Fajr");
        this.timeNames.add("Sunrise");
        this.timeNames.add("Dhuhr");
        this.timeNames.add("Asr");
        this.timeNames.add("Sunset");
        this.timeNames.add("Maghrib");
        this.timeNames.add("Isha");
        this.InvalidTime = "-----";
        setNumIterations(1);
        this.offsets = new int[]{0, 0, 0, 0, 0, 0, 0};
        HashMap<Integer, double[]> hashMap = new HashMap<>();
        this.methodParams = hashMap;
        hashMap.put(Integer.valueOf(getJafari()), new double[]{16.0d, i.DOUBLE_EPSILON, 4.0d, i.DOUBLE_EPSILON, 14.0d});
        this.methodParams.put(Integer.valueOf(getKarachi()), new double[]{18.0d, 1.0d, i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 18.0d});
        this.methodParams.put(Integer.valueOf(getISNA()), new double[]{15.0d, 1.0d, i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 15.0d});
        this.methodParams.put(Integer.valueOf(getMWL()), new double[]{18.0d, 1.0d, i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 17.0d});
        this.methodParams.put(Integer.valueOf(getMakkah()), new double[]{18.5d, 1.0d, i.DOUBLE_EPSILON, 1.0d, 90.0d});
        this.methodParams.put(Integer.valueOf(getEgypt()), new double[]{19.5d, 1.0d, i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 17.5d});
        this.methodParams.put(Integer.valueOf(getTehran()), new double[]{17.7d, i.DOUBLE_EPSILON, 4.5d, i.DOUBLE_EPSILON, 14.0d});
        this.methodParams.put(Integer.valueOf(getCustom()), new double[]{18.0d, 1.0d, i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 17.0d});
        this.methodParams.put(Integer.valueOf(getSihatKemenag()), new double[]{20.0d, 1.0d, i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, 18.0d});
    }

    private double DegreesToRadians(double d8) {
        return (d8 * 3.141592653589793d) / 180.0d;
    }

    private double[] adjustHighLatTimes(double[] dArr) {
        double timeDiff = timeDiff(dArr[4], dArr[1]);
        double nightPortion = nightPortion(this.methodParams.get(Integer.valueOf(getCalcMethod()))[0]) * timeDiff;
        if (Double.isNaN(dArr[0]) || timeDiff(dArr[0], dArr[1]) > nightPortion) {
            dArr[0] = dArr[1] - nightPortion;
        }
        double nightPortion2 = nightPortion(this.methodParams.get(Integer.valueOf(getCalcMethod()))[3] == i.DOUBLE_EPSILON ? this.methodParams.get(Integer.valueOf(getCalcMethod()))[4] : 18.0d) * timeDiff;
        if (Double.isNaN(dArr[6]) || timeDiff(dArr[4], dArr[6]) > nightPortion2) {
            dArr[6] = dArr[4] + nightPortion2;
        }
        double nightPortion3 = nightPortion(this.methodParams.get(Integer.valueOf(getCalcMethod()))[1] == i.DOUBLE_EPSILON ? this.methodParams.get(Integer.valueOf(getCalcMethod()))[2] : 4.0d) * timeDiff;
        if (Double.isNaN(dArr[5]) || timeDiff(dArr[4], dArr[5]) > nightPortion3) {
            dArr[5] = dArr[4] + nightPortion3;
        }
        return dArr;
    }

    private double[] adjustTimes(double[] dArr) {
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr[i8] = dArr[i8] + (getTimeZone() - (getLng() / 15.0d));
        }
        dArr[2] = dArr[2] + (getDhuhrMinutes() / 60);
        if (this.methodParams.get(Integer.valueOf(getCalcMethod()))[1] == 1.0d) {
            dArr[5] = dArr[4] + (this.methodParams.get(Integer.valueOf(getCalcMethod()))[2] / 60.0d);
        }
        if (this.methodParams.get(Integer.valueOf(getCalcMethod()))[3] == 1.0d) {
            dArr[6] = dArr[5] + (this.methodParams.get(Integer.valueOf(getCalcMethod()))[4] / 60.0d);
        }
        return getAdjustHighLats() != getNone() ? adjustHighLatTimes(dArr) : dArr;
    }

    private ArrayList<String> adjustTimesFormat(double[] dArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (getTimeFormat() == getFloating()) {
            for (double d8 : dArr) {
                arrayList.add(String.valueOf(d8));
            }
            return arrayList;
        }
        for (int i8 = 0; i8 < 7; i8++) {
            if (getTimeFormat() == getTime12()) {
                arrayList.add(floatToTime12(dArr[i8], false));
            } else if (getTimeFormat() == getTime12NS()) {
                arrayList.add(floatToTime12(dArr[i8], true));
            } else {
                arrayList.add(floatToTime24(dArr[i8]));
            }
        }
        return arrayList;
    }

    private double calcJD(int i8, int i9, int i10) {
        return (Math.floor(new Date(i8, i9 - 1, i10).getTime() / 8.64E7d) + 2440588.0d) - 0.5d;
    }

    private double computeAsr(double d8, double d9) {
        return computeTime(-darccot(d8 + dtan(Math.abs(getLat() - sunDeclination(getJDate() + d9)))), d9);
    }

    private ArrayList<String> computeDayTimes() {
        double[] dArr = {5.0d, 6.0d, 12.0d, 13.0d, 18.0d, 18.0d, 18.0d};
        for (int i8 = 1; i8 <= getNumIterations(); i8++) {
            dArr = computeTimes(dArr);
        }
        return adjustTimesFormat(tuneTimes(adjustTimes(dArr)));
    }

    private double computeMidDay(double d8) {
        return fixhour(12.0d - equationOfTime(getJDate() + d8));
    }

    private double computeTime(double d8, double d9) {
        double sunDeclination = sunDeclination(getJDate() + d9);
        double computeMidDay = computeMidDay(d9);
        double darccos = darccos(((-dsin(d8)) - (dsin(sunDeclination) * dsin(getLat()))) / (dcos(sunDeclination) * dcos(getLat()))) / 15.0d;
        if (d8 > 90.0d) {
            darccos = -darccos;
        }
        return computeMidDay + darccos;
    }

    private double[] computeTimes(double[] dArr) {
        double[] dayPortion = dayPortion(dArr);
        return new double[]{computeTime(180.0d - this.methodParams.get(Integer.valueOf(getCalcMethod()))[0], dayPortion[0]), computeTime(179.167d, dayPortion[1]), computeMidDay(dayPortion[2]), computeAsr(getAsrJuristic() + 1, dayPortion[3]), computeTime(0.833d, dayPortion[4]), computeTime(this.methodParams.get(Integer.valueOf(getCalcMethod()))[2], dayPortion[5]), computeTime(this.methodParams.get(Integer.valueOf(getCalcMethod()))[4], dayPortion[6])};
    }

    private double darccos(double d8) {
        return radiansToDegrees(Math.acos(d8));
    }

    private double darccot(double d8) {
        return radiansToDegrees(Math.atan2(1.0d, d8));
    }

    private double darcsin(double d8) {
        return radiansToDegrees(Math.asin(d8));
    }

    private double darctan(double d8) {
        return radiansToDegrees(Math.atan(d8));
    }

    private double darctan2(double d8, double d9) {
        return radiansToDegrees(Math.atan2(d8, d9));
    }

    private double[] dayPortion(double[] dArr) {
        for (int i8 = 0; i8 < 7; i8++) {
            dArr[i8] = dArr[i8] / 24.0d;
        }
        return dArr;
    }

    private double dcos(double d8) {
        return Math.cos(DegreesToRadians(d8));
    }

    private double detectDaylightSaving() {
        return TimeZone.getDefault().getDSTSavings();
    }

    private double dsin(double d8) {
        return Math.sin(DegreesToRadians(d8));
    }

    private double dtan(double d8) {
        return Math.tan(DegreesToRadians(d8));
    }

    private double equationOfTime(double d8) {
        return sunPosition(d8)[1];
    }

    private double fixangle(double d8) {
        double floor = d8 - (Math.floor(d8 / 360.0d) * 360.0d);
        return floor < i.DOUBLE_EPSILON ? floor + 360.0d : floor;
    }

    private double fixhour(double d8) {
        double floor = d8 - (Math.floor(d8 / 24.0d) * 24.0d);
        return floor < i.DOUBLE_EPSILON ? floor + 24.0d : floor;
    }

    private double getBaseTimeZone() {
        return (TimeZone.getDefault().getRawOffset() / 1000.0d) / 3600.0d;
    }

    private int getCustom() {
        return this.Custom;
    }

    private ArrayList<String> getDatePrayerTimes(int i8, int i9, int i10, double d8, double d9, double d10) {
        setLat(d8);
        setLng(d9);
        setTimeZone(d10);
        setJDate(julianDate(i8, i9, i10));
        setJDate(getJDate() - (d9 / 360.0d));
        return computeDayTimes();
    }

    private int getEgypt() {
        return this.Egypt;
    }

    private int getFloating() {
        return this.Floating;
    }

    private int getHanafi() {
        return this.Hanafi;
    }

    private int getISNA() {
        return this.ISNA;
    }

    private int getKarachi() {
        return this.Karachi;
    }

    private int getMWL() {
        return this.MWL;
    }

    private int getMakkah() {
        return this.Makkah;
    }

    private int getMidNight() {
        return this.MidNight;
    }

    private int getNone() {
        return this.None;
    }

    private int getNumIterations() {
        return this.numIterations;
    }

    private int getOneSeventh() {
        return this.OneSeventh;
    }

    private int getSihatKemenag() {
        return this.SihatKemenag;
    }

    private int getTehran() {
        return this.Tehran;
    }

    private int getTime12NS() {
        return this.Time12NS;
    }

    private double getTimeZone1() {
        return (TimeZone.getDefault().getRawOffset() / 1000.0d) / 3600.0d;
    }

    private double julianDate(int i8, int i9, int i10) {
        if (i9 <= 2) {
            i8--;
            i9 += 12;
        }
        double floor = Math.floor(i8 / 100.0d);
        return (((Math.floor((i8 + 4716) * 365.25d) + Math.floor((i9 + 1) * 30.6001d)) + i10) + ((2.0d - floor) + Math.floor(floor / 4.0d))) - 1524.5d;
    }

    private double nightPortion(double d8) {
        int i8 = this.adjustHighLats;
        if (i8 == this.AngleBased) {
            return d8 / 60.0d;
        }
        if (i8 == this.MidNight) {
            return 0.5d;
        }
        if (i8 == this.OneSeventh) {
            return 0.14286d;
        }
        return i.DOUBLE_EPSILON;
    }

    private double radiansToDegrees(double d8) {
        return (d8 * 180.0d) / 3.141592653589793d;
    }

    private void setAngleBased(int i8) {
        this.AngleBased = i8;
    }

    private void setCustom(int i8) {
        this.Custom = i8;
    }

    private void setCustomParams(double[] dArr) {
        for (int i8 = 0; i8 < 5; i8++) {
            if (dArr[i8] == -1.0d) {
                dArr[i8] = this.methodParams.get(Integer.valueOf(getCalcMethod()))[i8];
                this.methodParams.put(Integer.valueOf(getCustom()), dArr);
            } else {
                this.methodParams.get(Integer.valueOf(getCustom()))[i8] = dArr[i8];
            }
        }
        setCalcMethod(getCustom());
    }

    private void setEgypt(int i8) {
        this.Egypt = i8;
    }

    private void setFloating(int i8) {
        this.Floating = i8;
    }

    private void setHanafi(int i8) {
        this.Hanafi = i8;
    }

    private void setISNA(int i8) {
        this.ISNA = i8;
    }

    private void setJafari(int i8) {
        this.Jafari = i8;
    }

    private void setKarachi(int i8) {
        this.Karachi = i8;
    }

    private void setMWL(int i8) {
        this.MWL = i8;
    }

    private void setMakkah(int i8) {
        this.Makkah = i8;
    }

    private void setMidNight(int i8) {
        this.MidNight = i8;
    }

    private void setNone(int i8) {
        this.None = i8;
    }

    private void setNumIterations(int i8) {
        this.numIterations = i8;
    }

    private void setOneSeventh(int i8) {
        this.OneSeventh = i8;
    }

    private void setShafii(int i8) {
        this.Shafii = i8;
    }

    private void setTehran(int i8) {
        this.Tehran = i8;
    }

    private void setTime12(int i8) {
        this.Time12 = i8;
    }

    private void setTime12NS(int i8) {
        this.Time12NS = i8;
    }

    private void setTime24(int i8) {
        this.Time24 = i8;
    }

    private double sunDeclination(double d8) {
        return sunPosition(d8)[0];
    }

    private double[] sunPosition(double d8) {
        double d9 = d8 - 2451545.0d;
        double fixangle = fixangle((0.98560028d * d9) + 357.529d);
        double fixangle2 = fixangle((0.98564736d * d9) + 280.459d);
        double fixangle3 = fixangle((dsin(fixangle) * 1.915d) + fixangle2 + (dsin(fixangle * 2.0d) * 0.02d));
        double d10 = 23.439d - (d9 * 3.6E-7d);
        return new double[]{darcsin(dsin(d10) * dsin(fixangle3)), (fixangle2 / 15.0d) - fixhour(darctan2(dcos(d10) * dsin(fixangle3), dcos(fixangle3)) / 15.0d)};
    }

    private double timeDiff(double d8, double d9) {
        return fixhour(d9 - d8);
    }

    private double[] tuneTimes(double[] dArr) {
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr[i8] = dArr[i8] + (this.offsets[i8] / 60.0d);
        }
        return dArr;
    }

    public String floatToTime12(double d8, boolean z7) {
        String str;
        if (Double.isNaN(d8)) {
            return this.InvalidTime;
        }
        double fixhour = fixhour(d8 + 0.008333333333333333d);
        int floor = (int) Math.floor(fixhour);
        double floor2 = Math.floor((fixhour - floor) * 60.0d);
        boolean isZH = u.isZH();
        String str2 = floor >= 12 ? isZH ? "下午" : "pm" : isZH ? "上午" : "am";
        int i8 = ((floor + 11) % 12) + 1;
        if (z7) {
            if (i8 >= 0 && i8 <= 9 && floor2 >= i.DOUBLE_EPSILON && floor2 <= 9.0d) {
                return "0" + i8 + ":0" + Math.round(floor2);
            }
            if (i8 >= 0 && i8 <= 9) {
                return "0" + i8 + ":" + Math.round(floor2);
            }
            if (floor2 < i.DOUBLE_EPSILON || floor2 > 9.0d) {
                return i8 + ":" + Math.round(floor2);
            }
            return i8 + ":0" + Math.round(floor2);
        }
        if (i8 >= 0 && i8 <= 9 && floor2 >= i.DOUBLE_EPSILON && floor2 <= 9.0d) {
            str = "0" + i8 + ":0" + Math.round(floor2);
        } else if (i8 >= 0 && i8 <= 9) {
            str = "0" + i8 + ":" + Math.round(floor2);
        } else if (floor2 < i.DOUBLE_EPSILON || floor2 > 9.0d) {
            str = i8 + ":" + Math.round(floor2);
        } else {
            str = i8 + ":0" + Math.round(floor2);
        }
        if (isZH) {
            return str2 + l.SPACE + str;
        }
        return str + l.SPACE + str2;
    }

    public String floatToTime12NS(double d8) {
        return floatToTime12(d8, true);
    }

    public String floatToTime24(double d8) {
        if (Double.isNaN(d8)) {
            return this.InvalidTime;
        }
        double fixhour = fixhour(d8 + 0.008333333333333333d);
        int floor = (int) Math.floor(fixhour);
        double floor2 = Math.floor((fixhour - floor) * 60.0d);
        if (floor >= 0 && floor <= 9 && floor2 >= i.DOUBLE_EPSILON && floor2 <= 9.0d) {
            return "0" + floor + ":0" + Math.round(floor2);
        }
        if (floor >= 0 && floor <= 9) {
            return "0" + floor + ":" + Math.round(floor2);
        }
        if (floor2 < i.DOUBLE_EPSILON || floor2 > 9.0d) {
            return floor + ":" + Math.round(floor2);
        }
        return floor + ":0" + Math.round(floor2);
    }

    public int getAdjustHighLats() {
        return this.adjustHighLats;
    }

    public int getAngleBased() {
        return this.AngleBased;
    }

    public int getAsrJuristic() {
        return this.asrJuristic;
    }

    public int getCalcMethod() {
        return this.calcMethod;
    }

    public int getDhuhrMinutes() {
        return this.dhuhrMinutes;
    }

    public double getJDate() {
        return this.JDate;
    }

    public int getJafari() {
        return this.Jafari;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }

    public ArrayList<String> getPrayerTimes(Date date, double d8, double d9, double d10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getDatePrayerTimes(calendar.get(1), calendar.get(2) + 1, calendar.get(5), d8, d9, d10);
    }

    public int getShafii() {
        return this.Shafii;
    }

    public int getTime12() {
        return this.Time12;
    }

    public int getTime24() {
        return this.Time24;
    }

    public int getTimeFormat() {
        return this.timeFormat;
    }

    public ArrayList<String> getTimeNames() {
        return this.timeNames;
    }

    public double getTimeZone() {
        return this.timeZone;
    }

    public void setAdjustHighLats(int i8) {
        this.adjustHighLats = i8;
    }

    public void setAsrJuristic(int i8) {
        this.asrJuristic = i8;
    }

    public void setCalcMethod(int i8) {
        this.calcMethod = i8;
    }

    public void setDhuhrMinutes(int i8) {
        this.dhuhrMinutes = i8;
    }

    public void setFajrAngle(double d8) {
        setCustomParams(new double[]{d8, -1.0d, -1.0d, -1.0d, -1.0d});
    }

    public void setIshaAngle(double d8) {
        setCustomParams(new double[]{-1.0d, -1.0d, -1.0d, i.DOUBLE_EPSILON, d8});
    }

    public void setIshaMinutes(double d8) {
        setCustomParams(new double[]{-1.0d, -1.0d, -1.0d, 1.0d, d8});
    }

    public void setJDate(double d8) {
        this.JDate = d8;
    }

    public void setLat(double d8) {
        this.lat = d8;
    }

    public void setLng(double d8) {
        this.lng = d8;
    }

    public void setMaghribAngle(double d8) {
        setCustomParams(new double[]{-1.0d, i.DOUBLE_EPSILON, d8, -1.0d, -1.0d});
    }

    public void setMaghribMinutes(double d8) {
        setCustomParams(new double[]{-1.0d, 1.0d, d8, -1.0d, -1.0d});
    }

    public void setSihatKemenag(int i8) {
        this.SihatKemenag = i8;
    }

    public void setTimeFormat(int i8) {
        this.timeFormat = i8;
    }

    public void setTimeZone(double d8) {
        this.timeZone = d8;
    }

    public void tune(int[] iArr) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.offsets[i8] = iArr[i8];
        }
    }
}
