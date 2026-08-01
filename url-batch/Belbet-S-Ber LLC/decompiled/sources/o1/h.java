package o1;

import java.time.LocalDate;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f2898a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2899b;

    /* renamed from: c, reason: collision with root package name */
    public final LocalDate f2900c;
    public final String d;

    public h(String str, String str2, LocalDate localDate, String str3) {
        i3.d.e(str, "id");
        i3.d.e(localDate, "birthDate");
        this.f2898a = str;
        this.f2899b = str2;
        this.f2900c = localDate;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i3.d.a(this.f2898a, hVar.f2898a) && i3.d.a(this.f2899b, hVar.f2899b) && i3.d.a(this.f2900c, hVar.f2900c) && i3.d.a(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f2900c.hashCode() + ((this.f2899b.hashCode() + (this.f2898a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BirthdayEntry(id=" + this.f2898a + ", name=" + this.f2899b + ", birthDate=" + this.f2900c + ", note=" + this.d + ")";
    }
}
