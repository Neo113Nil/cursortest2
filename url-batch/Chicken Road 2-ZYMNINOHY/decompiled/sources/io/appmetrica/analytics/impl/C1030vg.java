package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030vg {
    public C1030vg(Oa oa) {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Oa a(Context context, IHandlerExecutor iHandlerExecutor) {
        C0693ig c0693ig;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c0693ig = new C0693ig(context, iHandlerExecutor);
            } catch (Throwable unused) {
            }
            return c0693ig != null ? new C1004ug() : c0693ig;
        }
        c0693ig = null;
        if (c0693ig != null) {
        }
    }
}
