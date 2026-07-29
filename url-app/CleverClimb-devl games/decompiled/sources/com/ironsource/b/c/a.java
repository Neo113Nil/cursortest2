package com.ironsource.b.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.ironsource.b.h;
import com.ironsource.b.h.g;
import com.ironsource.b.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: IntegrationHelper.java */
/* loaded from: classes2.dex */
public class a {
    public static void a(Activity activity) {
        Log.i("IntegrationHelper", "Verifying Integration:");
        b(activity);
        for (String str : new String[]{"SupersonicAds", "AdColony", "AppLovin", "Chartboost", "HyprMX", "UnityAds", "Vungle", "InMobi", "Facebook", "Fyber", "MediaBrix", "Tapjoy", "AdMob", "MoPub", "Maio"}) {
            if (a(activity, str)) {
                if (str.equalsIgnoreCase("SupersonicAds")) {
                    Log.i("IntegrationHelper", ">>>> IronSource - VERIFIED");
                } else {
                    Log.i("IntegrationHelper", ">>>> " + str + " - VERIFIED");
                }
            } else if (str.equalsIgnoreCase("SupersonicAds")) {
                Log.e("IntegrationHelper", ">>>> IronSource - NOT VERIFIED");
            } else {
                Log.e("IntegrationHelper", ">>>> " + str + " - NOT VERIFIED");
            }
        }
        c(activity);
    }

    private static boolean a(Activity activity, String str) {
        try {
            if (str.equalsIgnoreCase("SupersonicAds")) {
                Log.i("IntegrationHelper", "--------------- IronSource  --------------");
            } else {
                Log.i("IntegrationHelper", "--------------- " + str + " --------------");
            }
            h b2 = b(activity, "com.ironsource.adapters." + str.toLowerCase() + "." + str + "Adapter");
            if (b2 == null) {
                return false;
            }
            if (!str.equalsIgnoreCase("SupersonicAds") && !a(b2)) {
                return false;
            }
            boolean a2 = a(b2.f6925d);
            if (!c(activity, b2.f6924c)) {
                a2 = false;
            }
            if (!a(b2.e)) {
                a2 = false;
            }
            if (!a(activity, b2.f)) {
                a2 = false;
            }
            if (!b(activity, b2.g)) {
                a2 = false;
            }
            if (b2.h && Build.VERSION.SDK_INT <= 18) {
                if (activity.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", activity.getPackageName()) == 0) {
                    Log.i("IntegrationHelper", "android.permission.WRITE_EXTERNAL_STORAGE - VERIFIED");
                } else {
                    Log.e("IntegrationHelper", "android.permission.WRITE_EXTERNAL_STORAGE - MISSING");
                    return false;
                }
            }
            return a2;
        } catch (Exception e) {
            Log.e("IntegrationHelper", "isAdapterValid " + str, e);
            return false;
        }
    }

    private static boolean a(Activity activity, String[] strArr) {
        if (strArr == null) {
            return true;
        }
        PackageManager packageManager = activity.getPackageManager();
        Log.i("IntegrationHelper", "*** Broadcast Receivers ***");
        boolean z = true;
        for (String str : strArr) {
            try {
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
            if (packageManager.queryBroadcastReceivers(new Intent(activity, Class.forName(str)), 65536).size() > 0) {
                Log.i("IntegrationHelper", str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str + " - MISSING");
                z = false;
            }
        }
        return z;
    }

    private static boolean b(Activity activity, String[] strArr) {
        if (strArr == null) {
            return true;
        }
        PackageManager packageManager = activity.getPackageManager();
        Log.i("IntegrationHelper", "*** Services ***");
        boolean z = true;
        for (String str : strArr) {
            try {
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
            if (packageManager.queryIntentServices(new Intent(activity, Class.forName(str)), 65536).size() > 0) {
                Log.i("IntegrationHelper", str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str + " - MISSING");
                z = false;
            }
        }
        return z;
    }

    private static boolean a(ArrayList<Pair<String, String>> arrayList) {
        boolean z = true;
        if (arrayList == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** External Libraries ***");
        Iterator<Pair<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                Class.forName((String) next.first);
                Log.i("IntegrationHelper", ((String) next.second) + " - VERIFIED");
            } catch (ClassNotFoundException unused) {
                z = false;
                Log.e("IntegrationHelper", ((String) next.second) + " - MISSING");
            }
        }
        return z;
    }

    private static boolean c(Activity activity, String[] strArr) {
        if (strArr == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** Activities ***");
        boolean z = true;
        for (String str : strArr) {
            try {
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
            if (activity.getPackageManager().queryIntentActivities(new Intent(activity, Class.forName(str)), 65536).size() > 0) {
                Log.i("IntegrationHelper", str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str + " - MISSING");
                z = false;
            }
        }
        return z;
    }

    private static void b(Activity activity) {
        Log.i("IntegrationHelper", "*** Permissions ***");
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", activity.getPackageName()) == 0) {
            Log.i("IntegrationHelper", "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e("IntegrationHelper", "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", activity.getPackageName()) == 0) {
            Log.i("IntegrationHelper", "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e("IntegrationHelper", "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    private static boolean a(String str) {
        if (str == null) {
            return true;
        }
        try {
            Class.forName(str);
            Log.i("IntegrationHelper", "SDK - VERIFIED");
            return true;
        } catch (Exception unused) {
            Log.e("IntegrationHelper", "SDK - MISSING");
            return false;
        }
    }

    private static boolean a(h hVar) {
        if (hVar.f6923b.startsWith("4.1")) {
            Log.i("IntegrationHelper", "Adapter version - VERIFIED");
            return true;
        }
        Log.e("IntegrationHelper", hVar.f6922a + " adapter " + hVar.f6923b + " is incompatible with SDK version " + g.d() + ", please update your adapter to version 4.1.*");
        return false;
    }

    private static h b(Activity activity, String str) {
        try {
            h hVar = (h) Class.forName(str).getMethod("getIntegrationData", Activity.class).invoke(null, activity);
            Log.i("IntegrationHelper", "Adapter - VERIFIED");
            return hVar;
        } catch (ClassNotFoundException unused) {
            Log.e("IntegrationHelper", "Adapter - MISSING");
            return null;
        } catch (Exception unused2) {
            Log.e("IntegrationHelper", "Adapter version - NOT VERIFIED");
            return null;
        }
    }

    private static void c(final Activity activity) {
        new Thread() { // from class: com.ironsource.b.c.a.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    Log.w("IntegrationHelper", "--------------- Google Play Services --------------");
                    if (activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData.containsKey(GooglePlayServicesUtilLight.KEY_METADATA_GOOGLE_PLAY_SERVICES_VERSION)) {
                        Log.i("IntegrationHelper", "Google Play Services - VERIFIED");
                        String a2 = m.a().a((Context) activity);
                        if (!TextUtils.isEmpty(a2)) {
                            Log.i("IntegrationHelper", "GAID is: " + a2 + " (use this for test devices)");
                        }
                    } else {
                        Log.e("IntegrationHelper", "Google Play Services - MISSING");
                    }
                } catch (Exception unused) {
                    Log.e("IntegrationHelper", "Google Play Services - MISSING");
                }
            }
        }.start();
    }
}
