package com.baidu.ar;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class pa implements r5 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2953a;

    public void a(byte[] bArr) {
        this.f2953a = bArr;
    }

    @Override // com.baidu.ar.r5
    public String b() {
        return null;
    }

    @Override // com.baidu.ar.r5
    public int c() {
        byte[] bArr = this.f2953a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Override // com.baidu.ar.r5
    public void setCharset(Charset charset) {
    }

    @Override // com.baidu.ar.r5
    public InputStream[] a() {
        byte[] bArr = this.f2953a;
        return (bArr == null || bArr.length <= 0) ? new InputStream[0] : new InputStream[]{new ByteArrayInputStream(this.f2953a)};
    }
}
