package l1;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final long f5848a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5849b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5850c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5851d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5852e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5853f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5854g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5855h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5856i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5857j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5858k;

    public y(long j8, long j9, long j10, long j11, boolean z8, float f9, int i7, boolean z9, ArrayList arrayList, long j12, long j13) {
        this.f5848a = j8;
        this.f5849b = j9;
        this.f5850c = j10;
        this.f5851d = j11;
        this.f5852e = z8;
        this.f5853f = f9;
        this.f5854g = i7;
        this.f5855h = z9;
        this.f5856i = arrayList;
        this.f5857j = j12;
        this.f5858k = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return u.a(this.f5848a, yVar.f5848a) && this.f5849b == yVar.f5849b && y0.c.b(this.f5850c, yVar.f5850c) && y0.c.b(this.f5851d, yVar.f5851d) && this.f5852e == yVar.f5852e && Float.compare(this.f5853f, yVar.f5853f) == 0 && this.f5854g == yVar.f5854g && this.f5855h == yVar.f5855h && this.f5856i.equals(yVar.f5856i) && y0.c.b(this.f5857j, yVar.f5857j) && y0.c.b(this.f5858k, yVar.f5858k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5858k) + a0.m.d((this.f5856i.hashCode() + a0.m.e(l.h.c(this.f5854g, a0.m.a(this.f5853f, a0.m.e(a0.m.d(a0.m.d(a0.m.d(Long.hashCode(this.f5848a) * 31, 31, this.f5849b), 31, this.f5850c), 31, this.f5851d), 31, this.f5852e), 31), 31), 31, this.f5855h)) * 31, 31, this.f5857j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) u.b(this.f5848a));
        sb.append(", uptime=");
        sb.append(this.f5849b);
        sb.append(", positionOnScreen=");
        sb.append((Object) y0.c.j(this.f5850c));
        sb.append(", position=");
        sb.append((Object) y0.c.j(this.f5851d));
        sb.append(", down=");
        sb.append(this.f5852e);
        sb.append(", pressure=");
        sb.append(this.f5853f);
        sb.append(", type=");
        int i7 = this.f5854g;
        sb.append((Object) (i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f5855h);
        sb.append(", historical=");
        sb.append(this.f5856i);
        sb.append(", scrollDelta=");
        sb.append((Object) y0.c.j(this.f5857j));
        sb.append(", originalEventPosition=");
        sb.append((Object) y0.c.j(this.f5858k));
        sb.append(')');
        return sb.toString();
    }
}
