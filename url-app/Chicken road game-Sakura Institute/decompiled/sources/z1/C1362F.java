package z1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362F {

    /* renamed from: a, reason: collision with root package name */
    public final int f11793a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11794b;

    public C1362F(int i2, String str) {
        this.f11793a = i2;
        this.f11794b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362F)) {
            return false;
        }
        C1362F c1362f = (C1362F) obj;
        return this.f11793a == c1362f.f11793a && Intrinsics.a(this.f11794b, c1362f.f11794b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f11793a) * 31;
        String str = this.f11794b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "RelayLeg(order=" + this.f11793a + ", athleteId=" + this.f11794b + ")";
    }
}
