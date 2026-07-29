package org.apache.a.f.b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: BasicCredentialsProvider.java */
/* loaded from: classes2.dex */
public class e implements org.apache.a.b.f {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<org.apache.a.a.d, org.apache.a.a.h> f9768a = new ConcurrentHashMap<>();

    private static org.apache.a.a.h a(Map<org.apache.a.a.d, org.apache.a.a.h> map, org.apache.a.a.d dVar) {
        org.apache.a.a.h hVar = map.get(dVar);
        if (hVar != null) {
            return hVar;
        }
        int i = -1;
        org.apache.a.a.d dVar2 = null;
        for (org.apache.a.a.d dVar3 : map.keySet()) {
            int a2 = dVar.a(dVar3);
            if (a2 > i) {
                dVar2 = dVar3;
                i = a2;
            }
        }
        return dVar2 != null ? map.get(dVar2) : hVar;
    }

    @Override // org.apache.a.b.f
    public org.apache.a.a.h a(org.apache.a.a.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Authentication scope may not be null");
        }
        return a(this.f9768a, dVar);
    }

    public String toString() {
        return this.f9768a.toString();
    }
}
