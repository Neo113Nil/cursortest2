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
public class XMSSMTPublicKey extends ASN1Object {
    private final byte[] publicSeed;
    private final byte[] root;

    private XMSSMTPublicKey(ASN1Sequence aSN1Sequence) {
        byte[] clone;
        byte[] clone2;
        if (!ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).hasValue(0)) {
            a$$ExternalSyntheticBUOutline0.m$3("unknown version of sequence");
            throw null;
        }
        clone = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        this.publicSeed = clone;
        clone2 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
        this.root = clone2;
    }

    public static XMSSMTPublicKey getInstance(Object obj) {
        if (obj instanceof XMSSMTPublicKey) {
            return (XMSSMTPublicKey) obj;
        }
        if (obj != null) {
            return new XMSSMTPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.publicSeed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.root);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(0L));
        aSN1EncodableVector.add(new DEROctetString(this.publicSeed));
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.root), aSN1EncodableVector);
    }

    public XMSSMTPublicKey(byte[] bArr, byte[] bArr2) {
        this.publicSeed = Arrays.clone(bArr);
        this.root = Arrays.clone(bArr2);
    }
}
