package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* loaded from: classes.dex */
public final class Ag {
    public Ag(Va va) {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Va a(Context context, IHandlerExecutor iHandlerExecutor) {
        C0701ng c0701ng;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c0701ng = new C0701ng(context, iHandlerExecutor);
            } catch (Throwable unused) {
            }
            return c0701ng != null ? new C1010zg() : c0701ng;
        }
        c0701ng = null;
        if (c0701ng != null) {
        }
    }
}
