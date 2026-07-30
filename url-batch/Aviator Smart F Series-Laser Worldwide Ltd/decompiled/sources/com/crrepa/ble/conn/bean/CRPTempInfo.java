package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPTempTimeType;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPTempInfo {
    public static final int DEFAULT_MEASURE_INTERVAL = 30;
    private int measureInterval = 30;
    private long startTime;
    private List<Float> tempList;
    private CRPTempTimeType type;

    public CRPTempInfo(CRPTempTimeType cRPTempTimeType, long j8, List<Float> list) {
        this.type = cRPTempTimeType;
        this.startTime = j8;
        this.tempList = list;
    }

    public int getMeasureInterval() {
        return this.measureInterval;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public List<Float> getTempList() {
        return this.tempList;
    }

    public CRPTempTimeType getType() {
        return this.type;
    }

    public void setMeasureInterval(int i8) {
        this.measureInterval = i8;
    }

    public void setStartTime(long j8) {
        this.startTime = j8;
    }

    public void setTempList(List<Float> list) {
        this.tempList = list;
    }

    public void setType(CRPTempTimeType cRPTempTimeType) {
        this.type = cRPTempTimeType;
    }

    public String toString() {
        return "CRPTempInfo{type=" + this.type + ", startTime=" + this.startTime + ", measureInterval=" + this.measureInterval + ", tempList=" + this.tempList + '}';
    }
}
