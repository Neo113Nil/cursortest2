package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ac implements K8 {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f6524a;

    /* renamed from: b, reason: collision with root package name */
    public final C0541bf f6525b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6526c = "activation_unlock_event_sending";

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6527d;

    public Ac(Vg vg, C1047v4 c1047v4, C0541bf c0541bf) {
        this.f6524a = vg;
        this.f6525b = c0541bf;
        this.f6527d = new AtomicBoolean(c0541bf.a(false) || a(c1047v4));
    }

    public final void a(String str) {
        try {
            Vj vj = AbstractC1010tj.f9323a;
            String str2 = this.f6526c;
            JSONObject put = new JSONObject().put(AdRevenueConstants.SOURCE_KEY, str).put("framework", FrameworkDetector.framework());
            T9 i2 = C1027ua.f9366H.i();
            Bundle applicationMetaData = i2.f7526d.getApplicationMetaData(i2.f7523a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C0934qk c0934qk = C1027ua.f9366H.f9370D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(c0934qk.f9113a.currentTimeMillis() - c0934qk.f9114b, TimeUnit.MILLISECONDS)).toString();
            vj.getClass();
            vj.a(new Tj(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final boolean b() {
        String str;
        if (!this.f6527d.get() && (str = ((C0905ph) this.f6524a.a()).f9016m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f6527d.compareAndSet(false, true)) {
            this.f6525b.b(true);
            a("activation");
        }
        return this.f6527d.get();
    }

    public final void a() {
        if (this.f6527d.compareAndSet(false, true)) {
            this.f6525b.b(true);
            a("timer");
        }
    }

    public static boolean a(C1047v4 c1047v4) {
        String str = c1047v4.f9426a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
