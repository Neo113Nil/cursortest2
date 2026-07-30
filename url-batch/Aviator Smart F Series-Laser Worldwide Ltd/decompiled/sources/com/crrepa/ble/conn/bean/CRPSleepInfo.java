package com.crrepa.ble.conn.bean;

import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPSleepInfo {
    public static final int SLEEP_STATE_LIGHT = 1;
    public static final int SLEEP_STATE_REM = 3;
    public static final int SLEEP_STATE_RESTFUL = 2;
    public static final int SLEEP_STATE_SOBER = 0;
    private Date date;
    private List<DetailBean> details;
    private int lightTime;
    private int remTime;
    private int restfulTime;
    private int soberTime;
    private int totalTime;

    public static class DetailBean {
        private int endTime;
        private int startTime;
        private int totalTime;
        private int type;

        public int getEndTime() {
            return this.endTime;
        }

        public int getStartTime() {
            return this.startTime;
        }

        public int getTotalTime() {
            return this.totalTime;
        }

        public int getType() {
            return this.type;
        }

        public void setEndTime(int i8) {
            this.endTime = i8;
        }

        public void setStartTime(int i8) {
            this.startTime = i8;
        }

        public void setTotalTime(int i8) {
            this.totalTime = i8;
        }

        public void setType(int i8) {
            this.type = i8;
        }

        public String toString() {
            return "DetailBean{startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalTime=" + this.totalTime + ", type=" + this.type + '}';
        }
    }

    public Date getDate() {
        return this.date;
    }

    public List<DetailBean> getDetails() {
        return this.details;
    }

    public int getLightTime() {
        return this.lightTime;
    }

    public int getRemTime() {
        return this.remTime;
    }

    public int getRestfulTime() {
        return this.restfulTime;
    }

    public int getSoberTime() {
        return this.soberTime;
    }

    public int getTotalTime() {
        return this.totalTime;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDetails(List<DetailBean> list) {
        this.details = list;
    }

    public void setLightTime(int i8) {
        this.lightTime = i8;
    }

    public void setRemTime(int i8) {
        this.remTime = i8;
    }

    public void setRestfulTime(int i8) {
        this.restfulTime = i8;
    }

    public void setSoberTime(int i8) {
        this.soberTime = i8;
    }

    public void setTotalTime(int i8) {
        this.totalTime = i8;
    }

    public String toString() {
        return "CRPSleepInfo{date=" + this.date + ", totalTime=" + this.totalTime + ", restfulTime=" + this.restfulTime + ", lightTime=" + this.lightTime + ", soberTime=" + this.soberTime + ", remTime=" + this.remTime + ", details=" + this.details + '}';
    }
}
