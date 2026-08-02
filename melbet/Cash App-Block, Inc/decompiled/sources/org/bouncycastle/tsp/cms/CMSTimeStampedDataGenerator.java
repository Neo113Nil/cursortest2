package org.bouncycastle.tsp.cms;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.Evidence;
import org.bouncycastle.asn1.cms.TimeStampAndCRL;
import org.bouncycastle.asn1.cms.TimeStampTokenEvidence;
import org.bouncycastle.asn1.cms.TimeStampedData;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.tsp.TimeStampToken;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes9.dex */
public class CMSTimeStampedDataGenerator extends CMSTimeStampedGenerator {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CMSTimeStampedData generate(TimeStampToken timeStampToken, InputStream inputStream) {
        BEROctetString bEROctetString;
        if (inputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Streams.pipeAll(inputStream, byteArrayOutputStream);
                if (byteArrayOutputStream.size() != 0) {
                    bEROctetString = new BEROctetString(byteArrayOutputStream.toByteArray());
                    return new CMSTimeStampedData(new ContentInfo(CMSObjectIdentifiers.timestampedData, new TimeStampedData(this.dataUri != null ? new DERIA5String(this.dataUri.toString()) : null, this.metaData, bEROctetString, new Evidence(new TimeStampTokenEvidence(new TimeStampAndCRL(timeStampToken.toCMSSignedData().toASN1Structure()))))));
                }
            } catch (IOException e) {
                throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("exception encapsulating content: ")), e);
            }
        }
        bEROctetString = null;
        return new CMSTimeStampedData(new ContentInfo(CMSObjectIdentifiers.timestampedData, new TimeStampedData(this.dataUri != null ? new DERIA5String(this.dataUri.toString()) : null, this.metaData, bEROctetString, new Evidence(new TimeStampTokenEvidence(new TimeStampAndCRL(timeStampToken.toCMSSignedData().toASN1Structure()))))));
    }

    public CMSTimeStampedData generate(TimeStampToken timeStampToken) {
        return generate(timeStampToken, (InputStream) null);
    }

    public CMSTimeStampedData generate(TimeStampToken timeStampToken, byte[] bArr) {
        return generate(timeStampToken, new ByteArrayInputStream(bArr));
    }
}
