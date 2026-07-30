package com.baidu.ar.arplay.core.pixel;

/* loaded from: classes.dex */
public class FrameSize {
    private int mHeight;
    private int mWidth;

    public FrameSize(int i8, int i9) {
        this.mWidth = i8;
        this.mHeight = i9;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setHeight(int i8) {
        this.mHeight = i8;
    }

    public void setWidth(int i8) {
        this.mWidth = i8;
    }

    public FrameSize(FrameSize frameSize) {
        this.mWidth = frameSize.getWidth();
        this.mHeight = frameSize.getHeight();
    }
}
