package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.core.klz;
import com.bytedance.adsdk.ugeno.nps.zg;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes11.dex */
public class zn extends com.bytedance.adsdk.ugeno.fs.zmn<com.bytedance.adsdk.ugeno.hhw.fs> {
    private boolean dey;
    private float eug;
    private float hip;
    private int lgz;
    private com.bytedance.adsdk.ugeno.fs.zn ljl;
    private JSONArray lwz;
    private String mrt;
    private String ob;
    private float pl;
    private float quu;
    private boolean rsi;
    private boolean tev;
    private float uaq;
    private int va;
    private float vpd;

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(JSONObject jSONObject) {
    }

    public zn(Context context) {
        super(context);
        this.tev = true;
        this.rsi = true;
        this.hip = 0.0f;
        this.eug = 2000.0f;
        this.mrt = Constants.NORMAL;
        this.dey = true;
        this.lgz = Color.parseColor("#666666");
        this.va = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public View zmn() {
        com.bytedance.adsdk.ugeno.hhw.fs fsVar = new com.bytedance.adsdk.ugeno.hhw.fs(this.fs);
        this.btk = fsVar;
        fsVar.zmn((fb) this);
        return this.btk;
    }

    public void zmn(com.bytedance.adsdk.ugeno.hhw.zn znVar) {
        T t = this.btk;
        if (t != 0) {
            ((com.bytedance.adsdk.ugeno.hhw.fs) t).setOnPageChangeListener(znVar);
        }
    }

    public void zmn(int i) {
        T t = this.btk;
        if (t != 0) {
            ((com.bytedance.adsdk.ugeno.hhw.fs) t).rt(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn, com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
        JSONArray jSONArray = this.lwz;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).zg((int) this.uaq).bvs((int) this.quu).iv((int) this.pl).zn(this.dey).hhw(this.va).nps(this.lgz).zn(this.mrt).fb(this.tev).btk(this.vpd).zmn(this.rsi).fb((int) this.eug).zn(this.dey);
        for (int i = 0; i < this.lwz.length(); i++) {
            klz klzVar = new klz(this.fs);
            klzVar.zmn(this.uw);
            com.bytedance.adsdk.ugeno.fs.zn<View> fs = klzVar.fs(this.ljl.yj(), (com.bytedance.adsdk.ugeno.fs.zn<View>) null);
            klzVar.fs(this.lwz.optJSONObject(i));
            ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).zmn((com.bytedance.adsdk.ugeno.hhw.fs) fs);
        }
        if (this.rsi) {
            ((com.bytedance.adsdk.ugeno.hhw.fs) this.btk).zn();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zmn
    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        this.ljl = znVar;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void zmn(String str, String str2) {
        super.zmn(str, str2);
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "delayStart":
                this.hip = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f);
                break;
            case "indicatorColor":
                this.lgz = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                break;
            case "nextMargin":
                this.pl = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "effect":
                this.mrt = str2;
                break;
            case "direction":
                this.ob = str2;
                break;
            case "indicator":
                this.dey = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, true);
                break;
            case "previousMargin":
                this.quu = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "loop":
                this.tev = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, true);
                break;
            case "speed":
                this.eug = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 500.0f);
                break;
            case "pageCount":
                this.vpd = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 1.0f);
                break;
            case "pageMargin":
                this.uaq = zg.zmn(this.fs, com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.va = com.bytedance.adsdk.ugeno.nps.zmn.zmn(str2);
                break;
            case "autoplay":
                this.rsi = com.bytedance.adsdk.ugeno.nps.zn.zmn(str2, true);
                break;
            case "dataList":
                this.lwz = com.bytedance.adsdk.ugeno.nps.fs.zmn(str2, (JSONArray) null);
                break;
        }
    }
}
