package G2;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2176a = true;

    /* renamed from: b, reason: collision with root package name */
    public String[] f2177b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f2178c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2179d;

    public final h a() {
        return new h(this.f2176a, this.f2179d, this.f2177b, this.f2178c);
    }

    public final void b(f... fVarArr) {
        f2.j.f(fVarArr, "cipherSuites");
        if (!this.f2176a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            arrayList.add(fVar.f2175a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void c(String... strArr) {
        f2.j.f(strArr, "cipherSuites");
        if (!this.f2176a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2177b = (String[]) strArr.clone();
    }

    public final void d(x... xVarArr) {
        if (!this.f2176a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (x xVar : xVarArr) {
            arrayList.add(xVar.f2320d);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void e(String... strArr) {
        f2.j.f(strArr, "tlsVersions");
        if (!this.f2176a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f2178c = (String[]) strArr.clone();
    }
}
