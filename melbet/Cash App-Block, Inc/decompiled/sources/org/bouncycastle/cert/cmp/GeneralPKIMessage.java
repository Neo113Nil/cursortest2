package org.bouncycastle.cert.cmp;

import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.asn1.cmp.PKIHeader;
import org.bouncycastle.asn1.cmp.PKIMessage;
import org.bouncycastle.cert.CertIOException;

/* loaded from: classes9.dex */
public class GeneralPKIMessage {
    private final PKIMessage pkiMessage;

    public GeneralPKIMessage(byte[] bArr) {
        this(parseBytes(bArr));
    }

    private static PKIMessage parseBytes(byte[] bArr) {
        try {
            return PKIMessage.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (ClassCastException e) {
            f$$ExternalSyntheticLambda0.m$1("malformed data: ", (Object) e.getMessage(), (Throwable) e);
            return null;
        } catch (IllegalArgumentException e2) {
            throw new CertIOException(GetCert$$ExternalSyntheticOutline0.m(e2, new StringBuilder("malformed data: ")), e2);
        }
    }

    public PKIBody getBody() {
        return this.pkiMessage.getBody();
    }

    public PKIHeader getHeader() {
        return this.pkiMessage.getHeader();
    }

    public boolean hasProtection() {
        return this.pkiMessage.getProtection() != null;
    }

    public PKIMessage toASN1Structure() {
        return this.pkiMessage;
    }

    public GeneralPKIMessage(PKIMessage pKIMessage) {
        this.pkiMessage = pKIMessage;
    }
}
