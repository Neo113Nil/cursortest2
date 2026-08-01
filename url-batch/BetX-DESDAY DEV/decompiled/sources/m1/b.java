package m1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f3539a;

    /* renamed from: b, reason: collision with root package name */
    public int f3540b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3541c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3542d;

    public b(List list) {
        X0.f.e(list, "connectionSpecs");
        this.f3539a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final i1.j a(SSLSocket sSLSocket) {
        i1.j jVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f3540b;
        List list = this.f3539a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                jVar = null;
                break;
            }
            jVar = (i1.j) list.get(i2);
            if (jVar.b(sSLSocket)) {
                this.f3540b = i2 + 1;
                break;
            }
            i2++;
        }
        if (jVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f3542d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            X0.f.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            X0.f.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f3540b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((i1.j) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f3541c = z2;
        boolean z3 = this.f3542d;
        String[] strArr = jVar.f2689c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            X0.f.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = j1.b.n(enabledCipherSuites2, strArr, i1.h.f2664c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = jVar.f2690d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            X0.f.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = j1.b.n(enabledProtocols3, r6, P0.a.f699b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        X0.f.d(supportedCipherSuites, "supportedCipherSuites");
        i1.g gVar = i1.h.f2664c;
        byte[] bArr = j1.b.f2971a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (gVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z3 && i != -1) {
            X0.f.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            X0.f.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            X0.f.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        i1.i iVar = new i1.i();
        iVar.f2681a = jVar.f2687a;
        iVar.f2683c = strArr;
        iVar.f2684d = r6;
        iVar.f2682b = jVar.f2688b;
        X0.f.d(enabledCipherSuites, "cipherSuitesIntersection");
        iVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        X0.f.d(enabledProtocols, "tlsVersionsIntersection");
        iVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        i1.j a2 = iVar.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.f2690d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f2689c);
        }
        return jVar;
    }
}
