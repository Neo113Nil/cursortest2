package org.apache.a.a;

import java.util.Locale;

/* compiled from: AuthScope.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9637a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String f9638b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final String f9639c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final d f9640d = new d(f9637a, -1, f9638b, f9639c);
    private final String e;
    private final String f;
    private final String g;
    private final int h;

    public d(String str, int i, String str2, String str3) {
        this.g = str == null ? f9637a : str.toLowerCase(Locale.ENGLISH);
        this.h = i < 0 ? -1 : i;
        this.f = str2 == null ? f9638b : str2;
        this.e = str3 == null ? f9639c : str3.toUpperCase(Locale.ENGLISH);
    }

    public int a(d dVar) {
        int i;
        if (org.apache.a.k.f.a(this.e, dVar.e)) {
            i = 1;
        } else {
            if (this.e != f9639c && dVar.e != f9639c) {
                return -1;
            }
            i = 0;
        }
        if (org.apache.a.k.f.a(this.f, dVar.f)) {
            i += 2;
        } else if (this.f != f9638b && dVar.f != f9638b) {
            return -1;
        }
        if (this.h == dVar.h) {
            i += 4;
        } else if (this.h != -1 && dVar.h != -1) {
            return -1;
        }
        if (org.apache.a.k.f.a(this.g, dVar.g)) {
            return i + 8;
        }
        if (this.g == f9637a || dVar.g == f9637a) {
            return i;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return super.equals(obj);
        }
        d dVar = (d) obj;
        return org.apache.a.k.f.a(this.g, dVar.g) && this.h == dVar.h && org.apache.a.k.f.a(this.f, dVar.f) && org.apache.a.k.f.a(this.e, dVar.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.e != null) {
            sb.append(this.e.toUpperCase(Locale.ENGLISH));
            sb.append(' ');
        }
        if (this.f != null) {
            sb.append('\'');
            sb.append(this.f);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        if (this.g != null) {
            sb.append('@');
            sb.append(this.g);
            if (this.h >= 0) {
                sb.append(':');
                sb.append(this.h);
            }
        }
        return sb.toString();
    }

    public int hashCode() {
        return org.apache.a.k.f.a(org.apache.a.k.f.a(org.apache.a.k.f.a(org.apache.a.k.f.a(17, this.g), this.h), this.f), this.e);
    }
}
