package q1;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f6011a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6012b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6013c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6014d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6015e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6016f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6017g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6018h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6019j;

    /* renamed from: k, reason: collision with root package name */
    public final long f6020k;

    public m(long j7, long j8, long j9, long j10, boolean z3, float f6, int i, boolean z7, ArrayList arrayList, long j11, long j12) {
        this.f6011a = j7;
        this.f6012b = j8;
        this.f6013c = j9;
        this.f6014d = j10;
        this.f6015e = z3;
        this.f6016f = f6;
        this.f6017g = i;
        this.f6018h = z7;
        this.i = arrayList;
        this.f6019j = j11;
        this.f6020k = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return m.a.s(this.f6011a, mVar.f6011a) && this.f6012b == mVar.f6012b && e1.b.b(this.f6013c, mVar.f6013c) && e1.b.b(this.f6014d, mVar.f6014d) && this.f6015e == mVar.f6015e && Float.compare(this.f6016f, mVar.f6016f) == 0 && this.f6017g == mVar.f6017g && this.f6018h == mVar.f6018h && this.i.equals(mVar.i) && e1.b.b(this.f6019j, mVar.f6019j) && e1.b.b(this.f6020k, mVar.f6020k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6020k) + a0.q.c((this.i.hashCode() + a0.q.d(a0.q.b(this.f6017g, a0.q.a(this.f6016f, a0.q.d(a0.q.c(a0.q.c(a0.q.c(Long.hashCode(this.f6011a) * 31, 31, this.f6012b), 31, this.f6013c), 31, this.f6014d), 31, this.f6015e), 31), 31), 31, this.f6018h)) * 31, 31, this.f6019j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.f6011a + ')'));
        sb.append(", uptime=");
        sb.append(this.f6012b);
        sb.append(", positionOnScreen=");
        sb.append((Object) e1.b.g(this.f6013c));
        sb.append(", position=");
        sb.append((Object) e1.b.g(this.f6014d));
        sb.append(", down=");
        sb.append(this.f6015e);
        sb.append(", pressure=");
        sb.append(this.f6016f);
        sb.append(", type=");
        int i = this.f6017g;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f6018h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) e1.b.g(this.f6019j));
        sb.append(", originalEventPosition=");
        sb.append((Object) e1.b.g(this.f6020k));
        sb.append(')');
        return sb.toString();
    }
}
