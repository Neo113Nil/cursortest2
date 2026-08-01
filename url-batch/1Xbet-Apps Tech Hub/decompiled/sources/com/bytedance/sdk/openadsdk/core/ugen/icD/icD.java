package com.bytedance.sdk.openadsdk.core.ugen.icD;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.IP;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.ae;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.ugen.Jd.Jd;
import com.bytedance.sdk.openadsdk.core.ugen.icD.pvs;
import com.bytedance.sdk.openadsdk.core.ugen.pvs.icD;
import com.bytedance.sdk.openadsdk.icD.vG;
import com.bytedance.sdk.openadsdk.utils.jlb;
import io.ktor.http.LinkHeader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenEndcardInflater.java */
/* loaded from: classes2.dex */
public class icD implements IP, pvs.InterfaceC0080pvs {
    protected static int pvs = 8;
    private float IP;
    private final cR Jd;
    private View Ju;
    private JSONObject Mxy;
    private final com.bytedance.sdk.openadsdk.core.ugen.NB.pvs NB;
    private final com.bytedance.sdk.openadsdk.core.ugen.Jd.icD Wyp;
    private float bNS;
    private long cR;
    private pvs icD;
    private String kj;
    private float mnm;
    private com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs qh;
    private String sUS;
    private String so;
    private boolean uc = true;
    private float vA;
    private final Activity vG;
    private String yiw;
    private long zM;

    public icD(Activity activity, cR cRVar, com.bytedance.sdk.openadsdk.core.ugen.NB.pvs pvsVar, String str, com.bytedance.sdk.openadsdk.core.ugen.Jd.icD icd) {
        this.vG = activity;
        this.kj = str;
        this.Jd = cRVar;
        this.Wyp = icd;
        this.NB = pvsVar;
    }

    public void pvs() {
        if (this.Jd == null) {
            this.Wyp.pvs(1, "material is null", "net");
            return;
        }
        if (this.NB == null) {
            this.Wyp.pvs(1, "material ugen template is null", "net");
            return;
        }
        this.icD = new pvs(this.vG);
        this.so = this.NB.vG();
        this.sUS = this.NB.pvs();
        this.yiw = this.NB.icD();
        this.Mxy = this.Jd.wjr();
        this.Wyp.pvs();
        com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs().pvs("endcard", this.so, this.sUS, this.yiw, "", new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.icD.1
            @Override // com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs
            public void pvs(JSONObject jSONObject, String str) {
                icD icd = icD.this;
                icd.pvs(jSONObject, icd.Mxy);
                icD.this.Wyp.pvs(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.pvs.icD.pvs
            public void pvs(int i, String str, String str2) {
                icD.this.Wyp.pvs(i, str, str2);
            }
        });
    }

    public void pvs(View view) {
        this.Ju = view;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs pvsVar) {
        this.qh = pvsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(JSONObject jSONObject, JSONObject jSONObject2) {
        this.icD.pvs((pvs.InterfaceC0080pvs) this);
        this.icD.pvs((IP) this);
        this.Wyp.icD();
        this.icD.pvs(jSONObject, jSONObject2, new Jd() { // from class: com.bytedance.sdk.openadsdk.core.ugen.icD.icD.2
            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.Jd
            public void pvs(int i, String str) {
                if (icD.this.Wyp != null) {
                    icD.this.Wyp.pvs(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Jd.Jd
            public void pvs(com.bytedance.adsdk.ugeno.component.icD<View> icd) {
                if (icD.this.Wyp != null) {
                    icD.this.Wyp.pvs(icd);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.icD.pvs.InterfaceC0080pvs
    public void pvs(qh qhVar) {
        String optString = qhVar.vG().optString(LinkHeader.Parameters.Type);
        optString.hashCode();
        switch (optString) {
            case "privacy":
                if (this.vG != null && !TextUtils.isEmpty(mnm.Jd().gSd())) {
                    TTWebsiteActivity.pvs(this.vG, this.Jd, this.kj);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs pvsVar = this.qh;
                if (pvsVar != null) {
                    pvsVar.icD();
                    break;
                }
                break;
            case "creative":
                if (this.vG != null && this.Jd != null) {
                    icD();
                    ComponentCallbacks2 componentCallbacks2 = this.vG;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.video.vG.icD) {
                        ((com.bytedance.sdk.openadsdk.core.video.vG.icD) componentCallbacks2).Jd();
                    }
                    pvs(qhVar, this.Jd);
                    break;
                }
                break;
        }
    }

    private void icD() {
        int jhZ = this.Jd.jhZ();
        if (jhZ != 2 && jhZ != 3) {
            if (jhZ == 4) {
                com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this.vG, this.Jd, this.kj).Jd();
                return;
            } else {
                if (jhZ != 5) {
                    return;
                }
                jlb.vG(this.vG, this.Jd.cnN());
                return;
            }
        }
        if (jhZ == 3) {
            String CjQ = this.Jd.CjQ();
            if (!TextUtils.isEmpty(CjQ) && CjQ.contains("play.google.com/store")) {
                if (com.com.bytedance.overseas.sdk.pvs.icD.pvs(this.vG, CjQ, CjQ.substring(CjQ.indexOf("?id=") + 4), this.kj, this.Jd)) {
                    return;
                }
            }
        }
        Activity activity = this.vG;
        cR cRVar = this.Jd;
        int pvs2 = jlb.pvs(this.kj);
        String str = this.kj;
        ae.pvs((Context) activity, cRVar, pvs2, (PAGNativeAd) null, (PangleAd) null, str, com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this.vG, this.Jd, str), true, 0);
    }

    private void pvs(qh qhVar, cR cRVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.IP);
            jSONObject.put("down_y", this.bNS);
            jSONObject.put("down_time", this.cR);
            jSONObject.put("up_x", this.mnm);
            jSONObject.put("up_y", this.vA);
            jSONObject.put("up_time", this.zM);
            View Mxy = qhVar.pvs().Mxy();
            int i = 1;
            if (Mxy != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = Mxy.getWidth();
                float height = Mxy.getHeight();
                Mxy.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put("left", f);
                jSONObject2.put("top", f2);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.Ju;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.Ju.getWidth());
                jSONObject.put("button_height", this.Ju.getHeight());
            }
            View findViewById = this.vG.findViewById(R.id.content);
            if (findViewById != null) {
                int[] iArr3 = new int[2];
                findViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", findViewById.getWidth());
                jSONObject.put("height", findViewById.getHeight());
            }
            jSONObject.put("click_area_type", qhVar.pvs().IP());
            jSONObject.put("brick_id", qhVar.pvs().Ju());
            jSONObject.put("endcard_id", this.sUS);
            jSONObject.put("click_scence", 2);
            if (!this.uc) {
                i = 2;
            }
            jSONObject.put("user_behavior_type", i);
            com.bytedance.sdk.openadsdk.core.ugen.Jd.pvs pvsVar = this.qh;
            if (pvsVar != null) {
                jSONObject.put("endcard_type", pvsVar.pvs());
            }
            vG.pvs(cRVar, this.kj, "click", jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.IP
    public void pvs(com.bytedance.adsdk.ugeno.component.icD icd, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.cR = System.currentTimeMillis();
            this.IP = motionEvent.getRawX();
            this.bNS = motionEvent.getRawY();
            this.uc = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.IP) >= pvs || Math.abs(motionEvent.getRawY() - this.bNS) >= pvs) {
                this.uc = false;
                return;
            }
            return;
        }
        this.mnm = motionEvent.getRawX();
        this.vA = motionEvent.getRawY();
        if (Math.abs(this.mnm - this.IP) >= pvs || Math.abs(this.vA - this.bNS) >= pvs) {
            this.uc = false;
        }
        this.zM = System.currentTimeMillis();
    }
}
