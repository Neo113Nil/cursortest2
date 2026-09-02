package a5;

import N.p;
import W4.n;
import java.util.Locale;

/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232b {

    /* renamed from: a, reason: collision with root package name */
    public int f3147a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3148b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3149c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3150d;

    /* renamed from: e, reason: collision with root package name */
    public final n f3151e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3152f;

    /* renamed from: g, reason: collision with root package name */
    public final C0231a f3153g;

    public C0232b(String str, String str2, String str3, n nVar, int i7, C0231a c0231a) {
        if (Z4.a.f3106a) {
            Thread.currentThread().getStackTrace();
        }
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f3148b = str;
        if (str2 == null) {
            throw new NullPointerException("Null description");
        }
        this.f3149c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null unit");
        }
        this.f3150d = str3;
        this.f3151e = nVar;
        if (i7 == 0) {
            throw new NullPointerException("Null valueType");
        }
        this.f3152f = i7;
        this.f3153g = c0231a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0232b)) {
            return false;
        }
        C0232b c0232b = (C0232b) obj;
        return this.f3148b.equalsIgnoreCase(c0232b.f3148b) && this.f3149c.equals(c0232b.f3149c) && this.f3150d.equals(c0232b.f3150d) && this.f3151e.equals(c0232b.f3151e) && p.a(this.f3152f, c0232b.f3152f);
    }

    public final int hashCode() {
        int i7 = this.f3147a;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = ((((((((this.f3148b.toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ this.f3149c.hashCode()) * 1000003) ^ this.f3150d.hashCode()) * 1000003) ^ this.f3151e.hashCode()) * 1000003) ^ p.c(this.f3152f);
        this.f3147a = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentDescriptor{name=");
        sb.append(this.f3148b);
        sb.append(", description=");
        sb.append(this.f3149c);
        sb.append(", unit=");
        sb.append(this.f3150d);
        sb.append(", type=");
        sb.append(this.f3151e);
        sb.append(", valueType=");
        int i7 = this.f3152f;
        sb.append(i7 != 1 ? i7 != 2 ? "null" : "DOUBLE" : "LONG");
        sb.append(", advice=");
        sb.append(this.f3153g);
        sb.append("}");
        return sb.toString();
    }
}
