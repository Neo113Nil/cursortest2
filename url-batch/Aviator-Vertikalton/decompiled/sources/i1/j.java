package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f2681e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f2682f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2683a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2684b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2685c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2686d;

    static {
        h hVar = h.f2673r;
        h hVar2 = h.f2674s;
        h hVar3 = h.f2675t;
        h hVar4 = h.f2667l;
        h hVar5 = h.f2669n;
        h hVar6 = h.f2668m;
        h hVar7 = h.f2670o;
        h hVar8 = h.f2672q;
        h hVar9 = h.f2671p;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f2665j, h.f2666k, h.h, h.i, h.f2663f, h.f2664g, h.f2662e};
        i iVar = new i();
        iVar.b((h[]) Arrays.copyOf(new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9}, 9));
        B b2 = B.TLS_1_3;
        B b3 = B.TLS_1_2;
        iVar.d(b2, b3);
        if (!iVar.f2677a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar.f2678b = true;
        iVar.a();
        i iVar2 = new i();
        iVar2.b((h[]) Arrays.copyOf(hVarArr, 16));
        iVar2.d(b2, b3);
        if (!iVar2.f2677a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar2.f2678b = true;
        f2681e = iVar2.a();
        i iVar3 = new i();
        iVar3.b((h[]) Arrays.copyOf(hVarArr, 16));
        iVar3.d(b2, b3, B.TLS_1_1, B.TLS_1_0);
        if (!iVar3.f2677a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar3.f2678b = true;
        iVar3.a();
        f2682f = new j(false, false, null, null);
    }

    public j(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f2683a = z2;
        this.f2684b = z3;
        this.f2685c = strArr;
        this.f2686d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f2685c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.f2659b.c(str));
        }
        return O0.h.h0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f2683a) {
            return false;
        }
        String[] strArr = this.f2686d;
        if (strArr != null && !j1.b.h(strArr, sSLSocket.getEnabledProtocols(), P0.a.f698b)) {
            return false;
        }
        String[] strArr2 = this.f2685c;
        return strArr2 == null || j1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), h.f2660c);
    }

    public final List c() {
        String[] strArr = this.f2686d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m.i(str));
        }
        return O0.h.h0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z2 = jVar.f2683a;
        boolean z3 = this.f2683a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f2685c, jVar.f2685c) && Arrays.equals(this.f2686d, jVar.f2686d) && this.f2684b == jVar.f2684b);
    }

    public final int hashCode() {
        if (!this.f2683a) {
            return 17;
        }
        String[] strArr = this.f2685c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f2686d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2684b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2683a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2684b + ')';
    }
}
