package com.bytedance.sdk.openadsdk.cyb.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;

/* loaded from: classes3.dex */
public class fs {
    private boolean btk;
    private int fb;
    private nqi fs;
    private String hhw;
    private int nps;
    private String zmn;
    private String zn;
    private int zg = 0;
    private int bvs = 0;

    public String zmn() {
        return this.zmn;
    }

    public void zmn(String str) {
        this.zmn = str;
    }

    public nqi fs() {
        return this.fs;
    }

    public void zmn(nqi nqiVar) {
        this.fs = nqiVar;
    }

    public String zn() {
        nqi nqiVar;
        if (TextUtils.isEmpty(this.zn) && (nqiVar = this.fs) != null) {
            this.zn = oub.zmn(nqiVar);
        }
        return this.zn;
    }

    public void fs(String str) {
        this.zn = str;
    }

    public int fb() {
        return this.fb;
    }

    public void zmn(int i) {
        this.fb = i;
    }

    public boolean btk() {
        return this.btk;
    }

    public void zmn(boolean z) {
        this.btk = z;
    }

    public String hhw() {
        return this.hhw;
    }

    public void zn(String str) {
        this.hhw = str;
    }

    public int nps() {
        return this.nps;
    }

    public void fs(int i) {
        this.nps = i;
    }

    public int zg() {
        return this.zg;
    }

    public int bvs() {
        return this.bvs;
    }
}
