package w1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m.Z0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f4207a;

    /* renamed from: b, reason: collision with root package name */
    public int f4208b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4209c;
    public boolean d;

    public b(List list) {
        h1.d.e(list, "connectionSpecs");
        this.f4207a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final s1.g a(SSLSocket sSLSocket) {
        s1.g gVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f4208b;
        List list = this.f4207a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                gVar = null;
                break;
            }
            gVar = (s1.g) list.get(i2);
            if (gVar.b(sSLSocket)) {
                this.f4208b = i2 + 1;
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
            h1.d.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            h1.d.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f4208b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((s1.g) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f4209c = z2;
        boolean z3 = this.d;
        String[] strArr = gVar.f3625c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            h1.d.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = t1.b.n(enabledCipherSuites2, strArr, s1.f.f3604c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = gVar.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            h1.d.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = t1.b.n(enabledProtocols3, r6, X0.a.f983b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        h1.d.d(supportedCipherSuites, "supportedCipherSuites");
        s1.e eVar = s1.f.f3604c;
        byte[] bArr = t1.b.f3898a;
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
            h1.d.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            h1.d.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            h1.d.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        Z0 z02 = new Z0();
        z02.f3062a = gVar.f3623a;
        z02.f3064c = strArr;
        z02.d = r6;
        z02.f3063b = gVar.f3624b;
        h1.d.d(enabledCipherSuites, "cipherSuitesIntersection");
        z02.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        h1.d.d(enabledProtocols, "tlsVersionsIntersection");
        z02.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        s1.g a2 = z02.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f3625c);
        }
        return gVar;
    }
}
