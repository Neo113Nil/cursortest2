package l1;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f5830a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5831b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5832c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5833d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5834e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5835f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5836g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5837h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5838i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5839j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f5840k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5841l;

    /* renamed from: m, reason: collision with root package name */
    public c f5842m;

    public v(long j8, long j9, long j10, boolean z8, float f9, long j11, long j12, boolean z9, boolean z10, int i7, long j13) {
        this.f5830a = j8;
        this.f5831b = j9;
        this.f5832c = j10;
        this.f5833d = z8;
        this.f5834e = f9;
        this.f5835f = j11;
        this.f5836g = j12;
        this.f5837h = z9;
        this.f5838i = i7;
        this.f5839j = j13;
        this.f5841l = 0L;
        c cVar = new c();
        cVar.f5778a = z10;
        cVar.f5779b = z10;
        this.f5842m = cVar;
    }

    public final void a() {
        c cVar = this.f5842m;
        cVar.f5779b = true;
        cVar.f5778a = true;
    }

    public final boolean b() {
        c cVar = this.f5842m;
        return cVar.f5779b || cVar.f5778a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) u.b(this.f5830a));
        sb.append(", uptimeMillis=");
        sb.append(this.f5831b);
        sb.append(", position=");
        sb.append((Object) y0.c.j(this.f5832c));
        sb.append(", pressed=");
        sb.append(this.f5833d);
        sb.append(", pressure=");
        sb.append(this.f5834e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f5835f);
        sb.append(", previousPosition=");
        sb.append((Object) y0.c.j(this.f5836g));
        sb.append(", previousPressed=");
        sb.append(this.f5837h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i7 = this.f5838i;
        sb.append((Object) (i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f5840k;
        if (obj == null) {
            obj = e6.u.f2826f;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) y0.c.j(this.f5839j));
        sb.append(')');
        return sb.toString();
    }

    public v(long j8, long j9, long j10, boolean z8, float f9, long j11, long j12, boolean z9, int i7, ArrayList arrayList, long j13, long j14) {
        this(j8, j9, j10, z8, f9, j11, j12, z9, false, i7, j13);
        this.f5840k = arrayList;
        this.f5841l = j14;
    }
}
