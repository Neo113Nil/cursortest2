package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionSpec;

@Metadata
/* loaded from: classes3.dex */
public final class ConnectionSpecSelector {

    /* renamed from: a, reason: collision with root package name */
    private final List f42730a;

    /* renamed from: b, reason: collision with root package name */
    private int f42731b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42732c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42733d;

    public ConnectionSpecSelector(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f42730a = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f42730a.size();
        for (int i4 = this.f42731b; i4 < size; i4++) {
            if (((ConnectionSpec) this.f42730a.get(i4)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final ConnectionSpec a(SSLSocket sslSocket) {
        ConnectionSpec connectionSpec;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i4 = this.f42731b;
        int size = this.f42730a.size();
        while (true) {
            if (i4 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (ConnectionSpec) this.f42730a.get(i4);
            if (connectionSpec.e(sslSocket)) {
                this.f42731b = i4 + 1;
                break;
            }
            i4++;
        }
        if (connectionSpec != null) {
            this.f42732c = c(sslSocket);
            connectionSpec.c(sslSocket, this.f42733d);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f42733d);
        sb.append(", modes=");
        sb.append(this.f42730a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f42733d = true;
        if (!this.f42732c || (e4 instanceof ProtocolException) || (e4 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) || (e4 instanceof SSLPeerUnverifiedException) || !(e4 instanceof SSLException)) ? false : true;
    }
}
