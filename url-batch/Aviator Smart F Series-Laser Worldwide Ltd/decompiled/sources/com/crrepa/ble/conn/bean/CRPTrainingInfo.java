package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPTrainingInfo {
    private CRPTrainingAdvancedInfo advancedInfo;
    private List<Integer> altitudeList;
    private int calories;
    private int distance;
    private List<Integer> distanceList;
    private long endTime;
    private List<Integer> hrList;
    private int id;
    private long startTime;
    private int steps;
    private List<Integer> stepsList;
    private int type;
    private int validTime;

    public CRPTrainingAdvancedInfo getAdvancedInfo() {
        return this.advancedInfo;
    }

    public List<Integer> getAltitudeList() {
        return this.altitudeList;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getDistance() {
        return this.distance;
    }

    public List<Integer> getDistanceList() {
        return this.distanceList;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public List<Integer> getHrList() {
        return this.hrList;
    }

    public int getId() {
        return this.id;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getSteps() {
        return this.steps;
    }

    public List<Integer> getStepsList() {
        return this.stepsList;
    }

    public int getType() {
        return this.type;
    }

    public int getValidTime() {
        return this.validTime;
    }

    public void setAdvancedInfo(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        this.advancedInfo = cRPTrainingAdvancedInfo;
    }

    public void setAltitudeList(List<Integer> list) {
        this.altitudeList = list;
    }

    public void setCalories(int i8) {
        this.calories = i8;
    }

    public void setDistance(int i8) {
        this.distance = i8;
    }

    public void setDistanceList(List<Integer> list) {
        this.distanceList = list;
    }

    public void setEndTime(long j8) {
        this.endTime = j8;
    }

    public void setHrList(List<Integer> list) {
        this.hrList = list;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setStartTime(long j8) {
        this.startTime = j8;
    }

    public void setSteps(int i8) {
        this.steps = i8;
    }

    public void setStepsList(List<Integer> list) {
        this.stepsList = list;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    public void setValidTime(int i8) {
        this.validTime = i8;
    }

    public String toString() {
        return "CRPTrainingInfo{id=" + this.id + ", type=" + this.type + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", validTime=" + this.validTime + ", steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ", hrList=" + this.hrList + ", stepsList=" + this.stepsList + ", distanceList=" + this.distanceList + '}';
    }
}
