package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class v {
    private double bitrate;
    private long sessionId;
    private long size;
    private double speed;
    private double time;
    private float videoFps;
    private int videoFrameNumber;
    private float videoQuality;

    public v(long j8, int i8, float f8, float f9, long j9, double d8, double d9, double d10) {
        this.sessionId = j8;
        this.videoFrameNumber = i8;
        this.videoFps = f8;
        this.videoQuality = f9;
        this.size = j9;
        this.time = d8;
        this.bitrate = d9;
        this.speed = d10;
    }

    public double getBitrate() {
        return this.bitrate;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public long getSize() {
        return this.size;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getTime() {
        return this.time;
    }

    public float getVideoFps() {
        return this.videoFps;
    }

    public int getVideoFrameNumber() {
        return this.videoFrameNumber;
    }

    public float getVideoQuality() {
        return this.videoQuality;
    }

    public void setBitrate(double d8) {
        this.bitrate = d8;
    }

    public void setSessionId(long j8) {
        this.sessionId = j8;
    }

    public void setSize(long j8) {
        this.size = j8;
    }

    public void setSpeed(double d8) {
        this.speed = d8;
    }

    public void setTime(double d8) {
        this.time = d8;
    }

    public void setVideoFps(float f8) {
        this.videoFps = f8;
    }

    public void setVideoFrameNumber(int i8) {
        this.videoFrameNumber = i8;
    }

    public void setVideoQuality(float f8) {
        this.videoQuality = f8;
    }

    public String toString() {
        return "Statistics{sessionId=" + this.sessionId + ", videoFrameNumber=" + this.videoFrameNumber + ", videoFps=" + this.videoFps + ", videoQuality=" + this.videoQuality + ", size=" + this.size + ", time=" + this.time + ", bitrate=" + this.bitrate + ", speed=" + this.speed + '}';
    }
}
