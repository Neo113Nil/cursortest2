package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3036va f37988a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37989b;

    public N1() {
        this(new C3036va());
    }

    public final synchronized long a(Context context) {
        String a4;
        try {
            this.f37988a.getClass();
            a4 = AbstractC2595eb.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(a4) ? 0L : new JSONObject(a4).optLong("delay");
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f37989b) {
            return;
        }
        long a4 = a(context);
        if (a4 > 0) {
            try {
                Thread.sleep(a4);
            } catch (Throwable unused) {
            }
        }
        this.f37989b = true;
    }

    public N1(C3036va c3036va) {
        this.f37989b = false;
        this.f37988a = c3036va;
    }
}
