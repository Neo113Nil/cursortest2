package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqm {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public dqm(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqm)) {
            return false;
        }
        dqm dqmVar = (dqm) obj;
        return this.a == dqmVar.a && this.b == dqmVar.b && this.c == dqmVar.c && this.d == dqmVar.d && this.e == dqmVar.e && this.f == dqmVar.f && this.g == dqmVar.g && this.h == dqmVar.h;
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        return "RingUtilsDimensions(ogApdMinAvatarSizeForLargeRing=" + this.a + ", ogApdMinAvatarSizeForLegacyLargeRing=" + this.b + ", ogApdLargeRingWidth=" + this.c + ", ogApdLegacyLargeRingWidth=" + this.d + ", ogApdSmallRingWidth=" + this.e + ", ogApdLegacyLargeRingGap=" + this.f + ", ogApdLargeRingGap=" + this.g + ", ogApdSmallRingGap=" + this.h + ")";
    }
}
