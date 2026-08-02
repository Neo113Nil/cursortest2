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
    public final Vg f5747a;

    /* renamed from: b, reason: collision with root package name */
    public final C0390bf f5748b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5749c = "activation_unlock_event_sending";

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5750d;

    public Ac(Vg vg, C0896v4 c0896v4, C0390bf c0390bf) {
        this.f5747a = vg;
        this.f5748b = c0390bf;
        this.f5750d = new AtomicBoolean(c0390bf.a(false) || a(c0896v4));
    }

    public final void a(String str) {
        try {
            Vj vj = AbstractC0859tj.f8379a;
            String str2 = this.f5749c;
            JSONObject put = new JSONObject().put(AdRevenueConstants.SOURCE_KEY, str).put("framework", FrameworkDetector.framework());
            T9 i3 = C0876ua.f8420H.i();
            Bundle applicationMetaData = i3.f6698d.getApplicationMetaData(i3.f6695a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C0783qk c0783qk = C0876ua.f8420H.f8424D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(c0783qk.f8179a.currentTimeMillis() - c0783qk.f8180b, TimeUnit.MILLISECONDS)).toString();
            vj.getClass();
            vj.a(new Tj(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final boolean b() {
        String str;
        if (!this.f5750d.get() && (str = ((C0754ph) this.f5747a.a()).f8090m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f5750d.compareAndSet(false, true)) {
            this.f5748b.b(true);
            a("activation");
        }
        return this.f5750d.get();
    }

    public final void a() {
        if (this.f5750d.compareAndSet(false, true)) {
            this.f5748b.b(true);
            a("timer");
        }
    }

    public static boolean a(C0896v4 c0896v4) {
        String str = c0896v4.f8477a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
