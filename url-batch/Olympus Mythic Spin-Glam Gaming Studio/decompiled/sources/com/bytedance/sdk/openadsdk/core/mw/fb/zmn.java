package com.bytedance.sdk.openadsdk.core.mw.fb;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.cn;
import com.bytedance.adsdk.ugeno.core.cyb;
import com.bytedance.adsdk.ugeno.core.klz;
import com.bytedance.adsdk.ugeno.core.mw;
import com.bytedance.adsdk.ugeno.fb.hhw;
import com.bytedance.adsdk.ugeno.fs.zn;
import com.bytedance.sdk.openadsdk.core.mw.nps.fb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class zmn implements cn, cyb {
    private cyb fb;
    private zn<View> fs;
    private final Context zmn;
    private InterfaceC0166zmn zn;

    /* renamed from: com.bytedance.sdk.openadsdk.core.mw.fb.zmn$zmn, reason: collision with other inner class name */
    interface InterfaceC0166zmn {
        void zmn(mw mwVar);
    }

    @Override // com.bytedance.adsdk.ugeno.core.cn
    public void zmn(zn znVar, String str, hhw.zmn zmnVar) {
    }

    public zmn(Context context) {
        this.zmn = context;
    }

    public void zmn(final JSONObject jSONObject, final JSONObject jSONObject2, final fb fbVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fs(jSONObject, jSONObject2, fbVar);
        } else {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mw.fb.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    zmn.this.fs(jSONObject, jSONObject2, fbVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(JSONObject jSONObject, JSONObject jSONObject2, fb fbVar) {
        try {
            klz klzVar = new klz(this.zmn);
            zn<View> zmn = klzVar.zmn(jSONObject);
            this.fs = zmn;
            if (zmn == null) {
                if (fbVar != null) {
                    fbVar.zmn(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View rc = zmn.rc();
            if (rc != null) {
                rc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mw.fb.zmn.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mw/fb/zmn$2;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view);
                        safedk_zmn$2_onClick_3b6699a4f8a345d9e104329c01058a37(view);
                    }

                    public void safedk_zmn$2_onClick_3b6699a4f8a345d9e104329c01058a37(View p0) {
                    }
                });
            }
            klzVar.zmn((cn) this);
            klzVar.zmn((cyb) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put(POBConstants.KEY_LANGUAGE, com.bytedance.sdk.openadsdk.core.mw.fs());
                    jSONObject2.put("os", "Android");
                } catch (JSONException unused) {
                }
            }
            klzVar.fs(jSONObject2);
            if (fbVar != null) {
                fbVar.zmn(this.fs);
            }
        } catch (Exception e) {
            if (fbVar != null) {
                fbVar.zmn(3000, "ugen render fail exception is" + e.getMessage());
            }
        }
    }

    public void zmn(InterfaceC0166zmn interfaceC0166zmn) {
        this.zn = interfaceC0166zmn;
    }

    public void zmn(cyb cybVar) {
        this.fb = cybVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.cn
    public void zmn(mw mwVar, cn.fs fsVar, cn.zmn zmnVar) {
        InterfaceC0166zmn interfaceC0166zmn;
        if (mwVar == null) {
            return;
        }
        if ((mwVar.fs() == 1 || mwVar.fs() == 4) && (interfaceC0166zmn = this.zn) != null) {
            interfaceC0166zmn.zmn(mwVar);
        }
        if (fsVar == null || mwVar.fb() == null) {
            return;
        }
        fsVar.zmn(mwVar.fb());
    }

    @Override // com.bytedance.adsdk.ugeno.core.cyb
    public void zmn(zn znVar, MotionEvent motionEvent) {
        cyb cybVar = this.fb;
        if (cybVar != null) {
            cybVar.zmn(znVar, motionEvent);
        }
    }
}
