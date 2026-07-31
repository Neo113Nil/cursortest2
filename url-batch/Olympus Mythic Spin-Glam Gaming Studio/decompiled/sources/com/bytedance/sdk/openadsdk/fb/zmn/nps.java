package com.bytedance.sdk.openadsdk.fb.zmn;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.kgc;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class nps implements com.bytedance.sdk.component.hhw.zmn.btk {
    private final String zmn = "[8104]";

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public boolean fs() {
        return false;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public int hhw() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public boolean nps() {
        return false;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public com.bytedance.sdk.component.hhw.zmn.hhw rc() {
        return null;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public boolean zg() {
        return true;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public com.bytedance.sdk.component.hhw.zmn.fb.zmn zmn(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public boolean zmn() {
        return false;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public boolean zn() {
        return true;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public boolean zmn(Context context) {
        return kgc.zmn(context);
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public String zmn(String str) {
        return com.bytedance.sdk.component.fb.zmn.fs(str, com.bytedance.sdk.openadsdk.core.zmn.zmn());
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public String fs(String str) {
        return com.bytedance.sdk.component.fb.zmn.zmn(str, com.bytedance.sdk.openadsdk.core.zmn.zmn());
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public String bvs() {
        return oub.fb();
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public com.bytedance.sdk.component.hhw.zmn.btk.zn iv() {
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk()) {
            return null;
        }
        return new zn();
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public Executor fb() {
        return nu.fb();
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public Executor btk() {
        return nu.zg();
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public void zmn(boolean z, int i, long j, com.bytedance.sdk.component.hhw.zmn.hhw.fb fbVar) {
        Runnable zmn;
        if (fbVar == null) {
            return;
        }
        if (z) {
            com.bytedance.sdk.openadsdk.cyb.fb.zmn("track_link_result", false, new bvs(true, fbVar));
            return;
        }
        iv wq = rc.fs().wq();
        if (wq == null || fbVar.fb() >= wq.zmn(fbVar.hhw())) {
            com.bytedance.sdk.openadsdk.cyb.fb.zmn("track_link_result", false, new bvs(false, fbVar));
        } else {
            if (!wq.zmn() || (zmn = fbVar.zmn(mw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()), null)) == null) {
                return;
            }
            nu.zmn().schedule(zmn, wq.fs(fbVar.hhw()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public int zn(String str) {
        iv wq = rc.fs().wq();
        if (wq == null) {
            return 3;
        }
        return wq.zmn(str);
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public long klz() {
        long zmn = com.bytedance.sdk.openadsdk.uqh.btk.zmn("log_queue_timeout", 40000);
        if (zmn < 30000 || zmn > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return zmn;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public HandlerThread zmn(String str, int i) {
        return com.bytedance.sdk.component.utils.zg.zmn(str, i);
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public boolean mw() {
        return com.bytedance.sdk.openadsdk.uqh.btk.zmn("batch_log_config", a.k, 0) == 1;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public boolean rt() {
        return com.bytedance.sdk.openadsdk.uqh.btk.zmn("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.btk
    public int cn() {
        return com.bytedance.sdk.openadsdk.uqh.btk.zmn("batch_log_config", "once_max", 10);
    }
}
