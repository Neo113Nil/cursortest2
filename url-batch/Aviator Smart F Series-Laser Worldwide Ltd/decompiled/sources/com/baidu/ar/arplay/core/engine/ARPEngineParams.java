package com.baidu.ar.arplay.core.engine;

/* loaded from: classes.dex */
public class ARPEngineParams {
    private float mDensity;
    private int mInputHeight;
    private int mInputWidth;
    private boolean mIsFrontCamera = true;
    private int mOutputHeight;
    private int mOutputWidth;
    private String mShaderDBPath;

    public float getDensity() {
        return this.mDensity;
    }

    public int getInputHeight() {
        return this.mInputHeight;
    }

    public int getInputWidth() {
        return this.mInputWidth;
    }

    public int getOutputHeight() {
        return this.mOutputHeight;
    }

    public int getOutputWidth() {
        return this.mOutputWidth;
    }

    public String getShaderDBPath() {
        return this.mShaderDBPath;
    }

    public boolean isIsFrontCamera() {
        return this.mIsFrontCamera;
    }

    public void setDensity(float f8) {
        this.mDensity = f8;
    }

    public void setInputHeight(int i8) {
        this.mInputHeight = i8;
    }

    public void setInputWidth(int i8) {
        this.mInputWidth = i8;
    }

    public void setIsFrontCamera(boolean z7) {
        this.mIsFrontCamera = z7;
    }

    public void setOutputHeight(int i8) {
        this.mOutputHeight = i8;
    }

    public void setOutputWidth(int i8) {
        this.mOutputWidth = i8;
    }

    public void setShaderDBPath(String str) {
        this.mShaderDBPath = str;
    }
}
