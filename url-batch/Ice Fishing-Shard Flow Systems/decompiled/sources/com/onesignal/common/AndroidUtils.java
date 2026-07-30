package com.onesignal.common;

import a.AbstractC0169a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.UserManager;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.p;

@Metadata
/* loaded from: classes.dex */
public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();
    private static final int androidSDKInt = Build.VERSION.SDK_INT;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Y5.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C0004a Companion;
        private final String text;
        public static final a DATA = new a("DATA", 0, "data");
        public static final a HTTPS = new a("HTTPS", 1, "https");
        public static final a HTTP = new a("HTTP", 2, "http");

        /* renamed from: com.onesignal.common.AndroidUtils$a$a, reason: collision with other inner class name */
        public static final class C0004a {
            public /* synthetic */ C0004a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (p.g(aVar.text, str)) {
                        return aVar;
                    }
                }
                return null;
            }

            private C0004a() {
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{DATA, HTTPS, HTTP};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = d4.c.o($values);
            Companion = new C0004a(null);
        }

        private a(String str, int i2, String str2) {
            this.text = str2;
        }

        public static Y5.a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private AndroidUtils() {
    }

    public final List<String> filterManifestPermissions(List<String> permissions, v2.f applicationService) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(applicationService, "applicationService");
        PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), 4096);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
        String[] requestedPermissions = packageInfo.requestedPermissions;
        Intrinsics.checkNotNullExpressionValue(requestedPermissions, "requestedPermissions");
        List d7 = r.d(Arrays.copyOf(requestedPermissions, requestedPermissions.length));
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (d7.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void finishSafely(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public final int getAndroidSDKInt() {
        return androidSDKInt;
    }

    public final String getAppVersion(Context context) {
        Integer num;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            num = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            num = null;
        }
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    public final String getManifestMeta(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getString(str);
        }
        return null;
    }

    public final boolean getManifestMetaBoolean(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getBoolean(str);
        }
        return false;
    }

    public final Bundle getManifestMetaBundle(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e7) {
            com.onesignal.debug.internal.logging.b.error("Manifest application info not found", e7);
            return null;
        }
    }

    public final int getRandomDelay(int i2, int i5) {
        return new Random().nextInt((i5 + 1) - i2) + i2;
    }

    public final String getResourceString(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public final String getRootCauseMessage(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return getRootCauseThrowable(throwable).getMessage();
    }

    public final Throwable getRootCauseThrowable(Throwable subjectThrowable) {
        Intrinsics.checkNotNullParameter(subjectThrowable, "subjectThrowable");
        while (subjectThrowable.getCause() != null && subjectThrowable.getCause() != subjectThrowable) {
            subjectThrowable = subjectThrowable.getCause();
            Intrinsics.b(subjectThrowable);
        }
        return subjectThrowable;
    }

    public final int getTargetSdkVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e7) {
            e7.printStackTrace();
            return 21;
        }
    }

    public final boolean hasConfigChangeFlag(Activity activity, int i2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i2) != 0;
        } catch (PackageManager.NameNotFoundException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public final boolean hasNotificationManagerCompat() {
        return true;
    }

    public final boolean hasPermission(String permission, boolean z7, v2.f applicationService) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(applicationService, "applicationService");
        try {
            PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), 4096);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            String[] requestedPermissions = packageInfo.requestedPermissions;
            Intrinsics.checkNotNullExpressionValue(requestedPermissions, "requestedPermissions");
            if (!r.d(Arrays.copyOf(requestedPermissions, requestedPermissions.length)).contains(permission)) {
                return false;
            }
            if (z7) {
                return AbstractC0169a.b(applicationService.getAppContext(), permission) != -1;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public final boolean isActivityFullyReady(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        boolean z7 = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return z7 && (decorView.getRootWindowInsets() != null);
    }

    public final boolean isAndroidUserUnlocked(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Object systemService = appContext.getSystemService("user");
        UserManager userManager = systemService instanceof UserManager ? (UserManager) systemService : null;
        if (userManager != null) {
            return userManager.isUserUnlocked();
        }
        return true;
    }

    public final boolean isRunningOnMainThread() {
        return Intrinsics.a(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    public final boolean isStringNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

    public final boolean isValidResourceName(String str) {
        return (str == null || new Regex("^[0-9]").c(str)) ? false : true;
    }

    public final boolean opaqueHasClass(Class<?> _class) {
        Intrinsics.checkNotNullParameter(_class, "_class");
        return true;
    }

    public final void openURLInBrowser(Context appContext, Uri uri) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(uri, "uri");
        appContext.startActivity(openURLInBrowserIntent(uri));
    }

    public final Intent openURLInBrowserIntent(Uri uri) {
        Intent makeMainSelectorActivity;
        Intrinsics.checkNotNullParameter(uri, "uri");
        a fromString = uri.getScheme() != null ? a.Companion.fromString(uri.getScheme()) : null;
        if (fromString == null) {
            fromString = a.HTTP;
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            if (!StringsKt.u(uri2, "://", false)) {
                uri = Uri.parse("http://" + uri);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            }
        }
        int i2 = com.onesignal.common.a.$EnumSwitchMapping$0[fromString.ordinal()];
        if (i2 != 1) {
            makeMainSelectorActivity = (i2 == 2 || i2 == 3) ? new Intent("android.intent.action.VIEW", uri) : new Intent("android.intent.action.VIEW", uri);
        } else {
            makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            Intrinsics.checkNotNullExpressionValue(makeMainSelectorActivity, "makeMainSelectorActivity(...)");
            makeMainSelectorActivity.setData(uri);
        }
        makeMainSelectorActivity.addFlags(268435456);
        return makeMainSelectorActivity;
    }

    public final void openURLInBrowser(Context appContext, String url) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(url, "url");
        int length = url.length() - 1;
        int i2 = 0;
        boolean z7 = false;
        while (i2 <= length) {
            boolean z8 = Intrinsics.d(url.charAt(!z7 ? i2 : length), 32) <= 0;
            if (z7) {
                if (!z8) {
                    break;
                } else {
                    length--;
                }
            } else if (z8) {
                i2++;
            } else {
                z7 = true;
            }
        }
        Uri parse = Uri.parse(url.subSequence(i2, length + 1).toString());
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        openURLInBrowser(appContext, parse);
    }
}
