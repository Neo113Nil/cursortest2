package T4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2876a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2877b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2878c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f2879d;

    public i a() {
        return new i(this.f2876a, this.f2877b, (String[]) this.f2878c, (String[]) this.f2879d);
    }

    public void b(f... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f2876a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (f fVar : cipherSuites) {
            arrayList.add(fVar.f2866a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f2876a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] copyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        this.f2878c = (String[]) copyOf;
    }

    public void d(D... dArr) {
        if (!this.f2876a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (D d6 : dArr) {
            arrayList.add(d6.f2815a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... tlsVersions) {
        kotlin.jvm.internal.i.e(tlsVersions, "tlsVersions");
        if (!this.f2876a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] copyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        this.f2879d = (String[]) copyOf;
    }
}
