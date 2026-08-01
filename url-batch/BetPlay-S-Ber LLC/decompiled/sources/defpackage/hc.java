package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class hc {
    public static final hc e;
    public static final hc f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        na naVar = na.r;
        na naVar2 = na.s;
        na naVar3 = na.t;
        na naVar4 = na.l;
        na naVar5 = na.n;
        na naVar6 = na.m;
        na naVar7 = na.o;
        na naVar8 = na.q;
        na naVar9 = na.p;
        na[] naVarArr = {naVar, naVar2, naVar3, naVar4, naVar5, naVar6, naVar7, naVar8, naVar9};
        na[] naVarArr2 = {naVar, naVar2, naVar3, naVar4, naVar5, naVar6, naVar7, naVar8, naVar9, na.j, na.k, na.h, na.i, na.f, na.g, na.e};
        gc gcVar = new gc();
        gcVar.b((na[]) Arrays.copyOf(naVarArr, 9));
        h60 h60Var = h60.TLS_1_3;
        h60 h60Var2 = h60.TLS_1_2;
        gcVar.d(h60Var, h60Var2);
        gcVar.b = true;
        gcVar.a();
        gc gcVar2 = new gc();
        gcVar2.b((na[]) Arrays.copyOf(naVarArr2, 16));
        gcVar2.d(h60Var, h60Var2);
        gcVar2.b = true;
        e = gcVar2.a();
        gc gcVar3 = new gc();
        gcVar3.b((na[]) Arrays.copyOf(naVarArr2, 16));
        gcVar3.d(h60Var, h60Var2, h60.TLS_1_1, h60.TLS_1_0);
        gcVar3.b = true;
        gcVar3.a();
        f = new hc(false, false, null, null);
    }

    public hc(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(na.b.k(str));
        }
        return db.f0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !y70.g(strArr, sSLSocket.getEnabledProtocols(), gv.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || y70.g(strArr2, sSLSocket.getEnabledCipherSuites(), na.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(op.u(str));
        }
        return db.f0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hc)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        hc hcVar = (hc) obj;
        boolean z = hcVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, hcVar.c) && Arrays.equals(this.d, hcVar.d) && this.b == hcVar.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
