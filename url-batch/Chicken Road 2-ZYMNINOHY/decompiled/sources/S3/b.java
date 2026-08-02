package S3;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2605a;

    public b(X509Certificate... caCerts) {
        i.e(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i4 = 0;
        while (i4 < length) {
            X509Certificate x509Certificate = caCerts[i4];
            i4++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            i.d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f2605a = linkedHashMap;
    }

    @Override // S3.d
    public final X509Certificate a(X509Certificate cert) {
        i.e(cert, "cert");
        Set set = (Set) this.f2605a.get(cert.getIssuerX500Principal());
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
                cert.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof b) && i.a(((b) obj).f2605a, this.f2605a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f2605a.hashCode();
    }
}
