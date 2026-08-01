package x1;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f10294a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10295b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10296c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10297d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10298e;

    /* renamed from: f, reason: collision with root package name */
    public final float f10299f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10300h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f10301i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final float f10302k;

    /* renamed from: l, reason: collision with root package name */
    public final long f10303l;

    /* renamed from: m, reason: collision with root package name */
    public final long f10304m;

    public n(long j, long j3, long j10, long j11, boolean z10, float f3, int i3, boolean z11, ArrayList arrayList, long j12, float f10, long j13, long j14) {
        this.f10294a = j;
        this.f10295b = j3;
        this.f10296c = j10;
        this.f10297d = j11;
        this.f10298e = z10;
        this.f10299f = f3;
        this.g = i3;
        this.f10300h = z11;
        this.f10301i = arrayList;
        this.j = j12;
        this.f10302k = f10;
        this.f10303l = j13;
        this.f10304m = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return cf.c.s(this.f10294a, nVar.f10294a) && this.f10295b == nVar.f10295b && j1.b.a(this.f10296c, nVar.f10296c) && j1.b.a(this.f10297d, nVar.f10297d) && this.f10298e == nVar.f10298e && Float.compare(this.f10299f, nVar.f10299f) == 0 && this.g == nVar.g && this.f10300h == nVar.f10300h && this.f10301i.equals(nVar.f10301i) && j1.b.a(this.j, nVar.j) && Float.compare(this.f10302k, nVar.f10302k) == 0 && j1.b.a(this.f10303l, nVar.f10303l) && j1.b.a(this.f10304m, nVar.f10304m);
    }

    public final int hashCode() {
        return Long.hashCode(this.f10304m) + n0.l.c(n0.l.b(this.f10302k, n0.l.c((this.f10301i.hashCode() + n0.l.d(v4.a.x(this.g, n0.l.b(this.f10299f, n0.l.d(n0.l.c(n0.l.c(n0.l.c(Long.hashCode(this.f10294a) * 31, 31, this.f10295b), 31, this.f10296c), 31, this.f10297d), 31, this.f10298e), 31), 31), 31, this.f10300h)) * 31, 31, this.j), 31), 31, this.f10303l);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) cf.c.N(this.f10294a));
        sb2.append(", uptime=");
        sb2.append(this.f10295b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) j1.b.e(this.f10296c));
        sb2.append(", position=");
        sb2.append((Object) j1.b.e(this.f10297d));
        sb2.append(", down=");
        sb2.append(this.f10298e);
        sb2.append(", pressure=");
        sb2.append(this.f10299f);
        sb2.append(", type=");
        int i3 = this.g;
        sb2.append((Object) (i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", activeHover=");
        sb2.append(this.f10300h);
        sb2.append(", historical=");
        sb2.append(this.f10301i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) j1.b.e(this.j));
        sb2.append(", scaleGestureFactor=");
        sb2.append(this.f10302k);
        sb2.append(", panGestureOffset=");
        sb2.append((Object) j1.b.e(this.f10303l));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) j1.b.e(this.f10304m));
        sb2.append(')');
        return sb2.toString();
    }
}
