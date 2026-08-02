package org.bouncycastle.cms;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSEnvelopedHelper;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes9.dex */
public abstract class RecipientInformation {
    protected AlgorithmIdentifier keyEncAlg;
    protected AlgorithmIdentifier messageAlgorithm;
    private RecipientOperator operator;
    private byte[] resultMac;
    protected RecipientId rid;
    protected CMSSecureReadable secureReadable;

    public RecipientInformation(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, CMSSecureReadable cMSSecureReadable) {
        this.keyEncAlg = algorithmIdentifier;
        this.messageAlgorithm = algorithmIdentifier2;
        this.secureReadable = cMSSecureReadable;
    }

    public byte[] getContent(Recipient recipient) {
        try {
            return CMSUtils.streamToByteArray(getContentStream(recipient).getContentStream());
        } catch (IOException e) {
            throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to parse internal stream: ")), e);
        }
    }

    public byte[] getContentDigest() {
        CMSSecureReadable cMSSecureReadable = this.secureReadable;
        if (cMSSecureReadable instanceof CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable) {
            return ((CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable) cMSSecureReadable).getDigest();
        }
        return null;
    }

    public CMSTypedStream getContentStream(Recipient recipient) {
        RecipientOperator recipientOperator = getRecipientOperator(recipient);
        this.operator = recipientOperator;
        boolean isAEADBased = recipientOperator.isAEADBased();
        CMSSecureReadable cMSSecureReadable = this.secureReadable;
        if (isAEADBased) {
            ((CMSSecureReadableWithAAD) cMSSecureReadable).setAADStream(this.operator.getAADStream());
        } else if (cMSSecureReadable.hasAdditionalData()) {
            return new CMSTypedStream(this.secureReadable.getContentType(), this.secureReadable.getInputStream());
        }
        return new CMSTypedStream(this.secureReadable.getContentType(), this.operator.getInputStream(this.secureReadable.getInputStream()));
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.secureReadable.getContentType();
    }

    public String getKeyEncryptionAlgOID() {
        return this.keyEncAlg.getAlgorithm().getId();
    }

    public byte[] getKeyEncryptionAlgParams() {
        try {
            return CMSUtils.encodeObj(this.keyEncAlg.getParameters());
        } catch (Exception e) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(Boxes$$ExternalSyntheticOutline1.m(e, "exception getting encryption parameters "));
            return null;
        }
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.keyEncAlg;
    }

    public byte[] getMac() {
        if (this.resultMac == null) {
            if (this.operator.isMacBased() && this.secureReadable.hasAdditionalData()) {
                try {
                    Streams.drain(this.operator.getInputStream(new ByteArrayInputStream(this.secureReadable.getAuthAttrSet().getEncoded(ASN1Encoding.DER))));
                } catch (IOException e) {
                    a$$ExternalSyntheticBUOutline0.m$1(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to drain input: ")));
                    return null;
                }
            }
            this.resultMac = this.operator.getMac();
        }
        return this.resultMac;
    }

    public RecipientId getRID() {
        return this.rid;
    }

    public abstract RecipientOperator getRecipientOperator(Recipient recipient);
}
