package z1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import n.Y0;

/* loaded from: classes.dex */
public final class i {
    public static final i e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f4848f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4849a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4850b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f4851c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f4852d;

    static {
        h hVar = h.f4844r;
        h hVar2 = h.f4845s;
        h hVar3 = h.f4846t;
        h hVar4 = h.f4838l;
        h hVar5 = h.f4840n;
        h hVar6 = h.f4839m;
        h hVar7 = h.f4841o;
        h hVar8 = h.f4843q;
        h hVar9 = h.f4842p;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.j, h.f4837k, h.f4836h, h.i, h.f4834f, h.f4835g, h.e};
        Y0 y02 = new Y0();
        y02.c((h[]) Arrays.copyOf(new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9}, 9));
        x xVar = x.TLS_1_3;
        x xVar2 = x.TLS_1_2;
        y02.e(xVar, xVar2);
        if (!y02.f3589a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        y02.f3590b = true;
        y02.a();
        Y0 y03 = new Y0();
        y03.c((h[]) Arrays.copyOf(hVarArr, 16));
        y03.e(xVar, xVar2);
        if (!y03.f3589a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        y03.f3590b = true;
        e = y03.a();
        Y0 y04 = new Y0();
        y04.c((h[]) Arrays.copyOf(hVarArr, 16));
        y04.e(xVar, xVar2, x.TLS_1_1, x.TLS_1_0);
        if (!y04.f3589a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        y04.f3590b = true;
        y04.a();
        f4848f = new i(false, false, null, null);
    }

    public i(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f4849a = z2;
        this.f4850b = z3;
        this.f4851c = strArr;
        this.f4852d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f4851c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.f4831b.c(str));
        }
        return X0.k.s0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f4849a) {
            return false;
        }
        String[] strArr = this.f4852d;
        if (strArr != null && !A1.c.h(strArr, sSLSocket.getEnabledProtocols(), Z0.a.f1652b)) {
            return false;
        }
        String[] strArr2 = this.f4851c;
        return strArr2 == null || A1.c.h(strArr2, sSLSocket.getEnabledCipherSuites(), h.f4832c);
    }

    public final List c() {
        String[] strArr = this.f4852d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(j.b(str));
        }
        return X0.k.s0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z2 = iVar.f4849a;
        boolean z3 = this.f4849a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f4851c, iVar.f4851c) && Arrays.equals(this.f4852d, iVar.f4852d) && this.f4850b == iVar.f4850b);
    }

    public final int hashCode() {
        if (!this.f4849a) {
            return 17;
        }
        String[] strArr = this.f4851c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f4852d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f4850b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f4849a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f4850b + ')';
    }
}
