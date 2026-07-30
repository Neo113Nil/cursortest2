package com.yanzhenjie.kalle;

import android.text.TextUtils;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public class s extends a implements p {
    private final String mBody;
    private final Charset mCharset;
    private final String mContentType;

    public s(String str) {
        this(str, k.getConfig().getCharset());
    }

    @Override // com.yanzhenjie.kalle.a, com.yanzhenjie.kalle.f
    public long contentLength() {
        if (TextUtils.isEmpty(this.mBody)) {
            return 0L;
        }
        return com.yanzhenjie.kalle.util.a.toByteArray(this.mBody, this.mCharset).length;
    }

    @Override // com.yanzhenjie.kalle.a, com.yanzhenjie.kalle.f
    public String contentType() {
        return this.mContentType + "; charset=" + this.mCharset.name();
    }

    @Override // com.yanzhenjie.kalle.a
    protected void onWrite(OutputStream outputStream) {
        com.yanzhenjie.kalle.util.a.write(outputStream, this.mBody, this.mCharset);
    }

    public String toString() {
        return this.mBody;
    }

    public s(String str, Charset charset) {
        this(str, charset, "application/octet-stream");
    }

    public s(String str, String str2) {
        this(str, k.getConfig().getCharset(), str2);
    }

    public s(String str, Charset charset, String str2) {
        this.mBody = str;
        this.mCharset = charset;
        this.mContentType = str2;
    }
}
