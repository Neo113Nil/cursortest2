package m1;

import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    public final float f6412b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6413c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6414d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6415e;

    public g(float f3, float f10, int i3, int i10, int i11) {
        f10 = (i11 & 2) != 0 ? 4.0f : f10;
        i3 = (i11 & 4) != 0 ? 0 : i3;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        this.f6412b = f3;
        this.f6413c = f10;
        this.f6414d = i3;
        this.f6415e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6412b == gVar.f6412b && this.f6413c == gVar.f6413c && this.f6414d == gVar.f6414d && this.f6415e == gVar.f6415e;
    }

    public final int hashCode() {
        return v4.a.x(this.f6415e, v4.a.x(this.f6414d, l.b(this.f6413c, Float.hashCode(this.f6412b) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f6412b);
        sb2.append(", miter=");
        sb2.append(this.f6413c);
        sb2.append(", cap=");
        String str = "Unknown";
        int i3 = this.f6414d;
        sb2.append((Object) (i3 == 0 ? "Butt" : i3 == 1 ? "Round" : i3 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i10 = this.f6415e;
        if (i10 == 0) {
            str = "Miter";
        } else if (i10 == 1) {
            str = "Round";
        } else if (i10 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
