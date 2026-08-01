package n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f6793a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6794b;

    /* renamed from: c, reason: collision with root package name */
    public final e f6795c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6796d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6797e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6798f = true;

    public q1(p1 p1Var, Object obj, boolean z10, e eVar, boolean z11) {
        this.f6793a = p1Var;
        this.f6794b = z10;
        this.f6795c = eVar;
        this.f6796d = z11;
        this.f6797e = obj;
    }

    public final Object a() {
        if (this.f6794b) {
            return null;
        }
        Object obj = this.f6797e;
        if (obj != null) {
            return obj;
        }
        m.b("Unexpected form of a provided value");
        throw new hd.d();
    }
}
