package n;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3589a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3590b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3591c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f3592d;

    public z1.i a() {
        return new z1.i(this.f3589a, this.f3590b, (String[]) this.f3591c, (String[]) this.f3592d);
    }

    public void b(String... strArr) {
        j1.h.e(strArr, "cipherSuites");
        if (!this.f3589a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f3591c = (String[]) strArr.clone();
    }

    public void c(z1.h... hVarArr) {
        j1.h.e(hVarArr, "cipherSuites");
        if (!this.f3589a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(hVarArr.length);
        for (z1.h hVar : hVarArr) {
            arrayList.add(hVar.f4847a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        j1.h.e(strArr, "tlsVersions");
        if (!this.f3589a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f3592d = (String[]) strArr.clone();
    }

    public void e(z1.x... xVarArr) {
        if (!this.f3589a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (z1.x xVar : xVarArr) {
            arrayList.add(xVar.f4962a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
