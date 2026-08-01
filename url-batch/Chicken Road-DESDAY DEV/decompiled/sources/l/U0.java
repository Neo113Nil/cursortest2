package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2867a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2868b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2869c;
    public Serializable d;

    public m1.g a() {
        return new m1.g(this.f2867a, this.f2868b, (String[]) this.f2869c, (String[]) this.d);
    }

    public void b(String... strArr) {
        b1.d.e(strArr, "cipherSuites");
        if (!this.f2867a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2869c = (String[]) strArr.clone();
    }

    public void c(m1.f... fVarArr) {
        b1.d.e(fVarArr, "cipherSuites");
        if (!this.f2867a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (m1.f fVar : fVarArr) {
            arrayList.add(fVar.f3156a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        b1.d.e(strArr, "tlsVersions");
        if (!this.f2867a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(m1.v... vVarArr) {
        if (!this.f2867a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(vVarArr.length);
        for (m1.v vVar : vVarArr) {
            arrayList.add(vVar.f3270a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
