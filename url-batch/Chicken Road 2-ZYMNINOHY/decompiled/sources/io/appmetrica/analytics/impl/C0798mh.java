package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798mh extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0977tf f12366b;

    /* renamed from: c, reason: collision with root package name */
    public final C1090xo f12367c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f12368d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeProvider f12369e;

    public C0798mh(X4 x4) {
        this(x4, x4.u(), C0817na.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        X4 x4 = this.f10886a;
        if (this.f12367c.d()) {
            return false;
        }
        P5 a3 = ((C0746kh) x4.f11232k.a()).f12223e ? P5.a(p5, EnumC0508bb.EVENT_TYPE_APP_UPDATE) : P5.a(p5, EnumC0508bb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f12368d.getInstallerPackageName(x4.f11222a, x4.f11223b.f10836a), ""));
            C0977tf c0977tf = this.f12366b;
            c0977tf.f10815h.a(c0977tf.f10808a);
            jSONObject.put("preloadInfo", ((C0900qf) c0977tf.c()).b());
        } catch (Throwable unused) {
        }
        a3.setValue(jSONObject.toString());
        C0738k9 c0738k9 = x4.n;
        c0738k9.a(a3, Rk.a(c0738k9.f12204c.b(a3), a3.f10802i));
        C1090xo c1090xo = this.f12367c;
        synchronized (c1090xo) {
            C1116yo c1116yo = c1090xo.f13040a;
            c1116yo.a(c1116yo.a().put("init_event_done", true));
        }
        this.f12367c.a(this.f12369e.currentTimeMillis());
        return false;
    }

    public C0798mh(X4 x4, C1090xo c1090xo, C0977tf c0977tf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(x4);
        this.f12367c = c1090xo;
        this.f12366b = c0977tf;
        this.f12368d = safePackageManager;
        this.f12369e = systemTimeProvider;
    }
}
