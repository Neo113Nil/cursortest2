package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.li1;
import defpackage.oi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CustomTabUtils {
    public static final CustomTabUtils INSTANCE = new CustomTabUtils();
    private static final String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private CustomTabUtils() {
    }

    public static final String getChromePackage() {
        if (!CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                List<ResolveInfo> queryIntentServices = applicationContext.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                queryIntentServices.getClass();
                String[] strArr = CHROME_PACKAGES;
                strArr.getClass();
                HashSet hashSet = new HashSet(li1.a(strArr.length));
                oi.x(strArr, hashSet);
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, CustomTabUtils.class);
                return null;
            }
        }
        return null;
    }

    public static final String getDefaultRedirectURI() {
        if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
            return null;
        }
        try {
            return Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX + FacebookSdk.getApplicationContext().getPackageName();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTabUtils.class);
            return null;
        }
    }

    public static final String getValidRedirectURI(String str) {
        if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
            return null;
        }
        try {
            str.getClass();
            return Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), str) ? str : Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), getDefaultRedirectURI()) ? getDefaultRedirectURI() : BuildConfig.FLAVOR;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTabUtils.class);
            return null;
        }
    }
}
