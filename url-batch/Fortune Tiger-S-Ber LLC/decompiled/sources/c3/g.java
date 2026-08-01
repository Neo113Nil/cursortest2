package c3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1047a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1048b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f1049d;

    public h a() {
        return new h(this.f1047a, this.f1048b, (String[]) this.c, (String[]) this.f1049d);
    }

    public void b(f... fVarArr) {
        u2.c.e(fVarArr, "cipherSuites");
        if (!this.f1047a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            arrayList.add(fVar.f1046a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        u2.c.e(strArr, "cipherSuites");
        if (!this.f1047a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.c = (String[]) strArr.clone();
    }

    public void d(y... yVarArr) {
        if (!this.f1047a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(yVarArr.length);
        for (y yVar : yVarArr) {
            arrayList.add(yVar.f1159f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        u2.c.e(strArr, "tlsVersions");
        if (!this.f1047a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f1049d = (String[]) strArr.clone();
    }
}
