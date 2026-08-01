package com.bytedance.adsdk.lottie.vG;

/* compiled from: Marker.java */
/* loaded from: classes.dex */
public class sUS {
    public final float icD;
    public final float pvs;
    private final String vG;

    public sUS(String str, float f, float f2) {
        this.vG = str;
        this.icD = f2;
        this.pvs = f;
    }

    public boolean pvs(String str) {
        if (this.vG.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.vG.endsWith("\r")) {
            String str2 = this.vG;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
