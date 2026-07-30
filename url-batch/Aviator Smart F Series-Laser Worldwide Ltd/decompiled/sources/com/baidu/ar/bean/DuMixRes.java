package com.baidu.ar.bean;

/* loaded from: classes.dex */
public class DuMixRes {
    public static final String JSON_AR_TYPE = "arType";
    public static final String JSON_CONTAIN_MUSIC = "containMusic";
    public static final String JSON_SUPPORT_FRONT_CAMERA = "supportFrontCamera";
    private int mArType = 0;
    private boolean mSupportFrontCamera = false;
    private boolean mContainMusic = false;

    public int getArType() {
        return this.mArType;
    }

    public boolean isContainMusic() {
        return this.mContainMusic;
    }

    public boolean isSupportFrontCamera() {
        return this.mSupportFrontCamera;
    }

    public void setArType(int i8) {
        this.mArType = i8;
    }

    public void setContainMusic(boolean z7) {
        this.mContainMusic = z7;
    }

    public void setSupportFrontCamera(boolean z7) {
        this.mSupportFrontCamera = z7;
    }
}
