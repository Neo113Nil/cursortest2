package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f2426e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f2427f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2428a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2429b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2430c;
    public final String[] d;

    static {
        f fVar = f.f2419r;
        f fVar2 = f.f2420s;
        f fVar3 = f.f2421t;
        f fVar4 = f.f2413l;
        f fVar5 = f.f2415n;
        f fVar6 = f.f2414m;
        f fVar7 = f.f2416o;
        f fVar8 = f.f2418q;
        f fVar9 = f.f2417p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f2411j, f.f2412k, f.h, f.i, f.f2409f, f.f2410g, f.f2408e};
        g gVar = new g();
        gVar.b((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        x xVar = x.TLS_1_3;
        x xVar2 = x.TLS_1_2;
        gVar.d(xVar, xVar2);
        if (!gVar.f2423a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar.f2424b = true;
        gVar.a();
        g gVar2 = new g();
        gVar2.b((f[]) Arrays.copyOf(fVarArr, 16));
        gVar2.d(xVar, xVar2);
        if (!gVar2.f2423a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar2.f2424b = true;
        f2426e = gVar2.a();
        g gVar3 = new g();
        gVar3.b((f[]) Arrays.copyOf(fVarArr, 16));
        gVar3.d(xVar, xVar2, x.TLS_1_1, x.TLS_1_0);
        if (!gVar3.f2423a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar3.f2424b = true;
        gVar3.a();
        f2427f = new h(false, false, null, null);
    }

    public h(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f2428a = z2;
        this.f2429b = z3;
        this.f2430c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f2430c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f2406b.c(str));
        }
        return Q0.h.z0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f2428a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !j1.b.h(strArr, sSLSocket.getEnabledProtocols(), R0.a.f675b)) {
            return false;
        }
        String[] strArr2 = this.f2430c;
        return strArr2 == null || j1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f2407c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(q.e(str));
        }
        return Q0.h.z0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z2 = hVar.f2428a;
        boolean z3 = this.f2428a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f2430c, hVar.f2430c) && Arrays.equals(this.d, hVar.d) && this.f2429b == hVar.f2429b);
    }

    public final int hashCode() {
        if (!this.f2428a) {
            return 17;
        }
        String[] strArr = this.f2430c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2429b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2428a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2429b + ')';
    }
}
