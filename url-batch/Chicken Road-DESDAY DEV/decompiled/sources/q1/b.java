package q1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.U0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f3444a;

    /* renamed from: b, reason: collision with root package name */
    public int f3445b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3446c;
    public boolean d;

    public b(List list) {
        b1.d.e(list, "connectionSpecs");
        this.f3444a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final m1.g a(SSLSocket sSLSocket) {
        m1.g gVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f3445b;
        List list = this.f3444a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                gVar = null;
                break;
            }
            gVar = (m1.g) list.get(i2);
            if (gVar.b(sSLSocket)) {
                this.f3445b = i2 + 1;
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
            b1.d.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            b1.d.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f3445b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((m1.g) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f3446c = z2;
        boolean z3 = this.d;
        String[] strArr = gVar.f3161c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            b1.d.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = n1.b.n(enabledCipherSuites2, strArr, m1.f.f3141c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = gVar.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            b1.d.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = n1.b.n(enabledProtocols3, r6, U0.a.f832b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        b1.d.d(supportedCipherSuites, "supportedCipherSuites");
        m1.e eVar = m1.f.f3141c;
        byte[] bArr = n1.b.f3286a;
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
            b1.d.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            b1.d.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            b1.d.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        U0 u02 = new U0();
        u02.f2867a = gVar.f3159a;
        u02.f2869c = strArr;
        u02.d = r6;
        u02.f2868b = gVar.f3160b;
        b1.d.d(enabledCipherSuites, "cipherSuitesIntersection");
        u02.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        b1.d.d(enabledProtocols, "tlsVersionsIntersection");
        u02.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        m1.g a2 = u02.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f3161c);
        }
        return gVar;
    }
}
