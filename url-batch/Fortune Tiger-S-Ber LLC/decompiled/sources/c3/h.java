package c3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f1050e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f1051f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1052a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1053b;
    public final String[] c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f1054d;

    static {
        f fVar = f.f1043r;
        f fVar2 = f.f1044s;
        f fVar3 = f.f1045t;
        f fVar4 = f.f1037l;
        f fVar5 = f.f1039n;
        f fVar6 = f.f1038m;
        f fVar7 = f.f1040o;
        f fVar8 = f.f1042q;
        f fVar9 = f.f1041p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9};
        f[] fVarArr2 = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f1035j, f.f1036k, f.h, f.f1034i, f.f1033f, f.g, f.f1032e};
        g gVar = new g();
        gVar.b((f[]) Arrays.copyOf(fVarArr, 9));
        y yVar = y.TLS_1_3;
        y yVar2 = y.TLS_1_2;
        gVar.d(yVar, yVar2);
        gVar.f1048b = true;
        gVar.a();
        g gVar2 = new g();
        gVar2.b((f[]) Arrays.copyOf(fVarArr2, 16));
        gVar2.d(yVar, yVar2);
        gVar2.f1048b = true;
        f1050e = gVar2.a();
        g gVar3 = new g();
        gVar3.b((f[]) Arrays.copyOf(fVarArr2, 16));
        gVar3.d(yVar, yVar2, y.TLS_1_1, y.TLS_1_0);
        gVar3.f1048b = true;
        gVar3.a();
        f1051f = new h(false, false, null, null);
    }

    public h(boolean z3, boolean z4, String[] strArr, String[] strArr2) {
        this.f1052a = z3;
        this.f1053b = z4;
        this.c = strArr;
        this.f1054d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f1030b.c(str));
        }
        return n2.g.H(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f1052a) {
            return false;
        }
        String[] strArr = this.f1054d;
        if (strArr != null && !d3.c.g(strArr, sSLSocket.getEnabledProtocols(), o2.a.f2991b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || d3.c.g(strArr2, sSLSocket.getEnabledCipherSuites(), f.c);
    }

    public final List c() {
        String[] strArr = this.f1054d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(k3.d.A(str));
        }
        return n2.g.H(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z3 = hVar.f1052a;
        boolean z4 = this.f1052a;
        if (z4 != z3) {
            return false;
        }
        if (z4) {
            return Arrays.equals(this.c, hVar.c) && Arrays.equals(this.f1054d, hVar.f1054d) && this.f1053b == hVar.f1053b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f1052a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f1054d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f1053b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f1052a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f1053b + ')';
    }
}
