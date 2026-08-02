package org.bouncycastle.cms;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.CompressedData;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.operator.OutputCompressor;

/* loaded from: classes9.dex */
public class CMSCompressedDataGenerator {
    public static final String ZLIB = CMSObjectIdentifiers.zlibCompress.getId();

    public CMSCompressedData generate(CMSTypedData cMSTypedData, OutputCompressor outputCompressor) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream outputStream = outputCompressor.getOutputStream(byteArrayOutputStream);
            cMSTypedData.write(outputStream);
            outputStream.close();
            return new CMSCompressedData(new ContentInfo(CMSObjectIdentifiers.compressedData, new CompressedData(outputCompressor.getAlgorithmIdentifier(), new ContentInfo(cMSTypedData.getContentType(), new BEROctetString(byteArrayOutputStream.toByteArray())))));
        } catch (IOException e) {
            f$$ExternalSyntheticLambda0.m((Exception) e, "exception encoding data.");
            return null;
        }
    }
}
