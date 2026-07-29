package org.apache.a.f.d;

/* compiled from: BasicSecureHandler.java */
/* loaded from: classes2.dex */
public class j extends a {
    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.l lVar, String str) throws org.apache.a.d.k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        lVar.a(true);
    }

    @Override // org.apache.a.f.d.a, org.apache.a.d.c
    public boolean b(org.apache.a.d.b bVar, org.apache.a.d.e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar != null) {
            return !bVar.f() || eVar.d();
        }
        throw new IllegalArgumentException("Cookie origin may not be null");
    }
}
