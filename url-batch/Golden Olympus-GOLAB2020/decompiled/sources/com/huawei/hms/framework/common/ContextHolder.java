package com.huawei.hms.framework.common;

import android.content.Context;

/* loaded from: classes.dex */
public class ContextHolder {

    /* renamed from: a, reason: collision with root package name */
    private static Context f14128a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f14129b;

    public static Context getAppContext() {
        return f14128a;
    }

    public static Context getKitContext() {
        return f14129b;
    }

    public static Context getResourceContext() {
        return getKitContext() != null ? getKitContext() : getAppContext();
    }

    public static void setAppContext(Context context) {
        if (f14128a != null) {
            return;
        }
        CheckParamUtils.checkNotNull(context, "sAppContext == null");
        f14128a = context.getApplicationContext();
    }

    public static void setKitContext(Context context) {
        CheckParamUtils.checkNotNull(context, "sKitContext == null");
        f14129b = context;
    }
}
