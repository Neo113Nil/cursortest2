package a5;

import W4.d;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3154a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public int f3155b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3156c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3157d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3158e;

    /* renamed from: f, reason: collision with root package name */
    public final C0232b f3159f;

    public C0233c(String str, String str2, d dVar, C0232b c0232b) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f3156c = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f3157d = str2;
        this.f3158e = dVar;
        this.f3159f = c0232b;
    }

    public static C0233c a(d dVar, Z4.b bVar, C0232b c0232b) {
        C0233c c0233c = new C0233c(c0232b.f3148b, c0232b.f3149c, dVar, c0232b);
        c0233c.f3154a.set(bVar);
        return c0233c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0233c) {
            C0233c c0233c = (C0233c) obj;
            if (this.f3156c.equalsIgnoreCase(c0233c.f3156c) && this.f3157d.equals(c0233c.f3157d) && this.f3158e.equals(c0233c.f3158e) && this.f3159f.equals(c0233c.f3159f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f3155b;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = ((((((this.f3156c.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f3157d.hashCode()) * 1000003) ^ this.f3158e.hashCode()) * 1000003) ^ this.f3159f.hashCode();
        this.f3155b = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "MetricDescriptor{name=" + this.f3156c + ", description=" + this.f3157d + ", view=" + this.f3158e + ", sourceInstrument=" + this.f3159f + "}";
    }
}
