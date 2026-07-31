package A2;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f84a = true;

    /* renamed from: b, reason: collision with root package name */
    public String[] f85b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f86c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f87d;

    public final i a() {
        return new i(this.f84a, this.f87d, this.f85b, this.f86c);
    }

    public final void b(f... fVarArr) {
        Z1.i.f(fVarArr, "cipherSuites");
        if (!this.f84a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            arrayList.add(fVar.f81a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void c(String... strArr) {
        Z1.i.f(strArr, "cipherSuites");
        if (!this.f84a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f85b = (String[]) strArr.clone();
    }

    public final void d(B... bArr) {
        if (!this.f84a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (B b2 : bArr) {
            arrayList.add(b2.f32d);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void e(String... strArr) {
        Z1.i.f(strArr, "tlsVersions");
        if (!this.f84a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f86c = (String[]) strArr.clone();
    }
}
