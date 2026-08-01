package i1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2426a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2427b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2428c;
    public Serializable d;

    public h a() {
        return new h(this.f2426a, this.f2427b, (String[]) this.f2428c, (String[]) this.d);
    }

    public void b(f... fVarArr) {
        X0.d.e(fVarArr, "cipherSuites");
        if (!this.f2426a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            arrayList.add(fVar.f2425a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        X0.d.e(strArr, "cipherSuites");
        if (!this.f2426a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2428c = (String[]) strArr.clone();
    }

    public void d(w... wVarArr) {
        if (!this.f2426a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(wVarArr.length);
        for (w wVar : wVarArr) {
            arrayList.add(wVar.f2527a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        X0.d.e(strArr, "tlsVersions");
        if (!this.f2426a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }
}
