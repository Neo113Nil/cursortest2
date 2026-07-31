package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class yj {
    private static volatile boolean fb = true;
    private static String fs;
    private static String zmn;
    private static String zn;

    /* JADX INFO: Access modifiers changed from: private */
    public static void btk() {
        String str;
        String str2;
        String str3;
        if (com.bytedance.sdk.openadsdk.core.kgc.zmn() == null) {
            return;
        }
        fb = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.kgc.zmn().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0) {
                    fb = false;
                } else if (simState == 1) {
                    fb = false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("SimUtils", th.getMessage());
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
                zmn = str;
            }
            if (!TextUtils.isEmpty(str4)) {
                fs = str4;
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            zn = str3;
        } catch (Throwable unused4) {
        }
    }

    public static String zmn() {
        zmn.zmn();
        return zmn;
    }

    public static String fs() {
        try {
            zmn.zmn();
            if (!fb) {
                StringBuilder sb = new StringBuilder("getMCC");
                sb.append(fb ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.iqz.zn("MCC", sb.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.kgc.zmn().getResources().getConfiguration();
            int i = configuration.mcc;
            String valueOf = i != 0 ? String.valueOf(i) : fs;
            com.bytedance.sdk.component.utils.iqz.zn("MCC", "config=" + configuration.mcc + ",sMCC=" + fs);
            return valueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("SimUtils", th.getMessage());
            return null;
        }
    }

    public static String zn() {
        zmn.zmn();
        return zn;
    }

    public static class zmn extends com.bytedance.sdk.component.zg.fs.zn {
        public static AtomicBoolean zmn = new AtomicBoolean(false);
        private static final AtomicLong fs = new AtomicLong(0);

        public zmn(String str, int i) {
            super(str, i);
        }

        public static void zmn() {
            if (zmn.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = fs;
            if (currentTimeMillis - atomicLong.get() < 600000) {
                return;
            }
            atomicLong.set(currentTimeMillis);
            nu.zn((Runnable) new zmn("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            zmn.set(true);
            yj.btk();
            zmn.set(false);
        }
    }
}
