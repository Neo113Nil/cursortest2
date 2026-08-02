package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861p2 {

    /* renamed from: a, reason: collision with root package name */
    public final We f12553a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12554b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12555c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f12556d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f12557e;

    public C0861p2(Q4 q4, We we) {
        this.f12553a = we;
        q4.b();
        this.f12554b = TimeUnit.MINUTES.toMillis(1L);
        this.f12555c = TimeUnit.DAYS.toMillis(7L);
        this.f12556d = new SystemTimeProvider();
        Map<String, Long> f4 = we.f();
        a(f4);
        this.f12557e = f4;
    }

    public final void a(Map map) {
        long currentTimeMillis = this.f12556d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < currentTimeMillis - this.f12555c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
