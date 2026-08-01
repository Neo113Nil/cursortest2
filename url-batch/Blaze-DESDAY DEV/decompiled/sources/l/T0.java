package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2883a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2884b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2885c;
    public Serializable d;

    public r1.h a() {
        return new r1.h(this.f2883a, this.f2884b, (String[]) this.f2885c, (String[]) this.d);
    }

    public void b(String... strArr) {
        g1.d.e(strArr, "cipherSuites");
        if (!this.f2883a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2885c = (String[]) strArr.clone();
    }

    public void c(r1.f... fVarArr) {
        g1.d.e(fVarArr, "cipherSuites");
        if (!this.f2883a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (r1.f fVar : fVarArr) {
            arrayList.add(fVar.f3435a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        g1.d.e(strArr, "tlsVersions");
        if (!this.f2883a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(r1.w... wVarArr) {
        if (!this.f2883a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(wVarArr.length);
        for (r1.w wVar : wVarArr) {
            arrayList.add(wVar.f3550a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
