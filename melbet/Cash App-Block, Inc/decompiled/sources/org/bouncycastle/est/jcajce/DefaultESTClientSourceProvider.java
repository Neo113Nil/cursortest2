package org.bouncycastle.est.jcajce;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.est.ESTClientSourceProvider;
import org.bouncycastle.est.Source;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
class DefaultESTClientSourceProvider implements ESTClientSourceProvider {
    private final Long absoluteLimit;
    private final ChannelBindingProvider bindingProvider;
    private final Set<String> cipherSuites;
    private final boolean filterSupportedSuites;
    private final JsseHostnameAuthorizer hostNameAuthorizer;
    private final SSLSocketFactory sslSocketFactory;
    private final int timeout;

    public DefaultESTClientSourceProvider(SSLSocketFactory sSLSocketFactory, JsseHostnameAuthorizer jsseHostnameAuthorizer, int i, ChannelBindingProvider channelBindingProvider, Set<String> set, Long l, boolean z) {
        this.sslSocketFactory = sSLSocketFactory;
        this.hostNameAuthorizer = jsseHostnameAuthorizer;
        this.timeout = i;
        this.bindingProvider = channelBindingProvider;
        this.cipherSuites = set;
        this.absoluteLimit = l;
        this.filterSupportedSuites = z;
    }

    @Override // org.bouncycastle.est.ESTClientSourceProvider
    public Source makeSource(String str, int i) {
        SSLSocket sSLSocket = (SSLSocket) this.sslSocketFactory.createSocket(str, i);
        sSLSocket.setSoTimeout(this.timeout);
        Set<String> set = this.cipherSuites;
        if (set != null && !set.isEmpty()) {
            if (this.filterSupportedSuites) {
                HashSet hashSet = new HashSet();
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                for (int i2 = 0; i2 != supportedCipherSuites.length; i2++) {
                    hashSet.add(supportedCipherSuites[i2]);
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : this.cipherSuites) {
                    if (hashSet.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$1("No supplied cipher suite is supported by the provider.");
                    return null;
                }
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            } else {
                Set<String> set2 = this.cipherSuites;
                sSLSocket.setEnabledCipherSuites((String[]) set2.toArray(new String[set2.size()]));
            }
        }
        sSLSocket.startHandshake();
        JsseHostnameAuthorizer jsseHostnameAuthorizer = this.hostNameAuthorizer;
        if (jsseHostnameAuthorizer != null && !jsseHostnameAuthorizer.verified(str, sSLSocket.getSession())) {
            a$$ExternalSyntheticBUOutline0.m$4("Host name could not be verified.");
            return null;
        }
        String lowerCase = Strings.toLowerCase(sSLSocket.getSession().getCipherSuite());
        if (lowerCase.contains("_des_") || lowerCase.contains("_des40_") || lowerCase.contains("_3des_")) {
            a$$ExternalSyntheticBUOutline0.m$4("EST clients must not use DES ciphers");
            return null;
        }
        if (Strings.toLowerCase(sSLSocket.getSession().getCipherSuite()).contains("null")) {
            a$$ExternalSyntheticBUOutline0.m$4("EST clients must not use NULL ciphers");
            return null;
        }
        if (Strings.toLowerCase(sSLSocket.getSession().getCipherSuite()).contains("anon")) {
            a$$ExternalSyntheticBUOutline0.m$4("EST clients must not use anon ciphers");
            return null;
        }
        if (Strings.toLowerCase(sSLSocket.getSession().getCipherSuite()).contains("export")) {
            a$$ExternalSyntheticBUOutline0.m$4("EST clients must not use export ciphers");
            return null;
        }
        if (sSLSocket.getSession().getProtocol().equalsIgnoreCase("tlsv1")) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            a$$ExternalSyntheticBUOutline0.m$4("EST clients must not use TLSv1");
            return null;
        }
        JsseHostnameAuthorizer jsseHostnameAuthorizer2 = this.hostNameAuthorizer;
        if (jsseHostnameAuthorizer2 == null || jsseHostnameAuthorizer2.verified(str, sSLSocket.getSession())) {
            return new LimitedSSLSocketSource(sSLSocket, this.bindingProvider, this.absoluteLimit);
        }
        a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("Hostname was not verified: ", str));
        return null;
    }
}
