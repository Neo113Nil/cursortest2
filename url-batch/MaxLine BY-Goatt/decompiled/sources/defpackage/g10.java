package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g10 {
    public int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public g10(vh3 vh3Var, int i, boolean z, boolean z2) {
        this.d = vh3Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.String[]] */
    public f10 a(SSLSocket sSLSocket) {
        f10 f10Var;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.a;
        List list = (List) this.d;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                f10Var = null;
                break;
            }
            f10Var = (f10) list.get(i2);
            if (f10Var.b(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (f10Var == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.c);
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
        int i3 = this.a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((f10) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.b = z;
        boolean z2 = this.c;
        ?? r0 = f10Var.d;
        String[] strArr = f10Var.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            enabledCipherSuites2.getClass();
            enabledCipherSuites = n33.m(enabledCipherSuites2, strArr, eu.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (r0 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            enabledProtocols3.getClass();
            enabledProtocols = n33.m(enabledProtocols3, r0, bx.b());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        zo0 zo0Var = eu.c;
        byte[] bArr = n33.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (zo0Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
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
        e10 e10Var = new e10();
        e10Var.a = f10Var.a;
        e10Var.c = strArr;
        e10Var.d = r0;
        e10Var.b = f10Var.b;
        enabledCipherSuites.getClass();
        e10Var.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        enabledProtocols.getClass();
        e10Var.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        f10 a = e10Var.a();
        if (a.c() != null) {
            sSLSocket.setEnabledProtocols(a.d);
        }
        if (a.a() != null) {
            sSLSocket.setEnabledCipherSuites(a.c);
        }
        return f10Var;
    }

    public void b(String str) {
        ((vh3) this.d).F(this.a, this.b, this.c, str, null, null, null);
    }

    public void c(Object obj, String str) {
        ((vh3) this.d).F(this.a, this.b, this.c, str, obj, null, null);
    }

    public void d(Object obj, Object obj2, String str) {
        ((vh3) this.d).F(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((vh3) this.d).F(this.a, this.b, this.c, str, obj, obj2, obj3);
    }

    public g10(List list) {
        list.getClass();
        this.d = list;
    }
}
