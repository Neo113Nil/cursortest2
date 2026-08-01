package com.bytedance.adsdk.lottie.pvs.icD;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;

/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes.dex */
public class vG implements pvs.InterfaceC0030pvs {
    private final pvs<Float, Float> Jd;
    private final pvs<Float, Float> NB;
    private final pvs<Integer, Integer> icD;
    private final pvs.InterfaceC0030pvs pvs;
    private final pvs<Float, Float> sUS;
    private final pvs<Float, Float> vG;
    private boolean yiw = true;

    public vG(pvs.InterfaceC0030pvs interfaceC0030pvs, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.NB.Wyp wyp) {
        this.pvs = interfaceC0030pvs;
        pvs<Integer, Integer> pvs = wyp.pvs().pvs();
        this.icD = pvs;
        pvs.pvs(this);
        pvsVar.pvs(pvs);
        pvs<Float, Float> pvs2 = wyp.icD().pvs();
        this.vG = pvs2;
        pvs2.pvs(this);
        pvsVar.pvs(pvs2);
        pvs<Float, Float> pvs3 = wyp.vG().pvs();
        this.Jd = pvs3;
        pvs3.pvs(this);
        pvsVar.pvs(pvs3);
        pvs<Float, Float> pvs4 = wyp.Jd().pvs();
        this.NB = pvs4;
        pvs4.pvs(this);
        pvsVar.pvs(pvs4);
        pvs<Float, Float> pvs5 = wyp.NB().pvs();
        this.sUS = pvs5;
        pvs5.pvs(this);
        pvsVar.pvs(pvs5);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        this.yiw = true;
        this.pvs.pvs();
    }

    public void pvs(Paint paint) {
        if (this.yiw) {
            this.yiw = false;
            double floatValue = this.Jd.yiw().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.NB.yiw().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.icD.yiw().intValue();
            paint.setShadowLayer(this.sUS.yiw().floatValue(), sin, cos, Color.argb(Math.round(this.vG.yiw().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }
}
