package com.baidu.ar;

import com.baidu.ar.ihttp.IHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class l5 implements IHttpResponse {

    /* renamed from: a, reason: collision with root package name */
    public HttpURLConnection f2693a;

    /* renamed from: b, reason: collision with root package name */
    public Charset f2694b;

    /* renamed from: c, reason: collision with root package name */
    public int f2695c;

    /* renamed from: d, reason: collision with root package name */
    public String f2696d;

    /* renamed from: e, reason: collision with root package name */
    public String f2697e;

    public l5(HttpURLConnection httpURLConnection, Charset charset) {
        this.f2693a = httpURLConnection;
        this.f2694b = charset;
        this.f2695c = httpURLConnection.getResponseCode();
        this.f2696d = httpURLConnection.getResponseMessage();
    }

    @Override // com.baidu.ar.ihttp.IHttpResponse
    public int getCode() {
        return this.f2695c;
    }

    @Override // com.baidu.ar.ihttp.IHttpResponse
    public String getContent() {
        String str = this.f2697e;
        if (str != null) {
            return str;
        }
        InputStream stream = getStream();
        if (stream == null) {
            throw new IOException("Http请求响应输入流已不可访问，请不要在关闭输入流后再调用该方法");
        }
        String name = this.f2694b.name();
        InputStreamReader inputStreamReader = new InputStreamReader(stream, name);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read <= 0) {
                break;
            }
            stringWriter.write(cArr, 0, read);
        }
        String stringWriter2 = stringWriter.toString();
        inputStreamReader.close();
        stringWriter.close();
        if ("utf-8".equalsIgnoreCase(name)) {
            stringWriter2 = m5.a(stringWriter2);
        }
        this.f2697e = stringWriter2;
        return stringWriter2;
    }

    @Override // com.baidu.ar.ihttp.IHttpResponse
    public int getContentLength() {
        return this.f2693a.getContentLength();
    }

    @Override // com.baidu.ar.ihttp.IHttpResponse
    public String getHeader(String str) {
        return this.f2693a.getHeaderField(str);
    }

    @Override // com.baidu.ar.ihttp.IHttpResponse
    public String getMessage() {
        return this.f2696d;
    }

    @Override // com.baidu.ar.ihttp.IHttpResponse
    public InputStream getStream() {
        return this.f2693a.getInputStream();
    }

    @Override // com.baidu.ar.ihttp.IHttpResponse
    public boolean isSuccess() {
        int code = getCode();
        return code >= 200 && code < 300;
    }
}
