package org.bouncycastle.cms;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.AuthenticatedDataParser;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSEnvelopedHelper;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class CMSAuthenticatedDataParser extends CMSContentInfoParser {
    private boolean authAttrNotRead;
    private ASN1Set authAttrSet;
    private AttributeTable authAttrs;
    AuthenticatedDataParser authData;
    private byte[] mac;
    private AlgorithmIdentifier macAlg;
    private OriginatorInformation originatorInfo;
    RecipientInformationStore recipientInfoStore;
    private CMSSecureReadable secureReadable;
    private boolean unauthAttrNotRead;
    private AttributeTable unauthAttrs;

    public CMSAuthenticatedDataParser(InputStream inputStream, DigestCalculatorProvider digestCalculatorProvider) {
        super(inputStream);
        this.authAttrNotRead = true;
        AuthenticatedDataParser authenticatedDataParser = new AuthenticatedDataParser((ASN1SequenceParser) this._contentInfo.getContent(16));
        this.authData = authenticatedDataParser;
        OriginatorInfo originatorInfo = authenticatedDataParser.getOriginatorInfo();
        if (originatorInfo != null) {
            this.originatorInfo = new OriginatorInformation(originatorInfo);
        }
        ASN1Set aSN1Set = ASN1Set.getInstance(this.authData.getRecipientInfos().toASN1Primitive());
        this.macAlg = this.authData.getMacAlgorithm();
        AlgorithmIdentifier digestAlgorithm = this.authData.getDigestAlgorithm();
        if (digestAlgorithm == null) {
            ContentInfoParser encapsulatedContentInfo = this.authData.getEncapsulatedContentInfo();
            CMSEnvelopedHelper.CMSAuthEnveSecureReadable cMSAuthEnveSecureReadable = new CMSEnvelopedHelper.CMSAuthEnveSecureReadable(this.macAlg, encapsulatedContentInfo.getContentType(), new CMSProcessableInputStream(((ASN1OctetStringParser) encapsulatedContentInfo.getContent(4)).getOctetStream()));
            this.secureReadable = cMSAuthEnveSecureReadable;
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.macAlg, cMSAuthEnveSecureReadable);
            return;
        }
        if (digestCalculatorProvider == null) {
            f$$ExternalSyntheticLambda0.m$1("a digest calculator provider is required if authenticated attributes are present");
            throw null;
        }
        ContentInfoParser encapsulatedContentInfo2 = this.authData.getEncapsulatedContentInfo();
        try {
            CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable cMSDigestAuthenticatedSecureReadable = new CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable(digestCalculatorProvider.get(digestAlgorithm), encapsulatedContentInfo2.getContentType(), new CMSProcessableInputStream(((ASN1OctetStringParser) encapsulatedContentInfo2.getContent(4)).getOctetStream()));
            this.secureReadable = cMSDigestAuthenticatedSecureReadable;
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.macAlg, cMSDigestAuthenticatedSecureReadable);
        } catch (OperatorCreationException e) {
            throw new CMSException("unable to create digest calculator: " + e.getMessage(), e);
        }
    }

    private ASN1Set getAuthAttrSet() {
        if (this.authAttrs == null && this.authAttrNotRead) {
            ASN1SetParser authAttrs = this.authData.getAuthAttrs();
            if (authAttrs != null) {
                this.authAttrSet = (ASN1Set) authAttrs.toASN1Primitive();
            }
            this.authAttrNotRead = false;
            this.secureReadable.setAuthAttrSet(this.authAttrSet);
        }
        return this.authAttrSet;
    }

    public AttributeTable getAuthAttrs() {
        ASN1Set authAttrSet;
        if (this.authAttrs == null && this.authAttrNotRead && (authAttrSet = getAuthAttrSet()) != null) {
            this.authAttrs = new AttributeTable(authAttrSet);
        }
        return this.authAttrs;
    }

    public byte[] getContentDigest() {
        AttributeTable attributeTable = this.authAttrs;
        if (attributeTable != null) {
            return ASN1OctetString.getInstance(attributeTable.get(CMSAttributes.messageDigest).getAttrValues().getObjectAt(0)).getOctets();
        }
        return null;
    }

    public byte[] getMac() {
        if (this.mac == null) {
            getAuthAttrs();
            this.mac = this.authData.getMac().getOctets();
        }
        return Arrays.clone(this.mac);
    }

    public String getMacAlgOID() {
        return this.macAlg.getAlgorithm().toString();
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
        if (this.unauthAttrs == null && this.unauthAttrNotRead) {
            this.unauthAttrNotRead = false;
            this.unauthAttrs = CMSUtils.getAttributesTable(this.authData.getUnauthAttrs());
        }
        return this.unauthAttrs;
    }

    public CMSAuthenticatedDataParser(InputStream inputStream) {
        this(inputStream, (DigestCalculatorProvider) null);
    }

    public CMSAuthenticatedDataParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public CMSAuthenticatedDataParser(byte[] bArr, DigestCalculatorProvider digestCalculatorProvider) {
        this(new ByteArrayInputStream(bArr), digestCalculatorProvider);
    }
}
