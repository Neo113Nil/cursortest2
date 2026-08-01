package z1;

import androidx.lifecycle.K;
import j1.InterfaceC0170a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final u f4682a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4683b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4684c;
    public final X0.f d;

    public i(u uVar, f fVar, List list, InterfaceC0170a interfaceC0170a) {
        this.f4682a = uVar;
        this.f4683b = fVar;
        this.f4684c = list;
        this.d = new X0.f(new K(interfaceC0170a));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f4682a == this.f4682a && k1.e.a(iVar.f4683b, this.f4683b) && k1.e.a(iVar.a(), a()) && k1.e.a(iVar.f4684c, this.f4684c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4684c.hashCode() + ((a().hashCode() + ((this.f4683b.hashCode() + ((this.f4682a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(Y0.l.z0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                k1.e.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f4682a);
        sb.append(" cipherSuite=");
        sb.append(this.f4683b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f4684c;
        ArrayList arrayList2 = new ArrayList(Y0.l.z0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                k1.e.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
