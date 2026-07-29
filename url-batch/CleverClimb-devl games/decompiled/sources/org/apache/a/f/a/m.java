package org.apache.a.f.a;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.a.h.u;

/* compiled from: RFC2617Scheme.java */
/* loaded from: classes2.dex */
public abstract class m extends a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f9759a;

    @Override // org.apache.a.f.a.a
    protected void a(org.apache.a.k.b bVar, int i, int i2) throws org.apache.a.a.j {
        org.apache.a.e[] a2 = org.apache.a.h.f.f9944a.a(bVar, new u(i, bVar.c()));
        if (a2.length == 0) {
            throw new org.apache.a.a.j("Authentication challenge is empty");
        }
        this.f9759a = new HashMap(a2.length);
        for (org.apache.a.e eVar : a2) {
            this.f9759a.put(eVar.a(), eVar.b());
        }
    }

    protected Map<String, String> g() {
        if (this.f9759a == null) {
            this.f9759a = new HashMap();
        }
        return this.f9759a;
    }

    public String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Parameter name may not be null");
        }
        if (this.f9759a == null) {
            return null;
        }
        return this.f9759a.get(str.toLowerCase(Locale.ENGLISH));
    }

    @Override // org.apache.a.a.a
    public String b() {
        return a("realm");
    }
}
