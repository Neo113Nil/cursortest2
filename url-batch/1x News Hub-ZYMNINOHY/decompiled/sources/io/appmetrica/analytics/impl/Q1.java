package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Q1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0540ha f6480a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6481b;

    public Q1() {
        this(new C0540ha());
    }

    public final synchronized long a(Context context) {
        String a3;
        try {
            this.f6480a.getClass();
            a3 = Qa.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(a3) ? 0L : new JSONObject(a3).optLong("delay");
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f6481b) {
            return;
        }
        long a3 = a(context);
        if (a3 > 0) {
            try {
                Thread.sleep(a3);
            } catch (Throwable unused) {
            }
        }
        this.f6481b = true;
    }

    public Q1(C0540ha c0540ha) {
        this.f6481b = false;
        this.f6480a = c0540ha;
    }
}
