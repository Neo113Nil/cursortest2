package m3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f8365e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f8366f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8367a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8368b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f8369c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f8370d;

    static {
        f fVar = f.f8357r;
        f fVar2 = f.f8358s;
        f fVar3 = f.f8359t;
        f fVar4 = f.f8351l;
        f fVar5 = f.f8353n;
        f fVar6 = f.f8352m;
        f fVar7 = f.f8354o;
        f fVar8 = f.f8356q;
        f fVar9 = f.f8355p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f8349j, f.f8350k, f.f8347h, f.f8348i, f.f8345f, f.f8346g, f.f8344e};
        g gVar = new g();
        gVar.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        A a4 = A.TLS_1_3;
        A a5 = A.TLS_1_2;
        gVar.e(a4, a5);
        if (!gVar.f8361a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar.f8364d = true;
        gVar.a();
        g gVar2 = new g();
        gVar2.c((f[]) Arrays.copyOf(fVarArr, 16));
        gVar2.e(a4, a5);
        if (!gVar2.f8361a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar2.f8364d = true;
        f8365e = gVar2.a();
        g gVar3 = new g();
        gVar3.c((f[]) Arrays.copyOf(fVarArr, 16));
        gVar3.e(a4, a5, A.TLS_1_1, A.TLS_1_0);
        if (!gVar3.f8361a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar3.f8364d = true;
        gVar3.a();
        f8366f = new h(false, false, null, null);
    }

    public h(boolean z4, boolean z5, String[] strArr, String[] strArr2) {
        this.f8367a = z4;
        this.f8368b = z5;
        this.f8369c = strArr;
        this.f8370d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f8369c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f8341b.c(str));
        }
        return C1403G.H(arrayList);
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f8367a) {
            return false;
        }
        String[] strArr = this.f8370d;
        if (strArr != null && !n3.b.i(strArr, socket.getEnabledProtocols(), B2.b.b())) {
            return false;
        }
        String[] strArr2 = this.f8369c;
        return strArr2 == null || n3.b.i(strArr2, socket.getEnabledCipherSuites(), f.f8342c);
    }

    public final List c() {
        String[] strArr = this.f8370d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(z.k(str));
        }
        return C1403G.H(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z4 = hVar.f8367a;
        boolean z5 = this.f8367a;
        if (z5 != z4) {
            return false;
        }
        return !z5 || (Arrays.equals(this.f8369c, hVar.f8369c) && Arrays.equals(this.f8370d, hVar.f8370d) && this.f8368b == hVar.f8368b);
    }

    public final int hashCode() {
        if (!this.f8367a) {
            return 17;
        }
        String[] strArr = this.f8369c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f8370d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f8368b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f8367a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f8368b + ')';
    }
}
