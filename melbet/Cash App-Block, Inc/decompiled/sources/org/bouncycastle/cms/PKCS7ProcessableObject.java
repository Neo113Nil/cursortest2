package org.bouncycastle.cms;

import java.io.OutputStream;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;

/* loaded from: classes9.dex */
public class PKCS7ProcessableObject implements CMSTypedData {
    private final ASN1Encodable structure;

    /* renamed from: type, reason: collision with root package name */
    private final ASN1ObjectIdentifier f1576type;

    public PKCS7ProcessableObject(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f1576type = aSN1ObjectIdentifier;
        this.structure = aSN1Encodable;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public Object getContent() {
        return this.structure;
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public ASN1ObjectIdentifier getContentType() {
        return this.f1576type;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) {
        ASN1Encodable aSN1Encodable = this.structure;
        if (aSN1Encodable instanceof ASN1Sequence) {
            Iterator<ASN1Encodable> it = ASN1Sequence.getInstance(aSN1Encodable).iterator();
            while (it.hasNext()) {
                outputStream.write(it.next().toASN1Primitive().getEncoded(ASN1Encoding.DER));
            }
        } else {
            byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
            int i = 1;
            while ((encoded[i] & 255) > 127) {
                i++;
            }
            int i2 = i + 1;
            outputStream.write(encoded, i2, encoded.length - i2);
        }
    }
}
