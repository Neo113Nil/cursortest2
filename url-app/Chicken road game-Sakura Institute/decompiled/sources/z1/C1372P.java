package z1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372P {
    public static final C1371O Companion = new C1371O();

    /* renamed from: a, reason: collision with root package name */
    public final String f11837a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11838b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11839c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11840d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1388n f11841e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11842f;

    public C1372P(String id, String name, String date, String village, EnumC1388n level, String note) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(village, "village");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f11837a = id;
        this.f11838b = name;
        this.f11839c = date;
        this.f11840d = village;
        this.f11841e = level;
        this.f11842f = note;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1372P)) {
            return false;
        }
        C1372P c1372p = (C1372P) obj;
        return Intrinsics.a(this.f11837a, c1372p.f11837a) && Intrinsics.a(this.f11838b, c1372p.f11838b) && Intrinsics.a(this.f11839c, c1372p.f11839c) && Intrinsics.a(this.f11840d, c1372p.f11840d) && this.f11841e == c1372p.f11841e && Intrinsics.a(this.f11842f, c1372p.f11842f);
    }

    public final int hashCode() {
        return this.f11842f.hashCode() + ((this.f11841e.hashCode() + r0.B.a(this.f11840d, r0.B.a(this.f11839c, r0.B.a(this.f11838b, this.f11837a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "Tournament(id=" + this.f11837a + ", name=" + this.f11838b + ", date=" + this.f11839c + ", village=" + this.f11840d + ", level=" + this.f11841e + ", note=" + this.f11842f + ")";
    }
}
