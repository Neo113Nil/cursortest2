package com.crrepa.band.my.model;

/* loaded from: classes2.dex */
public class NumberPickerModel {
    private int max;
    private int min;
    private int unit;

    public NumberPickerModel(int i8, int i9, int i10) {
        this.min = i8;
        this.max = i9;
        this.unit = i10;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public int getUnit() {
        return this.unit;
    }

    public void setMax(int i8) {
        this.max = i8;
    }

    public void setMin(int i8) {
        this.min = i8;
    }

    public void setUnit(int i8) {
        this.unit = i8;
    }
}
