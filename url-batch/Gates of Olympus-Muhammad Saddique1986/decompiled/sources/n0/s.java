package n0;

import a0.C0238c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f7308a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7309b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7310c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7311d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7312e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7313f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7314g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7315h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7316i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7317j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f7318k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7319l;

    /* renamed from: m, reason: collision with root package name */
    public C0705c f7320m;

    public s(long j3, long j4, long j5, boolean z3, float f3, long j6, long j7, boolean z4, boolean z5, int i3, long j8) {
        this.f7308a = j3;
        this.f7309b = j4;
        this.f7310c = j5;
        this.f7311d = z3;
        this.f7312e = f3;
        this.f7313f = j6;
        this.f7314g = j7;
        this.f7315h = z4;
        this.f7316i = i3;
        this.f7317j = j8;
        this.f7319l = 0L;
        C0705c c0705c = new C0705c();
        c0705c.f7271a = z5;
        c0705c.f7272b = z5;
        this.f7320m = c0705c;
    }

    public final void a() {
        C0705c c0705c = this.f7320m;
        c0705c.f7272b = true;
        c0705c.f7271a = true;
    }

    public final boolean b() {
        C0705c c0705c = this.f7320m;
        return c0705c.f7272b || c0705c.f7271a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) r.b(this.f7308a));
        sb.append(", uptimeMillis=");
        sb.append(this.f7309b);
        sb.append(", position=");
        sb.append((Object) C0238c.j(this.f7310c));
        sb.append(", pressed=");
        sb.append(this.f7311d);
        sb.append(", pressure=");
        sb.append(this.f7312e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f7313f);
        sb.append(", previousPosition=");
        sb.append((Object) C0238c.j(this.f7314g));
        sb.append(", previousPressed=");
        sb.append(this.f7315h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i3 = this.f7316i;
        sb.append((Object) (i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f7318k;
        if (obj == null) {
            obj = S1.u.f4320d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C0238c.j(this.f7317j));
        sb.append(')');
        return sb.toString();
    }

    public s(long j3, long j4, long j5, boolean z3, float f3, long j6, long j7, boolean z4, int i3, ArrayList arrayList, long j8, long j9) {
        this(j3, j4, j5, z3, f3, j6, j7, z4, false, i3, j8);
        this.f7318k = arrayList;
        this.f7319l = j9;
    }
}
