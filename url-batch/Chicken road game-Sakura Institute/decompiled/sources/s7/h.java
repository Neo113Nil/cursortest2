package s7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f8583e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f8584f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8585a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8586b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f8587c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f8588d;

    static {
        f fVar = f.f8575r;
        f fVar2 = f.f8576s;
        f fVar3 = f.f8577t;
        f fVar4 = f.f8569l;
        f fVar5 = f.f8571n;
        f fVar6 = f.f8570m;
        f fVar7 = f.f8572o;
        f fVar8 = f.f8574q;
        f fVar9 = f.f8573p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9};
        f[] fVarArr2 = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f8567j, f.f8568k, f.f8565h, f.f8566i, f.f8563f, f.f8564g, f.f8562e};
        g gVar = new g();
        gVar.c((f[]) Arrays.copyOf(fVarArr, 9));
        w wVar = w.f8701g;
        w wVar2 = w.f8702h;
        gVar.e(wVar, wVar2);
        gVar.f8582d = true;
        gVar.a();
        g gVar2 = new g();
        gVar2.c((f[]) Arrays.copyOf(fVarArr2, 16));
        gVar2.e(wVar, wVar2);
        gVar2.f8582d = true;
        f8583e = gVar2.a();
        g gVar3 = new g();
        gVar3.c((f[]) Arrays.copyOf(fVarArr2, 16));
        gVar3.e(wVar, wVar2, w.f8703i, w.f8704j);
        gVar3.f8582d = true;
        gVar3.a();
        f8584f = new h(false, false, null, null);
    }

    public h(boolean z8, boolean z9, String[] strArr, String[] strArr2) {
        this.f8585a = z8;
        this.f8586b = z9;
        this.f8587c = strArr;
        this.f8588d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f8587c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f8559b.c(str));
        }
        return e6.l.w0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f8585a) {
            return false;
        }
        String[] strArr = this.f8588d;
        if (strArr != null && !t7.b.h(strArr, sSLSocket.getEnabledProtocols(), g6.b.f4472b)) {
            return false;
        }
        String[] strArr2 = this.f8587c;
        return strArr2 == null || t7.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f8560c);
    }

    public final List c() {
        String[] strArr = this.f8588d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(t6.a.z(str));
        }
        return e6.l.w0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z8 = hVar.f8585a;
        boolean z9 = this.f8585a;
        if (z9 != z8) {
            return false;
        }
        if (z9) {
            return Arrays.equals(this.f8587c, hVar.f8587c) && Arrays.equals(this.f8588d, hVar.f8588d) && this.f8586b == hVar.f8586b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f8585a) {
            return 17;
        }
        String[] strArr = this.f8587c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f8588d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f8586b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f8585a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f8586b + ')';
    }
}
