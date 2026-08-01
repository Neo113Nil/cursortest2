package r1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l.U0;
import m.C0227a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f3470e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3471f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3472a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3473b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3474c;
    public final String[] d;

    static {
        f fVar = f.f3466r;
        f fVar2 = f.f3467s;
        f fVar3 = f.f3468t;
        f fVar4 = f.f3460l;
        f fVar5 = f.f3462n;
        f fVar6 = f.f3461m;
        f fVar7 = f.f3463o;
        f fVar8 = f.f3465q;
        f fVar9 = f.f3464p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f3458j, f.f3459k, f.h, f.i, f.f3456f, f.f3457g, f.f3455e};
        U0 u02 = new U0();
        u02.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        u uVar = u.TLS_1_3;
        u uVar2 = u.TLS_1_2;
        u02.e(uVar, uVar2);
        if (!u02.f2940a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        u02.f2941b = true;
        u02.a();
        U0 u03 = new U0();
        u03.c((f[]) Arrays.copyOf(fVarArr, 16));
        u03.e(uVar, uVar2);
        if (!u03.f2940a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        u03.f2941b = true;
        f3470e = u03.a();
        U0 u04 = new U0();
        u04.c((f[]) Arrays.copyOf(fVarArr, 16));
        u04.e(uVar, uVar2, u.TLS_1_1, u.TLS_1_0);
        if (!u04.f2940a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        u04.f2941b = true;
        u04.a();
        f3471f = new g(false, false, null, null);
    }

    public g(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f3472a = z2;
        this.f3473b = z3;
        this.f3474c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f3474c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f3453b.c(str));
        }
        return X0.j.G0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f3472a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !s1.b.h(strArr, sSLSocket.getEnabledProtocols(), Z0.a.f1233b)) {
            return false;
        }
        String[] strArr2 = this.f3474c;
        return strArr2 == null || s1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f3454c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0227a.h(str));
        }
        return X0.j.G0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        boolean z2 = gVar.f3472a;
        boolean z3 = this.f3472a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f3474c, gVar.f3474c) && Arrays.equals(this.d, gVar.d) && this.f3473b == gVar.f3473b);
    }

    public final int hashCode() {
        if (!this.f3472a) {
            return 17;
        }
        String[] strArr = this.f3474c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f3473b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f3472a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f3473b + ')';
    }
}
