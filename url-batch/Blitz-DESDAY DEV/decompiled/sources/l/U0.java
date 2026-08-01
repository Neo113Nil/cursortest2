package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2940a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2941b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2942c;
    public Serializable d;

    public r1.g a() {
        return new r1.g(this.f2940a, this.f2941b, (String[]) this.f2942c, (String[]) this.d);
    }

    public void b(String... strArr) {
        g1.d.e(strArr, "cipherSuites");
        if (!this.f2940a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2942c = (String[]) strArr.clone();
    }

    public void c(r1.f... fVarArr) {
        g1.d.e(fVarArr, "cipherSuites");
        if (!this.f2940a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (r1.f fVar : fVarArr) {
            arrayList.add(fVar.f3469a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        g1.d.e(strArr, "tlsVersions");
        if (!this.f2940a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(r1.u... uVarArr) {
        if (!this.f2940a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(uVarArr.length);
        for (r1.u uVar : uVarArr) {
            arrayList.add(uVar.f3566a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
