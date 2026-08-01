package u0;

import java.util.ArrayList;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4179c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4180e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4181f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4182g;
    public final int h;

    public C0367f(ArrayList arrayList, int i, int i2, int i3, float f2, int i4, int i5, int i6) {
        this.f4177a = arrayList;
        this.f4178b = i;
        this.f4179c = i2;
        this.d = i3;
        this.f4180e = f2;
        this.f4181f = i4;
        this.f4182g = i5;
        this.h = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0367f)) {
            return false;
        }
        C0367f c0367f = (C0367f) obj;
        return this.f4177a.equals(c0367f.f4177a) && this.f4178b == c0367f.f4178b && this.f4179c == c0367f.f4179c && this.d == c0367f.d && Float.compare(this.f4180e, c0367f.f4180e) == 0 && this.f4181f == c0367f.f4181f && this.f4182g == c0367f.f4182g && this.h == c0367f.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + ((Integer.hashCode(this.f4182g) + ((Integer.hashCode(this.f4181f) + ((Float.hashCode(this.f4180e) + ((Integer.hashCode(this.d) + ((Integer.hashCode(this.f4179c) + ((Integer.hashCode(this.f4178b) + (this.f4177a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GameSnapshot(habits=" + this.f4177a + ", currentStreak=" + this.f4178b + ", bestStreak=" + this.f4179c + ", graceRemaining=" + this.d + ", multiplier=" + this.f4180e + ", level=" + this.f4181f + ", completedToday=" + this.f4182g + ", totalToday=" + this.h + ")";
    }
}
