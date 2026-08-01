package D1;

import a1.C0059a;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.S0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f149a;

    /* renamed from: b, reason: collision with root package name */
    public int f150b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f151c;
    public boolean d;

    public b(List list) {
        k1.e.e(list, "connectionSpecs");
        this.f149a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final z1.g a(SSLSocket sSLSocket) {
        z1.g gVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f150b;
        List list = this.f149a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                gVar = null;
                break;
            }
            gVar = (z1.g) list.get(i2);
            if (gVar.b(sSLSocket)) {
                this.f150b = i2 + 1;
                break;
            }
            i2++;
        }
        if (gVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            k1.e.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            k1.e.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f150b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((z1.g) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f151c = z2;
        boolean z3 = this.d;
        String[] strArr = gVar.f4671c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            k1.e.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = A1.c.n(enabledCipherSuites2, strArr, z1.f.f4651c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = gVar.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            k1.e.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = A1.c.n(enabledProtocols3, r6, C0059a.f1626b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        k1.e.d(supportedCipherSuites, "supportedCipherSuites");
        z1.e eVar = z1.f.f4651c;
        byte[] bArr = A1.c.f13a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (eVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z3 && i != -1) {
            k1.e.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            k1.e.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            k1.e.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        S0 s0 = new S0();
        s0.f3336a = gVar.f4669a;
        s0.f3338c = strArr;
        s0.d = r6;
        s0.f3337b = gVar.f4670b;
        k1.e.d(enabledCipherSuites, "cipherSuitesIntersection");
        s0.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        k1.e.d(enabledProtocols, "tlsVersionsIntersection");
        s0.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        z1.g a2 = s0.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f4671c);
        }
        return gVar;
    }
}
