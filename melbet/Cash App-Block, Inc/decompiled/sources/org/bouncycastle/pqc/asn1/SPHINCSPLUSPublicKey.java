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
public class SPHINCSPLUSPublicKey extends ASN1Object {
    private byte[] pkroot;
    private byte[] pkseed;

    public SPHINCSPLUSPublicKey(ASN1Sequence aSN1Sequence) {
        byte[] clone;
        byte[] clone2;
        clone = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
        this.pkseed = clone;
        clone2 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        this.pkroot = clone2;
    }

    public static SPHINCSPLUSPublicKey getInstance(Object obj) {
        if (obj instanceof SPHINCSPLUSPublicKey) {
            return (SPHINCSPLUSPublicKey) obj;
        }
        if (obj != null) {
            return new SPHINCSPLUSPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getPkroot() {
        return Arrays.clone(this.pkroot);
    }

    public byte[] getPkseed() {
        return Arrays.clone(this.pkseed);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.pkseed));
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.pkroot), aSN1EncodableVector);
    }

    public SPHINCSPLUSPublicKey(byte[] bArr, byte[] bArr2) {
        this.pkseed = bArr;
        this.pkroot = bArr2;
    }
}
