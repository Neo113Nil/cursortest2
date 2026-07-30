package b1;

import a0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: a, reason: collision with root package name */
    public final float f1239a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1240b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1241c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1242d;

    public i(float f9, float f10, int i7, int i8, int i9) {
        f10 = (i9 & 2) != 0 ? 4.0f : f10;
        i7 = (i9 & 4) != 0 ? 0 : i7;
        i8 = (i9 & 8) != 0 ? 0 : i8;
        this.f1239a = f9;
        this.f1240b = f10;
        this.f1241c = i7;
        this.f1242d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1239a == iVar.f1239a && this.f1240b == iVar.f1240b && this.f1241c == iVar.f1241c && this.f1242d == iVar.f1242d;
    }

    public final int hashCode() {
        return l.h.c(this.f1242d, l.h.c(this.f1241c, m.a(this.f1240b, Float.hashCode(this.f1239a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f1239a);
        sb.append(", miter=");
        sb.append(this.f1240b);
        sb.append(", cap=");
        String str = "Unknown";
        int i7 = this.f1241c;
        sb.append((Object) (i7 == 0 ? "Butt" : i7 == 1 ? "Round" : i7 == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i8 = this.f1242d;
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
