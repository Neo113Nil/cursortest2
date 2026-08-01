package u1;

import X0.f;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4234a;

    public b(X509Certificate... x509CertificateArr) {
        f.e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            f.d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f4234a = linkedHashMap;
    }

    @Override // u1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        Set set = (Set) this.f4234a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && f.a(((b) obj).f4234a, this.f4234a));
    }

    public final int hashCode() {
        return this.f4234a.hashCode();
    }
}
