package q1;

import d6.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f5994a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5995b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5996c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5997d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5998e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5999f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6000g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6001h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6002j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f6003k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6004l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6005m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6006n;

    /* renamed from: o, reason: collision with root package name */
    public k f6007o;

    public k(long j7, long j8, long j9, boolean z3, float f6, long j10, long j11, boolean z7, boolean z8, int i, long j12) {
        this.f5994a = j7;
        this.f5995b = j8;
        this.f5996c = j9;
        this.f5997d = z3;
        this.f5998e = f6;
        this.f5999f = j10;
        this.f6000g = j11;
        this.f6001h = z7;
        this.i = i;
        this.f6002j = j12;
        this.f6004l = 0L;
        this.f6005m = z8;
        this.f6006n = z8;
    }

    public final void a() {
        k kVar = this.f6007o;
        if (kVar == null) {
            this.f6005m = true;
            this.f6006n = true;
        } else if (kVar != null) {
            kVar.a();
        }
    }

    public final boolean b() {
        k kVar = this.f6007o;
        return kVar != null ? kVar.b() : this.f6005m || this.f6006n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) ("PointerId(value=" + this.f5994a + ')'));
        sb.append(", uptimeMillis=");
        sb.append(this.f5995b);
        sb.append(", position=");
        sb.append((Object) e1.b.g(this.f5996c));
        sb.append(", pressed=");
        sb.append(this.f5997d);
        sb.append(", pressure=");
        sb.append(this.f5998e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f5999f);
        sb.append(", previousPosition=");
        sb.append((Object) e1.b.g(this.f6000g));
        sb.append(", previousPressed=");
        sb.append(this.f6001h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i = this.i;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f6003k;
        if (obj == null) {
            obj = u.f2326d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) e1.b.g(this.f6002j));
        sb.append(')');
        return sb.toString();
    }

    public k(long j7, long j8, long j9, boolean z3, float f6, long j10, long j11, boolean z7, int i, ArrayList arrayList, long j12, long j13) {
        this(j7, j8, j9, z3, f6, j10, j11, z7, false, i, j12);
        this.f6003k = arrayList;
        this.f6004l = j13;
    }
}
