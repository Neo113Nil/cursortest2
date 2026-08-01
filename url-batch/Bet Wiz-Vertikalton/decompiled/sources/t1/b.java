package t1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.T0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f3730a;

    /* renamed from: b, reason: collision with root package name */
    public int f3731b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3732c;
    public boolean d;

    public b(List list) {
        e1.d.e(list, "connectionSpecs");
        this.f3730a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final p1.h a(SSLSocket sSLSocket) {
        p1.h hVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f3731b;
        List list = this.f3730a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                hVar = null;
                break;
            }
            hVar = (p1.h) list.get(i2);
            if (hVar.b(sSLSocket)) {
                this.f3731b = i2 + 1;
                break;
            }
            i2++;
        }
        if (hVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            e1.d.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            e1.d.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f3731b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((p1.h) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f3732c = z2;
        boolean z3 = this.d;
        String[] strArr = hVar.f3341c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            e1.d.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = q1.b.n(enabledCipherSuites2, strArr, p1.f.f3320c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = hVar.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            e1.d.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = q1.b.n(enabledProtocols3, r6, X0.a.f1123b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        e1.d.d(supportedCipherSuites, "supportedCipherSuites");
        p1.e eVar = p1.f.f3320c;
        byte[] bArr = q1.b.f3491a;
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
            e1.d.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            e1.d.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            e1.d.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        T0 t02 = new T0();
        t02.f2919a = hVar.f3339a;
        t02.f2921c = strArr;
        t02.d = r6;
        t02.f2920b = hVar.f3340b;
        e1.d.d(enabledCipherSuites, "cipherSuitesIntersection");
        t02.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        e1.d.d(enabledProtocols, "tlsVersionsIntersection");
        t02.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        p1.h a2 = t02.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f3341c);
        }
        return hVar;
    }
}
