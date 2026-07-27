package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0691ha f7295a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7296b;

    public Q1() {
        this(new C0691ha());
    }

    public final synchronized long a(Context context) {
        String a6;
        try {
            this.f7295a.getClass();
            a6 = Qa.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(a6) ? 0L : new JSONObject(a6).optLong("delay");
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f7296b) {
            return;
        }
        long a6 = a(context);
        if (a6 > 0) {
            try {
                Thread.sleep(a6);
            } catch (Throwable unused) {
            }
        }
        this.f7296b = true;
    }

    public Q1(C0691ha c0691ha) {
        this.f7296b = false;
        this.f7295a = c0691ha;
    }
}
