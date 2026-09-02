package G3;

import e3.C0409a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f911e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f912f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f913a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f914b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f915c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f916d;

    static {
        g gVar = g.f903r;
        g gVar2 = g.f904s;
        g gVar3 = g.f905t;
        g gVar4 = g.f899l;
        g gVar5 = g.n;
        g gVar6 = g.f900m;
        g gVar7 = g.o;
        g gVar8 = g.f902q;
        g gVar9 = g.f901p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f897j, g.f898k, g.f895h, g.f896i, g.f893f, g.f894g, g.f892e};
        h hVar = new h();
        hVar.b((g[]) Arrays.copyOf(gVarArr, 9));
        B b4 = B.TLS_1_3;
        B b5 = B.TLS_1_2;
        hVar.d(b4, b5);
        if (!hVar.f907a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f908b = true;
        hVar.a();
        h hVar2 = new h();
        hVar2.b((g[]) Arrays.copyOf(gVarArr2, 16));
        hVar2.d(b4, b5);
        if (!hVar2.f907a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f908b = true;
        f911e = hVar2.a();
        h hVar3 = new h();
        hVar3.b((g[]) Arrays.copyOf(gVarArr2, 16));
        hVar3.d(b4, b5, B.TLS_1_1, B.TLS_1_0);
        if (!hVar3.f907a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f908b = true;
        hVar3.a();
        f912f = new i(false, false, null, null);
    }

    public i(boolean z, boolean z4, String[] strArr, String[] strArr2) {
        this.f913a = z;
        this.f914b = z4;
        this.f915c = strArr;
        this.f916d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f915c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f889b.d(str));
        }
        return d3.i.n0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f913a) {
            return false;
        }
        String[] strArr = this.f916d;
        if (strArr != null && !H3.b.h(strArr, sSLSocket.getEnabledProtocols(), C0409a.f8467b)) {
            return false;
        }
        String[] strArr2 = this.f915c;
        return strArr2 == null || H3.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), g.f890c);
    }

    public final List c() {
        String[] strArr = this.f916d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(V3.b.o(str));
        }
        return d3.i.n0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z = iVar.f913a;
        boolean z4 = this.f913a;
        if (z4 != z) {
            return false;
        }
        if (z4) {
            return Arrays.equals(this.f915c, iVar.f915c) && Arrays.equals(this.f916d, iVar.f916d) && this.f914b == iVar.f914b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f913a) {
            return 17;
        }
        String[] strArr = this.f915c;
        int hashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f916d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f914b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f913a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(a(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(c(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f914b + ')';
    }
}
