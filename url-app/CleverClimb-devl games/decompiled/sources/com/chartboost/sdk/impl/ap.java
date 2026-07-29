package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.tapjoy.TapjoyConstants;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ap {

    /* renamed from: a, reason: collision with root package name */
    final com.chartboost.sdk.Libraries.d f3735a;

    /* renamed from: b, reason: collision with root package name */
    final ai f3736b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<com.chartboost.sdk.Model.e> f3737c;

    /* renamed from: d, reason: collision with root package name */
    final SharedPreferences f3738d;
    final com.chartboost.sdk.Libraries.i e;
    final String f;
    final String g;
    final String h;
    final String i;
    String j;
    String k;
    final String l;
    final Integer m;
    final Integer n;
    final Integer o;
    final Integer p;
    final String q;
    final Float r;
    final String s;
    final String t;
    final String u;
    final JSONObject v;
    final boolean w;
    final String x;
    final Integer y;

    public ap(Context context, String str, com.chartboost.sdk.Libraries.d dVar, ai aiVar, AtomicReference<com.chartboost.sdk.Model.e> atomicReference, SharedPreferences sharedPreferences, com.chartboost.sdk.Libraries.i iVar) {
        JSONObject jSONObject;
        int i;
        DisplayMetrics displayMetrics;
        int i2;
        WindowManager windowManager;
        String str2;
        String str3;
        this.f3735a = dVar;
        this.f3736b = aiVar;
        this.f3737c = atomicReference;
        this.f3738d = sharedPreferences;
        this.e = iVar;
        this.s = str;
        if (TapjoyConstants.TJC_SDK_PLACEMENT.equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || (Build.MANUFACTURER != null && Build.MANUFACTURER.contains("Genymotion"))) {
            this.f = "Android Simulator";
        } else {
            this.f = Build.MODEL;
        }
        this.t = Build.MANUFACTURER + " " + Build.MODEL;
        this.u = ar.a(context);
        this.g = "Android " + Build.VERSION.RELEASE;
        this.h = Locale.getDefault().getCountry();
        this.i = Locale.getDefault().getLanguage();
        this.l = "7.3.1";
        this.r = Float.valueOf(context.getResources().getDisplayMetrics().density);
        try {
            String packageName = context.getPackageName();
            this.j = context.getPackageManager().getPackageInfo(packageName, 128).versionName;
            this.k = packageName;
        } catch (Exception e) {
            CBLogging.a("RequestBody", "Exception raised getting package mager object", e);
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        int i3 = 0;
        if (telephonyManager != null && telephonyManager.getPhoneType() != 0 && telephonyManager.getSimState() == 5) {
            String str4 = null;
            try {
                str2 = telephonyManager.getSimOperator();
            } catch (Exception e2) {
                com.chartboost.sdk.Tracking.a.a(Chartboost.class, "Unable to retrieve sim operator information", e2);
                str2 = null;
            }
            if (str2 == null || TextUtils.isEmpty(str2)) {
                str3 = null;
            } else {
                str4 = str2.substring(0, 3);
                str3 = str2.substring(3);
            }
            jSONObject = com.chartboost.sdk.Libraries.e.a(com.chartboost.sdk.Libraries.e.a("carrier-name", telephonyManager.getNetworkOperatorName()), com.chartboost.sdk.Libraries.e.a("mobile-country-code", str4), com.chartboost.sdk.Libraries.e.a("mobile-network-code", str3), com.chartboost.sdk.Libraries.e.a("iso-country-code", telephonyManager.getNetworkCountryIso()), com.chartboost.sdk.Libraries.e.a("phone-type", Integer.valueOf(telephonyManager.getPhoneType())));
        } else {
            jSONObject = new JSONObject();
        }
        this.v = jSONObject;
        this.w = CBUtility.c();
        this.x = CBUtility.d();
        this.y = ai.d(context);
        try {
            if (context instanceof Activity) {
                Rect rect = new Rect();
                ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                i = rect.width();
                try {
                    i3 = rect.height();
                } catch (Exception e3) {
                    e = e3;
                    CBLogging.b("RequestBody", "Exception getting activity size", e);
                    displayMetrics = (DisplayMetrics) com.chartboost.sdk.g.a().a(new DisplayMetrics());
                    displayMetrics.setTo(context.getResources().getDisplayMetrics());
                    if (Build.VERSION.SDK_INT >= 17) {
                        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    }
                    i2 = displayMetrics.widthPixels;
                    int i4 = displayMetrics.heightPixels;
                    this.o = Integer.valueOf(i2);
                    this.p = Integer.valueOf(i4);
                    this.q = "" + displayMetrics.densityDpi;
                    if (i > 0) {
                        i2 = i;
                    }
                    if (i3 > 0) {
                    }
                    this.m = Integer.valueOf(i2);
                    this.n = Integer.valueOf(i3);
                }
            } else {
                i = 0;
            }
        } catch (Exception e4) {
            e = e4;
            i = 0;
        }
        displayMetrics = (DisplayMetrics) com.chartboost.sdk.g.a().a(new DisplayMetrics());
        displayMetrics.setTo(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 17 && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        i2 = displayMetrics.widthPixels;
        int i42 = displayMetrics.heightPixels;
        this.o = Integer.valueOf(i2);
        this.p = Integer.valueOf(i42);
        this.q = "" + displayMetrics.densityDpi;
        if (i > 0 && i <= i2) {
            i2 = i;
        }
        i3 = (i3 > 0 || i3 > i42) ? i42 : i3;
        this.m = Integer.valueOf(i2);
        this.n = Integer.valueOf(i3);
    }
}
