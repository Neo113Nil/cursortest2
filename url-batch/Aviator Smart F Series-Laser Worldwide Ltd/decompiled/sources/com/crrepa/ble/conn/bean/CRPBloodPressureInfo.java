package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPBloodPressureInfo {
    private List<BpBean> list;
    private long startTime;
    private int timeInterval;
    private TimeType type;

    public static class BpBean {
        private int dbp;
        private int sbp;

        public BpBean(int i8, int i9) {
            this.sbp = i8;
            this.dbp = i9;
        }

        public int getDbp() {
            return this.dbp;
        }

        public int getSbp() {
            return this.sbp;
        }

        public void setDbp(int i8) {
            this.dbp = i8;
        }

        public void setSbp(int i8) {
            this.sbp = i8;
        }
    }

    public enum TimeType {
        TODAY,
        YESTERDAY
    }

    public CRPBloodPressureInfo() {
    }

    public CRPBloodPressureInfo(long j8, TimeType timeType, List<BpBean> list, int i8) {
        this.startTime = j8;
        this.type = timeType;
        this.list = list;
        this.timeInterval = i8;
    }

    public List<BpBean> getList() {
        return this.list;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getTimeInterval() {
        return this.timeInterval;
    }

    public TimeType getType() {
        return this.type;
    }

    public void setList(List<BpBean> list) {
        this.list = list;
    }

    public void setStartTime(long j8) {
        this.startTime = j8;
    }

    public void setTimeInterval(int i8) {
        this.timeInterval = i8;
    }

    public void setType(TimeType timeType) {
        this.type = timeType;
    }

    public String toString() {
        return "CRPBloodPressureInfo{startTime=" + this.startTime + ", type=" + this.type + ", list=" + this.list + ", timeInterval=" + this.timeInterval + '}';
    }
}
