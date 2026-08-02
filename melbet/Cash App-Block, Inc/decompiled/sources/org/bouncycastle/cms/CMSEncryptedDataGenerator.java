package org.bouncycastle.cms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedData;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.OutputEncryptor;

/* loaded from: classes9.dex */
public class CMSEncryptedDataGenerator extends CMSEncryptedGenerator {
    private CMSEncryptedData doGenerate(CMSTypedData cMSTypedData, OutputEncryptor outputEncryptor) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OutputStream outputStream = outputEncryptor.getOutputStream(byteArrayOutputStream);
            cMSTypedData.write(outputStream);
            outputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AlgorithmIdentifier algorithmIdentifier = outputEncryptor.getAlgorithmIdentifier();
            new BEROctetString(byteArray);
            return new CMSEncryptedData(new ContentInfo(CMSObjectIdentifiers.encryptedData, new EncryptedData(CMSUtils.getEncryptedContentInfo(cMSTypedData.getContentType(), algorithmIdentifier, byteArray), CMSUtils.getAttrBERSet(this.unprotectedAttributeGenerator))));
        } catch (IOException unused) {
            f$$ExternalSyntheticLambda0.m$1("");
            return null;
        }
    }

    public CMSEncryptedData generate(CMSTypedData cMSTypedData, OutputEncryptor outputEncryptor) {
        return doGenerate(cMSTypedData, outputEncryptor);
    }
}
