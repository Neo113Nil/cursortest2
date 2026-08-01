package s1;

import androidx.lifecycle.I;
import g1.InterfaceC0110a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final u f3637a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3638b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3639c;
    public final V0.d d;

    public i(u uVar, f fVar, List list, InterfaceC0110a interfaceC0110a) {
        this.f3637a = uVar;
        this.f3638b = fVar;
        this.f3639c = list;
        this.d = new V0.d(new I(interfaceC0110a));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f3637a == this.f3637a && h1.d.a(iVar.f3638b, this.f3638b) && h1.d.a(iVar.a(), a()) && h1.d.a(iVar.f3639c, this.f3639c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3639c.hashCode() + ((a().hashCode() + ((this.f3638b.hashCode() + ((this.f3637a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(W0.i.o0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                h1.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f3637a);
        sb.append(" cipherSuite=");
        sb.append(this.f3638b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f3639c;
        ArrayList arrayList2 = new ArrayList(W0.i.o0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                h1.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
