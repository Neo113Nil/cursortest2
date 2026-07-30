package com.crrepa.band.my.model;

/* loaded from: classes2.dex */
public class BandFunctionModel {
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
    private boolean enable;
    private int function;
    private byte index;
    private String name;

    public BandFunctionModel() {
    }

    public int getFunction() {
        return this.function;
    }

    public byte getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z7) {
        this.enable = z7;
    }

    public void setFunction(int i8) {
        this.function = i8;
    }

    public void setIndex(byte b8) {
        this.index = b8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public BandFunctionModel(byte b8, int i8, boolean z7, String str) {
        this.index = b8;
        this.function = i8;
        this.enable = z7;
        this.name = str;
    }
}
