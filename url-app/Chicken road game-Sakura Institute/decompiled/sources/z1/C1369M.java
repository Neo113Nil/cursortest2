package z1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369M {
    public static final C1368L Companion = new C1368L();

    /* renamed from: a, reason: collision with root package name */
    public final String f11830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11831b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11832c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11833d;

    public C1369M(String id, String name, String village, long j4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(village, "village");
        this.f11830a = id;
        this.f11831b = name;
        this.f11832c = village;
        this.f11833d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1369M)) {
            return false;
        }
        C1369M c1369m = (C1369M) obj;
        return Intrinsics.a(this.f11830a, c1369m.f11830a) && Intrinsics.a(this.f11831b, c1369m.f11831b) && Intrinsics.a(this.f11832c, c1369m.f11832c) && this.f11833d == c1369m.f11833d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11833d) + r0.B.a(this.f11832c, r0.B.a(this.f11831b, this.f11830a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Team(id=" + this.f11830a + ", name=" + this.f11831b + ", village=" + this.f11832c + ", color=" + this.f11833d + ")";
    }
}
