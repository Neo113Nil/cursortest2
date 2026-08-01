package i1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2677a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2678b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2679c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f2680d;

    public j a() {
        return new j(this.f2677a, this.f2678b, (String[]) this.f2679c, (String[]) this.f2680d);
    }

    public void b(h... hVarArr) {
        X0.f.e(hVarArr, "cipherSuites");
        if (!this.f2677a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(hVarArr.length);
        for (h hVar : hVarArr) {
            arrayList.add(hVar.f2676a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        X0.f.e(strArr, "cipherSuites");
        if (!this.f2677a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2679c = (String[]) strArr.clone();
    }

    public void d(B... bArr) {
        if (!this.f2677a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (B b2 : bArr) {
            arrayList.add(b2.f2632a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        X0.f.e(strArr, "tlsVersions");
        if (!this.f2677a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f2680d = (String[]) strArr.clone();
    }
}
