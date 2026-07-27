package l0;

import A.AbstractC0017m;
import java.util.ArrayList;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f7939a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7940b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7941c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7942d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7943e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7944f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7945g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7946h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7947i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7948j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7949k;

    public u(long j4, long j5, long j6, long j7, boolean z4, float f4, int i2, boolean z5, ArrayList arrayList, long j8, long j9) {
        this.f7939a = j4;
        this.f7940b = j5;
        this.f7941c = j6;
        this.f7942d = j7;
        this.f7943e = z4;
        this.f7944f = f4;
        this.f7945g = i2;
        this.f7946h = z5;
        this.f7947i = arrayList;
        this.f7948j = j8;
        this.f7949k = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return r.a(this.f7939a, uVar.f7939a) && this.f7940b == uVar.f7940b && Y.c.b(this.f7941c, uVar.f7941c) && Y.c.b(this.f7942d, uVar.f7942d) && this.f7943e == uVar.f7943e && Float.compare(this.f7944f, uVar.f7944f) == 0 && AbstractC0819q.e(this.f7945g, uVar.f7945g) && this.f7946h == uVar.f7946h && this.f7947i.equals(uVar.f7947i) && Y.c.b(this.f7948j, uVar.f7948j) && Y.c.b(this.f7949k, uVar.f7949k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f7949k) + AbstractC0017m.c((this.f7947i.hashCode() + AbstractC0017m.d(AbstractC0784j.c(this.f7945g, AbstractC0017m.a(this.f7944f, AbstractC0017m.d(AbstractC0017m.c(AbstractC0017m.c(AbstractC0017m.c(Long.hashCode(this.f7939a) * 31, 31, this.f7940b), 31, this.f7941c), 31, this.f7942d), 31, this.f7943e), 31), 31), 31, this.f7946h)) * 31, 31, this.f7948j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) r.b(this.f7939a));
        sb.append(", uptime=");
        sb.append(this.f7940b);
        sb.append(", positionOnScreen=");
        sb.append((Object) Y.c.j(this.f7941c));
        sb.append(", position=");
        sb.append((Object) Y.c.j(this.f7942d));
        sb.append(", down=");
        sb.append(this.f7943e);
        sb.append(", pressure=");
        sb.append(this.f7944f);
        sb.append(", type=");
        int i2 = this.f7945g;
        sb.append((Object) (i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f7946h);
        sb.append(", historical=");
        sb.append(this.f7947i);
        sb.append(", scrollDelta=");
        sb.append((Object) Y.c.j(this.f7948j));
        sb.append(", originalEventPosition=");
        sb.append((Object) Y.c.j(this.f7949k));
        sb.append(')');
        return sb.toString();
    }
}
