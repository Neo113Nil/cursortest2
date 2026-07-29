package com.facebook.ads.internal.p.a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private int f5305a;

    /* renamed from: b, reason: collision with root package name */
    private String f5306b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<String>> f5307c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f5308d;

    public n(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.f5305a = httpURLConnection.getResponseCode();
            this.f5306b = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f5307c = httpURLConnection.getHeaderFields();
        this.f5308d = bArr;
    }

    public int a() {
        return this.f5305a;
    }

    public String b() {
        return this.f5306b;
    }

    public Map<String, List<String>> c() {
        return this.f5307c;
    }

    public byte[] d() {
        return this.f5308d;
    }

    public String e() {
        if (this.f5308d != null) {
            return new String(this.f5308d);
        }
        return null;
    }
}
