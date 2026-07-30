package com.crrepa.band.my.model.db;

import java.util.Objects;

/* loaded from: classes2.dex */
public class Alarm {
    private int alarm_id;
    private Integer hour;
    private Long id;
    private Integer minute;
    private Integer repeat;
    private String repeatMode;
    private Boolean switchOn;

    public Alarm(Long l8, Integer num, Integer num2, String str, Integer num3, Boolean bool, int i8) {
        this.id = l8;
        this.hour = num;
        this.minute = num2;
        this.repeatMode = str;
        this.repeat = num3;
        this.switchOn = bool;
        this.alarm_id = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && ((Alarm) obj).hashCode() == hashCode();
    }

    public int getAlarm_id() {
        return this.alarm_id;
    }

    public Integer getHour() {
        return this.hour;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getMinute() {
        return this.minute;
    }

    public Integer getRepeat() {
        return this.repeat;
    }

    public String getRepeatMode() {
        return this.repeatMode;
    }

    public Boolean getSwitchOn() {
        return this.switchOn;
    }

    public int hashCode() {
        return Objects.hash(this.hour, this.minute, this.repeat, this.switchOn, Integer.valueOf(this.alarm_id));
    }

    public void setAlarm_id(int i8) {
        this.alarm_id = i8;
    }

    public void setHour(Integer num) {
        this.hour = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setMinute(Integer num) {
        this.minute = num;
    }

    public void setRepeat(Integer num) {
        this.repeat = num;
    }

    public void setRepeatMode(String str) {
        this.repeatMode = str;
    }

    public void setSwitchOn(Boolean bool) {
        this.switchOn = bool;
    }

    public Alarm() {
    }
}
