package org.apache.a.f.d;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbstractCookieSpec.java */
/* loaded from: classes2.dex */
public abstract class b implements org.apache.a.d.h {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, org.apache.a.d.c> f9859a = new HashMap(10);

    public void a(String str, org.apache.a.d.c cVar) {
        if (str == null) {
            throw new IllegalArgumentException("Attribute name may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Attribute handler may not be null");
        }
        this.f9859a.put(str, cVar);
    }

    protected org.apache.a.d.c a(String str) {
        return this.f9859a.get(str);
    }

    protected Collection<org.apache.a.d.c> c() {
        return this.f9859a.values();
    }
}
