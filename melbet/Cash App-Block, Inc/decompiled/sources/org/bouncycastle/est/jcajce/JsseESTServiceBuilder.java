package org.bouncycastle.est.jcajce;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.net.Socket;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.est.ESTClientProvider;
import org.bouncycastle.est.ESTService;
import org.bouncycastle.est.ESTServiceBuilder;

/* loaded from: classes9.dex */
public class JsseESTServiceBuilder extends ESTServiceBuilder {
    protected Long absoluteLimit;
    protected ChannelBindingProvider bindingProvider;
    protected boolean filterCipherSuites;
    protected JsseHostnameAuthorizer hostNameAuthorizer;
    protected SSLSocketFactoryCreator socketFactoryCreator;
    protected SSLSocketFactoryCreatorBuilder sslSocketFactoryCreatorBuilder;
    protected Set<String> supportedSuites;
    protected int timeoutMillis;

    public JsseESTServiceBuilder(String str, int i, SSLSocketFactoryCreator sSLSocketFactoryCreator) {
        super(Boxes$$ExternalSyntheticOutline1.m(i, str, ":"));
        this.hostNameAuthorizer = new JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new HashSet();
        this.filterCipherSuites = true;
        if (sSLSocketFactoryCreator != null) {
            this.socketFactoryCreator = sSLSocketFactoryCreator;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("No socket factory creator.");
            throw null;
        }
    }

    public JsseESTServiceBuilder addCipherSuites(String[] strArr) {
        this.supportedSuites.addAll(Arrays.asList(strArr));
        return this;
    }

    @Override // org.bouncycastle.est.ESTServiceBuilder
    public ESTService build() {
        if (this.bindingProvider == null) {
            this.bindingProvider = new ChannelBindingProvider() { // from class: org.bouncycastle.est.jcajce.JsseESTServiceBuilder.1
                @Override // org.bouncycastle.est.jcajce.ChannelBindingProvider
                public boolean canAccessChannelBinding(Socket socket) {
                    return false;
                }

                @Override // org.bouncycastle.est.jcajce.ChannelBindingProvider
                public byte[] getChannelBinding(Socket socket, String str) {
                    return null;
                }
            };
        }
        if (this.socketFactoryCreator == null) {
            this.socketFactoryCreator = this.sslSocketFactoryCreatorBuilder.build();
        }
        if (this.clientProvider == null) {
            this.clientProvider = new DefaultESTHttpClientProvider(this.hostNameAuthorizer, this.socketFactoryCreator, this.timeoutMillis, this.bindingProvider, this.supportedSuites, this.absoluteLimit, this.filterCipherSuites);
        }
        return super.build();
    }

    public JsseESTServiceBuilder withChannelBindingProvider(ChannelBindingProvider channelBindingProvider) {
        this.bindingProvider = channelBindingProvider;
        return this;
    }

    public JsseESTServiceBuilder withFilterCipherSuites(boolean z) {
        this.filterCipherSuites = z;
        return this;
    }

    public JsseESTServiceBuilder withHostNameAuthorizer(JsseHostnameAuthorizer jsseHostnameAuthorizer) {
        this.hostNameAuthorizer = jsseHostnameAuthorizer;
        return this;
    }

    public JsseESTServiceBuilder withKeyManager(KeyManager keyManager) {
        if (this.socketFactoryCreator == null) {
            this.sslSocketFactoryCreatorBuilder.withKeyManager(keyManager);
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Socket Factory Creator was defined in the constructor.");
        return null;
    }

    public JsseESTServiceBuilder withKeyManagers(KeyManager[] keyManagerArr) {
        if (this.socketFactoryCreator == null) {
            this.sslSocketFactoryCreatorBuilder.withKeyManagers(keyManagerArr);
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Socket Factory Creator was defined in the constructor.");
        return null;
    }

    public JsseESTServiceBuilder withProvider(String str) {
        if (this.socketFactoryCreator == null) {
            this.sslSocketFactoryCreatorBuilder.withProvider(str);
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Socket Factory Creator was defined in the constructor.");
        return null;
    }

    public JsseESTServiceBuilder withReadLimit(long j) {
        this.absoluteLimit = Long.valueOf(j);
        return this;
    }

    public JsseESTServiceBuilder withSecureRandom(SecureRandom secureRandom) {
        if (this.socketFactoryCreator == null) {
            this.sslSocketFactoryCreatorBuilder.withSecureRandom(secureRandom);
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Socket Factory Creator was defined in the constructor.");
        return null;
    }

    public JsseESTServiceBuilder withTLSVersion(String str) {
        if (this.socketFactoryCreator == null) {
            this.sslSocketFactoryCreatorBuilder.withTLSVersion(str);
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Socket Factory Creator was defined in the constructor.");
        return null;
    }

    public JsseESTServiceBuilder withTimeout(int i) {
        this.timeoutMillis = i;
        return this;
    }

    @Override // org.bouncycastle.est.ESTServiceBuilder
    public JsseESTServiceBuilder withClientProvider(ESTClientProvider eSTClientProvider) {
        this.clientProvider = eSTClientProvider;
        return this;
    }

    public JsseESTServiceBuilder addCipherSuites(String str) {
        this.supportedSuites.add(str);
        return this;
    }

    public JsseESTServiceBuilder withProvider(Provider provider) {
        if (this.socketFactoryCreator == null) {
            this.sslSocketFactoryCreatorBuilder.withProvider(provider);
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Socket Factory Creator was defined in the constructor.");
        return null;
    }

    public JsseESTServiceBuilder(String str, int i, X509TrustManager x509TrustManager) {
        super(Boxes$$ExternalSyntheticOutline1.m(i, str, ":"));
        this.hostNameAuthorizer = new JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new HashSet();
        this.filterCipherSuites = true;
        this.sslSocketFactoryCreatorBuilder = new SSLSocketFactoryCreatorBuilder(x509TrustManager);
    }

    public JsseESTServiceBuilder(String str) {
        super(str);
        this.hostNameAuthorizer = new JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new HashSet();
        this.filterCipherSuites = true;
        this.sslSocketFactoryCreatorBuilder = new SSLSocketFactoryCreatorBuilder(JcaJceUtils.getTrustAllTrustManager());
    }

    public JsseESTServiceBuilder(String str, int i, X509TrustManager[] x509TrustManagerArr) {
        this(Boxes$$ExternalSyntheticOutline1.m(i, str, ":"), x509TrustManagerArr);
    }

    public JsseESTServiceBuilder(String str, X509TrustManager x509TrustManager) {
        super(str);
        this.hostNameAuthorizer = new JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new HashSet();
        this.filterCipherSuites = true;
        this.sslSocketFactoryCreatorBuilder = new SSLSocketFactoryCreatorBuilder(x509TrustManager);
    }

    public JsseESTServiceBuilder(String str, SSLSocketFactoryCreator sSLSocketFactoryCreator) {
        super(str);
        this.hostNameAuthorizer = new JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new HashSet();
        this.filterCipherSuites = true;
        if (sSLSocketFactoryCreator != null) {
            this.socketFactoryCreator = sSLSocketFactoryCreator;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("No socket factory creator.");
            throw null;
        }
    }

    public JsseESTServiceBuilder(String str, X509TrustManager[] x509TrustManagerArr) {
        super(str);
        this.hostNameAuthorizer = new JsseDefaultHostnameAuthorizer(null);
        this.timeoutMillis = 0;
        this.supportedSuites = new HashSet();
        this.filterCipherSuites = true;
        this.sslSocketFactoryCreatorBuilder = new SSLSocketFactoryCreatorBuilder(x509TrustManagerArr);
    }
}
