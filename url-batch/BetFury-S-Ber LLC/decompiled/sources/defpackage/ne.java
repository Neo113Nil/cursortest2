package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ne {
    public static final ne e;
    public static final ne f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        zb zbVar = zb.r;
        zb zbVar2 = zb.s;
        zb zbVar3 = zb.t;
        zb zbVar4 = zb.l;
        zb zbVar5 = zb.n;
        zb zbVar6 = zb.m;
        zb zbVar7 = zb.o;
        zb zbVar8 = zb.q;
        zb zbVar9 = zb.p;
        zb[] zbVarArr = {zbVar, zbVar2, zbVar3, zbVar4, zbVar5, zbVar6, zbVar7, zbVar8, zbVar9};
        zb[] zbVarArr2 = {zbVar, zbVar2, zbVar3, zbVar4, zbVar5, zbVar6, zbVar7, zbVar8, zbVar9, zb.j, zb.k, zb.h, zb.i, zb.f, zb.g, zb.e};
        me meVar = new me();
        meVar.b((zb[]) Arrays.copyOf(zbVarArr, 9));
        ni0 ni0Var = ni0.TLS_1_3;
        ni0 ni0Var2 = ni0.TLS_1_2;
        meVar.d(ni0Var, ni0Var2);
        meVar.b = true;
        meVar.a();
        me meVar2 = new me();
        meVar2.b((zb[]) Arrays.copyOf(zbVarArr2, 16));
        meVar2.d(ni0Var, ni0Var2);
        meVar2.b = true;
        e = meVar2.a();
        me meVar3 = new me();
        meVar3.b((zb[]) Arrays.copyOf(zbVarArr2, 16));
        meVar3.d(ni0Var, ni0Var2, ni0.TLS_1_1, ni0.TLS_1_0);
        meVar3.b = true;
        meVar3.a();
        f = new ne(false, false, null, null);
    }

    public ne(boolean z, boolean z2, String[] strArr, String[] strArr2) {
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
            arrayList.add(zb.b.i(str));
        }
        return uc.q0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !zk0.g(strArr, sSLSocket.getEnabledProtocols(), f30.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || zk0.g(strArr2, sSLSocket.getEnabledCipherSuites(), zb.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            ni0.Companion.getClass();
            arrayList.add(mi0.a(str));
        }
        return uc.q0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ne)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ne neVar = (ne) obj;
        boolean z = neVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, neVar.c) && Arrays.equals(this.d, neVar.d) && this.b == neVar.b;
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
