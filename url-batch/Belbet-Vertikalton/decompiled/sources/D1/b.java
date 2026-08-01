package D1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import n.Y0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f204a;

    /* renamed from: b, reason: collision with root package name */
    public int f205b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f206c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f207d;

    public b(List list) {
        j1.h.e(list, "connectionSpecs");
        this.f204a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final z1.i a(SSLSocket sSLSocket) {
        z1.i iVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f205b;
        List list = this.f204a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                iVar = null;
                break;
            }
            iVar = (z1.i) list.get(i2);
            if (iVar.b(sSLSocket)) {
                this.f205b = i2 + 1;
                break;
            }
            i2++;
        }
        if (iVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f207d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            j1.h.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            j1.h.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f205b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((z1.i) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f206c = z2;
        boolean z3 = this.f207d;
        String[] strArr = iVar.f4851c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            j1.h.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = A1.c.n(enabledCipherSuites2, strArr, z1.h.f4832c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = iVar.f4852d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            j1.h.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = A1.c.n(enabledProtocols3, r6, Z0.a.f1652b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        j1.h.d(supportedCipherSuites, "supportedCipherSuites");
        z1.g gVar = z1.h.f4832c;
        byte[] bArr = A1.c.f19a;
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
            j1.h.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            j1.h.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            j1.h.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        Y0 y02 = new Y0();
        y02.f3589a = iVar.f4849a;
        y02.f3591c = strArr;
        y02.f3592d = r6;
        y02.f3590b = iVar.f4850b;
        j1.h.d(enabledCipherSuites, "cipherSuitesIntersection");
        y02.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        j1.h.d(enabledProtocols, "tlsVersionsIntersection");
        y02.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        z1.i a2 = y02.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.f4852d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f4851c);
        }
        return iVar;
    }
}
