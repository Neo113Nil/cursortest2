package J1;

import A.k;
import f2.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3161c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3162d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3163e;

    public a(long j3, String str, String str2, String str3, long j4) {
        j.f(str, "name");
        j.f(str2, "phone");
        j.f(str3, "note");
        this.f3159a = j3;
        this.f3160b = str;
        this.f3161c = str2;
        this.f3162d = str3;
        this.f3163e = j4;
    }

    public static a a(a aVar, String str, String str2, String str3, long j3, int i3) {
        if ((i3 & 2) != 0) {
            str = aVar.f3160b;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = aVar.f3161c;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = aVar.f3162d;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            j3 = aVar.f3163e;
        }
        j.f(str4, "name");
        j.f(str5, "phone");
        j.f(str6, "note");
        return new a(aVar.f3159a, str4, str5, str6, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3159a == aVar.f3159a && j.a(this.f3160b, aVar.f3160b) && j.a(this.f3161c, aVar.f3161c) && j.a(this.f3162d, aVar.f3162d) && this.f3163e == aVar.f3163e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3163e) + k.d(k.d(k.d(Long.hashCode(this.f3159a) * 31, 31, this.f3160b), 31, this.f3161c), 31, this.f3162d);
    }

    public final String toString() {
        return "Client(id=" + this.f3159a + ", name=" + this.f3160b + ", phone=" + this.f3161c + ", note=" + this.f3162d + ", createdAt=" + this.f3163e + ")";
    }
}
