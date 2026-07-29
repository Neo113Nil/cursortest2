package org.apache.a.f.b;

/* compiled from: DefaultConnectionKeepAliveStrategy.java */
/* loaded from: classes2.dex */
public class g implements org.apache.a.c.g {
    @Override // org.apache.a.c.g
    public long a(org.apache.a.r rVar, org.apache.a.j.e eVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        org.apache.a.h.d dVar = new org.apache.a.h.d(rVar.headerIterator("Keep-Alive"));
        while (dVar.hasNext()) {
            org.apache.a.e a2 = dVar.a();
            String a3 = a2.a();
            String b2 = a2.b();
            if (b2 != null && a3.equalsIgnoreCase("timeout")) {
                try {
                    return Long.parseLong(b2) * 1000;
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        return -1L;
    }
}
