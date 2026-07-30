package com.liulishuo.filedownloader;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public class b implements u, t {
    private long mLastRefreshSofarBytes;
    private long mLastRefreshTime;
    private int mMinIntervalUpdateSpeed = 1000;
    private int mSpeed;
    private long mStartSofarBytes;
    private long mStartTime;
    private long mTotalBytes;

    @Override // com.liulishuo.filedownloader.u
    public void end(long j8) {
        if (this.mStartTime <= 0) {
            return;
        }
        long j9 = j8 - this.mStartSofarBytes;
        this.mLastRefreshTime = 0L;
        long uptimeMillis = SystemClock.uptimeMillis() - this.mStartTime;
        if (uptimeMillis <= 0) {
            this.mSpeed = (int) j9;
        } else {
            this.mSpeed = (int) (j9 / uptimeMillis);
        }
    }

    @Override // com.liulishuo.filedownloader.t
    public int getSpeed() {
        return this.mSpeed;
    }

    @Override // com.liulishuo.filedownloader.u
    public void reset() {
        this.mSpeed = 0;
        this.mLastRefreshTime = 0L;
    }

    @Override // com.liulishuo.filedownloader.t
    public void setMinIntervalUpdateSpeed(int i8) {
        this.mMinIntervalUpdateSpeed = i8;
    }

    @Override // com.liulishuo.filedownloader.u
    public void start(long j8) {
        this.mStartTime = SystemClock.uptimeMillis();
        this.mStartSofarBytes = j8;
    }

    @Override // com.liulishuo.filedownloader.u
    public void update(long j8) {
        if (this.mMinIntervalUpdateSpeed <= 0) {
            return;
        }
        if (this.mLastRefreshTime != 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.mLastRefreshTime;
            if (uptimeMillis < this.mMinIntervalUpdateSpeed && (this.mSpeed != 0 || uptimeMillis <= 0)) {
                return;
            }
            int i8 = (int) ((j8 - this.mLastRefreshSofarBytes) / uptimeMillis);
            this.mSpeed = i8;
            this.mSpeed = Math.max(0, i8);
        }
        this.mLastRefreshSofarBytes = j8;
        this.mLastRefreshTime = SystemClock.uptimeMillis();
    }
}
