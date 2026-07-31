package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class rp {
    private static final Object zmn = new Object();
    private static final Map<zmn, Object> fs = new ConcurrentHashMap();
    private static final AtomicInteger zn = new AtomicInteger();
    private static AtomicBoolean fb = new AtomicBoolean(false);
    private static volatile int btk = -1;
    private static volatile long hhw = 0;
    private static volatile int nps = 60000;
    private static kw zg = null;
    private static final AtomicBoolean bvs = new AtomicBoolean(false);

    public interface zmn {
        void zmn(Context context, Intent intent, boolean z, int i);
    }

    public static int zmn(Context context, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (hhw + j <= elapsedRealtime) {
            return fs(context);
        }
        if (btk == -1) {
            return fs(context);
        }
        if (elapsedRealtime - hhw >= nps) {
            fs(context, (Intent) null, false, false);
        }
        return btk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            btk = 0;
        } else if (bvs.compareAndSet(false, true)) {
            com.bytedance.sdk.component.zg.zmn.zmn(new Runnable() { // from class: com.bytedance.sdk.component.utils.rp.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = rp.btk = z2 ? 0 : rp.fs(context);
                    rp.bvs.set(false);
                    boolean z3 = rp.btk == 0;
                    boolean z4 = z;
                    if ((z4 || !z3) && z4) {
                        rp.fs(context, intent, rp.btk, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(Context context, Intent intent, int i, boolean z) {
        Map<zmn, Object> map = fs;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (zmn zmnVar : map.keySet()) {
            if (zmnVar != null) {
                try {
                    zmnVar.zmn(context, intent, !z, i);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int fs(Context context) {
        btk = zn(context);
        hhw = SystemClock.elapsedRealtime();
        return btk;
    }

    private static int zn(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        kw kwVar = zg;
                        return (kwVar == null || !kwVar.zmn(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static void zmn(zmn zmnVar, Context context) {
        if (zmnVar == null) {
            return;
        }
        if (!fb.get()) {
            try {
                context.registerReceiver(new fs(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                fb.set(true);
            } catch (Throwable unused) {
            }
        }
        Map<zmn, Object> map = fs;
        map.put(zmnVar, zmn);
        zn.set(map.size());
    }

    public static void zmn(zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        Map<zmn, Object> map = fs;
        map.remove(zmnVar);
        zn.set(map.size());
    }

    private static class fs extends BroadcastReceiver {
        private fs() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                rp.fs(context, intent, rp.zn.get() > 0, false);
            } catch (Throwable unused) {
            }
        }
    }
}
