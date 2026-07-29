package com.moat.analytics.mobile.cha;

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
final class r {

    /* renamed from: ˏ, reason: contains not printable characters */
    private static String f990;

    /* renamed from: ॱ, reason: contains not printable characters */
    private static int[] f991 = {-39340411, 1646369784, -593413711, -1069164445, -50787683, -1327220997, 423245644, -742130253, 54775946, -495304555, 1880137505, 1742082653, 65717847, 1497802820, 828947133, -614454858, 941569790, -1897799303};

    /* renamed from: ˎ, reason: contains not printable characters */
    private static int f989 = 0;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f986 = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    private static e f987 = null;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static d f988 = null;

    r() {
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    static double m1131() {
        try {
            AudioManager audioManager = (AudioManager) c.m1015().getSystemService(m1128(new int[]{-1741845568, 995393484, -1443163044, -1832527325}, 5).intern());
            double m1122 = m1122();
            double streamMaxVolume = audioManager.getStreamMaxVolume(3);
            Double.isNaN(m1122);
            Double.isNaN(streamMaxVolume);
            return m1122 / streamMaxVolume;
        } catch (Exception e2) {
            o.m1110(e2);
            return 0.0d;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int m1122() {
        try {
            return ((AudioManager) c.m1015().getSystemService(m1128(new int[]{-1741845568, 995393484, -1443163044, -1832527325}, 5).intern())).getStreamVolume(3);
        } catch (Exception e2) {
            o.m1110(e2);
            return 0;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static void m1129(final Application application) {
        try {
            AsyncTask.execute(new Runnable() { // from class: com.moat.analytics.mobile.cha.r.5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
                        if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                            String unused = r.f990 = advertisingIdInfo.getId();
                            a.m994(3, "Util", this, "Retrieved Advertising ID = " + r.f990);
                            return;
                        }
                        a.m994(3, "Util", this, "User has limited ad tracking");
                    } catch (Exception e2) {
                        o.m1110(e2);
                    }
                }
            });
        } catch (Exception e2) {
            o.m1110(e2);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static String m1127() {
        return f990;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static Context m1130() {
        WeakReference<Context> weakReference = ((f) MoatAnalytics.getInstance()).f886;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static e m1124() {
        if (f987 == null || !f987.f1001) {
            f987 = new e((byte) 0);
        }
        return f987;
    }

    static class e {

        /* renamed from: ˊ, reason: contains not printable characters */
        private String f999;

        /* renamed from: ˋ, reason: contains not printable characters */
        private String f1000;

        /* renamed from: ˏ, reason: contains not printable characters */
        private boolean f1001;

        /* renamed from: ॱ, reason: contains not printable characters */
        private String f1002;

        /* synthetic */ e(byte b2) {
            this();
        }

        private e() {
            this.f1001 = false;
            this.f999 = "_unknown_";
            this.f1000 = "_unknown_";
            this.f1002 = "_unknown_";
            try {
                Context m1130 = r.m1130();
                if (m1130 != null) {
                    this.f1001 = true;
                    PackageManager packageManager = m1130.getPackageManager();
                    this.f1000 = m1130.getPackageName();
                    this.f999 = packageManager.getApplicationLabel(m1130.getApplicationInfo()).toString();
                    this.f1002 = packageManager.getInstallerPackageName(this.f1000);
                    return;
                }
                a.m994(3, "Util", this, "Can't get app name, appContext is null.");
            } catch (Exception e) {
                o.m1110(e);
            }
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        final String m1135() {
            return this.f999;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        final String m1134() {
            return this.f1000;
        }

        /* renamed from: ॱ, reason: contains not printable characters */
        final String m1136() {
            return this.f1002 != null ? this.f1002 : "_unknown_";
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static String m1128(int[] iArr, int i) {
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = (int[]) f991.clone();
        int i2 = 0;
        while (true) {
            if (!(i2 >= iArr.length)) {
                cArr[0] = iArr[i2] >>> 16;
                cArr[1] = (char) iArr[i2];
                int i3 = i2 + 1;
                cArr[2] = iArr[i3] >>> 16;
                cArr[3] = (char) iArr[i3];
                com.chartboost.sdk.impl.b.a(cArr, iArr2, false);
                int i4 = i2 << 1;
                cArr2[i4] = cArr[0];
                cArr2[i4 + 1] = cArr[1];
                cArr2[i4 + 2] = cArr[2];
                cArr2[i4 + 3] = cArr[3];
                i2 += 2;
            } else {
                return new String(cArr2, 0, i);
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static d m1125() {
        if (f988 == null || !f988.f993) {
            f988 = new d((byte) 0);
        }
        return f988;
    }

    static class d {

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean f993;

        /* renamed from: ˊ, reason: contains not printable characters */
        boolean f994;

        /* renamed from: ˋ, reason: contains not printable characters */
        boolean f995;

        /* renamed from: ˎ, reason: contains not printable characters */
        String f996;

        /* renamed from: ˏ, reason: contains not printable characters */
        String f997;

        /* renamed from: ॱ, reason: contains not printable characters */
        Integer f998;

        /* synthetic */ d(byte b2) {
            this();
        }

        private d() {
            this.f996 = "_unknown_";
            this.f997 = "_unknown_";
            this.f998 = -1;
            this.f995 = false;
            this.f994 = false;
            this.f993 = false;
            try {
                Context m1130 = r.m1130();
                if (m1130 != null) {
                    this.f993 = true;
                    TelephonyManager telephonyManager = (TelephonyManager) m1130.getSystemService("phone");
                    this.f996 = telephonyManager.getSimOperatorName();
                    this.f997 = telephonyManager.getNetworkOperatorName();
                    this.f998 = Integer.valueOf(telephonyManager.getPhoneType());
                    this.f995 = r.m1121();
                    this.f994 = r.m1126(m1130);
                }
            } catch (Exception e) {
                o.m1110(e);
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static boolean m1126(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static /* synthetic */ boolean m1121() {
        int i;
        WeakReference<Context> weakReference = ((f) MoatAnalytics.getInstance()).f886;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            int i2 = f986 + 27;
            f989 = i2 % 128;
            int i3 = i2 % 2;
            if ((Build.VERSION.SDK_INT < 17 ? (char) 22 : (char) 19) == 22) {
                i = Settings.Secure.getInt(context.getContentResolver(), m1128(new int[]{-474338915, -1244865125, 562481890, 44523707, -1306238932, 74746991}, 11).intern(), 0);
            } else {
                int i4 = f986 + 87;
                f989 = i4 % 128;
                int i5 = i4 % 2;
                i = Settings.Global.getInt(context.getContentResolver(), m1128(new int[]{-474338915, -1244865125, 562481890, 44523707, -1306238932, 74746991}, 11).intern(), 0);
            }
        } else {
            i = 0;
        }
        if (!(i == 1)) {
            return false;
        }
        int i6 = f989 + 33;
        f986 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
