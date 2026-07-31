package com.bytedance.adsdk.fs.zn;

import com.bytedance.adsdk.fs.zn.fs.cyb;
import java.util.List;

/* loaded from: classes5.dex */
public class fb {
    private final String btk;
    private final double fb;
    private final char fs;
    private final String hhw;
    private final List<cyb> zmn;
    private final double zn;

    public static int zmn(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public fb(List<cyb> list, char c, double d, double d2, String str, String str2) {
        this.zmn = list;
        this.fs = c;
        this.zn = d;
        this.fb = d2;
        this.btk = str;
        this.hhw = str2;
    }

    public List<cyb> zmn() {
        return this.zmn;
    }

    public double fs() {
        return this.fb;
    }

    public int hashCode() {
        return zmn(this.fs, this.hhw, this.btk);
    }
}
