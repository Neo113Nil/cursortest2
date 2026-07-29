package com.moat.analytics.mobile.you;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.mopub.common.GpsHelper;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private static String f7526a;

    /* renamed from: b, reason: collision with root package name */
    private static a f7527b;

    /* renamed from: c, reason: collision with root package name */
    private static b f7528c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7530a;

        /* renamed from: b, reason: collision with root package name */
        private String f7531b;

        /* renamed from: c, reason: collision with root package name */
        private String f7532c;

        /* renamed from: d, reason: collision with root package name */
        private String f7533d;

        private a() {
            this.f7530a = false;
            this.f7531b = "_unknown_";
            this.f7532c = "_unknown_";
            this.f7533d = "_unknown_";
            try {
                Context c2 = s.c();
                if (c2 != null) {
                    this.f7530a = true;
                    PackageManager packageManager = c2.getPackageManager();
                    this.f7532c = c2.getPackageName();
                    this.f7531b = packageManager.getApplicationLabel(c2.getApplicationInfo()).toString();
                    this.f7533d = packageManager.getInstallerPackageName(this.f7532c);
                } else {
                    p.a(3, "Util", this, "Can't get app name, appContext is null.");
                }
            } catch (Exception e) {
                m.a(e);
            }
        }

        String a() {
            return this.f7531b;
        }

        String b() {
            return this.f7532c;
        }

        String c() {
            return this.f7533d != null ? this.f7533d : "_unknown_";
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        String f7534a;

        /* renamed from: b, reason: collision with root package name */
        String f7535b;

        /* renamed from: c, reason: collision with root package name */
        Integer f7536c;

        /* renamed from: d, reason: collision with root package name */
        boolean f7537d;
        boolean e;
        boolean f;

        private b() {
            this.f7534a = "_unknown_";
            this.f7535b = "_unknown_";
            this.f7536c = -1;
            this.f7537d = false;
            this.e = false;
            this.f = false;
            try {
                Context c2 = s.c();
                if (c2 != null) {
                    this.f = true;
                    TelephonyManager telephonyManager = (TelephonyManager) c2.getSystemService("phone");
                    this.f7534a = telephonyManager.getSimOperatorName();
                    this.f7535b = telephonyManager.getNetworkOperatorName();
                    this.f7536c = Integer.valueOf(telephonyManager.getPhoneType());
                    this.f7537d = s.i();
                    this.e = s.b(c2);
                }
            } catch (Exception e) {
                m.a(e);
            }
        }
    }

    s() {
    }

    static double a() {
        try {
            AudioManager audioManager = (AudioManager) com.moat.analytics.mobile.you.a.a().getSystemService("audio");
            double h = h();
            double streamMaxVolume = audioManager.getStreamMaxVolume(3);
            Double.isNaN(h);
            Double.isNaN(streamMaxVolume);
            return h / streamMaxVolume;
        } catch (Exception e) {
            m.a(e);
            return 0.0d;
        }
    }

    static void a(final Context context) {
        try {
            AsyncTask.execute(new Runnable() { // from class: com.moat.analytics.mobile.you.s.1
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    try {
                        Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                        Class<?> cls2 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
                        Object invoke = cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                        if (((Boolean) cls2.getMethod(GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY, new Class[0]).invoke(invoke, new Object[0])).booleanValue()) {
                            str3 = "Util";
                            str4 = "User has limited ad tracking";
                        } else {
                            String unused = s.f7526a = (String) cls2.getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
                            str3 = "Util";
                            str4 = "Retrieved Advertising ID = " + s.f7526a;
                        }
                        p.a(3, str3, this, str4);
                    } catch (ClassNotFoundException e) {
                        e = e;
                        str = "Util";
                        str2 = "ClassNotFoundException while retrieving Advertising ID";
                        p.a(str, this, str2, e);
                    } catch (NoSuchMethodException e2) {
                        e = e2;
                        str = "Util";
                        str2 = "NoSuchMethodException while retrieving Advertising ID";
                        p.a(str, this, str2, e);
                    } catch (Exception e3) {
                        m.a(e3);
                    }
                }
            });
        } catch (Exception e) {
            m.a(e);
        }
    }

    static String b() {
        return f7526a;
    }

    static boolean b(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    static Context c() {
        WeakReference<Context> weakReference = ((k) MoatAnalytics.getInstance()).e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    static a d() {
        if (f7527b == null || !f7527b.f7530a) {
            f7527b = new a();
        }
        return f7527b;
    }

    static b e() {
        if (f7528c == null || !f7528c.f) {
            f7528c = new b();
        }
        return f7528c;
    }

    private static int h() {
        try {
            return ((AudioManager) com.moat.analytics.mobile.you.a.a().getSystemService("audio")).getStreamVolume(3);
        } catch (Exception e) {
            m.a(e);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i() {
        Context c2 = c();
        return (c2 != null ? Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(c2.getContentResolver(), "adb_enabled", 0) : Settings.Secure.getInt(c2.getContentResolver(), "adb_enabled", 0) : 0) == 1;
    }
}
