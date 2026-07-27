package z1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1364H {
    public static final C1363G Companion = new C1363G();

    /* renamed from: a, reason: collision with root package name */
    public final String f11795a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11796b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11797c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11798d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11799e;

    public C1364H(String id, String tournamentId, String name, String event, ArrayList legs) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tournamentId, "tournamentId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(legs, "legs");
        this.f11795a = id;
        this.f11796b = tournamentId;
        this.f11797c = name;
        this.f11798d = event;
        this.f11799e = legs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1364H)) {
            return false;
        }
        C1364H c1364h = (C1364H) obj;
        return Intrinsics.a(this.f11795a, c1364h.f11795a) && Intrinsics.a(this.f11796b, c1364h.f11796b) && Intrinsics.a(this.f11797c, c1364h.f11797c) && Intrinsics.a(this.f11798d, c1364h.f11798d) && this.f11799e.equals(c1364h.f11799e);
    }

    public final int hashCode() {
        return this.f11799e.hashCode() + r0.B.a(this.f11798d, r0.B.a(this.f11797c, r0.B.a(this.f11796b, this.f11795a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RelayTeam(id=" + this.f11795a + ", tournamentId=" + this.f11796b + ", name=" + this.f11797c + ", event=" + this.f11798d + ", legs=" + this.f11799e + ")";
    }
}
