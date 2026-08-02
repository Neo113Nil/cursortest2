package org.bouncycastle.asn1.cryptopro;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class Gost2814789EncryptedKey extends ASN1Object {
    private final byte[] encryptedKey;
    private final byte[] macKey;
    private final byte[] maskKey;

    private Gost2814789EncryptedKey(ASN1Sequence aSN1Sequence) {
        byte[] clone;
        byte[] clone2;
        byte[] clone3;
        byte[] clone4;
        if (aSN1Sequence.size() == 2) {
            clone3 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
            this.encryptedKey = clone3;
            clone4 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
            this.macKey = clone4;
            this.maskKey = null;
            return;
        }
        if (aSN1Sequence.size() != 3) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, new StringBuilder("unknown sequence length: ")));
            throw null;
        }
        clone = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets());
        this.encryptedKey = clone;
        this.maskKey = Arrays.clone(ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)), false).getOctets());
        clone2 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
        this.macKey = clone2;
    }

    public static Gost2814789EncryptedKey getInstance(Object obj) {
        if (obj instanceof Gost2814789EncryptedKey) {
            return (Gost2814789EncryptedKey) obj;
        }
        if (obj != null) {
            return new Gost2814789EncryptedKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getEncryptedKey() {
        return Arrays.clone(this.encryptedKey);
    }

    public byte[] getMacKey() {
        return Arrays.clone(this.macKey);
    }

    public byte[] getMaskKey() {
        return Arrays.clone(this.maskKey);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(new DEROctetString(this.encryptedKey));
        if (this.maskKey != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) new DEROctetString(this.encryptedKey)));
        }
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.macKey), aSN1EncodableVector);
    }

    public Gost2814789EncryptedKey(byte[] bArr, byte[] bArr2) {
        this(bArr, null, bArr2);
    }

    public Gost2814789EncryptedKey(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.encryptedKey = Arrays.clone(bArr);
        this.maskKey = Arrays.clone(bArr2);
        this.macKey = Arrays.clone(bArr3);
    }
}
