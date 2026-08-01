package com.bytedance.sdk.component.yiw;

import com.bytedance.sdk.component.icD.pvs.Wyp;
import java.io.File;
import java.util.Map;

/* compiled from: NetResponse.java */
/* loaded from: classes.dex */
public class icD {
    final String Jd;
    private final boolean Mxy;
    final long NB;
    final String icD;
    final int pvs;
    final long sUS;
    final Map<String, String> vG;
    Wyp yiw;
    private File so = null;
    private byte[] Wyp = null;

    public icD(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.Mxy = z;
        this.pvs = i;
        this.icD = str;
        this.vG = map;
        this.Jd = str2;
        this.NB = j;
        this.sUS = j2;
    }

    public int pvs() {
        return this.pvs;
    }

    public String icD() {
        return this.icD;
    }

    public Map<String, String> vG() {
        return this.vG;
    }

    public String Jd() {
        return this.Jd;
    }

    public File NB() {
        return this.so;
    }

    public void pvs(File file) {
        this.so = file;
    }

    public boolean sUS() {
        return this.Mxy;
    }

    public long yiw() {
        return this.NB - this.sUS;
    }

    public void pvs(byte[] bArr) {
        this.Wyp = bArr;
    }

    public Wyp so() {
        return this.yiw;
    }

    public void pvs(Wyp wyp) {
        this.yiw = wyp;
    }
}
