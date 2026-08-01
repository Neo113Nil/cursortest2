package i1;

import androidx.lifecycle.K;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final B f2702a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2703b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2704c;

    /* renamed from: d, reason: collision with root package name */
    public final N0.e f2705d;

    public l(B b2, h hVar, List list, W0.a aVar) {
        this.f2702a = b2;
        this.f2703b = hVar;
        this.f2704c = list;
        this.f2705d = new N0.e(new K(aVar));
    }

    public final List a() {
        return (List) this.f2705d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.f2702a == this.f2702a && X0.f.a(lVar.f2703b, this.f2703b) && X0.f.a(lVar.a(), a()) && X0.f.a(lVar.f2704c, this.f2704c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2704c.hashCode() + ((a().hashCode() + ((this.f2703b.hashCode() + ((this.f2702a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(O0.j.c0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                X0.f.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2702a);
        sb.append(" cipherSuite=");
        sb.append(this.f2703b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2704c;
        ArrayList arrayList2 = new ArrayList(O0.j.c0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                X0.f.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
