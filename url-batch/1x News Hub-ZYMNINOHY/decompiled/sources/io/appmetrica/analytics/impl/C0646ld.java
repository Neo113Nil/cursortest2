package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646ld implements Yj {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0990yl f7821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7822b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f7823c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7824d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7825e;
    public final long f;

    public C0646ld(InterfaceC0990yl interfaceC0990yl, String str, SystemTimeProvider systemTimeProvider, List<C0569id> list) {
        this.f7821a = interfaceC0990yl;
        this.f7822b = str;
        this.f7823c = systemTimeProvider;
        this.f7824d = list;
        this.f7825e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f = TimeUnit.DAYS.toMillis(1L);
    }

    public final Xj a() {
        List asList;
        Ad ad;
        C0569id c0569id;
        if (!this.f7824d.isEmpty()) {
            List list = this.f7824d;
            C0620kd c0620kd = new C0620kd();
            kotlin.jvm.internal.j.e(list, "<this>");
            if (list.size() <= 1) {
                asList = c2.e.Y(list);
            } else {
                Object[] array = list.toArray(new Object[0]);
                kotlin.jvm.internal.j.e(array, "<this>");
                if (array.length > 1) {
                    Arrays.sort(array, c0620kd);
                }
                asList = Arrays.asList(array);
                kotlin.jvm.internal.j.d(asList, "asList(...)");
            }
            String c3 = ((Fd) this.f7821a).c(this.f7825e, (String) null);
            if (c3 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(c3);
                    JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                    p2.c G2 = AbstractC0129a.G(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(c2.g.N(G2));
                    Iterator it = G2.iterator();
                    while (((p2.b) it).f10223c) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(((p2.b) it).a());
                        try {
                            c0569id = new C0569id(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                        } catch (Throwable unused) {
                            c0569id = new C0569id("", false);
                        }
                        arrayList.add(c0569id);
                    }
                    ad = new Ad(arrayList, jSONObject.getLong("lastSendTime"));
                } catch (Throwable unused2) {
                    ad = new Ad(c2.m.f2637a, 0L);
                }
            } else {
                ad = null;
            }
            long currentTimeMillis = this.f7823c.currentTimeMillis();
            if (ad == null || currentTimeMillis - ad.f5752b > this.f || !asList.equals(ad.f5751a)) {
                Ad ad2 = new Ad(asList, currentTimeMillis);
                InterfaceC0990yl interfaceC0990yl = this.f7821a;
                Fd fd = (Fd) interfaceC0990yl;
                return new Xj(AbstractC0033i.m(new StringBuilder(), this.f7822b, "_status"), ad2.a());
            }
        }
        return null;
    }

    public /* synthetic */ C0646ld(InterfaceC0990yl interfaceC0990yl, String str, SystemTimeProvider systemTimeProvider, List list, int i3, kotlin.jvm.internal.f fVar) {
        this(interfaceC0990yl, str, (i3 & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
