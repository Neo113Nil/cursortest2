package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class CMCEPublicKey extends ASN1Object {
    private byte[] T;

    public CMCEPublicKey(ASN1Sequence aSN1Sequence) {
        byte[] clone;
        clone = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
        this.T = clone;
    }

    public static CMCEPublicKey getInstance(Object obj) {
        if (obj instanceof CMCEPublicKey) {
            return (CMCEPublicKey) obj;
        }
        if (obj != null) {
            return new CMCEPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getT() {
        return Arrays.clone(this.T);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.T), aSN1EncodableVector);
    }

    public CMCEPublicKey(byte[] bArr) {
        this.T = bArr;
    }
}
