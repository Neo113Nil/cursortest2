package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.core.app.NotificationCompat;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Cb f836a = new Cb(C0088c4.l().d());
    public final Db b = new Db();
    public final Fb c = new Fb();

    public final void a(final String str, final String str2, final String str3) {
        Cb cb = this.f836a;
        if (!cb.c.a((Void) null).f1473a || !cb.d.a(str).f1473a || !cb.e.a(str2).f1473a || !cb.f.a(str3).f1473a) {
            PublicLogger.INSTANCE.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]" + ("Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3), new Object[0]);
        } else {
            this.b.getClass();
            ((A9) C0088c4.l().c.a()).b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.F0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    F0.a(F0.this, str, str2, str3);
                }
            });
        }
    }

    public static final void a(F0 f0, String str, String str2, String str3) {
        List list;
        Context a2;
        Fb fb = f0.c;
        fb.getClass();
        Pair[] pairArr = new Pair[3];
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        pairArr[0] = TuplesKt.to("sender", str);
        if (str2 == null) {
            str2 = AbstractJsonLexerKt.NULL;
        }
        pairArr[1] = TuplesKt.to(NotificationCompat.CATEGORY_EVENT, str2);
        if (str3 == null) {
            str3 = AbstractJsonLexerKt.NULL;
        }
        pairArr[2] = TuplesKt.to("payload", str3);
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (fb) {
            if (fb.f843a == null && (a2 = C0088c4.l().g.a()) != null) {
                fb.f843a = CollectionsKt.listOf((Object[]) new InterfaceC0514t[]{new Qd(), new C0210gn(a2), new Ko()});
            }
            list = fb.f843a;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0514t) it.next()).a(mutableMapOf);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(mutableMapOf).build());
    }
}
