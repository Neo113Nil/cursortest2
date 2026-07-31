package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* loaded from: classes15.dex */
public class kgc {
    private boolean btk;
    private double fb;
    private int fs;
    private String hhw;
    private String zmn;
    private int zn;

    public String zmn() {
        return this.zmn;
    }

    public void zmn(String str) {
        this.zmn = str;
    }

    public int fs() {
        return this.fs;
    }

    public void zmn(int i) {
        this.fs = i;
    }

    public int zn() {
        return this.zn;
    }

    public void fs(int i) {
        this.zn = i;
    }

    public double fb() {
        return this.fb;
    }

    public boolean btk() {
        return !TextUtils.isEmpty(this.zmn) && this.fs > 0 && this.zn > 0;
    }

    public boolean hhw() {
        return this.btk;
    }

    public void zmn(boolean z) {
        this.btk = z;
    }

    public String nps() {
        return this.hhw;
    }

    public void fs(String str) {
        this.hhw = str;
    }
}
