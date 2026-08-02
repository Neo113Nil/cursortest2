package org.bouncycastle.est.jcajce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.io.OutputStream;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.est.LimitedSource;
import org.bouncycastle.est.Source;
import org.bouncycastle.est.TLSUniqueProvider;

/* loaded from: classes9.dex */
class LimitedSSLSocketSource implements Source<SSLSession>, TLSUniqueProvider, LimitedSource {
    private final Long absoluteReadLimit;
    private final ChannelBindingProvider bindingProvider;
    protected final SSLSocket socket;

    public LimitedSSLSocketSource(SSLSocket sSLSocket, ChannelBindingProvider channelBindingProvider, Long l) {
        this.socket = sSLSocket;
        this.bindingProvider = channelBindingProvider;
        this.absoluteReadLimit = l;
    }

    @Override // org.bouncycastle.est.Source
    public void close() {
        this.socket.close();
    }

    @Override // org.bouncycastle.est.LimitedSource
    public Long getAbsoluteReadLimit() {
        return this.absoluteReadLimit;
    }

    @Override // org.bouncycastle.est.Source
    public InputStream getInputStream() {
        return this.socket.getInputStream();
    }

    @Override // org.bouncycastle.est.Source
    public OutputStream getOutputStream() {
        return this.socket.getOutputStream();
    }

    @Override // org.bouncycastle.est.Source
    public SSLSession getSession() {
        return this.socket.getSession();
    }

    @Override // org.bouncycastle.est.TLSUniqueProvider
    public byte[] getTLSUnique() {
        if (isTLSUniqueAvailable()) {
            return this.bindingProvider.getChannelBinding(this.socket, "tls-unique");
        }
        a$$ExternalSyntheticBUOutline0.m$1("No binding provider.");
        return null;
    }

    @Override // org.bouncycastle.est.TLSUniqueProvider
    public boolean isTLSUniqueAvailable() {
        return this.bindingProvider.canAccessChannelBinding(this.socket);
    }
}
