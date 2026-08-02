package org.bouncycastle.cms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;

/* loaded from: classes9.dex */
public class CMSEnvelopedDataGenerator extends CMSEnvelopedGenerator {
    private CMSEnvelopedData doGenerate(CMSTypedData cMSTypedData, OutputEncryptor outputEncryptor) {
        ASN1EncodableVector recipentInfos = CMSUtils.getRecipentInfos(outputEncryptor.getKey(), this.recipientInfoGenerators);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OutputStream outputStream = outputEncryptor.getOutputStream(byteArrayOutputStream);
            cMSTypedData.write(outputStream);
            outputStream.close();
            if (outputEncryptor instanceof OutputAEADEncryptor) {
                byte[] mac = ((OutputAEADEncryptor) outputEncryptor).getMAC();
                byteArrayOutputStream.write(mac, 0, mac.length);
            }
            return new CMSEnvelopedData(new ContentInfo(CMSObjectIdentifiers.envelopedData, new EnvelopedData(this.originatorInfo, new DERSet(recipentInfos), CMSUtils.getEncryptedContentInfo(cMSTypedData, outputEncryptor, byteArrayOutputStream.toByteArray()), CMSUtils.getAttrBERSet(this.unprotectedAttributeGenerator))));
        } catch (IOException unused) {
            f$$ExternalSyntheticLambda0.m$1("");
            return null;
        }
    }

    public CMSEnvelopedData generate(CMSTypedData cMSTypedData, OutputEncryptor outputEncryptor) {
        return doGenerate(cMSTypedData, outputEncryptor);
    }
}
