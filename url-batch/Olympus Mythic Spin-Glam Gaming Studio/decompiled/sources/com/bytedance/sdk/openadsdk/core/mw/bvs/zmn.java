package com.bytedance.sdk.openadsdk.core.mw.bvs;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.cn;
import com.bytedance.adsdk.ugeno.core.cyb;
import com.bytedance.adsdk.ugeno.core.klz;
import com.bytedance.adsdk.ugeno.core.mw;
import com.bytedance.adsdk.ugeno.core.rc;
import com.bytedance.adsdk.ugeno.fb.hhw;
import com.bytedance.adsdk.ugeno.fs.zn;
import com.bytedance.sdk.openadsdk.core.mw.nps.fb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class zmn implements cn, cyb {
    private klz fs;
    private Context zmn;
    private zn zn;

    @Override // com.bytedance.adsdk.ugeno.core.cn
    public void zmn(mw mwVar, cn.fs fsVar, cn.zmn zmnVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.cyb
    public void zmn(zn znVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.cn
    public void zmn(zn znVar, String str, hhw.zmn zmnVar) {
    }

    public zmn(Context context) {
        this.zmn = context;
    }

    public void zmn(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final fb fbVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fs(jSONObject, jSONObject2, jSONObject3, fbVar);
        } else {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mw.bvs.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    zmn.this.fs(jSONObject, jSONObject2, jSONObject3, fbVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, fb fbVar) {
        this.fs = new klz(this.zmn);
        zmn();
        this.fs.zmn((cn) this);
        this.fs.zmn((cyb) this);
        if (jSONObject == null || jSONObject2 == null) {
            if (fbVar != null) {
                fbVar.zmn(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "template or data is null");
                return;
            }
            return;
        }
        try {
            zn<View> zmn = this.fs.zmn(jSONObject, jSONObject2, jSONObject3);
            this.zn = zmn;
            if (zmn != null) {
                fbVar.zmn(zmn);
            } else if (fbVar != null) {
                fbVar.zmn(3000, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (fbVar != null) {
                fbVar.zmn(138, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (fbVar != null) {
                fbVar.zmn(139, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (fbVar != null) {
                fbVar.zmn(138, "ugen render error");
            }
        }
    }

    private void zmn() {
        rc rcVar = new rc();
        rcVar.zmn(this.zmn);
        this.fs.zmn("page", rcVar);
    }
}
