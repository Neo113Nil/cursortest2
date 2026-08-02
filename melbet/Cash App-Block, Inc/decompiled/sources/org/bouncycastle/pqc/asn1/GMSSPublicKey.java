package org.bouncycastle.pqc.asn1;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class GMSSPublicKey extends ASN1Object {
    private byte[] publicKey;
    private ASN1Integer version;

    private GMSSPublicKey(ASN1Sequence aSN1Sequence) {
        byte[] octets;
        if (aSN1Sequence.size() != 2) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, new StringBuilder("size of seq = ")));
            throw null;
        }
        this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        octets = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        this.publicKey = octets;
    }

    public static GMSSPublicKey getInstance(Object obj) {
        if (obj instanceof GMSSPublicKey) {
            return (GMSSPublicKey) obj;
        }
        if (obj != null) {
            return new GMSSPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.publicKey);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.version);
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.publicKey), aSN1EncodableVector);
    }

    public GMSSPublicKey(byte[] bArr) {
        this.version = new ASN1Integer(0L);
        this.publicKey = bArr;
    }
}
