package org.bouncycastle.tsp.cms;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.TimeStampAndCRL;
import org.bouncycastle.asn1.cms.TimeStampedData;
import org.bouncycastle.asn1.cms.TimeStampedDataParser;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampToken;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
class TimeStampDataUtil {
    private final MetaDataUtil metaDataUtil;
    private final TimeStampAndCRL[] timeStamps;

    public TimeStampDataUtil(TimeStampedData timeStampedData) {
        this.metaDataUtil = new MetaDataUtil(timeStampedData.getMetaData());
        this.timeStamps = timeStampedData.getTemporalEvidence().getTstEvidence().toTimeStampAndCRLArray();
    }

    private void compareDigest(TimeStampToken timeStampToken, byte[] bArr) {
        if (!Arrays.areEqual(bArr, timeStampToken.getTimeStampInfo().getMessageImprintDigest())) {
            throw new ImprintDigestInvalidException("hash calculated is different from MessageImprintDigest found in TimeStampToken", timeStampToken);
        }
    }

    public byte[] calculateNextHash(DigestCalculator digestCalculator) {
        TimeStampAndCRL timeStampAndCRL = this.timeStamps[r2.length - 1];
        OutputStream outputStream = digestCalculator.getOutputStream();
        try {
            outputStream.write(timeStampAndCRL.getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e) {
            throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("exception calculating hash: ")), e);
        }
    }

    public String getFileName() {
        return this.metaDataUtil.getFileName();
    }

    public String getMediaType() {
        return this.metaDataUtil.getMediaType();
    }

    public DigestCalculator getMessageImprintDigestCalculator(DigestCalculatorProvider digestCalculatorProvider) {
        try {
            DigestCalculator digestCalculator = digestCalculatorProvider.get(new AlgorithmIdentifier(getTimeStampToken(this.timeStamps[0]).getTimeStampInfo().getMessageImprintAlgOID()));
            initialiseMessageImprintDigestCalculator(digestCalculator);
            return digestCalculator;
        } catch (CMSException e) {
            throw new OperatorCreationException("unable to extract algorithm ID: " + e.getMessage(), e);
        }
    }

    public AttributeTable getOtherMetaData() {
        return new AttributeTable(this.metaDataUtil.getOtherMetaData());
    }

    public TimeStampToken getTimeStampToken(TimeStampAndCRL timeStampAndCRL) {
        try {
            return new TimeStampToken(timeStampAndCRL.getTimeStampToken());
        } catch (IOException e) {
            throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to parse token data: ")), e);
        } catch (IllegalArgumentException e2) {
            throw new CMSException(GetCert$$ExternalSyntheticOutline0.m(e2, new StringBuilder("token data invalid: ")), e2);
        } catch (TSPException e3) {
            if (e3.getCause() instanceof CMSException) {
                throw ((CMSException) e3.getCause());
            }
            throw new CMSException("token data invalid: " + e3.getMessage(), e3);
        }
    }

    public TimeStampToken[] getTimeStampTokens() {
        TimeStampToken[] timeStampTokenArr = new TimeStampToken[this.timeStamps.length];
        int i = 0;
        while (true) {
            TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
            if (i >= timeStampAndCRLArr.length) {
                return timeStampTokenArr;
            }
            timeStampTokenArr[i] = getTimeStampToken(timeStampAndCRLArr[i]);
            i++;
        }
    }

    public TimeStampAndCRL[] getTimeStamps() {
        return this.timeStamps;
    }

    public void initialiseMessageImprintDigestCalculator(DigestCalculator digestCalculator) {
        this.metaDataUtil.initialiseMessageImprintDigestCalculator(digestCalculator);
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr, TimeStampToken timeStampToken) {
        try {
            byte[] encoded = timeStampToken.getEncoded();
            int i = 0;
            while (true) {
                TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
                if (i >= timeStampAndCRLArr.length) {
                    throw new ImprintDigestInvalidException("passed in token not associated with timestamps present", timeStampToken);
                }
                try {
                    TimeStampToken timeStampToken2 = getTimeStampToken(timeStampAndCRLArr[i]);
                    if (i > 0) {
                        DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampToken2.getTimeStampInfo().getHashAlgorithm());
                        digestCalculator.getOutputStream().write(this.timeStamps[i - 1].getEncoded(ASN1Encoding.DER));
                        bArr = digestCalculator.getDigest();
                    }
                    compareDigest(timeStampToken2, bArr);
                    if (Arrays.areEqual(timeStampToken2.getEncoded(), encoded)) {
                        return;
                    } else {
                        i++;
                    }
                } catch (IOException e) {
                    throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("exception calculating hash: ")), e);
                } catch (OperatorCreationException e2) {
                    throw new CMSException("cannot create digest: " + e2.getMessage(), e2);
                }
            }
        } catch (IOException e3) {
            throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e3, new StringBuilder("exception encoding timeStampToken: ")), e3);
        }
    }

    public TimeStampDataUtil(TimeStampedDataParser timeStampedDataParser) {
        this.metaDataUtil = new MetaDataUtil(timeStampedDataParser.getMetaData());
        this.timeStamps = timeStampedDataParser.getTemporalEvidence().getTstEvidence().toTimeStampAndCRLArray();
    }

    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) {
        int i = 0;
        while (true) {
            TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
            if (i >= timeStampAndCRLArr.length) {
                return;
            }
            try {
                TimeStampToken timeStampToken = getTimeStampToken(timeStampAndCRLArr[i]);
                if (i > 0) {
                    DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampToken.getTimeStampInfo().getHashAlgorithm());
                    digestCalculator.getOutputStream().write(this.timeStamps[i - 1].getEncoded(ASN1Encoding.DER));
                    bArr = digestCalculator.getDigest();
                }
                compareDigest(timeStampToken, bArr);
                i++;
            } catch (IOException e) {
                throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("exception calculating hash: ")), e);
            } catch (OperatorCreationException e2) {
                throw new CMSException("cannot create digest: " + e2.getMessage(), e2);
            }
        }
    }
}
