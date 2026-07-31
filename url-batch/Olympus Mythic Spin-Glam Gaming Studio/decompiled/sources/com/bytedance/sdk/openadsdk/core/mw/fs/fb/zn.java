package com.bytedance.sdk.openadsdk.core.mw.fs.fb;

import android.content.Context;
import com.bytedance.adsdk.ugeno.nps.zg;

/* loaded from: classes12.dex */
public class zn extends com.bytedance.adsdk.ugeno.fs.zn<zmn> {
    private float hip;
    private int ob;
    private float rsi;
    private int tev;
    private String zmn;

    public zn(Context context) {
        super(context);
        this.zmn = "line";
        this.ob = com.bytedance.adsdk.ugeno.nps.zmn.zmn("#FFD813");
        this.tev = com.bytedance.adsdk.ugeno.nps.zmn.zmn("rgba(0, 0, 0, 0.5)");
        this.rsi = zg.zmn(this.fs, 1.0f);
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
        ((zmn) this.btk).zmn(this.zmn).zmn(this.ob).fs(this.tev).fs(this.hip).zmn(this.rsi);
    }

    public void zmn(int i) {
        ((zmn) this.btk).setProgress(i);
    }

    public void nps(int i) {
        ((zmn) this.btk).setAnimationDuration(i);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "progressBackgroundColor":
                this.tev = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                break;
            case "progressSize":
                this.rsi = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 1.0f));
                break;
            case "progressType":
                this.zmn = str2;
                break;
            case "progressColor":
                this.ob = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f) <= 0.0f) {
                    this.hip = 0.0f;
                    break;
                } else {
                    this.hip = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                    break;
                }
        }
    }
}
