package X5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2936a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2937b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2938c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f2939d;

    public i a() {
        return new i(this.f2936a, this.f2937b, (String[]) this.f2938c, (String[]) this.f2939d);
    }

    public void b(f... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f2936a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (f fVar : cipherSuites) {
            arrayList.add(fVar.f2927a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f2936a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] copyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        this.f2938c = (String[]) copyOf;
    }

    public void d(A... aArr) {
        if (!this.f2936a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(aArr.length);
        for (A a7 : aArr) {
            arrayList.add(a7.f2876f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... tlsVersions) {
        kotlin.jvm.internal.i.e(tlsVersions, "tlsVersions");
        if (!this.f2936a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] copyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        this.f2939d = (String[]) copyOf;
    }
}
