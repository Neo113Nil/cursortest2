package com.moat.analytics.mobile.iro;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class p {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static long f1196 = 9141242330850693853L;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static String f1197;

    /* renamed from: ˏ, reason: contains not printable characters */
    private static a f1198;

    /* renamed from: ॱ, reason: contains not printable characters */
    private static b f1199;

    p() {
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    static double m1301() {
        try {
            AudioManager audioManager = (AudioManager) com.moat.analytics.mobile.iro.a.m1173().getSystemService(m1302("㇕ꍩ\uf102߆嗠殛").intern());
            double m1292 = m1292();
            double streamMaxVolume = audioManager.getStreamMaxVolume(3);
            Double.isNaN(m1292);
            Double.isNaN(streamMaxVolume);
            return m1292 / streamMaxVolume;
        } catch (Exception e) {
            o.m1290(e);
            return 0.0d;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int m1292() {
        try {
            return ((AudioManager) com.moat.analytics.mobile.iro.a.m1173().getSystemService(m1302("㇕ꍩ\uf102߆嗠殛").intern())).getStreamVolume(3);
        } catch (Exception e) {
            o.m1290(e);
            return 0;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m1294(final Application application) {
        try {
            AsyncTask.execute(new Runnable() { // from class: com.moat.analytics.mobile.iro.p.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
                        if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                            String unused = p.f1197 = advertisingIdInfo.getId();
                            com.moat.analytics.mobile.iro.b.m1182(3, "Util", this, "Retrieved Advertising ID = " + p.f1197);
                            return;
                        }
                        com.moat.analytics.mobile.iro.b.m1182(3, "Util", this, "User has limited ad tracking");
                    } catch (Exception e) {
                        o.m1290(e);
                    }
                }
            });
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    private static String m1302(String str) {
        char[] charArray = str.toCharArray();
        char c2 = charArray[0];
        int i = 1;
        char[] cArr = new char[charArray.length - 1];
        while (true) {
            if ((i < charArray.length ? 'K' : (char) 11) == 'K') {
                cArr[i - 1] = (char) ((charArray[i] ^ (i * c2)) ^ f1196);
                i++;
            } else {
                return new String(cArr);
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static String m1300() {
        return f1197;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static Context m1296() {
        WeakReference<Context> weakReference = ((j) MoatAnalytics.getInstance()).f1168;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static b m1297() {
        if (f1199 == null || !f1199.f1210) {
            f1199 = new b((byte) 0);
        }
        return f1199;
    }

    static class b {

        /* renamed from: ˋ, reason: contains not printable characters */
        private String f1207;

        /* renamed from: ˎ, reason: contains not printable characters */
        private String f1208;

        /* renamed from: ˏ, reason: contains not printable characters */
        private String f1209;

        /* renamed from: ॱ, reason: contains not printable characters */
        private boolean f1210;

        /* synthetic */ b(byte b2) {
            this();
        }

        private b() {
            this.f1210 = false;
            this.f1208 = "_unknown_";
            this.f1207 = "_unknown_";
            this.f1209 = "_unknown_";
            try {
                Context m1296 = p.m1296();
                if (m1296 != null) {
                    this.f1210 = true;
                    PackageManager packageManager = m1296.getPackageManager();
                    this.f1207 = m1296.getPackageName();
                    this.f1208 = packageManager.getApplicationLabel(m1296.getApplicationInfo()).toString();
                    this.f1209 = packageManager.getInstallerPackageName(this.f1207);
                    return;
                }
                com.moat.analytics.mobile.iro.b.m1182(3, "Util", this, "Can't get app name, appContext is null.");
            } catch (Exception e) {
                o.m1290(e);
            }
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        final String m1305() {
            return this.f1208;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        final String m1304() {
            return this.f1207;
        }

        /* renamed from: ॱ, reason: contains not printable characters */
        final String m1306() {
            return this.f1209 != null ? this.f1209 : "_unknown_";
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static a m1293() {
        if (f1198 == null || !f1198.f1206) {
            f1198 = new a((byte) 0);
        }
        return f1198;
    }

    static class a {

        /* renamed from: ˊ, reason: contains not printable characters */
        String f1201;

        /* renamed from: ˋ, reason: contains not printable characters */
        String f1202;

        /* renamed from: ˎ, reason: contains not printable characters */
        Integer f1203;

        /* renamed from: ˏ, reason: contains not printable characters */
        boolean f1204;

        /* renamed from: ॱ, reason: contains not printable characters */
        boolean f1205;

        /* renamed from: ᐝ, reason: contains not printable characters */
        boolean f1206;

        /* synthetic */ a(byte b2) {
            this();
        }

        private a() {
            this.f1202 = "_unknown_";
            this.f1201 = "_unknown_";
            this.f1203 = -1;
            this.f1204 = false;
            this.f1205 = false;
            this.f1206 = false;
            try {
                Context m1296 = p.m1296();
                if (m1296 != null) {
                    this.f1206 = true;
                    TelephonyManager telephonyManager = (TelephonyManager) m1296.getSystemService("phone");
                    this.f1202 = telephonyManager.getSimOperatorName();
                    this.f1201 = telephonyManager.getNetworkOperatorName();
                    this.f1203 = Integer.valueOf(telephonyManager.getPhoneType());
                    this.f1204 = p.m1295();
                    this.f1205 = p.m1299(m1296);
                }
            } catch (Exception e) {
                o.m1290(e);
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static boolean m1299(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: ˊॱ, reason: contains not printable characters */
    static /* synthetic */ boolean m1295() {
        int i;
        WeakReference<Context> weakReference = ((j) MoatAnalytics.getInstance()).f1168;
        Context context = weakReference != null ? weakReference.get() : null;
        if ((context == null ? '9' : 'X') != '9') {
            if ((Build.VERSION.SDK_INT < 17 ? (char) 14 : 'J') == 'J') {
                i = Settings.Global.getInt(context.getContentResolver(), m1302("涓Ｏ䦟\uda06Ⓨ녧ρ涹︧䢚픆⟨").intern(), 0);
            } else {
                i = Settings.Secure.getInt(context.getContentResolver(), m1302("涓Ｏ䦟\uda06Ⓨ녧ρ涹︧䢚픆⟨").intern(), 0);
            }
        } else {
            i = 0;
        }
        return (i != 1 ? 'c' : '/') != 'c';
    }
}
