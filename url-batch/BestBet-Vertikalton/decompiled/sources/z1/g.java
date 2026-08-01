package z1;

import a1.C0059a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l.S0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f4667e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f4668f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4669a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4670b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f4671c;
    public final String[] d;

    static {
        f fVar = f.f4663r;
        f fVar2 = f.f4664s;
        f fVar3 = f.f4665t;
        f fVar4 = f.f4657l;
        f fVar5 = f.f4659n;
        f fVar6 = f.f4658m;
        f fVar7 = f.f4660o;
        f fVar8 = f.f4662q;
        f fVar9 = f.f4661p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f4655j, f.f4656k, f.h, f.i, f.f4653f, f.f4654g, f.f4652e};
        S0 s0 = new S0();
        s0.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        u uVar = u.TLS_1_3;
        u uVar2 = u.TLS_1_2;
        s0.e(uVar, uVar2);
        if (!s0.f3336a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        s0.f3337b = true;
        s0.a();
        S0 s02 = new S0();
        s02.c((f[]) Arrays.copyOf(fVarArr, 16));
        s02.e(uVar, uVar2);
        if (!s02.f3336a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        s02.f3337b = true;
        f4667e = s02.a();
        S0 s03 = new S0();
        s03.c((f[]) Arrays.copyOf(fVarArr, 16));
        s03.e(uVar, uVar2, u.TLS_1_1, u.TLS_1_0);
        if (!s03.f3336a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        s03.f3337b = true;
        s03.a();
        f4668f = new g(false, false, null, null);
    }

    public g(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f4669a = z2;
        this.f4670b = z3;
        this.f4671c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f4671c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f4650b.c(str));
        }
        return Y0.j.D0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f4669a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !A1.c.h(strArr, sSLSocket.getEnabledProtocols(), C0059a.f1626b)) {
            return false;
        }
        String[] strArr2 = this.f4671c;
        return strArr2 == null || A1.c.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f4651c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(b1.g.m(str));
        }
        return Y0.j.D0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        boolean z2 = gVar.f4669a;
        boolean z3 = this.f4669a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f4671c, gVar.f4671c) && Arrays.equals(this.d, gVar.d) && this.f4670b == gVar.f4670b);
    }

    public final int hashCode() {
        if (!this.f4669a) {
            return 17;
        }
        String[] strArr = this.f4671c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f4670b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f4669a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f4670b + ')';
    }
}
