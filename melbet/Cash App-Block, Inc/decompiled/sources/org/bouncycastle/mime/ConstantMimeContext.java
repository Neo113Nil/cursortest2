package org.bouncycastle.mime;

import java.io.InputStream;

/* loaded from: classes8.dex */
public class ConstantMimeContext implements MimeContext, MimeMultipartContext {
    public static final ConstantMimeContext Instance = new ConstantMimeContext();

    @Override // org.bouncycastle.mime.MimeContext
    public InputStream applyContext(Headers headers, InputStream inputStream) {
        return inputStream;
    }

    @Override // org.bouncycastle.mime.MimeMultipartContext
    public MimeContext createContext(int i) {
        return this;
    }
}
