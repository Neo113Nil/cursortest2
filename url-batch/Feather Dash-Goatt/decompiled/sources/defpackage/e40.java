package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e40 {
    public final ds a;
    public final f40 b;
    public final int c;
    public final int d;
    public final int e;
    public final List f;
    public final long g;
    public final long h;
    public final float i;
    public final int j;
    public final long k;
    public final long l;
    public final float m;

    public e40(ds dsVar, f40 f40Var, int i, int i2, int i3, List list, long j, long j2, float f, int i4, long j3, long j4, float f2) {
        f40Var.getClass();
        list.getClass();
        this.a = dsVar;
        this.b = f40Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = list;
        this.g = j;
        this.h = j2;
        this.i = f;
        this.j = i4;
        this.k = j3;
        this.l = j4;
        this.m = f2;
    }

    public static e40 a(e40 e40Var, f40 f40Var, int i, int i2, int i3, List list, long j, long j2, float f, int i4, long j3, long j4, float f2, int i5) {
        ds dsVar = e40Var.a;
        f40 f40Var2 = (i5 & 2) != 0 ? e40Var.b : f40Var;
        int i6 = (i5 & 4) != 0 ? e40Var.c : i;
        int i7 = (i5 & 8) != 0 ? e40Var.d : i2;
        int i8 = (i5 & 16) != 0 ? e40Var.e : i3;
        List list2 = (i5 & 32) != 0 ? e40Var.f : list;
        long j5 = (i5 & 64) != 0 ? e40Var.g : j;
        long j6 = (i5 & 128) != 0 ? e40Var.h : j2;
        float f3 = (i5 & 256) != 0 ? e40Var.i : f;
        int i9 = (i5 & 512) != 0 ? e40Var.j : i4;
        long j7 = (i5 & 1024) != 0 ? e40Var.k : j3;
        f40 f40Var3 = f40Var2;
        long j8 = (i5 & 2048) != 0 ? e40Var.l : j4;
        float f4 = (i5 & 4096) != 0 ? e40Var.m : f2;
        e40Var.getClass();
        e40Var.getClass();
        f40Var3.getClass();
        list2.getClass();
        return new e40(dsVar, f40Var3, i6, i7, i8, list2, j5, j6, f3, i9, j7, j8, f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return this.a == e40Var.a && this.b == e40Var.b && this.c == e40Var.c && this.d == e40Var.d && this.e == e40Var.e && Intrinsics.a(this.f, e40Var.f) && this.g == e40Var.g && this.h == e40Var.h && Float.compare(this.i, e40Var.i) == 0 && this.j == e40Var.j && this.k == e40Var.k && this.l == e40Var.l && Float.compare(this.m, e40Var.m) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + qy0.b(this.m, qy0.e(this.l, qy0.e(this.k, qy0.c(this.j, qy0.b(this.i, qy0.e(this.h, qy0.e(this.g, (this.f.hashCode() + qy0.c(this.e, qy0.c(this.d, qy0.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "GameSession(difficulty=" + this.a + ", status=" + this.b + ", completedSections=" + this.c + ", unbankedFeathers=" + this.d + ", continueCount=" + this.e + ", hazards=" + this.f + ", jumpRemainingMillis=" + this.g + ", jumpElapsedMillis=" + this.h + ", jumpStartLift=" + this.i + ", extraJumpsAvailable=" + this.j + ", spawnCountdownMillis=" + this.k + ", nextHazardId=" + this.l + ", elapsedSeconds=" + this.m + ", meaningfullyStarted=true)";
    }
}
