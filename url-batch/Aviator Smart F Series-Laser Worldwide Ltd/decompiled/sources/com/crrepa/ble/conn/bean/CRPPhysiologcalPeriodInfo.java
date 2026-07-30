package com.crrepa.ble.conn.bean;

import java.util.Date;

/* loaded from: classes3.dex */
public class CRPPhysiologcalPeriodInfo {
    private boolean acrossYears;
    private int menstrualPeriod;
    private boolean menstrualReminder;
    private boolean ovulationDayReminder;
    private boolean ovulationEndReminder;
    private boolean ovulationReminder;
    private int physiologcalPeriod;
    private int reminderHour;
    private int reminderMinute;
    private Date startDate;

    public CRPPhysiologcalPeriodInfo() {
    }

    public CRPPhysiologcalPeriodInfo(int i8, int i9, Date date, boolean z7, boolean z8, boolean z9, boolean z10, int i10, int i11) {
        this.physiologcalPeriod = i8;
        this.menstrualPeriod = i9;
        this.startDate = date;
        this.menstrualReminder = z7;
        this.ovulationReminder = z8;
        this.ovulationDayReminder = z9;
        this.ovulationEndReminder = z10;
        this.reminderHour = i10;
        this.reminderMinute = i11;
    }

    public int getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    public int getPhysiologcalPeriod() {
        return this.physiologcalPeriod;
    }

    public int getReminderHour() {
        return this.reminderHour;
    }

    public int getReminderMinute() {
        return this.reminderMinute;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public boolean isAcrossYears() {
        return this.acrossYears;
    }

    public boolean isMenstrualReminder() {
        return this.menstrualReminder;
    }

    public boolean isOvulationDayReminder() {
        return this.ovulationDayReminder;
    }

    public boolean isOvulationEndReminder() {
        return this.ovulationEndReminder;
    }

    public boolean isOvulationReminder() {
        return this.ovulationReminder;
    }

    public void setAcrossYears(boolean z7) {
        this.acrossYears = z7;
    }

    public void setMenstrualPeriod(int i8) {
        this.menstrualPeriod = i8;
    }

    public void setMenstrualReminder(boolean z7) {
        this.menstrualReminder = z7;
    }

    public void setOvulationDayReminder(boolean z7) {
        this.ovulationDayReminder = z7;
    }

    public void setOvulationEndReminder(boolean z7) {
        this.ovulationEndReminder = z7;
    }

    public void setOvulationReminder(boolean z7) {
        this.ovulationReminder = z7;
    }

    public void setPhysiologcalPeriod(int i8) {
        this.physiologcalPeriod = i8;
    }

    public void setReminderHour(int i8) {
        this.reminderHour = i8;
    }

    public void setReminderMinute(int i8) {
        this.reminderMinute = i8;
    }

    public void setStartDate(Date date) {
        this.startDate = date;
    }

    public String toString() {
        return "CRPPhysiologcalPeriodInfo{physiologcalPeriod=" + this.physiologcalPeriod + ", menstrualPeriod=" + this.menstrualPeriod + ", startDate=" + this.startDate + ", menstrualReminder=" + this.menstrualReminder + ", ovulationReminder=" + this.ovulationReminder + ", ovulationDayReminder=" + this.ovulationDayReminder + ", ovulationEndReminder=" + this.ovulationEndReminder + ", reminderHour=" + this.reminderHour + ", reminderMinute=" + this.reminderMinute + ", acrossYears=" + this.acrossYears + '}';
    }
}
