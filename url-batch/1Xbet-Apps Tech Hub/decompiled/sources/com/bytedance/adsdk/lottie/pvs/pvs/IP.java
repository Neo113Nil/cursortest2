package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import com.bytedance.adsdk.lottie.vG.icD.Wyp;
import com.bytedance.adsdk.lottie.vG.icD.zM;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;

/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public class IP implements pvs.InterfaceC0030pvs, Ju, qh {
    private final Wyp.pvs Jd;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> Ju;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> Mxy;
    private final boolean NB;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> Wyp;
    private boolean bNS;
    private final String icD;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> kj;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> qh;
    private final boolean sUS;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, PointF> so;
    private final com.bytedance.adsdk.lottie.so vG;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> yiw;
    private final Path pvs = new Path();
    private final icD IP = new icD();

    public IP(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.Wyp wyp) {
        this.vG = soVar;
        this.icD = wyp.pvs();
        Wyp.pvs icD = wyp.icD();
        this.Jd = icD;
        this.NB = wyp.Wyp();
        this.sUS = wyp.qh();
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs = wyp.vG().pvs();
        this.yiw = pvs;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs2 = wyp.Jd().pvs();
        this.so = pvs2;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs3 = wyp.NB().pvs();
        this.Mxy = pvs3;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs4 = wyp.yiw().pvs();
        this.qh = pvs4;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs5 = wyp.Mxy().pvs();
        this.Ju = pvs5;
        if (icD == Wyp.pvs.STAR) {
            this.Wyp = wyp.sUS().pvs();
            this.kj = wyp.so().pvs();
        } else {
            this.Wyp = null;
            this.kj = null;
        }
        pvsVar.pvs(pvs);
        pvsVar.pvs(pvs2);
        pvsVar.pvs(pvs3);
        pvsVar.pvs(pvs4);
        pvsVar.pvs(pvs5);
        if (icD == Wyp.pvs.STAR) {
            pvsVar.pvs(this.Wyp);
            pvsVar.pvs(this.kj);
        }
        pvs.pvs(this);
        pvs2.pvs(this);
        pvs3.pvs(this);
        pvs4.pvs(this);
        pvs5.pvs(this);
        if (icD == Wyp.pvs.STAR) {
            this.Wyp.pvs(this);
            this.kj.pvs(this);
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        icD();
    }

    private void icD() {
        this.bNS = false;
        this.vG.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        for (int i = 0; i < list.size(); i++) {
            vG vGVar = list.get(i);
            if (vGVar instanceof rCZ) {
                rCZ rcz = (rCZ) vGVar;
                if (rcz.icD() == zM.pvs.SIMULTANEOUSLY) {
                    this.IP.pvs(rcz);
                    rcz.pvs(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.Ju
    public Path Jd() {
        if (this.bNS) {
            return this.pvs;
        }
        this.pvs.reset();
        if (this.NB) {
            this.bNS = true;
            return this.pvs;
        }
        int i = AnonymousClass1.pvs[this.Jd.ordinal()];
        if (i == 1) {
            vG();
        } else if (i == 2) {
            NB();
        }
        this.pvs.close();
        this.IP.pvs(this.pvs);
        this.bNS = true;
        return this.pvs;
    }

    /* compiled from: PolystarContent.java */
    /* renamed from: com.bytedance.adsdk.lottie.pvs.pvs.IP$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[Wyp.pvs.values().length];
            pvs = iArr;
            try {
                iArr[Wyp.pvs.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[Wyp.pvs.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void vG() {
        int i;
        float f;
        float f2;
        double d;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        float f9;
        double d3;
        float floatValue = this.yiw.yiw().floatValue();
        double radians = Math.toRadians((this.Mxy == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : r2.yiw().floatValue()) - 90.0d);
        double d4 = floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        if (this.sUS) {
            f10 *= -1.0f;
        }
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((int) floatValue);
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f12) * f11;
        }
        float floatValue2 = this.qh.yiw().floatValue();
        float floatValue3 = this.Wyp.yiw().floatValue();
        com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> pvsVar = this.kj;
        float floatValue4 = pvsVar != null ? pvsVar.yiw().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> pvsVar2 = this.Ju;
        float floatValue5 = pvsVar2 != null ? pvsVar2.yiw().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f4 = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = f4;
            float cos = (float) (d5 * Math.cos(radians));
            f3 = (float) (d5 * Math.sin(radians));
            this.pvs.moveTo(cos, f3);
            d = radians + ((f10 * f12) / 2.0f);
            f = cos;
            f2 = f11;
        } else {
            i = i2;
            double d6 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.pvs.moveTo(cos2, sin);
            f = cos2;
            f2 = f11;
            d = radians + f2;
            f3 = sin;
            f4 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f13 = f2;
        float f14 = f;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                float f15 = z ? floatValue2 : floatValue3;
                if (f4 == 0.0f || d7 != ceil - 2.0d) {
                    f5 = f10;
                    f6 = f13;
                } else {
                    f5 = f10;
                    f6 = (f10 * f12) / 2.0f;
                }
                if (f4 == 0.0f || d7 != ceil - 1.0d) {
                    d2 = d7;
                    f7 = f4;
                    f4 = f15;
                } else {
                    d2 = d7;
                    f7 = f4;
                }
                double d8 = f4;
                double d9 = ceil;
                float cos3 = (float) (d8 * Math.cos(d));
                float sin2 = (float) (d8 * Math.sin(d));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.pvs.lineTo(cos3, sin2);
                    d3 = d;
                    f8 = floatValue4;
                    f9 = floatValue5;
                } else {
                    f8 = floatValue4;
                    double atan2 = (float) (Math.atan2(f3, f14) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f9 = floatValue5;
                    d3 = d;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f16 = z ? f8 : f9;
                    float f17 = z ? f9 : f8;
                    float f18 = (z ? floatValue3 : floatValue2) * f16 * 0.47829f;
                    float f19 = cos4 * f18;
                    float f20 = f18 * sin3;
                    float f21 = (z ? floatValue2 : floatValue3) * f17 * 0.47829f;
                    float f22 = cos5 * f21;
                    float f23 = f21 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f19 *= f12;
                            f20 *= f12;
                        } else if (d2 == d9 - 1.0d) {
                            f22 *= f12;
                            f23 *= f12;
                        }
                    }
                    this.pvs.cubicTo(f14 - f19, f3 - f20, cos3 + f22, sin2 + f23, cos3, sin2);
                }
                d = d3 + f6;
                z = !z;
                i3++;
                f14 = cos3;
                f3 = sin2;
                floatValue5 = f9;
                floatValue4 = f8;
                f4 = f7;
                f10 = f5;
                ceil = d9;
            } else {
                PointF yiw = this.so.yiw();
                this.pvs.offset(yiw.x, yiw.y);
                this.pvs.close();
                return;
            }
        }
    }

    private void NB() {
        int i;
        double d;
        double d2;
        double d3;
        int floor = (int) Math.floor(this.yiw.yiw().floatValue());
        double radians = Math.toRadians((this.Mxy == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : r2.yiw().floatValue()) - 90.0d);
        double d4 = floor;
        float floatValue = this.Ju.yiw().floatValue() / 100.0f;
        float floatValue2 = this.qh.yiw().floatValue();
        double d5 = floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.pvs.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue2 * floatValue * 0.25f;
                this.pvs.cubicTo(cos - (cos3 * f), sin - (sin3 * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.pvs.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF yiw = this.so.yiw();
        this.pvs.offset(yiw.x, yiw.y);
        this.pvs.close();
    }
}
