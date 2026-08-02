package org.bouncycastle.cms;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSAlgorithmProtection;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.SignerIdentifier;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.cms.Time;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RawContentVerifier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.TeeOutputStream;

/* loaded from: classes9.dex */
public class SignerInformation {
    private final CMSProcessable content;
    private final ASN1ObjectIdentifier contentType;
    protected final AlgorithmIdentifier digestAlgorithm;
    protected final AlgorithmIdentifier encryptionAlgorithm;
    protected final SignerInfo info;
    private final boolean isCounterSignature;
    private byte[] resultDigest;
    private final SignerId sid;
    private final byte[] signature;
    protected final ASN1Set signedAttributeSet;
    private AttributeTable signedAttributeValues;
    protected final ASN1Set unsignedAttributeSet;
    private AttributeTable unsignedAttributeValues;

    public SignerInformation(SignerInfo signerInfo, ASN1ObjectIdentifier aSN1ObjectIdentifier, CMSProcessable cMSProcessable, byte[] bArr) {
        SignerId signerId;
        this.info = signerInfo;
        this.contentType = aSN1ObjectIdentifier;
        this.isCounterSignature = aSN1ObjectIdentifier == null;
        SignerIdentifier sid = signerInfo.getSID();
        boolean isTagged = sid.isTagged();
        ASN1Encodable id = sid.getId();
        if (isTagged) {
            signerId = new SignerId(ASN1OctetString.getInstance(id).getOctets());
        } else {
            IssuerAndSerialNumber issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(id);
            signerId = new SignerId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
        }
        this.sid = signerId;
        this.digestAlgorithm = signerInfo.getDigestAlgorithm();
        this.signedAttributeSet = signerInfo.getAuthenticatedAttributes();
        this.unsignedAttributeSet = signerInfo.getUnauthenticatedAttributes();
        this.encryptionAlgorithm = signerInfo.getDigestEncryptionAlgorithm();
        this.signature = signerInfo.getEncryptedDigest().getOctets();
        this.content = cMSProcessable;
        this.resultDigest = bArr;
    }

    public static SignerInformation addCounterSigners(SignerInformation signerInformation, SignerInformationStore signerInformationStore) {
        SignerInfo signerInfo = signerInformation.info;
        AttributeTable unsignedAttributes = signerInformation.getUnsignedAttributes();
        ASN1EncodableVector aSN1EncodableVector = unsignedAttributes != null ? unsignedAttributes.toASN1EncodableVector() : new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        Iterator<SignerInformation> it = signerInformationStore.getSigners().iterator();
        while (it.hasNext()) {
            aSN1EncodableVector2.add(it.next().toASN1Structure());
        }
        aSN1EncodableVector.add(new Attribute(CMSAttributes.counterSignature, new DERSet(aSN1EncodableVector2)));
        return new SignerInformation(new SignerInfo(signerInfo.getSID(), signerInfo.getDigestAlgorithm(), signerInfo.getAuthenticatedAttributes(), signerInfo.getDigestEncryptionAlgorithm(), signerInfo.getEncryptedDigest(), new DERSet(aSN1EncodableVector)), signerInformation.contentType, signerInformation.content, null);
    }

    private boolean doVerify(SignerInformationVerifier signerInformationVerifier) {
        String encryptionAlgName = CMSSignedHelper.INSTANCE.getEncryptionAlgName(getEncryptionAlgOID());
        AlgorithmIdentifier digestAlgorithm = this.signedAttributeSet != null ? this.info.getDigestAlgorithm() : translateBrokenRSAPkcs7(this.encryptionAlgorithm, this.info.getDigestAlgorithm());
        try {
            ContentVerifier contentVerifier = signerInformationVerifier.getContentVerifier(this.encryptionAlgorithm, digestAlgorithm);
            try {
                OutputStream outputStream = contentVerifier.getOutputStream();
                if (this.resultDigest == null) {
                    DigestCalculator digestCalculator = signerInformationVerifier.getDigestCalculator(digestAlgorithm);
                    if (this.content != null) {
                        OutputStream outputStream2 = digestCalculator.getOutputStream();
                        if (this.signedAttributeSet != null) {
                            this.content.write(outputStream2);
                            outputStream.write(getEncodedSignedAttributes());
                        } else if (contentVerifier instanceof RawContentVerifier) {
                            this.content.write(outputStream2);
                        } else {
                            TeeOutputStream teeOutputStream = new TeeOutputStream(outputStream2, outputStream);
                            this.content.write(teeOutputStream);
                            teeOutputStream.close();
                        }
                        outputStream2.close();
                    } else {
                        if (this.signedAttributeSet == null) {
                            throw new CMSException("data not encapsulated in signature - use detached constructor.");
                        }
                        outputStream.write(getEncodedSignedAttributes());
                    }
                    this.resultDigest = digestCalculator.getDigest();
                } else if (this.signedAttributeSet == null) {
                    CMSProcessable cMSProcessable = this.content;
                    if (cMSProcessable != null) {
                        cMSProcessable.write(outputStream);
                    }
                } else {
                    outputStream.write(getEncodedSignedAttributes());
                }
                outputStream.close();
                verifyContentTypeAttributeValue();
                AttributeTable signedAttributes = getSignedAttributes();
                verifyAlgorithmIdentifierProtectionAttribute(signedAttributes);
                verifyMessageDigestAttribute();
                verifyCounterSignatureAttribute(signedAttributes);
                try {
                    if (this.signedAttributeSet != null || this.resultDigest == null || !(contentVerifier instanceof RawContentVerifier)) {
                        return contentVerifier.verify(getSignature());
                    }
                    RawContentVerifier rawContentVerifier = (RawContentVerifier) contentVerifier;
                    return encryptionAlgName.equals("RSA") ? rawContentVerifier.verify(new DigestInfo(new AlgorithmIdentifier(digestAlgorithm.getAlgorithm(), DERNull.INSTANCE), this.resultDigest).getEncoded(ASN1Encoding.DER), getSignature()) : rawContentVerifier.verify(this.resultDigest, getSignature());
                } catch (IOException e) {
                    f$$ExternalSyntheticLambda0.m((Exception) e, "can't process mime object to create signature.");
                    return false;
                }
            } catch (IOException e2) {
                f$$ExternalSyntheticLambda0.m((Exception) e2, "can't process mime object to create signature.");
                return false;
            } catch (OperatorCreationException e3) {
                throw new CMSException("can't create digest calculator: " + e3.getMessage(), e3);
            }
        } catch (OperatorCreationException e4) {
            throw new CMSException("can't create content verifier: " + e4.getMessage(), e4);
        }
    }

    private Time getSigningTime() {
        ASN1Primitive singleValuedSignedAttribute = getSingleValuedSignedAttribute(CMSAttributes.signingTime, "signing-time");
        if (singleValuedSignedAttribute == null) {
            return null;
        }
        try {
            return Time.getInstance(singleValuedSignedAttribute);
        } catch (IllegalArgumentException unused) {
            f$$ExternalSyntheticLambda0.m$1("signing-time attribute value not a valid 'Time' structure");
            return null;
        }
    }

    private ASN1Primitive getSingleValuedSignedAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        ASN1EncodableVector all;
        int size;
        AttributeTable unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes != null && unsignedAttributes.getAll(aSN1ObjectIdentifier).size() > 0) {
            throw new CMSException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The ", str, " attribute MUST NOT be an unsigned attribute"));
        }
        AttributeTable signedAttributes = getSignedAttributes();
        if (signedAttributes == null || (size = (all = signedAttributes.getAll(aSN1ObjectIdentifier)).size()) == 0) {
            return null;
        }
        if (size != 1) {
            throw new CMSException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The SignedAttributes in a signerInfo MUST NOT include multiple instances of the ", str, " attribute"));
        }
        ASN1Set attrValues = ((Attribute) all.get(0)).getAttrValues();
        if (attrValues.size() == 1) {
            return attrValues.getObjectAt(0).toASN1Primitive();
        }
        throw new CMSException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("A ", str, " attribute MUST have a single attribute value"));
    }

    public static SignerInformation replaceUnsignedAttributes(SignerInformation signerInformation, AttributeTable attributeTable) {
        SignerInfo signerInfo = signerInformation.info;
        return new SignerInformation(new SignerInfo(signerInfo.getSID(), signerInfo.getDigestAlgorithm(), signerInfo.getAuthenticatedAttributes(), signerInfo.getDigestEncryptionAlgorithm(), signerInfo.getEncryptedDigest(), attributeTable != null ? new DERSet(attributeTable.toASN1EncodableVector()) : null), signerInformation.contentType, signerInformation.content, null);
    }

    private static AlgorithmIdentifier translateBrokenRSAPkcs7(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        return (PKCSObjectIdentifiers.rsaEncryption.equals((ASN1Primitive) algorithmIdentifier.getAlgorithm()) && (OIWObjectIdentifiers.sha1WithRSA.equals((ASN1Primitive) algorithmIdentifier2.getAlgorithm()) || PKCSObjectIdentifiers.sha1WithRSAEncryption.equals((ASN1Primitive) algorithmIdentifier2.getAlgorithm()))) ? new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE) : algorithmIdentifier2;
    }

    private void verifyAlgorithmIdentifierProtectionAttribute(AttributeTable attributeTable) {
        String str;
        AttributeTable unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes != null && unsignedAttributes.getAll(CMSAttributes.cmsAlgorithmProtect).size() > 0) {
            str = "A cmsAlgorithmProtect attribute MUST be a signed attribute";
        } else {
            if (attributeTable == null) {
                return;
            }
            ASN1EncodableVector all = attributeTable.getAll(CMSAttributes.cmsAlgorithmProtect);
            if (all.size() > 1) {
                str = "Only one instance of a cmsAlgorithmProtect attribute can be present";
            } else {
                if (all.size() <= 0) {
                    return;
                }
                Attribute attribute = Attribute.getInstance(all.get(0));
                if (attribute.getAttrValues().size() == 1) {
                    CMSAlgorithmProtection cMSAlgorithmProtection = CMSAlgorithmProtection.getInstance(attribute.getAttributeValues()[0]);
                    if (!CMSUtils.isEquivalent(cMSAlgorithmProtection.getDigestAlgorithm(), this.info.getDigestAlgorithm())) {
                        str = "CMS Algorithm Identifier Protection check failed for digestAlgorithm";
                    } else if (CMSUtils.isEquivalent(cMSAlgorithmProtection.getSignatureAlgorithm(), this.info.getDigestEncryptionAlgorithm())) {
                        return;
                    } else {
                        str = "CMS Algorithm Identifier Protection check failed for signatureAlgorithm";
                    }
                } else {
                    str = "A cmsAlgorithmProtect attribute MUST contain exactly one value";
                }
            }
        }
        f$$ExternalSyntheticLambda0.m$1(str);
    }

    private void verifyContentTypeAttributeValue() {
        String str;
        ASN1Primitive singleValuedSignedAttribute = getSingleValuedSignedAttribute(CMSAttributes.contentType, "content-type");
        boolean z = this.isCounterSignature;
        if (singleValuedSignedAttribute == null) {
            if (z || this.signedAttributeSet == null) {
                return;
            } else {
                str = "The content-type attribute type MUST be present whenever signed attributes are present in signed-data";
            }
        } else if (z) {
            str = "[For counter signatures,] the signedAttributes field MUST NOT contain a content-type attribute";
        } else if (!(singleValuedSignedAttribute instanceof ASN1ObjectIdentifier)) {
            str = "content-type attribute value not of ASN.1 type 'OBJECT IDENTIFIER'";
        } else if (((ASN1ObjectIdentifier) singleValuedSignedAttribute).equals((ASN1Primitive) this.contentType)) {
            return;
        } else {
            str = "content-type attribute value does not match eContentType";
        }
        f$$ExternalSyntheticLambda0.m$1(str);
    }

    private void verifyCounterSignatureAttribute(AttributeTable attributeTable) {
        String str;
        if (attributeTable == null || attributeTable.getAll(CMSAttributes.counterSignature).size() <= 0) {
            AttributeTable unsignedAttributes = getUnsignedAttributes();
            if (unsignedAttributes != null) {
                ASN1EncodableVector all = unsignedAttributes.getAll(CMSAttributes.counterSignature);
                for (int i = 0; i < all.size(); i++) {
                    if (Attribute.getInstance(all.get(i)).getAttrValues().size() < 1) {
                        str = "A countersignature attribute MUST contain at least one AttributeValue";
                    }
                }
                return;
            }
            return;
        }
        str = "A countersignature attribute MUST NOT be a signed attribute";
        f$$ExternalSyntheticLambda0.m$1(str);
    }

    private void verifyMessageDigestAttribute() {
        String str;
        ASN1Primitive singleValuedSignedAttribute = getSingleValuedSignedAttribute(CMSAttributes.messageDigest, "message-digest");
        if (singleValuedSignedAttribute == null) {
            if (this.signedAttributeSet == null) {
                return;
            } else {
                str = "the message-digest signed attribute type MUST be present when there are any signed attributes present";
            }
        } else {
            if (singleValuedSignedAttribute instanceof ASN1OctetString) {
                if (!Arrays.constantTimeAreEqual(this.resultDigest, ((ASN1OctetString) singleValuedSignedAttribute).getOctets())) {
                    throw new CMSSignerDigestMismatchException("message-digest attribute value does not match calculated value");
                }
                return;
            }
            str = "message-digest attribute value not of ASN.1 type 'OCTET STRING'";
        }
        f$$ExternalSyntheticLambda0.m$1(str);
    }

    public byte[] getContentDigest() {
        byte[] bArr = this.resultDigest;
        if (bArr != null) {
            return Arrays.clone(bArr);
        }
        a$$ExternalSyntheticBUOutline0.m$1("method can only be called after verify.");
        return null;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.contentType;
    }

    public SignerInformationStore getCounterSignatures() {
        AttributeTable unsignedAttributes = getUnsignedAttributes();
        if (unsignedAttributes == null) {
            return new SignerInformationStore(new ArrayList(0));
        }
        ArrayList arrayList = new ArrayList();
        ASN1EncodableVector all = unsignedAttributes.getAll(CMSAttributes.counterSignature);
        for (int i = 0; i < all.size(); i++) {
            ASN1Set attrValues = ((Attribute) all.get(i)).getAttrValues();
            attrValues.size();
            Enumeration objects = attrValues.getObjects();
            while (objects.hasMoreElements()) {
                arrayList.add(new SignerInformation(SignerInfo.getInstance(objects.nextElement()), null, new CMSProcessableByteArray(getSignature()), null));
            }
        }
        return new SignerInformationStore(arrayList);
    }

    public String getDigestAlgOID() {
        return this.digestAlgorithm.getAlgorithm().getId();
    }

    public byte[] getDigestAlgParams() {
        try {
            return CMSUtils.encodeObj(this.digestAlgorithm.getParameters());
        } catch (Exception e) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(Boxes$$ExternalSyntheticOutline1.m(e, "exception getting digest parameters "));
            return null;
        }
    }

    public AlgorithmIdentifier getDigestAlgorithmID() {
        return this.digestAlgorithm;
    }

    public byte[] getEncodedSignedAttributes() {
        ASN1Set aSN1Set = this.signedAttributeSet;
        if (aSN1Set != null) {
            return aSN1Set.getEncoded(ASN1Encoding.DER);
        }
        return null;
    }

    public String getEncryptionAlgOID() {
        return this.encryptionAlgorithm.getAlgorithm().getId();
    }

    public byte[] getEncryptionAlgParams() {
        try {
            return CMSUtils.encodeObj(this.encryptionAlgorithm.getParameters());
        } catch (Exception e) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(Boxes$$ExternalSyntheticOutline1.m(e, "exception getting encryption parameters "));
            return null;
        }
    }

    public SignerId getSID() {
        return this.sid;
    }

    public byte[] getSignature() {
        return Arrays.clone(this.signature);
    }

    public AttributeTable getSignedAttributes() {
        ASN1Set aSN1Set = this.signedAttributeSet;
        if (aSN1Set != null && this.signedAttributeValues == null) {
            this.signedAttributeValues = new AttributeTable(aSN1Set);
        }
        return this.signedAttributeValues;
    }

    public AttributeTable getUnsignedAttributes() {
        ASN1Set aSN1Set = this.unsignedAttributeSet;
        if (aSN1Set != null && this.unsignedAttributeValues == null) {
            this.unsignedAttributeValues = new AttributeTable(aSN1Set);
        }
        return this.unsignedAttributeValues;
    }

    public int getVersion() {
        return this.info.getVersion().intValueExact();
    }

    public boolean isCounterSignature() {
        return this.isCounterSignature;
    }

    public SignerInfo toASN1Structure() {
        return this.info;
    }

    public boolean verify(SignerInformationVerifier signerInformationVerifier) {
        Time signingTime = getSigningTime();
        if (!signerInformationVerifier.hasAssociatedCertificate() || signingTime == null || signerInformationVerifier.getAssociatedCertificate().isValidOn(signingTime.getDate())) {
            return doVerify(signerInformationVerifier);
        }
        throw new CMSVerifierCertificateNotValidException("verifier not valid at signingTime");
    }

    public SignerInformation(SignerInformation signerInformation) {
        this(signerInformation, signerInformation.info);
    }

    public SignerInformation(SignerInformation signerInformation, SignerInfo signerInfo) {
        this.info = signerInfo;
        this.contentType = signerInformation.contentType;
        this.isCounterSignature = signerInformation.isCounterSignature();
        this.sid = signerInformation.getSID();
        this.digestAlgorithm = signerInfo.getDigestAlgorithm();
        this.signedAttributeSet = signerInfo.getAuthenticatedAttributes();
        this.unsignedAttributeSet = signerInfo.getUnauthenticatedAttributes();
        this.encryptionAlgorithm = signerInfo.getDigestEncryptionAlgorithm();
        this.signature = signerInfo.getEncryptedDigest().getOctets();
        this.content = signerInformation.content;
        this.resultDigest = signerInformation.resultDigest;
        this.signedAttributeValues = getSignedAttributes();
        this.unsignedAttributeValues = getUnsignedAttributes();
    }
}
