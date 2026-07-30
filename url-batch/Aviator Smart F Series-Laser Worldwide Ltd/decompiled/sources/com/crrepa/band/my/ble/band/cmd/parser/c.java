package com.crrepa.band.my.ble.band.cmd.parser;

/* loaded from: classes2.dex */
public class c {
    public static final int FUNC_BOND = 2048;
    public static final int FUNC_GPS = 16384;
    public static final int FUNC_LYRIC = 4096;
    public static final int FUNC_MUSIC = 8192;
    public static final int FUNC_NORMAL = 0;
    public static final int FUNC_SCAN_CODE_BINDING = 128;
    public static final int FUNC_TALK = 32768;
    public static final int PLATFORM_BLUETRUM = 7;
    public static final int PLATFORM_GOODIX = 4;
    public static final int PLATFORM_HISILICON = 8;
    public static final int PLATFORM_HUNTERSUN = 2;
    public static final int PLATFORM_JIELI = 6;
    public static final int PLATFORM_NORDIC = 1;
    public static final int PLATFORM_REALTEK = 3;
    public static final int PLATFORM_SIFLI = 5;
    private int chipId;
    private String firmwareType;
    private int function;
    private int platform;

    public int getChipId() {
        return this.chipId;
    }

    public String getFirmwareType() {
        return this.firmwareType;
    }

    public int getFunction() {
        return this.function;
    }

    public int getPlatform() {
        return this.platform;
    }

    public void setChipId(int i8) {
        this.chipId = i8;
    }

    public void setFirmwareType(String str) {
        this.firmwareType = str;
    }

    public void setFunction(int i8) {
        this.function = i8;
    }

    public void setPlatform(int i8) {
        this.platform = i8;
    }
}
