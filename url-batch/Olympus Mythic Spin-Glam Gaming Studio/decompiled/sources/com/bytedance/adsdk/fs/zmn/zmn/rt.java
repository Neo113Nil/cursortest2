package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import com.bytedance.adsdk.fs.zn.fs.iv;
import com.bytedance.adsdk.fs.zn.fs.kw;
import java.util.List;

/* loaded from: classes3.dex */
public class rt implements zmn.InterfaceC0104zmn, mw, rc {
    private final boolean btk;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> bvs;
    private boolean cn;
    private final iv.zmn fb;
    private final String fs;
    private final boolean hhw;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> iv;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> klz;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> mw;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> nps;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> rc;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, PointF> zg;
    private final com.bytedance.adsdk.fs.bvs zn;
    private final Path zmn = new Path();
    private final fs rt = new fs();

    public rt(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.iv ivVar) {
        this.zn = bvsVar;
        this.fs = ivVar.zmn();
        iv.zmn fs = ivVar.fs();
        this.fb = fs;
        this.btk = ivVar.iv();
        this.hhw = ivVar.rc();
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn = ivVar.zn().zmn();
        this.nps = zmn;
        com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn2 = ivVar.fb().zmn();
        this.zg = zmn2;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn3 = ivVar.btk().zmn();
        this.bvs = zmn3;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn4 = ivVar.nps().zmn();
        this.rc = zmn4;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn5 = ivVar.bvs().zmn();
        this.mw = zmn5;
        iv.zmn zmnVar2 = iv.zmn.STAR;
        if (fs == zmnVar2) {
            this.iv = ivVar.hhw().zmn();
            this.klz = ivVar.zg().zmn();
        } else {
            this.iv = null;
            this.klz = null;
        }
        zmnVar.zmn(zmn);
        zmnVar.zmn(zmn2);
        zmnVar.zmn(zmn3);
        zmnVar.zmn(zmn4);
        zmnVar.zmn(zmn5);
        if (fs == zmnVar2) {
            zmnVar.zmn(this.iv);
            zmnVar.zmn(this.klz);
        }
        zmn.zmn(this);
        zmn2.zmn(this);
        zmn3.zmn(this);
        zmn4.zmn(this);
        zmn5.zmn(this);
        if (fs == zmnVar2) {
            this.iv.zmn(this);
            this.klz.zmn(this);
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        fs();
    }

    private void fs() {
        this.cn = false;
        this.zn.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        for (int i = 0; i < list.size(); i++) {
            zn znVar = list.get(i);
            if (znVar instanceof phc) {
                phc phcVar = (phc) znVar;
                if (phcVar.fs() == kw.zmn.SIMULTANEOUSLY) {
                    this.rt.zmn(phcVar);
                    phcVar.zmn(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.mw
    public Path fb() {
        if (this.cn) {
            return this.zmn;
        }
        this.zmn.reset();
        if (this.btk) {
            this.cn = true;
            return this.zmn;
        }
        int i = AnonymousClass1.zmn[this.fb.ordinal()];
        if (i == 1) {
            zn();
        } else if (i == 2) {
            btk();
        }
        this.zmn.close();
        this.rt.zmn(this.zmn);
        this.cn = true;
        return this.zmn;
    }

    /* renamed from: com.bytedance.adsdk.fs.zmn.zmn.rt$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[iv.zmn.values().length];
            zmn = iArr;
            try {
                iArr[iv.zmn.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[iv.zmn.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void zn() {
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
        float floatValue = this.nps.nps().floatValue();
        double radians = Math.toRadians((this.bvs == null ? 0.0d : r2.nps().floatValue()) - 90.0d);
        double d4 = floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        if (this.hhw) {
            f10 *= -1.0f;
        }
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((int) floatValue);
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f12) * f11;
        }
        float floatValue2 = this.rc.nps().floatValue();
        float floatValue3 = this.iv.nps().floatValue();
        com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> zmnVar = this.klz;
        float floatValue4 = zmnVar != null ? zmnVar.nps().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> zmnVar2 = this.mw;
        float floatValue5 = zmnVar2 != null ? zmnVar2.nps().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f4 = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = f4;
            float cos = (float) (d5 * Math.cos(radians));
            f3 = (float) (d5 * Math.sin(radians));
            this.zmn.moveTo(cos, f3);
            d = radians + ((f10 * f12) / 2.0f);
            f = cos;
            f2 = f11;
        } else {
            i = i2;
            double d6 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.zmn.moveTo(cos2, sin);
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
                    this.zmn.lineTo(cos3, sin2);
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
                    this.zmn.cubicTo(f14 - f19, f3 - f20, cos3 + f22, sin2 + f23, cos3, sin2);
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
                PointF nps = this.zg.nps();
                this.zmn.offset(nps.x, nps.y);
                this.zmn.close();
                return;
            }
        }
    }

    private void btk() {
        int i;
        double d;
        double d2;
        double d3;
        int floor = (int) Math.floor(this.nps.nps().floatValue());
        double radians = Math.toRadians((this.bvs == null ? 0.0d : r2.nps().floatValue()) - 90.0d);
        double d4 = floor;
        float floatValue = this.mw.nps().floatValue() / 100.0f;
        float floatValue2 = this.rc.nps().floatValue();
        double d5 = floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.zmn.moveTo(cos, sin);
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
                this.zmn.cubicTo(cos - (cos3 * f), sin - (sin3 * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.zmn.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF nps = this.zg.nps();
        this.zmn.offset(nps.x, nps.y);
        this.zmn.close();
    }
}
