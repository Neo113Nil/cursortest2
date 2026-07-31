package A2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f88e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f89f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f90a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f91b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f92c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f93d;

    static {
        f fVar = f.f78r;
        f fVar2 = f.f79s;
        f fVar3 = f.f80t;
        f fVar4 = f.f73l;
        f fVar5 = f.f75n;
        f fVar6 = f.f74m;
        f fVar7 = f.f76o;
        f fVar8 = f.f77q;
        f fVar9 = f.p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f71j, f.f72k, f.f69h, f.f70i, f.f67f, f.f68g, f.f66e};
        h hVar = new h();
        hVar.b((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        B b2 = B.TLS_1_3;
        B b3 = B.TLS_1_2;
        hVar.d(b2, b3);
        if (!hVar.f84a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f87d = true;
        hVar.a();
        h hVar2 = new h();
        hVar2.b((f[]) Arrays.copyOf(fVarArr, 16));
        hVar2.d(b2, b3);
        if (!hVar2.f84a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f87d = true;
        f88e = hVar2.a();
        h hVar3 = new h();
        hVar3.b((f[]) Arrays.copyOf(fVarArr, 16));
        hVar3.d(b2, b3, B.TLS_1_1, B.TLS_1_0);
        if (!hVar3.f84a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f87d = true;
        hVar3.a();
        f89f = new i(false, false, null, null);
    }

    public i(boolean z3, boolean z4, String[] strArr, String[] strArr2) {
        this.f90a = z3;
        this.f91b = z4;
        this.f92c = strArr;
        this.f93d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f92c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f63b.c(str));
        }
        return M1.l.C0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f90a) {
            return false;
        }
        String[] strArr = this.f93d;
        if (strArr != null && !B2.c.i(strArr, sSLSocket.getEnabledProtocols(), O1.b.f2987b)) {
            return false;
        }
        String[] strArr2 = this.f92c;
        return strArr2 == null || B2.c.i(strArr2, sSLSocket.getEnabledCipherSuites(), f.f64c);
    }

    public final List c() {
        String[] strArr = this.f93d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(I2.d.x(str));
        }
        return M1.l.C0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z3 = iVar.f90a;
        boolean z4 = this.f90a;
        if (z4 != z3) {
            return false;
        }
        return !z4 || (Arrays.equals(this.f92c, iVar.f92c) && Arrays.equals(this.f93d, iVar.f93d) && this.f91b == iVar.f91b);
    }

    public final int hashCode() {
        if (!this.f90a) {
            return 17;
        }
        String[] strArr = this.f92c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f93d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f91b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f90a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f91b + ')';
    }
}
