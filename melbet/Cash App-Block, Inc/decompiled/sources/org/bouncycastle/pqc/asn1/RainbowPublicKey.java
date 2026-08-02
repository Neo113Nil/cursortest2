package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.RainbowUtil;

/* loaded from: classes10.dex */
public class RainbowPublicKey extends ASN1Object {
    private byte[][] coeffQuadratic;
    private byte[] coeffScalar;
    private byte[][] coeffSingular;
    private ASN1Integer docLength;
    private ASN1ObjectIdentifier oid;
    private ASN1Integer version;

    private RainbowPublicKey(ASN1Sequence aSN1Sequence) {
        byte[] octets;
        byte[] octets2;
        byte[] octets3;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            this.version = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        } else {
            this.oid = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        }
        this.docLength = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
        this.coeffQuadratic = new byte[aSN1Sequence2.size()][];
        for (int i = 0; i < aSN1Sequence2.size(); i++) {
            byte[][] bArr = this.coeffQuadratic;
            octets3 = ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(i)).getOctets();
            bArr[i] = octets3;
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        this.coeffSingular = new byte[aSN1Sequence3.size()][];
        for (int i2 = 0; i2 < aSN1Sequence3.size(); i2++) {
            byte[][] bArr2 = this.coeffSingular;
            octets2 = ASN1OctetString.getInstance(aSN1Sequence3.getObjectAt(i2)).getOctets();
            bArr2[i2] = octets2;
        }
        octets = ASN1OctetString.getInstance(((ASN1Sequence) aSN1Sequence.getObjectAt(4)).getObjectAt(0)).getOctets();
        this.coeffScalar = octets;
    }

    public static RainbowPublicKey getInstance(Object obj) {
        if (obj instanceof RainbowPublicKey) {
            return (RainbowPublicKey) obj;
        }
        if (obj != null) {
            return new RainbowPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public short[][] getCoeffQuadratic() {
        return RainbowUtil.convertArray(this.coeffQuadratic);
    }

    public short[] getCoeffScalar() {
        return RainbowUtil.convertArray(this.coeffScalar);
    }

    public short[][] getCoeffSingular() {
        return RainbowUtil.convertArray(this.coeffSingular);
    }

    public int getDocLength() {
        return this.docLength.intValueExact();
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1Encodable aSN1Encodable = this.version;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.oid;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        aSN1EncodableVector.add(this.docLength);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        for (int i = 0; i < this.coeffQuadratic.length; i++) {
            aSN1EncodableVector2.add(new DEROctetString(this.coeffQuadratic[i]));
        }
        ASN1EncodableVector m = GMSSPrivateKey$$ExternalSyntheticOutline0.m(aSN1EncodableVector2, aSN1EncodableVector);
        for (int i2 = 0; i2 < this.coeffSingular.length; i2++) {
            m.add(new DEROctetString(this.coeffSingular[i2]));
        }
        ASN1EncodableVector m2 = GMSSPrivateKey$$ExternalSyntheticOutline0.m(m, aSN1EncodableVector);
        m2.add(new DEROctetString(this.coeffScalar));
        aSN1EncodableVector.add(new DERSequence(m2));
        return new DERSequence(aSN1EncodableVector);
    }

    public RainbowPublicKey(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.version = new ASN1Integer(0L);
        this.docLength = new ASN1Integer(i);
        this.coeffQuadratic = RainbowUtil.convertArray(sArr);
        this.coeffSingular = RainbowUtil.convertArray(sArr2);
        this.coeffScalar = RainbowUtil.convertArray(sArr3);
    }
}
