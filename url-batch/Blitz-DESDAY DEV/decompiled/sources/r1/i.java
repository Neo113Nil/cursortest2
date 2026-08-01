package r1;

import androidx.lifecycle.I;
import f1.InterfaceC0099a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final u f3485a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3486b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3487c;
    public final W0.d d;

    public i(u uVar, f fVar, List list, InterfaceC0099a interfaceC0099a) {
        this.f3485a = uVar;
        this.f3486b = fVar;
        this.f3487c = list;
        this.d = new W0.d(new I(interfaceC0099a));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f3485a == this.f3485a && g1.d.a(iVar.f3486b, this.f3486b) && g1.d.a(iVar.a(), a()) && g1.d.a(iVar.f3487c, this.f3487c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3487c.hashCode() + ((a().hashCode() + ((this.f3486b.hashCode() + ((this.f3485a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(X0.l.z0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                g1.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f3485a);
        sb.append(" cipherSuite=");
        sb.append(this.f3486b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f3487c;
        ArrayList arrayList2 = new ArrayList(X0.l.z0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                g1.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
