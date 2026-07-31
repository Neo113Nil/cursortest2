package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.zg.fs.zn;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.zak;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IPBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPBroadcastReceiver zmn;
    private int fb = 0;
    private final LruCache<String, nqi> fs;
    private zmn zn;

    private IPBroadcastReceiver() {
        int i = 10;
        int zmn2 = btk.zmn("ip_data_config", "ip_ad_cache_count", 10);
        if (zmn2 > 0 && zmn2 <= 200) {
            i = zmn2;
        }
        this.fs = new LruCache<>(i);
    }

    public void zmn(String str, nqi nqiVar) {
        if (TextUtils.isEmpty(str) || nqiVar == null || this.fs.get(str) != null) {
            return;
        }
        this.fs.put(str, nqiVar);
    }

    public nqi zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.fs.get(str);
    }

    public void zmn(zmn zmnVar) {
        this.zn = zmnVar;
    }

    public void zmn() {
        this.zn = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            zmn(intent);
        } else if ("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED".equals(intent.getAction())) {
            fs(intent);
        }
    }

    private void zmn(final Intent intent) {
        if (intent == null) {
            return;
        }
        nu.fs(new zn("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                final int i;
                final int i2;
                final int i3;
                try {
                    int i4 = 0;
                    final int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                    if (intExtra < 0) {
                        int intExtra2 = intent.getIntExtra("reason", 0);
                        if (intExtra == -4 && intExtra2 == -1) {
                            return;
                        } else {
                            i = intExtra2;
                        }
                    } else {
                        i = 0;
                    }
                    if (intExtra == 5) {
                        int intExtra3 = intent.getIntExtra("status", 0);
                        if (intExtra3 == -2) {
                            try {
                                i4 = intent.getIntExtra("progress", 0);
                            } catch (Throwable unused) {
                                IPBroadcastReceiver.this.fb = 1;
                            }
                            if (i4 < 100) {
                                return;
                            }
                        }
                        i2 = intExtra3;
                        i3 = i4;
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                    String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                    zmn zmnVar = IPBroadcastReceiver.this.zn;
                    if (intExtra > 0 && zmnVar != null) {
                        zmnVar.zmn(stringExtra, intExtra);
                    }
                    final nqi zmn2 = IPBroadcastReceiver.this.zmn(stringExtra);
                    if (zmn2 != null) {
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), zmn2, oub.zmn(zmn2), "ip_listener_log", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1.1
                            @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                            public JSONObject zmn() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("ip_error_code", intExtra);
                                    nqi nqiVar = zmn2;
                                    if (nqiVar != null) {
                                        jSONObject.put("ip_is_w2a", nqiVar.kgc());
                                    }
                                    int i5 = intExtra;
                                    if (i5 > 0) {
                                        if (i5 == 5) {
                                            jSONObject.put("ip_status", i2);
                                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.fb);
                                        }
                                        if (i2 == -2) {
                                            jSONObject.put("ip_progress", i3);
                                        }
                                    }
                                    if (intExtra < 0) {
                                        jSONObject.put("ip_reason", i);
                                    }
                                    return jSONObject;
                                } catch (Throwable th) {
                                    iqz.zmn("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                                    return null;
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    iqz.zmn("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                }
            }
        });
    }

    private void fs(final Intent intent) {
        if (intent == null) {
            return;
        }
        nu.fs(new zn("ip-oppo") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int intExtra = intent.getIntExtra("event_type", 0);
                    final String stringExtra = intent.getStringExtra("event_track");
                    if (intExtra != 7 && intExtra != 9 && stringExtra != null) {
                        final String stringExtra2 = intent.getStringExtra("event_id");
                        final String stringExtra3 = intent.getStringExtra(BrandSafetyEvent.g);
                        final String stringExtra4 = intent.getStringExtra("market_version");
                        final String stringExtra5 = intent.getStringExtra("caller");
                        final int zmn2 = fs.zmn(intExtra);
                        final int fs = fs.fs(intExtra);
                        String.format("eventId: %s, eventType: %s, eventTrack: %s, appPackage: %s, marketVersion: %s, caller: %s, errorCode: %s, status: %s", stringExtra2, Integer.valueOf(intExtra), stringExtra, stringExtra3, stringExtra4, stringExtra5, Integer.valueOf(zmn2), Integer.valueOf(fs));
                        zmn zmnVar = IPBroadcastReceiver.this.zn;
                        if (zmn2 > 0 && zmnVar != null) {
                            zmnVar.zmn(stringExtra3, zmn2);
                        }
                        final nqi zmn3 = IPBroadcastReceiver.this.zmn(stringExtra3);
                        if (zmn3 != null) {
                            com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), zmn3, oub.zmn(zmn3), "ip_listener_log", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2.1
                                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                                public JSONObject zmn() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", zmn2);
                                        jSONObject.put("ip_market_version", stringExtra4);
                                        jSONObject.put("ip_app_pkg", stringExtra3);
                                        jSONObject.put("ip_caller_pkg", stringExtra5);
                                        jSONObject.put("ip_event_id", stringExtra2);
                                        jSONObject.put("ip_event_track", stringExtra);
                                        jSONObject.put("ip_status", fs);
                                        jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.fb);
                                        nqi nqiVar = zmn3;
                                        if (nqiVar != null) {
                                            jSONObject.put("ip_is_w2a", nqiVar.kgc());
                                            if (zmn3.rvx() != null) {
                                                jSONObject.put("ip_oem_type", zmn3.rvx().hhw());
                                            }
                                        }
                                        return jSONObject;
                                    } catch (Throwable th) {
                                        iqz.zmn("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                                        return null;
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    iqz.zmn("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                    IPBroadcastReceiver.this.fb = 2;
                }
            }
        });
    }

    public static IPBroadcastReceiver zmn(Context context, nqi nqiVar) {
        zak rvx;
        if (btk.zmn("ip_data_config", "ip_link_listener", 0) == 0 || nqiVar == null || (rvx = nqiVar.rvx()) == null) {
            return null;
        }
        if (zmn == null) {
            synchronized (IPBroadcastReceiver.class) {
                try {
                    if (zmn == null) {
                        zmn = new IPBroadcastReceiver();
                        IntentFilter intentFilter = new IntentFilter();
                        if (rvx.nps()) {
                            intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                        } else if (rvx.zg()) {
                            intentFilter.addAction("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED");
                        }
                        if (Build.VERSION.SDK_INT >= 34 && oub.hhw(context) >= 34) {
                            context.registerReceiver(zmn, intentFilter, 2);
                        } else {
                            context.registerReceiver(zmn, intentFilter);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public static void fs(final Context context, final nqi nqiVar) {
        zak rvx;
        if (zmn != null || nqiVar == null || (rvx = nqiVar.rvx()) == null) {
            return;
        }
        if (rvx.nps() || rvx.zg()) {
            cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPBroadcastReceiver.zmn(kgc.zmn(context), nqiVar);
                    } catch (Throwable th) {
                        iqz.zmn("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy error ", th);
                    }
                }
            });
        }
    }
}
