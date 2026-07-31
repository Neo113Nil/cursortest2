package X5;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import k5.C0481k;
import l5.AbstractC0508l;
import m1.AbstractC0521b;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final A f2968a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2969b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2970c;

    /* renamed from: d, reason: collision with root package name */
    public final C0481k f2971d;

    public m(A a7, f fVar, List list, InterfaceC0732a interfaceC0732a) {
        this.f2968a = a7;
        this.f2969b = fVar;
        this.f2970c = list;
        this.f2971d = AbstractC0521b.x(new l(0, interfaceC0732a));
    }

    public final List a() {
        return (List) this.f2971d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f2968a == this.f2968a && kotlin.jvm.internal.i.a(mVar.f2969b, this.f2969b) && kotlin.jvm.internal.i.a(mVar.a(), a()) && kotlin.jvm.internal.i.a(mVar.f2970c, this.f2970c);
    }

    public final int hashCode() {
        return this.f2970c.hashCode() + ((a().hashCode() + ((this.f2969b.hashCode() + ((this.f2968a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a7 = a();
        ArrayList arrayList = new ArrayList(AbstractC0508l.C(a7, 10));
        for (Certificate certificate : a7) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2968a);
        sb.append(" cipherSuite=");
        sb.append(this.f2969b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2970c;
        ArrayList arrayList2 = new ArrayList(AbstractC0508l.C(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
