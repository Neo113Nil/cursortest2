package io.appmetrica.analytics.coreutils.internal.services;

import android.content.Context;

/* loaded from: classes.dex */
public final class ContextPermissionChecker {
    public static final ContextPermissionChecker INSTANCE = new ContextPermissionChecker();

    private ContextPermissionChecker() {
    }

    public static final boolean hasPermission(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
