package o1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f3363a;

    /* renamed from: b, reason: collision with root package name */
    public int f3364b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3365c;
    public boolean d;

    public b(List list) {
        Z0.d.e(list, "connectionSpecs");
        this.f3363a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final k1.i a(SSLSocket sSLSocket) {
        k1.i iVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f3364b;
        List list = this.f3363a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                iVar = null;
                break;
            }
            iVar = (k1.i) list.get(i2);
            if (iVar.b(sSLSocket)) {
                this.f3364b = i2 + 1;
                break;
            }
            i2++;
        }
        if (iVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            Z0.d.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            Z0.d.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f3364b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((k1.i) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f3365c = z2;
        boolean z3 = this.d;
        String[] strArr = iVar.f2809c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            Z0.d.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = l1.b.n(enabledCipherSuites2, strArr, k1.g.f2786c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = iVar.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            Z0.d.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = l1.b.n(enabledProtocols3, r6, S0.a.f748b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Z0.d.d(supportedCipherSuites, "supportedCipherSuites");
        k1.f fVar = k1.g.f2786c;
        byte[] bArr = l1.b.f3252a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (fVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z3 && i != -1) {
            Z0.d.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            Z0.d.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            Z0.d.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        k1.h hVar = new k1.h();
        hVar.f2802a = iVar.f2807a;
        hVar.f2804c = strArr;
        hVar.d = r6;
        hVar.f2803b = iVar.f2808b;
        Z0.d.d(enabledCipherSuites, "cipherSuitesIntersection");
        hVar.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        Z0.d.d(enabledProtocols, "tlsVersionsIntersection");
        hVar.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        k1.i a2 = hVar.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f2809c);
        }
        return iVar;
    }
}
