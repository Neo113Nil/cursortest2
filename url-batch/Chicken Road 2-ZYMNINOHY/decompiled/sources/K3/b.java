package K3;

import e3.C0409a;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f1528a;

    /* renamed from: b, reason: collision with root package name */
    public int f1529b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1530c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1531d;

    public b(List connectionSpecs) {
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        this.f1528a = connectionSpecs;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public final G3.i a(SSLSocket sSLSocket) {
        G3.i iVar;
        int i4;
        boolean z;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i5 = this.f1529b;
        List list = this.f1528a;
        int size = list.size();
        while (true) {
            if (i5 >= size) {
                iVar = null;
                break;
            }
            int i6 = i5 + 1;
            iVar = (G3.i) list.get(i5);
            if (iVar.b(sSLSocket)) {
                this.f1529b = i6;
                break;
            }
            i5 = i6;
        }
        if (iVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f1531d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.b(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            kotlin.jvm.internal.i.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i7 = this.f1529b;
        int size2 = list.size();
        while (true) {
            i4 = 0;
            if (i7 >= size2) {
                z = false;
                break;
            }
            int i8 = i7 + 1;
            if (((G3.i) list.get(i7)).b(sSLSocket)) {
                z = true;
                break;
            }
            i7 = i8;
        }
        this.f1530c = z;
        boolean z4 = this.f1531d;
        ?? r22 = iVar.f916d;
        String[] strArr = iVar.f915c;
        if (strArr != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.i.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = H3.b.n(enabledCipherSuites, strArr, G3.g.f890c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (r22 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.d(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = H3.b.n(enabledProtocols2, r22, C0409a.f8467b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.i.d(supportedCipherSuites, "supportedCipherSuites");
        G3.f fVar = G3.g.f890c;
        byte[] bArr = H3.b.f1103a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (fVar.compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i4++;
        }
        if (z4 && i4 != -1) {
            kotlin.jvm.internal.i.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i4];
            kotlin.jvm.internal.i.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) copyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        G3.h hVar = new G3.h();
        hVar.f907a = iVar.f913a;
        hVar.f909c = strArr;
        hVar.f910d = r22;
        hVar.f908b = iVar.f914b;
        kotlin.jvm.internal.i.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        hVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.i.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        hVar.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        G3.i a3 = hVar.a();
        if (a3.c() != null) {
            sSLSocket.setEnabledProtocols(a3.f916d);
        }
        if (a3.a() != null) {
            sSLSocket.setEnabledCipherSuites(a3.f915c);
        }
        return iVar;
    }
}
