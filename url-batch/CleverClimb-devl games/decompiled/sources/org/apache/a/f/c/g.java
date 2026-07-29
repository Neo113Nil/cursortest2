package org.apache.a.f.c;

import java.net.InetAddress;
import org.apache.a.p;

/* compiled from: DefaultHttpRoutePlanner.java */
/* loaded from: classes2.dex */
public class g implements org.apache.a.c.b.d {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.c.c.g f9834a;

    public g(org.apache.a.c.c.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("SchemeRegistry must not be null.");
        }
        this.f9834a = gVar;
    }

    @Override // org.apache.a.c.b.d
    public org.apache.a.c.b.b a(org.apache.a.m mVar, p pVar, org.apache.a.j.e eVar) throws org.apache.a.l {
        if (pVar == null) {
            throw new IllegalStateException("Request must not be null.");
        }
        org.apache.a.c.b.b b2 = org.apache.a.c.a.d.b(pVar.getParams());
        if (b2 != null) {
            return b2;
        }
        if (mVar == null) {
            throw new IllegalStateException("Target host must not be null.");
        }
        InetAddress c2 = org.apache.a.c.a.d.c(pVar.getParams());
        org.apache.a.m a2 = org.apache.a.c.a.d.a(pVar.getParams());
        try {
            boolean d2 = this.f9834a.a(mVar.c()).d();
            if (a2 == null) {
                return new org.apache.a.c.b.b(mVar, c2, d2);
            }
            return new org.apache.a.c.b.b(mVar, c2, a2, d2);
        } catch (IllegalStateException e) {
            throw new org.apache.a.l(e.getMessage());
        }
    }
}
