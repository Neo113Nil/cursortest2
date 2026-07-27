package z1;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381g {
    public static final C1380f Companion = new C1380f();

    /* renamed from: a, reason: collision with root package name */
    public final String f11863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11864b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1387m f11865c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f11866d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1375a f11867e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11868f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11869g;

    public C1381g(String id, String tournamentId, EnumC1387m kind, Integer num, EnumC1375a ageGroup, boolean z4, String startTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tournamentId, "tournamentId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(ageGroup, "ageGroup");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.f11863a = id;
        this.f11864b = tournamentId;
        this.f11865c = kind;
        this.f11866d = num;
        this.f11867e = ageGroup;
        this.f11868f = z4;
        this.f11869g = startTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1381g)) {
            return false;
        }
        C1381g c1381g = (C1381g) obj;
        return Intrinsics.a(this.f11863a, c1381g.f11863a) && Intrinsics.a(this.f11864b, c1381g.f11864b) && this.f11865c == c1381g.f11865c && Intrinsics.a(this.f11866d, c1381g.f11866d) && this.f11867e == c1381g.f11867e && this.f11868f == c1381g.f11868f && Intrinsics.a(this.f11869g, c1381g.f11869g);
    }

    public final int hashCode() {
        int hashCode = (this.f11865c.hashCode() + r0.B.a(this.f11864b, this.f11863a.hashCode() * 31, 31)) * 31;
        Integer num = this.f11866d;
        return this.f11869g.hashCode() + AbstractC0017m.d((this.f11867e.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.f11868f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompEvent(id=");
        sb.append(this.f11863a);
        sb.append(", tournamentId=");
        sb.append(this.f11864b);
        sb.append(", kind=");
        sb.append(this.f11865c);
        sb.append(", distanceM=");
        sb.append(this.f11866d);
        sb.append(", ageGroup=");
        sb.append(this.f11867e);
        sb.append(", female=");
        sb.append(this.f11868f);
        sb.append(", startTime=");
        return AbstractC0017m.n(sb, this.f11869g, ")");
    }
}
