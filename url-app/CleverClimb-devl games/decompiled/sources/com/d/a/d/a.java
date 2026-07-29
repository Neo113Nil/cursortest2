package com.d.a.d;

/* compiled from: Header.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4449a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4450b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("header cannot be null");
        }
        if (str.contains(":")) {
            throw new IllegalArgumentException("header may not contain ':'");
        }
        str2 = str2 == null ? "" : str2;
        this.f4449a = str;
        this.f4450b = str2;
    }

    public String a() {
        return this.f4449a;
    }

    public String b() {
        return this.f4450b;
    }

    public String toString() {
        return this.f4449a + ":" + this.f4450b;
    }
}
