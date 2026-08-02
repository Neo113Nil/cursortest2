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
public class SABERPrivateKey extends ASN1Object {
    private SABERPublicKey PublicKey;
    private byte[] hpk;
    private byte[] s;
    private int version;
    private byte[] z;

    private SABERPrivateKey(ASN1Sequence aSN1Sequence) {
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
        this.z = clone;
        clone2 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
        this.s = clone2;
        this.PublicKey = SABERPublicKey.getInstance(aSN1Sequence.getObjectAt(3));
        clone3 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(4)).getOctets());
        this.hpk = clone3;
    }

    public static SABERPrivateKey getInstance(Object obj) {
        if (obj instanceof SABERPrivateKey) {
            return (SABERPrivateKey) obj;
        }
        if (obj != null) {
            return new SABERPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHpk() {
        return this.hpk;
    }

    public SABERPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return this.s;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getZ() {
        return this.z;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.z));
        aSN1EncodableVector.add(new DEROctetString(this.s));
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.hpk), aSN1EncodableVector);
    }

    public SABERPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, SABERPublicKey sABERPublicKey) {
        this.version = i;
        if (i != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("unrecognized version");
            throw null;
        }
        this.z = bArr;
        this.s = bArr2;
        this.hpk = bArr3;
        this.PublicKey = sABERPublicKey;
    }

    public SABERPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.version = i;
        if (i != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("unrecognized version");
            throw null;
        }
        this.z = bArr;
        this.s = bArr2;
        this.hpk = bArr3;
    }
}
