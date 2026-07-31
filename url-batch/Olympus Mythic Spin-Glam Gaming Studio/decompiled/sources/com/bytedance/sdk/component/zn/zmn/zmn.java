package com.bytedance.sdk.component.zn.zmn;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class zmn {
    long btk;
    long fb;
    long fs;
    long hhw;
    long nps;
    long zg;
    long zmn = SystemClock.elapsedRealtime();
    long zn;

    public void zmn() {
        this.zn = SystemClock.elapsedRealtime();
    }

    public void fs() {
        this.fb = SystemClock.elapsedRealtime();
    }

    public void zn() {
        this.btk = SystemClock.elapsedRealtime();
    }

    public long fb() {
        return this.zmn;
    }

    public void btk() {
        this.hhw = SystemClock.elapsedRealtime();
    }

    public long hhw() {
        return this.hhw;
    }

    public long nps() {
        return this.zn;
    }

    public long zg() {
        return this.fb;
    }

    public long bvs() {
        return this.btk;
    }

    public long iv() {
        return this.nps;
    }

    public void rc() {
        this.nps = SystemClock.elapsedRealtime();
    }

    public long klz() {
        return this.zg;
    }

    public void mw() {
        this.zg = SystemClock.elapsedRealtime();
    }

    public long rt() {
        return this.fs;
    }

    public void cn() {
        this.fs = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.zmn + ", asyncCallExecTs=" + this.fs + ", requestStartExecTs=" + this.zn + ", requestConnectStartTs=" + this.fb + ", requestConnectFinishTs=" + this.btk + ", reqCallServerStartTs=" + this.nps + ", reqCallServerFinishTs=" + this.zg + '}';
    }
}
