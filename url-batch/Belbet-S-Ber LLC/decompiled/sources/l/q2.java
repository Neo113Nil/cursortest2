package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2545a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2546b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2547c;
    public Serializable d;

    public t3.g a() {
        return new t3.g(this.f2545a, this.f2546b, (String[]) this.f2547c, (String[]) this.d);
    }

    public void b(String... strArr) {
        i3.d.e(strArr, "cipherSuites");
        if (!this.f2545a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f2547c = (String[]) strArr.clone();
    }

    public void c(t3.f... fVarArr) {
        i3.d.e(fVarArr, "cipherSuites");
        if (!this.f2545a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (t3.f fVar : fVarArr) {
            arrayList.add(fVar.f3434a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        i3.d.e(strArr, "tlsVersions");
        if (!this.f2545a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(t3.w... wVarArr) {
        if (!this.f2545a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(wVarArr.length);
        for (t3.w wVar : wVarArr) {
            arrayList.add(wVar.f3540f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
