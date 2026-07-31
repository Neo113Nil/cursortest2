package d0;

import A.k;
import b0.M;
import f2.j;
import m.AbstractC0625j;

/* renamed from: d0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407h extends AbstractC0404e {

    /* renamed from: a, reason: collision with root package name */
    public final float f5654a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5655b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5656c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5657d;

    public C0407h(float f3, float f4, int i3, int i4, int i5) {
        f4 = (i5 & 2) != 0 ? 4.0f : f4;
        i3 = (i5 & 4) != 0 ? 0 : i3;
        i4 = (i5 & 8) != 0 ? 0 : i4;
        this.f5654a = f3;
        this.f5655b = f4;
        this.f5656c = i3;
        this.f5657d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0407h)) {
            return false;
        }
        C0407h c0407h = (C0407h) obj;
        return this.f5654a == c0407h.f5654a && this.f5655b == c0407h.f5655b && M.s(this.f5656c, c0407h.f5656c) && M.t(this.f5657d, c0407h.f5657d) && j.a(null, null);
    }

    public final int hashCode() {
        return AbstractC0625j.a(this.f5657d, AbstractC0625j.a(this.f5656c, k.a(this.f5655b, Float.hashCode(this.f5654a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f5654a);
        sb.append(", miter=");
        sb.append(this.f5655b);
        sb.append(", cap=");
        int i3 = this.f5656c;
        String str = "Unknown";
        sb.append((Object) (M.s(i3, 0) ? "Butt" : M.s(i3, 1) ? "Round" : M.s(i3, 2) ? "Square" : "Unknown"));
        sb.append(", join=");
        int i4 = this.f5657d;
        if (M.t(i4, 0)) {
            str = "Miter";
        } else if (M.t(i4, 1)) {
            str = "Round";
        } else if (M.t(i4, 2)) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
