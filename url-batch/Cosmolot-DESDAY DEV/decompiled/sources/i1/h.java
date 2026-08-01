package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f2424e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f2425f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2426a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2427b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2428c;
    public final String[] d;

    static {
        f fVar = f.f2417r;
        f fVar2 = f.f2418s;
        f fVar3 = f.f2419t;
        f fVar4 = f.f2411l;
        f fVar5 = f.f2413n;
        f fVar6 = f.f2412m;
        f fVar7 = f.f2414o;
        f fVar8 = f.f2416q;
        f fVar9 = f.f2415p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f2409j, f.f2410k, f.h, f.i, f.f2407f, f.f2408g, f.f2406e};
        g gVar = new g();
        gVar.b((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        w wVar = w.TLS_1_3;
        w wVar2 = w.TLS_1_2;
        gVar.d(wVar, wVar2);
        if (!gVar.f2421a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar.f2422b = true;
        gVar.a();
        g gVar2 = new g();
        gVar2.b((f[]) Arrays.copyOf(fVarArr, 16));
        gVar2.d(wVar, wVar2);
        if (!gVar2.f2421a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar2.f2422b = true;
        f2424e = gVar2.a();
        g gVar3 = new g();
        gVar3.b((f[]) Arrays.copyOf(fVarArr, 16));
        gVar3.d(wVar, wVar2, w.TLS_1_1, w.TLS_1_0);
        if (!gVar3.f2421a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar3.f2422b = true;
        gVar3.a();
        f2425f = new h(false, false, null, null);
    }

    public h(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f2426a = z2;
        this.f2427b = z3;
        this.f2428c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f2428c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f2404b.c(str));
        }
        return Q0.d.y0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f2426a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !j1.b.h(strArr, sSLSocket.getEnabledProtocols(), R0.a.f670b)) {
            return false;
        }
        String[] strArr2 = this.f2428c;
        return strArr2 == null || j1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f2405c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(p.e(str));
        }
        return Q0.d.y0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z2 = hVar.f2426a;
        boolean z3 = this.f2426a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f2428c, hVar.f2428c) && Arrays.equals(this.d, hVar.d) && this.f2427b == hVar.f2427b);
    }

    public final int hashCode() {
        if (!this.f2426a) {
            return 17;
        }
        String[] strArr = this.f2428c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2427b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2426a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2427b + ')';
    }
}
