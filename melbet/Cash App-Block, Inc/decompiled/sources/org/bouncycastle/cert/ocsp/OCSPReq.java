package org.bouncycastle.cert.ocsp;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.List;
import java.util.Set;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.ocsp.OCSPRequest;
import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;

/* loaded from: classes9.dex */
public class OCSPReq {
    private static final X509CertificateHolder[] EMPTY_CERTS = new X509CertificateHolder[0];
    private Extensions extensions;
    private OCSPRequest req;

    private OCSPReq(ASN1InputStream aSN1InputStream) {
        try {
            OCSPRequest oCSPRequest = OCSPRequest.getInstance(aSN1InputStream.readObject());
            this.req = oCSPRequest;
            if (oCSPRequest == null) {
                throw new CertIOException("malformed request: no request data found");
            }
            this.extensions = oCSPRequest.getTbsRequest().getRequestExtensions();
        } catch (ClassCastException e) {
            f$$ExternalSyntheticLambda0.m$1("malformed request: ", (Object) e.getMessage(), (Throwable) e);
            throw null;
        } catch (IllegalArgumentException e2) {
            throw new CertIOException(GetCert$$ExternalSyntheticOutline0.m(e2, new StringBuilder("malformed request: ")), e2);
        } catch (ASN1Exception e3) {
            f$$ExternalSyntheticLambda0.m$1("malformed request: ", (Object) e3.getMessage(), (Throwable) e3);
            throw null;
        }
    }

    public X509CertificateHolder[] getCerts() {
        ASN1Sequence certs;
        if (this.req.getOptionalSignature() != null && (certs = this.req.getOptionalSignature().getCerts()) != null) {
            int size = certs.size();
            X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[size];
            for (int i = 0; i != size; i++) {
                x509CertificateHolderArr[i] = new X509CertificateHolder(Certificate.getInstance(certs.getObjectAt(i)));
            }
            return x509CertificateHolderArr;
        }
        return EMPTY_CERTS;
    }

    public Set getCriticalExtensionOIDs() {
        return OCSPUtils.getCriticalExtensionOIDs(this.extensions);
    }

    public byte[] getEncoded() {
        return this.req.getEncoded();
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensions = this.extensions;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return OCSPUtils.getExtensionOIDs(this.extensions);
    }

    public Set getNonCriticalExtensionOIDs() {
        return OCSPUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public Req[] getRequestList() {
        ASN1Sequence requestList = this.req.getTbsRequest().getRequestList();
        int size = requestList.size();
        Req[] reqArr = new Req[size];
        for (int i = 0; i != size; i++) {
            reqArr[i] = new Req(Request.getInstance(requestList.getObjectAt(i)));
        }
        return reqArr;
    }

    public GeneralName getRequestorName() {
        return GeneralName.getInstance(this.req.getTbsRequest().getRequestorName());
    }

    public byte[] getSignature() {
        if (isSigned()) {
            return this.req.getOptionalSignature().getSignature().getOctets();
        }
        return null;
    }

    public ASN1ObjectIdentifier getSignatureAlgOID() {
        if (isSigned()) {
            return this.req.getOptionalSignature().getSignatureAlgorithm().getAlgorithm();
        }
        return null;
    }

    public int getVersionNumber() {
        return this.req.getTbsRequest().getVersion().intValueExact() + 1;
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) {
        if (!isSigned()) {
            throw new OCSPException("attempt to verify signature on unsigned object");
        }
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(this.req.getOptionalSignature().getSignatureAlgorithm());
            contentVerifier.getOutputStream().write(this.req.getTbsRequest().getEncoded(ASN1Encoding.DER));
            return contentVerifier.verify(getSignature());
        } catch (Exception e) {
            throw new OCSPException(Boxes$$ExternalSyntheticOutline1.m(e, "exception processing signature: "), e);
        }
    }

    public boolean isSigned() {
        return this.req.getOptionalSignature() != null;
    }

    public OCSPReq(OCSPRequest oCSPRequest) {
        this.req = oCSPRequest;
        this.extensions = oCSPRequest.getTbsRequest().getRequestExtensions();
    }

    public OCSPReq(byte[] bArr) {
        this(new ASN1InputStream(bArr));
    }
}
