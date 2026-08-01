package q1;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static int f7846k;

    /* renamed from: l, reason: collision with root package name */
    public static final k5.c f7847l = new k5.c(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f7848a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7849b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7850c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7851d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7852e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f7853f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7854h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7855i;
    public final int j;

    public f(String str, float f3, float f10, float f11, float f12, f0 f0Var, long j, int i3, boolean z10) {
        int i10;
        synchronized (f7847l) {
            i10 = f7846k;
            f7846k = i10 + 1;
        }
        this.f7848a = str;
        this.f7849b = f3;
        this.f7850c = f10;
        this.f7851d = f11;
        this.f7852e = f12;
        this.f7853f = f0Var;
        this.g = j;
        this.f7854h = i3;
        this.f7855i = z10;
        this.j = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.f7848a, fVar.f7848a) && x2.f.b(this.f7849b, fVar.f7849b) && x2.f.b(this.f7850c, fVar.f7850c) && this.f7851d == fVar.f7851d && this.f7852e == fVar.f7852e && this.f7853f.equals(fVar.f7853f) && k1.p.c(this.g, fVar.g) && this.f7854h == fVar.f7854h && this.f7855i == fVar.f7855i;
    }

    public final int hashCode() {
        int hashCode = (this.f7853f.hashCode() + n0.l.b(this.f7852e, n0.l.b(this.f7851d, n0.l.b(this.f7850c, n0.l.b(this.f7849b, this.f7848a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i3 = k1.p.f5341h;
        hd.z zVar = hd.a0.f4495e;
        return Boolean.hashCode(this.f7855i) + v4.a.x(this.f7854h, n0.l.c(hashCode, 31, this.g), 31);
    }
}
