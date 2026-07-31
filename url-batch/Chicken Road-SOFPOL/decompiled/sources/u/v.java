package u;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7102h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q1.o f7103j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0 f7104k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b6.a0 f7105l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b6.c0 f7106m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f7107n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f7108o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b6.c f7109p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q1.o oVar, x0 x0Var, b6.a0 a0Var, b6.c0 c0Var, u uVar, u uVar2, b6.c cVar, g6.c cVar2) {
        super(2, cVar2);
        this.f7103j = oVar;
        this.f7104k = x0Var;
        this.f7105l = a0Var;
        this.f7106m = c0Var;
        this.f7107n = uVar;
        this.f7108o = uVar2;
        this.f7109p = cVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((v) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        v vVar = new v(this.f7103j, this.f7104k, this.f7105l, this.f7106m, this.f7107n, this.f7108o, this.f7109p, cVar);
        vVar.i = obj;
        return vVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        a7.u uVar;
        Object i;
        h6.a aVar;
        int i8 = this.f7102h;
        c6.m mVar = c6.m.f1757a;
        x0 x0Var = this.f7104k;
        if (i8 == 0) {
            s6.a.K(obj);
            a7.u uVar2 = (a7.u) this.i;
            try {
                q1.o oVar = this.f7103j;
                j0 j0Var = x0Var.f7120t;
                b6.a0 a0Var = this.f7105l;
                b6.c0 c0Var = this.f7106m;
                u uVar3 = this.f7107n;
                u uVar4 = this.f7108o;
                b6.c cVar = this.f7109p;
                this.i = uVar2;
                this.f7102h = 1;
                float f6 = t.f7095a;
                i = r2.r.i(oVar, new q(uVar4, new q6.r(), j0Var, a0Var, cVar, uVar3, c0Var, null), this);
                aVar = h6.a.f3204d;
                if (i != aVar) {
                    i = mVar;
                }
            } catch (CancellationException e8) {
                e = e8;
                uVar = uVar2;
            }
            return i == aVar ? aVar : mVar;
        }
        if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uVar = (a7.u) this.i;
        try {
            s6.a.K(obj);
            return mVar;
        } catch (CancellationException e9) {
            e = e9;
        }
        CancellationException cancellationException = e;
        c7.c cVar2 = x0Var.f7124x;
        if (cVar2 != null) {
            cVar2.t(k.f7033a);
        }
        if (!a7.x.l(uVar)) {
            throw cancellationException;
        }
    }
}
