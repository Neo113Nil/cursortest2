package com.bytedance.adsdk.lottie.vG.icD;

import android.graphics.Paint;
import com.bytedance.adsdk.lottie.pvs.pvs.uc;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public class cR implements vG {
    private final com.bytedance.adsdk.lottie.vG.pvs.pvs Jd;
    private final float Mxy;
    private final com.bytedance.adsdk.lottie.vG.pvs.Jd NB;
    private final boolean Wyp;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD icD;
    private final String pvs;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD sUS;
    private final icD so;
    private final List<com.bytedance.adsdk.lottie.vG.pvs.icD> vG;
    private final pvs yiw;

    /* compiled from: ShapeStroke.java */
    public enum pvs {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap pvs() {
            int i = AnonymousClass1.pvs[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i == 2) {
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.SQUARE;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* renamed from: com.bytedance.adsdk.lottie.vG.icD.cR$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] icD;
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[icD.values().length];
            icD = iArr;
            try {
                iArr[icD.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                icD[icD.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                icD[icD.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[pvs.values().length];
            pvs = iArr2;
            try {
                iArr2[pvs.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pvs[pvs.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pvs[pvs.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    public enum icD {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join pvs() {
            int i = AnonymousClass1.icD[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public cR(String str, com.bytedance.adsdk.lottie.vG.pvs.icD icd, List<com.bytedance.adsdk.lottie.vG.pvs.icD> list, com.bytedance.adsdk.lottie.vG.pvs.pvs pvsVar, com.bytedance.adsdk.lottie.vG.pvs.Jd jd, com.bytedance.adsdk.lottie.vG.pvs.icD icd2, pvs pvsVar2, icD icd3, float f, boolean z) {
        this.pvs = str;
        this.icD = icd;
        this.vG = list;
        this.Jd = pvsVar;
        this.NB = jd;
        this.sUS = icd2;
        this.yiw = pvsVar2;
        this.so = icd3;
        this.Mxy = f;
        this.Wyp = z;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        return new uc(soVar, pvsVar, this);
    }

    public String pvs() {
        return this.pvs;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.pvs icD() {
        return this.Jd;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.Jd vG() {
        return this.NB;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD Jd() {
        return this.sUS;
    }

    public List<com.bytedance.adsdk.lottie.vG.pvs.icD> NB() {
        return this.vG;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD sUS() {
        return this.icD;
    }

    public pvs yiw() {
        return this.yiw;
    }

    public icD so() {
        return this.so;
    }

    public float Mxy() {
        return this.Mxy;
    }

    public boolean Wyp() {
        return this.Wyp;
    }
}
