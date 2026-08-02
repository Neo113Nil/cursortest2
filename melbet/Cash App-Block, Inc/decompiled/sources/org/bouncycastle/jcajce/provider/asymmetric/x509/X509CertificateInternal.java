package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CertificateEncodingException;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* loaded from: classes9.dex */
class X509CertificateInternal extends X509CertificateImpl {

    /* renamed from: encoding, reason: collision with root package name */
    private final byte[] f1594encoding;
    private final CertificateEncodingException exception;

    public X509CertificateInternal(JcaJceHelper jcaJceHelper, Certificate certificate, BasicConstraints basicConstraints, boolean[] zArr, String str, byte[] bArr, byte[] bArr2, CertificateEncodingException certificateEncodingException) {
        super(jcaJceHelper, certificate, basicConstraints, zArr, str, bArr);
        this.f1594encoding = bArr2;
        this.exception = certificateEncodingException;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        CertificateEncodingException certificateEncodingException = this.exception;
        if (certificateEncodingException != null) {
            throw certificateEncodingException;
        }
        byte[] bArr = this.f1594encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}
