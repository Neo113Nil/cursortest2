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

/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058wi {

    /* renamed from: a, reason: collision with root package name */
    public final F4 f12944a;

    /* renamed from: b, reason: collision with root package name */
    public final Sn f12945b;

    /* renamed from: c, reason: collision with root package name */
    public final C1110yi f12946c;

    /* renamed from: d, reason: collision with root package name */
    public final C0859p0 f12947d;

    /* renamed from: e, reason: collision with root package name */
    public Pl f12948e;

    /* renamed from: f, reason: collision with root package name */
    public final Yj f12949f;

    public C1058wi(C0859p0 c0859p0, Sn sn, F4 f4, Yj yj) {
        this(c0859p0, sn, f4, yj, new C1110yi(c0859p0, yj));
    }

    public final void a(C1031vh c1031vh) {
        Fh fh = c1031vh.f12897e;
        Pl pl = this.f12948e;
        if (pl != null) {
            fh.f10356b.setUuid(((Ol) pl).g());
        } else {
            fh.getClass();
        }
        this.f12946c.a(c1031vh);
    }

    public final void b(String str) {
        Bf bf = this.f12944a.f10355a;
        synchronized (bf) {
            bf.f10112a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public C1058wi(C0859p0 c0859p0, Sn sn, F4 f4, Yj yj, C1110yi c1110yi) {
        this.f12947d = c0859p0;
        this.f12944a = f4;
        this.f12945b = sn;
        this.f12949f = yj;
        this.f12946c = c1110yi;
    }

    public final void a(Ol ol) {
        this.f12948e = ol;
        this.f12944a.f10356b.setUuid(ol.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (AbstractC0779lo.a(bool)) {
            this.f12944a.f10356b.setLocationTracking(bool.booleanValue());
        }
        if (AbstractC0779lo.a(bool2)) {
            this.f12944a.f10356b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (AbstractC0779lo.a(bool3)) {
            this.f12944a.f10356b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        P5 a3 = P5.a();
        F4 f4 = this.f12944a;
        a(a(a3, f4), f4, 1, (Map) null);
    }

    public final void a(P5 p5, Fh fh, int i4, Map map) {
        String str;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        this.f12947d.b();
        if (!AbstractC0779lo.a(map)) {
            p5.setValue(AbstractC0637gb.b(map));
            a(p5, fh);
        }
        Bf bf = new Bf(fh.f10355a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f10356b);
        D8 d8 = fh.f10281c;
        synchronized (fh) {
            str = fh.f10284f;
        }
        a(new C1031vh(p5, false, i4, null, new Fh(bf, counterConfiguration, d8, str)));
    }

    public static P5 a(P5 p5, Fh fh) {
        if (AbstractC1049w9.f12924a.contains(Integer.valueOf(p5.f10797d))) {
            p5.f10796c = fh.d();
        }
        return p5;
    }

    public final void a(List list) {
        Bf bf = this.f12944a.f10355a;
        synchronized (bf) {
            bf.f10112a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC0779lo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Bf bf = this.f12944a.f10355a;
        synchronized (bf) {
            bf.f10112a.put("PROCESS_CFG_CLIDS", AbstractC0637gb.b(hashMap));
        }
    }

    public final void a(String str) {
        Bf bf = this.f12944a.f10355a;
        synchronized (bf) {
            bf.f10112a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final C1031vh a(Qn qn, Fh fh) {
        String str;
        String str2;
        this.f12947d.b();
        Sn sn = this.f12945b;
        sn.getClass();
        Gn gn = qn.f10850a;
        if (gn == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(gn.f10341a, "");
        }
        byte[] fromModel = sn.f10962a.fromModel(qn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(fh.f10356b.getApiKey());
        Set set = AbstractC1049w9.f12924a;
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        M3 m32 = new M3(fromModel, str, 5891, orCreatePublicLogger);
        m32.f10796c = fh.d();
        HashMap hashMap = m32.f10622q;
        Bf bf = new Bf(fh.f10355a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f10356b);
        D8 d8 = fh.f10281c;
        synchronized (fh) {
            str2 = fh.f10284f;
        }
        return new C1031vh(m32, true, 1, hashMap, new Fh(bf, counterConfiguration, d8, str2));
    }
}
