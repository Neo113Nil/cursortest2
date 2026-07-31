package com.bytedance.adsdk.fs.zmn.fs;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.fs.zmn.fs.zmn;

/* loaded from: classes4.dex */
public class zn implements zmn.InterfaceC0104zmn {
    private final zmn<Float, Float> btk;
    private final zmn<Float, Float> fb;
    private final zmn<Integer, Integer> fs;
    private final zmn<Float, Float> hhw;
    private boolean nps = true;
    private final zmn.InterfaceC0104zmn zmn;
    private final zmn<Float, Float> zn;

    public zn(zmn.InterfaceC0104zmn interfaceC0104zmn, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.btk.iv ivVar) {
        this.zmn = interfaceC0104zmn;
        zmn<Integer, Integer> zmn = ivVar.zmn().zmn();
        this.fs = zmn;
        zmn.zmn(this);
        zmnVar.zmn(zmn);
        zmn<Float, Float> zmn2 = ivVar.fs().zmn();
        this.zn = zmn2;
        zmn2.zmn(this);
        zmnVar.zmn(zmn2);
        zmn<Float, Float> zmn3 = ivVar.zn().zmn();
        this.fb = zmn3;
        zmn3.zmn(this);
        zmnVar.zmn(zmn3);
        zmn<Float, Float> zmn4 = ivVar.fb().zmn();
        this.btk = zmn4;
        zmn4.zmn(this);
        zmnVar.zmn(zmn4);
        zmn<Float, Float> zmn5 = ivVar.btk().zmn();
        this.hhw = zmn5;
        zmn5.zmn(this);
        zmnVar.zmn(zmn5);
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        this.nps = true;
        this.zmn.zmn();
    }

    public void zmn(Paint paint) {
        if (this.nps) {
            this.nps = false;
            double floatValue = this.fb.nps().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.btk.nps().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.fs.nps().intValue();
            paint.setShadowLayer(this.hhw.nps().floatValue(), sin, cos, Color.argb(Math.round(this.zn.nps().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }
}
