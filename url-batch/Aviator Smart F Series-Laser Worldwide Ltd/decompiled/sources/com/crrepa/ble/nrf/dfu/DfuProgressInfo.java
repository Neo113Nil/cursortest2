package com.crrepa.ble.nrf.dfu;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
class DfuProgressInfo {
    private int bytesReceived;
    private int bytesSent;
    private int currentPart;
    private int imageSizeInBytes;
    private int initialBytesSent;
    private int lastBytesSent;
    private long lastProgressTime;
    private final ProgressListener mListener;
    private int maxObjectSizeInBytes;
    private int progress;
    private long timeStart;
    private int totalParts;

    interface ProgressListener {
        void updateProgressNotification();
    }

    DfuProgressInfo(@NonNull ProgressListener progressListener) {
        this.mListener = progressListener;
    }

    void addBytesSent(int i8) {
        setBytesSent(this.bytesSent + i8);
    }

    int getAvailableObjectSizeIsBytes() {
        int i8 = this.imageSizeInBytes;
        int i9 = this.bytesSent;
        int i10 = this.maxObjectSizeInBytes;
        return Math.min(i8 - i9, i10 - (i9 % i10));
    }

    float getAverageSpeed() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.timeStart;
        if (elapsedRealtime != 0) {
            return (this.bytesSent - this.initialBytesSent) / elapsedRealtime;
        }
        return 0.0f;
    }

    int getBytesReceived() {
        return this.bytesReceived;
    }

    int getBytesSent() {
        return this.bytesSent;
    }

    int getCurrentPart() {
        return this.currentPart;
    }

    int getImageSizeInBytes() {
        return this.imageSizeInBytes;
    }

    int getProgress() {
        return this.progress;
    }

    float getSpeed() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        float f8 = elapsedRealtime - this.timeStart != 0 ? (this.bytesSent - this.lastBytesSent) / (elapsedRealtime - this.lastProgressTime) : 0.0f;
        this.lastProgressTime = elapsedRealtime;
        this.lastBytesSent = this.bytesSent;
        return f8;
    }

    int getTotalParts() {
        return this.totalParts;
    }

    DfuProgressInfo init(int i8, int i9, int i10) {
        this.imageSizeInBytes = i8;
        this.maxObjectSizeInBytes = Integer.MAX_VALUE;
        this.currentPart = i9;
        this.totalParts = i10;
        return this;
    }

    boolean isComplete() {
        return this.bytesSent == this.imageSizeInBytes;
    }

    boolean isLastPart() {
        return this.currentPart == this.totalParts;
    }

    boolean isObjectComplete() {
        return this.bytesSent % this.maxObjectSizeInBytes == 0;
    }

    void setBytesReceived(int i8) {
        this.bytesReceived = i8;
    }

    void setBytesSent(int i8) {
        if (this.timeStart == 0) {
            this.timeStart = SystemClock.elapsedRealtime();
            this.initialBytesSent = i8;
        }
        this.bytesSent = i8;
        this.progress = (int) ((i8 * 100.0f) / this.imageSizeInBytes);
        this.mListener.updateProgressNotification();
    }

    void setMaxObjectSizeInBytes(int i8) {
        this.maxObjectSizeInBytes = i8;
    }

    public void setProgress(int i8) {
        this.progress = i8;
        this.mListener.updateProgressNotification();
    }

    DfuProgressInfo setTotalPart(int i8) {
        this.totalParts = i8;
        return this;
    }
}
