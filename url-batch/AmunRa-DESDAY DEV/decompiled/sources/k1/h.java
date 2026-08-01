package k1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2802a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2803b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2804c;
    public Serializable d;

    public i a() {
        return new i(this.f2802a, this.f2803b, (String[]) this.f2804c, (String[]) this.d);
    }

    public void b(String... strArr) {
        Z0.d.e(strArr, "cipherSuites");
        if (!this.f2802a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2804c = (String[]) strArr.clone();
    }

    public void c(g... gVarArr) {
        Z0.d.e(gVarArr, "cipherSuites");
        if (!this.f2802a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(gVarArr.length);
        for (g gVar : gVarArr) {
            arrayList.add(gVar.f2801a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        Z0.d.e(strArr, "tlsVersions");
        if (!this.f2802a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(x... xVarArr) {
        if (!this.f2802a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (x xVar : xVarArr) {
            arrayList.add(xVar.f2918a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
