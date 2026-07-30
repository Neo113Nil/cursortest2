package com.baidu.ar;

import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes.dex */
public class j5 {

    /* renamed from: a, reason: collision with root package name */
    public URL f2527a;

    /* renamed from: b, reason: collision with root package name */
    public String f2528b;

    /* renamed from: c, reason: collision with root package name */
    public Charset f2529c;

    /* renamed from: d, reason: collision with root package name */
    public k5 f2530d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, String> f2531e;

    /* renamed from: f, reason: collision with root package name */
    public r5 f2532f;

    /* renamed from: g, reason: collision with root package name */
    public StringBuilder f2533g = new StringBuilder();

    public String a() {
        return this.f2533g.toString();
    }

    public boolean b() {
        return this.f2533g.length() > 0;
    }

    public void a(String str) {
        this.f2533g.append(str + "\r\n");
    }
}
