package org.bouncycastle.asn1.cryptopro;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class GostR3410TransportParameters extends ASN1Object {
    private final ASN1ObjectIdentifier encryptionParamSet;
    private final SubjectPublicKeyInfo ephemeralPublicKey;
    private final byte[] ukm;

    private GostR3410TransportParameters(ASN1Sequence aSN1Sequence) {
        byte[] octets;
        byte[] octets2;
        if (aSN1Sequence.size() == 2) {
            this.encryptionParamSet = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            octets2 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
            this.ukm = octets2;
            this.ephemeralPublicKey = null;
            return;
        }
        if (aSN1Sequence.size() != 3) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, new StringBuilder("unknown sequence length: ")));
            throw null;
        }
        this.encryptionParamSet = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.ephemeralPublicKey = SubjectPublicKeyInfo.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)), false);
        octets = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets();
        this.ukm = octets;
    }

    public static GostR3410TransportParameters getInstance(Object obj) {
        if (obj instanceof GostR3410TransportParameters) {
            return (GostR3410TransportParameters) obj;
        }
        if (obj != null) {
            return new GostR3410TransportParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.encryptionParamSet;
    }

    public SubjectPublicKeyInfo getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public byte[] getUkm() {
        return Arrays.clone(this.ukm);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.encryptionParamSet);
        SubjectPublicKeyInfo subjectPublicKeyInfo = this.ephemeralPublicKey;
        if (subjectPublicKeyInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) subjectPublicKeyInfo));
        }
        return GetCert$$ExternalSyntheticOutline0.m(aSN1EncodableVector, new DEROctetString(this.ukm), aSN1EncodableVector);
    }

    public static GostR3410TransportParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new GostR3410TransportParameters(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public GostR3410TransportParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SubjectPublicKeyInfo subjectPublicKeyInfo, byte[] bArr) {
        this.encryptionParamSet = aSN1ObjectIdentifier;
        this.ephemeralPublicKey = subjectPublicKeyInfo;
        this.ukm = Arrays.clone(bArr);
    }
}
