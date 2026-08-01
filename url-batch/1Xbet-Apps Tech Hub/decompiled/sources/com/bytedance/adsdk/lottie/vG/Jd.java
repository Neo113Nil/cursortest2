package com.bytedance.adsdk.lottie.vG;

import com.bytedance.adsdk.lottie.vG.icD.mnm;
import java.util.List;

/* compiled from: FontCharacter.java */
/* loaded from: classes.dex */
public class Jd {
    private final double Jd;
    private final String NB;
    private final char icD;
    private final List<mnm> pvs;
    private final String sUS;
    private final double vG;

    public static int pvs(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public Jd(List<mnm> list, char c, double d, double d2, String str, String str2) {
        this.pvs = list;
        this.icD = c;
        this.vG = d;
        this.Jd = d2;
        this.NB = str;
        this.sUS = str2;
    }

    public List<mnm> pvs() {
        return this.pvs;
    }

    public double icD() {
        return this.Jd;
    }

    public int hashCode() {
        return pvs(this.icD, this.sUS, this.NB);
    }
}
