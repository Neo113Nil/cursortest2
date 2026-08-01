package com.bytedance.adsdk.lottie.vG;

import android.graphics.Typeface;

/* compiled from: Font.java */
/* loaded from: classes.dex */
public class vG {
    private final float Jd;
    private Typeface NB;
    private final String icD;
    private final String pvs;
    private final String vG;

    public vG(String str, String str2, String str3, float f) {
        this.pvs = str;
        this.icD = str2;
        this.vG = str3;
        this.Jd = f;
    }

    public String pvs() {
        return this.pvs;
    }

    public String icD() {
        return this.icD;
    }

    public String vG() {
        return this.vG;
    }

    public Typeface Jd() {
        return this.NB;
    }

    public void pvs(Typeface typeface) {
        this.NB = typeface;
    }
}
