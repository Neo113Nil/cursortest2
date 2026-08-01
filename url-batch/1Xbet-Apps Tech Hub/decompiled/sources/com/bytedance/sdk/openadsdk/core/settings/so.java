package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;

/* compiled from: MediationConfig.java */
/* loaded from: classes2.dex */
public class so implements Comparable<so> {
    private final int Jd;
    private String NB;
    private final String icD;
    private final String pvs;
    private final int sUS;
    private final String so;
    private final int vG;
    private final int yiw;

    public so(String str, String str2, int i, int i2, String str3, int i3, int i4, String str4) {
        this.pvs = str;
        this.icD = str2;
        this.vG = i;
        this.Jd = i2;
        this.NB = str3;
        if (TextUtils.isEmpty(str3)) {
            this.NB = "0";
        }
        this.sUS = i3;
        this.yiw = i4;
        this.so = str4;
    }

    public int pvs() {
        return this.sUS;
    }

    @Override // java.lang.Comparable
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public int compareTo(so soVar) {
        if (this.sUS < soVar.pvs()) {
            return -1;
        }
        return this.sUS == soVar.pvs() ? 0 : 1;
    }
}
