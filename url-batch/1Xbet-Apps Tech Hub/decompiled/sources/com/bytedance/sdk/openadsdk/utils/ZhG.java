package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: SimUtils.java */
/* loaded from: classes2.dex */
public class ZhG {
    private static volatile boolean Jd = true;
    private static String icD;
    private static String pvs;
    private static String vG;

    /* JADX INFO: Access modifiers changed from: private */
    public static void NB() {
        String str;
        String str2;
        String str3;
        if (com.bytedance.sdk.openadsdk.core.mnm.pvs() == null) {
            return;
        }
        Jd = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.mnm.pvs().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0) {
                    Jd = false;
                } else if (simState == 1) {
                    Jd = false;
                }
                com.bytedance.sdk.component.utils.Ju.pvs("MCC", Jd ? "Have SIM card" : "No SIM card");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("SimUtils", th.getMessage());
            }
            String str4 = null;
            try {
                str = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                str = null;
            }
            try {
                str2 = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                str2 = null;
            }
            if (str2 == null || str2.length() < 5) {
                try {
                    str2 = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(str2) || str2.length() <= 4) {
                str3 = null;
            } else {
                String substring = str2.substring(0, 3);
                str3 = str2.substring(3);
                str4 = substring;
            }
            if (!TextUtils.isEmpty(str)) {
                pvs = str;
            }
            if (!TextUtils.isEmpty(str4)) {
                icD = str4;
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            vG = str3;
        } catch (Throwable unused4) {
        }
    }

    public static String pvs() {
        pvs.pvs();
        return pvs;
    }

    public static String icD() {
        try {
            pvs.pvs();
            if (!Jd) {
                com.bytedance.sdk.component.utils.Ju.pvs("MCC", "getMCC" + (Jd ? "Have SIM card" : "No SIM card, MCC returns null"));
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.mnm.pvs().getResources().getConfiguration();
            String valueOf = configuration.mcc != 0 ? String.valueOf(configuration.mcc) : icD;
            com.bytedance.sdk.component.utils.Ju.pvs("MCC", "config=" + configuration.mcc + ",sMCC=" + icD);
            return valueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("SimUtils", th.getMessage());
            return null;
        }
    }

    public static String vG() {
        pvs.pvs();
        return vG;
    }

    /* compiled from: SimUtils.java */
    public static class pvs extends com.bytedance.sdk.component.so.so {
        public static AtomicBoolean pvs = new AtomicBoolean(false);
        private static final AtomicLong icD = new AtomicLong(0);

        public pvs(String str, int i) {
            super(str, i);
        }

        public static void pvs() {
            if (pvs.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = icD;
            if (currentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(currentTimeMillis);
            ae.icD(new pvs("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            pvs.set(true);
            ZhG.NB();
            pvs.set(false);
        }
    }
}
