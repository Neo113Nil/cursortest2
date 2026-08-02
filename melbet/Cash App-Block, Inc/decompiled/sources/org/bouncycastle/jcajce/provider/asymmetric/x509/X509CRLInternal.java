package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CRLException;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* loaded from: classes9.dex */
class X509CRLInternal extends X509CRLImpl {

    /* renamed from: encoding, reason: collision with root package name */
    private final byte[] f1593encoding;
    private final CRLException exception;

    public X509CRLInternal(JcaJceHelper jcaJceHelper, CertificateList certificateList, String str, byte[] bArr, boolean z, byte[] bArr2, CRLException cRLException) {
        super(jcaJceHelper, certificateList, str, bArr, z);
        this.f1593encoding = bArr2;
        this.exception = cRLException;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        CRLException cRLException = this.exception;
        if (cRLException != null) {
            throw cRLException;
        }
        byte[] bArr = this.f1593encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
