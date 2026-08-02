package org.bouncycastle.asn1.eac;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class CVCertificate extends ASN1Object {
    private static int bodyValid = 1;
    private static int signValid = 2;
    private CertificateBody certificateBody;
    private byte[] signature;
    private int valid;

    public CVCertificate(CertificateBody certificateBody, byte[] bArr) {
        this.certificateBody = certificateBody;
        this.signature = Arrays.clone(bArr);
        this.valid = this.valid | bodyValid | signValid;
    }

    public static CVCertificate getInstance(Object obj) {
        if (obj instanceof CVCertificate) {
            return (CVCertificate) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return new CVCertificate(ASN1TaggedObject.getInstance(obj, 64));
        } catch (IOException e) {
            throw new ASN1ParsingException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to parse data: ")), e);
        }
    }

    private void initFrom(ASN1InputStream aSN1InputStream) {
        while (true) {
            ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                return;
            }
            if (!(readObject instanceof ASN1TaggedObject)) {
                a$$ExternalSyntheticBUOutline0.m$4("Invalid Input Stream for creating an Iso7816CertificateStructure");
                return;
            }
            setPrivateData((ASN1TaggedObject) readObject);
        }
    }

    private void setPrivateData(ASN1TaggedObject aSN1TaggedObject) {
        StringBuilder sb;
        String m;
        this.valid = 0;
        if (aSN1TaggedObject.hasTag(64, 33)) {
            Enumeration objects = ASN1Sequence.getInstance(aSN1TaggedObject.getBaseUniversal(false, 16)).getObjects();
            while (objects.hasMoreElements()) {
                Object nextElement = objects.nextElement();
                if (!(nextElement instanceof ASN1TaggedObject)) {
                    m = "Invalid Object, not an Iso7816CertificateStructure";
                    break;
                }
                ASN1TaggedObject aSN1TaggedObject2 = ASN1TaggedObject.getInstance(nextElement, 64);
                int tagNo = aSN1TaggedObject2.getTagNo();
                if (tagNo == 55) {
                    this.signature = ASN1OctetString.getInstance(aSN1TaggedObject2.getBaseUniversal(false, 4)).getOctets();
                    this.valid |= signValid;
                } else if (tagNo != 78) {
                    m = GetCert$$ExternalSyntheticOutline0.m(aSN1TaggedObject2, new StringBuilder("Invalid tag, not an Iso7816CertificateStructure :"));
                    break;
                } else {
                    this.certificateBody = CertificateBody.getInstance(aSN1TaggedObject2);
                    this.valid |= bodyValid;
                }
            }
            if (this.valid == (signValid | bodyValid)) {
                return;
            } else {
                sb = new StringBuilder("invalid CARDHOLDER_CERTIFICATE :");
            }
        } else {
            sb = new StringBuilder("not a CARDHOLDER_CERTIFICATE :");
        }
        m = GetCert$$ExternalSyntheticOutline0.m(aSN1TaggedObject, sb);
        a$$ExternalSyntheticBUOutline0.m$4(m);
    }

    public CertificationAuthorityReference getAuthorityReference() {
        return this.certificateBody.getCertificationAuthorityReference();
    }

    public CertificateBody getBody() {
        return this.certificateBody;
    }

    public int getCertificateType() {
        return this.certificateBody.getCertificateType();
    }

    public PackedDate getEffectiveDate() {
        return this.certificateBody.getCertificateEffectiveDate();
    }

    public PackedDate getExpirationDate() {
        return this.certificateBody.getCertificateExpirationDate();
    }

    public ASN1ObjectIdentifier getHolderAuthorization() {
        return this.certificateBody.getCertificateHolderAuthorization().getOid();
    }

    public Flags getHolderAuthorizationRights() {
        return new Flags(this.certificateBody.getCertificateHolderAuthorization().getAccessRights() & 31);
    }

    public int getHolderAuthorizationRole() {
        return this.certificateBody.getCertificateHolderAuthorization().getAccessRights() & 192;
    }

    public CertificateHolderReference getHolderReference() {
        return this.certificateBody.getCertificateHolderReference();
    }

    public int getRole() {
        return this.certificateBody.getCertificateHolderAuthorization().getAccessRights();
    }

    public byte[] getSignature() {
        return Arrays.clone(this.signature);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.certificateBody);
        aSN1EncodableVector.add(EACTagged.create(55, this.signature));
        return EACTagged.create(33, new DERSequence(aSN1EncodableVector));
    }

    private CVCertificate(ASN1TaggedObject aSN1TaggedObject) {
        setPrivateData(aSN1TaggedObject);
    }

    public CVCertificate(ASN1InputStream aSN1InputStream) {
        initFrom(aSN1InputStream);
    }
}
