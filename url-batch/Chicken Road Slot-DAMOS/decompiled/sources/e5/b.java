package e5;

import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z4.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f3878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f3879e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f3880i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f3881r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f3882s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, ld.a aVar, u uVar, boolean z10, boolean z11) {
        super(2, aVar);
        this.f3879e = uVar;
        this.f3880i = z10;
        this.f3881r = z11;
        this.f3882s = function1;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        return new b(this.f3882s, aVar, this.f3879e, this.f3880i, this.f3881r);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        md.a aVar = md.a.f6622d;
        int i3 = this.f3878d;
        if (i3 != 0) {
            if (i3 == 1) {
                cf.c.M(obj);
                return obj;
            }
            i0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cf.c.M(obj);
        Function1 function1 = this.f3882s;
        u uVar = this.f3879e;
        boolean z10 = this.f3881r;
        boolean z11 = this.f3880i;
        e eVar = new e(function1, null, uVar, z10, z11);
        this.f3878d = 1;
        Object v10 = uVar.v(z11, eVar, this);
        return v10 == aVar ? aVar : v10;
    }
}
