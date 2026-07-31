package X5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l5.AbstractC0507k;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f2940e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f2941f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2942a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2943b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2944c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2945d;

    static {
        f fVar = f.f2924r;
        f fVar2 = f.f2925s;
        f fVar3 = f.f2926t;
        f fVar4 = f.f2918l;
        f fVar5 = f.f2920n;
        f fVar6 = f.f2919m;
        f fVar7 = f.f2921o;
        f fVar8 = f.f2923q;
        f fVar9 = f.f2922p;
        List z5 = AbstractC0507k.z(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
        List z6 = AbstractC0507k.z(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f2916j, f.f2917k, f.f2914h, f.f2915i, f.f2912f, f.f2913g, f.f2911e);
        h hVar = new h();
        f[] fVarArr = (f[]) z5.toArray(new f[0]);
        hVar.b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        A a7 = A.f2870h;
        A a8 = A.f2871i;
        hVar.d(a7, a8);
        if (!hVar.f2936a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f2937b = true;
        hVar.a();
        h hVar2 = new h();
        f[] fVarArr2 = (f[]) z6.toArray(new f[0]);
        hVar2.b((f[]) Arrays.copyOf(fVarArr2, fVarArr2.length));
        hVar2.d(a7, a8);
        if (!hVar2.f2936a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f2937b = true;
        f2940e = hVar2.a();
        h hVar3 = new h();
        f[] fVarArr3 = (f[]) z6.toArray(new f[0]);
        hVar3.b((f[]) Arrays.copyOf(fVarArr3, fVarArr3.length));
        hVar3.d(a7, a8, A.f2872j, A.f2873k);
        if (!hVar3.f2936a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f2937b = true;
        hVar3.a();
        f2941f = new i(false, false, null, null);
    }

    public i(boolean z5, boolean z6, String[] strArr, String[] strArr2) {
        this.f2942a = z5;
        this.f2943b = z6;
        this.f2944c = strArr;
        this.f2945d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.String[]] */
    public final void a(SSLSocket sSLSocket, boolean z5) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        kotlin.jvm.internal.i.b(enabledCipherSuites);
        String[] strArr = this.f2944c;
        if (strArr != null) {
            enabledCipherSuites = Y5.c.h(strArr, enabledCipherSuites, f.f2909c);
        }
        ?? r22 = this.f2945d;
        if (r22 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = Y5.c.h(enabledProtocols2, r22, n5.a.f5505b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.i.b(supportedCipherSuites);
        e eVar = f.f2909c;
        byte[] bArr = Y5.c.f3099a;
        int length = supportedCipherSuites.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            } else if (eVar.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (z5 && i7 != -1) {
            String str = supportedCipherSuites[i7];
            kotlin.jvm.internal.i.d(str, "get(...)");
            kotlin.jvm.internal.i.e(enabledCipherSuites, "<this>");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        h hVar = new h();
        hVar.f2936a = this.f2942a;
        hVar.f2938c = strArr;
        hVar.f2939d = r22;
        hVar.f2937b = this.f2943b;
        hVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        i a7 = hVar.a();
        if (a7.c() != null) {
            sSLSocket.setEnabledProtocols(a7.f2945d);
        }
        if (a7.b() != null) {
            sSLSocket.setEnabledCipherSuites(a7.f2944c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f2944c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f2908b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f2945d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            A.f2869g.getClass();
            arrayList.add(C0218b.c(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z5 = iVar.f2942a;
        boolean z6 = this.f2942a;
        if (z6 != z5) {
            return false;
        }
        if (z6) {
            return Arrays.equals(this.f2944c, iVar.f2944c) && Arrays.equals(this.f2945d, iVar.f2945d) && this.f2943b == iVar.f2943b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f2942a) {
            return 17;
        }
        String[] strArr = this.f2944c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f2945d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2943b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2942a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2943b + ')';
    }
}
