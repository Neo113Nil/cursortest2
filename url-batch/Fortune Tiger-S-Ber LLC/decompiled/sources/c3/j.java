package c3;

import androidx.lifecycle.h0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final y f1065a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1066b;
    public final List c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.b f1067d;

    public j(y yVar, f fVar, List list, t2.a aVar) {
        this.f1065a = yVar;
        this.f1066b = fVar;
        this.c = list;
        this.f1067d = new m2.b(new h0(aVar));
    }

    public final List a() {
        return (List) this.f1067d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f1065a == this.f1065a && u2.c.a(jVar.f1066b, this.f1066b) && u2.c.a(jVar.a(), a()) && u2.c.a(jVar.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.f1066b.hashCode() + ((this.f1065a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a4 = a();
        ArrayList arrayList = new ArrayList(n2.i.E(a4));
        for (Certificate certificate : a4) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                u2.c.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f1065a);
        sb.append(" cipherSuite=");
        sb.append(this.f1066b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(n2.i.E(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                u2.c.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
