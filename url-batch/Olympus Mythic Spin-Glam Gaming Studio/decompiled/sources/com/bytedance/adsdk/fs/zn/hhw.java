package com.bytedance.adsdk.fs.zn;

/* loaded from: classes10.dex */
public class hhw {
    public final float fs;
    public final float zmn;
    private final String zn;

    public hhw(String str, float f, float f2) {
        this.zn = str;
        this.fs = f2;
        this.zmn = f;
    }

    public boolean zmn(String str) {
        if (this.zn.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.zn.endsWith("\r")) {
            String str2 = this.zn;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
