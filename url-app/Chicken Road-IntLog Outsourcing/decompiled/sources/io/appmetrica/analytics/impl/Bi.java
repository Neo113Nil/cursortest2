package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class Bi {

    /* renamed from: a, reason: collision with root package name */
    public final M4 f6605a;

    /* renamed from: b, reason: collision with root package name */
    public final Un f6606b;

    /* renamed from: c, reason: collision with root package name */
    public final Di f6607c;

    /* renamed from: d, reason: collision with root package name */
    public final C0888p0 f6608d;

    /* renamed from: e, reason: collision with root package name */
    public Tl f6609e;

    /* renamed from: f, reason: collision with root package name */
    public final C0598dk f6610f;

    public Bi(C0888p0 c0888p0, Un un, M4 m42, C0598dk c0598dk) {
        this(c0888p0, un, m42, c0598dk, new Di(c0888p0, c0598dk));
    }

    public final void a(Ah ah) {
        Kh kh = ah.f6534e;
        Tl tl = this.f6609e;
        if (tl != null) {
            kh.f7239b.setUuid(((Sl) tl).g());
        } else {
            kh.getClass();
        }
        this.f6607c.a(ah);
    }

    public final void b(String str) {
        Gf gf = this.f6605a.f7238a;
        synchronized (gf) {
            gf.f6837a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Bi(C0888p0 c0888p0, Un un, M4 m42, C0598dk c0598dk, Di di) {
        this.f6608d = c0888p0;
        this.f6605a = m42;
        this.f6606b = un;
        this.f6610f = c0598dk;
        this.f6607c = di;
    }

    public final void a(Sl sl) {
        this.f6609e = sl;
        this.f6605a.f7239b.setUuid(sl.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (AbstractC0860no.a(bool)) {
            this.f6605a.f7239b.setLocationTracking(bool.booleanValue());
        }
        if (AbstractC0860no.a(bool2)) {
            this.f6605a.f7239b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (AbstractC0860no.a(bool3)) {
            this.f6605a.f7239b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        W5 a6 = W5.a();
        M4 m42 = this.f6605a;
        a(a(a6, m42), m42, 1, (Map) null);
    }

    public final void a(W5 w5, Kh kh, int i2, Map map) {
        String str;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        this.f6608d.b();
        if (!AbstractC0860no.a(map)) {
            w5.setValue(AbstractC0847nb.b(map));
            a(w5, kh);
        }
        Gf gf = new Gf(kh.f7238a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f7239b);
        I8 i8 = kh.f7037c;
        synchronized (kh) {
            str = kh.f7040f;
        }
        a(new Ah(w5, false, i2, null, new Kh(gf, counterConfiguration, i8, str)));
    }

    public static W5 a(W5 w5, Kh kh) {
        if (D9.f6670a.contains(Integer.valueOf(w5.f7651d))) {
            w5.f7650c = kh.d();
        }
        return w5;
    }

    public final void a(List list) {
        Gf gf = this.f6605a.f7238a;
        synchronized (gf) {
            gf.f6837a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC0860no.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Gf gf = this.f6605a.f7238a;
        synchronized (gf) {
            gf.f6837a.put("PROCESS_CFG_CLIDS", AbstractC0847nb.b(hashMap));
        }
    }

    public final void a(String str) {
        Gf gf = this.f6605a.f7238a;
        synchronized (gf) {
            gf.f6837a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final Ah a(Sn sn, Kh kh) {
        String str;
        String str2;
        this.f6608d.b();
        Un un = this.f6606b;
        un.getClass();
        In in = sn.f7491a;
        if (in == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(in.f6977a, "");
        }
        byte[] fromModel = un.f7604a.fromModel(sn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh.f7239b.getApiKey());
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(fromModel, str, 5891, orCreatePublicLogger);
        u32.f7650c = kh.d();
        HashMap hashMap = u32.f7578q;
        Gf gf = new Gf(kh.f7238a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f7239b);
        I8 i8 = kh.f7037c;
        synchronized (kh) {
            str2 = kh.f7040f;
        }
        return new Ah(u32, true, 1, hashMap, new Kh(gf, counterConfiguration, i8, str2));
    }
}
