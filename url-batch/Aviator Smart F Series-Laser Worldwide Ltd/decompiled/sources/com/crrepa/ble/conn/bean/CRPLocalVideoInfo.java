package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPLocalVideoInfo {
    private static final int DEFAULT_MAX_DURATION = 15;
    private int availableSize;
    private int height;
    private int maxCount;
    private int maxDuration = 15;
    private int savedCount;
    private int videoCornerRadius;
    private int videoHeight;
    private List<String> videoList;
    private int videoWidth;
    private int width;

    public int getAvailableSize() {
        return this.availableSize;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxCount() {
        return this.maxCount;
    }

    public int getMaxDuration() {
        return this.maxDuration;
    }

    public int getSavedCount() {
        return this.savedCount;
    }

    public int getVideoCornerRadius() {
        return this.videoCornerRadius;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public List<String> getVideoList() {
        return this.videoList;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAvailableSize(int i8) {
        this.availableSize = i8;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setMaxCount(int i8) {
        this.maxCount = i8;
    }

    public void setMaxDuration(int i8) {
        this.maxDuration = i8;
    }

    public void setSavedCount(int i8) {
        this.savedCount = i8;
    }

    public void setVideoCornerRadius(int i8) {
        this.videoCornerRadius = i8;
    }

    public void setVideoHeight(int i8) {
        this.videoHeight = i8;
    }

    public void setVideoList(List<String> list) {
        this.videoList = list;
    }

    public void setVideoWidth(int i8) {
        this.videoWidth = i8;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }

    public String toString() {
        return "CRPLocalVideoInfo{width=" + this.width + ", height=" + this.height + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", videoCornerRadius=" + this.videoCornerRadius + ", maxCount=" + this.maxCount + ", savedCount=" + this.savedCount + ", maxDuration=" + this.maxDuration + ", availableSize=" + this.availableSize + ", videoList=" + this.videoList + '}';
    }
}
