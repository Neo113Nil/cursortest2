package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.cms.ContentInfoParser;

/* loaded from: classes9.dex */
public class CMSContentInfoParser {
    protected ContentInfoParser _contentInfo;
    protected InputStream _data;

    public CMSContentInfoParser(InputStream inputStream) {
        this._data = inputStream;
        try {
            ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser) new ASN1StreamParser(inputStream).readObject();
            if (aSN1SequenceParser == null) {
                throw new CMSException("No content found.");
            }
            this._contentInfo = new ContentInfoParser(aSN1SequenceParser);
        } catch (IOException e) {
            f$$ExternalSyntheticLambda0.m((Exception) e, "IOException reading content.");
            throw null;
        } catch (ClassCastException e2) {
            f$$ExternalSyntheticLambda0.m((Exception) e2, "Unexpected object reading content.");
            throw null;
        }
    }

    public void close() {
        this._data.close();
    }
}
