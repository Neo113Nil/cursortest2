package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.cms.CompressedDataParser;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.operator.InputExpanderProvider;

/* loaded from: classes9.dex */
public class CMSCompressedDataParser extends CMSContentInfoParser {
    public CMSCompressedDataParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public CMSTypedStream getContent(InputExpanderProvider inputExpanderProvider) {
        try {
            CompressedDataParser compressedDataParser = new CompressedDataParser((ASN1SequenceParser) this._contentInfo.getContent(16));
            ContentInfoParser encapContentInfo = compressedDataParser.getEncapContentInfo();
            return new CMSTypedStream(encapContentInfo.getContentType(), inputExpanderProvider.get(compressedDataParser.getCompressionAlgorithmIdentifier()).getInputStream(((ASN1OctetStringParser) encapContentInfo.getContent(4)).getOctetStream()));
        } catch (IOException e) {
            f$$ExternalSyntheticLambda0.m((Exception) e, "IOException reading compressed content.");
            return null;
        }
    }

    public CMSCompressedDataParser(InputStream inputStream) {
        super(inputStream);
    }
}
