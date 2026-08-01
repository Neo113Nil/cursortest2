package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class dd {
    public static final dd e;
    public static final dd f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        db dbVar = db.r;
        db dbVar2 = db.s;
        db dbVar3 = db.t;
        db dbVar4 = db.l;
        db dbVar5 = db.n;
        db dbVar6 = db.m;
        db dbVar7 = db.o;
        db dbVar8 = db.q;
        db dbVar9 = db.p;
        db[] dbVarArr = {dbVar, dbVar2, dbVar3, dbVar4, dbVar5, dbVar6, dbVar7, dbVar8, dbVar9};
        db[] dbVarArr2 = {dbVar, dbVar2, dbVar3, dbVar4, dbVar5, dbVar6, dbVar7, dbVar8, dbVar9, db.j, db.k, db.h, db.i, db.f, db.g, db.e};
        cd cdVar = new cd();
        cdVar.b((db[]) Arrays.copyOf(dbVarArr, 9));
        j90 j90Var = j90.TLS_1_3;
        j90 j90Var2 = j90.TLS_1_2;
        cdVar.d(j90Var, j90Var2);
        cdVar.b = true;
        cdVar.a();
        cd cdVar2 = new cd();
        cdVar2.b((db[]) Arrays.copyOf(dbVarArr2, 16));
        cdVar2.d(j90Var, j90Var2);
        cdVar2.b = true;
        e = cdVar2.a();
        cd cdVar3 = new cd();
        cdVar3.b((db[]) Arrays.copyOf(dbVarArr2, 16));
        cdVar3.d(j90Var, j90Var2, j90.TLS_1_1, j90.TLS_1_0);
        cdVar3.b = true;
        cdVar3.a();
        f = new dd(false, false, null, null);
    }

    public dd(boolean z, boolean z2, String[] strArr, String[] strArr2) {
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
            arrayList.add(db.b.i(str));
        }
        return wb.n0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !cb0.g(strArr, sSLSocket.getEnabledProtocols(), sx.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || cb0.g(strArr2, sSLSocket.getEnabledCipherSuites(), db.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(kr.t(str));
        }
        return wb.n0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dd)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        dd ddVar = (dd) obj;
        boolean z = ddVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, ddVar.c) && Arrays.equals(this.d, ddVar.d) && this.b == ddVar.b;
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
