package o1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l.T0;
import m.C0260a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f3291e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3292f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3293a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3294b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3295c;
    public final String[] d;

    static {
        f fVar = f.f3287r;
        f fVar2 = f.f3288s;
        f fVar3 = f.f3289t;
        f fVar4 = f.f3281l;
        f fVar5 = f.f3283n;
        f fVar6 = f.f3282m;
        f fVar7 = f.f3284o;
        f fVar8 = f.f3286q;
        f fVar9 = f.f3285p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f3279j, f.f3280k, f.h, f.i, f.f3277f, f.f3278g, f.f3276e};
        T0 t02 = new T0();
        t02.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        v vVar = v.TLS_1_3;
        v vVar2 = v.TLS_1_2;
        t02.e(vVar, vVar2);
        if (!t02.f2859a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t02.f2860b = true;
        t02.a();
        T0 t03 = new T0();
        t03.c((f[]) Arrays.copyOf(fVarArr, 16));
        t03.e(vVar, vVar2);
        if (!t03.f2859a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t03.f2860b = true;
        f3291e = t03.a();
        T0 t04 = new T0();
        t04.c((f[]) Arrays.copyOf(fVarArr, 16));
        t04.e(vVar, vVar2, v.TLS_1_1, v.TLS_1_0);
        if (!t04.f2859a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t04.f2860b = true;
        t04.a();
        f3292f = new g(false, false, null, null);
    }

    public g(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f3293a = z2;
        this.f3294b = z3;
        this.f3295c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f3295c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f3274b.c(str));
        }
        return S0.g.E0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f3293a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !p1.b.h(strArr, sSLSocket.getEnabledProtocols(), T0.a.f831b)) {
            return false;
        }
        String[] strArr2 = this.f3295c;
        return strArr2 == null || p1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f3275c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0260a.g(str));
        }
        return S0.g.E0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        boolean z2 = gVar.f3293a;
        boolean z3 = this.f3293a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f3295c, gVar.f3295c) && Arrays.equals(this.d, gVar.d) && this.f3294b == gVar.f3294b);
    }

    public final int hashCode() {
        if (!this.f3293a) {
            return 17;
        }
        String[] strArr = this.f3295c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f3294b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f3293a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f3294b + ')';
    }
}
