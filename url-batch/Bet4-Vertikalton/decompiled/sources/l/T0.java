package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2859a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2860b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2861c;
    public Serializable d;

    public o1.g a() {
        return new o1.g(this.f2859a, this.f2860b, (String[]) this.f2861c, (String[]) this.d);
    }

    public void b(String... strArr) {
        d1.d.e(strArr, "cipherSuites");
        if (!this.f2859a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2861c = (String[]) strArr.clone();
    }

    public void c(o1.f... fVarArr) {
        d1.d.e(fVarArr, "cipherSuites");
        if (!this.f2859a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (o1.f fVar : fVarArr) {
            arrayList.add(fVar.f3290a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        d1.d.e(strArr, "tlsVersions");
        if (!this.f2859a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(o1.v... vVarArr) {
        if (!this.f2859a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(vVarArr.length);
        for (o1.v vVar : vVarArr) {
            arrayList.add(vVar.f3404a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
