package p1;

import j0.AbstractC0142a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l.T0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f3337e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f3338f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3339a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3340b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3341c;
    public final String[] d;

    static {
        f fVar = f.f3332r;
        f fVar2 = f.f3333s;
        f fVar3 = f.f3334t;
        f fVar4 = f.f3326l;
        f fVar5 = f.f3328n;
        f fVar6 = f.f3327m;
        f fVar7 = f.f3329o;
        f fVar8 = f.f3331q;
        f fVar9 = f.f3330p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f3324j, f.f3325k, f.h, f.i, f.f3322f, f.f3323g, f.f3321e};
        T0 t02 = new T0();
        t02.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        w wVar = w.TLS_1_3;
        w wVar2 = w.TLS_1_2;
        t02.e(wVar, wVar2);
        if (!t02.f2919a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t02.f2920b = true;
        t02.a();
        T0 t03 = new T0();
        t03.c((f[]) Arrays.copyOf(fVarArr, 16));
        t03.e(wVar, wVar2);
        if (!t03.f2919a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t03.f2920b = true;
        f3337e = t03.a();
        T0 t04 = new T0();
        t04.c((f[]) Arrays.copyOf(fVarArr, 16));
        t04.e(wVar, wVar2, w.TLS_1_1, w.TLS_1_0);
        if (!t04.f2919a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        t04.f2920b = true;
        t04.a();
        f3338f = new h(false, false, null, null);
    }

    public h(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f3339a = z2;
        this.f3340b = z3;
        this.f3341c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f3341c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f3319b.c(str));
        }
        return W0.h.p0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f3339a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !q1.b.h(strArr, sSLSocket.getEnabledProtocols(), X0.a.f1123b)) {
            return false;
        }
        String[] strArr2 = this.f3341c;
        return strArr2 == null || q1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f3320c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0142a.g(str));
        }
        return W0.h.p0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z2 = hVar.f3339a;
        boolean z3 = this.f3339a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f3341c, hVar.f3341c) && Arrays.equals(this.d, hVar.d) && this.f3340b == hVar.f3340b);
    }

    public final int hashCode() {
        if (!this.f3339a) {
            return 17;
        }
        String[] strArr = this.f3341c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f3340b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f3339a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f3340b + ')';
    }
}
