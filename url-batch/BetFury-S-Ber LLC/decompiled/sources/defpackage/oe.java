package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class oe {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public oe(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.String[]] */
    public final ne a(SSLSocket sSLSocket) {
        ne neVar;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                neVar = null;
                break;
            }
            neVar = (ne) list.get(i2);
            if (neVar.b(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (neVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            String arrays = Arrays.toString(enabledProtocols2);
            arrays.getClass();
            sb.append(", supported protocols=");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((ne) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.c = z;
        boolean z2 = this.d;
        ?? r0 = neVar.d;
        String[] strArr = neVar.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            enabledCipherSuites2.getClass();
            enabledCipherSuites = zk0.m(enabledCipherSuites2, strArr, zb.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (r0 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            enabledProtocols3.getClass();
            enabledProtocols = zk0.m(enabledProtocols3, r0, f30.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        yb ybVar = zb.c;
        byte[] bArr = zk0.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (ybVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            enabledCipherSuites.getClass();
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        me meVar = new me();
        meVar.a = neVar.a;
        meVar.c = strArr;
        meVar.d = r0;
        meVar.b = neVar.b;
        enabledCipherSuites.getClass();
        meVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        enabledProtocols.getClass();
        meVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        ne a = meVar.a();
        if (a.c() != null) {
            sSLSocket.setEnabledProtocols(a.d);
        }
        if (a.a() != null) {
            sSLSocket.setEnabledCipherSuites(a.c);
        }
        return neVar;
    }
}
