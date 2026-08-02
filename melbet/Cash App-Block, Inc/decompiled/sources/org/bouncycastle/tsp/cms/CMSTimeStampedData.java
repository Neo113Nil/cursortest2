package org.bouncycastle.tsp.cms;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.Evidence;
import org.bouncycastle.asn1.cms.TimeStampAndCRL;
import org.bouncycastle.asn1.cms.TimeStampTokenEvidence;
import org.bouncycastle.asn1.cms.TimeStampedData;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.tsp.TimeStampToken;

/* loaded from: classes10.dex */
public class CMSTimeStampedData {
    private ContentInfo contentInfo;
    private TimeStampedData timeStampedData;
    private TimeStampDataUtil util;

    public CMSTimeStampedData(InputStream inputStream) {
        try {
            initialize(ContentInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
        } catch (ClassCastException e) {
            a$$ExternalSyntheticBUOutline0.m$3(e, "Malformed content: ");
            throw null;
        } catch (IllegalArgumentException e2) {
            a$$ExternalSyntheticBUOutline0.m$3(e2, "Malformed content: ");
            throw null;
        }
    }

    private void initialize(ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSObjectIdentifiers.timestampedData;
        if (!aSN1ObjectIdentifier.equals((ASN1Primitive) contentInfo.getContentType())) {
            Path$$ExternalSyntheticBUOutline0.m(aSN1ObjectIdentifier.getId(), "Malformed content - type must be ");
            return;
        }
        TimeStampedData timeStampedData = TimeStampedData.getInstance(contentInfo.getContent());
        this.timeStampedData = timeStampedData;
        this.util = new TimeStampDataUtil(timeStampedData);
    }

    public CMSTimeStampedData addTimeStamp(TimeStampToken timeStampToken) {
        TimeStampAndCRL[] timeStamps = this.util.getTimeStamps();
        TimeStampAndCRL[] timeStampAndCRLArr = new TimeStampAndCRL[timeStamps.length + 1];
        System.arraycopy(timeStamps, 0, timeStampAndCRLArr, 0, timeStamps.length);
        timeStampAndCRLArr[timeStamps.length] = new TimeStampAndCRL(timeStampToken.toCMSSignedData().toASN1Structure());
        return new CMSTimeStampedData(new ContentInfo(CMSObjectIdentifiers.timestampedData, new TimeStampedData(this.timeStampedData.getDataUriIA5(), this.timeStampedData.getMetaData(), this.timeStampedData.getContent(), new Evidence(new TimeStampTokenEvidence(timeStampAndCRLArr)))));
    }

    public byte[] calculateNextHash(DigestCalculator digestCalculator) {
        return this.util.calculateNextHash(digestCalculator);
    }

    public byte[] getContent() {
        if (this.timeStampedData.getContent() != null) {
            return this.timeStampedData.getContent().getOctets();
        }
        return null;
    }

    public URI getDataUri() {
        ASN1IA5String dataUriIA5 = this.timeStampedData.getDataUriIA5();
        if (dataUriIA5 != null) {
            return new URI(dataUriIA5.getString());
        }
        return null;
    }

    public byte[] getEncoded() {
        return this.contentInfo.getEncoded();
    }

    public String getFileName() {
        return this.util.getFileName();
    }

    public String getMediaType() {
        return this.util.getMediaType();
    }

    public DigestCalculator getMessageImprintDigestCalculator(DigestCalculatorProvider digestCalculatorProvider) {
        return this.util.getMessageImprintDigestCalculator(digestCalculatorProvider);
    }

    public AttributeTable getOtherMetaData() {
        return this.util.getOtherMetaData();
    }

    public TimeStampToken[] getTimeStampTokens() {
        return this.util.getTimeStampTokens();
    }

    public void initialiseMessageImprintDigestCalculator(DigestCalculator digestCalculator) {
        this.util.initialiseMessageImprintDigestCalculator(digestCalculator);
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) {
        this.util.validate(digestCalculatorProvider, bArr);
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr, TimeStampToken timeStampToken) {
        this.util.validate(digestCalculatorProvider, bArr, timeStampToken);
    }

    public CMSTimeStampedData(ContentInfo contentInfo) {
        initialize(contentInfo);
    }

    public CMSTimeStampedData(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
