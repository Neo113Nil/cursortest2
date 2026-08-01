package r1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l.T0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f3437e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f3438f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3439a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3440b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3441c;
    public final String[] d;

    static {
        f fVar = f.f3432r;
        f fVar2 = f.f3433s;
        f fVar3 = f.f3434t;
        f fVar4 = f.f3426l;
        f fVar5 = f.f3428n;
        f fVar6 = f.f3427m;
        f fVar7 = f.f3429o;
        f fVar8 = f.f3431q;
        f fVar9 = f.f3430p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f3424j, f.f3425k, f.h, f.i, f.f3422f, f.f3423g, f.f3421e};
        T0 t02 = new T0();
        t02.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        w wVar = w.TLS_1_3;
        w wVar2 = w.TLS_1_2;
        t02.e(wVar, wVar2);
        if (!t02.f2883a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t02.f2884b = true;
        t02.a();
        T0 t03 = new T0();
        t03.c((f[]) Arrays.copyOf(fVarArr, 16));
        t03.e(wVar, wVar2);
        if (!t03.f2883a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t03.f2884b = true;
        f3437e = t03.a();
        T0 t04 = new T0();
        t04.c((f[]) Arrays.copyOf(fVarArr, 16));
        t04.e(wVar, wVar2, w.TLS_1_1, w.TLS_1_0);
        if (!t04.f2883a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t04.f2884b = true;
        t04.a();
        f3438f = new h(false, false, null, null);
    }

    public h(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f3439a = z2;
        this.f3440b = z3;
        this.f3441c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f3441c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f3419b.c(str));
        }
        return V0.g.D0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f3439a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !s1.b.h(strArr, sSLSocket.getEnabledProtocols(), W0.a.f940b)) {
            return false;
        }
        String[] strArr2 = this.f3441c;
        return strArr2 == null || s1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f3420c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i0.g.i(str));
        }
        return V0.g.D0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z2 = hVar.f3439a;
        boolean z3 = this.f3439a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f3441c, hVar.f3441c) && Arrays.equals(this.d, hVar.d) && this.f3440b == hVar.f3440b);
    }

    public final int hashCode() {
        if (!this.f3439a) {
            return 17;
        }
        String[] strArr = this.f3441c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f3440b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f3439a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f3440b + ')';
    }
}
