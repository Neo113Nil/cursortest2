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
public class FalconPublicKey extends ASN1Object {
    private byte[] h;

    public FalconPublicKey(ASN1Sequence aSN1Sequence) {
        byte[] clone;
        clone = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
        this.h = clone;
    }

    public static FalconPublicKey getInstance(Object obj) {
        if (obj instanceof FalconPublicKey) {
            return (FalconPublicKey) obj;
        }
        if (obj != null) {
            return new FalconPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getH() {
        return this.h;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.h), aSN1EncodableVector);
    }

    public FalconPublicKey(byte[] bArr) {
        this.h = bArr;
    }
}
