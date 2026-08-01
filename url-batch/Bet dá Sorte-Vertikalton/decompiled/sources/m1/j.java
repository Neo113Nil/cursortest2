package m1;

import a1.InterfaceC0058a;
import androidx.lifecycle.I;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final w f3205a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3206b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3207c;
    public final S0.c d;

    public j(w wVar, f fVar, List list, InterfaceC0058a interfaceC0058a) {
        this.f3205a = wVar;
        this.f3206b = fVar;
        this.f3207c = list;
        this.d = new S0.c(new I(interfaceC0058a));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.f3205a == this.f3205a && b1.d.a(jVar.f3206b, this.f3206b) && b1.d.a(jVar.a(), a()) && b1.d.a(jVar.f3207c, this.f3207c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3207c.hashCode() + ((a().hashCode() + ((this.f3206b.hashCode() + ((this.f3205a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(T0.j.l0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                b1.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f3205a);
        sb.append(" cipherSuite=");
        sb.append(this.f3206b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f3207c;
        ArrayList arrayList2 = new ArrayList(T0.j.l0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                b1.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
