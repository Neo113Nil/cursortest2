package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* loaded from: classes3.dex */
public final class Ig {
    public Ig(InterfaceC2726jb interfaceC2726jb) {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC2726jb a(Context context, IHandlerExecutor iHandlerExecutor) {
        C3042vg c3042vg;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c3042vg = new C3042vg(context, iHandlerExecutor);
            } catch (Throwable unused) {
            }
            return c3042vg != null ? new Hg() : c3042vg;
        }
        c3042vg = null;
        if (c3042vg != null) {
        }
    }
}
