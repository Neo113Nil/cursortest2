package org.bouncycastle.cert.ocsp;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.ocsp.ResponseBytes;
import org.bouncycastle.cert.CertIOException;

/* loaded from: classes9.dex */
public class OCSPResp {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;
    private OCSPResponse resp;

    private OCSPResp(ASN1InputStream aSN1InputStream) {
        try {
            OCSPResponse oCSPResponse = OCSPResponse.getInstance(aSN1InputStream.readObject());
            this.resp = oCSPResponse;
            if (oCSPResponse == null) {
                throw new CertIOException("malformed response: no response data found");
            }
        } catch (ClassCastException e) {
            f$$ExternalSyntheticLambda0.m$1("malformed response: ", (Object) e.getMessage(), (Throwable) e);
            throw null;
        } catch (IllegalArgumentException e2) {
            throw new CertIOException(GetCert$$ExternalSyntheticOutline0.m(e2, new StringBuilder("malformed response: ")), e2);
        } catch (ASN1Exception e3) {
            f$$ExternalSyntheticLambda0.m$1("malformed response: ", (Object) e3.getMessage(), (Throwable) e3);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OCSPResp) {
            return this.resp.equals(((OCSPResp) obj).resp);
        }
        return false;
    }

    public byte[] getEncoded() {
        return this.resp.getEncoded();
    }

    public Object getResponseObject() {
        ResponseBytes responseBytes = this.resp.getResponseBytes();
        if (responseBytes == null) {
            return null;
        }
        if (!responseBytes.getResponseType().equals((ASN1Primitive) OCSPObjectIdentifiers.id_pkix_ocsp_basic)) {
            return responseBytes.getResponse();
        }
        try {
            return new BasicOCSPResp(BasicOCSPResponse.getInstance(ASN1Primitive.fromByteArray(responseBytes.getResponse().getOctets())));
        } catch (Exception e) {
            throw new OCSPException(Boxes$$ExternalSyntheticOutline1.m(e, "problem decoding object: "), e);
        }
    }

    public int getStatus() {
        return this.resp.getResponseStatus().getIntValue();
    }

    public int hashCode() {
        return this.resp.hashCode();
    }

    public OCSPResponse toASN1Structure() {
        return this.resp;
    }

    public OCSPResp(InputStream inputStream) {
        this(new ASN1InputStream(inputStream));
    }

    public OCSPResp(OCSPResponse oCSPResponse) {
        this.resp = oCSPResponse;
    }

    public OCSPResp(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
