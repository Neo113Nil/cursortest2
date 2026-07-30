package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c9 implements r5 {

    /* renamed from: b, reason: collision with root package name */
    public Charset f1898b;

    /* renamed from: f, reason: collision with root package name */
    public int f1902f = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f1897a = g5.f2326b;

    /* renamed from: c, reason: collision with root package name */
    public StringBuilder f1899c = new StringBuilder();

    /* renamed from: e, reason: collision with root package name */
    public Map<String, byte[]> f1901e = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public Map<String, String> f1900d = new HashMap();

    public final InputStream a(String str, String str2, String str3, String str4, boolean z7) {
        StringBuilder sb = new StringBuilder();
        String format = String.format(HttpClient.FILE_TEMPLATE, m5.a(str2, this.f1898b), m5.a(str3, this.f1898b));
        sb.append(str);
        sb.append(HttpClient.ENDFLAG);
        sb.append(this.f1897a);
        sb.append("\r\n");
        sb.append(format);
        sb.append("\r\n");
        sb.append("Content-Type:");
        sb.append(str4);
        sb.append(";");
        if (z7) {
            sb.append("charset=");
            sb.append(this.f1898b.name());
        }
        sb.append("\r\n");
        sb.append("\r\n");
        return new ByteArrayInputStream(sb.toString().getBytes(this.f1898b));
    }

    @Override // com.baidu.ar.r5
    public String b() {
        return "multipart/form-data;boundary=" + d();
    }

    @Override // com.baidu.ar.r5
    public int c() {
        return this.f1902f;
    }

    public String d() {
        return this.f1897a;
    }

    public boolean e() {
        return this.f1899c.length() == 0 && this.f1901e.isEmpty() && this.f1900d.isEmpty();
    }

    @Override // com.baidu.ar.r5
    public void setCharset(Charset charset) {
        this.f1898b = charset;
    }

    public void a(String str) {
        this.f1897a = str;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        StringBuilder sb = this.f1899c;
        sb.append(HttpClient.ENDFLAG);
        sb.append(this.f1897a);
        sb.append("\r\n");
        StringBuilder sb2 = this.f1899c;
        sb2.append("Content-Disposition: form-data; name=\"");
        sb2.append(m5.a(str, this.f1898b));
        sb2.append("\"\r\n");
        this.f1899c.append("\r\n");
        this.f1899c.append(m5.a(str2, this.f1898b));
        this.f1899c.append("\r\n");
    }

    public void a(String str, String str2) {
        File file = new File(str2);
        if (file.exists()) {
            this.f1902f = (int) (this.f1902f + file.length());
        }
        this.f1900d.put(str, str2);
    }

    public void a(String str, byte[] bArr) {
        if (bArr != null) {
            this.f1902f += bArr.length;
        }
        this.f1901e.put(str, bArr);
    }

    @Override // com.baidu.ar.r5
    public InputStream[] a() {
        ArrayList arrayList = new ArrayList();
        if (this.f1899c.length() > 0) {
            arrayList.add(new ByteArrayInputStream(this.f1899c.toString().getBytes(this.f1898b)));
        }
        String str = "";
        if (!this.f1900d.isEmpty()) {
            String str2 = "";
            for (Map.Entry<String, String> entry : this.f1900d.entrySet()) {
                arrayList.add(a(str2, entry.getKey(), new File(entry.getValue()).getName(), m5.b(entry.getValue()), false));
                arrayList.add(new FileInputStream(entry.getValue()));
                str2 = "\r\n";
            }
            str = str2;
        }
        if (!this.f1901e.isEmpty()) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            int i8 = 1;
            String str3 = str;
            for (Map.Entry<String, byte[]> entry2 : this.f1901e.entrySet()) {
                arrayList.add(a(str3, entry2.getKey(), valueOf + i8 + ".jpg", "application/octet-stream", true));
                arrayList.add(new ByteArrayInputStream(entry2.getValue()));
                str3 = "\r\n";
                i8++;
            }
            str = str3;
        }
        if (!this.f1900d.isEmpty() || !this.f1901e.isEmpty()) {
            arrayList.add(new ByteArrayInputStream((str + HttpClient.ENDFLAG + this.f1897a + HttpClient.ENDFLAG + "\r\n").getBytes(this.f1898b)));
        }
        return (InputStream[]) arrayList.toArray(new InputStream[arrayList.size()]);
    }
}
