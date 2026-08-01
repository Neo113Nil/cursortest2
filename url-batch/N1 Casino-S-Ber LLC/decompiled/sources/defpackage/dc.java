package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class dc {
    public static final dc e;
    public static final dc f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        ka kaVar = ka.r;
        ka kaVar2 = ka.s;
        ka kaVar3 = ka.t;
        ka kaVar4 = ka.l;
        ka kaVar5 = ka.n;
        ka kaVar6 = ka.m;
        ka kaVar7 = ka.o;
        ka kaVar8 = ka.q;
        ka kaVar9 = ka.p;
        ka[] kaVarArr = {kaVar, kaVar2, kaVar3, kaVar4, kaVar5, kaVar6, kaVar7, kaVar8, kaVar9};
        ka[] kaVarArr2 = {kaVar, kaVar2, kaVar3, kaVar4, kaVar5, kaVar6, kaVar7, kaVar8, kaVar9, ka.j, ka.k, ka.h, ka.i, ka.f, ka.g, ka.e};
        cc ccVar = new cc();
        ccVar.b((ka[]) Arrays.copyOf(kaVarArr, 9));
        z50 z50Var = z50.TLS_1_3;
        z50 z50Var2 = z50.TLS_1_2;
        ccVar.d(z50Var, z50Var2);
        ccVar.b = true;
        ccVar.a();
        cc ccVar2 = new cc();
        ccVar2.b((ka[]) Arrays.copyOf(kaVarArr2, 16));
        ccVar2.d(z50Var, z50Var2);
        ccVar2.b = true;
        e = ccVar2.a();
        cc ccVar3 = new cc();
        ccVar3.b((ka[]) Arrays.copyOf(kaVarArr2, 16));
        ccVar3.d(z50Var, z50Var2, z50.TLS_1_1, z50.TLS_1_0);
        ccVar3.b = true;
        ccVar3.a();
        f = new dc(false, false, null, null);
    }

    public dc(boolean z, boolean z2, String[] strArr, String[] strArr2) {
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
            arrayList.add(ka.b.j(str));
        }
        return bb.K0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !r70.g(strArr, sSLSocket.getEnabledProtocols(), qu.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || r70.g(strArr2, sSLSocket.getEnabledCipherSuites(), ka.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(e70.u(str));
        }
        return bb.K0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dc)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        dc dcVar = (dc) obj;
        boolean z = dcVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, dcVar.c) && Arrays.equals(this.d, dcVar.d) && this.b == dcVar.b;
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
