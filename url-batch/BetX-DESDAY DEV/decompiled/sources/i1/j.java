package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f2685e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f2686f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2687a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2688b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2689c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2690d;

    static {
        h hVar = h.f2677r;
        h hVar2 = h.f2678s;
        h hVar3 = h.f2679t;
        h hVar4 = h.f2671l;
        h hVar5 = h.f2673n;
        h hVar6 = h.f2672m;
        h hVar7 = h.f2674o;
        h hVar8 = h.f2676q;
        h hVar9 = h.f2675p;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f2669j, h.f2670k, h.h, h.i, h.f2667f, h.f2668g, h.f2666e};
        i iVar = new i();
        iVar.b((h[]) Arrays.copyOf(new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9}, 9));
        B b2 = B.TLS_1_3;
        B b3 = B.TLS_1_2;
        iVar.d(b2, b3);
        if (!iVar.f2681a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar.f2682b = true;
        iVar.a();
        i iVar2 = new i();
        iVar2.b((h[]) Arrays.copyOf(hVarArr, 16));
        iVar2.d(b2, b3);
        if (!iVar2.f2681a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar2.f2682b = true;
        f2685e = iVar2.a();
        i iVar3 = new i();
        iVar3.b((h[]) Arrays.copyOf(hVarArr, 16));
        iVar3.d(b2, b3, B.TLS_1_1, B.TLS_1_0);
        if (!iVar3.f2681a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar3.f2682b = true;
        iVar3.a();
        f2686f = new j(false, false, null, null);
    }

    public j(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f2687a = z2;
        this.f2688b = z3;
        this.f2689c = strArr;
        this.f2690d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f2689c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.f2663b.c(str));
        }
        return O0.h.g0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f2687a) {
            return false;
        }
        String[] strArr = this.f2690d;
        if (strArr != null && !j1.b.h(strArr, sSLSocket.getEnabledProtocols(), P0.a.f699b)) {
            return false;
        }
        String[] strArr2 = this.f2689c;
        return strArr2 == null || j1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), h.f2664c);
    }

    public final List c() {
        String[] strArr = this.f2690d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m.i(str));
        }
        return O0.h.g0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z2 = jVar.f2687a;
        boolean z3 = this.f2687a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f2689c, jVar.f2689c) && Arrays.equals(this.f2690d, jVar.f2690d) && this.f2688b == jVar.f2688b);
    }

    public final int hashCode() {
        if (!this.f2687a) {
            return 17;
        }
        String[] strArr = this.f2689c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f2690d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2688b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2687a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2688b + ')';
    }
}
