package b0;

import a7.u;
import a7.x;
import c6.m;
import i6.i;
import w1.d1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1040h;
    public final /* synthetic */ f i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f1041j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a2.b f1042k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f1043l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, d1 d1Var, a2.b bVar, a aVar, g6.c cVar) {
        super(2, cVar);
        this.i = fVar;
        this.f1041j = d1Var;
        this.f1042k = bVar;
        this.f1043l = aVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((e) l((g6.c) obj2, (u) obj)).p(m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        e eVar = new e(this.i, this.f1041j, this.f1042k, this.f1043l, cVar);
        eVar.f1040h = obj;
        return eVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        s6.a.K(obj);
        u uVar = (u) this.f1040h;
        a2.b bVar = this.f1042k;
        int i = 0;
        f fVar = this.i;
        g6.c cVar = null;
        x.n(uVar, null, new c(fVar, this.f1041j, bVar, cVar, i), 3);
        return x.n(uVar, null, new d(fVar, this.f1043l, cVar, i), 3);
    }
}
