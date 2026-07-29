package org.apache.a.f.b;

import java.util.HashMap;

/* compiled from: BasicAuthCache.java */
/* loaded from: classes2.dex */
public class c implements org.apache.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<org.apache.a.m, org.apache.a.a.a> f9766a = new HashMap<>();

    @Override // org.apache.a.b.a
    public void a(org.apache.a.m mVar, org.apache.a.a.a aVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        this.f9766a.put(mVar, aVar);
    }

    @Override // org.apache.a.b.a
    public org.apache.a.a.a a(org.apache.a.m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        return this.f9766a.get(mVar);
    }

    @Override // org.apache.a.b.a
    public void b(org.apache.a.m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        this.f9766a.remove(mVar);
    }

    public String toString() {
        return this.f9766a.toString();
    }
}
