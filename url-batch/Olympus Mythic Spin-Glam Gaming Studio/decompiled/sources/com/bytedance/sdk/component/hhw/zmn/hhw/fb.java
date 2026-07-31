package com.bytedance.sdk.component.hhw.zmn.hhw;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* loaded from: classes15.dex */
public class fb {
    private final int btk;
    private final String fs;
    private final String hhw;
    private boolean klz;
    private String nps;
    private boolean rc;
    private String zg;
    private final String zmn;
    private final boolean zn;
    private int fb = -1;
    private int bvs = 0;
    private String iv = null;

    public fb(String str, String str2, boolean z, int i, String str3) {
        this.zmn = str;
        this.fs = str2;
        this.zn = z;
        this.btk = i;
        this.hhw = str3;
    }

    public String zmn() {
        return this.zmn;
    }

    public String fs() {
        return this.fs;
    }

    public boolean zn() {
        return this.zn;
    }

    public int fb() {
        return this.fb;
    }

    public void zmn(int i) {
        this.fb = i;
    }

    public int btk() {
        return this.btk;
    }

    public String hhw() {
        return this.hhw;
    }

    public void zmn(String str) {
        this.nps = str;
    }

    public String nps() {
        return this.nps;
    }

    public void fs(int i) {
        this.bvs = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.nps)) {
            this.nps = String.valueOf(this.bvs);
            return;
        }
        this.nps += StringUtils.COMMA + this.bvs;
    }

    public int zg() {
        return this.bvs;
    }

    public void fs(String str) {
        this.zg = str;
    }

    public String bvs() {
        return this.zg;
    }

    public void zn(String str) {
        this.iv = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.zg)) {
            this.zg = String.valueOf(this.iv);
            return;
        }
        this.zg += StringUtils.COMMA + this.iv;
    }

    public void zmn(boolean z) {
        this.rc = z;
    }

    public boolean iv() {
        return this.rc;
    }

    public Runnable zmn(String str, Map<String, String> map) {
        return zmn.zmn().zmn(this, str, map);
    }

    public boolean rc() {
        return this.fb == -1;
    }

    public void fs(boolean z) {
        this.klz = z;
    }

    public boolean klz() {
        return this.klz;
    }
}
