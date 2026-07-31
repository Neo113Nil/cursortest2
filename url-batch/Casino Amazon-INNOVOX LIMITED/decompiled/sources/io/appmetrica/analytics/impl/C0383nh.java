package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0383nh extends Sg {
    public final C0555uf b;
    public final yo c;
    public final SafePackageManager d;
    public final TimeProvider e;

    public C0383nh(Y4 y4) {
        this(y4, y4.u(), C0401oa.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(Q5 q5) {
        Y4 y4 = this.f1045a;
        if (this.c.d()) {
            return false;
        }
        Q5 a2 = ((C0333lh) y4.k.a()).e ? Q5.a(q5, EnumC0095cb.EVENT_TYPE_APP_UPDATE) : Q5.a(q5, EnumC0095cb.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.d.getInstallerPackageName(y4.f1126a, y4.b.f1025a), ""));
            C0555uf c0555uf = this.b;
            c0555uf.h.a(c0555uf.f1015a);
            jSONObject.put("preloadInfo", ((C0480rf) c0555uf.c()).b());
        } catch (Throwable unused) {
        }
        a2.setValue(jSONObject.toString());
        C0325l9 c0325l9 = y4.n;
        c0325l9.a(a2, Sk.a(c0325l9.c.b(a2), a2.i));
        yo yoVar = this.c;
        synchronized (yoVar) {
            zo zoVar = yoVar.f1591a;
            zoVar.a(zoVar.a().put("init_event_done", true));
        }
        this.c.a(this.e.currentTimeMillis());
        return false;
    }

    public C0383nh(Y4 y4, yo yoVar, C0555uf c0555uf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(y4);
        this.c = yoVar;
        this.b = c0555uf;
        this.d = safePackageManager;
        this.e = systemTimeProvider;
    }
}
