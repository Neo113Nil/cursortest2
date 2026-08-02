package org.bouncycastle.tsp.cms;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.asn1.cms.TimeStampedDataParser;
import org.bouncycastle.cms.CMSContentInfoParser;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TimeStampToken;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes10.dex */
public class CMSTimeStampedDataParser extends CMSContentInfoParser {
    private TimeStampedDataParser timeStampedData;
    private TimeStampDataUtil util;

    public CMSTimeStampedDataParser(InputStream inputStream) {
        super(inputStream);
        initialize(this._contentInfo);
    }

    private void initialize(ContentInfoParser contentInfoParser) {
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSObjectIdentifiers.timestampedData;
            if (aSN1ObjectIdentifier.equals((ASN1Primitive) contentInfoParser.getContentType())) {
                this.timeStampedData = TimeStampedDataParser.getInstance(contentInfoParser.getContent(16));
            } else {
                throw new IllegalArgumentException("Malformed content - type must be " + aSN1ObjectIdentifier.getId());
            }
        } catch (IOException e) {
            throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("parsing exception: ")), e);
        }
    }

    private void parseTimeStamps() {
        try {
            if (this.util == null) {
                InputStream content = getContent();
                if (content != null) {
                    Streams.drain(content);
                }
                this.util = new TimeStampDataUtil(this.timeStampedData);
            }
        } catch (IOException e) {
            throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to parse evidence block: ")), e);
        }
    }

    public byte[] calculateNextHash(DigestCalculator digestCalculator) {
        return this.util.calculateNextHash(digestCalculator);
    }

    public InputStream getContent() {
        if (this.timeStampedData.getContent() != null) {
            return this.timeStampedData.getContent().getOctetStream();
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

    public String getFileName() {
        return this.util.getFileName();
    }

    public String getMediaType() {
        return this.util.getMediaType();
    }

    public DigestCalculator getMessageImprintDigestCalculator(DigestCalculatorProvider digestCalculatorProvider) {
        try {
            parseTimeStamps();
            return this.util.getMessageImprintDigestCalculator(digestCalculatorProvider);
        } catch (CMSException e) {
            throw new OperatorCreationException("unable to extract algorithm ID: " + e.getMessage(), e);
        }
    }

    public AttributeTable getOtherMetaData() {
        return this.util.getOtherMetaData();
    }

    public TimeStampToken[] getTimeStampTokens() {
        parseTimeStamps();
        return this.util.getTimeStampTokens();
    }

    public void initialiseMessageImprintDigestCalculator(DigestCalculator digestCalculator) {
        this.util.initialiseMessageImprintDigestCalculator(digestCalculator);
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) {
        parseTimeStamps();
        this.util.validate(digestCalculatorProvider, bArr);
    }

    public CMSTimeStampedDataParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr, TimeStampToken timeStampToken) {
        parseTimeStamps();
        this.util.validate(digestCalculatorProvider, bArr, timeStampToken);
    }
}
