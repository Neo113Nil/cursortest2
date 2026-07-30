package com.yanzhenjie.kalle.connect;

import android.text.TextUtils;
import com.yanzhenjie.kalle.i;
import com.yanzhenjie.kalle.r;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class e implements r {
    private String mContentType;
    private InputStream mStream;

    public e(String str, InputStream inputStream) {
        this.mContentType = str;
        this.mStream = inputStream;
    }

    @Override // com.yanzhenjie.kalle.r
    public byte[] byteArray() {
        return com.yanzhenjie.kalle.util.a.toByteArray(this.mStream);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mStream.close();
    }

    @Override // com.yanzhenjie.kalle.r
    public InputStream stream() {
        return this.mStream;
    }

    @Override // com.yanzhenjie.kalle.r
    public String string() {
        String parseSubValue = i.parseSubValue(this.mContentType, "charset", null);
        return TextUtils.isEmpty(parseSubValue) ? com.yanzhenjie.kalle.util.a.toString(this.mStream) : com.yanzhenjie.kalle.util.a.toString(this.mStream, parseSubValue);
    }
}
