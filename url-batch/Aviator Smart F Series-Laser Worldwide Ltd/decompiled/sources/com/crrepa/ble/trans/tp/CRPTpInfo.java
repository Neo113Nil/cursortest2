package com.crrepa.ble.trans.tp;

import java.io.File;

/* loaded from: classes3.dex */
public class CRPTpInfo {
    private int deviceStartIndex;
    private File file;
    private String firmwareVersion;
    private int length;
    private int startIndex;

    public int getDeviceStartIndex() {
        return this.deviceStartIndex;
    }

    public File getFile() {
        return this.file;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public int getLength() {
        return this.length;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public void setDeviceStartIndex(int i8) {
        this.deviceStartIndex = i8;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setLength(int i8) {
        this.length = i8;
    }

    public void setStartIndex(int i8) {
        this.startIndex = i8;
    }
}
