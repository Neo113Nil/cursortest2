package s1;

import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import m.Z0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f3621e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3622f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3623a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3624b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3625c;
    public final String[] d;

    static {
        f fVar = f.f3617r;
        f fVar2 = f.f3618s;
        f fVar3 = f.f3619t;
        f fVar4 = f.f3611l;
        f fVar5 = f.f3613n;
        f fVar6 = f.f3612m;
        f fVar7 = f.f3614o;
        f fVar8 = f.f3616q;
        f fVar9 = f.f3615p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f3609j, f.f3610k, f.f3608h, f.i, f.f3606f, f.f3607g, f.f3605e};
        Z0 z02 = new Z0();
        z02.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        u uVar = u.TLS_1_3;
        u uVar2 = u.TLS_1_2;
        z02.e(uVar, uVar2);
        if (!z02.f3062a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        z02.f3063b = true;
        z02.a();
        Z0 z03 = new Z0();
        z03.c((f[]) Arrays.copyOf(fVarArr, 16));
        z03.e(uVar, uVar2);
        if (!z03.f3062a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        z03.f3063b = true;
        f3621e = z03.a();
        Z0 z04 = new Z0();
        z04.c((f[]) Arrays.copyOf(fVarArr, 16));
        z04.e(uVar, uVar2, u.TLS_1_1, u.TLS_1_0);
        if (!z04.f3062a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        z04.f3063b = true;
        z04.a();
        f3622f = new g(false, false, null, null);
    }

    public g(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f3623a = z2;
        this.f3624b = z3;
        this.f3625c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f3625c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f3603b.c(str));
        }
        return W0.g.u0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f3623a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !t1.b.h(strArr, sSLSocket.getEnabledProtocols(), X0.a.f983b)) {
            return false;
        }
        String[] strArr2 = this.f3625c;
        return strArr2 == null || t1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f3604c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0112a.i(str));
        }
        return W0.g.u0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        boolean z2 = gVar.f3623a;
        boolean z3 = this.f3623a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f3625c, gVar.f3625c) && Arrays.equals(this.d, gVar.d) && this.f3624b == gVar.f3624b);
    }

    public final int hashCode() {
        if (!this.f3623a) {
            return 17;
        }
        String[] strArr = this.f3625c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f3624b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f3623a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f3624b + ')';
    }
}
