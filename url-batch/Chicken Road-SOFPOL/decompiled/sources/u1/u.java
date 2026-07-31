package u1;

import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f7277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6.c f7278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f7279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f7280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p6.c f7281g;

    public u(int i, int i8, Map map, p6.c cVar, v vVar, a0 a0Var, p6.c cVar2) {
        this.f7275a = i;
        this.f7276b = i8;
        this.f7277c = map;
        this.f7278d = cVar;
        this.f7279e = vVar;
        this.f7280f = a0Var;
        this.f7281g = cVar2;
    }

    @Override // u1.f0
    public final Map a() {
        return this.f7277c;
    }

    @Override // u1.f0
    public final void b() {
        w1.q qVar;
        w1.f0 f0Var = this.f7280f.f7169d;
        boolean p7 = this.f7279e.p();
        p6.c cVar = this.f7281g;
        if (!p7 || (qVar = f0Var.F.f7597c.R) == null) {
            cVar.i(f0Var.F.f7597c.f7731o);
        } else {
            cVar.i(qVar.f7731o);
        }
    }

    @Override // u1.f0
    public final int c() {
        return this.f7276b;
    }

    @Override // u1.f0
    public final p6.c d() {
        return this.f7278d;
    }

    @Override // u1.f0
    public final int e() {
        return this.f7275a;
    }
}
