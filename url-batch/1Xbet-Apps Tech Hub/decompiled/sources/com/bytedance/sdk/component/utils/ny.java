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

/* compiled from: TTNetworkUtils.java */
/* loaded from: classes.dex */
public class ny {
    private static final Object pvs = new Object();
    private static final Map<pvs, Object> icD = new ConcurrentHashMap();
    private static AtomicBoolean vG = new AtomicBoolean(false);
    private static volatile int Jd = -1;
    private static volatile long NB = 0;
    private static volatile int sUS = 60000;
    private static vA yiw = null;
    private static final AtomicBoolean so = new AtomicBoolean(false);

    /* compiled from: TTNetworkUtils.java */
    public interface pvs {
        void pvs(Context context, Intent intent, boolean z, int i);
    }

    public static int pvs(Context context, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (NB + j <= elapsedRealtime) {
            return icD(context);
        }
        if (Jd == -1) {
            return icD(context);
        }
        if (elapsedRealtime - NB >= sUS) {
            icD(context, (Intent) null, false, false);
        }
        return Jd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            Jd = 0;
        } else if (so.compareAndSet(false, true)) {
            com.bytedance.sdk.component.so.sUS.icD(new com.bytedance.sdk.component.so.so("getNetworkType") { // from class: com.bytedance.sdk.component.utils.ny.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = ny.Jd = z2 ? 0 : ny.icD(context);
                    ny.so.set(false);
                    if (z) {
                        ny.icD(context, intent, ny.Jd, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(Context context, Intent intent, int i, boolean z) {
        Map<pvs, Object> map = icD;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (pvs pvsVar : map.keySet()) {
            if (pvsVar != null) {
                pvsVar.pvs(context, intent, !z, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int icD(Context context) {
        Jd = vG(context);
        NB = SystemClock.elapsedRealtime();
        return Jd;
    }

    private static int vG(Context context) {
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
                        vA vAVar = yiw;
                        return (vAVar == null || !vAVar.pvs(context, telephonyManager)) ? 5 : 6;
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

    public static void pvs(pvs pvsVar, Context context) {
        if (pvsVar == null) {
            return;
        }
        if (!vG.get()) {
            try {
                context.registerReceiver(new icD(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                vG.set(true);
            } catch (Throwable unused) {
            }
        }
        icD.put(pvsVar, pvs);
    }

    public static void pvs(pvs pvsVar) {
        if (pvsVar == null) {
            return;
        }
        icD.remove(pvsVar);
    }

    /* compiled from: TTNetworkUtils.java */
    private static class icD extends BroadcastReceiver {
        private icD() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (ny.icD != null && ny.icD.size() > 0) {
                z = true;
            }
            ny.icD(context, intent, z, booleanExtra);
        }
    }
}
