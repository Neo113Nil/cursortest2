package com.crrepa.band.my.model;

import java.util.Calendar;

/* loaded from: classes2.dex */
public class PhysiologcalPeriodModel {
    private int menstrualDay;
    private int menstrualMonth;
    private int menstrualPeriod;
    private int menstrualYear;
    private int physiologicalPeriod;

    public PhysiologcalPeriodModel() {
    }

    public int getDayOffset(PhysiologcalPeriodModel physiologcalPeriodModel) {
        if (physiologcalPeriodModel == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.menstrualYear, this.menstrualMonth - 1, this.menstrualDay);
        int i8 = calendar.get(1);
        int i9 = calendar.get(6);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(physiologcalPeriodModel.menstrualYear, physiologcalPeriodModel.menstrualMonth - 1, physiologcalPeriodModel.menstrualDay);
        return (((calendar2.get(1) - i8) * 365) + calendar2.get(6)) - i9;
    }

    public int getMenstrualDay() {
        return this.menstrualDay;
    }

    public int getMenstrualMonth() {
        return this.menstrualMonth;
    }

    public int getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    public int getMenstrualYear() {
        return this.menstrualYear;
    }

    public int getPhysiologicalPeriod() {
        return this.physiologicalPeriod;
    }

    public void setMenstrualDay(int i8) {
        this.menstrualDay = i8;
    }

    public void setMenstrualMonth(int i8) {
        this.menstrualMonth = i8;
    }

    public void setMenstrualPeriod(int i8) {
        this.menstrualPeriod = i8;
    }

    public void setMenstrualYear(int i8) {
        this.menstrualYear = i8;
    }

    public void setPhysiologicalPeriod(int i8) {
        this.physiologicalPeriod = i8;
    }

    public String toString() {
        return "PhysiologcalPeriodModel{menstrualYear=" + this.menstrualYear + ", menstrualMonth=" + this.menstrualMonth + ", menstrualDay=" + this.menstrualDay + ", menstrualPeriod=" + this.menstrualPeriod + ", physiologicalPeriod=" + this.physiologicalPeriod + '}';
    }

    public PhysiologcalPeriodModel(int i8, int i9, int i10, int i11, int i12) {
        this.menstrualYear = i8;
        this.menstrualMonth = i9;
        this.menstrualDay = i10;
        this.menstrualPeriod = i11;
        this.physiologicalPeriod = i12;
    }
}
