package ru.rustore.sdk.core.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class ContextExtKt {

    @NotNull
    private static final String TAG = "ServiceExt";

    public static final boolean isAppInstalled(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            context.getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final void openApp(@NotNull Context context, @NotNull String packageName, @NotNull Function0<Unit> onFail) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            return;
        }
        try {
            context.startActivity(launchIntentForPackage);
        } catch (ActivityNotFoundException unused) {
            onFail.invoke();
        }
    }

    public static final void openUrl(@NotNull Context context, @NotNull String url, @NotNull Function0<Unit> onFail) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        } catch (ActivityNotFoundException unused) {
            onFail.invoke();
        }
    }

    public static final void unbindServiceSafely(@NotNull Context context, @Nullable ServiceConnection serviceConnection) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable th) {
                Log.e(TAG, "unbindServiceSafely", th);
            }
        }
    }
}
