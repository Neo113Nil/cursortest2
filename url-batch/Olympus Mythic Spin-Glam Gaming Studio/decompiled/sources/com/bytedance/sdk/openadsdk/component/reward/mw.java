package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.fs;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ev;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class mw {
    protected final AtomicBoolean btk = new AtomicBoolean(false);
    protected boolean fb;
    protected final com.bytedance.sdk.openadsdk.core.model.zmn fs;
    protected boolean hhw;
    protected boolean nps;
    private final zmn zg;
    protected final Context zmn;
    protected final String zn;

    public interface zmn {
        Intent zmn(Context context, nqi nqiVar, @Nullable Activity activity);

        void zmn(Intent intent, @Nullable Activity activity, nqi nqiVar, boolean z);

        void zmn(nqi nqiVar);

        void zmn(boolean z);
    }

    public mw(Context context, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, String str, zmn zmnVar2) {
        this.zmn = context == null ? com.bytedance.sdk.openadsdk.core.kgc.zmn() : context;
        this.fs = zmnVar;
        this.zn = str;
        this.fb = false;
        this.zg = zmnVar2;
    }

    public void zmn() {
        if (this.btk.get()) {
            return;
        }
        this.fb = true;
    }

    public Map<String, Object> fs() {
        com.bytedance.sdk.openadsdk.core.model.zmn zmnVar = this.fs;
        if (zmnVar == null || zmnVar.nps() == null) {
            return null;
        }
        return this.fs.nps().hr();
    }

    public Object zmn(String str) {
        com.bytedance.sdk.openadsdk.core.model.zmn zmnVar = this.fs;
        if (zmnVar == null || zmnVar.nps() == null || this.fs.nps().hr() == null) {
            return null;
        }
        try {
            return this.fs.nps().hr().get(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn(this.zn, th.getMessage());
            return null;
        }
    }

    public void zmn(Double d) {
        if (this.hhw) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.zmn zmnVar = this.fs;
        if (zmnVar != null && zmnVar.nps() != null) {
            ev.zmn(this.fs.nps(), d);
        }
        this.hhw = true;
    }

    public void zmn(Double d, String str, String str2) {
        if (this.nps) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.zmn zmnVar = this.fs;
        if (zmnVar != null && zmnVar.nps() != null) {
            ev.zmn(this.fs.nps(), d, str, str2);
        }
        this.nps = true;
    }

    public void zmn(@Nullable final Activity activity) {
        if (!com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.mw.1
                @Override // java.lang.Runnable
                public void run() {
                    mw.this.fs(activity);
                }
            });
        } else {
            fs(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(@Nullable Activity activity) {
        nqi nps;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.zmn zmnVar = this.fs;
        if (zmnVar == null || !zmnVar.hhw() || (nps = this.fs.nps()) == null) {
            return;
        }
        fb();
        if (!this.btk.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.fb.iv.zmn(nps, "show_ad_fail", this.zn, "repeat_play");
            return;
        }
        if (nps.mrt() == null && nps.tj().isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.iv.zmn(nps, "show_start", this.zn, (String) null);
        Context context = activity == null ? this.zmn : activity;
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        }
        if (context == null) {
            com.bytedance.sdk.openadsdk.fb.iv.zmn(nps, "show_ad_fail", this.zn, "context_is_null");
            return;
        }
        Intent zmn2 = this.zg.zmn(context, nps, activity);
        if (zmn2 == null) {
            com.bytedance.sdk.openadsdk.fb.iv.zmn(nps, "show_ad_fail", this.zn, "intent_is_null");
            return;
        }
        zmn2.putExtra("start_show_time", SystemClock.elapsedRealtime());
        boolean iv = com.bytedance.sdk.openadsdk.uqh.btk.iv();
        zmn2.putExtra("enable_new_arch", iv);
        this.zg.zmn(zmn2, activity, nps, iv);
        this.zg.zmn(iv);
        zmn(context, zmn2, nps, iv);
        this.zg.zmn(nps);
    }

    private void zmn(final Context context, final Intent intent, final nqi nqiVar, final boolean z) {
        final boolean z2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("start_activity_async", 0) == 1;
        if (z2) {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.component.reward.mw.2
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("start_activity");
                    zmnVar.fb(mw.this.zn);
                    return zmnVar;
                }
            });
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.fs.zmn(context, intent, new fs.InterfaceC0135fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.mw.3
            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn() {
                if (z2) {
                    mw.this.zmn(elapsedRealtime);
                }
            }

            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn(Throwable th) {
                JSONObject jSONObject;
                String zmn2 = mw.this.zmn(th, context, intent, z2, z);
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_msg_detail", zmn2);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    jSONObject = null;
                }
                com.bytedance.sdk.openadsdk.fb.iv.zmn(nqiVar, "show_ad_fail", mw.this.zn, "activity_start_fail", jSONObject);
                if (z2) {
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.component.reward.mw.3.1
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("start_activity");
                            zmnVar.fb(mw.this.zn);
                            return zmnVar;
                        }
                    });
                }
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String zmn(Throwable th, Context context, Intent intent, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("async=");
            sb.append(z);
            sb.append(", newArch=");
            sb.append(z2);
            sb.append(", thread=");
            sb.append(Thread.currentThread().getName());
            sb.append(", context=");
            sb.append(context == null ? POBCommonConstants.NULL_VALUE : context.getClass().getName());
            sb.append(", intent=");
            sb.append(intent);
            if (th != null) {
                sb.append(", errorClass=");
                sb.append(th.getClass().getName());
                sb.append(", errorMsg=");
                sb.append(th.getMessage());
            } else {
                sb.append(", error=null");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return sb.toString();
        }
    }

    private void fb() {
        List<nqi> btk = this.fs.btk();
        if (btk != null) {
            Iterator<nqi> it = btk.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.fs(this.zmn, it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(long j) {
        com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.component.reward.mw.4
            @Override // com.bytedance.sdk.openadsdk.kgc.fb
            public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                zmnVar.fs("start_activity");
                zmnVar.fb(mw.this.zn);
                return zmnVar;
            }
        });
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("start_activity_action", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.mw.5
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("start_activity_action").fs(jSONObject.toString());
            }
        });
    }

    public boolean zn() {
        return this.fb;
    }
}
