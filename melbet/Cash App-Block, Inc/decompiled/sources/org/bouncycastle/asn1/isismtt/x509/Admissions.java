package org.bouncycastle.asn1.isismtt.x509;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Enumeration;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.x509.GeneralName;

/* loaded from: classes9.dex */
public class Admissions extends ASN1Object {
    private GeneralName admissionAuthority;
    private NamingAuthority namingAuthority;
    private ASN1Sequence professionInfos;

    private Admissions(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 3) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.admissionAuthority = GeneralName.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 1) {
                    a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1TaggedObject, new StringBuilder("Bad tag number: ")));
                    throw null;
                }
                this.namingAuthority = NamingAuthority.getInstance(aSN1TaggedObject, true);
            }
            aSN1Encodable = (ASN1Encodable) objects.nextElement();
        }
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) aSN1Encodable;
            if (aSN1TaggedObject2.getTagNo() != 1) {
                a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1TaggedObject2, new StringBuilder("Bad tag number: ")));
                throw null;
            }
            this.namingAuthority = NamingAuthority.getInstance(aSN1TaggedObject2, true);
            aSN1Encodable = (ASN1Encodable) objects.nextElement();
        }
        this.professionInfos = ASN1Sequence.getInstance(aSN1Encodable);
        if (objects.hasMoreElements()) {
            Path$$ExternalSyntheticBUOutline0.m(objects.nextElement().getClass(), "Bad object encountered: ");
            throw null;
        }
    }

    public static Admissions getInstance(Object obj) {
        if (obj == null || (obj instanceof Admissions)) {
            return (Admissions) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new Admissions((ASN1Sequence) obj);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "illegal object in getInstance: "));
        return null;
    }

    public GeneralName getAdmissionAuthority() {
        return this.admissionAuthority;
    }

    public NamingAuthority getNamingAuthority() {
        return this.namingAuthority;
    }

    public ProfessionInfo[] getProfessionInfos() {
        ProfessionInfo[] professionInfoArr = new ProfessionInfo[this.professionInfos.size()];
        Enumeration objects = this.professionInfos.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            professionInfoArr[i] = ProfessionInfo.getInstance(objects.nextElement());
            i++;
        }
        return professionInfoArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        GeneralName generalName = this.admissionAuthority;
        if (generalName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) generalName));
        }
        NamingAuthority namingAuthority = this.namingAuthority;
        if (namingAuthority != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) namingAuthority));
        }
        aSN1EncodableVector.add(this.professionInfos);
        return new DERSequence(aSN1EncodableVector);
    }

    public Admissions(GeneralName generalName, NamingAuthority namingAuthority, ProfessionInfo[] professionInfoArr) {
        this.admissionAuthority = generalName;
        this.namingAuthority = namingAuthority;
        this.professionInfos = new DERSequence(professionInfoArr);
    }
}
