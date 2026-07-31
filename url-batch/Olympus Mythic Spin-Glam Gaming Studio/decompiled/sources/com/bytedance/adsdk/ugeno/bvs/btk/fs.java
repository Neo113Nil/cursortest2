package com.bytedance.adsdk.ugeno.bvs.btk;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.fs.zn;

/* loaded from: classes5.dex */
public class fs extends zn<zmn> {
    private static final int eug = Color.parseColor("#FFC642");
    private static final int mrt = Color.parseColor("#e3e3e4");
    private float hip;
    private int ob;
    private float rsi;
    private float tev;
    private int zmn;

    public fs(Context context) {
        super(context);
        this.zmn = eug;
        this.ob = mrt;
        this.tev = 4.0f;
        this.rsi = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public zmn zmn() {
        zmn zmnVar = new zmn(this.fs);
        zmnVar.zmn(this);
        return zmnVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        if (so()) {
            ((zmn) this.btk).zmn(this.tev, this.zmn, this.ob, this.rsi, (int) this.hip);
        } else {
            ((zmn) this.btk).zmn(this.tev, this.zmn, this.ob, this.rsi, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.zmn = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.ob = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2, mrt);
                break;
            case "gap":
                this.hip = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case "size":
                this.rsi = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 20.0f);
                break;
            case "score":
                this.tev = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 4.0f);
                break;
        }
    }
}
