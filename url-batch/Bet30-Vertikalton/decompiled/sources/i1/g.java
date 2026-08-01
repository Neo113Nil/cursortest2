package i1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2425a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2426b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2427c;
    public Serializable d;

    public h a() {
        return new h(this.f2425a, this.f2426b, (String[]) this.f2427c, (String[]) this.d);
    }

    public void b(f... fVarArr) {
        X0.d.e(fVarArr, "cipherSuites");
        if (!this.f2425a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            arrayList.add(fVar.f2424a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        X0.d.e(strArr, "cipherSuites");
        if (!this.f2425a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2427c = (String[]) strArr.clone();
    }

    public void d(x... xVarArr) {
        if (!this.f2425a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (x xVar : xVarArr) {
            arrayList.add(xVar.f2543a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        X0.d.e(strArr, "tlsVersions");
        if (!this.f2425a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }
}
