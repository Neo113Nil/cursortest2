package com.bytedance.sdk.openadsdk.phc.zmn.fs;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.zg.fs.zn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.cyb.fs;
import com.bytedance.sdk.openadsdk.cyb.zmn.fb;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class zmn {
    private static volatile zmn zg;
    private volatile Boolean zmn = null;
    private AtomicLong fs = new AtomicLong(0);
    private int zn = 0;
    private String fb = "";
    private final CountDownLatch btk = new CountDownLatch(1);
    private volatile boolean hhw = false;
    private String nps = "";

    public static zmn zmn() {
        if (zg == null) {
            synchronized (zmn.class) {
                try {
                    if (zg == null) {
                        zg = new zmn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zg;
    }

    private zmn() {
    }

    public String fs() {
        if (kgc.fb().vtz() == 1) {
            if (nu.hhw()) {
                return this.fb;
            }
            if (!this.hhw) {
                try {
                    this.btk.await(4L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    this.hhw = true;
                    this.btk.countDown();
                    throw th;
                }
                this.hhw = true;
                this.btk.countDown();
            }
            return this.fb;
        }
        return this.fb;
    }

    public void zmn(boolean z) {
        if (this.zn == 1 || !TextUtils.isEmpty(this.fb)) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.fs.get() <= elapsedRealtime) {
            this.fs.set(elapsedRealtime + 300000);
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            nu.zmn(new zn("pag_gaid") { // from class: com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.sdk.openadsdk.core.zn] */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [int] */
                /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
                @Override // java.lang.Runnable
                public void run() {
                    ?? r4;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(kgc.zmn());
                        if (advertisingIdInfo != null) {
                            r4 = advertisingIdInfo.isLimitAdTrackingEnabled();
                            if (r4 != 0) {
                                zmn.this.zn = 1;
                                zmn.this.zmn(2, "lmt", SystemClock.elapsedRealtime() - elapsedRealtime2);
                            }
                            if (r4 == 0) {
                                String id = advertisingIdInfo.getId();
                                String str = zmn.this.fb;
                                if (!TextUtils.isEmpty(id)) {
                                    zmn.this.fb = id;
                                    zmn.this.zmn(true, SystemClock.elapsedRealtime() - elapsedRealtime2);
                                } else {
                                    zmn.this.zmn(4, "empty gaid", SystemClock.elapsedRealtime() - elapsedRealtime2);
                                }
                                if (!str.equals(id)) {
                                    mw.zmn();
                                }
                            }
                        } else {
                            r4 = -1;
                        }
                        if (r4 != -1) {
                            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("limit_ad_track", r4);
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        }
    }

    public void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(O6.X0, fs());
        } catch (JSONException unused) {
        }
    }

    public void zmn(boolean z, long j) {
        zmn(z, 0, "", null, j);
    }

    public void zmn(int i, String str, long j) {
        zmn(false, i, str, null, j);
    }

    public void zmn(int i, Throwable th, long j) {
        zmn(false, i, "", th, j);
    }

    public void zmn(final boolean z, final int i, final String str, final Throwable th, final long j) {
        if ((this.zmn == null || this.zmn.booleanValue()) && kgc.zmn() != null) {
            kgc.btk().zmn(new fs() { // from class: com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.2
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                    if (!zmn.this.zn()) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, zmn.this.nps);
                    jSONObject.put("is_success", z);
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_msg", TextUtils.isEmpty(str) ? zmn.fs(th) : str);
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject.put("has_setting", rc.fs().zi() > 0);
                    return fb.fs().zmn("gid_status").fs(jSONObject.toString());
                }
            }, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zn() {
        if (this.zmn == null) {
            synchronized (this) {
                try {
                    if (this.zmn == null) {
                        this.zmn = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= com.bytedance.sdk.openadsdk.cyb.zn.fs("gid_status", 100));
                        if (this.zmn.booleanValue()) {
                            try {
                                this.nps = kjb.zmn();
                            } catch (Throwable unused) {
                                this.nps = "default";
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zmn.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fs(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement.toString());
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
