package org.bouncycastle.pqc.asn1;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class FalconPrivateKey extends ASN1Object {
    private byte[] F;
    private byte[] f;
    private byte[] g;
    private FalconPublicKey publicKey;
    private int version;

    private FalconPrivateKey(ASN1Sequence aSN1Sequence) {
        byte[] clone;
        byte[] clone2;
        byte[] clone3;
        int m = GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, 0);
        this.version = m;
        if (m != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("unrecognized version");
            throw null;
        }
        clone = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        this.f = clone;
        clone2 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
        this.g = clone2;
        clone3 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3)).getOctets());
        this.F = clone3;
        if (aSN1Sequence.size() == 5) {
            this.publicKey = FalconPublicKey.getInstance(aSN1Sequence.getObjectAt(4));
        }
    }

    public static FalconPrivateKey getInstance(Object obj) {
        if (obj instanceof FalconPrivateKey) {
            return (FalconPrivateKey) obj;
        }
        if (obj != null) {
            return new FalconPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getF() {
        return Arrays.clone(this.F);
    }

    public byte[] getG() {
        return Arrays.clone(this.g);
    }

    public FalconPublicKey getPublicKey() {
        return this.publicKey;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getf() {
        return Arrays.clone(this.f);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.f));
        aSN1EncodableVector.add(new DEROctetString(this.g));
        aSN1EncodableVector.add(new DEROctetString(this.F));
        FalconPublicKey falconPublicKey = this.publicKey;
        if (falconPublicKey != null) {
            aSN1EncodableVector.add(new FalconPublicKey(falconPublicKey.getH()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public FalconPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, FalconPublicKey falconPublicKey) {
        this.version = i;
        this.f = bArr;
        this.g = bArr2;
        this.F = bArr3;
        this.publicKey = falconPublicKey;
    }

    public FalconPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(i, bArr, bArr2, bArr3, null);
    }
}
