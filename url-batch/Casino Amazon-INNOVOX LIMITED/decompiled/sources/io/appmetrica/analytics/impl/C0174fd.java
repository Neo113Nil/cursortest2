package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0174fd implements Uj {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0586vl f1256a;
    public final String b;
    public final SystemTimeProvider c;
    public final List d;
    public final String e;
    public final long f;

    public C0174fd(InterfaceC0586vl interfaceC0586vl, String str, SystemTimeProvider systemTimeProvider, List<C0097cd> list) {
        this.f1256a = interfaceC0586vl;
        this.b = str;
        this.c = systemTimeProvider;
        this.d = list;
        this.e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f = TimeUnit.DAYS.toMillis(1L);
    }

    public final Tj a() {
        C0553ud c0553ud;
        C0097cd c0097cd;
        if (this.d.isEmpty()) {
            return null;
        }
        List sortedWith = CollectionsKt.sortedWith(this.d, new C0148ed());
        String c = ((AbstractC0678zd) this.f1256a).c(this.e, (String) null);
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject(c);
                JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                IntRange until = RangesKt.until(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(((IntIterator) it).nextInt());
                    try {
                        c0097cd = new C0097cd(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                    } catch (Throwable unused) {
                        c0097cd = new C0097cd("", false);
                    }
                    arrayList.add(c0097cd);
                }
                c0553ud = new C0553ud(arrayList, jSONObject.getLong("lastSendTime"));
            } catch (Throwable unused2) {
                c0553ud = new C0553ud(CollectionsKt.emptyList(), 0L);
            }
        } else {
            c0553ud = null;
        }
        long currentTimeMillis = this.c.currentTimeMillis();
        if (c0553ud != null && currentTimeMillis - c0553ud.b <= this.f && Intrinsics.areEqual(sortedWith, c0553ud.f1515a)) {
            return null;
        }
        C0553ud c0553ud2 = new C0553ud(sortedWith, currentTimeMillis);
        InterfaceC0586vl interfaceC0586vl = this.f1256a;
        AbstractC0678zd abstractC0678zd = (AbstractC0678zd) interfaceC0586vl;
        return new Tj(this.b + "_status", c0553ud2.a());
    }

    public /* synthetic */ C0174fd(InterfaceC0586vl interfaceC0586vl, String str, SystemTimeProvider systemTimeProvider, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0586vl, str, (i & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
