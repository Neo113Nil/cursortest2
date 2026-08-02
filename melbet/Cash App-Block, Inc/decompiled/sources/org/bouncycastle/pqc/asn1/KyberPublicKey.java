package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class KyberPublicKey extends ASN1Object {
    private byte[] rho;
    private byte[] t;

    public KyberPublicKey(ASN1Sequence aSN1Sequence) {
        byte[] clone;
        byte[] clone2;
        clone = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
        this.t = clone;
        clone2 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        this.rho = clone2;
    }

    public static KyberPublicKey getInstance(Object obj) {
        if (obj instanceof KyberPublicKey) {
            return (KyberPublicKey) obj;
        }
        if (obj != null) {
            return new KyberPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT() {
        return Arrays.clone(this.t);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.t));
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.rho), aSN1EncodableVector);
    }

    public KyberPublicKey(byte[] bArr, byte[] bArr2) {
        this.t = bArr;
        this.rho = bArr2;
    }
}
