package b;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: CertificatePinner.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2082a = new a().a();

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f2083b;

    /* renamed from: c, reason: collision with root package name */
    private final b.a.i.b f2084c;

    g(Set<b> set, b.a.i.b bVar) {
        this.f2083b = set;
        this.f2084c = bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (b.a.c.a(this.f2084c, gVar.f2084c) && this.f2083b.equals(gVar.f2083b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2084c != null ? this.f2084c.hashCode() : 0) * 31) + this.f2083b.hashCode();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> a2 = a(str);
        if (a2.isEmpty()) {
            return;
        }
        if (this.f2084c != null) {
            list = this.f2084c.a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = a2.size();
            c.f fVar = null;
            c.f fVar2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = a2.get(i2);
                if (bVar.f2088c.equals("sha256/")) {
                    if (fVar == null) {
                        fVar = b(x509Certificate);
                    }
                    if (bVar.f2089d.equals(fVar)) {
                        return;
                    }
                } else if (bVar.f2088c.equals("sha1/")) {
                    if (fVar2 == null) {
                        fVar2 = a(x509Certificate);
                    }
                    if (bVar.f2089d.equals(fVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = a2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            b bVar2 = a2.get(i4);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    List<b> a(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b bVar : this.f2083b) {
            if (bVar.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    g a(b.a.i.b bVar) {
        return b.a.c.a(this.f2084c, bVar) ? this : new g(this.f2083b, bVar);
    }

    public static String a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + b((X509Certificate) certificate).b();
    }

    static c.f a(X509Certificate x509Certificate) {
        return c.f.a(x509Certificate.getPublicKey().getEncoded()).c();
    }

    static c.f b(X509Certificate x509Certificate) {
        return c.f.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    /* compiled from: CertificatePinner.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final String f2086a;

        /* renamed from: b, reason: collision with root package name */
        final String f2087b;

        /* renamed from: c, reason: collision with root package name */
        final String f2088c;

        /* renamed from: d, reason: collision with root package name */
        final c.f f2089d;

        boolean a(String str) {
            if (this.f2086a.startsWith("*.")) {
                return str.regionMatches(false, str.indexOf(46) + 1, this.f2087b, 0, this.f2087b.length());
            }
            return str.equals(this.f2087b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f2086a.equals(bVar.f2086a) && this.f2088c.equals(bVar.f2088c) && this.f2089d.equals(bVar.f2089d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f2086a.hashCode()) * 31) + this.f2088c.hashCode()) * 31) + this.f2089d.hashCode();
        }

        public String toString() {
            return this.f2088c + this.f2089d.b();
        }
    }

    /* compiled from: CertificatePinner.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<b> f2085a = new ArrayList();

        public g a() {
            return new g(new LinkedHashSet(this.f2085a), null);
        }
    }
}
