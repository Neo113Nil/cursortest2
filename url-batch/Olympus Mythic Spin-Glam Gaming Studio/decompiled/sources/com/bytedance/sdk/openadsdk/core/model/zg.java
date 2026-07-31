package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;

/* loaded from: classes3.dex */
public class zg {
    private List<String> btk;
    private int fb;
    private int fs;
    private int hhw;
    private int nps;
    private int zmn;
    private List<Integer> zn;

    public boolean zmn() {
        return this.hhw == 1;
    }

    public void zmn(int i) {
        this.hhw = i;
    }

    public int fs() {
        int i = this.nps;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    public void fs(int i) {
        this.nps = i;
    }

    public List<String> zn() {
        return this.btk;
    }

    public void zmn(List<String> list) {
        this.btk = list;
    }

    public int fb() {
        return this.zmn;
    }

    public void zn(int i) {
        this.zmn = i;
    }

    public int btk() {
        return this.fs;
    }

    public void fb(int i) {
        this.fs = i;
    }

    public List<Integer> hhw() {
        return this.zn;
    }

    public void fs(List<Integer> list) {
        this.zn = list;
    }

    public int nps() {
        return this.fb;
    }

    public void btk(int i) {
        this.fb = i;
    }
}
