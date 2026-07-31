package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.fs;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.ev;
import com.bytedance.sdk.openadsdk.utils.kjb;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class fb extends PAGAppOpenAd {
    private boolean bvs;
    private com.bytedance.sdk.openadsdk.zmn.fb.fs fb;
    private final nqi fs;
    private final boolean nps;
    private boolean zg;
    private final Context zmn;
    private final AdSlot zn;
    private final AtomicBoolean btk = new AtomicBoolean(false);
    private final String hhw = kjb.zmn();

    public fb(Context context, @NonNull nqi nqiVar, boolean z, AdSlot adSlot) {
        this.zmn = context;
        this.fs = nqiVar;
        this.nps = z;
        this.zn = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.fb = new btk(pAGAppOpenAdInteractionListener, this.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.fb = new btk(pAGAppOpenAdInteractionCallback, this.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int i;
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.btk.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            nqi nqiVar = this.fs;
            iv.zmn(nqiVar, "show_ad_fail", nqiVar.btk(), "not_called_on_main_thread");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPBroadcastReceiver.fs(this.zmn, this.fs);
        Context context = activity != null ? activity : this.zmn;
        if (context == null) {
            context = kgc.zmn();
        }
        try {
            i = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            i = 0;
        }
        if (this.fs.so()) {
            intent = new Intent(context, (Class<?>) TTAppOpenAdTransActivity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTAppOpenAdActivity.class);
        }
        intent.putExtra("orientation_angle", i);
        intent.putExtra("ad_source", this.nps ? 1 : 2);
        boolean iv = com.bytedance.sdk.openadsdk.uqh.btk.iv();
        intent.putExtra("enable_new_arch", iv);
        am.zmn().btk();
        intent.putExtra("meta_index", am.zmn().zmn(this.fs));
        if (iv) {
            intent.putExtra("single_process_listener_key", this.hhw);
            am.zmn().zmn(this.hhw, (String) this.fb);
        } else {
            am.zmn().zmn(this.fb);
        }
        this.fb = null;
        nqi nqiVar2 = this.fs;
        iv.zmn(nqiVar2, "show_start", nqiVar2.btk(), (String) null);
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        AdSlot adSlot = this.zn;
        if (adSlot != null) {
            long cacheTime = adSlot.getCacheTime();
            if (cacheTime == 0 && this.fs.utx() != null) {
                cacheTime = this.fs.utx().getCacheTime();
            }
            intent.putExtra("cache_time", cacheTime);
        }
        com.bytedance.sdk.component.utils.fs.zmn(context, intent, new fs.InterfaceC0135fs() { // from class: com.bytedance.sdk.openadsdk.component.fb.1
            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn() {
            }

            @Override // com.bytedance.sdk.component.utils.fs.InterfaceC0135fs
            public void zmn(Throwable th) {
                iv.zmn(fb.this.fs, "show_ad_fail", fb.this.fs.btk(), "activity_start_fail");
            }
        });
        cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.fb.2
            @Override // java.lang.Runnable
            public void run() {
                if (fb.this.zn != null) {
                    try {
                        if (fb.this.fs == null || nqi.hhw(fb.this.fs) || fb.this.fs.dbc()) {
                            return;
                        }
                        hhw.zmn(fb.this.zmn).zmn(Integer.parseInt(fb.this.zn.getCodeId()), fb.this.fs.wbj());
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.zg) {
            return;
        }
        ev.zmn(this.fs, d);
        this.zg = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.bvs) {
            return;
        }
        ev.zmn(this.fs, d, str, str2);
        this.bvs = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        nqi nqiVar = this.fs;
        if (nqiVar != null) {
            return nqiVar.hr();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        nqi nqiVar = this.fs;
        if (nqiVar == null || nqiVar.hr() == null) {
            return null;
        }
        try {
            return this.fs.hr().get(str);
        } catch (Throwable th) {
            iqz.zn("TTAppOpenAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public boolean isReady() {
        return this.fs != null && System.currentTimeMillis() / 1000 <= this.fs.mf();
    }
}
