package g3;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f1922a;

    /* renamed from: b, reason: collision with root package name */
    public int f1923b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1924d;

    public b(List list) {
        u2.c.e(list, "connectionSpecs");
        this.f1922a = list;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, java.lang.String[]] */
    public final c3.h a(SSLSocket sSLSocket) {
        c3.h hVar;
        int i4;
        boolean z3;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i5 = this.f1923b;
        List list = this.f1922a;
        int size = list.size();
        while (true) {
            if (i5 >= size) {
                hVar = null;
                break;
            }
            hVar = (c3.h) list.get(i5);
            if (hVar.b(sSLSocket)) {
                this.f1923b = i5 + 1;
                break;
            }
            i5++;
        }
        if (hVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f1924d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            u2.c.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            u2.c.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i6 = this.f1923b;
        int size2 = list.size();
        while (true) {
            i4 = 0;
            if (i6 >= size2) {
                z3 = false;
                break;
            }
            if (((c3.h) list.get(i6)).b(sSLSocket)) {
                z3 = true;
                break;
            }
            i6++;
        }
        this.c = z3;
        boolean z4 = this.f1924d;
        ?? r12 = hVar.f1054d;
        String[] strArr = hVar.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            u2.c.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = d3.c.m(enabledCipherSuites2, strArr, c3.f.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (r12 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            u2.c.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = d3.c.m(enabledProtocols3, r12, o2.a.f2991b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        u2.c.d(supportedCipherSuites, "supportedCipherSuites");
        c3.e eVar = c3.f.c;
        byte[] bArr = d3.c.f1490a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (eVar.compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i4++;
        }
        if (z4 && i4 != -1) {
            u2.c.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i4];
            u2.c.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            u2.c.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        c3.g gVar = new c3.g();
        gVar.f1047a = hVar.f1052a;
        gVar.c = strArr;
        gVar.f1049d = r12;
        gVar.f1048b = hVar.f1053b;
        u2.c.d(enabledCipherSuites, "cipherSuitesIntersection");
        gVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        u2.c.d(enabledProtocols, "tlsVersionsIntersection");
        gVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        c3.h a4 = gVar.a();
        if (a4.c() != null) {
            sSLSocket.setEnabledProtocols(a4.f1054d);
        }
        if (a4.a() != null) {
            sSLSocket.setEnabledCipherSuites(a4.c);
        }
        return hVar;
    }
}
