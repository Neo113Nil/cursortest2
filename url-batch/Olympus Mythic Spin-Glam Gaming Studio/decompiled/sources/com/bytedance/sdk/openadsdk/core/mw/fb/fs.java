package com.bytedance.sdk.openadsdk.core.mw.fb;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.cyb;
import com.bytedance.adsdk.ugeno.core.mw;
import com.bytedance.adsdk.ugeno.fs.zn;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw.fb.zmn;
import com.bytedance.sdk.openadsdk.core.mw.nps.fb;
import com.bytedance.sdk.openadsdk.core.mw.zmn.fs;
import com.bytedance.sdk.openadsdk.core.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fs implements cyb, zmn.InterfaceC0166zmn {
    protected static int zmn = 8;
    private final com.bytedance.sdk.openadsdk.core.mw.zg.zmn btk;
    private JSONObject bvs;
    private float cn;
    private float cyb;
    private final nqi fb;
    private zmn fs;
    private String hhw;
    private boolean iqz = true;
    private final com.bytedance.sdk.openadsdk.core.mw.nps.fs iv;
    private long kgc;
    private String klz;
    private long kw;
    private View mw;
    private String nps;
    private float olo;
    private com.bytedance.sdk.openadsdk.core.mw.nps.zmn rc;
    private float rt;
    private String zg;
    private final Activity zn;

    public fs(Activity activity, nqi nqiVar, com.bytedance.sdk.openadsdk.core.mw.zg.zmn zmnVar, String str, com.bytedance.sdk.openadsdk.core.mw.nps.fs fsVar) {
        this.zn = activity;
        this.klz = str;
        this.fb = nqiVar;
        this.iv = fsVar;
        this.btk = zmnVar;
    }

    public void zmn() {
        if (this.fb == null) {
            this.iv.zmn(1, "material is null", "net");
            return;
        }
        if (this.btk == null) {
            this.iv.zmn(1, "material ugen template is null", "net");
            return;
        }
        this.fs = new zmn(this.zn);
        this.zg = this.btk.zn();
        this.hhw = this.btk.zmn();
        this.nps = this.btk.fs();
        this.bvs = this.fb.mw(true);
        this.iv.zmn(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn().zmn(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.zg, this.hhw, this.nps, "", new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.mw.fb.fs.1
            @Override // com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn
            public void zmn(JSONObject jSONObject, String str) {
                fs fsVar = fs.this;
                fsVar.zmn(jSONObject, fsVar.bvs);
                fs.this.iv.fs(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.zmn.fs.zmn
            public void zmn(int i, String str, String str2) {
                fs.this.iv.zmn(i, str, str2);
            }
        });
    }

    public void zmn(View view) {
        this.mw = view;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.mw.nps.zmn zmnVar) {
        this.rc = zmnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        this.fs.zmn((zmn.InterfaceC0166zmn) this);
        this.fs.zmn((cyb) this);
        this.iv.zmn();
        this.fs.zmn(jSONObject, jSONObject2, new fb() { // from class: com.bytedance.sdk.openadsdk.core.mw.fb.fs.2
            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fb
            public void zmn(int i, String str) {
                if (fs.this.iv != null) {
                    fs.this.iv.zmn(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.mw.nps.fb
            public void zmn(zn<View> znVar) {
                if (fs.this.iv != null) {
                    fs.this.iv.zmn(znVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.fb.zmn.InterfaceC0166zmn
    public void zmn(mw mwVar) {
        String optString = mwVar.zn().optString("type");
        optString.hashCode();
        switch (optString) {
            case "privacy":
                if (this.zn != null && !TextUtils.isEmpty(kgc.fb().vlj())) {
                    if (com.bytedance.sdk.openadsdk.utils.fs.btk() && kgc.fb().am()) {
                        IABLandingPageActivity.zmn(this.zn, this.fb, this.klz);
                        break;
                    } else {
                        TTWebsiteActivity.zmn(this.zn, this.fb, this.klz);
                        break;
                    }
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.mw.nps.zmn zmnVar = this.rc;
                if (zmnVar != null) {
                    zmnVar.fs();
                    break;
                }
                break;
            case "creative":
                if (this.zn != null && this.fb != null) {
                    fs();
                    ComponentCallbacks2 componentCallbacks2 = this.zn;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.cn.fb.fs) {
                        ((com.bytedance.sdk.openadsdk.core.cn.fb.fs) componentCallbacks2).xrr();
                    }
                    zmn(mwVar, this.fb);
                    break;
                }
                break;
        }
    }

    private void fs() {
        int va = this.fb.va();
        if (va != 2 && va != 3) {
            if (va == 4) {
                com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.zn, this.klz).zmn(this.fb);
                return;
            } else {
                if (va != 5) {
                    return;
                }
                oub.fs(this.zn, this.fb.ao());
                return;
            }
        }
        if (va == 3) {
            String pl = this.fb.pl();
            if (!TextUtils.isEmpty(pl) && pl.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.phc.zmn.zmn.fs.zmn(this.zn, pl, pl.substring(pl.indexOf("?id=") + 4), this.klz, this.fb)) {
                    return;
                }
            }
        }
        Activity activity = this.zn;
        nqi nqiVar = this.fb;
        int zmn2 = oub.zmn(this.klz);
        String str = this.klz;
        nu.zmn(activity, nqiVar, zmn2, null, null, str, com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.zn, str), true, 0);
    }

    private void zmn(mw mwVar, nqi nqiVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.rt);
            jSONObject.put("down_y", this.cn);
            jSONObject.put("down_time", this.kgc);
            jSONObject.put("up_x", this.cyb);
            jSONObject.put("up_y", this.olo);
            jSONObject.put("up_time", this.kw);
            View rc = mwVar.zmn().rc();
            int i = 1;
            if (rc != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = rc.getWidth();
                float height = rc.getHeight();
                rc.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put("left", f);
                jSONObject2.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, f2);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.mw;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.mw.getWidth());
                jSONObject.put("button_height", this.mw.getHeight());
            }
            View findViewById = this.zn.findViewById(R.id.content);
            if (findViewById != null) {
                int[] iArr3 = new int[2];
                findViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", findViewById.getWidth());
                jSONObject.put("height", findViewById.getHeight());
            }
            jSONObject.put("click_area_type", mwVar.zmn().fkt());
            jSONObject.put("brick_id", mwVar.zmn().tf());
            jSONObject.put("endcard_id", this.hhw);
            jSONObject.put("click_scence", 2);
            if (!this.iqz) {
                i = 2;
            }
            jSONObject.put("user_behavior_type", i);
            com.bytedance.sdk.openadsdk.core.mw.nps.zmn zmnVar = this.rc;
            if (zmnVar != null) {
                jSONObject.put("endcard_type", zmnVar.zmn());
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, this.klz, "click", jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.cyb
    public void zmn(zn znVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.kgc = System.currentTimeMillis();
            this.rt = motionEvent.getRawX();
            this.cn = motionEvent.getRawY();
            this.iqz = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.rt) >= zmn || Math.abs(motionEvent.getRawY() - this.cn) >= zmn) {
                this.iqz = false;
                return;
            }
            return;
        }
        this.cyb = motionEvent.getRawX();
        this.olo = motionEvent.getRawY();
        if (Math.abs(this.cyb - this.rt) >= zmn || Math.abs(this.olo - this.cn) >= zmn) {
            this.iqz = false;
        }
        this.kw = System.currentTimeMillis();
    }
}
