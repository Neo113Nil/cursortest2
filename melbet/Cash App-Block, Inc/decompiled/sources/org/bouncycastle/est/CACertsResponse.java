package org.bouncycastle.est;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Store;

/* loaded from: classes9.dex */
public class CACertsResponse {
    private Store<X509CRLHolder> crlHolderStore;
    private final ESTRequest requestToRetry;
    private final Source session;
    private final Store<X509CertificateHolder> store;
    private final boolean trusted;

    public CACertsResponse(Store<X509CertificateHolder> store, Store<X509CRLHolder> store2, ESTRequest eSTRequest, Source source, boolean z) {
        this.store = store;
        this.requestToRetry = eSTRequest;
        this.session = source;
        this.trusted = z;
        this.crlHolderStore = store2;
    }

    public Store<X509CertificateHolder> getCertificateStore() {
        Store<X509CertificateHolder> store = this.store;
        if (store != null) {
            return store;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Response has no certificates.");
        return null;
    }

    public Store<X509CRLHolder> getCrlStore() {
        Store<X509CRLHolder> store = this.crlHolderStore;
        if (store != null) {
            return store;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Response has no CRLs.");
        return null;
    }

    public ESTRequest getRequestToRetry() {
        return this.requestToRetry;
    }

    public Object getSession() {
        return this.session.getSession();
    }

    public boolean hasCRLs() {
        return this.crlHolderStore != null;
    }

    public boolean hasCertificates() {
        return this.store != null;
    }

    public boolean isTrusted() {
        return this.trusted;
    }
}
