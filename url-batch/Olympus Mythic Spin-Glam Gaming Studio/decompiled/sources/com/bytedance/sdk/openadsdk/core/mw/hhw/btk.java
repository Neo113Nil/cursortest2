package com.bytedance.sdk.openadsdk.core.mw.hhw;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.mw;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.openadsdk.core.kw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class btk {
    private com.bytedance.adsdk.ugeno.fs.zn btk;
    private final String bvs;
    private boolean cn;
    private JSONArray cyb;
    private com.bytedance.adsdk.ugeno.fs.zn fb;
    private com.bytedance.sdk.openadsdk.core.widget.btk iv;
    private final JSONObject klz;
    private boolean mw;
    private final Context nps;
    private JSONObject rc;
    private boolean rt;
    private final nqi zg;
    private com.bytedance.adsdk.ugeno.fs.zn zn;
    private int zmn = -1;
    private int fs = -1;
    private final String hhw = "UGenSwiperEvent";

    public btk(Context context, nqi nqiVar, String str, JSONObject jSONObject) {
        this.nps = context;
        this.zg = nqiVar;
        this.bvs = str;
        this.klz = jSONObject;
    }

    public void zmn(com.bytedance.adsdk.ugeno.fs.zn<View> znVar) {
        com.bytedance.adsdk.ugeno.fs.zn<View> btk = znVar.btk("swiperLayout");
        this.btk = btk;
        if (btk instanceof com.bytedance.adsdk.ugeno.zn) {
            this.cyb = this.klz.optJSONArray("dpa_data");
            this.zn = znVar.btk("swiperLeftArrow");
            this.fb = znVar.btk("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.zn) this.btk).zmn(new com.bytedance.adsdk.ugeno.hhw.zn() { // from class: com.bytedance.sdk.openadsdk.core.mw.hhw.btk.1
                @Override // com.bytedance.adsdk.ugeno.hhw.zn
                public void zmn(boolean z, int i) {
                }

                @Override // com.bytedance.adsdk.ugeno.hhw.zn
                public void zmn(boolean z, int i, float f, int i2) {
                }

                @Override // com.bytedance.adsdk.ugeno.hhw.zn
                public void zmn(boolean z, int i, int i2, boolean z2, boolean z3) {
                    btk.this.fs = i;
                    btk.this.zmn = i2;
                    btk.this.mw = z;
                    btk.this.rt = z2;
                    btk.this.cn = z3;
                    btk.this.zmn(z, z2, z3);
                    btk.this.zmn(i);
                }
            });
        }
    }

    public void zmn() {
        zmn(this.mw, this.rt, this.cn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(boolean z, boolean z2, boolean z3) {
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.zn;
        if (znVar == null || this.fb == null) {
            return;
        }
        View rc = znVar.rc();
        View rc2 = this.fb.rc();
        JSONArray jSONArray = this.cyb;
        if (jSONArray != null && jSONArray.length() == 1) {
            rc.setVisibility(8);
            rc2.setVisibility(8);
            return;
        }
        if (z) {
            return;
        }
        if (z2) {
            if (rc instanceof TextView) {
                zmn((TextView) rc, 90);
            }
            if (rc2 instanceof TextView) {
                zmn((TextView) rc2, 255);
                return;
            }
            return;
        }
        if (z3) {
            if (rc instanceof TextView) {
                zmn((TextView) rc, 255);
            }
            if (rc2 instanceof TextView) {
                zmn((TextView) rc2, 90);
                return;
            }
            return;
        }
        if (rc instanceof TextView) {
            zmn((TextView) rc, 255);
        }
        if (rc2 instanceof TextView) {
            zmn((TextView) rc2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.zg, this.bvs, "carousel_show", jSONObject);
    }

    private void zmn(TextView textView, int i) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void fs() {
        int i;
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.btk;
        if (!(znVar instanceof com.bytedance.adsdk.ugeno.zn) || (i = this.zmn) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.zn) znVar).zmn(i - 1);
    }

    public void zn() {
        int i;
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.btk;
        if (!(znVar instanceof com.bytedance.adsdk.ugeno.zn) || (i = this.zmn) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.zn) znVar).zmn(i + 1);
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.widget.btk btkVar) {
        this.iv = btkVar;
    }

    public boolean zmn(mw mwVar) {
        JSONObject optJSONObject;
        this.rc = null;
        int i = this.fs;
        if (i != -1 && i != 0) {
            try {
                JSONObject zn = mwVar.zn();
                if (zn != null && (optJSONObject = zn.optJSONObject("related_dpa_click")) != null) {
                    boolean optBoolean = optJSONObject.optBoolean("enableOpenExternalUrl");
                    int optInt = optJSONObject.optInt("landingStyle");
                    if (optBoolean && optInt != -1) {
                        if (this.cyb != null) {
                            String zmn = com.bytedance.adsdk.ugeno.zn.fs.zmn(optJSONObject.optString("url"), this.cyb.optJSONObject(this.fs));
                            String zmn2 = com.bytedance.adsdk.ugeno.zn.fs.zmn(optJSONObject.optString("fallback_url"), this.cyb.optJSONObject(this.fs));
                            optJSONObject.put("url", zmn);
                            optJSONObject.put("fallback_url", zmn2);
                            zmn(optJSONObject, this.cyb.optJSONObject(this.fs));
                        }
                        zmn(optJSONObject, mwVar.zmn().rc());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th) {
                iqz.zn("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }

    private void zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
        this.rc = optJSONObject;
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.rc.putOpt(next, com.bytedance.adsdk.ugeno.zn.fs.zmn((String) this.rc.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.rc);
            } catch (Throwable unused2) {
            }
        }
    }

    public JSONObject fb() {
        return this.rc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
    
        if (r4 != 3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zmn(int i, String str, String str2) {
        if (i != 1) {
            if (i == 2) {
                if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !kgc.zmn(str2)) {
                    return false;
                }
            }
            return true;
        }
        if (!kgc.zmn(str)) {
            return false;
        }
        return true;
    }

    private void zmn(JSONObject jSONObject, View view) {
        if (zmn(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            kw.zmn(zmn(view), this.nps instanceof Activity, jSONObject, this.zg, this.bvs, oub.zmn(this.bvs), null, this.iv);
        }
    }

    private Context zmn(View view) {
        Activity zmn = view != null ? com.bytedance.sdk.component.utils.fs.zmn(view) : null;
        return zmn == null ? this.nps : zmn;
    }
}
