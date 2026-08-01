package s1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.T0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f3691a;

    /* renamed from: b, reason: collision with root package name */
    public int f3692b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3693c;
    public boolean d;

    public b(List list) {
        d1.d.e(list, "connectionSpecs");
        this.f3691a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final o1.g a(SSLSocket sSLSocket) {
        o1.g gVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f3692b;
        List list = this.f3691a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                gVar = null;
                break;
            }
            gVar = (o1.g) list.get(i2);
            if (gVar.b(sSLSocket)) {
                this.f3692b = i2 + 1;
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
            d1.d.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            d1.d.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f3692b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((o1.g) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f3693c = z2;
        boolean z3 = this.d;
        String[] strArr = gVar.f3295c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            d1.d.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = p1.b.n(enabledCipherSuites2, strArr, o1.f.f3275c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = gVar.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            d1.d.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = p1.b.n(enabledProtocols3, r6, T0.a.f831b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        d1.d.d(supportedCipherSuites, "supportedCipherSuites");
        o1.e eVar = o1.f.f3275c;
        byte[] bArr = p1.b.f3455a;
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
            d1.d.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            d1.d.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            d1.d.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        T0 t02 = new T0();
        t02.f2859a = gVar.f3293a;
        t02.f2861c = strArr;
        t02.d = r6;
        t02.f2860b = gVar.f3294b;
        d1.d.d(enabledCipherSuites, "cipherSuitesIntersection");
        t02.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        d1.d.d(enabledProtocols, "tlsVersionsIntersection");
        t02.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        o1.g a2 = t02.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f3295c);
        }
        return gVar;
    }
}
