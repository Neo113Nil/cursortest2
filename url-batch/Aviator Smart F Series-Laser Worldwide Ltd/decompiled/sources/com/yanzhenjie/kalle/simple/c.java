package com.yanzhenjie.kalle.simple;

import android.text.TextUtils;
import com.yanzhenjie.kalle.r;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class c implements r {
    private String mContentType;
    private byte[] mData;

    public c(String str, byte[] bArr) {
        this.mContentType = str;
        this.mData = bArr;
    }

    @Override // com.yanzhenjie.kalle.r
    public byte[] byteArray() {
        return this.mData;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mData = null;
    }

    @Override // com.yanzhenjie.kalle.r
    public InputStream stream() {
        return new ByteArrayInputStream(this.mData);
    }

    @Override // com.yanzhenjie.kalle.r
    public String string() {
        String parseSubValue = com.yanzhenjie.kalle.i.parseSubValue(this.mContentType, "charset", null);
        return TextUtils.isEmpty(parseSubValue) ? com.yanzhenjie.kalle.util.a.toString(this.mData) : com.yanzhenjie.kalle.util.a.toString(this.mData, parseSubValue);
    }
}
