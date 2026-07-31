package com.bytedance.sdk.openadsdk.component.reward.zn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.fs;
import com.bytedance.sdk.openadsdk.activity.TTFullWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class zn extends fs {
    private static com.bytedance.sdk.openadsdk.zmn.zn.fs kw;
    private long iqz;
    private com.bytedance.sdk.openadsdk.zmn.zn.fs kgc;

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void zmn(boolean z, int i, String str, int i2, String str2, int i3) {
    }

    public zn(Activity activity, Context context, nqi nqiVar, String str, ViewGroup viewGroup, String str2) {
        super(activity, context, nqiVar, str, viewGroup, str2);
        this.iqz = System.currentTimeMillis();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    public void fs(Bundle bundle) {
        if (!this.cyb) {
            kw = this.kgc;
        }
        super.fs(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void klz() {
        com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.kgc;
        if (fsVar != null) {
            fsVar.zmn();
        } else {
            iv.zmn(this.btk, "show", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void mw() {
        com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.kgc;
        if (fsVar != null) {
            fsVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs, com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i) {
        super.onRenderFail(view, str, i);
        cn.zn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zn.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d("UnifyFullManagerBundle", "run: start backup activity");
                com.bytedance.sdk.openadsdk.component.reward.zmn.zmn zmnVar = zn.this.iv;
                if (zmnVar != null) {
                    zmnVar.btk();
                }
                zn.this.kgc();
                Activity activity = zn.this.fb;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                Activity activity2 = zn.this.fb;
                if (activity2 instanceof TTFullWebActivity) {
                    ((TTFullWebActivity) activity2).fs();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void cyb() {
        toString();
        com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.kgc;
        if (fsVar != null) {
            fsVar.fs();
        } else {
            iv.zmn(this.btk, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    public void zg() {
        super.zg();
        if (this.rt.get()) {
            olo();
        }
        zmn(this.fb.isFinishing(), this.fb.isChangingConfigurations());
        if (this.cyb) {
            return;
        }
        this.kgc = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    public void zn(Bundle bundle) {
        super.zn(bundle);
        if (this.cyb) {
            this.kgc = (com.bytedance.sdk.openadsdk.zmn.zn.fs) am.zmn().zmn(this.zmn, com.bytedance.sdk.openadsdk.zmn.zn.fs.class);
            return;
        }
        com.bytedance.sdk.openadsdk.zmn.zn.fs zn = am.zmn().zn();
        this.kgc = zn;
        if (zn != null || bundle == null) {
            return;
        }
        this.kgc = kw;
        kw = null;
    }

    public void zmn(boolean z, boolean z2) {
        if (!TextUtils.isEmpty(this.zmn)) {
            am.zmn().zmn(this.zmn, z, z2);
        }
        if (!this.cyb || TextUtils.isEmpty(this.zmn)) {
            return;
        }
        am.zmn().zmn(this.zmn, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgc() {
        com.bytedance.sdk.openadsdk.core.model.zmn fb;
        nqi nqiVar = this.btk;
        if (nqiVar == null || (fb = nqiVar.fb()) == null) {
            return;
        }
        List<nqi> btk = fb.btk();
        if (btk != null) {
            Iterator<nqi> it = btk.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.fs(this.mw, it.next());
            }
        }
        nqi nqiVar2 = this.btk;
        if (nqiVar2 == null || (nqiVar2.mrt() == null && this.btk.tj() == null)) {
            iv.zmn(this.btk, "show_ad_fail", this.hhw, "video_or_image_empty");
            return;
        }
        this.btk.kw(1);
        iv.zmn(this.btk, "show_start", this.hhw, (String) null);
        Context context = this.fb;
        if (context == null) {
            context = this.mw;
        }
        if (context == null) {
            context = kgc.zmn();
        }
        Intent intent = new Intent(context, (Class<?>) TTFullScreenExpressVideoActivity.class);
        if (iqz.btk(this.btk)) {
            this.btk.zmn(7, 8);
            if (this.btk.mrt() != null) {
                this.btk.mrt().fb("");
            }
            intent.putExtra("extra_conversion_link", 5);
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        intent.putExtra("enable_new_arch", this.cyb);
        com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(intent, this.fb, this.zn, fb, this.zmn);
        if (this.cyb) {
            am.zmn().zmn(this.zmn, (String) this.kgc);
        } else {
            am.zmn().zmn(this.kgc);
        }
        this.kgc = null;
        intent.putExtra("back_up", true);
        final boolean z = com.bytedance.sdk.openadsdk.uqh.btk.zmn("start_activity_async", 0) == 1;
        if (z) {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zn.2
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("start_activity");
                    zmnVar.fb("fullscreen_interstitial_ad");
                    return zmnVar;
                }
            });
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.fs.zmn(context, intent, new fs.InterfaceC0135fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zn.3
            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn() {
                if (z) {
                    com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zn.3.1
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("start_activity");
                            zmnVar.fb("fullscreen_interstitial_ad");
                            return zmnVar;
                        }
                    });
                    final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    com.bytedance.sdk.openadsdk.cyb.fb.zmn("start_activity_action", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zn.3.2
                        @Override // com.bytedance.sdk.openadsdk.cyb.fs
                        public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime2);
                            return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("start_activity_action").fs(jSONObject.toString());
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn(Throwable th) {
                zn znVar = zn.this;
                iv.zmn(znVar.btk, "show_ad_fail", znVar.hhw, "activity_start_fail");
                if (z) {
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.zn.3.3
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("start_activity");
                            zmnVar.fb("fullscreen_interstitial_ad");
                            return zmnVar;
                        }
                    });
                }
            }
        }, true);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.cyb) {
            return;
        }
        kw = null;
    }
}
