package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805rh extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final C0984yf f8243b;

    /* renamed from: c, reason: collision with root package name */
    public final zo f8244c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f8245d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeProvider f8246e;

    public C0805rh(C0457e5 c0457e5) {
        this(c0457e5, c0457e5.u(), C0876ua.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0457e5 c0457e5 = this.f6835a;
        if (this.f8244c.d()) {
            return false;
        }
        W5 a3 = ((C0754ph) c0457e5.f7234k.a()).f8083e ? W5.a(w5, EnumC0567ib.EVENT_TYPE_APP_UPDATE) : W5.a(w5, EnumC0567ib.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f8245d.getInstallerPackageName(c0457e5.f7225a, c0457e5.f7226b.f6860a), ""));
            C0984yf c0984yf = this.f8243b;
            c0984yf.f6790h.a(c0984yf.f6784a);
            jSONObject.put("preloadInfo", ((C0907vf) c0984yf.c()).b());
        } catch (Throwable unused) {
        }
        a3.setValue(jSONObject.toString());
        C0797r9 c0797r9 = c0457e5.f7237n;
        c0797r9.a(a3, Wk.a(c0797r9.f8216c.b(a3), a3.f6822i));
        zo zoVar = this.f8244c;
        synchronized (zoVar) {
            Ao ao = zoVar.f8716a;
            ao.a(ao.a().put("init_event_done", true));
        }
        this.f8244c.a(this.f8246e.currentTimeMillis());
        return false;
    }

    public C0805rh(C0457e5 c0457e5, zo zoVar, C0984yf c0984yf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c0457e5);
        this.f8244c = zoVar;
        this.f8243b = c0984yf;
        this.f8245d = safePackageManager;
        this.f8246e = systemTimeProvider;
    }
}
