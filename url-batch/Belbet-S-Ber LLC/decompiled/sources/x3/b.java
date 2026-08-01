package x3;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.q2;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f3891a;

    /* renamed from: b, reason: collision with root package name */
    public int f3892b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3893c;
    public boolean d;

    public b(List list) {
        i3.d.e(list, "connectionSpecs");
        this.f3891a = list;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, java.lang.String[]] */
    public final t3.g a(SSLSocket sSLSocket) {
        t3.g gVar;
        int i;
        boolean z4;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i4 = this.f3892b;
        List list = this.f3891a;
        int size = list.size();
        while (true) {
            if (i4 >= size) {
                gVar = null;
                break;
            }
            gVar = (t3.g) list.get(i4);
            if (gVar.b(sSLSocket)) {
                this.f3892b = i4 + 1;
                break;
            }
            i4++;
        }
        if (gVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            i3.d.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            i3.d.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i5 = this.f3892b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i5 >= size2) {
                z4 = false;
                break;
            }
            if (((t3.g) list.get(i5)).b(sSLSocket)) {
                z4 = true;
                break;
            }
            i5++;
        }
        this.f3893c = z4;
        boolean z5 = this.d;
        ?? r12 = gVar.d;
        String[] strArr = gVar.f3439c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            i3.d.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = u3.b.m(enabledCipherSuites2, strArr, t3.f.f3419c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (r12 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            i3.d.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = u3.b.m(enabledProtocols3, r12, z2.a.f4147b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        i3.d.d(supportedCipherSuites, "supportedCipherSuites");
        t3.e eVar = t3.f.f3419c;
        byte[] bArr = u3.b.f3581a;
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
        if (z5 && i != -1) {
            i3.d.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            i3.d.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            i3.d.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        q2 q2Var = new q2();
        q2Var.f2545a = gVar.f3437a;
        q2Var.f2547c = strArr;
        q2Var.d = r12;
        q2Var.f2546b = gVar.f3438b;
        i3.d.d(enabledCipherSuites, "cipherSuitesIntersection");
        q2Var.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        i3.d.d(enabledProtocols, "tlsVersionsIntersection");
        q2Var.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        t3.g a5 = q2Var.a();
        if (a5.c() != null) {
            sSLSocket.setEnabledProtocols(a5.d);
        }
        if (a5.a() != null) {
            sSLSocket.setEnabledCipherSuites(a5.f3439c);
        }
        return gVar;
    }
}
