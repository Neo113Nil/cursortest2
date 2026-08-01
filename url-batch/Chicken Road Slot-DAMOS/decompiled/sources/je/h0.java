package je;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.v1;
import x3.t0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5170d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i3, int i10, ld.a aVar) {
        super(i3, aVar);
        this.f5170d = i10;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f5170d) {
            case 0:
                h0 h0Var = new h0(2, 0, aVar);
                h0Var.f5171e = obj;
                return h0Var;
            case 1:
                h0 h0Var2 = new h0(2, 1, aVar);
                h0Var2.f5171e = obj;
                return h0Var2;
            default:
                h0 h0Var3 = new h0(2, 2, aVar);
                h0Var3.f5171e = obj;
                return h0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5170d) {
            case 0:
                return ((h0) create((d0) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 1:
                return ((h0) create((v1) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                return ((h0) create((t0) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
        }
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5170d) {
            case 0:
                d0 d0Var = (d0) this.f5171e;
                md.a aVar = md.a.f6622d;
                cf.c.M(obj);
                return Boolean.valueOf(d0Var != d0.f5150d);
            case 1:
                md.a aVar2 = md.a.f6622d;
                cf.c.M(obj);
                return Boolean.valueOf(((v1) this.f5171e) == v1.f6824d);
            default:
                md.a aVar3 = md.a.f6622d;
                cf.c.M(obj);
                return Boolean.valueOf(!(((t0) this.f5171e) instanceof x3.l0));
        }
    }
}
