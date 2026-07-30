package com.baidu.ar;

import android.text.TextUtils;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public class hd {

    /* renamed from: a, reason: collision with root package name */
    public String f2404a;

    /* renamed from: b, reason: collision with root package name */
    public StringBuilder f2405b;

    /* renamed from: c, reason: collision with root package name */
    public Charset f2406c = StandardCharsets.UTF_8;

    public URL a() {
        String str = this.f2404a;
        if (str == null) {
            str = "";
        }
        StringBuilder sb = this.f2405b;
        if (sb != null && sb.length() > 0) {
            str = str + (str.contains("?") ? "&" : "?") + this.f2405b.toString();
        }
        return new URL(str);
    }

    public void a(String str) {
        this.f2404a = str;
    }

    public void a(String str, String str2) {
        if (str2 == null || TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = this.f2405b;
        if (sb == null) {
            this.f2405b = new StringBuilder();
        } else if (sb.length() > 0) {
            this.f2405b.append("&");
        }
        this.f2405b.append(m5.a(str, this.f2406c));
        this.f2405b.append("=");
        this.f2405b.append(m5.a(str2, this.f2406c));
    }

    public void a(Charset charset) {
        this.f2406c = charset;
    }
}
