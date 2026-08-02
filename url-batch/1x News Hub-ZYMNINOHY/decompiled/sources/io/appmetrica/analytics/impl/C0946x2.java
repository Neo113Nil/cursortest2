package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946x2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0390bf f8606a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8607b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8608c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f8609d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f8610e;

    public C0946x2(X4 x4, C0390bf c0390bf) {
        this.f8606a = c0390bf;
        x4.b();
        this.f8607b = TimeUnit.MINUTES.toMillis(1L);
        this.f8608c = TimeUnit.DAYS.toMillis(7L);
        this.f8609d = new SystemTimeProvider();
        Map<String, Long> f = c0390bf.f();
        a(f);
        this.f8610e = f;
    }

    public final void a(Map map) {
        long currentTimeMillis = this.f8609d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < currentTimeMillis - this.f8608c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
