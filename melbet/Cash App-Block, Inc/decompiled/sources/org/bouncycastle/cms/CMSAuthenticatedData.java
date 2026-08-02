package org.bouncycastle.cms;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.InputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.AuthenticatedData;
import org.bouncycastle.asn1.cms.CMSAlgorithmProtection;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSEnvelopedHelper;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* loaded from: classes9.dex */
public class CMSAuthenticatedData implements Encodable {
    private ASN1Set authAttrs;
    ContentInfo contentInfo;
    private byte[] mac;
    private AlgorithmIdentifier macAlg;
    private OriginatorInformation originatorInfo;
    RecipientInformationStore recipientInfoStore;
    private ASN1Set unauthAttrs;

    public CMSAuthenticatedData(ContentInfo contentInfo, DigestCalculatorProvider digestCalculatorProvider) {
        this.contentInfo = contentInfo;
        AuthenticatedData authenticatedData = AuthenticatedData.getInstance(contentInfo.getContent());
        if (authenticatedData.getOriginatorInfo() != null) {
            this.originatorInfo = new OriginatorInformation(authenticatedData.getOriginatorInfo());
        }
        ASN1Set recipientInfos = authenticatedData.getRecipientInfos();
        this.macAlg = authenticatedData.getMacAlgorithm();
        this.authAttrs = authenticatedData.getAuthAttrs();
        this.mac = authenticatedData.getMac().getOctets();
        this.unauthAttrs = authenticatedData.getUnauthAttrs();
        ContentInfo encapsulatedContentInfo = authenticatedData.getEncapsulatedContentInfo();
        CMSProcessableByteArray cMSProcessableByteArray = new CMSProcessableByteArray(encapsulatedContentInfo.getContentType(), ASN1OctetString.getInstance(encapsulatedContentInfo.getContent()).getOctets());
        ASN1Set aSN1Set = this.authAttrs;
        if (aSN1Set == null) {
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(recipientInfos, this.macAlg, new CMSEnvelopedHelper.CMSAuthEnveSecureReadable(this.macAlg, encapsulatedContentInfo.getContentType(), cMSProcessableByteArray));
            return;
        }
        if (digestCalculatorProvider == null) {
            f$$ExternalSyntheticLambda0.m$1("a digest calculator provider is required if authenticated attributes are present");
            throw null;
        }
        ASN1EncodableVector all = new AttributeTable(aSN1Set).getAll(CMSAttributes.cmsAlgorithmProtect);
        if (all.size() > 1) {
            f$$ExternalSyntheticLambda0.m$1("Only one instance of a cmsAlgorithmProtect attribute can be present");
            throw null;
        }
        if (all.size() > 0) {
            Attribute attribute = Attribute.getInstance(all.get(0));
            if (attribute.getAttrValues().size() != 1) {
                f$$ExternalSyntheticLambda0.m$1("A cmsAlgorithmProtect attribute MUST contain exactly one value");
                throw null;
            }
            CMSAlgorithmProtection cMSAlgorithmProtection = CMSAlgorithmProtection.getInstance(attribute.getAttributeValues()[0]);
            if (!CMSUtils.isEquivalent(cMSAlgorithmProtection.getDigestAlgorithm(), authenticatedData.getDigestAlgorithm())) {
                f$$ExternalSyntheticLambda0.m$1("CMS Algorithm Identifier Protection check failed for digestAlgorithm");
                throw null;
            }
            if (!CMSUtils.isEquivalent(cMSAlgorithmProtection.getMacAlgorithm(), this.macAlg)) {
                f$$ExternalSyntheticLambda0.m$1("CMS Algorithm Identifier Protection check failed for macAlgorithm");
                throw null;
            }
        }
        try {
            CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable cMSDigestAuthenticatedSecureReadable = new CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable(digestCalculatorProvider.get(authenticatedData.getDigestAlgorithm()), encapsulatedContentInfo.getContentType(), cMSProcessableByteArray);
            cMSDigestAuthenticatedSecureReadable.setAuthAttrSet(this.authAttrs);
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(recipientInfos, this.macAlg, cMSDigestAuthenticatedSecureReadable);
        } catch (OperatorCreationException e) {
            throw new CMSException("unable to create digest calculator: " + e.getMessage(), e);
        }
    }

    public AttributeTable getAuthAttrs() {
        ASN1Set aSN1Set = this.authAttrs;
        if (aSN1Set == null) {
            return null;
        }
        return new AttributeTable(aSN1Set);
    }

    public byte[] getContentDigest() {
        if (this.authAttrs != null) {
            return ASN1OctetString.getInstance(getAuthAttrs().get(CMSAttributes.messageDigest).getAttrValues().getObjectAt(0)).getOctets();
        }
        return null;
    }

    public ContentInfo getContentInfo() {
        return this.contentInfo;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return this.contentInfo.getEncoded();
    }

    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    public String getMacAlgOID() {
        return this.macAlg.getAlgorithm().getId();
    }

    public byte[] getMacAlgParams() {
        try {
            return CMSUtils.encodeObj(this.macAlg.getParameters());
        } catch (Exception e) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(Boxes$$ExternalSyntheticOutline1.m(e, "exception getting encryption parameters "));
            return null;
        }
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.macAlg;
    }

    public OriginatorInformation getOriginatorInfo() {
        return this.originatorInfo;
    }

    public RecipientInformationStore getRecipientInfos() {
        return this.recipientInfoStore;
    }

    public AttributeTable getUnauthAttrs() {
        ASN1Set aSN1Set = this.unauthAttrs;
        if (aSN1Set == null) {
            return null;
        }
        return new AttributeTable(aSN1Set);
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public CMSAuthenticatedData(InputStream inputStream, DigestCalculatorProvider digestCalculatorProvider) {
        this(CMSUtils.readContentInfo(inputStream), digestCalculatorProvider);
    }

    public CMSAuthenticatedData(ContentInfo contentInfo) {
        this(contentInfo, (DigestCalculatorProvider) null);
    }

    public CMSAuthenticatedData(InputStream inputStream) {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public CMSAuthenticatedData(byte[] bArr) {
        this(CMSUtils.readContentInfo(bArr));
    }

    public CMSAuthenticatedData(byte[] bArr, DigestCalculatorProvider digestCalculatorProvider) {
        this(CMSUtils.readContentInfo(bArr), digestCalculatorProvider);
    }
}
