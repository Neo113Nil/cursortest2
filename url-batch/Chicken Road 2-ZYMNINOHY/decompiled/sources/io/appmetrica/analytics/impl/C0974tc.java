package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974tc implements F8 {

    /* renamed from: a, reason: collision with root package name */
    public final Qg f12775a;

    /* renamed from: b, reason: collision with root package name */
    public final We f12776b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12777c = "activation_unlock_event_sending";

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12778d;

    public C0974tc(Qg qg, C0837o4 c0837o4, We we) {
        this.f12775a = qg;
        this.f12776b = we;
        this.f12778d = new AtomicBoolean(we.a(false) || a(c0837o4));
    }

    public final void a(String str) {
        try {
            Qj qj = AbstractC0852oj.f12527a;
            String str2 = this.f12777c;
            JSONObject put = new JSONObject().put(AdRevenueConstants.SOURCE_KEY, str).put("framework", FrameworkDetector.framework());
            M9 i4 = C0817na.f12417I.i();
            Bundle applicationMetaData = i4.f10640d.getApplicationMetaData(i4.f10637a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C0801mk c0801mk = C0817na.f12417I.f12421D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(c0801mk.f12375a.currentTimeMillis() - c0801mk.f12376b, TimeUnit.MILLISECONDS)).toString();
            qj.getClass();
            qj.a(new Oj(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        String str;
        if (!this.f12778d.get() && (str = ((C0746kh) this.f12775a.a()).f12231m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f12778d.compareAndSet(false, true)) {
            this.f12776b.b(true);
            a("activation");
        }
        return this.f12778d.get();
    }

    public final void a() {
        if (this.f12778d.compareAndSet(false, true)) {
            this.f12776b.b(true);
            a("timer");
        }
    }

    public static boolean a(C0837o4 c0837o4) {
        String str = c0837o4.f12484a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
