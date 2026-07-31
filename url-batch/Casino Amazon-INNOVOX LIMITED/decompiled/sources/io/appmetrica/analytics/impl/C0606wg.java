package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0606wg {
    public C0606wg(Pa pa) {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pa a(Context context, IHandlerExecutor iHandlerExecutor) {
        C0280jg c0280jg;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c0280jg = new C0280jg(context, iHandlerExecutor);
            } catch (Throwable unused) {
            }
            return c0280jg != null ? new C0581vg() : c0280jg;
        }
        c0280jg = null;
        if (c0280jg != null) {
        }
    }
}
