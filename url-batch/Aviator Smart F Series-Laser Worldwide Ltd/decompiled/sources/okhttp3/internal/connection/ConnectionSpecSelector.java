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
import kotlin.jvm.internal.s;
import okhttp3.ConnectionSpec;

/* loaded from: classes5.dex */
public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(List<ConnectionSpec> connectionSpecs) {
        s.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.connectionSpecs = connectionSpecs;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
        int i8 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (i8 < size) {
            int i9 = i8 + 1;
            if (this.connectionSpecs.get(i8).isCompatible(sSLSocket)) {
                return true;
            }
            i8 = i9;
        }
        return false;
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket sslSocket) {
        ConnectionSpec connectionSpec;
        s.checkNotNullParameter(sslSocket, "sslSocket");
        int i8 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i8 >= size) {
                connectionSpec = null;
                break;
            }
            int i9 = i8 + 1;
            connectionSpec = this.connectionSpecs.get(i8);
            if (connectionSpec.isCompatible(sslSocket)) {
                this.nextModeIndex = i9;
                break;
            }
            i8 = i9;
        }
        if (connectionSpec != null) {
            this.isFallbackPossible = isFallbackPossible(sslSocket);
            connectionSpec.apply$okhttp(sslSocket, this.isFallback);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isFallback);
        sb.append(", modes=");
        sb.append(this.connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        s.checkNotNull(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        s.checkNotNullExpressionValue(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean connectionFailed(IOException e8) {
        s.checkNotNullParameter(e8, "e");
        this.isFallback = true;
        return (!this.isFallbackPossible || (e8 instanceof ProtocolException) || (e8 instanceof InterruptedIOException) || ((e8 instanceof SSLHandshakeException) && (e8.getCause() instanceof CertificateException)) || (e8 instanceof SSLPeerUnverifiedException) || !(e8 instanceof SSLException)) ? false : true;
    }
}
