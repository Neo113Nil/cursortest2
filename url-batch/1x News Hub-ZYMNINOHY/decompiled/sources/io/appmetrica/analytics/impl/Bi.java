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
    public final M4 f5824a;

    /* renamed from: b, reason: collision with root package name */
    public final Un f5825b;

    /* renamed from: c, reason: collision with root package name */
    public final Di f5826c;

    /* renamed from: d, reason: collision with root package name */
    public final C0737p0 f5827d;

    /* renamed from: e, reason: collision with root package name */
    public Tl f5828e;
    public final C0447dk f;

    public Bi(C0737p0 c0737p0, Un un, M4 m4, C0447dk c0447dk) {
        this(c0737p0, un, m4, c0447dk, new Di(c0737p0, c0447dk));
    }

    public final void a(Ah ah) {
        Kh kh = ah.f5757e;
        Tl tl = this.f5828e;
        if (tl != null) {
            kh.f6428b.setUuid(((Sl) tl).g());
        } else {
            kh.getClass();
        }
        this.f5826c.a(ah);
    }

    public final void b(String str) {
        Gf gf = this.f5824a.f6427a;
        synchronized (gf) {
            gf.f6044a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Bi(C0737p0 c0737p0, Un un, M4 m4, C0447dk c0447dk, Di di) {
        this.f5827d = c0737p0;
        this.f5824a = m4;
        this.f5825b = un;
        this.f = c0447dk;
        this.f5826c = di;
    }

    public final void a(Sl sl) {
        this.f5828e = sl;
        this.f5824a.f6428b.setUuid(sl.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (AbstractC0709no.a(bool)) {
            this.f5824a.f6428b.setLocationTracking(bool.booleanValue());
        }
        if (AbstractC0709no.a(bool2)) {
            this.f5824a.f6428b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (AbstractC0709no.a(bool3)) {
            this.f5824a.f6428b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        W5 a3 = W5.a();
        M4 m4 = this.f5824a;
        a(a(a3, m4), m4, 1, (Map) null);
    }

    public final void a(W5 w5, Kh kh, int i3, Map map) {
        String str;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        this.f5827d.b();
        if (!AbstractC0709no.a(map)) {
            w5.setValue(AbstractC0696nb.b(map));
            a(w5, kh);
        }
        Gf gf = new Gf(kh.f6427a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6428b);
        I8 i8 = kh.f6234c;
        synchronized (kh) {
            str = kh.f;
        }
        a(new Ah(w5, false, i3, null, new Kh(gf, counterConfiguration, i8, str)));
    }

    public static W5 a(W5 w5, Kh kh) {
        if (D9.f5886a.contains(Integer.valueOf(w5.f6818d))) {
            w5.f6817c = kh.d();
        }
        return w5;
    }

    public final void a(List list) {
        Gf gf = this.f5824a.f6427a;
        synchronized (gf) {
            gf.f6044a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC0709no.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Gf gf = this.f5824a.f6427a;
        synchronized (gf) {
            gf.f6044a.put("PROCESS_CFG_CLIDS", AbstractC0696nb.b(hashMap));
        }
    }

    public final void a(String str) {
        Gf gf = this.f5824a.f6427a;
        synchronized (gf) {
            gf.f6044a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final Ah a(Sn sn, Kh kh) {
        String str;
        String str2;
        this.f5827d.b();
        Un un = this.f5825b;
        un.getClass();
        In in = sn.f6664a;
        if (in == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(in.f6176a, "");
        }
        byte[] fromModel = un.f6772a.fromModel(sn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh.f6428b.getApiKey());
        Set set = D9.f5886a;
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(fromModel, str, 5891, orCreatePublicLogger);
        u3.f6817c = kh.d();
        HashMap hashMap = u3.f6747q;
        Gf gf = new Gf(kh.f6427a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6428b);
        I8 i8 = kh.f6234c;
        synchronized (kh) {
            str2 = kh.f;
        }
        return new Ah(u3, true, 1, hashMap, new Kh(gf, counterConfiguration, i8, str2));
    }
}
