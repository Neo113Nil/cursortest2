package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPPillReminderInfo {
    private int dateOffset;
    private int id;
    private String name;
    private List<ReminderTimeBean> reminderTimeList;
    private int repeat;

    public static class ReminderTimeBean {
        private int count;
        private int time;

        public ReminderTimeBean(int i8, int i9) {
            this.time = i8;
            this.count = i9;
        }

        public int getCount() {
            return this.count;
        }

        public int getTime() {
            return this.time;
        }

        public void setCount(int i8) {
            this.count = i8;
        }

        public void setTime(int i8) {
            this.time = i8;
        }
    }

    public CRPPillReminderInfo() {
    }

    public CRPPillReminderInfo(int i8, int i9, String str, int i10, List<ReminderTimeBean> list) {
        this.id = i8;
        this.dateOffset = i9;
        this.name = str;
        this.repeat = i10;
        this.reminderTimeList = list;
    }

    public int getDateOffset() {
        return this.dateOffset;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<ReminderTimeBean> getReminderTimeList() {
        return this.reminderTimeList;
    }

    public int getRepeat() {
        return this.repeat;
    }

    public void setDateOffset(int i8) {
        this.dateOffset = i8;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setReminderTimeList(List<ReminderTimeBean> list) {
        this.reminderTimeList = list;
    }

    public void setRepeat(int i8) {
        this.repeat = i8;
    }

    public String toString() {
        return "CRPPillReminderInfo{id=" + this.id + ", dateOffset=" + this.dateOffset + ", name='" + this.name + "', repeat=" + this.repeat + ", reminderTimeList=" + this.reminderTimeList + '}';
    }
}
