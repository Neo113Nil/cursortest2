package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import android.content.Context;
import b2.C0190d;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final Ib f5873a = new Ib(C0585j4.l().d());

    /* renamed from: b, reason: collision with root package name */
    public final Jb f5874b = new Jb();

    /* renamed from: c, reason: collision with root package name */
    public final Lb f5875c = new Lb();

    public final void a(String str, String str2, String str3) {
        Ib ib = this.f5873a;
        if (ib.f6145c.a((Void) null).f8327a && ib.f6146d.a(str).f8327a && ib.f6147e.a(str2).f8327a && ib.f.a(str3).f8327a) {
            this.f5874b.getClass();
            ((G9) C0585j4.l().f7594c.a()).f6035b.post(new Y1.X(this, str, str2, str3, 4));
            return;
        }
        PublicLogger.Companion.getAnonymousInstance().warning(AbstractC0033i.j("[AppMetricaLibraryAdapterProxy]", "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3), new Object[0]);
    }

    public static final void a(D0 d02, String str, String str2, String str3) {
        List list;
        Context a3;
        Lb lb = d02.f5875c;
        lb.getClass();
        if (str == null) {
            str = "null";
        }
        C0190d c0190d = new C0190d("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        C0190d c0190d2 = new C0190d("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        C0190d[] c0190dArr = {c0190d, c0190d2, new C0190d("payload", str3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2.q.Z(3));
        c2.p.d0(linkedHashMap, c0190dArr);
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (lb) {
            try {
                if (lb.f6274a == null && (a3 = C0585j4.l().f7597g.a()) != null) {
                    lb.f6274a = c2.f.L(new Wd(), new C0578in(a3), new Ko());
                }
                list = lb.f6274a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0839t) it.next()).a(linkedHashMap);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(linkedHashMap).build());
    }
}
