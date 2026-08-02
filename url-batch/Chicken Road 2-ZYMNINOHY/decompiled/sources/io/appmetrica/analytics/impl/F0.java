package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import android.content.Context;
import c3.C0292d;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bb f10266a = new Bb(C0501b4.l().d());

    /* renamed from: b, reason: collision with root package name */
    public final Cb f10267b = new Cb();

    /* renamed from: c, reason: collision with root package name */
    public final Eb f10268c = new Eb();

    public final void a(String str, String str2, String str3) {
        Bb bb = this.f10266a;
        if (bb.f10097c.a((Void) null).f12630a && bb.f10098d.a(str).f12630a && bb.f10099e.a(str2).f12630a && bb.f10100f.a(str3).f12630a) {
            this.f10267b.getClass();
            ((C1127z9) C0501b4.l().f11457c.a()).f13097b.post(new Ko(this, str, str2, str3, 0));
            return;
        }
        PublicLogger.Companion.getAnonymousInstance().warning(AbstractC0005f.n("[AppMetricaLibraryAdapterProxy]", "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3), new Object[0]);
    }

    public static final void a(F0 f02, String str, String str2, String str3) {
        List list;
        Context a3;
        Eb eb = f02.f10268c;
        eb.getClass();
        if (str == null) {
            str = "null";
        }
        C0292d c0292d = new C0292d("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        C0292d c0292d2 = new C0292d("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        C0292d[] c0292dArr = {c0292d, c0292d2, new C0292d("payload", str3)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(d3.u.z(3));
        d3.t.D(linkedHashMap, c0292dArr);
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (eb) {
            try {
                if (eb.f10247a == null && (a3 = C0501b4.l().f11461g.a()) != null) {
                    eb.f10247a = d3.j.W(new Pd(), new C0623fn(a3), new Jo());
                }
                list = eb.f10247a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0961t) it.next()).a(linkedHashMap);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(linkedHashMap).build());
    }
}
