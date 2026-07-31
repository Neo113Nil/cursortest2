package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: j, reason: collision with root package name */
    public static int f4758j;

    /* renamed from: k, reason: collision with root package name */
    public static final w5.f f4759k = new w5.f(27);

    /* renamed from: a, reason: collision with root package name */
    public final String f4760a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4761b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4762c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4763d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4764e;

    /* renamed from: f, reason: collision with root package name */
    public final x f4765f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4766g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4767h;
    public final int i;

    public e(String str, float f6, float f8, float f9, float f10, x xVar, long j7, int i) {
        int i8;
        synchronized (f4759k) {
            i8 = f4758j;
            f4758j = i8 + 1;
        }
        this.f4760a = str;
        this.f4761b = f6;
        this.f4762c = f8;
        this.f4763d = f9;
        this.f4764e = f10;
        this.f4765f = xVar;
        this.f4766g = j7;
        this.f4767h = i;
        this.i = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return q6.i.a(this.f4760a, eVar.f4760a) && r2.f.a(this.f4761b, eVar.f4761b) && r2.f.a(this.f4762c, eVar.f4762c) && this.f4763d == eVar.f4763d && this.f4764e == eVar.f4764e && this.f4765f.equals(eVar.f4765f) && f1.s.c(this.f4766g, eVar.f4766g) && this.f4767h == eVar.f4767h;
    }

    public final int hashCode() {
        int hashCode = (this.f4765f.hashCode() + a0.q.a(this.f4764e, a0.q.a(this.f4763d, a0.q.a(this.f4762c, a0.q.a(this.f4761b, this.f4760a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = f1.s.i;
        return Boolean.hashCode(false) + a0.q.b(this.f4767h, a0.q.c(hashCode, 31, this.f4766g), 31);
    }
}
