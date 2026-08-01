package z1;

import androidx.lifecycle.K;
import i1.InterfaceC0181a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final x f4863a;

    /* renamed from: b, reason: collision with root package name */
    public final h f4864b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4865c;

    /* renamed from: d, reason: collision with root package name */
    public final W0.g f4866d;

    public l(x xVar, h hVar, List list, InterfaceC0181a interfaceC0181a) {
        this.f4863a = xVar;
        this.f4864b = hVar;
        this.f4865c = list;
        this.f4866d = new W0.g(new K(interfaceC0181a));
    }

    public final List a() {
        return (List) this.f4866d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.f4863a == this.f4863a && j1.h.a(lVar.f4864b, this.f4864b) && j1.h.a(lVar.a(), a()) && j1.h.a(lVar.f4865c, this.f4865c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4865c.hashCode() + ((a().hashCode() + ((this.f4864b.hashCode() + ((this.f4863a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(X0.m.m0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                j1.h.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f4863a);
        sb.append(" cipherSuite=");
        sb.append(this.f4864b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f4865c;
        ArrayList arrayList2 = new ArrayList(X0.m.m0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                j1.h.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
