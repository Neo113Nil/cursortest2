package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fb.hhw;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class zn {
    protected Map<String, Object> btk;
    protected String bvs;
    protected hhw.zmn fb;
    protected com.bytedance.adsdk.ugeno.fs.zn fs;
    protected String hhw;
    protected Context iv;
    protected String nps;
    protected String zg;
    protected com.bytedance.adsdk.ugeno.fb.rc zmn;
    protected com.bytedance.adsdk.ugeno.fb.hhw zn;

    public abstract boolean zmn(Object... objArr);

    public zn(Context context) {
        this.iv = context;
    }

    public void zn() {
        this.fb = this.zn.zmn();
        com.bytedance.adsdk.ugeno.fb.hhw hhwVar = this.zn;
        if (hhwVar == null) {
            return;
        }
        hhw.zmn zmn2 = hhwVar.zmn();
        this.fb = zmn2;
        if (zmn2 == null) {
            return;
        }
        this.btk = zmn2.zn();
        this.hhw = this.fb.fs();
        this.nps = this.fb.zmn();
        this.zg = this.fb.fb();
        this.bvs = this.fb.btk();
    }

    public String fb() {
        return this.hhw;
    }

    public String btk() {
        return this.zg;
    }

    public String hhw() {
        return this.bvs;
    }

    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        this.fs = znVar;
    }

    public void zmn(com.bytedance.adsdk.ugeno.fb.hhw hhwVar) {
        this.zn = hhwVar;
    }

    public com.bytedance.adsdk.ugeno.fb.hhw nps() {
        return this.zn;
    }

    public void zmn(com.bytedance.adsdk.ugeno.fb.rc rcVar) {
        this.zmn = rcVar;
    }

    public static class zmn {
        public static zn zmn(Context context, com.bytedance.adsdk.ugeno.fs.zn znVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.fb.hhw zmn;
            hhw.zmn zmn2;
            com.bytedance.adsdk.ugeno.fb.nps zmn3;
            if (znVar == null || jSONObject == null || (zmn = com.bytedance.adsdk.ugeno.fb.hhw.zmn(jSONObject, jSONObject2)) == null || (zmn2 = zmn.zmn()) == null) {
                return null;
            }
            String zmn4 = zmn2.zmn();
            if (TextUtils.equals(zmn4, "custom")) {
                fb fbVar = new fb(context);
                fbVar.zmn(znVar);
                fbVar.zmn(zmn);
                fbVar.zn();
                return fbVar;
            }
            if (TextUtils.isEmpty(zmn4) || TextUtils.equals(zmn4, "global")) {
                zmn3 = com.bytedance.adsdk.ugeno.fb.iv.zmn(zmn2.fs());
            } else {
                zmn3 = com.bytedance.adsdk.ugeno.fb.iv.zmn(zmn2.btk());
            }
            if (zmn3 == null) {
                return null;
            }
            zn zmn5 = zmn3.zmn(context);
            zmn5.zmn(znVar);
            zmn5.zmn(zmn);
            zmn5.zn();
            return zmn5;
        }
    }
}
