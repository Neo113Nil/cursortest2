package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public y f5118a;

    /* renamed from: b, reason: collision with root package name */
    public int f5119b;

    /* renamed from: c, reason: collision with root package name */
    public a f5120c;

    /* renamed from: d, reason: collision with root package name */
    public p6.e f5121d;

    /* renamed from: e, reason: collision with root package name */
    public int f5122e;

    /* renamed from: f, reason: collision with root package name */
    public o.d0 f5123f;

    /* renamed from: g, reason: collision with root package name */
    public o.j0 f5124g;

    public t1(y yVar) {
        this.f5118a = yVar;
    }

    public static boolean a(e0 e0Var, o.j0 j0Var) {
        q6.i.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        n2 n2Var = e0Var.f4904f;
        if (n2Var == null) {
            n2Var = v0.i;
        }
        return !n2Var.a(e0Var.h().f4893f, j0Var.g(e0Var));
    }

    public final boolean b() {
        if (this.f5118a != null) {
            a aVar = this.f5120c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final p0 c(Object obj) {
        p0 s5;
        y yVar = this.f5118a;
        return (yVar == null || (s5 = yVar.s(this, obj)) == null) ? p0.f5036d : s5;
    }

    public final void d() {
        y yVar = this.f5118a;
        if (yVar != null) {
            yVar.f5177r = true;
            yVar.f5182w.r();
        }
        this.f5118a = null;
        this.f5123f = null;
        this.f5124g = null;
        this.f5121d = null;
    }

    public final void e(boolean z3) {
        int i = this.f5119b;
        this.f5119b = z3 ? i | 32 : i & (-33);
    }
}
