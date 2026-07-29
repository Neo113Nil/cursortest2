package org.apache.a.f.a;

import com.moat.analytics.mobile.cha.BuildConfig;
import org.apache.a.p;
import org.apache.commons.codec.binary.Base64;

/* compiled from: BasicScheme.java */
/* loaded from: classes2.dex */
public class b extends m {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9715a = false;

    @Override // org.apache.a.a.a
    public String a() {
        return BuildConfig.FLAVOR;
    }

    @Override // org.apache.a.a.a
    public boolean c() {
        return false;
    }

    @Override // org.apache.a.f.a.a, org.apache.a.a.a
    public void a(org.apache.a.d dVar) throws org.apache.a.a.j {
        super.a(dVar);
        this.f9715a = true;
    }

    @Override // org.apache.a.a.a
    public boolean d() {
        return this.f9715a;
    }

    @Override // org.apache.a.a.a
    public org.apache.a.d a(org.apache.a.a.h hVar, p pVar) throws org.apache.a.a.f {
        if (hVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        return a(hVar, org.apache.a.a.a.a.a(pVar.getParams()), e());
    }

    public static org.apache.a.d a(org.apache.a.a.h hVar, String str, boolean z) {
        if (hVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("charset may not be null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hVar.a().getName());
        sb.append(":");
        sb.append(hVar.b() == null ? "null" : hVar.b());
        byte[] encodeBase64 = Base64.encodeBase64(org.apache.a.k.c.a(sb.toString(), str));
        org.apache.a.k.b bVar = new org.apache.a.k.b(32);
        if (z) {
            bVar.a("Proxy-Authorization");
        } else {
            bVar.a("Authorization");
        }
        bVar.a(": Basic ");
        bVar.a(encodeBase64, 0, encodeBase64.length);
        return new org.apache.a.h.p(bVar);
    }
}
