package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2919a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2920b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2921c;
    public Serializable d;

    public p1.h a() {
        return new p1.h(this.f2919a, this.f2920b, (String[]) this.f2921c, (String[]) this.d);
    }

    public void b(String... strArr) {
        e1.d.e(strArr, "cipherSuites");
        if (!this.f2919a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2921c = (String[]) strArr.clone();
    }

    public void c(p1.f... fVarArr) {
        e1.d.e(fVarArr, "cipherSuites");
        if (!this.f2919a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (p1.f fVar : fVarArr) {
            arrayList.add(fVar.f3335a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        e1.d.e(strArr, "tlsVersions");
        if (!this.f2919a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(p1.w... wVarArr) {
        if (!this.f2919a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(wVarArr.length);
        for (p1.w wVar : wVarArr) {
            arrayList.add(wVar.f3450a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
