package io.appmetrica.analytics.impl;

import a1.RunnableC0177a;
import android.content.Context;
import f4.C0430g;
import g4.AbstractC0466k;
import g4.AbstractC0476u;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final Ib f6657a = new Ib(C0736j4.l().d());

    /* renamed from: b, reason: collision with root package name */
    public final Jb f6658b = new Jb();

    /* renamed from: c, reason: collision with root package name */
    public final Lb f6659c = new Lb();

    public final void a(String str, String str2, String str3) {
        Ib ib = this.f6657a;
        if (ib.f6944c.a((Void) null).f9268a && ib.f6945d.a(str).f9268a && ib.f6946e.a(str2).f9268a && ib.f6947f.a(str3).f9268a) {
            this.f6658b.getClass();
            ((G9) C0736j4.l().f8484c.a()).f6828b.post(new RunnableC0177a(this, str, str2, str3, 1));
            return;
        }
        PublicLogger.Companion.getAnonymousInstance().warning(B0.o.i("[AppMetricaLibraryAdapterProxy]", "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3), new Object[0]);
    }

    public static final void a(D0 d02, String str, String str2, String str3) {
        List list;
        Context a6;
        Lb lb = d02.f6659c;
        lb.getClass();
        if (str == null) {
            str = "null";
        }
        C0430g c0430g = new C0430g("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        C0430g c0430g2 = new C0430g("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        C0430g[] c0430gArr = {c0430g, c0430g2, new C0430g("payload", str3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0476u.W(3));
        AbstractC0476u.a0(linkedHashMap, c0430gArr);
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (lb) {
            try {
                if (lb.f7080a == null && (a6 = C0736j4.l().f8488g.a()) != null) {
                    lb.f7080a = AbstractC0466k.A0(new Wd(), new C0729in(a6), new Ko());
                }
                list = lb.f7080a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0990t) it.next()).a(linkedHashMap);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(linkedHashMap).build());
    }
}
