package G3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f907a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f908b;

    /* renamed from: c, reason: collision with root package name */
    public Object f909c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f910d;

    public i a() {
        return new i(this.f907a, this.f908b, (String[]) this.f909c, (String[]) this.f910d);
    }

    public void b(g... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f907a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (g gVar : cipherSuites) {
            arrayList.add(gVar.f906a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f907a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f909c = (String[]) cipherSuites.clone();
    }

    public void d(B... bArr) {
        if (!this.f907a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (B b4 : bArr) {
            arrayList.add(b4.f855a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... tlsVersions) {
        kotlin.jvm.internal.i.e(tlsVersions, "tlsVersions");
        if (!this.f907a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f910d = (String[]) tlsVersions.clone();
    }
}
