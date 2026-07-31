package h1;

import a0.q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    public final float f3081b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3082c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3083d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3084e;

    public g(float f6, float f8, int i, int i8) {
        f8 = (i8 & 2) != 0 ? 4.0f : f8;
        i = (i8 & 8) != 0 ? 0 : i;
        this.f3081b = f6;
        this.f3082c = f8;
        this.f3083d = 0;
        this.f3084e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3081b == gVar.f3081b && this.f3082c == gVar.f3082c && this.f3083d == gVar.f3083d && this.f3084e == gVar.f3084e;
    }

    public final int hashCode() {
        return q.b(this.f3084e, q.b(this.f3083d, q.a(this.f3082c, Float.hashCode(this.f3081b) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f3081b);
        sb.append(", miter=");
        sb.append(this.f3082c);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.f3083d;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i8 = this.f3084e;
        if (i8 == 0) {
            str = "Miter";
        } else if (i8 == 1) {
            str = "Round";
        } else if (i8 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
