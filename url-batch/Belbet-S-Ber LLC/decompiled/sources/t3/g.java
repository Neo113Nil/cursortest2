package t3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l.q2;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f3435e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3436f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3437a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3438b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3439c;
    public final String[] d;

    static {
        f fVar = f.f3431r;
        f fVar2 = f.f3432s;
        f fVar3 = f.f3433t;
        f fVar4 = f.f3425l;
        f fVar5 = f.f3427n;
        f fVar6 = f.f3426m;
        f fVar7 = f.f3428o;
        f fVar8 = f.f3430q;
        f fVar9 = f.f3429p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9};
        f[] fVarArr2 = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f3423j, f.f3424k, f.h, f.i, f.f3421f, f.f3422g, f.f3420e};
        q2 q2Var = new q2();
        q2Var.c((f[]) Arrays.copyOf(fVarArr, 9));
        w wVar = w.TLS_1_3;
        w wVar2 = w.TLS_1_2;
        q2Var.e(wVar, wVar2);
        q2Var.f2546b = true;
        q2Var.a();
        q2 q2Var2 = new q2();
        q2Var2.c((f[]) Arrays.copyOf(fVarArr2, 16));
        q2Var2.e(wVar, wVar2);
        q2Var2.f2546b = true;
        f3435e = q2Var2.a();
        q2 q2Var3 = new q2();
        q2Var3.c((f[]) Arrays.copyOf(fVarArr2, 16));
        q2Var3.e(wVar, wVar2, w.TLS_1_1, w.TLS_1_0);
        q2Var3.f2546b = true;
        q2Var3.a();
        f3436f = new g(false, false, null, null);
    }

    public g(boolean z4, boolean z5, String[] strArr, String[] strArr2) {
        this.f3437a = z4;
        this.f3438b = z5;
        this.f3439c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f3439c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f3418b.c(str));
        }
        return x2.h.G(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f3437a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !u3.b.g(strArr, sSLSocket.getEnabledProtocols(), z2.a.f4147b)) {
            return false;
        }
        String[] strArr2 = this.f3439c;
        return strArr2 == null || u3.b.g(strArr2, sSLSocket.getEnabledCipherSuites(), f.f3419c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(r1.b.j(str));
        }
        return x2.h.G(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        boolean z4 = gVar.f3437a;
        boolean z5 = this.f3437a;
        if (z5 != z4) {
            return false;
        }
        if (z5) {
            return Arrays.equals(this.f3439c, gVar.f3439c) && Arrays.equals(this.d, gVar.d) && this.f3438b == gVar.f3438b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f3437a) {
            return 17;
        }
        String[] strArr = this.f3439c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f3438b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f3437a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f3438b + ')';
    }
}
