package com.bytedance.sdk.openadsdk.core.mw.hhw.zmn;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.iv.kjb;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.ev;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw.hhw.nps;
import com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.fs;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class hhw extends nps {
    private static Boolean am;
    private float bjh;
    private boolean kjb;
    private float rp;
    private final fs zak;

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.fb, com.bytedance.sdk.component.adexpress.fs.fb
    public int zn() {
        return 1;
    }

    public hhw(Context context, nqi nqiVar, boolean z, com.bytedance.sdk.openadsdk.core.mw.hhw.zmn zmnVar, ViewGroup viewGroup, float f, float f2, boolean z2, String str) {
        super(context, nqiVar, z, zmnVar, viewGroup);
        this.zak = fs.zmn.zmn(nqiVar, zmnVar);
        this.doe = str;
        this.bjh = f;
        this.rp = f2;
        this.kjb = z2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.nps, com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    protected JSONObject fs() {
        return zmn(this.bjh, this.rp, this.kjb, this.btk, this.doe);
    }

    private JSONObject zmn(float f, float f2, boolean z, nqi nqiVar, String str) {
        JSONObject zmn = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(f, f2, z, nqiVar, str);
        this.uqh = zmn;
        if (zmn == null) {
            return null;
        }
        try {
            JSONObject optJSONObject = zmn.optJSONObject("xSize");
            if (optJSONObject != null) {
                optJSONObject.put("imageModeRatio", klz());
            }
            JSONObject optJSONObject2 = this.uqh.optJSONObject("xAdInfo");
            if (optJSONObject2 != null) {
                optJSONObject2.put("isVideoImageMode", nqi.btk(this.btk));
                optJSONObject2.put("feed_draw_purePlayable", mw());
                optJSONObject2.put("isFeedDraw", rt());
            }
            fs fsVar = this.zak;
            if (fsVar != null) {
                fsVar.zmn(this.uqh);
            }
        } catch (Exception unused) {
        }
        return this.uqh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.nps, com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    protected JSONObject zmn() {
        fs fsVar = this.zak;
        if (fsVar != null) {
            try {
                return PangleNetworkBridge.jsonObjectInit(fsVar.zmn());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.nps
    public JSONObject zmn(ev evVar) {
        fs fsVar = this.zak;
        if (fsVar != null) {
            return fsVar.fs();
        }
        return null;
    }

    public float klz() {
        nqi nqiVar = this.btk;
        if (nqiVar == null) {
            return 1.0f;
        }
        int zq = nqiVar.zq();
        if (zq == 3) {
            return 1.91f;
        }
        if (zq == 5) {
            return 1.78f;
        }
        if (zq == 15 || zq == 173) {
            return 0.5625f;
        }
        if (zq == 33 || zq == 50) {
            return 1.0f;
        }
        if (zq == 1010) {
            return 1.2f;
        }
        if (zq == 1011) {
            return 6.4f;
        }
        return zq == 1012 ? 3.2f : 1.0f;
    }

    private boolean mw() {
        return this.btk != null && rt() && am.zn(this.btk);
    }

    private boolean rt() {
        nqi nqiVar = this.btk;
        if (nqiVar == null) {
            return false;
        }
        int sft = nqiVar.sft();
        boolean z = sft == 7 || sft == 8;
        int cd = this.btk.cd();
        return z && (cd == 43 || cd == 44);
    }

    public static boolean zmn(String str) {
        if (am == null) {
            am = Boolean.valueOf(com.bytedance.sdk.openadsdk.uqh.btk.zmn("express_backup_type", 0) == 1);
        }
        return am.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || kjb.fs(str) || (TextUtils.equals(str, "open_ad") && com.bytedance.sdk.openadsdk.component.nps.zmn.rc()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.hhw.nps, com.bytedance.sdk.openadsdk.core.mw.hhw.fb
    protected com.bytedance.adsdk.ugeno.fs.zn zg() {
        com.bytedance.adsdk.ugeno.fs.zn<View> znVar = this.zn;
        if (znVar == null) {
            return null;
        }
        return znVar.nps("VideoV3");
    }
}
