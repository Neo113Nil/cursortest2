package ke;

import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5522d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f5523e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5524i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f5525r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ je.f f5526s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, je.f fVar, Object obj, ld.a aVar) {
        super(2, aVar);
        this.f5525r = lVar;
        this.f5526s = fVar;
        this.f5524i = obj;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f5522d) {
            case 0:
                return new i(this.f5525r, this.f5526s, this.f5524i, aVar);
            default:
                i iVar = new i(this.f5525r, this.f5526s, aVar);
                iVar.f5524i = obj;
                return iVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f5522d) {
        }
        return ((i) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [nd.i, vd.n] */
    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5522d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f5523e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    ?? r9 = this.f5525r.f5536s;
                    Object obj2 = this.f5524i;
                    this.f5523e = 1;
                    if (r9.a(this.f5526s, obj2, this) == aVar) {
                    }
                } else if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
            default:
                x xVar = (x) this.f5524i;
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f5523e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    b0 b0Var = new b0();
                    l lVar = this.f5525r;
                    je.e eVar = lVar.f5521r;
                    k kVar = new k(0, b0Var, xVar, lVar, this.f5526s);
                    this.f5524i = null;
                    this.f5523e = 1;
                    if (eVar.c(kVar, this) == aVar2) {
                    }
                } else if (i10 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
        }
        return Unit.f5554a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, je.f fVar, ld.a aVar) {
        super(2, aVar);
        this.f5525r = lVar;
        this.f5526s = fVar;
    }
}
