package n0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f6223a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6224b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6225c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6226d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6227e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6228f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6229g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6230h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6231i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6232j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f6233k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6234l;

    /* renamed from: m, reason: collision with root package name */
    public C0671a f6235m;

    public m(long j3, long j4, long j5, boolean z3, float f3, long j6, long j7, boolean z4, boolean z5, int i3, long j8) {
        this.f6223a = j3;
        this.f6224b = j4;
        this.f6225c = j5;
        this.f6226d = z3;
        this.f6227e = f3;
        this.f6228f = j6;
        this.f6229g = j7;
        this.f6230h = z4;
        this.f6231i = i3;
        this.f6232j = j8;
        this.f6234l = 0L;
        C0671a c0671a = new C0671a();
        c0671a.f6193a = z5;
        c0671a.f6194b = z5;
        this.f6235m = c0671a;
    }

    public final void a() {
        C0671a c0671a = this.f6235m;
        c0671a.f6194b = true;
        c0671a.f6193a = true;
    }

    public final boolean b() {
        C0671a c0671a = this.f6235m;
        return c0671a.f6194b || c0671a.f6193a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) l.b(this.f6223a));
        sb.append(", uptimeMillis=");
        sb.append(this.f6224b);
        sb.append(", position=");
        sb.append((Object) a0.c.j(this.f6225c));
        sb.append(", pressed=");
        sb.append(this.f6226d);
        sb.append(", pressure=");
        sb.append(this.f6227e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f6228f);
        sb.append(", previousPosition=");
        sb.append((Object) a0.c.j(this.f6229g));
        sb.append(", previousPressed=");
        sb.append(this.f6230h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i3 = this.f6231i;
        sb.append((Object) (i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f6233k;
        if (obj == null) {
            obj = M1.u.f2803d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) a0.c.j(this.f6232j));
        sb.append(')');
        return sb.toString();
    }

    public m(long j3, long j4, long j5, boolean z3, float f3, long j6, long j7, boolean z4, int i3, ArrayList arrayList, long j8, long j9) {
        this(j3, j4, j5, z3, f3, j6, j7, z4, false, i3, j8);
        this.f6233k = arrayList;
        this.f6234l = j9;
    }
}
