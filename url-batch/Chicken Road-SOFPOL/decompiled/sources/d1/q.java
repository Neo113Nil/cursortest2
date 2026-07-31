package d1;

import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f2104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f2105g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2106h;
    public final /* synthetic */ b1.f i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2107j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(n nVar, n nVar2, Object obj, int i, b1.f fVar, int i8) {
        super(1);
        this.f2103e = i8;
        this.f2104f = nVar;
        this.f2105g = nVar2;
        this.f2107j = obj;
        this.f2106h = i;
        this.i = fVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f2103e) {
            case 0:
                u1.e eVar = (u1.e) obj;
                n nVar = this.f2105g;
                if (this.f2104f != ((i) ((t) w1.f.v(nVar)).getFocusOwner()).f2073h) {
                    return Boolean.TRUE;
                }
                boolean A = d.A(nVar, (n) this.f2107j, this.f2106h, this.i);
                Boolean valueOf = Boolean.valueOf(A);
                if (A || !eVar.a()) {
                    return valueOf;
                }
                return null;
            default:
                u1.e eVar2 = (u1.e) obj;
                n nVar2 = this.f2105g;
                if (this.f2104f != ((i) ((t) w1.f.v(nVar2)).getFocusOwner()).f2073h) {
                    return Boolean.TRUE;
                }
                boolean z3 = d.z(this.f2106h, this.i, nVar2, (e1.c) this.f2107j);
                Boolean valueOf2 = Boolean.valueOf(z3);
                if (z3 || !eVar2.a()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
