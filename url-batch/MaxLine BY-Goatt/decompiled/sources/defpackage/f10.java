package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f10 {
    public static final f10 e;
    public static final f10 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        eu euVar = eu.r;
        eu euVar2 = eu.s;
        eu euVar3 = eu.t;
        eu euVar4 = eu.l;
        eu euVar5 = eu.n;
        eu euVar6 = eu.m;
        eu euVar7 = eu.o;
        eu euVar8 = eu.q;
        eu euVar9 = eu.p;
        eu[] euVarArr = {euVar, euVar2, euVar3, euVar4, euVar5, euVar6, euVar7, euVar8, euVar9};
        eu[] euVarArr2 = {euVar, euVar2, euVar3, euVar4, euVar5, euVar6, euVar7, euVar8, euVar9, eu.j, eu.k, eu.h, eu.i, eu.f, eu.g, eu.e};
        e10 e10Var = new e10();
        e10Var.b((eu[]) Arrays.copyOf(euVarArr, 9));
        xx2 xx2Var = xx2.TLS_1_3;
        xx2 xx2Var2 = xx2.TLS_1_2;
        e10Var.d(xx2Var, xx2Var2);
        e10Var.b = true;
        e10Var.a();
        e10 e10Var2 = new e10();
        e10Var2.b((eu[]) Arrays.copyOf(euVarArr2, 16));
        e10Var2.d(xx2Var, xx2Var2);
        e10Var2.b = true;
        e = e10Var2.a();
        e10 e10Var3 = new e10();
        e10Var3.b((eu[]) Arrays.copyOf(euVarArr2, 16));
        e10Var3.d(xx2Var, xx2Var2, xx2.TLS_1_1, xx2.TLS_1_0);
        e10Var3.b = true;
        e10Var3.a();
        f = new f10(false, false, null, null);
    }

    public f10(boolean z, boolean z2, String[] strArr, String[] strArr2) {
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
            arrayList.add(eu.b.l(str));
        }
        return zv.M(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !n33.g(strArr, sSLSocket.getEnabledProtocols(), bx.b())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || n33.g(strArr2, sSLSocket.getEnabledCipherSuites(), eu.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(uj2.a(str));
        }
        return zv.M(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f10)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        f10 f10Var = (f10) obj;
        boolean z = f10Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, f10Var.c) && Arrays.equals(this.d, f10Var.d) && this.b == f10Var.b;
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
