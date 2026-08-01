package m1;

import j0.AbstractC0143a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l.U0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f3157e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3158f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3159a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3160b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3161c;
    public final String[] d;

    static {
        f fVar = f.f3153r;
        f fVar2 = f.f3154s;
        f fVar3 = f.f3155t;
        f fVar4 = f.f3147l;
        f fVar5 = f.f3149n;
        f fVar6 = f.f3148m;
        f fVar7 = f.f3150o;
        f fVar8 = f.f3152q;
        f fVar9 = f.f3151p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f3145j, f.f3146k, f.h, f.i, f.f3143f, f.f3144g, f.f3142e};
        U0 u02 = new U0();
        u02.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        v vVar = v.TLS_1_3;
        v vVar2 = v.TLS_1_2;
        u02.e(vVar, vVar2);
        if (!u02.f2867a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        u02.f2868b = true;
        u02.a();
        U0 u03 = new U0();
        u03.c((f[]) Arrays.copyOf(fVarArr, 16));
        u03.e(vVar, vVar2);
        if (!u03.f2867a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        u03.f2868b = true;
        f3157e = u03.a();
        U0 u04 = new U0();
        u04.c((f[]) Arrays.copyOf(fVarArr, 16));
        u04.e(vVar, vVar2, v.TLS_1_1, v.TLS_1_0);
        if (!u04.f2867a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        u04.f2868b = true;
        u04.a();
        f3158f = new g(false, false, null, null);
    }

    public g(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f3159a = z2;
        this.f3160b = z3;
        this.f3161c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f3161c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f3140b.c(str));
        }
        return T0.h.z0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f3159a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !n1.b.h(strArr, sSLSocket.getEnabledProtocols(), U0.a.f832b)) {
            return false;
        }
        String[] strArr2 = this.f3161c;
        return strArr2 == null || n1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f3141c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0143a.i(str));
        }
        return T0.h.z0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        boolean z2 = gVar.f3159a;
        boolean z3 = this.f3159a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f3161c, gVar.f3161c) && Arrays.equals(this.d, gVar.d) && this.f3160b == gVar.f3160b);
    }

    public final int hashCode() {
        if (!this.f3159a) {
            return 17;
        }
        String[] strArr = this.f3161c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f3160b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f3159a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f3160b + ')';
    }
}
