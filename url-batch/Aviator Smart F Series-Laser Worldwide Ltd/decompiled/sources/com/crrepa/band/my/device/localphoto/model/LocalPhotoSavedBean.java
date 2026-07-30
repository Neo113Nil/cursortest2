package com.crrepa.band.my.device.localphoto.model;

import java.io.File;

/* loaded from: classes2.dex */
public class LocalPhotoSavedBean {
    public static final int UNCHECK_INDEX = -1;
    public int checkedIndex = -1;
    public File file;
    public String fileName;

    public LocalPhotoSavedBean(String str) {
        this.fileName = str;
    }

    public boolean isChecked() {
        return this.checkedIndex != -1;
    }

    public boolean isPhotoFileExist() {
        File file = this.file;
        return file != null && file.exists();
    }

    public void resetCheckIndex() {
        this.checkedIndex = -1;
    }
}
