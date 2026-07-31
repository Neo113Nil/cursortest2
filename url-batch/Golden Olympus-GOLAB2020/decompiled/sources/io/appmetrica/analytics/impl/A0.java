package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes3.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final Wb f37145a = new Wb(C3082x4.l().d());

    /* renamed from: b, reason: collision with root package name */
    public final Xb f37146b = new Xb();

    /* renamed from: c, reason: collision with root package name */
    public final Zb f37147c = new Zb();

    public final void a(final String str, final String str2, final String str3) {
        Wb wb = this.f37145a;
        if (wb.f38464c.a((Void) null).f39527a && wb.f38465d.a(str).f39527a && wb.f38466e.a(str2).f39527a && wb.f38467f.a(str3).f39527a) {
            this.f37146b.getClass();
            ((U9) C3082x4.l().f40118c.a()).f38354b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.Go
                @Override // java.lang.Runnable
                public final void run() {
                    A0.a(A0.this, str, str2, str3);
                }
            });
            return;
        }
        String str4 = "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3;
        PublicLogger.Companion.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]" + str4, new Object[0]);
    }

    public static final void a(A0 a02, String str, String str2, String str3) {
        List list;
        Context a4;
        Zb zb = a02.f37147c;
        zb.getClass();
        if (str == null) {
            str = "null";
        }
        Pair pair = TuplesKt.to("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pair2 = TuplesKt.to("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(pair, pair2, TuplesKt.to("payload", str3));
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (zb) {
            try {
                if (zb.f38613a == null && (a4 = C3082x4.l().f40122g.a()) != null) {
                    zb.f38613a = CollectionsKt.listOf((Object[]) new InterfaceC2947s[]{new C2598ee(), new C2607en(a4), new Fo()});
                }
                list = zb.f38613a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC2947s) it.next()).a(mutableMapOf);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(mutableMapOf).build());
    }
}
