package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPBloodOxygenTimeType;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPBloodOxygenInfo {
    private List<Integer> list;
    private long startTime;
    private int timeInterval;
    private CRPBloodOxygenTimeType type;

    public CRPBloodOxygenInfo() {
    }

    public CRPBloodOxygenInfo(long j8, CRPBloodOxygenTimeType cRPBloodOxygenTimeType, List<Integer> list, int i8) {
        this.startTime = j8;
        this.type = cRPBloodOxygenTimeType;
        this.list = list;
        this.timeInterval = i8;
    }

    public List<Integer> getList() {
        return this.list;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getTimeInterval() {
        return this.timeInterval;
    }

    public CRPBloodOxygenTimeType getType() {
        return this.type;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void setStartTime(long j8) {
        this.startTime = j8;
    }

    public void setTimeInterval(int i8) {
        this.timeInterval = i8;
    }

    public void setType(CRPBloodOxygenTimeType cRPBloodOxygenTimeType) {
        this.type = cRPBloodOxygenTimeType;
    }

    public String toString() {
        return "CRPBloodOxygenInfo{startTime=" + this.startTime + ", type=" + this.type + ", list=" + this.list + ", timeInterval=" + this.timeInterval + '}';
    }
}
