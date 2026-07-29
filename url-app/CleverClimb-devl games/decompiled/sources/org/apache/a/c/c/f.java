package org.apache.a.c.c;

import java.util.Locale;

/* compiled from: Scheme.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f9681a;

    /* renamed from: b, reason: collision with root package name */
    private final h f9682b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9683c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9684d;
    private String e;

    public f(String str, int i, h hVar) {
        if (str == null) {
            throw new IllegalArgumentException("Scheme name may not be null");
        }
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("Port is invalid: " + i);
        }
        if (hVar == null) {
            throw new IllegalArgumentException("Socket factory may not be null");
        }
        this.f9681a = str.toLowerCase(Locale.ENGLISH);
        this.f9682b = hVar;
        this.f9683c = i;
        this.f9684d = hVar instanceof b;
    }

    @Deprecated
    public f(String str, j jVar, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Scheme name may not be null");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("Socket factory may not be null");
        }
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("Port is invalid: " + i);
        }
        this.f9681a = str.toLowerCase(Locale.ENGLISH);
        if (jVar instanceof d) {
            this.f9682b = new c((d) jVar);
            this.f9684d = true;
        } else {
            this.f9682b = new i(jVar);
            this.f9684d = false;
        }
        this.f9683c = i;
    }

    public final int a() {
        return this.f9683c;
    }

    public final h b() {
        return this.f9682b;
    }

    public final String c() {
        return this.f9681a;
    }

    public final boolean d() {
        return this.f9684d;
    }

    public final int a(int i) {
        return i <= 0 ? this.f9683c : i;
    }

    public final String toString() {
        if (this.e == null) {
            this.e = this.f9681a + ':' + Integer.toString(this.f9683c);
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9681a.equals(fVar.f9681a) && this.f9683c == fVar.f9683c && this.f9684d == fVar.f9684d;
    }

    public int hashCode() {
        return org.apache.a.k.f.a(org.apache.a.k.f.a(org.apache.a.k.f.a(17, this.f9683c), this.f9681a), this.f9684d);
    }
}
