package org.bouncycastle.cms;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.AuthEnvelopedData;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.operator.OutputAEADEncryptor;

/* loaded from: classes9.dex */
public class CMSAuthEnvelopedDataGenerator extends CMSAuthEnvelopedGenerator {
    private CMSAuthEnvelopedData doGenerate(CMSTypedData cMSTypedData, OutputAEADEncryptor outputAEADEncryptor) {
        ASN1EncodableVector recipentInfos = CMSUtils.getRecipentInfos(outputAEADEncryptor.getKey(), ((CMSAuthEnvelopedGenerator) this).recipientInfoGenerators);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OutputStream outputStream = outputAEADEncryptor.getOutputStream(byteArrayOutputStream);
            cMSTypedData.write(outputStream);
            ASN1Set processAuthAttrSet = CMSUtils.processAuthAttrSet(this.authAttrsGenerator, outputAEADEncryptor);
            outputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byte[] mac = outputAEADEncryptor.getMAC();
            return new CMSAuthEnvelopedData(new ContentInfo(CMSObjectIdentifiers.authEnvelopedData, new AuthEnvelopedData(((CMSAuthEnvelopedGenerator) this).originatorInfo, new DERSet(recipentInfos), CMSUtils.getEncryptedContentInfo(cMSTypedData, outputAEADEncryptor, byteArray), processAuthAttrSet, new DEROctetString(mac), CMSUtils.getAttrDLSet(this.unauthAttrsGenerator))));
        } catch (IOException e) {
            throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to process authenticated content: ")), e);
        }
    }

    public CMSAuthEnvelopedData generate(CMSTypedData cMSTypedData, OutputAEADEncryptor outputAEADEncryptor) {
        return doGenerate(cMSTypedData, outputAEADEncryptor);
    }
}
