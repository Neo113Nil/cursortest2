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
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.fs;
import com.bytedance.sdk.openadsdk.activity.TTRewardWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.klz;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class nps extends fs implements hhw {
    private static com.bytedance.sdk.openadsdk.zmn.btk.zmn iqz;
    private String doe;
    public com.bytedance.sdk.openadsdk.component.reward.zn.fs.hhw kgc;
    private com.bytedance.sdk.openadsdk.zmn.btk.zmn kw;
    private String nqi;
    private long phc;

    public nps(Activity activity, Context context, nqi nqiVar, String str, ViewGroup viewGroup, String str2) {
        super(activity, context, nqiVar, str, viewGroup, str2);
        this.phc = System.currentTimeMillis();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    public void zmn(@Nullable Bundle bundle) {
        super.zmn(bundle);
        Intent intent = this.fb.getIntent();
        if (intent != null) {
            this.doe = intent.getStringExtra("media_extra");
            this.nqi = intent.getStringExtra("user_id");
        }
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.hhw hhwVar = new com.bytedance.sdk.openadsdk.component.reward.zn.fs.hhw(this.btk, this.fb, this.nqi, this.doe);
        this.kgc = hhwVar;
        hhwVar.zmn(this);
        if (bundle != null) {
            this.kgc.fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    public void fs(Bundle bundle) {
        if (!this.cyb) {
            iqz = this.kw;
        }
        super.fs(bundle);
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.hhw hhwVar = this.kgc;
        if (hhwVar != null) {
            hhwVar.zmn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void klz() {
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.kw;
        if (zmnVar != null) {
            zmnVar.zmn();
        } else {
            iv.zmn(this.btk, "show", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void mw() {
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.kw;
        if (zmnVar != null) {
            zmnVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void zmn(boolean z, int i, String str, int i2, String str2, int i3) {
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.kw;
        if (zmnVar != null) {
            zmnVar.zmn(z, i, str, i2, str2);
            klz.zmn(this.btk, z, i3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    public void hhw() {
        super.hhw();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    public void zn() {
        super.zn();
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
        this.kw = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    public void zn(Bundle bundle) {
        super.zn(bundle);
        if (this.cyb) {
            this.kw = (com.bytedance.sdk.openadsdk.zmn.btk.zmn) am.zmn().zmn(this.zmn, com.bytedance.sdk.openadsdk.zmn.btk.zmn.class);
            return;
        }
        com.bytedance.sdk.openadsdk.zmn.btk.zmn fs = am.zmn().fs();
        this.kw = fs;
        if (fs != null || bundle == null) {
            return;
        }
        this.kw = iqz;
        iqz = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void btk() {
        this.nps.zmn((hhw) this);
        super.btk();
    }

    public void zmn(boolean z, boolean z2) {
        if (!this.cyb || TextUtils.isEmpty(this.zmn)) {
            return;
        }
        am.zmn().zmn(this.zmn, z, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs, com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i) {
        super.onRenderFail(view, str, i);
        cn.zn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.nps.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d("UnifyRewardBundle", "run: start backup activity");
                com.bytedance.sdk.openadsdk.component.reward.zmn.zmn zmnVar = nps.this.iv;
                if (zmnVar != null) {
                    zmnVar.btk();
                }
                nps.this.kgc();
                Activity activity = nps.this.fb;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                Activity activity2 = nps.this.fb;
                if (activity2 instanceof TTRewardWebActivity) {
                    ((TTRewardWebActivity) activity2).fs();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void cyb() {
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.kw;
        if (zmnVar != null) {
            zmnVar.fs();
        } else {
            iv.zmn(this.btk, "close", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgc() {
        com.bytedance.sdk.openadsdk.core.model.zmn fb;
        nqi nqiVar = this.btk;
        if (nqiVar == null || (fb = nqiVar.fb()) == null || !fb.hhw()) {
            return;
        }
        final nqi nps = fb.nps();
        List<nqi> btk = fb.btk();
        if (btk != null) {
            Iterator<nqi> it = btk.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.fs(this.mw, it.next());
            }
        }
        nps.kw(1);
        Context context = this.fb;
        if (context == null) {
            context = this.mw;
        }
        if (context == null) {
            context = kgc.zmn();
        }
        Intent intent = new Intent(context, (Class<?>) TTRewardExpressVideoActivity.class);
        if (iqz.btk(this.btk)) {
            this.btk.zmn(7, 8);
            if (this.btk.mrt() != null) {
                this.btk.mrt().fb("");
            }
            intent.putExtra("extra_conversion_link", 5);
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(intent, this.fb, this.zn, fb, this.zmn);
        intent.putExtra("media_extra", this.doe);
        intent.putExtra("user_id", this.nqi);
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        intent.putExtra("enable_new_arch", this.cyb);
        if (this.cyb) {
            am.zmn().zmn(this.zmn, (String) this.kw);
        } else {
            am.zmn().zmn(this.kw);
        }
        this.kw = null;
        intent.putExtra("back_up", true);
        if (com.bytedance.sdk.openadsdk.uqh.btk.zmn("start_activity_async", 0) == 1) {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.nps.2
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("start_activity");
                    zmnVar.fb("rewarded_video");
                    return zmnVar;
                }
            });
        }
        com.bytedance.sdk.component.utils.fs.zmn(context, intent, new fs.InterfaceC0135fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.nps.3
            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn() {
            }

            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn(Throwable th) {
                iv.zmn(nps, "show_ad_fail", nps.this.hhw, "activity_start_fail");
            }
        }, true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.hhw
    public void zmn(long j, int i) {
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.hhw hhwVar = this.kgc;
        if (hhwVar != null) {
            hhwVar.zmn(j, i, 13);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.hhw
    public void fs(boolean z, int i, String str, int i2, String str2, int i3) {
        zn(z, i, str, i2, str2, i3);
    }

    private void zn(final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        com.bytedance.sdk.component.utils.iqz.zmn("UnifyRewardBundle", "invoke callback onRewardVerify: " + z + ", " + i + ", " + str + ", " + i2 + ", " + str2 + "; " + this);
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.nps.4
            @Override // java.lang.Runnable
            public void run() {
                nps.this.zmn(z, i, str, i2, str2, i3);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs
    protected void rt() {
        super.rt();
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.hhw hhwVar = this.kgc;
        if (hhwVar != null) {
            hhwVar.zmn(this.cn, (int) (System.currentTimeMillis() - this.cn), 14);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.cyb) {
            return;
        }
        iqz = null;
    }
}
