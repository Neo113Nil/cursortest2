package com.crrepa.band.my.health.water.model;

import com.crrepa.band.my.model.db.Water;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class WaterCalendarModel {
    private List<Water> calendarWaterList;
    private Date month;

    public WaterCalendarModel(Date date, List<Water> list) {
        this.month = date;
        this.calendarWaterList = list;
    }

    public List<Water> getCalendarWaterList() {
        return this.calendarWaterList;
    }

    public Date getMonth() {
        return this.month;
    }

    public void setCalendarWaterList(List<Water> list) {
        this.calendarWaterList = list;
    }

    public void setMonth(Date date) {
        this.month = date;
    }

    public String toString() {
        return "WaterCalendarModel{month=" + this.month + ", calendarWaterList=" + this.calendarWaterList + '}';
    }
}
