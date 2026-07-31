package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.ww;

/* loaded from: classes6.dex */
public class so {
    private long btk;
    private long bvs;
    public long fs;
    private long hhw;
    private long iv;
    private long klz;
    private int mw;
    private long nps;
    private int rc;
    private long zg;
    public boolean zmn;
    private ww zn = ww.zn();
    private ww fb = ww.zn();

    public void zmn(ww wwVar, ww wwVar2, int i, ww wwVar3) {
        this.btk = wwVar.zmn(this.zn);
        this.hhw = wwVar2.zmn(wwVar);
        this.nps = i;
        this.zg = wwVar3.zmn(wwVar2);
    }

    public void zmn(ww wwVar) {
        this.zn = wwVar;
    }

    public void fs(ww wwVar) {
        this.fb = wwVar;
        this.bvs = wwVar.zmn(this.zn);
    }

    public ww zmn() {
        return this.zn;
    }

    public long fs() {
        return this.btk;
    }

    public long zn() {
        return this.hhw;
    }

    public long fb() {
        return this.nps;
    }

    public long btk() {
        return this.zg;
    }

    public long hhw() {
        return this.bvs;
    }

    public long nps() {
        return this.iv;
    }

    public void zmn(long j) {
        this.iv = j;
    }

    public int zg() {
        return this.rc;
    }

    public void zmn(int i) {
        this.rc = i;
    }

    public void fs(long j) {
        this.klz = j;
    }

    public long bvs() {
        return this.klz;
    }

    public synchronized void fs(int i) {
        this.mw = i;
    }

    public synchronized int iv() {
        return this.mw;
    }
}
