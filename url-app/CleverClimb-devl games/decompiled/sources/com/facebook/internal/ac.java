package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.CustomTabActivity;
import com.facebook.FacebookActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: Validate.java */
/* loaded from: classes.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6072a = "com.facebook.internal.ac";

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + str + "' cannot be null");
    }

    public static <T> void a(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Container '" + str + "' cannot be empty");
        }
    }

    public static <T> void b(Collection<T> collection, String str) {
        a((Object) collection, str);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    public static <T> void c(Collection<T> collection, String str) {
        b(collection, str);
        a((Collection) collection, str);
    }

    public static void a(String str, String str2) {
        if (ab.a(str)) {
            throw new IllegalArgumentException("Argument '" + str2 + "' cannot be null or empty");
        }
    }

    public static void a() {
        if (!com.facebook.l.a()) {
            throw new com.facebook.m("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static String b() {
        String i = com.facebook.l.i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    public static String c() {
        String k = com.facebook.l.k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    public static void a(Context context) {
        a(context, true);
    }

    public static void a(Context context, boolean z) {
        a(context, com.umeng.analytics.pro.b.M);
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (z) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Log.w(f6072a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static void b(Context context) {
        b(context, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, boolean z) {
        ActivityInfo activityInfo;
        a(context, com.umeng.analytics.pro.b.M);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, (Class<?>) FacebookActivity.class), 1);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (activityInfo != null) {
                if (z) {
                    throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
                }
                Log.w(f6072a, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
                return;
            }
            return;
        }
        activityInfo = null;
        if (activityInfo != null) {
        }
    }

    public static boolean c(Context context) {
        List<ResolveInfo> list;
        a(context, com.umeng.analytics.pro.b.M);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse("fb" + com.facebook.l.i() + "://authorize"));
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
            if (!it.next().activityInfo.name.equals(CustomTabActivity.class.getName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public static void d(Context context) {
        a(context, com.umeng.analytics.pro.b.M);
        String b2 = b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String str = "com.facebook.app.FacebookContentProvider" + b2;
            if (packageManager.resolveContentProvider(str, 0) == null) {
                throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", str));
            }
        }
    }
}
