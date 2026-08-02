package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0481aa f10269a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10270b;

    public F1() {
        this(new C0481aa());
    }

    public final synchronized long a(Context context) {
        String a3;
        try {
            this.f10269a.getClass();
            a3 = Ja.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(a3) ? 0L : new JSONObject(a3).optLong("delay");
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f10270b) {
            return;
        }
        long a3 = a(context);
        if (a3 > 0) {
            try {
                Thread.sleep(a3);
            } catch (Throwable unused) {
            }
        }
        this.f10270b = true;
    }

    public F1(C0481aa c0481aa) {
        this.f10270b = false;
        this.f10269a = c0481aa;
    }
}
