package n0;

import H2.AbstractC0080b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f6240a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6241b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6242c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6243d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6244e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6245f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6246g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6247h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6248i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6249j;

    /* renamed from: k, reason: collision with root package name */
    public final long f6250k;

    public p(long j3, long j4, long j5, long j6, boolean z3, float f3, int i3, boolean z4, ArrayList arrayList, long j7, long j8) {
        this.f6240a = j3;
        this.f6241b = j4;
        this.f6242c = j5;
        this.f6243d = j6;
        this.f6244e = z3;
        this.f6245f = f3;
        this.f6246g = i3;
        this.f6247h = z4;
        this.f6248i = arrayList;
        this.f6249j = j7;
        this.f6250k = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l.a(this.f6240a, pVar.f6240a) && this.f6241b == pVar.f6241b && a0.c.b(this.f6242c, pVar.f6242c) && a0.c.b(this.f6243d, pVar.f6243d) && this.f6244e == pVar.f6244e && Float.compare(this.f6245f, pVar.f6245f) == 0 && s.d(this.f6246g, pVar.f6246g) && this.f6247h == pVar.f6247h && this.f6248i.equals(pVar.f6248i) && a0.c.b(this.f6249j, pVar.f6249j) && a0.c.b(this.f6250k, pVar.f6250k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6250k) + AbstractC0080b.d((this.f6248i.hashCode() + AbstractC0080b.f(AbstractC0080b.b(this.f6246g, AbstractC0080b.a(this.f6245f, AbstractC0080b.f(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(Long.hashCode(this.f6240a) * 31, 31, this.f6241b), 31, this.f6242c), 31, this.f6243d), 31, this.f6244e), 31), 31), 31, this.f6247h)) * 31, 31, this.f6249j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) l.b(this.f6240a));
        sb.append(", uptime=");
        sb.append(this.f6241b);
        sb.append(", positionOnScreen=");
        sb.append((Object) a0.c.j(this.f6242c));
        sb.append(", position=");
        sb.append((Object) a0.c.j(this.f6243d));
        sb.append(", down=");
        sb.append(this.f6244e);
        sb.append(", pressure=");
        sb.append(this.f6245f);
        sb.append(", type=");
        int i3 = this.f6246g;
        sb.append((Object) (i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f6247h);
        sb.append(", historical=");
        sb.append(this.f6248i);
        sb.append(", scrollDelta=");
        sb.append((Object) a0.c.j(this.f6249j));
        sb.append(", originalEventPosition=");
        sb.append((Object) a0.c.j(this.f6250k));
        sb.append(')');
        return sb.toString();
    }
}
