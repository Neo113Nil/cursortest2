package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final m4.f f3129k = new m4.f();

    /* renamed from: l, reason: collision with root package name */
    public static int f3130l;

    /* renamed from: a, reason: collision with root package name */
    public final String f3131a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3132b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3133c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3134d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3135e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f3136f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3137g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3138h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3139i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3140j;

    public f(String str, float f9, float f10, float f11, float f12, h0 h0Var, long j8, int i7, boolean z8) {
        int i8;
        synchronized (f3129k) {
            i8 = f3130l;
            f3130l = i8 + 1;
        }
        this.f3131a = str;
        this.f3132b = f9;
        this.f3133c = f10;
        this.f3134d = f11;
        this.f3135e = f12;
        this.f3136f = h0Var;
        this.f3137g = j8;
        this.f3138h = i7;
        this.f3139i = z8;
        this.f3140j = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return r6.k.a(this.f3131a, fVar.f3131a) && m2.e.a(this.f3132b, fVar.f3132b) && m2.e.a(this.f3133c, fVar.f3133c) && this.f3134d == fVar.f3134d && this.f3135e == fVar.f3135e && this.f3136f.equals(fVar.f3136f) && z0.u.c(this.f3137g, fVar.f3137g) && this.f3138h == fVar.f3138h && this.f3139i == fVar.f3139i;
    }

    public final int hashCode() {
        int hashCode = (this.f3136f.hashCode() + a0.m.a(this.f3135e, a0.m.a(this.f3134d, a0.m.a(this.f3133c, a0.m.a(this.f3132b, this.f3131a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i7 = z0.u.f10058h;
        return Boolean.hashCode(this.f3139i) + l.h.c(this.f3138h, a0.m.d(hashCode, 31, this.f3137g), 31);
    }
}
