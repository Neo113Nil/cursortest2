package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jo {
    public final int a;
    public final Long b;
    public final int c;
    public final int d;

    public jo(int i, Long l, int i2, int i3) {
        this.a = i;
        this.b = l;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        return this.a == joVar.a && Intrinsics.a(this.b, joVar.b) && this.c == joVar.c && this.d == joVar.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Long l = this.b;
        return Integer.hashCode(this.d) + qy0.c(this.c, (hashCode + (l == null ? 0 : l.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "DailyRewardState(currentStreakDay=" + this.a + ", lastClaimTimestampMillis=" + this.b + ", totalDailyClaims=" + this.c + ", completedSevenDayStreaks=" + this.d + ")";
    }

    public /* synthetic */ jo() {
        this(1, null, 0, 0);
    }
}
