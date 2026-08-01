package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ed {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public ed(List list) {
        list.getClass();
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.String[]] */
    public final dd a(SSLSocket sSLSocket) {
        dd ddVar;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                ddVar = null;
                break;
            }
            ddVar = (dd) list.get(i2);
            if (ddVar.b(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (ddVar == null) {
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
            if (((dd) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.c = z;
        boolean z2 = this.d;
        ?? r0 = ddVar.d;
        String[] strArr = ddVar.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            enabledCipherSuites2.getClass();
            enabledCipherSuites = cb0.m(enabledCipherSuites2, strArr, db.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (r0 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            enabledProtocols3.getClass();
            enabledProtocols = cb0.m(enabledProtocols3, r0, sx.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        cb cbVar = db.c;
        byte[] bArr = cb0.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (cbVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
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
        cd cdVar = new cd();
        cdVar.a = ddVar.a;
        cdVar.c = strArr;
        cdVar.d = r0;
        cdVar.b = ddVar.b;
        enabledCipherSuites.getClass();
        cdVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        enabledProtocols.getClass();
        cdVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        dd a = cdVar.a();
        if (a.c() != null) {
            sSLSocket.setEnabledProtocols(a.d);
        }
        if (a.a() != null) {
            sSLSocket.setEnabledCipherSuites(a.c);
        }
        return ddVar;
    }
}
