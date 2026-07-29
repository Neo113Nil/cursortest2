package com.facebook.ads.internal.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.internal.c.a;
import com.facebook.ads.internal.c.c;
import com.mopub.common.GpsHelper;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f5050a = "";

    /* renamed from: b, reason: collision with root package name */
    public static String f5051b = "";

    /* renamed from: c, reason: collision with root package name */
    public static boolean f5052c = false;

    /* renamed from: d, reason: collision with root package name */
    public static String f5053d = "";

    public static void a(Context context) {
        c.a aVar;
        a aVar2;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SDKIDFA", 0);
            if (sharedPreferences.contains("attributionId")) {
                f5050a = sharedPreferences.getString("attributionId", "");
            }
            if (sharedPreferences.contains(GpsHelper.ADVERTISING_ID_KEY)) {
                f5051b = sharedPreferences.getString(GpsHelper.ADVERTISING_ID_KEY, "");
                f5052c = sharedPreferences.getBoolean("limitAdTracking", f5052c);
                f5053d = a.c.SHARED_PREFS.name();
            }
            try {
                aVar = c.a(context.getContentResolver());
            } catch (Exception e) {
                com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(e, "Error retrieving attribution id from fb4a"));
                aVar = null;
            }
            if (aVar != null && aVar.f5054a != null) {
                f5050a = aVar.f5054a;
            }
            if (com.facebook.ads.internal.q.a.b.a() && com.facebook.ads.internal.q.a.b.b("aid_override")) {
                f5050a = com.facebook.ads.internal.q.a.b.a("aid_override");
            }
            try {
                aVar2 = a.a(context, aVar);
            } catch (Exception e2) {
                com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(e2, "Error retrieving advertising id from Google Play Services"));
                aVar2 = null;
            }
            if (aVar2 != null) {
                String a2 = aVar2.a();
                Boolean valueOf = Boolean.valueOf(aVar2.b());
                if (a2 != null) {
                    f5051b = a2;
                    f5052c = valueOf.booleanValue();
                    f5053d = aVar2.c().name();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("attributionId", f5050a);
            edit.putString(GpsHelper.ADVERTISING_ID_KEY, f5051b);
            edit.putBoolean("limitAdTracking", f5052c);
            edit.apply();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
