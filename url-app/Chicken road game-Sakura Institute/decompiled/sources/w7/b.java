package w7;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f9530a;

    /* renamed from: b, reason: collision with root package name */
    public int f9531b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9532c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9533d;

    public b(List list) {
        r6.k.f(list, "connectionSpecs");
        this.f9530a = list;
    }

    public final s7.h a(SSLSocket sSLSocket) {
        s7.h hVar;
        int i7;
        boolean z8;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i8 = this.f9531b;
        List list = this.f9530a;
        int size = list.size();
        while (true) {
            if (i8 >= size) {
                hVar = null;
                break;
            }
            hVar = (s7.h) list.get(i8);
            if (hVar.b(sSLSocket)) {
                this.f9531b = i8 + 1;
                break;
            }
            i8++;
        }
        if (hVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f9533d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            r6.k.c(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            r6.k.e(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i9 = this.f9531b;
        int size2 = list.size();
        while (true) {
            i7 = 0;
            if (i9 >= size2) {
                z8 = false;
                break;
            }
            if (((s7.h) list.get(i9)).b(sSLSocket)) {
                z8 = true;
                break;
            }
            i9++;
        }
        this.f9532c = z8;
        boolean z9 = this.f9533d;
        String[] strArr = hVar.f8588d;
        String[] strArr2 = hVar.f8587c;
        if (strArr2 != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            r6.k.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = t7.b.n(enabledCipherSuites2, strArr2, s7.f.f8560c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            r6.k.e(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = t7.b.n(enabledProtocols3, strArr, g6.b.f4472b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        r6.k.e(supportedCipherSuites, "supportedCipherSuites");
        s7.e eVar = s7.f.f8560c;
        byte[] bArr = t7.b.f8932a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (eVar.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i7++;
        }
        if (z9 && i7 != -1) {
            r6.k.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i7];
            r6.k.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            r6.k.e(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        s7.g gVar = new s7.g();
        gVar.f8579a = hVar.f8585a;
        gVar.f8580b = strArr2;
        gVar.f8581c = strArr;
        gVar.f8582d = hVar.f8586b;
        r6.k.e(enabledCipherSuites, "cipherSuitesIntersection");
        gVar.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        r6.k.e(enabledProtocols, "tlsVersionsIntersection");
        gVar.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        s7.h a3 = gVar.a();
        if (a3.c() != null) {
            sSLSocket.setEnabledProtocols(a3.f8588d);
        }
        if (a3.a() != null) {
            sSLSocket.setEnabledCipherSuites(a3.f8587c);
        }
        return hVar;
    }
}
