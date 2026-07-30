package com.baidu.ar.arplay.core.renderer;

/* loaded from: classes.dex */
public abstract class DetectParams {
    private long mFrameBufferAddr;
    private long mTimestamp;

    public long getFrameBufferAddr() {
        return this.mFrameBufferAddr;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public void setFrameBufferAddr(long j8) {
        this.mFrameBufferAddr = j8;
    }

    public void setTimestamp(long j8) {
        this.mTimestamp = j8;
    }
}
