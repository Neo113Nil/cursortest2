package org.bouncycastle.oer.its.ieee1609dot2;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097Certificate;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

/* loaded from: classes8.dex */
public class CertificateBase extends ASN1Object {
    private final IssuerIdentifier issuer;
    private final Signature signature;
    private final ToBeSignedCertificate toBeSigned;

    /* renamed from: type, reason: collision with root package name */
    private final CertificateType f1602type;
    private final UINT8 version;

    public static class Builder {
        private IssuerIdentifier issuer;
        private Signature signature;
        private ToBeSignedCertificate toBeSigned;

        /* renamed from: type, reason: collision with root package name */
        private CertificateType f1603type;
        private UINT8 version;

        public Certificate createCertificate() {
            return new Certificate(this.version, this.f1603type, this.issuer, this.toBeSigned, this.signature);
        }

        public CertificateBase createCertificateBase() {
            return new CertificateBase(this.version, this.f1603type, this.issuer, this.toBeSigned, this.signature);
        }

        public CertificateBase createEtsiTs103097Certificate() {
            return new EtsiTs103097Certificate(this.version, this.issuer, this.toBeSigned, this.signature);
        }

        public ExplicitCertificate createExplicitCertificate() {
            return new ExplicitCertificate(this.version, this.issuer, this.toBeSigned, this.signature);
        }

        public ImplicitCertificate createImplicitCertificate() {
            return new ImplicitCertificate(this.version, this.issuer, this.toBeSigned, this.signature);
        }

        public Builder setIssuer(IssuerIdentifier issuerIdentifier) {
            this.issuer = issuerIdentifier;
            return this;
        }

        public Builder setSignature(Signature signature) {
            this.signature = signature;
            return this;
        }

        public Builder setToBeSigned(ToBeSignedCertificate toBeSignedCertificate) {
            this.toBeSigned = toBeSignedCertificate;
            return this;
        }

        public Builder setType(CertificateType certificateType) {
            this.f1603type = certificateType;
            return this;
        }

        public Builder setVersion(UINT8 uint8) {
            this.version = uint8;
            return this;
        }
    }

    public CertificateBase(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 5) {
            a$$ExternalSyntheticBUOutline0.m$3("expected sequence size of 5");
            throw null;
        }
        this.version = UINT8.getInstance(aSN1Sequence.getObjectAt(0));
        this.f1602type = CertificateType.getInstance((Object) aSN1Sequence.getObjectAt(1));
        this.issuer = IssuerIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
        this.toBeSigned = ToBeSignedCertificate.getInstance(aSN1Sequence.getObjectAt(3));
        this.signature = (Signature) OEROptional.getValue(Signature.class, aSN1Sequence.getObjectAt(4));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificateBase getInstance(Object obj) {
        if (obj instanceof CertificateBase) {
            return (CertificateBase) obj;
        }
        if (obj != null) {
            return new CertificateBase(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public IssuerIdentifier getIssuer() {
        return this.issuer;
    }

    public Signature getSignature() {
        return this.signature;
    }

    public ToBeSignedCertificate getToBeSigned() {
        return this.toBeSigned;
    }

    public CertificateType getType() {
        return this.f1602type;
    }

    public UINT8 getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.version, this.f1602type, this.issuer, this.toBeSigned, OEROptional.getInstance(this.signature));
    }

    public CertificateBase(UINT8 uint8, CertificateType certificateType, IssuerIdentifier issuerIdentifier, ToBeSignedCertificate toBeSignedCertificate, Signature signature) {
        this.version = uint8;
        this.f1602type = certificateType;
        this.issuer = issuerIdentifier;
        this.toBeSigned = toBeSignedCertificate;
        this.signature = signature;
    }
}
