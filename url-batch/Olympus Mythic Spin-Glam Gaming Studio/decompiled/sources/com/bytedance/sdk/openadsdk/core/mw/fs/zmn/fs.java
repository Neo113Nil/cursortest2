package com.bytedance.sdk.openadsdk.core.mw.fs.zmn;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fs.zn;
import com.bytedance.sdk.openadsdk.utils.jy;

/* loaded from: classes6.dex */
public class fs extends zn<zmn> {
    private float eug;
    private int hip;
    private com.bytedance.sdk.openadsdk.core.mw.fs mrt;
    private int ob;
    private int rsi;
    private int tev;
    private int zmn;

    public fs(Context context) {
        super(context);
        this.ob = -1;
        this.tev = -1;
        zmn(context);
    }

    private void zmn(Context context) {
        this.mrt = new com.bytedance.sdk.openadsdk.core.mw.fs(context, true);
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
        com.bytedance.adsdk.ugeno.bvs.hhw.zmn zmn = ((zmn) this.btk).zmn();
        if (zmn != null) {
            this.mrt.zmn(zmn);
            ((zmn) this.btk).zmn(zmn);
        }
        ((zmn) this.btk).zmn(this.zmn, this.ob, this.tev, this.rsi, this.hip, this.eug);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        str.hashCode();
        switch (str) {
            case "barWidth":
                this.rsi = jy.fs(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "bottomBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.tev = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                    break;
                }
                break;
            case "shadowColor":
            case "shadowOffsetX":
            case "shadowOffsetY":
            case "textAlign":
            case "textColor":
            case "textStyle":
            case "shadowBlur":
            case "textSize":
            case "textDecoration":
            case "fontWeight":
            case "lineHeight":
            case "text":
            case "lines":
            case "ellipsis":
            case "maxLines":
            case "letterSpacing":
                this.mrt.zmn(str, str2);
                break;
            case "topBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.ob = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                    break;
                }
                break;
            case "barHeight":
                this.hip = jy.fs(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "barRadius":
                this.eug = jy.fs(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "downtime":
                this.zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn, com.bytedance.adsdk.ugeno.fb
    public void zmn(Canvas canvas) {
        super.zmn(canvas);
    }
}
