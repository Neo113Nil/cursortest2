package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uy2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f13039a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13040b;

    private uy2(String str, String str2) {
        this.f13039a = str;
        this.f13040b = str2;
    }

    public static uy2 a(String str, String str2) {
        uz2.a(str, "Name is null or empty");
        uz2.a(str2, "Version is null or empty");
        return new uy2(str, str2);
    }

    public final String b() {
        return this.f13039a;
    }

    public final String c() {
        return this.f13040b;
    }
}
