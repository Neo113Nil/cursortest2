package com.crrepa.band.my.device.muslim.model;

/* loaded from: classes2.dex */
public class PrayerCompensationModel {
    int prayerCompensation;
    String timeName;
    TimeType timeType;

    public enum TimeType {
        FAJR,
        SUNRISE,
        DHUHR,
        ASR,
        SUNSET,
        MAGHRIB,
        LSHA
    }

    public PrayerCompensationModel(String str, int i8, TimeType timeType) {
        this.timeName = str;
        this.prayerCompensation = i8;
        this.timeType = timeType;
    }

    public int getPrayerCompensation() {
        return this.prayerCompensation;
    }

    public String getTimeName() {
        return this.timeName;
    }

    public TimeType getTimeType() {
        return this.timeType;
    }

    public void setPrayerCompensation(int i8) {
        this.prayerCompensation = i8;
    }

    public void setTimeName(String str) {
        this.timeName = str;
    }

    public void setTimeType(TimeType timeType) {
        this.timeType = timeType;
    }
}
