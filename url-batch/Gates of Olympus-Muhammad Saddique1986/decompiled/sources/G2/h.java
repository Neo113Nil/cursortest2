package G2;

import h2.AbstractC0508a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f2180e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f2181f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2182a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2183b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2184c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2185d;

    static {
        f fVar = f.f2172r;
        f fVar2 = f.f2173s;
        f fVar3 = f.f2174t;
        f fVar4 = f.f2166l;
        f fVar5 = f.f2168n;
        f fVar6 = f.f2167m;
        f fVar7 = f.f2169o;
        f fVar8 = f.f2171q;
        f fVar9 = f.f2170p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f2164j, f.f2165k, f.f2162h, f.f2163i, f.f2160f, f.f2161g, f.f2159e};
        g gVar = new g();
        gVar.b((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        x xVar = x.f2314e;
        x xVar2 = x.f2315f;
        gVar.d(xVar, xVar2);
        if (!gVar.f2176a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar.f2179d = true;
        gVar.a();
        g gVar2 = new g();
        gVar2.b((f[]) Arrays.copyOf(fVarArr, 16));
        gVar2.d(xVar, xVar2);
        if (!gVar2.f2176a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar2.f2179d = true;
        f2180e = gVar2.a();
        g gVar3 = new g();
        gVar3.b((f[]) Arrays.copyOf(fVarArr, 16));
        gVar3.d(xVar, xVar2, x.f2316g, x.f2317h);
        if (!gVar3.f2176a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar3.f2179d = true;
        gVar3.a();
        f2181f = new h(false, false, null, null);
    }

    public h(boolean z3, boolean z4, String[] strArr, String[] strArr2) {
        this.f2182a = z3;
        this.f2183b = z4;
        this.f2184c = strArr;
        this.f2185d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f2184c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f2156b.c(str));
        }
        return S1.l.a1(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f2182a) {
            return false;
        }
        String[] strArr = this.f2185d;
        if (strArr != null && !H2.b.i(strArr, sSLSocket.getEnabledProtocols(), U1.b.f4512b)) {
            return false;
        }
        String[] strArr2 = this.f2184c;
        return strArr2 == null || H2.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), f.f2157c);
    }

    public final List c() {
        String[] strArr = this.f2185d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0508a.A(str));
        }
        return S1.l.a1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z3 = hVar.f2182a;
        boolean z4 = this.f2182a;
        if (z4 != z3) {
            return false;
        }
        return !z4 || (Arrays.equals(this.f2184c, hVar.f2184c) && Arrays.equals(this.f2185d, hVar.f2185d) && this.f2183b == hVar.f2183b);
    }

    public final int hashCode() {
        if (!this.f2182a) {
            return 17;
        }
        String[] strArr = this.f2184c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f2185d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2183b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2182a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2183b + ')';
    }
}
