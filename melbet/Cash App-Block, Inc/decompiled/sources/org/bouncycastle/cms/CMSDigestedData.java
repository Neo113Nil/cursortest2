package org.bouncycastle.cms;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.io.InputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.DigestedData;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* loaded from: classes9.dex */
public class CMSDigestedData implements Encodable {
    private ContentInfo contentInfo;
    private DigestedData digestedData;

    public CMSDigestedData(ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
        try {
            this.digestedData = DigestedData.getInstance(contentInfo.getContent());
        } catch (ClassCastException e) {
            f$$ExternalSyntheticLambda0.m((Exception) e, "Malformed content.");
            throw null;
        } catch (IllegalArgumentException e2) {
            f$$ExternalSyntheticLambda0.m((Exception) e2, "Malformed content.");
            throw null;
        }
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.contentInfo.getContentType();
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digestedData.getDigestAlgorithm();
    }

    public CMSProcessable getDigestedContent() {
        ContentInfo encapContentInfo = this.digestedData.getEncapContentInfo();
        try {
            return new CMSProcessableByteArray(encapContentInfo.getContentType(), ((ASN1OctetString) encapContentInfo.getContent()).getOctets());
        } catch (Exception e) {
            f$$ExternalSyntheticLambda0.m(e, "exception reading digested stream.");
            return null;
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return this.contentInfo.getEncoded();
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public boolean verify(DigestCalculatorProvider digestCalculatorProvider) {
        try {
            ContentInfo encapContentInfo = this.digestedData.getEncapContentInfo();
            DigestCalculator digestCalculator = digestCalculatorProvider.get(this.digestedData.getDigestAlgorithm());
            digestCalculator.getOutputStream().write(((ASN1OctetString) encapContentInfo.getContent()).getOctets());
            return Arrays.areEqual(this.digestedData.getDigest(), digestCalculator.getDigest());
        } catch (IOException e) {
            throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable process content: ")), e);
        } catch (OperatorCreationException e2) {
            throw new CMSException("unable to create digest calculator: " + e2.getMessage(), e2);
        }
    }

    public CMSDigestedData(InputStream inputStream) {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public CMSDigestedData(byte[] bArr) {
        this(CMSUtils.readContentInfo(bArr));
    }
}
