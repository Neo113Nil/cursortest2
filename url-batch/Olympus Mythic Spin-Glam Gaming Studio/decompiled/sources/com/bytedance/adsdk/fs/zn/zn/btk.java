package com.bytedance.adsdk.fs.zn.zn;

import com.bytedance.adsdk.fs.zn.zmn.klz;
import com.bytedance.adsdk.fs.zn.zmn.rc;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public class btk {
    private final zmn btk;
    private final klz bvs;
    private final float cn;
    private final float cyb;
    private final boolean doe;
    private final long fb;
    private final com.bytedance.adsdk.fs.nps fs;
    private final long hhw;
    private final List<com.bytedance.adsdk.fs.nps.zmn<Float>> iqz;
    private final int iv;
    private final rc kgc;
    private final int klz;
    private final com.bytedance.adsdk.fs.zn.zmn.fs kw;
    private final float mw;
    private final String nps;
    private final com.bytedance.adsdk.fs.zn.fs.zmn nqi;
    private final com.bytedance.adsdk.fs.zn.zmn.iv olo;
    private final fs phc;
    private final int rc;
    private final float rt;
    private final com.bytedance.adsdk.fs.btk.iv uqh;
    private final List<com.bytedance.adsdk.fs.zn.fs.zg> zg;
    private final List<com.bytedance.adsdk.fs.zn.fs.zn> zmn;
    private final String zn;

    public enum fs {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public enum zmn {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public btk(List<com.bytedance.adsdk.fs.zn.fs.zn> list, com.bytedance.adsdk.fs.nps npsVar, String str, long j, zmn zmnVar, long j2, String str2, List<com.bytedance.adsdk.fs.zn.fs.zg> list2, klz klzVar, int i, int i2, int i3, float f, float f2, float f3, float f4, com.bytedance.adsdk.fs.zn.zmn.iv ivVar, rc rcVar, List<com.bytedance.adsdk.fs.nps.zmn<Float>> list3, fs fsVar, com.bytedance.adsdk.fs.zn.zmn.fs fsVar2, boolean z, com.bytedance.adsdk.fs.zn.fs.zmn zmnVar2, com.bytedance.adsdk.fs.btk.iv ivVar2) {
        this.zmn = list;
        this.fs = npsVar;
        this.zn = str;
        this.fb = j;
        this.btk = zmnVar;
        this.hhw = j2;
        this.nps = str2;
        this.zg = list2;
        this.bvs = klzVar;
        this.iv = i;
        this.rc = i2;
        this.klz = i3;
        this.mw = f;
        this.rt = f2;
        this.cn = f3;
        this.cyb = f4;
        this.olo = ivVar;
        this.kgc = rcVar;
        this.iqz = list3;
        this.phc = fsVar;
        this.kw = fsVar2;
        this.doe = z;
        this.nqi = zmnVar2;
        this.uqh = ivVar2;
    }

    com.bytedance.adsdk.fs.nps zmn() {
        return this.fs;
    }

    float fs() {
        return this.mw;
    }

    float zn() {
        return this.rt / this.fs.olo();
    }

    List<com.bytedance.adsdk.fs.nps.zmn<Float>> fb() {
        return this.iqz;
    }

    public long btk() {
        return this.fb;
    }

    public String hhw() {
        return this.zn;
    }

    public String nps() {
        return this.nps;
    }

    float zg() {
        return this.cn;
    }

    float bvs() {
        return this.cyb;
    }

    List<com.bytedance.adsdk.fs.zn.fs.zg> iv() {
        return this.zg;
    }

    public zmn rc() {
        return this.btk;
    }

    fs klz() {
        return this.phc;
    }

    long mw() {
        return this.hhw;
    }

    List<com.bytedance.adsdk.fs.zn.fs.zn> rt() {
        return this.zmn;
    }

    klz cn() {
        return this.bvs;
    }

    int cyb() {
        return this.klz;
    }

    int olo() {
        return this.rc;
    }

    int kgc() {
        return this.iv;
    }

    com.bytedance.adsdk.fs.zn.zmn.iv kw() {
        return this.olo;
    }

    rc iqz() {
        return this.kgc;
    }

    com.bytedance.adsdk.fs.zn.zmn.fs phc() {
        return this.kw;
    }

    public String toString() {
        return zmn("");
    }

    public boolean doe() {
        return this.doe;
    }

    public com.bytedance.adsdk.fs.zn.fs.zmn nqi() {
        return this.nqi;
    }

    public com.bytedance.adsdk.fs.btk.iv uqh() {
        return this.uqh;
    }

    public String zmn(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(hhw());
        sb.append("\n");
        btk zmn2 = this.fs.zmn(mw());
        if (zmn2 != null) {
            sb.append("\t\tParents: ");
            sb.append(zmn2.hhw());
            btk zmn3 = this.fs.zmn(zmn2.mw());
            while (zmn3 != null) {
                sb.append("->");
                sb.append(zmn3.hhw());
                zmn3 = this.fs.zmn(zmn3.mw());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!iv().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(iv().size());
            sb.append("\n");
        }
        if (kgc() != 0 && olo() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(kgc()), Integer.valueOf(olo()), Integer.valueOf(cyb())));
        }
        if (!this.zmn.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.bytedance.adsdk.fs.zn.fs.zn znVar : this.zmn) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(znVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
