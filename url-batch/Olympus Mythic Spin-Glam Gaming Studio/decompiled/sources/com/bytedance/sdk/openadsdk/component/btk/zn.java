package com.bytedance.sdk.openadsdk.component.btk;

import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes4.dex */
public class zn {
    private int btk;
    private com.bytedance.sdk.openadsdk.core.model.zmn fb;
    private int fs;
    private String hhw;
    private boolean nps;
    private int zmn;
    private nqi zn;

    public zn(int i, int i2, nqi nqiVar, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        this.zmn = i;
        this.fs = i2;
        this.zn = nqiVar;
        this.fb = zmnVar;
    }

    public zn(int i, int i2, int i3, String str) {
        this.zmn = i;
        this.fs = i2;
        this.btk = i3;
        this.hhw = str;
    }

    public com.bytedance.sdk.openadsdk.core.model.zmn zmn() {
        return this.fb;
    }

    public void zmn(boolean z) {
        this.nps = z;
    }

    public int fs() {
        return this.zmn;
    }

    public int zn() {
        return this.fs;
    }

    public nqi fb() {
        return this.zn;
    }

    public int btk() {
        return this.btk;
    }

    public String hhw() {
        return this.hhw;
    }
}
