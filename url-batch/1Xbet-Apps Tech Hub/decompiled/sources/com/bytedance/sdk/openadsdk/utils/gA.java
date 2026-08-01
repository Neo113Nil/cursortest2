package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* compiled from: TimeStamp.java */
/* loaded from: classes2.dex */
public class gA {
    private long icD;
    public long pvs;

    private gA(boolean z) {
        if (z) {
            Jd();
        }
    }

    public static gA pvs() {
        return new gA(true);
    }

    public static gA icD() {
        return new gA(false);
    }

    public long vG() {
        return SystemClock.elapsedRealtime() - this.icD;
    }

    public long pvs(gA gAVar) {
        return Math.abs(gAVar.icD - this.icD);
    }

    public void Jd() {
        this.pvs = System.currentTimeMillis();
        this.icD = SystemClock.elapsedRealtime();
    }

    public boolean NB() {
        return this.icD > 0;
    }

    public String toString() {
        return String.valueOf(this.pvs);
    }
}
