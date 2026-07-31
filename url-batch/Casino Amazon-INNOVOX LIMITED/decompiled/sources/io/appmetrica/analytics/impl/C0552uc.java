package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.uc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0552uc implements G8 {

    /* renamed from: a, reason: collision with root package name */
    public final Rg f1514a;
    public final Xe b;
    public final String c = "activation_unlock_event_sending";
    public final AtomicBoolean d;

    public C0552uc(Rg rg, C0420p4 c0420p4, Xe xe) {
        this.f1514a = rg;
        this.b = xe;
        this.d = new AtomicBoolean(xe.a(false) || a(c0420p4));
    }

    public final void a(String str) {
        try {
            Rj rj = AbstractC0435pj.f1437a;
            String str2 = this.c;
            JSONObject put = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            N9 i = C0401oa.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.f968a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C0386nk c0386nk = C0401oa.I.D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(c0386nk.f1400a.currentTimeMillis() - c0386nk.b, TimeUnit.MILLISECONDS)).toString();
            rj.getClass();
            rj.a(new Pj(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        String str;
        if (!this.d.get() && (str = ((C0333lh) this.f1514a.a()).m) != null && !Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01") && this.d.compareAndSet(false, true)) {
            this.b.b(true);
            a("activation");
        }
        return this.d.get();
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.b.b(true);
            a("timer");
        }
    }

    public static boolean a(C0420p4 c0420p4) {
        String str = c0420p4.f1425a;
        return (str == null || Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
