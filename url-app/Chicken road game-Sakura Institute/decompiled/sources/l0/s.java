package l0;

import java.util.ArrayList;
import z2.C1405I;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f7923a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7924b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7925c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7926d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7927e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7928f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7929g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7930h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7931i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7932j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f7933k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7934l;

    /* renamed from: m, reason: collision with root package name */
    public C0805c f7935m;

    public s(long j4, long j5, long j6, boolean z4, float f4, long j7, long j8, boolean z5, boolean z6, int i2, long j9) {
        this.f7923a = j4;
        this.f7924b = j5;
        this.f7925c = j6;
        this.f7926d = z4;
        this.f7927e = f4;
        this.f7928f = j7;
        this.f7929g = j8;
        this.f7930h = z5;
        this.f7931i = i2;
        this.f7932j = j9;
        this.f7934l = 0L;
        C0805c c0805c = new C0805c();
        c0805c.f7886a = z6;
        c0805c.f7887b = z6;
        this.f7935m = c0805c;
    }

    public final void a() {
        C0805c c0805c = this.f7935m;
        c0805c.f7887b = true;
        c0805c.f7886a = true;
    }

    public final boolean b() {
        C0805c c0805c = this.f7935m;
        return c0805c.f7887b || c0805c.f7886a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) r.b(this.f7923a));
        sb.append(", uptimeMillis=");
        sb.append(this.f7924b);
        sb.append(", position=");
        sb.append((Object) Y.c.j(this.f7925c));
        sb.append(", pressed=");
        sb.append(this.f7926d);
        sb.append(", pressure=");
        sb.append(this.f7927e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f7928f);
        sb.append(", previousPosition=");
        sb.append((Object) Y.c.j(this.f7929g));
        sb.append(", previousPressed=");
        sb.append(this.f7930h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i2 = this.f7931i;
        sb.append((Object) (i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f7933k;
        if (obj == null) {
            obj = C1405I.f11931d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) Y.c.j(this.f7932j));
        sb.append(')');
        return sb.toString();
    }

    public s(long j4, long j5, long j6, boolean z4, float f4, long j7, long j8, boolean z5, int i2, ArrayList arrayList, long j9, long j10) {
        this(j4, j5, j6, z4, f4, j7, j8, z5, false, i2, j9);
        this.f7933k = arrayList;
        this.f7934l = j10;
    }
}
