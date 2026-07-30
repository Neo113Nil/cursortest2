package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class PillReminder {
    private Date date;
    private Boolean enable;
    private Long id;
    private Integer index;
    private String name;
    private String reminderTime;
    private Integer repeat;
    private Integer times;

    public PillReminder(Long l8, String str, Integer num, Boolean bool, Integer num2, Integer num3, String str2, Date date) {
        this.id = l8;
        this.name = str;
        this.index = num;
        this.enable = bool;
        this.times = num2;
        this.repeat = num3;
        this.reminderTime = str2;
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public String getReminderTime() {
        return this.reminderTime;
    }

    public Integer getRepeat() {
        return this.repeat;
    }

    public Integer getTimes() {
        return this.times;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setIndex(Integer num) {
        this.index = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setReminderTime(String str) {
        this.reminderTime = str;
    }

    public void setRepeat(Integer num) {
        this.repeat = num;
    }

    public void setTimes(Integer num) {
        this.times = num;
    }

    public PillReminder() {
    }
}
