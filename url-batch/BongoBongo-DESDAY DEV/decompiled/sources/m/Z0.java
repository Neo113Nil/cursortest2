package m;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3062a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3063b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3064c;
    public Serializable d;

    public s1.g a() {
        return new s1.g(this.f3062a, this.f3063b, (String[]) this.f3064c, (String[]) this.d);
    }

    public void b(String... strArr) {
        h1.d.e(strArr, "cipherSuites");
        if (!this.f3062a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f3064c = (String[]) strArr.clone();
    }

    public void c(s1.f... fVarArr) {
        h1.d.e(fVarArr, "cipherSuites");
        if (!this.f3062a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (s1.f fVar : fVarArr) {
            arrayList.add(fVar.f3620a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        h1.d.e(strArr, "tlsVersions");
        if (!this.f3062a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(s1.u... uVarArr) {
        if (!this.f3062a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(uVarArr.length);
        for (s1.u uVar : uVarArr) {
            arrayList.add(uVar.f3724a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
