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
public class CMCEPrivateKey extends ASN1Object {
    private byte[] C;
    private CMCEPublicKey PublicKey;
    private byte[] alpha;
    private byte[] delta;
    private byte[] g;
    private byte[] s;
    private int version;

    private CMCEPrivateKey(ASN1Sequence aSN1Sequence) {
        byte[] clone;
        byte[] clone2;
        byte[] clone3;
        byte[] clone4;
        byte[] clone5;
        int m = GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, 0);
        this.version = m;
        if (m != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("unrecognized version");
            throw null;
        }
        clone = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        this.delta = clone;
        clone2 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets());
        this.C = clone2;
        clone3 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3)).getOctets());
        this.g = clone3;
        clone4 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(4)).getOctets());
        this.alpha = clone4;
        clone5 = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(5)).getOctets());
        this.s = clone5;
        if (aSN1Sequence.size() == 7) {
            this.PublicKey = CMCEPublicKey.getInstance(aSN1Sequence.getObjectAt(6));
        }
    }

    public static CMCEPrivateKey getInstance(Object obj) {
        if (obj instanceof CMCEPrivateKey) {
            return (CMCEPrivateKey) obj;
        }
        if (obj != null) {
            return new CMCEPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getAlpha() {
        return Arrays.clone(this.alpha);
    }

    public byte[] getC() {
        return Arrays.clone(this.C);
    }

    public byte[] getDelta() {
        return Arrays.clone(this.delta);
    }

    public byte[] getG() {
        return Arrays.clone(this.g);
    }

    public CMCEPublicKey getPublicKey() {
        return this.PublicKey;
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
        aSN1EncodableVector.add(new DEROctetString(this.delta));
        aSN1EncodableVector.add(new DEROctetString(this.C));
        aSN1EncodableVector.add(new DEROctetString(this.g));
        aSN1EncodableVector.add(new DEROctetString(this.alpha));
        aSN1EncodableVector.add(new DEROctetString(this.s));
        CMCEPublicKey cMCEPublicKey = this.PublicKey;
        if (cMCEPublicKey != null) {
            aSN1EncodableVector.add(new CMCEPublicKey(cMCEPublicKey.getT()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCEPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, CMCEPublicKey cMCEPublicKey) {
        this.version = i;
        if (i != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("unrecognized version");
            throw null;
        }
        this.delta = Arrays.clone(bArr);
        this.C = Arrays.clone(bArr2);
        this.g = Arrays.clone(bArr3);
        this.alpha = Arrays.clone(bArr4);
        this.s = Arrays.clone(bArr5);
        this.PublicKey = cMCEPublicKey;
    }

    public CMCEPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(i, bArr, bArr2, bArr3, bArr4, bArr5, null);
    }
}
