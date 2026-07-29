package com.moat.analytics.mobile.vng;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.AsyncTask;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes2.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private static String f7400a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7402a = false;

        /* renamed from: b, reason: collision with root package name */
        private String f7403b = "_unknown_";

        /* renamed from: c, reason: collision with root package name */
        private String f7404c = "_unknown_";

        a() {
        }

        private void c() {
            try {
                Context c2 = s.c();
                if (c2 != null) {
                    PackageManager packageManager = c2.getPackageManager();
                    this.f7404c = c2.getPackageName();
                    this.f7403b = packageManager.getApplicationLabel(c2.getApplicationInfo()).toString();
                    this.f7402a = true;
                } else {
                    p.a(3, "Util", this, "Can't get app name, appContext is null.");
                }
            } catch (Exception e) {
                m.a(e);
            }
        }

        String a() {
            if (this.f7402a) {
                return this.f7403b;
            }
            c();
            return this.f7403b;
        }

        String b() {
            if (this.f7402a) {
                return this.f7404c;
            }
            c();
            return this.f7404c;
        }
    }

    s() {
    }

    static double a() {
        try {
            AudioManager audioManager = (AudioManager) com.moat.analytics.mobile.vng.a.a().getSystemService("audio");
            double e = e();
            double streamMaxVolume = audioManager.getStreamMaxVolume(3);
            Double.isNaN(e);
            Double.isNaN(streamMaxVolume);
            return e / streamMaxVolume;
        } catch (Exception e2) {
            m.a(e2);
            return 0.0d;
        }
    }

    static void a(final Context context) {
        try {
            AsyncTask.execute(new Runnable() { // from class: com.moat.analytics.mobile.vng.s.1
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    String str2;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                            str = "Util";
                            str2 = "User has limited ad tracking";
                        } else {
                            String unused = s.f7400a = advertisingIdInfo.getId();
                            str = "Util";
                            str2 = "Retrieved Advertising ID = " + s.f7400a;
                        }
                        p.a(3, str, this, str2);
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            });
        } catch (Exception e) {
            m.a(e);
        }
    }

    static String b() {
        return f7400a;
    }

    static Context c() {
        return ((k) MoatAnalytics.getInstance()).e.get();
    }

    private static int e() {
        try {
            return ((AudioManager) com.moat.analytics.mobile.vng.a.a().getSystemService("audio")).getStreamVolume(3);
        } catch (Exception e) {
            m.a(e);
            return 0;
        }
    }
}
