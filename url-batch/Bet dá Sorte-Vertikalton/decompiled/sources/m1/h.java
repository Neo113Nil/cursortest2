package m1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l.S0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f3190e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f3191f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3192a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3193b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3194c;
    public final String[] d;

    static {
        f fVar = f.f3185r;
        f fVar2 = f.f3186s;
        f fVar3 = f.f3187t;
        f fVar4 = f.f3179l;
        f fVar5 = f.f3181n;
        f fVar6 = f.f3180m;
        f fVar7 = f.f3182o;
        f fVar8 = f.f3184q;
        f fVar9 = f.f3183p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f3177j, f.f3178k, f.h, f.i, f.f3175f, f.f3176g, f.f3174e};
        S0 s02 = new S0();
        s02.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        w wVar = w.TLS_1_3;
        w wVar2 = w.TLS_1_2;
        s02.e(wVar, wVar2);
        if (!s02.f2898a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        s02.f2899b = true;
        s02.a();
        S0 s03 = new S0();
        s03.c((f[]) Arrays.copyOf(fVarArr, 16));
        s03.e(wVar, wVar2);
        if (!s03.f2898a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        s03.f2899b = true;
        f3190e = s03.a();
        S0 s04 = new S0();
        s04.c((f[]) Arrays.copyOf(fVarArr, 16));
        s04.e(wVar, wVar2, w.TLS_1_1, w.TLS_1_0);
        if (!s04.f2898a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        s04.f2899b = true;
        s04.a();
        f3191f = new h(false, false, null, null);
    }

    public h(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f3192a = z2;
        this.f3193b = z3;
        this.f3194c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f3194c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f3172b.c(str));
        }
        return T0.h.p0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f3192a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !n1.b.h(strArr, sSLSocket.getEnabledProtocols(), U0.a.f847b)) {
            return false;
        }
        String[] strArr2 = this.f3194c;
        return strArr2 == null || n1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f3173c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(k0.w.h(str));
        }
        return T0.h.p0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z2 = hVar.f3192a;
        boolean z3 = this.f3192a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f3194c, hVar.f3194c) && Arrays.equals(this.d, hVar.d) && this.f3193b == hVar.f3193b);
    }

    public final int hashCode() {
        if (!this.f3192a) {
            return 17;
        }
        String[] strArr = this.f3194c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f3193b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f3192a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f3193b + ')';
    }
}
