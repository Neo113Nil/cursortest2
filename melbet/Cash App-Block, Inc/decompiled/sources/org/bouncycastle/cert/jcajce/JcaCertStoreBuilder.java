package org.bouncycastle.cert.jcajce;

import java.security.Provider;
import java.security.cert.CertStore;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Store;

/* loaded from: classes9.dex */
public class JcaCertStoreBuilder {
    private Object provider;
    private List certs = new ArrayList();
    private List crls = new ArrayList();
    private JcaX509CertificateConverter certificateConverter = new JcaX509CertificateConverter();
    private JcaX509CRLConverter crlConverter = new JcaX509CRLConverter();

    /* renamed from: type, reason: collision with root package name */
    private String f1572type = "Collection";

    private CollectionCertStoreParameters convertHolders(JcaX509CertificateConverter jcaX509CertificateConverter, JcaX509CRLConverter jcaX509CRLConverter) {
        ArrayList arrayList = new ArrayList(this.crls.size() + this.certs.size());
        Iterator it = this.certs.iterator();
        while (it.hasNext()) {
            arrayList.add(jcaX509CertificateConverter.getCertificate((X509CertificateHolder) it.next()));
        }
        Iterator it2 = this.crls.iterator();
        while (it2.hasNext()) {
            arrayList.add(jcaX509CRLConverter.getCRL((X509CRLHolder) it2.next()));
        }
        return new CollectionCertStoreParameters(arrayList);
    }

    public JcaCertStoreBuilder addCRL(X509CRLHolder x509CRLHolder) {
        this.crls.add(x509CRLHolder);
        return this;
    }

    public JcaCertStoreBuilder addCRLs(Store store) {
        this.crls.addAll(store.getMatches(null));
        return this;
    }

    public JcaCertStoreBuilder addCertificate(X509CertificateHolder x509CertificateHolder) {
        this.certs.add(x509CertificateHolder);
        return this;
    }

    public JcaCertStoreBuilder addCertificates(Store store) {
        this.certs.addAll(store.getMatches(null));
        return this;
    }

    public CertStore build() {
        CollectionCertStoreParameters convertHolders = convertHolders(this.certificateConverter, this.crlConverter);
        Object obj = this.provider;
        if (obj instanceof String) {
            return CertStore.getInstance(this.f1572type, convertHolders, (String) obj);
        }
        boolean z = obj instanceof Provider;
        String str = this.f1572type;
        return z ? CertStore.getInstance(str, convertHolders, (Provider) obj) : CertStore.getInstance(str, convertHolders);
    }

    public JcaCertStoreBuilder setProvider(String str) {
        this.certificateConverter.setProvider(str);
        this.crlConverter.setProvider(str);
        this.provider = str;
        return this;
    }

    public JcaCertStoreBuilder setType(String str) {
        this.f1572type = str;
        return this;
    }

    public JcaCertStoreBuilder setProvider(Provider provider) {
        this.certificateConverter.setProvider(provider);
        this.crlConverter.setProvider(provider);
        this.provider = provider;
        return this;
    }
}
