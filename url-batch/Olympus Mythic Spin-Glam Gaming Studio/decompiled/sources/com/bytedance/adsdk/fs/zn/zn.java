package com.bytedance.adsdk.fs.zn;

import android.graphics.Typeface;

/* loaded from: classes5.dex */
public class zn {
    private Typeface btk;
    private final float fb;
    private final String fs;
    private final String zmn;
    private final String zn;

    public zn(String str, String str2, String str3, float f) {
        this.zmn = str;
        this.fs = str2;
        this.zn = str3;
        this.fb = f;
    }

    public String zmn() {
        return this.zmn;
    }

    public String fs() {
        return this.fs;
    }

    public String zn() {
        return this.zn;
    }

    public Typeface fb() {
        return this.btk;
    }

    public void zmn(Typeface typeface) {
        this.btk = typeface;
    }
}
