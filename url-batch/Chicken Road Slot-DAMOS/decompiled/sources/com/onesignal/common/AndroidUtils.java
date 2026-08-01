package com.onesignal.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
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
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001PB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b)\u0010\rJ\u0015\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u0004\u0018\u00010\t2\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u000b¢\u0006\u0004\b5\u00102J\u001d\u00108\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00106\u001a\u00020\t¢\u0006\u0004\b8\u00109J\u001d\u00108\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b8\u0010<J\u0015\u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b>\u0010?J%\u0010D\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ)\u0010H\u001a\b\u0012\u0004\u0012\u00020\t0F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\t0F2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bH\u0010IJ\u001b\u0010L\u001a\u00020\u000b2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030JH\u0007¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u0002072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/onesignal/common/AndroidUtils;", "", "<init>", "()V", "", "minDelay", "maxDelay", "getRandomDelay", "(II)I", "", "body", "", "isStringNotEmpty", "(Ljava/lang/String;)Z", "Landroid/app/Activity;", "activity", "isActivityFullyReady", "(Landroid/app/Activity;)Z", "Landroid/content/Context;", "appContext", "isAndroidUserUnlocked", "(Landroid/content/Context;)Z", "configChangeFlag", "hasConfigChangeFlag", "(Landroid/app/Activity;I)Z", "context", "getAppVersion", "(Landroid/content/Context;)Ljava/lang/String;", "metaName", "getManifestMeta", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "getManifestMetaBoolean", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/os/Bundle;", "getManifestMetaBundle", "(Landroid/content/Context;)Landroid/os/Bundle;", "key", "defaultStr", "getResourceString", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "name", "isValidResourceName", "", "subjectThrowable", "getRootCauseThrowable", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "throwable", "getRootCauseMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "isRunningOnMainThread", "()Z", "getTargetSdkVersion", "(Landroid/content/Context;)I", "hasNotificationManagerCompat", "url", "", "openURLInBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "(Landroid/content/Context;Landroid/net/Uri;)V", "Landroid/content/Intent;", "openURLInBrowserIntent", "(Landroid/net/Uri;)Landroid/content/Intent;", "permission", "isUserGranted", "Lea/f;", "applicationService", "hasPermission", "(Ljava/lang/String;ZLea/f;)Z", "", "permissions", "filterManifestPermissions", "(Ljava/util/List;Lea/f;)Ljava/util/List;", "Ljava/lang/Class;", "_class", "opaqueHasClass", "(Ljava/lang/Class;)Z", "finishSafely", "(Landroid/app/Activity;)V", yb.a.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    private AndroidUtils() {
    }

    public final List<String> filterManifestPermissions(List<String> permissions, ea.f applicationService) {
        permissions.getClass();
        applicationService.getClass();
        PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), 4096);
        packageInfo.getClass();
        String[] strArr = packageInfo.requestedPermissions;
        strArr.getClass();
        List f3 = y.f(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (f3.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void finishSafely(Activity activity) {
        activity.getClass();
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public final String getAppVersion(Context context) {
        Integer num;
        context.getClass();
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

    public final String getManifestMeta(Context context, String metaName) {
        context.getClass();
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getString(metaName);
        }
        return null;
    }

    public final boolean getManifestMetaBoolean(Context context, String metaName) {
        context.getClass();
        Bundle manifestMetaBundle = getManifestMetaBundle(context);
        if (manifestMetaBundle != null) {
            return manifestMetaBundle.getBoolean(metaName);
        }
        return false;
    }

    public final Bundle getManifestMetaBundle(Context context) {
        context.getClass();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e2) {
            com.onesignal.debug.internal.logging.b.error("Manifest application info not found", e2);
            return null;
        }
    }

    public final int getRandomDelay(int minDelay, int maxDelay) {
        return new Random().nextInt((maxDelay + 1) - minDelay) + minDelay;
    }

    public final String getResourceString(Context context, String key, String defaultStr) {
        context.getClass();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(key, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : defaultStr;
    }

    public final String getRootCauseMessage(Throwable throwable) {
        throwable.getClass();
        return getRootCauseThrowable(throwable).getMessage();
    }

    public final Throwable getRootCauseThrowable(Throwable subjectThrowable) {
        subjectThrowable.getClass();
        while (subjectThrowable.getCause() != null && subjectThrowable.getCause() != subjectThrowable) {
            subjectThrowable = subjectThrowable.getCause();
            subjectThrowable.getClass();
        }
        return subjectThrowable;
    }

    public final int getTargetSdkVersion(Context context) {
        context.getClass();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            applicationInfo.getClass();
            return applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 21;
        }
    }

    public final boolean hasConfigChangeFlag(Activity activity, int configChangeFlag) {
        activity.getClass();
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & configChangeFlag) != 0;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final boolean hasNotificationManagerCompat() {
        return true;
    }

    public final boolean hasPermission(String permission, boolean isUserGranted, ea.f applicationService) {
        permission.getClass();
        applicationService.getClass();
        try {
            PackageInfo packageInfo = applicationService.getAppContext().getPackageManager().getPackageInfo(applicationService.getAppContext().getPackageName(), 4096);
            packageInfo.getClass();
            String[] strArr = packageInfo.requestedPermissions;
            strArr.getClass();
            if (!y.f(Arrays.copyOf(strArr, strArr.length)).contains(permission)) {
                return false;
            }
            if (isUserGranted) {
                return k7.e.i(applicationService.getAppContext(), permission) != -1;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final boolean isActivityFullyReady(Activity activity) {
        activity.getClass();
        boolean z10 = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        View decorView = activity.getWindow().getDecorView();
        decorView.getClass();
        return z10 && (decorView.getRootWindowInsets() != null);
    }

    public final boolean isAndroidUserUnlocked(Context appContext) {
        appContext.getClass();
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

    public final boolean isStringNotEmpty(String body) {
        return !TextUtils.isEmpty(body);
    }

    public final boolean isValidResourceName(String name) {
        return (name == null || new Regex("^[0-9]").c(name)) ? false : true;
    }

    public final boolean opaqueHasClass(Class<?> _class) {
        _class.getClass();
        return true;
    }

    public final void openURLInBrowser(Context appContext, String url) {
        appContext.getClass();
        url.getClass();
        int length = url.length() - 1;
        int i3 = 0;
        boolean z10 = false;
        while (i3 <= length) {
            boolean z11 = Intrinsics.b(url.charAt(!z10 ? i3 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i3++;
            } else {
                z10 = true;
            }
        }
        Uri parse = Uri.parse(url.subSequence(i3, length + 1).toString());
        parse.getClass();
        openURLInBrowser(appContext, parse);
    }

    public final Intent openURLInBrowserIntent(Uri uri) {
        Intent makeMainSelectorActivity;
        uri.getClass();
        a fromString = uri.getScheme() != null ? a.Companion.fromString(uri.getScheme()) : null;
        if (fromString == null) {
            fromString = a.HTTP;
            String uri2 = uri.toString();
            uri2.getClass();
            if (!StringsKt.n(uri2, "://")) {
                uri = Uri.parse("http://" + uri);
                uri.getClass();
            }
        }
        int i3 = com.onesignal.common.a.$EnumSwitchMapping$0[fromString.ordinal()];
        if (i3 != 1) {
            makeMainSelectorActivity = (i3 == 2 || i3 == 3) ? new Intent("android.intent.action.VIEW", uri) : new Intent("android.intent.action.VIEW", uri);
        } else {
            makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            makeMainSelectorActivity.getClass();
            makeMainSelectorActivity.setData(uri);
        }
        makeMainSelectorActivity.addFlags(268435456);
        return makeMainSelectorActivity;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        private static final /* synthetic */ od.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C0001a Companion;
        private final String text;
        public static final a DATA = new a("DATA", 0, "data");
        public static final a HTTPS = new a("HTTPS", 1, "https");
        public static final a HTTP = new a("HTTP", 2, "http");

        private static final /* synthetic */ a[] $values() {
            return new a[]{DATA, HTTPS, HTTP};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = i7.a.J($values);
            Companion = new C0001a(null);
        }

        private a(String str, int i3, String str2) {
            this.text = str2;
        }

        public static od.a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.common.AndroidUtils$a$a, reason: collision with other inner class name */
        public static final class C0001a {
            public /* synthetic */ C0001a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (o.f(aVar.text, str, true)) {
                        return aVar;
                    }
                }
                return null;
            }

            private C0001a() {
            }
        }
    }

    public final void openURLInBrowser(Context appContext, Uri uri) {
        appContext.getClass();
        uri.getClass();
        appContext.startActivity(openURLInBrowserIntent(uri));
    }
}
