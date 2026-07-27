package m3;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8361a = true;

    /* renamed from: b, reason: collision with root package name */
    public String[] f8362b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f8363c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8364d;

    public final h a() {
        return new h(this.f8361a, this.f8364d, this.f8362b, this.f8363c);
    }

    public final void b(String... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f8361a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f8362b = (String[]) cipherSuites.clone();
    }

    public final void c(f... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f8361a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (f fVar : cipherSuites) {
            arrayList.add(fVar.f8360a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void d(String... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f8361a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f8363c = (String[]) tlsVersions.clone();
    }

    public final void e(A... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f8361a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tlsVersions.length);
        for (A a4 : tlsVersions) {
            arrayList.add(a4.f8312d);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
