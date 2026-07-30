package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import defpackage.ch2;
import defpackage.ey;
import defpackage.lh;
import defpackage.q40;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Validate {
    private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
    private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
    public static final String CUSTOM_TAB_REDIRECT_URI_PREFIX = "fbconnect://cct.";
    private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
    private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
    public static final Validate INSTANCE = new Validate();
    private static final String TAG = Validate.class.getName();

    private Validate() {
    }

    public static final void containsNoNullOrEmpty(Collection<String> collection, String str) {
        collection.getClass();
        str.getClass();
        for (String str2 : collection) {
            if (str2 == null) {
                ch2.l(q40.m("Container '", str, "' cannot contain null values"));
                return;
            } else if (str2.length() <= 0) {
                lh.c(q40.m("Container '", str, "' cannot contain empty values"));
                return;
            }
        }
    }

    public static final <T> void containsNoNulls(Collection<? extends T> collection, String str) {
        collection.getClass();
        str.getClass();
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                ch2.l(q40.m("Container '", str, "' cannot contain null values"));
                return;
            }
        }
    }

    public static final String hasAppID() {
        String applicationId = FacebookSdk.getApplicationId();
        if (applicationId != null) {
            return applicationId;
        }
        lh.g("No App ID found, please set the App ID.");
        return null;
    }

    public static final boolean hasBluetoothPermission(Context context) {
        context.getClass();
        return hasPermission(context, "android.permission.BLUETOOTH") && hasPermission(context, "android.permission.BLUETOOTH_ADMIN");
    }

    public static final boolean hasChangeWifiStatePermission(Context context) {
        context.getClass();
        return hasPermission(context, "android.permission.CHANGE_WIFI_STATE");
    }

    public static final String hasClientToken() {
        String clientToken = FacebookSdk.getClientToken();
        if (clientToken != null) {
            return clientToken;
        }
        lh.g("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml");
        return null;
    }

    public static final void hasContentProvider(Context context) {
        context.getClass();
        String hasAppID = hasAppID();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String l = q40.l(CONTENT_PROVIDER_BASE, hasAppID);
            if (packageManager.resolveContentProvider(l, 0) == null) {
                throw new IllegalStateException(String.format(CONTENT_PROVIDER_NOT_FOUND_REASON, Arrays.copyOf(new Object[]{l}, 1)).toString());
            }
        }
    }

    public static final boolean hasCustomTabRedirectActivity(Context context, String str) {
        List<ResolveInfo> list;
        context.getClass();
        str.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.b(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.b(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void hasFacebookActivity(Context context, boolean z) {
        ActivityInfo activityInfo;
        context.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (activityInfo != null) {
                if (z) {
                    lh.g(FACEBOOK_ACTIVITY_NOT_FOUND_REASON);
                    return;
                } else {
                    Log.w(TAG, FACEBOOK_ACTIVITY_NOT_FOUND_REASON);
                    return;
                }
            }
            return;
        }
        activityInfo = null;
        if (activityInfo != null) {
        }
    }

    public static final void hasInternetPermissions(Context context, boolean z) {
        context.getClass();
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (z) {
                lh.g(NO_INTERNET_PERMISSION_REASON);
            } else {
                Log.w(TAG, NO_INTERNET_PERMISSION_REASON);
            }
        }
    }

    public static final boolean hasLocationPermission(Context context) {
        context.getClass();
        return hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    public static final boolean hasPermission(Context context, String str) {
        context.getClass();
        str.getClass();
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static final boolean hasWiFiPermission(Context context) {
        context.getClass();
        return hasPermission(context, "android.permission.ACCESS_WIFI_STATE");
    }

    public static final <T> void notEmpty(Collection<? extends T> collection, String str) {
        collection.getClass();
        str.getClass();
        if (collection.isEmpty()) {
            lh.c(q40.m("Container '", str, "' cannot be empty"));
        }
    }

    public static final <T> void notEmptyAndContainsNoNulls(Collection<? extends T> collection, String str) {
        collection.getClass();
        str.getClass();
        containsNoNulls(collection, str);
        notEmpty(collection, str);
    }

    public static final void notNull(Object obj, String str) {
        str.getClass();
        if (obj != null) {
            return;
        }
        ch2.l(q40.m("Argument '", str, "' cannot be null"));
    }

    public static final String notNullOrEmpty(String str, String str2) {
        str2.getClass();
        if (str != null && str.length() > 0) {
            return str;
        }
        lh.c(q40.m("Argument '", str2, "' cannot be null or empty"));
        return null;
    }

    public static final void oneOf(Object obj, String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        for (Object obj2 : objArr) {
            if (Intrinsics.b(obj2, obj)) {
                return;
            }
        }
        lh.e(q40.m("Argument '", str, "' was not one of the allowed values"));
    }

    public static final void runningOnUiThread() {
        if (Intrinsics.b(Looper.getMainLooper(), Looper.myLooper())) {
            return;
        }
        ey.i("This method should be called from the UI thread");
    }

    public static final void sdkInitialized() {
        if (!FacebookSdk.isInitialized()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static final void notEmpty(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.length() > 0) {
            return;
        }
        lh.c(q40.m("Argument '", str2, "' cannot be empty"));
    }

    public static final void hasInternetPermissions(Context context) {
        context.getClass();
        hasInternetPermissions(context, true);
    }

    public static final void hasFacebookActivity(Context context) {
        context.getClass();
        hasFacebookActivity(context, true);
    }
}
