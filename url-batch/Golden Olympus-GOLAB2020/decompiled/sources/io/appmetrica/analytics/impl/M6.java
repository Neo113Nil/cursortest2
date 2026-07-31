package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class M6 {

    /* renamed from: a, reason: collision with root package name */
    public volatile String f37969a;

    public static String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final String b() {
        if (this.f37969a != null) {
            return this.f37969a;
        }
        synchronized (this) {
            try {
                if (this.f37969a == null) {
                    this.f37969a = a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f37969a;
    }

    public final boolean c() {
        try {
            if (TextUtils.isEmpty(b())) {
                return false;
            }
            return !b().contains(StringUtils.PROCESS_POSTFIX_DELIMITER);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean a(@NonNull String str) {
        try {
            if (!TextUtils.isEmpty(b())) {
                if (b().endsWith(StringUtils.PROCESS_POSTFIX_DELIMITER + str)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
