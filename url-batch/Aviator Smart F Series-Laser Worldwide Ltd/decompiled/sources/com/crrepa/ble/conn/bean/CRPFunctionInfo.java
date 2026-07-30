package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPFunctionInfo {
    public static final int BO_VIEW = 7;
    public static final int BP_VIEW = 6;
    public static final int CAMERA_VIEW = 11;
    public static final int HR_VIEW = 4;
    public static final int MSG_LIST_VIEW = 9;
    public static final int MUSIC_PLAYER_VIEW = 10;
    public static final int OTHER_VIEW = 12;
    public static final int SLEEP_VIEW = 3;
    public static final int STEP_VIEW = 2;
    public static final int TIME_VIEW = 1;
    public static final int TRAINING_VIEW = 5;
    public static final int WEATHER_VIEW = 8;
    private boolean displayFunction;
    private List<Integer> functionList;

    public CRPFunctionInfo() {
    }

    public CRPFunctionInfo(List<Integer> list, boolean z7) {
        this.functionList = list;
        this.displayFunction = z7;
    }

    public List<Integer> getFunctionList() {
        return this.functionList;
    }

    public boolean isDisplayFunction() {
        return this.displayFunction;
    }

    public void setDisplayFunction(boolean z7) {
        this.displayFunction = z7;
    }

    public void setFunctionList(List<Integer> list) {
        this.functionList = list;
    }

    public String toString() {
        return "CRPFunctionInfo{functionList=" + this.functionList + ", displayFunction=" + this.displayFunction + '}';
    }
}
