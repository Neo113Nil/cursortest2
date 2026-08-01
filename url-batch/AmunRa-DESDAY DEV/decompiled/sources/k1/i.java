package k1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f2805e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f2806f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2807a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2808b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2809c;
    public final String[] d;

    static {
        g gVar = g.f2798r;
        g gVar2 = g.f2799s;
        g gVar3 = g.f2800t;
        g gVar4 = g.f2792l;
        g gVar5 = g.f2794n;
        g gVar6 = g.f2793m;
        g gVar7 = g.f2795o;
        g gVar8 = g.f2797q;
        g gVar9 = g.f2796p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f2790j, g.f2791k, g.h, g.i, g.f2788f, g.f2789g, g.f2787e};
        h hVar = new h();
        hVar.c((g[]) Arrays.copyOf(new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9}, 9));
        x xVar = x.TLS_1_3;
        x xVar2 = x.TLS_1_2;
        hVar.e(xVar, xVar2);
        if (!hVar.f2802a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f2803b = true;
        hVar.a();
        h hVar2 = new h();
        hVar2.c((g[]) Arrays.copyOf(gVarArr, 16));
        hVar2.e(xVar, xVar2);
        if (!hVar2.f2802a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f2803b = true;
        f2805e = hVar2.a();
        h hVar3 = new h();
        hVar3.c((g[]) Arrays.copyOf(gVarArr, 16));
        hVar3.e(xVar, xVar2, x.TLS_1_1, x.TLS_1_0);
        if (!hVar3.f2802a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f2803b = true;
        hVar3.a();
        f2806f = new i(false, false, null, null);
    }

    public i(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f2807a = z2;
        this.f2808b = z3;
        this.f2809c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f2809c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f2785b.c(str));
        }
        return R0.h.q0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f2807a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !l1.b.h(strArr, sSLSocket.getEnabledProtocols(), S0.a.f748b)) {
            return false;
        }
        String[] strArr2 = this.f2809c;
        return strArr2 == null || l1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), g.f2786c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(c.k(str));
        }
        return R0.h.q0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z2 = iVar.f2807a;
        boolean z3 = this.f2807a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f2809c, iVar.f2809c) && Arrays.equals(this.d, iVar.d) && this.f2808b == iVar.f2808b);
    }

    public final int hashCode() {
        if (!this.f2807a) {
            return 17;
        }
        String[] strArr = this.f2809c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2808b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2807a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2808b + ')';
    }
}
