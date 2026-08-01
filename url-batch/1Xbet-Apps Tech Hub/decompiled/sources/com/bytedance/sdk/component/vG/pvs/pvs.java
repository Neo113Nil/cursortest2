package com.bytedance.sdk.component.vG.pvs;

import android.os.SystemClock;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: RequestHttpTime.java */
/* loaded from: classes.dex */
public class pvs {
    long Jd;
    long NB;
    long icD;
    long pvs = SystemClock.elapsedRealtime();
    long sUS;
    long so;
    long vG;
    long yiw;

    public void pvs() {
        this.vG = SystemClock.elapsedRealtime();
    }

    public void icD() {
        this.Jd = SystemClock.elapsedRealtime();
    }

    public void vG() {
        this.NB = SystemClock.elapsedRealtime();
    }

    public long Jd() {
        return this.pvs;
    }

    public void NB() {
        this.sUS = SystemClock.elapsedRealtime();
    }

    public long sUS() {
        return this.sUS;
    }

    public long yiw() {
        return this.vG;
    }

    public long so() {
        return this.Jd;
    }

    public long Mxy() {
        return this.NB;
    }

    public long Wyp() {
        return this.yiw;
    }

    public void qh() {
        this.yiw = SystemClock.elapsedRealtime();
    }

    public long kj() {
        return this.so;
    }

    public void Ju() {
        this.so = SystemClock.elapsedRealtime();
    }

    public long IP() {
        return this.icD;
    }

    public void bNS() {
        this.icD = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.pvs + ", asyncCallExecTs=" + this.icD + ", requestStartExecTs=" + this.vG + ", requestConnectStartTs=" + this.Jd + ", requestConnectFinishTs=" + this.NB + ", reqCallServerStartTs=" + this.yiw + ", reqCallServerFinishTs=" + this.so + AbstractJsonLexerKt.END_OBJ;
    }
}
