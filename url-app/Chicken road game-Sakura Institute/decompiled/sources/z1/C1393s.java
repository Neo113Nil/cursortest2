package z1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* renamed from: z1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1393s {
    public static final C1392r Companion = new C1392r();

    /* renamed from: a, reason: collision with root package name */
    public final String f11907a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11908b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11909c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f11910d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f11911e;

    public C1393s(int i2, String id, String eventId) {
        LinkedHashMap lanes = new LinkedHashMap();
        LinkedHashMap times = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(lanes, "lanes");
        Intrinsics.checkNotNullParameter(times, "times");
        this.f11907a = id;
        this.f11908b = eventId;
        this.f11909c = i2;
        this.f11910d = lanes;
        this.f11911e = times;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1393s)) {
            return false;
        }
        C1393s c1393s = (C1393s) obj;
        return Intrinsics.a(this.f11907a, c1393s.f11907a) && Intrinsics.a(this.f11908b, c1393s.f11908b) && this.f11909c == c1393s.f11909c && Intrinsics.a(this.f11910d, c1393s.f11910d) && Intrinsics.a(this.f11911e, c1393s.f11911e);
    }

    public final int hashCode() {
        return this.f11911e.hashCode() + ((this.f11910d.hashCode() + AbstractC0784j.c(this.f11909c, r0.B.a(this.f11908b, this.f11907a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "Heat(id=" + this.f11907a + ", eventId=" + this.f11908b + ", heatNo=" + this.f11909c + ", lanes=" + this.f11910d + ", times=" + this.f11911e + ")";
    }
}
