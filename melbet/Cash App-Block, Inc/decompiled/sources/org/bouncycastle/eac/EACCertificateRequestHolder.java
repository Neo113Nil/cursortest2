package org.bouncycastle.eac;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.OutputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.eac.CVCertificateRequest;
import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.bouncycastle.eac.operator.EACSignatureVerifier;

/* loaded from: classes9.dex */
public class EACCertificateRequestHolder {
    private CVCertificateRequest request;

    public EACCertificateRequestHolder(byte[] bArr) {
        this(parseBytes(bArr));
    }

    private static CVCertificateRequest parseBytes(byte[] bArr) {
        try {
            return CVCertificateRequest.getInstance(bArr);
        } catch (ClassCastException e) {
            f$$ExternalSyntheticLambda0.m((Object) e.getMessage(), (Throwable) e);
            return null;
        } catch (IllegalArgumentException e2) {
            throw new EACIOException(GetCert$$ExternalSyntheticOutline0.m(e2, new StringBuilder("malformed data: ")), e2);
        } catch (ASN1ParsingException e3) {
            if (e3.getCause() instanceof IOException) {
                throw ((IOException) e3.getCause());
            }
            f$$ExternalSyntheticLambda0.m((Object) e3.getMessage(), (Throwable) e3);
            return null;
        }
    }

    public PublicKeyDataObject getPublicKeyDataObject() {
        return this.request.getPublicKey();
    }

    public boolean isInnerSignatureValid(EACSignatureVerifier eACSignatureVerifier) {
        try {
            OutputStream outputStream = eACSignatureVerifier.getOutputStream();
            outputStream.write(this.request.getCertificateBody().getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return eACSignatureVerifier.verify(this.request.getInnerSignature());
        } catch (Exception e) {
            throw new EACException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("unable to process signature: ")), e);
        }
    }

    public CVCertificateRequest toASN1Structure() {
        return this.request;
    }

    public EACCertificateRequestHolder(CVCertificateRequest cVCertificateRequest) {
        this.request = cVCertificateRequest;
    }
}
