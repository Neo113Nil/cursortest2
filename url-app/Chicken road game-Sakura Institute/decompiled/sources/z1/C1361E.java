package z1;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361E {
    public static final C1360D Companion = new C1360D();

    /* renamed from: a, reason: collision with root package name */
    public final String f11786a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11787b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11788c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11789d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11790e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11791f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11792g;

    public C1361E(String id, String label, String holder, String team, String value, String date, String scope) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f11786a = id;
        this.f11787b = label;
        this.f11788c = holder;
        this.f11789d = team;
        this.f11790e = value;
        this.f11791f = date;
        this.f11792g = scope;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361E)) {
            return false;
        }
        C1361E c1361e = (C1361E) obj;
        return Intrinsics.a(this.f11786a, c1361e.f11786a) && Intrinsics.a(this.f11787b, c1361e.f11787b) && Intrinsics.a(this.f11788c, c1361e.f11788c) && Intrinsics.a(this.f11789d, c1361e.f11789d) && Intrinsics.a(this.f11790e, c1361e.f11790e) && Intrinsics.a(this.f11791f, c1361e.f11791f) && Intrinsics.a(this.f11792g, c1361e.f11792g);
    }

    public final int hashCode() {
        return this.f11792g.hashCode() + r0.B.a(this.f11791f, r0.B.a(this.f11790e, r0.B.a(this.f11789d, r0.B.a(this.f11788c, r0.B.a(this.f11787b, this.f11786a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Record(id=");
        sb.append(this.f11786a);
        sb.append(", label=");
        sb.append(this.f11787b);
        sb.append(", holder=");
        sb.append(this.f11788c);
        sb.append(", team=");
        sb.append(this.f11789d);
        sb.append(", value=");
        sb.append(this.f11790e);
        sb.append(", date=");
        sb.append(this.f11791f);
        sb.append(", scope=");
        return AbstractC0017m.n(sb, this.f11792g, ")");
    }
}
