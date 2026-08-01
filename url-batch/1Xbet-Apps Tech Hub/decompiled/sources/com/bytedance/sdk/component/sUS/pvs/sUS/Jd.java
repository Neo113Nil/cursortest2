package com.bytedance.sdk.component.sUS.pvs.sUS;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: TrackInfo.java */
/* loaded from: classes.dex */
public class Jd {
    private final int NB;
    private final String icD;
    private final String pvs;
    private boolean qh;
    private final String sUS;
    private String so;
    private final boolean vG;
    private String yiw;
    private int Jd = -1;
    private int Mxy = 0;
    private String Wyp = null;

    Jd(String str, String str2, boolean z, int i, String str3) {
        this.pvs = str;
        this.icD = str2;
        this.vG = z;
        this.NB = i;
        this.sUS = str3;
    }

    public String pvs() {
        return this.pvs;
    }

    public String icD() {
        return this.icD;
    }

    public boolean vG() {
        return this.vG;
    }

    public int Jd() {
        return this.Jd;
    }

    public void pvs(int i) {
        this.Jd = i;
    }

    public int NB() {
        return this.NB;
    }

    public String sUS() {
        return this.sUS;
    }

    public void pvs(String str) {
        this.yiw = str;
    }

    public String yiw() {
        return this.yiw;
    }

    public void icD(int i) {
        this.Mxy = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.yiw)) {
            this.yiw = String.valueOf(this.Mxy);
        } else {
            this.yiw += "," + this.Mxy;
        }
    }

    public int so() {
        return this.Mxy;
    }

    public void icD(String str) {
        this.so = str;
    }

    public String Mxy() {
        return this.so;
    }

    public void vG(String str) {
        this.Wyp = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.so)) {
            this.so = String.valueOf(this.Wyp);
        } else {
            this.so += "," + this.Wyp;
        }
    }

    public void pvs(boolean z) {
        this.qh = z;
    }

    public boolean Wyp() {
        return this.qh;
    }

    public Runnable pvs(String str, Map<String, String> map) {
        return pvs.pvs().pvs(this, str, map);
    }

    public boolean qh() {
        return this.Jd == -1;
    }
}
