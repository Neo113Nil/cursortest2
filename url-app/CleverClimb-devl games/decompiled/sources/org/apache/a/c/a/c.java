package org.apache.a.c.a;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ConnPerRouteBean.java */
/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<org.apache.a.c.b.b, Integer> f9661a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f9662b;

    public c(int i) {
        this.f9661a = new ConcurrentHashMap<>();
        a(i);
    }

    public c() {
        this(2);
    }

    public void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("The maximum must be greater than 0.");
        }
        this.f9662b = i;
    }

    @Override // org.apache.a.c.a.b
    public int a(org.apache.a.c.b.b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("HTTP route may not be null.");
        }
        Integer num = this.f9661a.get(bVar);
        if (num != null) {
            return num.intValue();
        }
        return this.f9662b;
    }

    public String toString() {
        return this.f9661a.toString();
    }
}
