package org.apache.a.f.b;

import java.net.URI;
import org.apache.a.z;

/* compiled from: DefaultRedirectStrategyAdaptor.java */
@Deprecated
/* loaded from: classes2.dex */
class l implements org.apache.a.b.l {

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.b.k f9776a;

    @Deprecated
    public l(org.apache.a.b.k kVar) {
        this.f9776a = kVar;
    }

    @Override // org.apache.a.b.l
    public boolean a(org.apache.a.p pVar, org.apache.a.r rVar, org.apache.a.j.e eVar) throws z {
        return this.f9776a.b(rVar, eVar);
    }

    @Override // org.apache.a.b.l
    public org.apache.a.b.b.k b(org.apache.a.p pVar, org.apache.a.r rVar, org.apache.a.j.e eVar) throws z {
        URI a2 = this.f9776a.a(rVar, eVar);
        if (pVar.getRequestLine().a().equalsIgnoreCase("HEAD")) {
            return new org.apache.a.b.b.e(a2);
        }
        return new org.apache.a.b.b.d(a2);
    }
}
