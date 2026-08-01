package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3336a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3337b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3338c;
    public Serializable d;

    public z1.g a() {
        return new z1.g(this.f3336a, this.f3337b, (String[]) this.f3338c, (String[]) this.d);
    }

    public void b(String... strArr) {
        k1.e.e(strArr, "cipherSuites");
        if (!this.f3336a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f3338c = (String[]) strArr.clone();
    }

    public void c(z1.f... fVarArr) {
        k1.e.e(fVarArr, "cipherSuites");
        if (!this.f3336a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (z1.f fVar : fVarArr) {
            arrayList.add(fVar.f4666a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        k1.e.e(strArr, "tlsVersions");
        if (!this.f3336a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(z1.u... uVarArr) {
        if (!this.f3336a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(uVarArr.length);
        for (z1.u uVar : uVarArr) {
            arrayList.add(uVar.f4777a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
