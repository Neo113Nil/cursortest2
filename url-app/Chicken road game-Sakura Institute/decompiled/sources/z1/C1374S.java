package z1;

import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* renamed from: z1.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374S {
    public static final C1373Q Companion = new C1373Q();

    /* renamed from: a, reason: collision with root package name */
    public final String f11843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11844b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11845c;

    /* renamed from: d, reason: collision with root package name */
    public final double f11846d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11847e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11848f;

    public C1374S(String id, String str, String date, double d4, int i2, String notes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(notes, "notes");
        this.f11843a = id;
        this.f11844b = str;
        this.f11845c = date;
        this.f11846d = d4;
        this.f11847e = i2;
        this.f11848f = notes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1374S)) {
            return false;
        }
        C1374S c1374s = (C1374S) obj;
        return Intrinsics.a(this.f11843a, c1374s.f11843a) && Intrinsics.a(this.f11844b, c1374s.f11844b) && Intrinsics.a(this.f11845c, c1374s.f11845c) && Double.compare(this.f11846d, c1374s.f11846d) == 0 && this.f11847e == c1374s.f11847e && Intrinsics.a(this.f11848f, c1374s.f11848f);
    }

    public final int hashCode() {
        int hashCode = this.f11843a.hashCode() * 31;
        String str = this.f11844b;
        return this.f11848f.hashCode() + AbstractC0784j.c(this.f11847e, (Double.hashCode(this.f11846d) + r0.B.a(this.f11845c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "TrainingEntry(id=" + this.f11843a + ", athleteId=" + this.f11844b + ", date=" + this.f11845c + ", distanceKm=" + this.f11846d + ", durationSec=" + this.f11847e + ", notes=" + this.f11848f + ")";
    }
}
