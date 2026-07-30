package e8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import r7.AbstractC4980k;
import t7.C5083a;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f37403e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f37404f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37405a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37406b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f37407c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f37408d;

    static {
        f fVar = f.f37387r;
        f fVar2 = f.f37388s;
        f fVar3 = f.f37389t;
        f fVar4 = f.f37381l;
        f fVar5 = f.f37383n;
        f fVar6 = f.f37382m;
        f fVar7 = f.f37384o;
        f fVar8 = f.f37386q;
        f fVar9 = f.f37385p;
        List B8 = AbstractC4980k.B(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
        List B9 = AbstractC4980k.B(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f37379j, f.f37380k, f.f37378h, f.i, f.f37376f, f.f37377g, f.f37375e);
        h hVar = new h();
        f[] fVarArr = (f[]) B8.toArray(new f[0]);
        hVar.b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        A a9 = A.f37337v;
        A a10 = A.f37338w;
        hVar.d(a9, a10);
        if (!hVar.f37399a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f37400b = true;
        hVar.a();
        h hVar2 = new h();
        f[] fVarArr2 = (f[]) B9.toArray(new f[0]);
        hVar2.b((f[]) Arrays.copyOf(fVarArr2, fVarArr2.length));
        hVar2.d(a9, a10);
        if (!hVar2.f37399a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f37400b = true;
        f37403e = hVar2.a();
        h hVar3 = new h();
        f[] fVarArr3 = (f[]) B9.toArray(new f[0]);
        hVar3.b((f[]) Arrays.copyOf(fVarArr3, fVarArr3.length));
        hVar3.d(a9, a10, A.f37339x, A.f37340y);
        if (!hVar3.f37399a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f37400b = true;
        hVar3.a();
        f37404f = new i(false, false, null, null);
    }

    public i(boolean z8, boolean z9, String[] strArr, String[] strArr2) {
        this.f37405a = z8;
        this.f37406b = z9;
        this.f37407c = strArr;
        this.f37408d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.String[]] */
    public final void a(SSLSocket sSLSocket, boolean z8) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        kotlin.jvm.internal.h.b(enabledCipherSuites);
        String[] strArr = this.f37407c;
        if (strArr != null) {
            enabledCipherSuites = f8.c.h(f.f37373c, strArr, enabledCipherSuites);
        }
        ?? r22 = this.f37408d;
        if (r22 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.h.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = f8.c.h(C5083a.f40951u, enabledProtocols2, r22);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.h.b(supportedCipherSuites);
        e eVar = f.f37373c;
        byte[] bArr = f8.c.f37814a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (eVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z8 && i != -1) {
            String str = supportedCipherSuites[i];
            kotlin.jvm.internal.h.d(str, "get(...)");
            kotlin.jvm.internal.h.e(enabledCipherSuites, "<this>");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        h hVar = new h();
        hVar.f37399a = this.f37405a;
        hVar.f37401c = strArr;
        hVar.f37402d = r22;
        hVar.f37400b = this.f37406b;
        hVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        i a9 = hVar.a();
        if (a9.c() != null) {
            sSLSocket.setEnabledProtocols(a9.f37408d);
        }
        if (a9.b() != null) {
            sSLSocket.setEnabledCipherSuites(a9.f37407c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f37407c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f37372b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f37408d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            A.f37336u.getClass();
            arrayList.add(C4484b.c(str));
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
        boolean z8 = iVar.f37405a;
        boolean z9 = this.f37405a;
        if (z9 != z8) {
            return false;
        }
        if (z9) {
            return Arrays.equals(this.f37407c, iVar.f37407c) && Arrays.equals(this.f37408d, iVar.f37408d) && this.f37406b == iVar.f37406b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f37405a) {
            return 17;
        }
        String[] strArr = this.f37407c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f37408d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f37406b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f37405a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f37406b + ')';
    }
}
