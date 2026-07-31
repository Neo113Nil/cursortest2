package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.my.tracker.obfuscated.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1689u {
    public static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            AbstractC1708y2.b("InstallHandler: unable to read app version from package manager: " + th);
            return null;
        }
    }

    public static String b(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            AbstractC1708y2.a("ReferrerHandler: cannot retrieve \"installer\", exception", th);
            return null;
        }
    }
}
