package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import kotlin.Unit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public final String f318a;
    public final boolean b;
    public final Boolean c;
    public final Boolean d;

    public lb(Context context) {
        context.getClass();
        this.b = true;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(context.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
                    String obj2 = obj != null ? obj.toString() : null;
                    this.f318a = obj2;
                    if (obj2 != null) {
                        Log.i("StartAppSDK", "appId is " + obj2);
                    } else {
                        Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CONSENT_ENABLED")) {
                        this.b = applicationInfo.metaData.getBoolean("com.startapp.sdk.CONSENT_ENABLED");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.MIXED_AUDIENCE")) {
                        Boolean valueOf = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.MIXED_AUDIENCE"));
                        this.c = valueOf;
                        Log.i("StartAppSDK", "is mixed audience: " + valueOf);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CHILD_DIRECTED")) {
                        Boolean valueOf2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.CHILD_DIRECTED"));
                        this.d = valueOf2;
                        Log.i("StartAppSDK", "is child directed: " + valueOf2);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                n8.a(th);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }
}
