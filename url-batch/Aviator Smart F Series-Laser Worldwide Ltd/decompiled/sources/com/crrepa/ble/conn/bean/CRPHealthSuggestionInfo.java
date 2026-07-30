package com.crrepa.ble.conn.bean;

import java.util.Map;

/* loaded from: classes3.dex */
public class CRPHealthSuggestionInfo {
    public static final int CODE_DATA_LESS = 2;
    public static final int CODE_NETWORK_ERROR = 3;
    public static final int CODE_PERMISSION_ERROR = 5;
    public static final int CODE_SEND_SUCCESS = 1;
    public static final int CODE_SERVER_ERROR = 4;
    public static final int TYPE_GENERAL_SUGGESTION = 6;
    public static final int TYPE_HEART_RATE = 1;
    public static final int TYPE_OXYGEN = 2;
    public static final int TYPE_SLEEP = 0;
    public static final int TYPE_STEPS = 3;
    public static final int TYPE_STRESS = 4;
    public static final int TYPE_WEIGHT = 5;
    private int code;
    private Map<Integer, String> suggestionMap;

    public CRPHealthSuggestionInfo(int i8) {
        this.code = i8;
    }

    public int getCode() {
        return this.code;
    }

    public Map<Integer, String> getSuggestionMap() {
        return this.suggestionMap;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setSuggestionMap(Map<Integer, String> map) {
        this.suggestionMap = map;
    }

    public String toString() {
        return "CRPHealthAnalysisInfo{code=" + this.code + ", suggestionMap=" + this.suggestionMap + '}';
    }

    public CRPHealthSuggestionInfo(Map<Integer, String> map) {
        this.suggestionMap = map;
        this.code = 1;
    }
}
