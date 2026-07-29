package com.facebook.ads.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.tapjoy.TapjoyConstants;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public class AdInternalSettings {

    /* renamed from: a, reason: collision with root package name */
    static volatile boolean f5483a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final String f5484b = "AdInternalSettings";

    /* renamed from: c, reason: collision with root package name */
    private static final Collection<String> f5485c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static final Collection<String> f5486d = new HashSet();
    private static boolean e;
    private static boolean f;
    private static String g;
    private static String h;
    private static String i;
    private static boolean j;
    private static boolean k;
    private static boolean l;

    static {
        f5486d.add(TapjoyConstants.TJC_SDK_PLACEMENT);
        f5486d.add("google_sdk");
        f5486d.add("vbox86p");
        f5486d.add("vbox86tp");
        j = false;
        f5483a = false;
    }

    private static void a(String str) {
        if (f5483a) {
            return;
        }
        f5483a = true;
        Log.d(f5484b, "Test mode device hash: " + str);
        Log.d(f5484b, "When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"" + str + "\");");
    }

    public static void addTestDevice(String str) {
        f5485c.add(str);
    }

    public static void addTestDevices(Collection<String> collection) {
        f5485c.addAll(collection);
    }

    public static void clearTestDevices() {
        f5485c.clear();
    }

    public static String getMediationService() {
        return h;
    }

    public static String getUrlPrefix() {
        return g;
    }

    public static boolean isDebugBuild() {
        return j;
    }

    public static boolean isExplicitTestMode() {
        return e;
    }

    public static boolean isTestMode(Context context) {
        if (j || isExplicitTestMode() || f5486d.contains(Build.PRODUCT)) {
            return true;
        }
        if (i == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("FBAdPrefs", 0);
            i = sharedPreferences.getString("deviceIdHash", null);
            if (TextUtils.isEmpty(i)) {
                i = UUID.randomUUID().toString();
                sharedPreferences.edit().putString("deviceIdHash", i).apply();
            }
        }
        if (f5485c.contains(i)) {
            return true;
        }
        a(i);
        return false;
    }

    public static boolean isVideoAutoplay() {
        return k;
    }

    public static boolean isVideoAutoplayOnMobile() {
        return l;
    }

    public static boolean isVisibleAnimation() {
        return f;
    }

    public static void setDebugBuild(boolean z) {
        j = z;
    }

    public static void setMediationService(String str) {
        h = str;
    }

    public static void setTestMode(boolean z) {
        e = z;
    }

    public static void setUrlPrefix(String str) {
        g = str;
    }

    public static void setVideoAutoplay(boolean z) {
        k = z;
    }

    public static void setVideoAutoplayOnMobile(boolean z) {
        l = z;
    }

    public static void setVisibleAnimation(boolean z) {
        f = z;
    }
}
