package z1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1391q {
    public static final C1390p Companion = new C1390p();

    /* renamed from: a, reason: collision with root package name */
    public final String f11903a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11904b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11905c;

    /* renamed from: d, reason: collision with root package name */
    public String f11906d;

    public C1391q(String id, String eventId, String wind, int i2) {
        ArrayList rows = new ArrayList();
        wind = (i2 & 8) != 0 ? "" : wind;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(wind, "wind");
        this.f11903a = id;
        this.f11904b = eventId;
        this.f11905c = rows;
        this.f11906d = wind;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1391q)) {
            return false;
        }
        C1391q c1391q = (C1391q) obj;
        return Intrinsics.a(this.f11903a, c1391q.f11903a) && Intrinsics.a(this.f11904b, c1391q.f11904b) && Intrinsics.a(this.f11905c, c1391q.f11905c) && Intrinsics.a(this.f11906d, c1391q.f11906d);
    }

    public final int hashCode() {
        return this.f11906d.hashCode() + ((this.f11905c.hashCode() + r0.B.a(this.f11904b, this.f11903a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "FieldBoard(id=" + this.f11903a + ", eventId=" + this.f11904b + ", rows=" + this.f11905c + ", wind=" + this.f11906d + ")";
    }
}
