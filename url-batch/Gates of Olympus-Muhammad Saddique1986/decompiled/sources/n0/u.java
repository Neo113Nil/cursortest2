package n0;

import a0.C0238c;
import java.util.ArrayList;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f7324a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7325b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7326c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7327d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7328e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7329f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7330g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7331h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7332i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7333j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7334k;

    public u(long j3, long j4, long j5, long j6, boolean z3, float f3, int i3, boolean z4, ArrayList arrayList, long j7, long j8) {
        this.f7324a = j3;
        this.f7325b = j4;
        this.f7326c = j5;
        this.f7327d = j6;
        this.f7328e = z3;
        this.f7329f = f3;
        this.f7330g = i3;
        this.f7331h = z4;
        this.f7332i = arrayList;
        this.f7333j = j7;
        this.f7334k = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return r.a(this.f7324a, uVar.f7324a) && this.f7325b == uVar.f7325b && C0238c.b(this.f7326c, uVar.f7326c) && C0238c.b(this.f7327d, uVar.f7327d) && this.f7328e == uVar.f7328e && Float.compare(this.f7329f, uVar.f7329f) == 0 && q.e(this.f7330g, uVar.f7330g) && this.f7331h == uVar.f7331h && this.f7332i.equals(uVar.f7332i) && C0238c.b(this.f7333j, uVar.f7333j) && C0238c.b(this.f7334k, uVar.f7334k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f7334k) + A.k.c((this.f7332i.hashCode() + A.k.e(AbstractC0625j.a(this.f7330g, A.k.a(this.f7329f, A.k.e(A.k.c(A.k.c(A.k.c(Long.hashCode(this.f7324a) * 31, 31, this.f7325b), 31, this.f7326c), 31, this.f7327d), 31, this.f7328e), 31), 31), 31, this.f7331h)) * 31, 31, this.f7333j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) r.b(this.f7324a));
        sb.append(", uptime=");
        sb.append(this.f7325b);
        sb.append(", positionOnScreen=");
        sb.append((Object) C0238c.j(this.f7326c));
        sb.append(", position=");
        sb.append((Object) C0238c.j(this.f7327d));
        sb.append(", down=");
        sb.append(this.f7328e);
        sb.append(", pressure=");
        sb.append(this.f7329f);
        sb.append(", type=");
        int i3 = this.f7330g;
        sb.append((Object) (i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f7331h);
        sb.append(", historical=");
        sb.append(this.f7332i);
        sb.append(", scrollDelta=");
        sb.append((Object) C0238c.j(this.f7333j));
        sb.append(", originalEventPosition=");
        sb.append((Object) C0238c.j(this.f7334k));
        sb.append(')');
        return sb.toString();
    }
}
