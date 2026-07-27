package z1;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379e {
    public static final C1378d Companion = new C1378d();

    /* renamed from: a, reason: collision with root package name */
    public final String f11858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11860c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11861d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11862e;

    public C1379e(String id, String athleteId, String discipline, String value, String date) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(athleteId, "athleteId");
        Intrinsics.checkNotNullParameter(discipline, "discipline");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f11858a = id;
        this.f11859b = athleteId;
        this.f11860c = discipline;
        this.f11861d = value;
        this.f11862e = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1379e)) {
            return false;
        }
        C1379e c1379e = (C1379e) obj;
        return Intrinsics.a(this.f11858a, c1379e.f11858a) && Intrinsics.a(this.f11859b, c1379e.f11859b) && Intrinsics.a(this.f11860c, c1379e.f11860c) && Intrinsics.a(this.f11861d, c1379e.f11861d) && Intrinsics.a(this.f11862e, c1379e.f11862e);
    }

    public final int hashCode() {
        return this.f11862e.hashCode() + r0.B.a(this.f11861d, r0.B.a(this.f11860c, r0.B.a(this.f11859b, this.f11858a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AthletePB(id=");
        sb.append(this.f11858a);
        sb.append(", athleteId=");
        sb.append(this.f11859b);
        sb.append(", discipline=");
        sb.append(this.f11860c);
        sb.append(", value=");
        sb.append(this.f11861d);
        sb.append(", date=");
        return AbstractC0017m.n(sb, this.f11862e, ")");
    }
}
