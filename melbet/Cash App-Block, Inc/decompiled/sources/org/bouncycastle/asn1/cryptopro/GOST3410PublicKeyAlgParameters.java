package org.bouncycastle.asn1.cryptopro;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.internal.asn1.rosstandart.RosstandartObjectIdentifiers;

/* loaded from: classes9.dex */
public class GOST3410PublicKeyAlgParameters extends ASN1Object {
    private ASN1ObjectIdentifier digestParamSet;
    private ASN1ObjectIdentifier encryptionParamSet;
    private ASN1ObjectIdentifier publicKeyParamSet;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r4.size() > 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r4.size() > 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r3.digestParamSet = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(r4.getObjectAt(1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private GOST3410PublicKeyAlgParameters(ASN1Sequence aSN1Sequence) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.publicKeyParamSet = aSN1ObjectIdentifier;
        if (!aSN1ObjectIdentifier.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetA)) {
            if (this.publicKeyParamSet.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetB) || this.publicKeyParamSet.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetC) || this.publicKeyParamSet.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetD)) {
                if (aSN1Sequence.size() > 1) {
                    a$$ExternalSyntheticBUOutline0.m$3("digestParamSet expected to be absent");
                    throw null;
                }
            }
            if (aSN1Sequence.size() > 2) {
                this.encryptionParamSet = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(2);
            }
        }
    }

    public static GOST3410PublicKeyAlgParameters getInstance(Object obj) {
        if (obj instanceof GOST3410PublicKeyAlgParameters) {
            return (GOST3410PublicKeyAlgParameters) obj;
        }
        if (obj != null) {
            return new GOST3410PublicKeyAlgParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getDigestParamSet() {
        return this.digestParamSet;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.encryptionParamSet;
    }

    public ASN1ObjectIdentifier getPublicKeyParamSet() {
        return this.publicKeyParamSet;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.publicKeyParamSet);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.digestParamSet;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.encryptionParamSet;
        if (aSN1ObjectIdentifier2 != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier2);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static GOST3410PublicKeyAlgParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2, ASN1ObjectIdentifier aSN1ObjectIdentifier3) {
        this.publicKeyParamSet = aSN1ObjectIdentifier;
        this.digestParamSet = aSN1ObjectIdentifier2;
        this.encryptionParamSet = aSN1ObjectIdentifier3;
    }

    public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.publicKeyParamSet = aSN1ObjectIdentifier;
        this.digestParamSet = aSN1ObjectIdentifier2;
        this.encryptionParamSet = null;
    }
}
