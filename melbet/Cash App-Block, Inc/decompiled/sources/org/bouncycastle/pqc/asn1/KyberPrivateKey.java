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

/* loaded from: classes9.dex */
public class KyberPrivateKey extends ASN1Object {
    private byte[] hpk;
    private byte[] nonce;
    private KyberPublicKey publicKey;
    private byte[] s;
    private int version;

    private KyberPrivateKey(ASN1Sequence aSN1Sequence) {
        byte[] clone;
        int i = 0;
        int m = GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, 0);
        this.version = m;
        if (m != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("unrecognized version");
            throw null;
        }
        clone = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        this.s = clone;
        if (aSN1Sequence.size() == 5) {
            this.publicKey = KyberPublicKey.getInstance(aSN1Sequence.getObjectAt(2));
        } else {
            i = 1;
        }
        this.hpk = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3 - i)).getOctets());
        this.nonce = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(4 - i)).getOctets());
    }

    public static KyberPrivateKey getInstance(Object obj) {
        if (obj instanceof KyberPrivateKey) {
            return (KyberPrivateKey) obj;
        }
        if (obj != null) {
            return new KyberPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHpk() {
        return Arrays.clone(this.hpk);
    }

    public byte[] getNonce() {
        return Arrays.clone(this.nonce);
    }

    public KyberPublicKey getPublicKey() {
        return this.publicKey;
    }

    public byte[] getS() {
        return Arrays.clone(this.s);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.s));
        KyberPublicKey kyberPublicKey = this.publicKey;
        if (kyberPublicKey != null) {
            aSN1EncodableVector.add(new KyberPublicKey(kyberPublicKey.getT(), this.publicKey.getRho()));
        }
        aSN1EncodableVector.add(new DEROctetString(this.hpk));
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.nonce), aSN1EncodableVector);
    }

    public KyberPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, KyberPublicKey kyberPublicKey) {
        this.version = i;
        this.s = bArr;
        this.publicKey = kyberPublicKey;
        this.hpk = bArr2;
        this.nonce = bArr3;
    }

    public KyberPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(i, bArr, bArr2, bArr3, null);
    }
}
