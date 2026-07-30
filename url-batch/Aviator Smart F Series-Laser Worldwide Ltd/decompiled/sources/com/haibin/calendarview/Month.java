package com.haibin.calendarview;

import java.io.Serializable;

/* loaded from: classes4.dex */
final class Month implements Serializable {
    private int count;
    private int diff;
    private int month;
    private int year;

    Month() {
    }

    int getCount() {
        return this.count;
    }

    int getDiff() {
        return this.diff;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    void setCount(int i8) {
        this.count = i8;
    }

    void setDiff(int i8) {
        this.diff = i8;
    }

    void setMonth(int i8) {
        this.month = i8;
    }

    void setYear(int i8) {
        this.year = i8;
    }
}
