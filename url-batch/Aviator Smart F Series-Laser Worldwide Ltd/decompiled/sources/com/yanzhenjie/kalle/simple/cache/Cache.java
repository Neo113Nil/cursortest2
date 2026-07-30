package com.yanzhenjie.kalle.simple.cache;

import com.yanzhenjie.kalle.i;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class Cache implements Serializable {
    private byte[] mBody;
    private int mCode;
    private long mExpires;
    private i mHeaders;
    private String mKey;

    public byte[] getBody() {
        return this.mBody;
    }

    public int getCode() {
        return this.mCode;
    }

    public long getExpires() {
        return this.mExpires;
    }

    public i getHeaders() {
        return this.mHeaders;
    }

    public String getKey() {
        return this.mKey;
    }

    public void setBody(byte[] bArr) {
        this.mBody = bArr;
    }

    public void setCode(int i8) {
        this.mCode = i8;
    }

    public void setExpires(long j8) {
        this.mExpires = j8;
    }

    public void setHeaders(i iVar) {
        this.mHeaders = iVar;
    }

    public void setKey(String str) {
        this.mKey = str;
    }
}
