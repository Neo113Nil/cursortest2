package org.apache.a.d;

import java.util.Locale;

/* compiled from: CookieOrigin.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f9697a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9698b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9699c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9700d;

    public e(String str, int i, String str2, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Host of origin may not be null");
        }
        if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Host of origin may not be blank");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Invalid port: " + i);
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Path of origin may not be null.");
        }
        this.f9697a = str.toLowerCase(Locale.ENGLISH);
        this.f9698b = i;
        if (str2.trim().length() != 0) {
            this.f9699c = str2;
        } else {
            this.f9699c = "/";
        }
        this.f9700d = z;
    }

    public String a() {
        return this.f9697a;
    }

    public String b() {
        return this.f9699c;
    }

    public int c() {
        return this.f9698b;
    }

    public boolean d() {
        return this.f9700d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.f9700d) {
            sb.append("(secure)");
        }
        sb.append(this.f9697a);
        sb.append(':');
        sb.append(Integer.toString(this.f9698b));
        sb.append(this.f9699c);
        sb.append(']');
        return sb.toString();
    }
}
