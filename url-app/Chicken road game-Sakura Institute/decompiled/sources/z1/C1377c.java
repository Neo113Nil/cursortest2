package z1;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1377c {
    public static final C1376b Companion = new C1376b();

    /* renamed from: a, reason: collision with root package name */
    public final String f11851a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11852b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11853c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11854d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11855e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11856f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11857g;

    public C1377c(String id, String name, int i2, String team, int i4, boolean z4, String bio) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(bio, "bio");
        this.f11851a = id;
        this.f11852b = name;
        this.f11853c = i2;
        this.f11854d = team;
        this.f11855e = i4;
        this.f11856f = z4;
        this.f11857g = bio;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1377c)) {
            return false;
        }
        C1377c c1377c = (C1377c) obj;
        return Intrinsics.a(this.f11851a, c1377c.f11851a) && Intrinsics.a(this.f11852b, c1377c.f11852b) && this.f11853c == c1377c.f11853c && Intrinsics.a(this.f11854d, c1377c.f11854d) && this.f11855e == c1377c.f11855e && this.f11856f == c1377c.f11856f && Intrinsics.a(this.f11857g, c1377c.f11857g);
    }

    public final int hashCode() {
        return this.f11857g.hashCode() + AbstractC0017m.d(AbstractC0784j.c(this.f11855e, r0.B.a(this.f11854d, AbstractC0784j.c(this.f11853c, r0.B.a(this.f11852b, this.f11851a.hashCode() * 31, 31), 31), 31), 31), 31, this.f11856f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Athlete(id=");
        sb.append(this.f11851a);
        sb.append(", name=");
        sb.append(this.f11852b);
        sb.append(", bib=");
        sb.append(this.f11853c);
        sb.append(", team=");
        sb.append(this.f11854d);
        sb.append(", birthYear=");
        sb.append(this.f11855e);
        sb.append(", female=");
        sb.append(this.f11856f);
        sb.append(", bio=");
        return AbstractC0017m.n(sb, this.f11857g, ")");
    }
}
