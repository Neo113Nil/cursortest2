package com.bytedance.adsdk.fs.zmn.fs;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.fs.zmn.fs.zmn;

/* loaded from: classes6.dex */
public class cyb {
    private final float[] btk;
    private zmn<Float, Float> bvs;
    private final Matrix fb;
    private final Matrix fs;
    private zmn<PointF, PointF> hhw;
    private zmn<Integer, Integer> iv;
    private fb klz;
    private zmn<?, Float> mw;
    private zmn<?, PointF> nps;
    private fb rc;
    private zmn<?, Float> rt;
    private zmn<com.bytedance.adsdk.fs.nps.zn, com.bytedance.adsdk.fs.nps.zn> zg;
    private final Matrix zmn = new Matrix();
    private final Matrix zn;

    public cyb(com.bytedance.adsdk.fs.zn.zmn.klz klzVar) {
        this.hhw = klzVar.zmn() == null ? null : klzVar.zmn().zmn();
        this.nps = klzVar.fs() == null ? null : klzVar.fs().zmn();
        this.zg = klzVar.zn() == null ? null : klzVar.zn().zmn();
        this.bvs = klzVar.fb() == null ? null : klzVar.fb().zmn();
        fb fbVar = klzVar.zg() == null ? null : (fb) klzVar.zg().zmn();
        this.rc = fbVar;
        if (fbVar != null) {
            this.fs = new Matrix();
            this.zn = new Matrix();
            this.fb = new Matrix();
            this.btk = new float[9];
        } else {
            this.fs = null;
            this.zn = null;
            this.fb = null;
            this.btk = null;
        }
        this.klz = klzVar.bvs() == null ? null : (fb) klzVar.bvs().zmn();
        if (klzVar.btk() != null) {
            this.iv = klzVar.btk().zmn();
        }
        if (klzVar.hhw() != null) {
            this.mw = klzVar.hhw().zmn();
        } else {
            this.mw = null;
        }
        if (klzVar.nps() != null) {
            this.rt = klzVar.nps().zmn();
        } else {
            this.rt = null;
        }
    }

    public void zmn(com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        zmnVar.zmn(this.iv);
        zmnVar.zmn(this.mw);
        zmnVar.zmn(this.rt);
        zmnVar.zmn(this.hhw);
        zmnVar.zmn(this.nps);
        zmnVar.zmn(this.zg);
        zmnVar.zmn(this.bvs);
        zmnVar.zmn(this.rc);
        zmnVar.zmn(this.klz);
    }

    public void zmn(zmn.InterfaceC0104zmn interfaceC0104zmn) {
        zmn<Integer, Integer> zmnVar = this.iv;
        if (zmnVar != null) {
            zmnVar.zmn(interfaceC0104zmn);
        }
        zmn<?, Float> zmnVar2 = this.mw;
        if (zmnVar2 != null) {
            zmnVar2.zmn(interfaceC0104zmn);
        }
        zmn<?, Float> zmnVar3 = this.rt;
        if (zmnVar3 != null) {
            zmnVar3.zmn(interfaceC0104zmn);
        }
        zmn<PointF, PointF> zmnVar4 = this.hhw;
        if (zmnVar4 != null) {
            zmnVar4.zmn(interfaceC0104zmn);
        }
        zmn<?, PointF> zmnVar5 = this.nps;
        if (zmnVar5 != null) {
            zmnVar5.zmn(interfaceC0104zmn);
        }
        zmn<com.bytedance.adsdk.fs.nps.zn, com.bytedance.adsdk.fs.nps.zn> zmnVar6 = this.zg;
        if (zmnVar6 != null) {
            zmnVar6.zmn(interfaceC0104zmn);
        }
        zmn<Float, Float> zmnVar7 = this.bvs;
        if (zmnVar7 != null) {
            zmnVar7.zmn(interfaceC0104zmn);
        }
        fb fbVar = this.rc;
        if (fbVar != null) {
            fbVar.zmn(interfaceC0104zmn);
        }
        fb fbVar2 = this.klz;
        if (fbVar2 != null) {
            fbVar2.zmn(interfaceC0104zmn);
        }
    }

    public void zmn(float f) {
        zmn<Integer, Integer> zmnVar = this.iv;
        if (zmnVar != null) {
            zmnVar.zmn(f);
        }
        zmn<?, Float> zmnVar2 = this.mw;
        if (zmnVar2 != null) {
            zmnVar2.zmn(f);
        }
        zmn<?, Float> zmnVar3 = this.rt;
        if (zmnVar3 != null) {
            zmnVar3.zmn(f);
        }
        zmn<PointF, PointF> zmnVar4 = this.hhw;
        if (zmnVar4 != null) {
            zmnVar4.zmn(f);
        }
        zmn<?, PointF> zmnVar5 = this.nps;
        if (zmnVar5 != null) {
            zmnVar5.zmn(f);
        }
        zmn<com.bytedance.adsdk.fs.nps.zn, com.bytedance.adsdk.fs.nps.zn> zmnVar6 = this.zg;
        if (zmnVar6 != null) {
            zmnVar6.zmn(f);
        }
        zmn<Float, Float> zmnVar7 = this.bvs;
        if (zmnVar7 != null) {
            zmnVar7.zmn(f);
        }
        fb fbVar = this.rc;
        if (fbVar != null) {
            fbVar.zmn(f);
        }
        fb fbVar2 = this.klz;
        if (fbVar2 != null) {
            fbVar2.zmn(f);
        }
    }

    public zmn<?, Integer> zmn() {
        return this.iv;
    }

    public zmn<?, Float> fs() {
        return this.mw;
    }

    public zmn<?, Float> zn() {
        return this.rt;
    }

    public Matrix fb() {
        PointF nps;
        float bvs;
        PointF nps2;
        this.zmn.reset();
        zmn<?, PointF> zmnVar = this.nps;
        if (zmnVar != null && (nps2 = zmnVar.nps()) != null) {
            float f = nps2.x;
            if (f != 0.0f || nps2.y != 0.0f) {
                this.zmn.preTranslate(f, nps2.y);
            }
        }
        zmn<Float, Float> zmnVar2 = this.bvs;
        if (zmnVar2 != null) {
            if (zmnVar2 instanceof olo) {
                bvs = zmnVar2.nps().floatValue();
            } else {
                bvs = ((fb) zmnVar2).bvs();
            }
            if (bvs != 0.0f) {
                this.zmn.preRotate(bvs);
            }
        }
        if (this.rc != null) {
            float cos = this.klz == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.bvs()) + 90.0f));
            float sin = this.klz == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.bvs()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.bvs()));
            btk();
            float[] fArr = this.btk;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.fs.setValues(fArr);
            btk();
            float[] fArr2 = this.btk;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.zn.setValues(fArr2);
            btk();
            float[] fArr3 = this.btk;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.fb.setValues(fArr3);
            this.zn.preConcat(this.fs);
            this.fb.preConcat(this.zn);
            this.zmn.preConcat(this.fb);
        }
        zmn<com.bytedance.adsdk.fs.nps.zn, com.bytedance.adsdk.fs.nps.zn> zmnVar3 = this.zg;
        if (zmnVar3 != null) {
            com.bytedance.adsdk.fs.nps.zn nps3 = zmnVar3.nps();
            if (nps3.zmn() != 1.0f || nps3.fs() != 1.0f) {
                this.zmn.preScale(nps3.zmn(), nps3.fs());
            }
        }
        zmn<PointF, PointF> zmnVar4 = this.hhw;
        if (zmnVar4 != null && (((nps = zmnVar4.nps()) != null && nps.x != 0.0f) || nps.y != 0.0f)) {
            this.zmn.preTranslate(-nps.x, -nps.y);
        }
        return this.zmn;
    }

    private void btk() {
        for (int i = 0; i < 9; i++) {
            this.btk[i] = 0.0f;
        }
    }

    public Matrix fs(float f) {
        zmn<?, PointF> zmnVar = this.nps;
        PointF nps = zmnVar == null ? null : zmnVar.nps();
        zmn<com.bytedance.adsdk.fs.nps.zn, com.bytedance.adsdk.fs.nps.zn> zmnVar2 = this.zg;
        com.bytedance.adsdk.fs.nps.zn nps2 = zmnVar2 == null ? null : zmnVar2.nps();
        this.zmn.reset();
        if (nps != null) {
            this.zmn.preTranslate(nps.x * f, nps.y * f);
        }
        if (nps2 != null) {
            double d = f;
            this.zmn.preScale((float) Math.pow(nps2.zmn(), d), (float) Math.pow(nps2.fs(), d));
        }
        zmn<Float, Float> zmnVar3 = this.bvs;
        if (zmnVar3 != null) {
            float floatValue = zmnVar3.nps().floatValue();
            zmn<PointF, PointF> zmnVar4 = this.hhw;
            PointF nps3 = zmnVar4 != null ? zmnVar4.nps() : null;
            this.zmn.preRotate(floatValue * f, nps3 == null ? 0.0f : nps3.x, nps3 != null ? nps3.y : 0.0f);
        }
        return this.zmn;
    }
}
