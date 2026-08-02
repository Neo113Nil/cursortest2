package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class BasicCertificateChainCleaner extends UnsignedKt {
    public final BasicTrustRootIndex trustRootIndex;

    public BasicCertificateChainCleaner(BasicTrustRootIndex basicTrustRootIndex) {
        basicTrustRootIndex.getClass();
        this.trustRootIndex = basicTrustRootIndex;
    }

    public static boolean verifySignature(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!Intrinsics.areEqual(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.UnsignedKt
    public final List clean(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        removeFirst.getClass();
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            BasicTrustRootIndex basicTrustRootIndex = this.trustRootIndex;
            basicTrustRootIndex.getClass();
            Set set = (Set) basicTrustRootIndex.subjectToCaCerts.get(x509Certificate.getIssuerX500Principal());
            X509Certificate x509Certificate2 = null;
            if (set != null) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    try {
                        x509Certificate.verify(((X509Certificate) next).getPublicKey());
                        x509Certificate2 = next;
                        break;
                    } catch (Exception unused) {
                    }
                }
                x509Certificate2 = x509Certificate2;
            }
            if (x509Certificate2 == null) {
                Iterator it2 = arrayDeque.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    next2.getClass();
                    X509Certificate x509Certificate3 = (X509Certificate) next2;
                    if (verifySignature(x509Certificate, x509Certificate3, arrayList.size() - 1)) {
                        it2.remove();
                        arrayList.add(x509Certificate3);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509Certificate2)) {
                arrayList.add(x509Certificate2);
            }
            if (verifySignature(x509Certificate2, x509Certificate2, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BasicCertificateChainCleaner) && Intrinsics.areEqual(((BasicCertificateChainCleaner) obj).trustRootIndex, this.trustRootIndex);
    }

    public final int hashCode() {
        return this.trustRootIndex.hashCode();
    }
}
