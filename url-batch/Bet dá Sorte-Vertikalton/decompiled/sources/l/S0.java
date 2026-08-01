package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2898a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2899b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2900c;
    public Serializable d;

    public m1.h a() {
        return new m1.h(this.f2898a, this.f2899b, (String[]) this.f2900c, (String[]) this.d);
    }

    public void b(String... strArr) {
        b1.d.e(strArr, "cipherSuites");
        if (!this.f2898a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2900c = (String[]) strArr.clone();
    }

    public void c(m1.f... fVarArr) {
        b1.d.e(fVarArr, "cipherSuites");
        if (!this.f2898a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (m1.f fVar : fVarArr) {
            arrayList.add(fVar.f3188a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        b1.d.e(strArr, "tlsVersions");
        if (!this.f2898a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(m1.w... wVarArr) {
        if (!this.f2898a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(wVarArr.length);
        for (m1.w wVar : wVarArr) {
            arrayList.add(wVar.f3303a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
