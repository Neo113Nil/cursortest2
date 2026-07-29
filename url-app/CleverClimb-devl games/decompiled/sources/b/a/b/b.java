package b.a.b;

import b.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpecSelector.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<k> f1833a;

    /* renamed from: b, reason: collision with root package name */
    private int f1834b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1835c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1836d;

    public b(List<k> list) {
        this.f1833a = list;
    }

    public k a(SSLSocket sSLSocket) throws IOException {
        k kVar;
        int i = this.f1834b;
        int size = this.f1833a.size();
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = this.f1833a.get(i);
            if (kVar.a(sSLSocket)) {
                this.f1834b = i + 1;
                break;
            }
            i++;
        }
        if (kVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f1836d + ", modes=" + this.f1833a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        this.f1835c = b(sSLSocket);
        b.a.a.f1807a.a(kVar, sSLSocket, this.f1836d);
        return kVar;
    }

    public boolean a(IOException iOException) {
        this.f1836d = true;
        if (!this.f1835c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException);
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.f1834b; i < this.f1833a.size(); i++) {
            if (this.f1833a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
