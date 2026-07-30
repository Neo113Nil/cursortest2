package com.baidu.ar;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class l4 implements r5 {

    /* renamed from: a, reason: collision with root package name */
    public Charset f2691a;

    /* renamed from: b, reason: collision with root package name */
    public StringBuilder f2692b = new StringBuilder();

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        if (this.f2692b.length() > 0) {
            this.f2692b.append("&");
        }
        StringBuilder sb = this.f2692b;
        sb.append(m5.a(str, this.f2691a));
        sb.append("=");
        sb.append(m5.a(str2, this.f2691a));
    }

    @Override // com.baidu.ar.r5
    public String b() {
        return com.yanzhenjie.kalle.i.VALUE_APPLICATION_URLENCODED;
    }

    @Override // com.baidu.ar.r5
    public int c() {
        return 0;
    }

    @Override // com.baidu.ar.r5
    public void setCharset(Charset charset) {
        this.f2691a = charset;
    }

    @Override // com.baidu.ar.r5
    public InputStream[] a() {
        return this.f2692b.length() > 0 ? new InputStream[]{new ByteArrayInputStream(this.f2692b.toString().getBytes(this.f2691a))} : new InputStream[0];
    }
}
