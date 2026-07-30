package com.crrepa.ble.conn.bean;

import java.io.File;

/* loaded from: classes3.dex */
public class CRPWatchFaceInfo {
    private File file;
    private WacthFaceType type;

    public enum WacthFaceType {
        DEFAULT,
        SIFLI,
        JIELI,
        HISILICON
    }

    public CRPWatchFaceInfo(File file, WacthFaceType wacthFaceType) {
        this.file = file;
        this.type = wacthFaceType;
    }

    public File getFile() {
        return this.file;
    }

    public WacthFaceType getType() {
        return this.type;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setType(WacthFaceType wacthFaceType) {
        this.type = wacthFaceType;
    }

    public String toString() {
        return "CRPCustomizeWatchFaceInfo{file=" + this.file + ", type=" + this.type + '}';
    }
}
