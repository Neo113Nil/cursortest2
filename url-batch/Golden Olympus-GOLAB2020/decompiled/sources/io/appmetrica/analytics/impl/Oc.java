package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Oc implements Y8 {

    /* renamed from: a, reason: collision with root package name */
    public final C2575dh f38073a;

    /* renamed from: b, reason: collision with root package name */
    public final C2756kf f38074b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38075c = "activation_unlock_event_sending";

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f38076d;

    public Oc(@NotNull C2575dh c2575dh, @NotNull J4 j4, @NotNull C2756kf c2756kf) {
        this.f38073a = c2575dh;
        this.f38074b = c2756kf;
        this.f38076d = new AtomicBoolean(c2756kf.a(false) || a(j4));
    }

    public final void a(String str) {
        try {
            C2551ck c2551ck = Bj.f37257a;
            String str2 = this.f38075c;
            JSONObject put = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            C2674ha h4 = Ia.f37730F.h();
            Bundle applicationMetaData = h4.f39138d.getApplicationMetaData(h4.f39135a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C2994tk c2994tk = Ia.f37730F.f37734D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(c2994tk.f39871a.currentTimeMillis() - c2994tk.f39872b, TimeUnit.MILLISECONDS)).toString();
            c2551ck.getClass();
            c2551ck.a(new C2497ak(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.Y8
    public final boolean b() {
        String str;
        if (!this.f38076d.get() && (str = ((C3095xh) this.f38073a.a()).f40186m) != null && !Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f38076d.compareAndSet(false, true)) {
            this.f38074b.b(true);
            a("activation");
        }
        return this.f38076d.get();
    }

    public final void a() {
        if (this.f38076d.compareAndSet(false, true)) {
            this.f38074b.b(true);
            a("timer");
        }
    }

    public static boolean a(J4 j4) {
        String str = j4.f37789a;
        return (str == null || Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
