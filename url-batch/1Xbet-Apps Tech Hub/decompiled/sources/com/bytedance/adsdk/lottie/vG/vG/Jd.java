package com.bytedance.adsdk.lottie.vG.vG;

import com.bytedance.adsdk.lottie.NB.Wyp;
import com.bytedance.adsdk.lottie.vG.pvs.kj;
import com.bytedance.adsdk.lottie.vG.pvs.qh;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public class Jd {
    private final float IP;
    private final long Jd;
    private final float Ju;
    private final kj Mxy;
    private final pvs NB;
    private final boolean OT;
    private final int Wyp;
    private final Wyp ZhG;
    private final float bNS;
    private final qh cR;
    private final com.bytedance.adsdk.lottie.sUS icD;
    private final int kj;
    private final float mnm;
    private final com.bytedance.adsdk.lottie.vG.icD.pvs ny;
    private final List<com.bytedance.adsdk.lottie.vG.icD.vG> pvs;
    private final int qh;
    private final icD rCZ;
    private final long sUS;
    private final List<com.bytedance.adsdk.lottie.vG.icD.so> so;
    private final List<com.bytedance.adsdk.lottie.yiw.pvs<Float>> uc;
    private final com.bytedance.adsdk.lottie.vG.pvs.Wyp vA;
    private final String vG;
    private final String yiw;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD zM;

    /* compiled from: Layer.java */
    public enum icD {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    public enum pvs {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public Jd(List<com.bytedance.adsdk.lottie.vG.icD.vG> list, com.bytedance.adsdk.lottie.sUS sus, String str, long j, pvs pvsVar, long j2, String str2, List<com.bytedance.adsdk.lottie.vG.icD.so> list2, kj kjVar, int i, int i2, int i3, float f, float f2, float f3, float f4, com.bytedance.adsdk.lottie.vG.pvs.Wyp wyp, qh qhVar, List<com.bytedance.adsdk.lottie.yiw.pvs<Float>> list3, icD icd, com.bytedance.adsdk.lottie.vG.pvs.icD icd2, boolean z, com.bytedance.adsdk.lottie.vG.icD.pvs pvsVar2, Wyp wyp2) {
        this.pvs = list;
        this.icD = sus;
        this.vG = str;
        this.Jd = j;
        this.NB = pvsVar;
        this.sUS = j2;
        this.yiw = str2;
        this.so = list2;
        this.Mxy = kjVar;
        this.Wyp = i;
        this.qh = i2;
        this.kj = i3;
        this.Ju = f;
        this.IP = f2;
        this.bNS = f3;
        this.mnm = f4;
        this.vA = wyp;
        this.cR = qhVar;
        this.uc = list3;
        this.rCZ = icd;
        this.zM = icd2;
        this.OT = z;
        this.ny = pvsVar2;
        this.ZhG = wyp2;
    }

    com.bytedance.adsdk.lottie.sUS pvs() {
        return this.icD;
    }

    float icD() {
        return this.Ju;
    }

    float vG() {
        return this.IP / this.icD.Ju();
    }

    List<com.bytedance.adsdk.lottie.yiw.pvs<Float>> Jd() {
        return this.uc;
    }

    public long NB() {
        return this.Jd;
    }

    public String sUS() {
        return this.vG;
    }

    public String yiw() {
        return this.yiw;
    }

    float so() {
        return this.bNS;
    }

    float Mxy() {
        return this.mnm;
    }

    List<com.bytedance.adsdk.lottie.vG.icD.so> Wyp() {
        return this.so;
    }

    public pvs qh() {
        return this.NB;
    }

    icD kj() {
        return this.rCZ;
    }

    long Ju() {
        return this.sUS;
    }

    List<com.bytedance.adsdk.lottie.vG.icD.vG> IP() {
        return this.pvs;
    }

    kj bNS() {
        return this.Mxy;
    }

    int mnm() {
        return this.kj;
    }

    int vA() {
        return this.qh;
    }

    int cR() {
        return this.Wyp;
    }

    com.bytedance.adsdk.lottie.vG.pvs.Wyp zM() {
        return this.vA;
    }

    qh uc() {
        return this.cR;
    }

    com.bytedance.adsdk.lottie.vG.pvs.icD rCZ() {
        return this.zM;
    }

    public String toString() {
        return pvs("");
    }

    public boolean OT() {
        return this.OT;
    }

    public com.bytedance.adsdk.lottie.vG.icD.pvs ny() {
        return this.ny;
    }

    public Wyp ZhG() {
        return this.ZhG;
    }

    public String pvs(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(sUS()).append("\n");
        Jd pvs2 = this.icD.pvs(Ju());
        if (pvs2 != null) {
            sb.append("\t\tParents: ").append(pvs2.sUS());
            Jd pvs3 = this.icD.pvs(pvs2.Ju());
            while (pvs3 != null) {
                sb.append("->").append(pvs3.sUS());
                pvs3 = this.icD.pvs(pvs3.Ju());
            }
            sb.append(str).append("\n");
        }
        if (!Wyp().isEmpty()) {
            sb.append(str).append("\tMasks: ").append(Wyp().size()).append("\n");
        }
        if (cR() != 0 && vA() != 0) {
            sb.append(str).append("\tBackground: ").append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(cR()), Integer.valueOf(vA()), Integer.valueOf(mnm())));
        }
        if (!this.pvs.isEmpty()) {
            sb.append(str).append("\tShapes:\n");
            Iterator<com.bytedance.adsdk.lottie.vG.icD.vG> it = this.pvs.iterator();
            while (it.hasNext()) {
                sb.append(str).append("\t\t").append(it.next()).append("\n");
            }
        }
        return sb.toString();
    }
}
