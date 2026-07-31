package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.kjb;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw.zn.fb;
import com.bytedance.sdk.openadsdk.core.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class kgc implements com.bytedance.sdk.openadsdk.core.iv.cyb, kjb, fb.zmn, com.bytedance.sdk.openadsdk.core.mw.zn.zmn {
    private final com.bytedance.sdk.openadsdk.core.zn.zmn btk;
    private final com.bytedance.sdk.openadsdk.core.hhw.zn fb;
    private final zmn fs;
    private fkt hhw;
    private boolean iv;
    private boolean rc;
    private int zg;
    private final com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn;
    private final com.bytedance.sdk.openadsdk.core.mw.zn.fs zn;
    private int nps = 0;
    private int bvs = 1;

    public interface zmn {
        void btk();

        int fb();

        void fs();

        void hhw();

        void zmn();

        void zn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public int btk() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public long fb() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public void fs() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public void fs(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public boolean fs(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public void hhw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.kjb
    public void m_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i, com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(boolean z, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public boolean zmn(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public long zn() {
        return 0L;
    }

    public kgc(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, zmn zmnVar) {
        this.zmn = fsVar;
        this.fs = zmnVar;
        this.fb = new com.bytedance.sdk.openadsdk.core.hhw.zn(fsVar.nu) { // from class: com.bytedance.sdk.openadsdk.core.widget.kgc.1
            @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me) {
                DetectTouchUtils.viewOnTouch(h.u, this, me);
                return super.dispatchTouchEvent(me);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                    CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
                }
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                kgc.this.zmn(z);
            }
        };
        com.bytedance.sdk.openadsdk.core.mw.zn.fs fsVar2 = new com.bytedance.sdk.openadsdk.core.mw.zn.fs(fsVar.oub, fsVar.fs, true);
        this.zn = fsVar2;
        fsVar2.zmn((com.bytedance.sdk.openadsdk.core.iv.cyb) this);
        fsVar2.zmn((com.bytedance.sdk.openadsdk.core.mw.zn.zmn) this);
        com.bytedance.sdk.openadsdk.core.mw.zn.zn zmn2 = fsVar2.zmn();
        if (zmn2 instanceof com.bytedance.sdk.openadsdk.core.mw.zn.fb) {
            com.bytedance.sdk.openadsdk.core.mw.zn.fb fbVar = (com.bytedance.sdk.openadsdk.core.mw.zn.fb) zmn2;
            fbVar.zmn((fb.zmn) this);
            fkt btk = fbVar.btk();
            this.hhw = btk;
            if (btk != null) {
                btk.zmn((kjb) this);
                this.hhw.fs(fsVar.fs.btk());
            }
        }
        Context context = fsVar.oub;
        nqi nqiVar = fsVar.fs;
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.core.zn.zmn(context, nqiVar, nqiVar.btk(), oub.fs(fsVar.fs));
        this.btk = zmnVar2;
        zmnVar2.zmn(com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), fsVar.fs.btk()));
        HashMap hashMap = new HashMap();
        if (am.fs(fsVar.fs)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        zmnVar2.zmn(hashMap);
    }

    public void zmn(ViewGroup viewGroup) {
        View zn = this.zn.zn();
        if (zn == null) {
            return;
        }
        zn.setVisibility(4);
        viewGroup.addView(zn, new ViewGroup.LayoutParams(-1, -1));
        this.zn.fs();
        this.zg = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(boolean z) {
        com.bytedance.sdk.openadsdk.core.mw.zn.zn zmn2 = this.zn.zmn();
        if (zmn2 instanceof com.bytedance.sdk.openadsdk.core.mw.zn.fb) {
            ((com.bytedance.sdk.openadsdk.core.mw.zn.fb) zmn2).zmn(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(String str, JSONObject jSONObject) {
        zmn zmnVar;
        if (!"skipToNextAd".equals(str) || (zmnVar = this.fs) == null) {
            return;
        }
        zmnVar.zmn();
    }

    public void zg() {
        this.iv = true;
        ViewParent parent = this.fb.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.fb);
        }
        com.bytedance.sdk.openadsdk.core.mw.zn.fs fsVar = this.zn;
        if (fsVar != null) {
            fsVar.fb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.zn.fb.zmn
    public void nps() {
        if (this.zg != 1) {
            return;
        }
        this.zg = 3;
        View zn = this.zn.zn();
        if (zn != null) {
            ViewGroup viewGroup = (ViewGroup) zn.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.fb) {
                    return;
                } else {
                    viewGroup.removeView(zn);
                }
            }
            if (this.fb != null) {
                zn.setVisibility(0);
                this.fb.addView(zn, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    private void iv() {
        this.nps++;
        zmn zmnVar = this.fs;
        if (zmnVar != null) {
            zmnVar.zn();
        }
        zmn(true);
        fkt fktVar = this.hhw;
        if (fktVar != null) {
            fktVar.zmn("popupDidShow", (JSONObject) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            zmn zmnVar2 = this.fs;
            if (zmnVar2 != null) {
                jSONObject2.put("click_countdown_remaining", Math.max(zmnVar2.fb(), 0));
            }
            jSONObject2.put("popup_sequence", this.nps);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zn("UserIdleAskDialog", e.getMessage());
        }
        nqi nqiVar = this.zmn.fs;
        com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, nqiVar.btk(), "show_popup", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.kjb
    public void n_() {
        if (this.iv || !rc()) {
            return;
        }
        klz();
        zmn zmnVar = this.fs;
        if (zmnVar != null) {
            zmnVar.fs();
        }
        zmn(false);
        fkt fktVar = this.hhw;
        if (fktVar != null) {
            fktVar.zmn("popupDidDismiss", (JSONObject) null);
        }
    }

    private boolean rc() {
        return this.fb.isAttachedToWindow() && this.fb.getVisibility() == 0;
    }

    private void klz() {
        this.fb.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.kjb
    public int o_() {
        zmn zmnVar = this.fs;
        if (zmnVar != null) {
            return zmnVar.fb();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.kjb
    public void p_() {
        zmn zmnVar = this.fs;
        if (zmnVar != null) {
            zmnVar.btk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.kjb
    public void q_() {
        zmn zmnVar = this.fs;
        if (zmnVar != null) {
            zmnVar.hhw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.kjb
    public void r_() {
        this.bvs = 2;
    }

    public boolean zmn(Activity activity) {
        if (!this.iv && activity != null && !activity.isFinishing()) {
            if (this.zg == 3 && this.bvs == 2) {
                if (this.fb.isAttachedToWindow() && this.fb.getVisibility() == 0) {
                    return true;
                }
                if (fs(activity)) {
                    iv();
                    return true;
                }
            }
            try {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_status", this.zg);
                jSONObject.put("js_finish", this.bvs);
                jSONObject.put("has_window", this.rc ? 1 : 0);
                hashMap.put("pag_json_data", jSONObject.toString());
                nqi nqiVar = this.zmn.fs;
                com.bytedance.sdk.openadsdk.fb.zn.zmn("show_popup_fail", nqiVar, nqiVar.btk(), hashMap);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private boolean fs(Activity activity) {
        if (!this.fb.isAttachedToWindow()) {
            Window window = activity.getWindow();
            if (window == null) {
                this.rc = false;
                return false;
            }
            this.rc = true;
            window.addContentView(this.fb, new WindowManager.LayoutParams(-1, -1));
        }
        this.fb.setVisibility(0);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.zn.zmn
    public void zmn(View view, int i, com.bytedance.sdk.component.adexpress.zn znVar) {
        if (i == 2) {
            com.bytedance.sdk.openadsdk.core.model.cyb cybVar = (com.bytedance.sdk.openadsdk.core.model.cyb) znVar;
            String str = cybVar.nps;
            if (cybVar.klz > 0) {
                nu.zmn(true);
            }
            this.btk.zmn(str);
            this.btk.zmn(view, cybVar.zmn, cybVar.fs, cybVar.zn, cybVar.fb, cybVar.iv, cybVar.rc);
            this.zmn.ww.xrr();
            nu.zmn(false);
            com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.zmn.fs, 9);
        }
    }

    public boolean bvs() {
        if (this.iv || !rc()) {
            return false;
        }
        n_();
        return true;
    }
}
