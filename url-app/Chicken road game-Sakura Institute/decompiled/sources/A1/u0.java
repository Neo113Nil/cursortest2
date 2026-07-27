package A1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f729a;

    /* renamed from: b, reason: collision with root package name */
    public final String f730b;

    /* renamed from: c, reason: collision with root package name */
    public final String f731c;

    /* renamed from: d, reason: collision with root package name */
    public final double f732d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f733e;

    public u0(String name, String team, String markText, double d4, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(markText, "markText");
        this.f729a = name;
        this.f730b = team;
        this.f731c = markText;
        this.f732d = d4;
        this.f733e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.a(this.f729a, u0Var.f729a) && Intrinsics.a(this.f730b, u0Var.f730b) && this.f731c.equals(u0Var.f731c) && Double.compare(this.f732d, u0Var.f732d) == 0 && this.f733e == u0Var.f733e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f733e) + ((Double.hashCode(this.f732d) + r0.B.a(this.f731c, r0.B.a(this.f730b, this.f729a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "PodiumRow(name=" + this.f729a + ", team=" + this.f730b + ", markText=" + this.f731c + ", sortKey=" + this.f732d + ", higherBetter=" + this.f733e + ")";
    }
}
