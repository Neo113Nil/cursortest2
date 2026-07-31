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

/* loaded from: classes3.dex */
public final class Ji {

    /* renamed from: a, reason: collision with root package name */
    public final C2482a5 f37839a;

    /* renamed from: b, reason: collision with root package name */
    public final Pn f37840b;

    /* renamed from: c, reason: collision with root package name */
    public final Li f37841c;

    /* renamed from: d, reason: collision with root package name */
    public final C2793m0 f37842d;

    /* renamed from: e, reason: collision with root package name */
    public Pl f37843e;

    /* renamed from: f, reason: collision with root package name */
    public final C2709ik f37844f;

    public Ji(C2793m0 c2793m0, Pn pn, C2482a5 c2482a5, C2709ik c2709ik) {
        this(c2793m0, pn, c2482a5, c2709ik, new Li(c2793m0, c2709ik));
    }

    public final void a(Ih ih) {
        Sh sh = ih.f37767e;
        Pl pl = this.f37843e;
        if (pl != null) {
            sh.f38818b.setUuid(((Ol) pl).g());
        } else {
            sh.getClass();
        }
        this.f37841c.a(ih);
    }

    public final void b(String str) {
        Pf pf = this.f37839a.f38817a;
        synchronized (pf) {
            pf.f38132a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Ji(C2793m0 c2793m0, Pn pn, C2482a5 c2482a5, C2709ik c2709ik, Li li) {
        this.f37842d = c2793m0;
        this.f37839a = c2482a5;
        this.f37840b = pn;
        this.f37844f = c2709ik;
        this.f37841c = li;
    }

    public final void a(Ol ol) {
        this.f37843e = ol;
        this.f37839a.f38818b.setUuid(ol.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (AbstractC2713io.a(bool)) {
            this.f37839a.f38818b.setLocationTracking(bool.booleanValue());
        }
        if (AbstractC2713io.a(bool2)) {
            this.f37839a.f38818b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (AbstractC2713io.a(bool3)) {
            this.f37839a.f38818b.setAdvIdentifiersTracking(bool3.booleanValue());
        }
        C2773l6 a4 = C2773l6.a();
        C2482a5 c2482a5 = this.f37839a;
        a(a(a4, c2482a5), c2482a5, 1, null);
    }

    public final void a(C2773l6 c2773l6, Sh sh, int i4, Map map) {
        String str;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        this.f37842d.b();
        if (!AbstractC2713io.a(map)) {
            c2773l6.setValue(Bb.b(map));
            a(c2773l6, sh);
        }
        Pf pf = new Pf(sh.f38817a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.f38818b);
        W8 w8 = sh.f38256c;
        synchronized (sh) {
            str = sh.f38259f;
        }
        a(new Ih(c2773l6, false, i4, null, new Sh(pf, counterConfiguration, w8, str)));
    }

    public static C2773l6 a(C2773l6 c2773l6, Sh sh) {
        if (R9.f38186a.contains(Integer.valueOf(c2773l6.f39379d))) {
            c2773l6.f39378c = sh.d();
        }
        return c2773l6;
    }

    public final void a(List list) {
        Pf pf = this.f37839a.f38817a;
        synchronized (pf) {
            pf.f38132a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC2713io.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Pf pf = this.f37839a.f38817a;
        synchronized (pf) {
            pf.f38132a.put("PROCESS_CFG_CLIDS", Bb.b(hashMap));
        }
    }

    public final void a(String str) {
        Pf pf = this.f37839a.f38817a;
        synchronized (pf) {
            pf.f38132a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final Ih a(Nn nn, Sh sh) {
        String str;
        String str2;
        this.f37842d.b();
        Pn pn = this.f37840b;
        pn.getClass();
        Dn dn = nn.f38034a;
        if (dn == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(dn.f37384a, "");
        }
        byte[] fromModel = pn.f38144a.fromModel(nn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(sh.f38818b.getApiKey());
        Set set = R9.f38186a;
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        C2694i4 c2694i4 = new C2694i4(fromModel, str, 5891, orCreatePublicLogger);
        c2694i4.f39378c = sh.d();
        HashMap hashMap = c2694i4.f39171q;
        Pf pf = new Pf(sh.f38817a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(sh.f38818b);
        W8 w8 = sh.f38256c;
        synchronized (sh) {
            str2 = sh.f38259f;
        }
        return new Ih(c2694i4, true, 1, hashMap, new Sh(pf, counterConfiguration, w8, str2));
    }
}
