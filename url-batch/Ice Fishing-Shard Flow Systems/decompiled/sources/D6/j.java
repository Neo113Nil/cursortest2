package D6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final j f517e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f518f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f519a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f520b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f521c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f522d;

    static {
        C0099g c0099g = C0099g.f501r;
        C0099g c0099g2 = C0099g.f502s;
        C0099g c0099g3 = C0099g.f503t;
        C0099g c0099g4 = C0099g.f495l;
        C0099g c0099g5 = C0099g.f497n;
        C0099g c0099g6 = C0099g.f496m;
        C0099g c0099g7 = C0099g.f498o;
        C0099g c0099g8 = C0099g.f500q;
        C0099g c0099g9 = C0099g.f499p;
        List d7 = kotlin.collections.r.d(c0099g, c0099g2, c0099g3, c0099g4, c0099g5, c0099g6, c0099g7, c0099g8, c0099g9);
        List d8 = kotlin.collections.r.d(c0099g, c0099g2, c0099g3, c0099g4, c0099g5, c0099g6, c0099g7, c0099g8, c0099g9, C0099g.j, C0099g.f494k, C0099g.f492h, C0099g.f493i, C0099g.f490f, C0099g.f491g, C0099g.f489e);
        i iVar = new i();
        C0099g[] c0099gArr = (C0099g[]) d7.toArray(new C0099g[0]);
        iVar.b((C0099g[]) Arrays.copyOf(c0099gArr, c0099gArr.length));
        G g7 = G.f448i;
        G g8 = G.f449l;
        iVar.d(g7, g8);
        if (!iVar.f513a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar.f514b = true;
        iVar.a();
        i iVar2 = new i();
        C0099g[] c0099gArr2 = (C0099g[]) d8.toArray(new C0099g[0]);
        iVar2.b((C0099g[]) Arrays.copyOf(c0099gArr2, c0099gArr2.length));
        iVar2.d(g7, g8);
        if (!iVar2.f513a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar2.f514b = true;
        f517e = iVar2.a();
        i iVar3 = new i();
        C0099g[] c0099gArr3 = (C0099g[]) d8.toArray(new C0099g[0]);
        iVar3.b((C0099g[]) Arrays.copyOf(c0099gArr3, c0099gArr3.length));
        iVar3.d(g7, g8, G.f450m, G.f451n);
        if (!iVar3.f513a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        iVar3.f514b = true;
        iVar3.a();
        f518f = new j(false, false, null, null);
    }

    public j(boolean z7, boolean z8, String[] strArr, String[] strArr2) {
        this.f519a = z7;
        this.f520b = z8;
        this.f521c = strArr;
        this.f522d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    public final void a(SSLSocket sslSocket, boolean z7) {
        String[] enabledProtocols;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] socketEnabledCipherSuites = sslSocket.getEnabledCipherSuites();
        Intrinsics.b(socketEnabledCipherSuites);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        String[] strArr = this.f521c;
        if (strArr != null) {
            socketEnabledCipherSuites = E6.c.h(strArr, socketEnabledCipherSuites, C0099g.f487c);
        }
        ?? r32 = this.f522d;
        if (r32 != 0) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            T5.a aVar = T5.a.f2600a;
            Intrinsics.c(aVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            enabledProtocols = E6.c.h(enabledProtocols2, r32, aVar);
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.b(supportedCipherSuites);
        C0098f comparator = C0099g.f487c;
        byte[] bArr = E6.c.f709a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i2++;
            }
        }
        if (z7 && i2 != -1) {
            String value = supportedCipherSuites[i2];
            Intrinsics.checkNotNullExpressionValue(value, "get(...)");
            Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(socketEnabledCipherSuites, socketEnabledCipherSuites.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            socketEnabledCipherSuites = (String[]) copyOf;
            Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "<this>");
            socketEnabledCipherSuites[socketEnabledCipherSuites.length - 1] = value;
        }
        Intrinsics.checkNotNullParameter(this, "connectionSpec");
        i iVar = new i();
        iVar.f513a = this.f519a;
        iVar.f515c = strArr;
        iVar.f516d = r32;
        iVar.f514b = this.f520b;
        iVar.c((String[]) Arrays.copyOf(socketEnabledCipherSuites, socketEnabledCipherSuites.length));
        iVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        j a7 = iVar.a();
        if (a7.c() != null) {
            sslSocket.setEnabledProtocols(a7.f522d);
        }
        if (a7.b() != null) {
            sslSocket.setEnabledCipherSuites(a7.f521c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f521c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0099g.f486b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f522d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            G.f447e.getClass();
            arrayList.add(l.c(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z7 = jVar.f519a;
        boolean z8 = this.f519a;
        if (z8 != z7) {
            return false;
        }
        if (z8) {
            return Arrays.equals(this.f521c, jVar.f521c) && Arrays.equals(this.f522d, jVar.f522d) && this.f520b == jVar.f520b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f519a) {
            return 17;
        }
        String[] strArr = this.f521c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f522d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f520b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f519a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f520b + ')';
    }
}
