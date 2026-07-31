package com.bytedance.sdk.component.hhw.zmn.fb.zmn;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public class zmn implements com.bytedance.sdk.component.hhw.zmn.fb.zmn {
    private long btk;
    private byte bvs;
    private byte fb;
    private fs fs;
    private long hhw;
    private String iv;
    private long nps;
    private int rc;
    private String zg;
    protected JSONObject zmn;
    private byte zn;

    public zmn(String str, JSONObject jSONObject) {
        this.zg = str;
        this.zmn = jSONObject;
    }

    public zmn(String str, fs fsVar) {
        this.zg = str;
        this.fs = fsVar;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public fs zmn() {
        return this.fs;
    }

    private zmn() {
    }

    public String iv() {
        return this.iv;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public synchronized JSONObject hhw() {
        fs fsVar;
        try {
            if (this.zmn == null && (fsVar = this.fs) != null) {
                this.zmn = fsVar.zmn(iv());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zmn;
    }

    public void zmn(byte b) {
        this.bvs = b;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public byte fs() {
        return this.bvs;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public String zn() {
        return this.zg;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public byte fb() {
        return this.zn;
    }

    public void fs(byte b) {
        this.zn = b;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public void zmn(long j) {
        this.btk = j;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public long nps() {
        return this.btk;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public void fs(long j) {
        this.hhw = j;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public long zg() {
        return this.hhw;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public void zn(long j) {
        this.nps = j;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public int bvs() {
        return this.rc;
    }

    public void zmn(int i) {
        this.rc = i;
    }

    public void zn(byte b) {
        this.fb = b;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn
    public byte btk() {
        return this.fb;
    }
}
