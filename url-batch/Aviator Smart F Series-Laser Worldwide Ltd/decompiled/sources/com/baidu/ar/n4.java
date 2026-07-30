package com.baidu.ar;

import java.util.HashMap;

/* loaded from: classes.dex */
public class n4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2846a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f2847b;

    /* renamed from: c, reason: collision with root package name */
    public String f2848c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap<String, Double> f2849d;

    public n4() {
    }

    public n4(byte[] bArr, HashMap<String, Double> hashMap, boolean z7) {
        this.f2847b = bArr;
        this.f2849d = hashMap;
        this.f2846a = z7;
    }

    public void a(String str) {
        this.f2848c = str;
    }

    public HashMap<String, Double> b() {
        return this.f2849d;
    }

    public String c() {
        return this.f2848c;
    }

    public boolean d() {
        return this.f2846a;
    }

    public byte[] a() {
        return this.f2847b;
    }
}
