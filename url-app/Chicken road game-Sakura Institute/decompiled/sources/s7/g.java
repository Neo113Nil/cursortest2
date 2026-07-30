package s7;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8579a = true;

    /* renamed from: b, reason: collision with root package name */
    public String[] f8580b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f8581c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8582d;

    public final h a() {
        return new h(this.f8579a, this.f8582d, this.f8580b, this.f8581c);
    }

    public final void b(String... strArr) {
        r6.k.f(strArr, "cipherSuites");
        if (!this.f8579a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f8580b = (String[]) strArr.clone();
    }

    public final void c(f... fVarArr) {
        r6.k.f(fVarArr, "cipherSuites");
        if (!this.f8579a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            arrayList.add(fVar.f8578a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void d(String... strArr) {
        r6.k.f(strArr, "tlsVersions");
        if (!this.f8579a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f8581c = (String[]) strArr.clone();
    }

    public final void e(w... wVarArr) {
        if (!this.f8579a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(wVarArr.length);
        for (w wVar : wVarArr) {
            arrayList.add(wVar.f8707f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
