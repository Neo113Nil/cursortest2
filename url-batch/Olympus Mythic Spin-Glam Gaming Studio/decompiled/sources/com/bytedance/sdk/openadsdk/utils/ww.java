package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public class ww {
    private long fs;
    public long zmn;

    public long zmn() {
        return this.fs;
    }

    private ww(boolean z) {
        if (z) {
            btk();
        }
    }

    public static ww fs() {
        return new ww(true);
    }

    public static ww zn() {
        return new ww(false);
    }

    public long fb() {
        return SystemClock.elapsedRealtime() - this.fs;
    }

    public long zmn(ww wwVar) {
        return Math.abs(wwVar.fs - this.fs);
    }

    public void btk() {
        this.zmn = System.currentTimeMillis();
        this.fs = SystemClock.elapsedRealtime();
    }

    public boolean hhw() {
        return this.fs > 0;
    }

    public String toString() {
        return String.valueOf(this.zmn);
    }
}
